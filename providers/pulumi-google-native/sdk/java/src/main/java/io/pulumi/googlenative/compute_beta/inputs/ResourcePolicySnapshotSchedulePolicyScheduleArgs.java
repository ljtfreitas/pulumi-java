// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicyDailyCycleArgs;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicyHourlyCycleArgs;
import io.pulumi.googlenative.compute_beta.inputs.ResourcePolicyWeeklyCycleArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A schedule for disks where the schedueled operations are performed.
 * 
 */
public final class ResourcePolicySnapshotSchedulePolicyScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyScheduleArgs Empty = new ResourcePolicySnapshotSchedulePolicyScheduleArgs();

    @Import(name="dailySchedule")
      private final @Nullable Output<ResourcePolicyDailyCycleArgs> dailySchedule;

    public Output<ResourcePolicyDailyCycleArgs> getDailySchedule() {
        return this.dailySchedule == null ? Output.empty() : this.dailySchedule;
    }

    @Import(name="hourlySchedule")
      private final @Nullable Output<ResourcePolicyHourlyCycleArgs> hourlySchedule;

    public Output<ResourcePolicyHourlyCycleArgs> getHourlySchedule() {
        return this.hourlySchedule == null ? Output.empty() : this.hourlySchedule;
    }

    @Import(name="weeklySchedule")
      private final @Nullable Output<ResourcePolicyWeeklyCycleArgs> weeklySchedule;

    public Output<ResourcePolicyWeeklyCycleArgs> getWeeklySchedule() {
        return this.weeklySchedule == null ? Output.empty() : this.weeklySchedule;
    }

    public ResourcePolicySnapshotSchedulePolicyScheduleArgs(
        @Nullable Output<ResourcePolicyDailyCycleArgs> dailySchedule,
        @Nullable Output<ResourcePolicyHourlyCycleArgs> hourlySchedule,
        @Nullable Output<ResourcePolicyWeeklyCycleArgs> weeklySchedule) {
        this.dailySchedule = dailySchedule;
        this.hourlySchedule = hourlySchedule;
        this.weeklySchedule = weeklySchedule;
    }

    private ResourcePolicySnapshotSchedulePolicyScheduleArgs() {
        this.dailySchedule = Output.empty();
        this.hourlySchedule = Output.empty();
        this.weeklySchedule = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourcePolicyDailyCycleArgs> dailySchedule;
        private @Nullable Output<ResourcePolicyHourlyCycleArgs> hourlySchedule;
        private @Nullable Output<ResourcePolicyWeeklyCycleArgs> weeklySchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedule = defaults.dailySchedule;
    	      this.hourlySchedule = defaults.hourlySchedule;
    	      this.weeklySchedule = defaults.weeklySchedule;
        }

        public Builder dailySchedule(@Nullable Output<ResourcePolicyDailyCycleArgs> dailySchedule) {
            this.dailySchedule = dailySchedule;
            return this;
        }

        public Builder dailySchedule(@Nullable ResourcePolicyDailyCycleArgs dailySchedule) {
            this.dailySchedule = Output.ofNullable(dailySchedule);
            return this;
        }

        public Builder hourlySchedule(@Nullable Output<ResourcePolicyHourlyCycleArgs> hourlySchedule) {
            this.hourlySchedule = hourlySchedule;
            return this;
        }

        public Builder hourlySchedule(@Nullable ResourcePolicyHourlyCycleArgs hourlySchedule) {
            this.hourlySchedule = Output.ofNullable(hourlySchedule);
            return this;
        }

        public Builder weeklySchedule(@Nullable Output<ResourcePolicyWeeklyCycleArgs> weeklySchedule) {
            this.weeklySchedule = weeklySchedule;
            return this;
        }

        public Builder weeklySchedule(@Nullable ResourcePolicyWeeklyCycleArgs weeklySchedule) {
            this.weeklySchedule = Output.ofNullable(weeklySchedule);
            return this;
        }
        public ResourcePolicySnapshotSchedulePolicyScheduleArgs build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleArgs(dailySchedule, hourlySchedule, weeklySchedule);
        }
    }
}
