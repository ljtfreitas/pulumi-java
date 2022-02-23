// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.ResourcePolicyDailyCycleResponse;
import io.pulumi.googlenative.compute_beta.outputs.ResourcePolicyHourlyCycleResponse;
import io.pulumi.googlenative.compute_beta.outputs.ResourcePolicyWeeklyCycleResponse;
import java.util.Objects;

@OutputCustomType
public final class ResourcePolicySnapshotSchedulePolicyScheduleResponse {
    private final ResourcePolicyDailyCycleResponse dailySchedule;
    private final ResourcePolicyHourlyCycleResponse hourlySchedule;
    private final ResourcePolicyWeeklyCycleResponse weeklySchedule;

    @OutputCustomType.Constructor({"dailySchedule","hourlySchedule","weeklySchedule"})
    private ResourcePolicySnapshotSchedulePolicyScheduleResponse(
        ResourcePolicyDailyCycleResponse dailySchedule,
        ResourcePolicyHourlyCycleResponse hourlySchedule,
        ResourcePolicyWeeklyCycleResponse weeklySchedule) {
        this.dailySchedule = Objects.requireNonNull(dailySchedule);
        this.hourlySchedule = Objects.requireNonNull(hourlySchedule);
        this.weeklySchedule = Objects.requireNonNull(weeklySchedule);
    }

    public ResourcePolicyDailyCycleResponse getDailySchedule() {
        return this.dailySchedule;
    }
    public ResourcePolicyHourlyCycleResponse getHourlySchedule() {
        return this.hourlySchedule;
    }
    public ResourcePolicyWeeklyCycleResponse getWeeklySchedule() {
        return this.weeklySchedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyDailyCycleResponse dailySchedule;
        private ResourcePolicyHourlyCycleResponse hourlySchedule;
        private ResourcePolicyWeeklyCycleResponse weeklySchedule;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedule = defaults.dailySchedule;
    	      this.hourlySchedule = defaults.hourlySchedule;
    	      this.weeklySchedule = defaults.weeklySchedule;
        }

        public Builder setDailySchedule(ResourcePolicyDailyCycleResponse dailySchedule) {
            this.dailySchedule = Objects.requireNonNull(dailySchedule);
            return this;
        }

        public Builder setHourlySchedule(ResourcePolicyHourlyCycleResponse hourlySchedule) {
            this.hourlySchedule = Objects.requireNonNull(hourlySchedule);
            return this;
        }

        public Builder setWeeklySchedule(ResourcePolicyWeeklyCycleResponse weeklySchedule) {
            this.weeklySchedule = Objects.requireNonNull(weeklySchedule);
            return this;
        }
        public ResourcePolicySnapshotSchedulePolicyScheduleResponse build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleResponse(dailySchedule, hourlySchedule, weeklySchedule);
        }
    }
}
