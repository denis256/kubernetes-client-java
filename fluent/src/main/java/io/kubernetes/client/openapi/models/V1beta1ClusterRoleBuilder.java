package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1ClusterRoleBuilder extends io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluentImpl<io.kubernetes.client.openapi.models.V1beta1ClusterRoleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1ClusterRole,io.kubernetes.client.openapi.models.V1beta1ClusterRoleBuilder> {

    io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1ClusterRoleBuilder() {
        this(true);
    }

    public V1beta1ClusterRoleBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1ClusterRole(), validationEnabled);
    }

    public V1beta1ClusterRoleBuilder(io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1ClusterRoleBuilder(io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1ClusterRole(), validationEnabled);
    }

    public V1beta1ClusterRoleBuilder(io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1ClusterRole instance) {
        this(fluent, instance, true);
    }

    public V1beta1ClusterRoleBuilder(io.kubernetes.client.openapi.models.V1beta1ClusterRoleFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1ClusterRole instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAggregationRule(instance.getAggregationRule());
        
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        fluent.withRules(instance.getRules());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1ClusterRoleBuilder(io.kubernetes.client.openapi.models.V1beta1ClusterRole instance) {
        this(instance,true);
    }

    public V1beta1ClusterRoleBuilder(io.kubernetes.client.openapi.models.V1beta1ClusterRole instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAggregationRule(instance.getAggregationRule());
        
        this.withApiVersion(instance.getApiVersion());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.withRules(instance.getRules());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1ClusterRole build() {
        V1beta1ClusterRole buildable = new V1beta1ClusterRole();
        buildable.setAggregationRule(fluent.getAggregationRule());
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        buildable.setRules(fluent.getRules());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1ClusterRoleBuilder that = (V1beta1ClusterRoleBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
