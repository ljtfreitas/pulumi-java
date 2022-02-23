// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.PersistentVolumeClaimCondition;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PersistentVolumeClaimStatus {
    /**
     * AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     * 
     */
    private final @Nullable List<String> accessModes;
    /**
     * The storage resource within AllocatedResources tracks the capacity allocated to a PVC. It may be larger than the actual capacity when a volume expansion operation is requested. For storage quota, the larger value from allocatedResources and PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no expansion operations in progress and if the actual volume capacity is equal or lower than the requested capacity. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
     * 
     */
    private final @Nullable Map<String,String> allocatedResources;
    /**
     * Represents the actual resources of the underlying volume.
     * 
     */
    private final @Nullable Map<String,String> capacity;
    /**
     * Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.
     * 
     */
    private final @Nullable List<PersistentVolumeClaimCondition> conditions;
    /**
     * Phase represents the current phase of PersistentVolumeClaim.
     * 
     * Possible enum values:
     *  - `"Bound"` used for PersistentVolumeClaims that are bound
     *  - `"Lost"` used for PersistentVolumeClaims that lost their underlying PersistentVolume. The claim was bound to a PersistentVolume and this volume does not exist any longer and all data on it was lost.
     *  - `"Pending"` used for PersistentVolumeClaims that are not yet bound
     * 
     */
    private final @Nullable String phase;
    /**
     * ResizeStatus stores status of resize operation. ResizeStatus is not set by default but when expansion is complete resizeStatus is set to empty string by resize controller or kubelet. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
     * 
     */
    private final @Nullable String resizeStatus;

    @OutputCustomType.Constructor({"accessModes","allocatedResources","capacity","conditions","phase","resizeStatus"})
    private PersistentVolumeClaimStatus(
        @Nullable List<String> accessModes,
        @Nullable Map<String,String> allocatedResources,
        @Nullable Map<String,String> capacity,
        @Nullable List<PersistentVolumeClaimCondition> conditions,
        @Nullable String phase,
        @Nullable String resizeStatus) {
        this.accessModes = accessModes;
        this.allocatedResources = allocatedResources;
        this.capacity = capacity;
        this.conditions = conditions;
        this.phase = phase;
        this.resizeStatus = resizeStatus;
    }

    /**
     * AccessModes contains the actual access modes the volume backing the PVC has. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     * 
     */
    public List<String> getAccessModes() {
        return this.accessModes == null ? List.of() : this.accessModes;
    }
    /**
     * The storage resource within AllocatedResources tracks the capacity allocated to a PVC. It may be larger than the actual capacity when a volume expansion operation is requested. For storage quota, the larger value from allocatedResources and PVC.spec.resources is used. If allocatedResources is not set, PVC.spec.resources alone is used for quota calculation. If a volume expansion capacity request is lowered, allocatedResources is only lowered if there are no expansion operations in progress and if the actual volume capacity is equal or lower than the requested capacity. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
     * 
     */
    public Map<String,String> getAllocatedResources() {
        return this.allocatedResources == null ? Map.of() : this.allocatedResources;
    }
    /**
     * Represents the actual resources of the underlying volume.
     * 
     */
    public Map<String,String> getCapacity() {
        return this.capacity == null ? Map.of() : this.capacity;
    }
    /**
     * Current Condition of persistent volume claim. If underlying persistent volume is being resized then the Condition will be set to 'ResizeStarted'.
     * 
     */
    public List<PersistentVolumeClaimCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * Phase represents the current phase of PersistentVolumeClaim.
     * 
     * Possible enum values:
     *  - `"Bound"` used for PersistentVolumeClaims that are bound
     *  - `"Lost"` used for PersistentVolumeClaims that lost their underlying PersistentVolume. The claim was bound to a PersistentVolume and this volume does not exist any longer and all data on it was lost.
     *  - `"Pending"` used for PersistentVolumeClaims that are not yet bound
     * 
     */
    public Optional<String> getPhase() {
        return Optional.ofNullable(this.phase);
    }
    /**
     * ResizeStatus stores status of resize operation. ResizeStatus is not set by default but when expansion is complete resizeStatus is set to empty string by resize controller or kubelet. This is an alpha field and requires enabling RecoverVolumeExpansionFailure feature.
     * 
     */
    public Optional<String> getResizeStatus() {
        return Optional.ofNullable(this.resizeStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistentVolumeClaimStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> accessModes;
        private @Nullable Map<String,String> allocatedResources;
        private @Nullable Map<String,String> capacity;
        private @Nullable List<PersistentVolumeClaimCondition> conditions;
        private @Nullable String phase;
        private @Nullable String resizeStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistentVolumeClaimStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessModes = defaults.accessModes;
    	      this.allocatedResources = defaults.allocatedResources;
    	      this.capacity = defaults.capacity;
    	      this.conditions = defaults.conditions;
    	      this.phase = defaults.phase;
    	      this.resizeStatus = defaults.resizeStatus;
        }

        public Builder setAccessModes(@Nullable List<String> accessModes) {
            this.accessModes = accessModes;
            return this;
        }

        public Builder setAllocatedResources(@Nullable Map<String,String> allocatedResources) {
            this.allocatedResources = allocatedResources;
            return this;
        }

        public Builder setCapacity(@Nullable Map<String,String> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setConditions(@Nullable List<PersistentVolumeClaimCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setPhase(@Nullable String phase) {
            this.phase = phase;
            return this;
        }

        public Builder setResizeStatus(@Nullable String resizeStatus) {
            this.resizeStatus = resizeStatus;
            return this;
        }
        public PersistentVolumeClaimStatus build() {
            return new PersistentVolumeClaimStatus(accessModes, allocatedResources, capacity, conditions, phase, resizeStatus);
        }
    }
}
