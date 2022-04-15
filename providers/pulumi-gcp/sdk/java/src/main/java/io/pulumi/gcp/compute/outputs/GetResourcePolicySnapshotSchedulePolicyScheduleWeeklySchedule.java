// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule {
    private final List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks;

    @CustomType.Constructor
    private GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule(@CustomType.Parameter("dayOfWeeks") List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks) {
        this.dayOfWeeks = dayOfWeeks;
    }

    public List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks() {
        return this.dayOfWeeks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeeks = defaults.dayOfWeeks;
        }

        public Builder dayOfWeeks(List<GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek> dayOfWeeks) {
            this.dayOfWeeks = Objects.requireNonNull(dayOfWeeks);
            return this;
        }
        public Builder dayOfWeeks(GetResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeek... dayOfWeeks) {
            return dayOfWeeks(List.of(dayOfWeeks));
        }        public GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule build() {
            return new GetResourcePolicySnapshotSchedulePolicyScheduleWeeklySchedule(dayOfWeeks);
        }
    }
}
