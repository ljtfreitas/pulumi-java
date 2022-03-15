// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs Empty = new ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs();

    /**
     * The day of the week to create the snapshot. e.g. MONDAY
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    @Import(name="day", required=true)
      private final Output<String> day;

    public Output<String> getDay() {
        return this.day;
    }

    /**
     * The start time of the schedule. The timestamp is an RFC3339 string.
     * 
     */
    @Import(name="startTime", required=true)
      private final Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime;
    }

    public ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs(
        Output<String> day,
        Output<String> startTime) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs() {
        this.day = Output.empty();
        this.startTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> day;
        private Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.startTime = defaults.startTime;
        }

        public Builder day(Output<String> day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder day(String day) {
            this.day = Output.of(Objects.requireNonNull(day));
            return this;
        }

        public Builder startTime(Output<String> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder startTime(String startTime) {
            this.startTime = Output.of(Objects.requireNonNull(startTime));
            return this;
        }
        public ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs build() {
            return new ResourcePolicySnapshotSchedulePolicyScheduleWeeklyScheduleDayOfWeekGetArgs(day, startTime);
        }
    }
}
