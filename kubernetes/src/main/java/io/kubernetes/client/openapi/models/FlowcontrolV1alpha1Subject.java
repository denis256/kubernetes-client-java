/*
Copyright 2021 The Kubernetes Authors.
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
package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Subject matches the originator of a request, as identified by the request authentication system.
 * There are three ways of matching an originator; by user, group, or service account.
 */
@ApiModel(
    description =
        "Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-01-04T09:55:14.976Z[Etc/UTC]")
public class FlowcontrolV1alpha1Subject {
  public static final String SERIALIZED_NAME_GROUP = "group";

  @SerializedName(SERIALIZED_NAME_GROUP)
  private V1alpha1GroupSubject group;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_SERVICE_ACCOUNT = "serviceAccount";

  @SerializedName(SERIALIZED_NAME_SERVICE_ACCOUNT)
  private V1alpha1ServiceAccountSubject serviceAccount;

  public static final String SERIALIZED_NAME_USER = "user";

  @SerializedName(SERIALIZED_NAME_USER)
  private V1alpha1UserSubject user;

  public FlowcontrolV1alpha1Subject group(V1alpha1GroupSubject group) {

    this.group = group;
    return this;
  }

  /**
   * Get group
   *
   * @return group
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha1GroupSubject getGroup() {
    return group;
  }

  public void setGroup(V1alpha1GroupSubject group) {
    this.group = group;
  }

  public FlowcontrolV1alpha1Subject kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Required
   *
   * @return kind
   */
  @ApiModelProperty(required = true, value = "Required")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public FlowcontrolV1alpha1Subject serviceAccount(V1alpha1ServiceAccountSubject serviceAccount) {

    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Get serviceAccount
   *
   * @return serviceAccount
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha1ServiceAccountSubject getServiceAccount() {
    return serviceAccount;
  }

  public void setServiceAccount(V1alpha1ServiceAccountSubject serviceAccount) {
    this.serviceAccount = serviceAccount;
  }

  public FlowcontrolV1alpha1Subject user(V1alpha1UserSubject user) {

    this.user = user;
    return this;
  }

  /**
   * Get user
   *
   * @return user
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1alpha1UserSubject getUser() {
    return user;
  }

  public void setUser(V1alpha1UserSubject user) {
    this.user = user;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowcontrolV1alpha1Subject flowcontrolV1alpha1Subject = (FlowcontrolV1alpha1Subject) o;
    return Objects.equals(this.group, flowcontrolV1alpha1Subject.group)
        && Objects.equals(this.kind, flowcontrolV1alpha1Subject.kind)
        && Objects.equals(this.serviceAccount, flowcontrolV1alpha1Subject.serviceAccount)
        && Objects.equals(this.user, flowcontrolV1alpha1Subject.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, kind, serviceAccount, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowcontrolV1alpha1Subject {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
