/*
Copyright 2020 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.spring.extended.controller;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.google.gson.Gson;
import io.kubernetes.client.informer.SharedIndexInformer;
import io.kubernetes.client.informer.SharedInformerFactory;
import io.kubernetes.client.informer.cache.Lister;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1ConfigMapList;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import java.util.Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KubernetesInformerCreatorTest {

  @Rule public WireMockRule wireMockRule = new WireMockRule(8188);

  @SpringBootApplication
  static class App {

    @Bean
    public ApiClient testingApiClient() {
      ApiClient apiClient = new ClientBuilder().setBasePath("http://localhost:" + 8188).build();
      return apiClient;
    }

    @Bean
    public SharedIndexInformer<V1Pod> podInformer(
        ApiClient apiClient, SharedInformerFactory sharedInformerFactory) {
      GenericKubernetesApi<V1Pod, V1PodList> genericApi =
          new GenericKubernetesApi<>(V1Pod.class, V1PodList.class, "", "v1", "pods", apiClient);
      return sharedInformerFactory.sharedIndexInformerFor(genericApi, V1Pod.class, 0);
    }

    @Bean
    public SharedIndexInformer<V1ConfigMap> configMapInformer(
        ApiClient apiClient, SharedInformerFactory sharedInformerFactory) {
      GenericKubernetesApi<V1ConfigMap, V1ConfigMapList> genericApi =
          new GenericKubernetesApi<>(
              V1ConfigMap.class, V1ConfigMapList.class, "", "v1", "configmaps", apiClient);
      return sharedInformerFactory.sharedIndexInformerFor(
          genericApi, V1ConfigMap.class, 0, "default");
    }
  }

  @Autowired private SharedInformerFactory informerFactory;

  @Autowired private SharedIndexInformer<V1Pod> podInformer;

  @Autowired private SharedIndexInformer<V1ConfigMap> configMapInformer;

  @Test
  public void testInformerInjection() throws InterruptedException {
    assertNotNull(podInformer);
    assertNotNull(configMapInformer);

    V1Pod foo1 =
        new V1Pod().kind("Pod").metadata(new V1ObjectMeta().namespace("default").name("foo1"));
    V1ConfigMap bar1 =
        new V1ConfigMap()
            .kind("ConfigMap")
            .metadata(new V1ObjectMeta().namespace("default").name("bar1"));

    wireMockRule.stubFor(
        get(urlMatching("^/api/v1/pods.*"))
            .withQueryParam("watch", equalTo("false"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        new Gson()
                            .toJson(
                                new V1PodList()
                                    .metadata(new V1ListMeta().resourceVersion("0"))
                                    .items(Arrays.asList(foo1))))));
    wireMockRule.stubFor(
        get(urlMatching("^/api/v1/pods.*"))
            .withQueryParam("watch", equalTo("true"))
            .willReturn(aResponse().withStatus(200).withBody("{}")));

    wireMockRule.stubFor(
        get(urlMatching("^/api/v1/namespaces/default/configmaps.*"))
            .withQueryParam("watch", equalTo("false"))
            .willReturn(
                aResponse()
                    .withStatus(200)
                    .withBody(
                        new Gson()
                            .toJson(
                                new V1ConfigMapList()
                                    .metadata(new V1ListMeta().resourceVersion("0"))
                                    .items(Arrays.asList(bar1))))));
    wireMockRule.stubFor(
        get(urlMatching("^/api/v1/namespaces/default/configmaps.*"))
            .withQueryParam("watch", equalTo("true"))
            .willReturn(aResponse().withStatus(200).withBody("{}")));

    informerFactory.startAllRegisteredInformers();

    Thread.sleep(200);

    verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/pods")).withQueryParam("watch", equalTo("false")));
    verify(
        getRequestedFor(urlPathEqualTo("/api/v1/pods")).withQueryParam("watch", equalTo("true")));
    verify(
        1,
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/configmaps"))
            .withQueryParam("watch", equalTo("false")));
    verify(
        getRequestedFor(urlPathEqualTo("/api/v1/namespaces/default/configmaps"))
            .withQueryParam("watch", equalTo("true")));

    assertEquals(1, new Lister<>(podInformer.getIndexer()).list().size());
    assertEquals(1, new Lister<>(configMapInformer.getIndexer()).list().size());
  }
}
