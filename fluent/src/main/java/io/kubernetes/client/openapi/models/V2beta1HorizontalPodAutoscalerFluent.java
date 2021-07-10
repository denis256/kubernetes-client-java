package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V2beta1HorizontalPodAutoscalerFluent<A extends io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getApiVersion();
    public A withApiVersion(java.lang.String apiVersion);
    public java.lang.Boolean hasApiVersion();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withApiVersion instead.
     */
        public A withNewApiVersion(java.lang.String original);
    public java.lang.String getKind();
    public A withKind(java.lang.String kind);
    public java.lang.Boolean hasKind();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withKind instead.
     */
        public A withNewKind(java.lang.String original);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildMetadata instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1ObjectMeta getMetadata();
    public io.kubernetes.client.openapi.models.V1ObjectMeta buildMetadata();
    public A withMetadata(io.kubernetes.client.openapi.models.V1ObjectMeta metadata);
    public java.lang.Boolean hasMetadata();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.MetadataNested<A> withNewMetadata();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.MetadataNested<A> withNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.MetadataNested<A> editMetadata();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.MetadataNested<A> editOrNewMetadata();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.MetadataNested<A> editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ObjectMeta item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSpec instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec getSpec();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec buildSpec();
    public A withSpec(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec spec);
    public java.lang.Boolean hasSpec();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.SpecNested<A> withNewSpec();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.SpecNested<A> withNewSpecLike(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec item);
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.SpecNested<A> editSpec();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.SpecNested<A> editOrNewSpec();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.SpecNested<A> editOrNewSpecLike(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpec item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildStatus instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus getStatus();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus buildStatus();
    public A withStatus(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus status);
    public java.lang.Boolean hasStatus();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.StatusNested<A> withNewStatus();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.StatusNested<A> withNewStatusLike(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus item);
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.StatusNested<A> editStatus();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.StatusNested<A> editOrNewStatus();
    public io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.StatusNested<A> editOrNewStatusLike(io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatus item);
    public interface MetadataNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1ObjectMetaFluent<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.MetadataNested<N>> {

            public N and();
            public N endMetadata();    }


    public interface SpecNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerSpecFluent<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.SpecNested<N>> {

            public N and();
            public N endSpec();    }


    public interface StatusNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerStatusFluent<io.kubernetes.client.openapi.models.V2beta1HorizontalPodAutoscalerFluent.StatusNested<N>> {

            public N and();
            public N endStatus();    }


}
