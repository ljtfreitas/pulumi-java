// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.RecurrenceScheduleResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The workflow trigger recurrence.
 * 
 */
public final class ScheduleTriggerRecurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScheduleTriggerRecurrenceResponse Empty = new ScheduleTriggerRecurrenceResponse();

    /**
     * The end time.
     * 
     */
    @Import(name="endTime")
      private final @Nullable String endTime;

    public Optional<String> getEndTime() {
        return this.endTime == null ? Optional.empty() : Optional.ofNullable(this.endTime);
    }

    /**
     * The frequency.
     * 
     */
    @Import(name="frequency")
      private final @Nullable String frequency;

    public Optional<String> getFrequency() {
        return this.frequency == null ? Optional.empty() : Optional.ofNullable(this.frequency);
    }

    /**
     * The interval.
     * 
     */
    @Import(name="interval")
      private final @Nullable Integer interval;

    public Optional<Integer> getInterval() {
        return this.interval == null ? Optional.empty() : Optional.ofNullable(this.interval);
    }

    /**
     * The recurrence schedule.
     * 
     */
    @Import(name="schedule")
      private final @Nullable RecurrenceScheduleResponse schedule;

    public Optional<RecurrenceScheduleResponse> getSchedule() {
        return this.schedule == null ? Optional.empty() : Optional.ofNullable(this.schedule);
    }

    /**
     * The start time.
     * 
     */
    @Import(name="startTime")
      private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    /**
     * The time zone.
     * 
     */
    @Import(name="timeZone")
      private final @Nullable String timeZone;

    public Optional<String> getTimeZone() {
        return this.timeZone == null ? Optional.empty() : Optional.ofNullable(this.timeZone);
    }

    public ScheduleTriggerRecurrenceResponse(
        @Nullable String endTime,
        @Nullable String frequency,
        @Nullable Integer interval,
        @Nullable RecurrenceScheduleResponse schedule,
        @Nullable String startTime,
        @Nullable String timeZone) {
        this.endTime = endTime;
        this.frequency = frequency;
        this.interval = interval;
        this.schedule = schedule;
        this.startTime = startTime;
        this.timeZone = timeZone;
    }

    private ScheduleTriggerRecurrenceResponse() {
        this.endTime = null;
        this.frequency = null;
        this.interval = null;
        this.schedule = null;
        this.startTime = null;
        this.timeZone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleTriggerRecurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endTime;
        private @Nullable String frequency;
        private @Nullable Integer interval;
        private @Nullable RecurrenceScheduleResponse schedule;
        private @Nullable String startTime;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleTriggerRecurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.schedule = defaults.schedule;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder frequency(@Nullable String frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }

        public Builder schedule(@Nullable RecurrenceScheduleResponse schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder timeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public ScheduleTriggerRecurrenceResponse build() {
            return new ScheduleTriggerRecurrenceResponse(endTime, frequency, interval, schedule, startTime, timeZone);
        }
    }
}
