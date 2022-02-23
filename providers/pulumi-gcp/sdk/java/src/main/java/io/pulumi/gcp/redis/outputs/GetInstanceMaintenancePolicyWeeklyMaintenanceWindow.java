// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.redis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.redis.outputs.GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceMaintenancePolicyWeeklyMaintenanceWindow {
    private final String day;
    private final String duration;
    private final List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime> startTimes;

    @OutputCustomType.Constructor({"day","duration","startTimes"})
    private GetInstanceMaintenancePolicyWeeklyMaintenanceWindow(
        String day,
        String duration,
        List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime> startTimes) {
        this.day = Objects.requireNonNull(day);
        this.duration = Objects.requireNonNull(duration);
        this.startTimes = Objects.requireNonNull(startTimes);
    }

    public String getDay() {
        return this.day;
    }
    public String getDuration() {
        return this.duration;
    }
    public List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime> getStartTimes() {
        return this.startTimes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceMaintenancePolicyWeeklyMaintenanceWindow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String day;
        private String duration;
        private List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime> startTimes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceMaintenancePolicyWeeklyMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.duration = defaults.duration;
    	      this.startTimes = defaults.startTimes;
        }

        public Builder setDay(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder setStartTimes(List<GetInstanceMaintenancePolicyWeeklyMaintenanceWindowStartTime> startTimes) {
            this.startTimes = Objects.requireNonNull(startTimes);
            return this;
        }
        public GetInstanceMaintenancePolicyWeeklyMaintenanceWindow build() {
            return new GetInstanceMaintenancePolicyWeeklyMaintenanceWindow(day, duration, startTimes);
        }
    }
}
