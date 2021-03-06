package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1UserInfoBuilder extends io.kubernetes.client.openapi.models.V1beta1UserInfoFluentImpl<io.kubernetes.client.openapi.models.V1beta1UserInfoBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1UserInfo,io.kubernetes.client.openapi.models.V1beta1UserInfoBuilder> {

    io.kubernetes.client.openapi.models.V1beta1UserInfoFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1UserInfoBuilder() {
        this(true);
    }

    public V1beta1UserInfoBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1UserInfo(), validationEnabled);
    }

    public V1beta1UserInfoBuilder(io.kubernetes.client.openapi.models.V1beta1UserInfoFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1UserInfoBuilder(io.kubernetes.client.openapi.models.V1beta1UserInfoFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1UserInfo(), validationEnabled);
    }

    public V1beta1UserInfoBuilder(io.kubernetes.client.openapi.models.V1beta1UserInfoFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1UserInfo instance) {
        this(fluent, instance, true);
    }

    public V1beta1UserInfoBuilder(io.kubernetes.client.openapi.models.V1beta1UserInfoFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1UserInfo instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withExtra(instance.getExtra());
        
        fluent.withGroups(instance.getGroups());
        
        fluent.withUid(instance.getUid());
        
        fluent.withUsername(instance.getUsername());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1UserInfoBuilder(io.kubernetes.client.openapi.models.V1beta1UserInfo instance) {
        this(instance,true);
    }

    public V1beta1UserInfoBuilder(io.kubernetes.client.openapi.models.V1beta1UserInfo instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withExtra(instance.getExtra());
        
        this.withGroups(instance.getGroups());
        
        this.withUid(instance.getUid());
        
        this.withUsername(instance.getUsername());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1UserInfo build() {
        V1beta1UserInfo buildable = new V1beta1UserInfo();
        buildable.setExtra(fluent.getExtra());
        buildable.setGroups(fluent.getGroups());
        buildable.setUid(fluent.getUid());
        buildable.setUsername(fluent.getUsername());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1UserInfoBuilder that = (V1beta1UserInfoBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
