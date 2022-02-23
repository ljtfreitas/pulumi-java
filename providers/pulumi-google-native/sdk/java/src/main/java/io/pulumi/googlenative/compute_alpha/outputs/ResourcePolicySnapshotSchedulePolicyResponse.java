// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicySnapshotSchedulePolicyScheduleResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse;
import java.util.Objects;

@OutputCustomType
public final class ResourcePolicySnapshotSchedulePolicyResponse {
    /**
     * Retention policy applied to snapshots created by this resource policy.
     * 
     */
    private final ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse retentionPolicy;
    /**
     * A Vm Maintenance Policy specifies what kind of infrastructure maintenance we are allowed to perform on this VM and when. Schedule that is applied to disks covered by this policy.
     * 
     */
    private final ResourcePolicySnapshotSchedulePolicyScheduleResponse schedule;
    /**
     * Properties with which snapshots are created such as labels, encryption keys.
     * 
     */
    private final ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse snapshotProperties;

    @OutputCustomType.Constructor({"retentionPolicy","schedule","snapshotProperties"})
    private ResourcePolicySnapshotSchedulePolicyResponse(
        ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse retentionPolicy,
        ResourcePolicySnapshotSchedulePolicyScheduleResponse schedule,
        ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse snapshotProperties) {
        this.retentionPolicy = Objects.requireNonNull(retentionPolicy);
        this.schedule = Objects.requireNonNull(schedule);
        this.snapshotProperties = Objects.requireNonNull(snapshotProperties);
    }

    /**
     * Retention policy applied to snapshots created by this resource policy.
     * 
     */
    public ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse getRetentionPolicy() {
        return this.retentionPolicy;
    }
    /**
     * A Vm Maintenance Policy specifies what kind of infrastructure maintenance we are allowed to perform on this VM and when. Schedule that is applied to disks covered by this policy.
     * 
     */
    public ResourcePolicySnapshotSchedulePolicyScheduleResponse getSchedule() {
        return this.schedule;
    }
    /**
     * Properties with which snapshots are created such as labels, encryption keys.
     * 
     */
    public ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse getSnapshotProperties() {
        return this.snapshotProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse retentionPolicy;
        private ResourcePolicySnapshotSchedulePolicyScheduleResponse schedule;
        private ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse snapshotProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedule = defaults.schedule;
    	      this.snapshotProperties = defaults.snapshotProperties;
        }

        public Builder setRetentionPolicy(ResourcePolicySnapshotSchedulePolicyRetentionPolicyResponse retentionPolicy) {
            this.retentionPolicy = Objects.requireNonNull(retentionPolicy);
            return this;
        }

        public Builder setSchedule(ResourcePolicySnapshotSchedulePolicyScheduleResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setSnapshotProperties(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesResponse snapshotProperties) {
            this.snapshotProperties = Objects.requireNonNull(snapshotProperties);
            return this;
        }
        public ResourcePolicySnapshotSchedulePolicyResponse build() {
            return new ResourcePolicySnapshotSchedulePolicyResponse(retentionPolicy, schedule, snapshotProperties);
        }
    }
}
