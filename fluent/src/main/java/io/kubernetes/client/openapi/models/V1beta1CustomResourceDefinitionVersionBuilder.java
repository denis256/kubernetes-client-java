package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1beta1CustomResourceDefinitionVersionBuilder extends io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluentImpl<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionBuilder> {

    io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1beta1CustomResourceDefinitionVersionBuilder() {
        this(true);
    }

    public V1beta1CustomResourceDefinitionVersionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1beta1CustomResourceDefinitionVersion(), validationEnabled);
    }

    public V1beta1CustomResourceDefinitionVersionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1beta1CustomResourceDefinitionVersionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1beta1CustomResourceDefinitionVersion(), validationEnabled);
    }

    public V1beta1CustomResourceDefinitionVersionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion instance) {
        this(fluent, instance, true);
    }

    public V1beta1CustomResourceDefinitionVersionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersionFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns());
        
        fluent.withDeprecated(instance.getDeprecated());
        
        fluent.withDeprecationWarning(instance.getDeprecationWarning());
        
        fluent.withName(instance.getName());
        
        fluent.withSchema(instance.getSchema());
        
        fluent.withServed(instance.getServed());
        
        fluent.withStorage(instance.getStorage());
        
        fluent.withSubresources(instance.getSubresources());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1beta1CustomResourceDefinitionVersionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion instance) {
        this(instance,true);
    }

    public V1beta1CustomResourceDefinitionVersionBuilder(io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withAdditionalPrinterColumns(instance.getAdditionalPrinterColumns());
        
        this.withDeprecated(instance.getDeprecated());
        
        this.withDeprecationWarning(instance.getDeprecationWarning());
        
        this.withName(instance.getName());
        
        this.withSchema(instance.getSchema());
        
        this.withServed(instance.getServed());
        
        this.withStorage(instance.getStorage());
        
        this.withSubresources(instance.getSubresources());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1beta1CustomResourceDefinitionVersion build() {
        V1beta1CustomResourceDefinitionVersion buildable = new V1beta1CustomResourceDefinitionVersion();
        buildable.setAdditionalPrinterColumns(fluent.getAdditionalPrinterColumns());
        buildable.setDeprecated(fluent.getDeprecated());
        buildable.setDeprecationWarning(fluent.getDeprecationWarning());
        buildable.setName(fluent.getName());
        buildable.setSchema(fluent.getSchema());
        buildable.setServed(fluent.getServed());
        buildable.setStorage(fluent.getStorage());
        buildable.setSubresources(fluent.getSubresources());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1beta1CustomResourceDefinitionVersionBuilder that = (V1beta1CustomResourceDefinitionVersionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
