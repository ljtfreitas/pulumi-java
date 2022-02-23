// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.redis.inputs.InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceMaintenancePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceMaintenancePolicyArgs Empty = new InstanceMaintenancePolicyArgs();

    /**
     * - 
     * Output only. The time when the policy was created.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    @InputImport(name="createTime")
        private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * Optional. Description of what this policy is for.
     * Create/Update methods return INVALID_ARGUMENT if the
     * length is greater than 512.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * - 
     * Output only. The time when the policy was last updated.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond
     * resolution and up to nine fractional digits.
     * 
     */
    @InputImport(name="updateTime")
        private final @Nullable Input<String> updateTime;

    public Input<String> getUpdateTime() {
        return this.updateTime == null ? Input.empty() : this.updateTime;
    }

    /**
     * Optional. Maintenance window that is applied to resources covered by this policy.
     * Minimum 1. For the current version, the maximum number
     * of weekly_window is expected to be one.
     * Structure is documented below.
     * 
     */
    @InputImport(name="weeklyMaintenanceWindows")
        private final @Nullable Input<List<InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs>> weeklyMaintenanceWindows;

    public Input<List<InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs>> getWeeklyMaintenanceWindows() {
        return this.weeklyMaintenanceWindows == null ? Input.empty() : this.weeklyMaintenanceWindows;
    }

    public InstanceMaintenancePolicyArgs(
        @Nullable Input<String> createTime,
        @Nullable Input<String> description,
        @Nullable Input<String> updateTime,
        @Nullable Input<List<InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs>> weeklyMaintenanceWindows) {
        this.createTime = createTime;
        this.description = description;
        this.updateTime = updateTime;
        this.weeklyMaintenanceWindows = weeklyMaintenanceWindows;
    }

    private InstanceMaintenancePolicyArgs() {
        this.createTime = Input.empty();
        this.description = Input.empty();
        this.updateTime = Input.empty();
        this.weeklyMaintenanceWindows = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMaintenancePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> description;
        private @Nullable Input<String> updateTime;
        private @Nullable Input<List<InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs>> weeklyMaintenanceWindows;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceMaintenancePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.updateTime = defaults.updateTime;
    	      this.weeklyMaintenanceWindows = defaults.weeklyMaintenanceWindows;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setUpdateTime(@Nullable Input<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder setUpdateTime(@Nullable String updateTime) {
            this.updateTime = Input.ofNullable(updateTime);
            return this;
        }

        public Builder setWeeklyMaintenanceWindows(@Nullable Input<List<InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs>> weeklyMaintenanceWindows) {
            this.weeklyMaintenanceWindows = weeklyMaintenanceWindows;
            return this;
        }

        public Builder setWeeklyMaintenanceWindows(@Nullable List<InstanceMaintenancePolicyWeeklyMaintenanceWindowArgs> weeklyMaintenanceWindows) {
            this.weeklyMaintenanceWindows = Input.ofNullable(weeklyMaintenanceWindows);
            return this;
        }
        public InstanceMaintenancePolicyArgs build() {
            return new InstanceMaintenancePolicyArgs(createTime, description, updateTime, weeklyMaintenanceWindows);
        }
    }
}
