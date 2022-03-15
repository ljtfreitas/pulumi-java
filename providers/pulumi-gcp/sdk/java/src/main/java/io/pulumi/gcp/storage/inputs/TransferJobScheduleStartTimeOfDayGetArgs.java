// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class TransferJobScheduleStartTimeOfDayGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobScheduleStartTimeOfDayGetArgs Empty = new TransferJobScheduleStartTimeOfDayGetArgs();

    /**
     * Hours of day in 24 hour format. Should be from 0 to 23
     * 
     */
    @Import(name="hours", required=true)
      private final Output<Integer> hours;

    public Output<Integer> getHours() {
        return this.hours;
    }

    /**
     * Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    @Import(name="minutes", required=true)
      private final Output<Integer> minutes;

    public Output<Integer> getMinutes() {
        return this.minutes;
    }

    /**
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    @Import(name="nanos", required=true)
      private final Output<Integer> nanos;

    public Output<Integer> getNanos() {
        return this.nanos;
    }

    /**
     * Seconds of minutes of the time. Must normally be from 0 to 59.
     * 
     */
    @Import(name="seconds", required=true)
      private final Output<Integer> seconds;

    public Output<Integer> getSeconds() {
        return this.seconds;
    }

    public TransferJobScheduleStartTimeOfDayGetArgs(
        Output<Integer> hours,
        Output<Integer> minutes,
        Output<Integer> nanos,
        Output<Integer> seconds) {
        this.hours = Objects.requireNonNull(hours, "expected parameter 'hours' to be non-null");
        this.minutes = Objects.requireNonNull(minutes, "expected parameter 'minutes' to be non-null");
        this.nanos = Objects.requireNonNull(nanos, "expected parameter 'nanos' to be non-null");
        this.seconds = Objects.requireNonNull(seconds, "expected parameter 'seconds' to be non-null");
    }

    private TransferJobScheduleStartTimeOfDayGetArgs() {
        this.hours = Output.empty();
        this.minutes = Output.empty();
        this.nanos = Output.empty();
        this.seconds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobScheduleStartTimeOfDayGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> hours;
        private Output<Integer> minutes;
        private Output<Integer> nanos;
        private Output<Integer> seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobScheduleStartTimeOfDayGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder hours(Output<Integer> hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }

        public Builder hours(Integer hours) {
            this.hours = Output.of(Objects.requireNonNull(hours));
            return this;
        }

        public Builder minutes(Output<Integer> minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }

        public Builder minutes(Integer minutes) {
            this.minutes = Output.of(Objects.requireNonNull(minutes));
            return this;
        }

        public Builder nanos(Output<Integer> nanos) {
            this.nanos = Objects.requireNonNull(nanos);
            return this;
        }

        public Builder nanos(Integer nanos) {
            this.nanos = Output.of(Objects.requireNonNull(nanos));
            return this;
        }

        public Builder seconds(Output<Integer> seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }

        public Builder seconds(Integer seconds) {
            this.seconds = Output.of(Objects.requireNonNull(seconds));
            return this;
        }
        public TransferJobScheduleStartTimeOfDayGetArgs build() {
            return new TransferJobScheduleStartTimeOfDayGetArgs(hours, minutes, nanos, seconds);
        }
    }
}
