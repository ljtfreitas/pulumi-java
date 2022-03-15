// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule {
    private final Integer hoursInCycle;
    private final String startTime;

    @CustomType.Constructor
    private GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule(
        @CustomType.Parameter("hoursInCycle") Integer hoursInCycle,
        @CustomType.Parameter("startTime") String startTime) {
        this.hoursInCycle = hoursInCycle;
        this.startTime = startTime;
    }

    public Integer getHoursInCycle() {
        return this.hoursInCycle;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer hoursInCycle;
        private String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hoursInCycle = defaults.hoursInCycle;
    	      this.startTime = defaults.startTime;
        }

        public Builder hoursInCycle(Integer hoursInCycle) {
            this.hoursInCycle = Objects.requireNonNull(hoursInCycle);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule build() {
            return new GetResourcePolicySnapshotSchedulePolicyScheduleHourlySchedule(hoursInCycle, startTime);
        }
    }
}
