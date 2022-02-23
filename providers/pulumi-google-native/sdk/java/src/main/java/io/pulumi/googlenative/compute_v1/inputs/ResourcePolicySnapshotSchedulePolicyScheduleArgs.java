// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.inputs.ResourcePolicyDailyCycleArgs;
import io.pulumi.googlenative.compute_v1.inputs.ResourcePolicyHourlyCycleArgs;
import io.pulumi.googlenative.compute_v1.inputs.ResourcePolicyWeeklyCycleArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A schedule for disks where the schedueled operations are performed.
 * 
 */
public final class ResourcePolicySnapshotSchedulePolicyScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyScheduleArgs Empty = new ResourcePolicySnapshotSchedulePolicyScheduleArgs();

    @InputImport(name="dailySchedule")
      private final @Nullable Input<ResourcePolicyDailyCycleArgs> dailySchedule;

    public Input<ResourcePolicyDailyCycleArgs> getDailySchedule() {
        return this.dailySchedule == null ? Input.empty() : this.dailySchedule;
    }

    @InputImport(name="hourlySchedule")
      private final @Nullable Input<ResourcePolicyHourlyCycleArgs> hourlySchedule;

    public Input<ResourcePolicyHourlyCycleArgs> getHourlySchedule() {
        return this.hourlySchedule == null ? Input.empty() : this.hourlySchedule;
    }

    @InputImport(name="weeklySchedule")
      private final @Nullable Input<ResourcePolicyWeeklyCycleArgs> weeklySchedule;

    public Input<ResourcePolicyWeeklyCycleArgs> getWeeklySchedule() {
        return this.weeklySchedule == null ? Input.empty() : this.weeklySchedule;
    }

    public ResourcePolicySnapshotSchedulePolicyScheduleArgs(
        @Nullable Input<ResourcePolicyDailyCycleArgs> dailySchedule,
        @Nullable Input<ResourcePolicyHourlyCycleArgs> hourlySchedule,
        @Nullable Input<ResourcePolicyWeeklyCycleArgs> weeklySchedule) {
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
        private @Nullable Input<ResourcePolicyDailyCycleArgs> dailySchedule;
        private @Nullable Input<ResourcePolicyHourlyCycleArgs> hourlySchedule;
        private @Nullable Input<ResourcePolicyWeeklyCycleArgs> weeklySchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedule = defaults.dailySchedule;
    	      this.hourlySchedule = defaults.hourlySchedule;
    	      this.weeklySchedule = defaults.weeklySchedule;
        }

        public Builder setDailySchedule(@Nullable Input<ResourcePolicyDailyCycleArgs> dailySchedule) {
            this.dailySchedule = dailySchedule;
            return this;
        }

        public Builder setDailySchedule(@Nullable ResourcePolicyDailyCycleArgs dailySchedule) {
            this.dailySchedule = Input.ofNullable(dailySchedule);
            return this;
        }

        public Builder setHourlySchedule(@Nullable Input<ResourcePolicyHourlyCycleArgs> hourlySchedule) {
            this.hourlySchedule = hourlySchedule;
            return this;
        }

        public Builder setHourlySchedule(@Nullable ResourcePolicyHourlyCycleArgs hourlySchedule) {
            this.hourlySchedule = Input.ofNullable(hourlySchedule);
            return this;
        }

        public Builder setWeeklySchedule(@Nullable Input<ResourcePolicyWeeklyCycleArgs> weeklySchedule) {
            this.weeklySchedule = weeklySchedule;
            return this;
        }

        public Builder setWeeklySchedule(@Nullable ResourcePolicyWeeklyCycleArgs weeklySchedule) {
            this.weeklySchedule = Input.ofNullable(weeklySchedule);
            return this;
        }
        public ResourcePolicySnapshotSchedulePolicyScheduleArgs build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleArgs(dailySchedule, hourlySchedule, weeklySchedule);
        }
    }
}
