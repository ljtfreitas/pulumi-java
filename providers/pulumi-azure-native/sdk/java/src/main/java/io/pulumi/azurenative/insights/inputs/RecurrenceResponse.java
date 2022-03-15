// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.RecurrentScheduleResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The repeating times at which this profile begins. This element is not used if the FixedDate element is used.
 * 
 */
public final class RecurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecurrenceResponse Empty = new RecurrenceResponse();

    /**
     * the recurrence frequency. How often the schedule profile should take effect. This value must be Week, meaning each week will have the same set of profiles. For example, to set a daily schedule, set **schedule** to every day of the week. The frequency property specifies that the schedule is repeated weekly.
     * 
     */
    @Import(name="frequency", required=true)
      private final String frequency;

    public String getFrequency() {
        return this.frequency;
    }

    /**
     * the scheduling constraints for when the profile begins.
     * 
     */
    @Import(name="schedule", required=true)
      private final RecurrentScheduleResponse schedule;

    public RecurrentScheduleResponse getSchedule() {
        return this.schedule;
    }

    public RecurrenceResponse(
        String frequency,
        RecurrentScheduleResponse schedule) {
        this.frequency = Objects.requireNonNull(frequency, "expected parameter 'frequency' to be non-null");
        this.schedule = Objects.requireNonNull(schedule, "expected parameter 'schedule' to be non-null");
    }

    private RecurrenceResponse() {
        this.frequency = null;
        this.schedule = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String frequency;
        private RecurrentScheduleResponse schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
    	      this.schedule = defaults.schedule;
        }

        public Builder frequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }

        public Builder schedule(RecurrentScheduleResponse schedule) {
            this.schedule = Objects.requireNonNull(schedule);
            return this;
        }
        public RecurrenceResponse build() {
            return new RecurrenceResponse(frequency, schedule);
        }
    }
}
