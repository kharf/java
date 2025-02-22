package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1PersistentVolumeClaimConditionBuilder extends io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionFluentImpl<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionBuilder> {

    io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1PersistentVolumeClaimConditionBuilder() {
        this(true);
    }

    public V1PersistentVolumeClaimConditionBuilder(java.lang.Boolean validationEnabled) {
        this(new V1PersistentVolumeClaimCondition(), validationEnabled);
    }

    public V1PersistentVolumeClaimConditionBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionFluent<?> fluent) {
        this(fluent, true);
    }

    public V1PersistentVolumeClaimConditionBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1PersistentVolumeClaimCondition(), validationEnabled);
    }

    public V1PersistentVolumeClaimConditionBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition instance) {
        this(fluent, instance, true);
    }

    public V1PersistentVolumeClaimConditionBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimConditionFluent<?> fluent,io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withLastProbeTime(instance.getLastProbeTime());
        
        fluent.withLastTransitionTime(instance.getLastTransitionTime());
        
        fluent.withMessage(instance.getMessage());
        
        fluent.withReason(instance.getReason());
        
        fluent.withStatus(instance.getStatus());
        
        fluent.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1PersistentVolumeClaimConditionBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition instance) {
        this(instance,true);
    }

    public V1PersistentVolumeClaimConditionBuilder(io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withLastProbeTime(instance.getLastProbeTime());
        
        this.withLastTransitionTime(instance.getLastTransitionTime());
        
        this.withMessage(instance.getMessage());
        
        this.withReason(instance.getReason());
        
        this.withStatus(instance.getStatus());
        
        this.withType(instance.getType());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1PersistentVolumeClaimCondition build() {
        V1PersistentVolumeClaimCondition buildable = new V1PersistentVolumeClaimCondition();
        buildable.setLastProbeTime(fluent.getLastProbeTime());
        buildable.setLastTransitionTime(fluent.getLastTransitionTime());
        buildable.setMessage(fluent.getMessage());
        buildable.setReason(fluent.getReason());
        buildable.setStatus(fluent.getStatus());
        buildable.setType(fluent.getType());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1PersistentVolumeClaimConditionBuilder that = (V1PersistentVolumeClaimConditionBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
