package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1CSINodeSpecBuilder extends io.kubernetes.client.openapi.models.V1CSINodeSpecFluentImpl<io.kubernetes.client.openapi.models.V1CSINodeSpecBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1CSINodeSpec,io.kubernetes.client.openapi.models.V1CSINodeSpecBuilder> {

    io.kubernetes.client.openapi.models.V1CSINodeSpecFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1CSINodeSpecBuilder() {
        this(true);
    }

    public V1CSINodeSpecBuilder(java.lang.Boolean validationEnabled) {
        this(new V1CSINodeSpec(), validationEnabled);
    }

    public V1CSINodeSpecBuilder(io.kubernetes.client.openapi.models.V1CSINodeSpecFluent<?> fluent) {
        this(fluent, true);
    }

    public V1CSINodeSpecBuilder(io.kubernetes.client.openapi.models.V1CSINodeSpecFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1CSINodeSpec(), validationEnabled);
    }

    public V1CSINodeSpecBuilder(io.kubernetes.client.openapi.models.V1CSINodeSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1CSINodeSpec instance) {
        this(fluent, instance, true);
    }

    public V1CSINodeSpecBuilder(io.kubernetes.client.openapi.models.V1CSINodeSpecFluent<?> fluent,io.kubernetes.client.openapi.models.V1CSINodeSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withDrivers(instance.getDrivers());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1CSINodeSpecBuilder(io.kubernetes.client.openapi.models.V1CSINodeSpec instance) {
        this(instance,true);
    }

    public V1CSINodeSpecBuilder(io.kubernetes.client.openapi.models.V1CSINodeSpec instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withDrivers(instance.getDrivers());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1CSINodeSpec build() {
        V1CSINodeSpec buildable = new V1CSINodeSpec();
        buildable.setDrivers(fluent.getDrivers());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1CSINodeSpecBuilder that = (V1CSINodeSpecBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
