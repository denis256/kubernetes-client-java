package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1ServiceAccountSubjectBuilder extends io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubjectFluentImpl<io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubjectBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject,io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubjectBuilder> {

    io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubjectFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1ServiceAccountSubjectBuilder() {
        this(true);
    }

    public V1beta1ServiceAccountSubjectBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1ServiceAccountSubject(), validationEnabled);
    }

    public V1beta1ServiceAccountSubjectBuilder(io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubjectFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1ServiceAccountSubjectBuilder(io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubjectFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1ServiceAccountSubject(), validationEnabled);
    }

    public V1beta1ServiceAccountSubjectBuilder(io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject instance) {
        this(fluent, instance, true);
    }

    public V1beta1ServiceAccountSubjectBuilder(io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withName(instance.getName());
        
        fluent.withNamespace(instance.getNamespace());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1ServiceAccountSubjectBuilder(io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject instance) {
        this(instance,true);
    }

    public V1beta1ServiceAccountSubjectBuilder(io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withName(instance.getName());
        
        this.withNamespace(instance.getNamespace());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1ServiceAccountSubject build() {
        V1beta1ServiceAccountSubject buildable = new V1beta1ServiceAccountSubject();
        buildable.setName(fluent.getName());
        buildable.setNamespace(fluent.getNamespace());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1ServiceAccountSubjectBuilder that = (V1beta1ServiceAccountSubjectBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
