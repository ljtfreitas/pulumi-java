// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs;
import io.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs;
import io.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicySnapshotSchedulePolicyScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyScheduleArgs Empty = new ResourcePolicySnapshotSchedulePolicyScheduleArgs();

    @InputImport(name="dailySchedule")
    private final @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs> dailySchedule;

    public Input<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs> getDailySchedule() {
        return this.dailySchedule == null ? Input.empty() : this.dailySchedule;
    }

    @InputImport(name="hourlySchedule")
    private final @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs> hourlySchedule;

    public Input<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs> getHourlySchedule() {
        return this.hourlySchedule == null ? Input.empty() : this.hourlySchedule;
    }

    @InputImport(name="weeklySchedule")
    private final @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs> weeklySchedule;

    public Input<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs> getWeeklySchedule() {
        return this.weeklySchedule == null ? Input.empty() : this.weeklySchedule;
    }

    public ResourcePolicySnapshotSchedulePolicyScheduleArgs(
        @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs> dailySchedule,
        @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs> hourlySchedule,
        @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs> weeklySchedule) {
        this.dailySchedule = dailySchedule;
        this.hourlySchedule = hourlySchedule;
        this.weeklySchedule = weeklySchedule;
    }

    private ResourcePolicySnapshotSchedulePolicyScheduleArgs() {
        this.dailySchedule = Input.empty();
        this.hourlySchedule = Input.empty();
        this.weeklySchedule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs> dailySchedule;
        private @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs> hourlySchedule;
        private @Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs> weeklySchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedule = defaults.dailySchedule;
    	      this.hourlySchedule = defaults.hourlySchedule;
    	      this.weeklySchedule = defaults.weeklySchedule;
        }

        public Builder setDailySchedule(@Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs> dailySchedule) {
            this.dailySchedule = dailySchedule;
            return this;
        }

        public Builder setDailySchedule(@Nullable ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs dailySchedule) {
            this.dailySchedule = Input.ofNullable(dailySchedule);
            return this;
        }

        public Builder setHourlySchedule(@Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs> hourlySchedule) {
            this.hourlySchedule = hourlySchedule;
            return this;
        }

        public Builder setHourlySchedule(@Nullable ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs hourlySchedule) {
            this.hourlySchedule = Input.ofNullable(hourlySchedule);
            return this;
        }

        public Builder setWeeklySchedule(@Nullable Input<ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs> weeklySchedule) {
            this.weeklySchedule = weeklySchedule;
            return this;
        }

        public Builder setWeeklySchedule(@Nullable ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleArgs weeklySchedule) {
            this.weeklySchedule = Input.ofNullable(weeklySchedule);
            return this;
        }

        public ResourcePolicySnapshotSchedulePolicyScheduleArgs build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleArgs(dailySchedule, hourlySchedule, weeklySchedule);
        }
    }
}