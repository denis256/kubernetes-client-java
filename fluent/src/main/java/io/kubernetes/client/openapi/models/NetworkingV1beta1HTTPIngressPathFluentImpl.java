package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

public class NetworkingV1beta1HTTPIngressPathFluentImpl<A extends io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluent<A> {

    private io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendBuilder backend;
    private java.lang.String path;
    private java.lang.String pathType;

    public NetworkingV1beta1HTTPIngressPathFluentImpl() {
    }

    public NetworkingV1beta1HTTPIngressPathFluentImpl(io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPath instance) {
        this.withBackend(instance.getBackend());
        
        this.withPath(instance.getPath());
        
        this.withPathType(instance.getPathType());
    }

    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildBackend instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend getBackend() {
        return this.backend!=null?this.backend.build():null;
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend buildBackend() {
        return this.backend!=null?this.backend.build():null;
    }

    public A withBackend(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend backend) {
        _visitables.get("backend").remove(this.backend);
        if (backend!=null){ this.backend= new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendBuilder(backend); _visitables.get("backend").add(this.backend);} return (A) this;
    }

    public java.lang.Boolean hasBackend() {
        return this.backend != null;
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluent.BackendNested<A> withNewBackend() {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluentImpl.BackendNestedImpl();
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluent.BackendNested<A> withNewBackendLike(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend item) {
        return new io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluentImpl.BackendNestedImpl(item);
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluent.BackendNested<A> editBackend() {
        return withNewBackendLike(getBackend());
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluent.BackendNested<A> editOrNewBackend() {
        return withNewBackendLike(getBackend() != null ? getBackend(): new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendBuilder().build());
    }

    public io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluent.BackendNested<A> editOrNewBackendLike(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend item) {
        return withNewBackendLike(getBackend() != null ? getBackend(): item);
    }

    public java.lang.String getPath() {
        return this.path;
    }

    public A withPath(java.lang.String path) {
        this.path=path; return (A) this;
    }

    public java.lang.Boolean hasPath() {
        return this.path != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPath instead.
     */
        public A withNewPath(java.lang.String original) {
        return (A)withPath(new String(original));
    }

    public java.lang.String getPathType() {
        return this.pathType;
    }

    public A withPathType(java.lang.String pathType) {
        this.pathType=pathType; return (A) this;
    }

    public java.lang.Boolean hasPathType() {
        return this.pathType != null;
    }

    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withPathType instead.
     */
        public A withNewPathType(java.lang.String original) {
        return (A)withPathType(new String(original));
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NetworkingV1beta1HTTPIngressPathFluentImpl that = (NetworkingV1beta1HTTPIngressPathFluentImpl) o;
        if (backend != null ? !backend.equals(that.backend) :that.backend != null) return false;
        if (path != null ? !path.equals(that.path) :that.path != null) return false;
        if (pathType != null ? !pathType.equals(that.pathType) :that.pathType != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(backend,  path,  pathType,  super.hashCode());
    }

    public class BackendNestedImpl<N> extends io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendFluentImpl<io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluent.BackendNested<N>> implements io.kubernetes.client.openapi.models.NetworkingV1beta1HTTPIngressPathFluent.BackendNested<N>,io.kubernetes.client.fluent.Nested<N> {
        private final io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendBuilder builder;

            BackendNestedImpl(io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackend item) {
                this.builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendBuilder(this, item);
                        
            }

            BackendNestedImpl() {
                this.builder = new io.kubernetes.client.openapi.models.NetworkingV1beta1IngressBackendBuilder(this);
                        
            }

            public N and() {
                return (N) NetworkingV1beta1HTTPIngressPathFluentImpl.this.withBackend(builder.build());
            }

            public N endBackend() {
                return and();
            }
    }


}
