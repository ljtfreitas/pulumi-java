// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs;
import io.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleArgs;
import io.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicySnapshotSchedulePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyArgs Empty = new ResourcePolicySnapshotSchedulePolicyArgs();

    /**
     * Retention policy applied to snapshots created by this resource policy.
     * Structure is documented below.
     * 
     */
    @InputImport(name="retentionPolicy")
        private final @Nullable Input<ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs> retentionPolicy;

    public Input<ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs> getRetentionPolicy() {
        return this.retentionPolicy == null ? Input.empty() : this.retentionPolicy;
    }

    /**
     * Specifies the frequency for the operation, using the unix-cron format.
     * 
     */
    @InputImport(name="schedule", required=true)
        private final Input<ResourcePolicySnapshotSchedulePolicyScheduleArgs> schedule;

    public Input<ResourcePolicySnapshotSchedulePolicyScheduleArgs> getSchedule() {
        return this.schedule;
    }

    /**
     * Properties with which the snapshots are created, such as labels.
     * Structure is documented below.
     * 
     */
    @InputImport(name="snapshotProperties")
        private final @Nullable Input<ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs> snapshotProperties;

    public Input<ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs> getSnapshotProperties() {
        return this.snapshotProperties == null ? Input.empty() : this.snapshotProperties;
    }

    public ResourcePolicySnapshotSchedulePolicyArgs(
        @Nullable Input<ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs> retentionPolicy,
        Input<ResourcePolicySnapshotSchedulePolicyScheduleArgs> schedule,
        @Nullable Input<ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs> snapshotProperties) {
        this.retentionPolicy = retentionPolicy;
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
        this.snapshotProperties = snapshotProperties;
    }

    private ResourcePolicySnapshotSchedulePolicyArgs() {
        this.retentionPolicy = Input.empty();
        this.schedule = Input.empty();
        this.snapshotProperties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs> retentionPolicy;
        private Input<ResourcePolicySnapshotSchedulePolicyScheduleArgs> schedule;
        private @Nullable Input<ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs> snapshotProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedule = defaults.schedule;
    	      this.snapshotProperties = defaults.snapshotProperties;
        }

        public Builder setRetentionPolicy(@Nullable Input<ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder setRetentionPolicy(@Nullable ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs retentionPolicy) {
            this.retentionPolicy = Input.ofNullable(retentionPolicy);
            return this;
        }

        public Builder setSchedule(Input<ResourcePolicySnapshotSchedulePolicyScheduleArgs> schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }

        public Builder setSchedule(ResourcePolicySnapshotSchedulePolicyScheduleArgs schedule) {
            this.schedule = Input.of(Objects.requireNonNull(schedule));
            return this;
        }

        public Builder setSnapshotProperties(@Nullable Input<ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs> snapshotProperties) {
            this.snapshotProperties = snapshotProperties;
            return this;
        }

        public Builder setSnapshotProperties(@Nullable ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs snapshotProperties) {
            this.snapshotProperties = Input.ofNullable(snapshotProperties);
            return this;
        }
        public ResourcePolicySnapshotSchedulePolicyArgs build() {
            return new ResourcePolicySnapshotSchedulePolicyArgs(retentionPolicy, schedule, snapshotProperties);
        }
    }
}
