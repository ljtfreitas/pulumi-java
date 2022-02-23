// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule;
import io.pulumi.gcp.compute.outputs.GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule;
import io.pulumi.gcp.compute.outputs.GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetResourcePolicySnapshotSchedulePolicySchedule {
    private final List<GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule> dailySchedules;
    private final List<GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule> hourlySchedules;
    private final List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule> weeklySchedules;

    @OutputCustomType.Constructor({"dailySchedules","hourlySchedules","weeklySchedules"})
    private GetResourcePolicySnapshotSchedulePolicySchedule(
        List<GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule> dailySchedules,
        List<GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule> hourlySchedules,
        List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule> weeklySchedules) {
        this.dailySchedules = Objects.requireNonNull(dailySchedules);
        this.hourlySchedules = Objects.requireNonNull(hourlySchedules);
        this.weeklySchedules = Objects.requireNonNull(weeklySchedules);
    }

    public List<GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule> getDailySchedules() {
        return this.dailySchedules;
    }
    public List<GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule> getHourlySchedules() {
        return this.hourlySchedules;
    }
    public List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule> getWeeklySchedules() {
        return this.weeklySchedules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule> dailySchedules;
        private List<GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule> hourlySchedules;
        private List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule> weeklySchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicySnapshotSchedulePolicySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dailySchedules = defaults.dailySchedules;
    	      this.hourlySchedules = defaults.hourlySchedules;
    	      this.weeklySchedules = defaults.weeklySchedules;
        }

        public Builder setDailySchedules(List<GetResourcePolicySnapshotSchedulePolicyScheduleDailySchedule> dailySchedules) {
            this.dailySchedules = Objects.requireNonNull(dailySchedules);
            return this;
        }

        public Builder setHourlySchedules(List<GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule> hourlySchedules) {
            this.hourlySchedules = Objects.requireNonNull(hourlySchedules);
            return this;
        }

        public Builder setWeeklySchedules(List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule> weeklySchedules) {
            this.weeklySchedules = Objects.requireNonNull(weeklySchedules);
            return this;
        }
        public GetResourcePolicySnapshotSchedulePolicySchedule build() {
            return new GetResourcePolicySnapshotSchedulePolicySchedule(dailySchedules, hourlySchedules, weeklySchedules);
        }
    }
}
