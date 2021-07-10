package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1LimitResponseBuilder extends io.kubernetes.client.openapi.models.V1alpha1LimitResponseFluentImpl<io.kubernetes.client.openapi.models.V1alpha1LimitResponseBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1LimitResponse,io.kubernetes.client.openapi.models.V1alpha1LimitResponseBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1LimitResponseFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1LimitResponseBuilder() {
        this(true);
    }

    public V1alpha1LimitResponseBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1LimitResponse(), validationEnabled);
    }

    public V1alpha1LimitResponseBuilder(io.kubernetes.client.openapi.models.V1alpha1LimitResponseFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1LimitResponseBuilder(io.kubernetes.client.openapi.models.V1alpha1LimitResponseFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1LimitResponse(), validationEnabled);
    }

    public V1alpha1LimitResponseBuilder(io.kubernetes.client.openapi.models.V1alpha1LimitResponseFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1LimitResponse instance) {
        this(fluent, instance, true);
    }

    public V1alpha1LimitResponseBuilder(io.kubernetes.client.openapi.models.V1alpha1LimitResponseFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1LimitResponse instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withQueuing(instance.getQueuing());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1LimitResponseBuilder(io.kubernetes.client.openapi.models.V1alpha1LimitResponse instance) {
        this(instance,true);
    }

    public V1alpha1LimitResponseBuilder(io.kubernetes.client.openapi.models.V1alpha1LimitResponse instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withQueuing(instance.getQueuing());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1LimitResponse build() {
        V1alpha1LimitResponse buildable = new V1alpha1LimitResponse();
        buildable.setQueuing(fluent.getQueuing());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1LimitResponseBuilder that = (V1alpha1LimitResponseBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
