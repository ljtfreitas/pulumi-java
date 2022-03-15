// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.inputs.AutoscaleScheduleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Schedule-based autoscale request parameters
 * 
 */
public final class AutoscaleRecurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscaleRecurrenceArgs Empty = new AutoscaleRecurrenceArgs();

    /**
     * Array of schedule-based autoscale rules
     * 
     */
    @Import(name="schedule")
      private final @Nullable Output<List<AutoscaleScheduleArgs>> schedule;

    public Output<List<AutoscaleScheduleArgs>> getSchedule() {
        return this.schedule == null ? Output.empty() : this.schedule;
    }

    /**
     * The time zone for the autoscale schedule times
     * 
     */
    @Import(name="timeZone")
      private final @Nullable Output<String> timeZone;

    public Output<String> getTimeZone() {
        return this.timeZone == null ? Output.empty() : this.timeZone;
    }

    public AutoscaleRecurrenceArgs(
        @Nullable Output<List<AutoscaleScheduleArgs>> schedule,
        @Nullable Output<String> timeZone) {
        this.schedule = schedule;
        this.timeZone = timeZone;
    }

    private AutoscaleRecurrenceArgs() {
        this.schedule = Output.empty();
        this.timeZone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscaleRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AutoscaleScheduleArgs>> schedule;
        private @Nullable Output<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscaleRecurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.schedule = defaults.schedule;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder schedule(@Nullable Output<List<AutoscaleScheduleArgs>> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder schedule(@Nullable List<AutoscaleScheduleArgs> schedule) {
            this.schedule = Output.ofNullable(schedule);
            return this;
        }

        public Builder timeZone(@Nullable Output<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = Output.ofNullable(timeZone);
            return this;
        }
        public AutoscaleRecurrenceArgs build() {
            return new AutoscaleRecurrenceArgs(schedule, timeZone);
        }
    }
}
