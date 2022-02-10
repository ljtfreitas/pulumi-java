// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.RecurrenceFrequency;
import io.pulumi.azurenative.datafactory.inputs.RecurrenceScheduleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ScheduleTriggerRecurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScheduleTriggerRecurrenceArgs Empty = new ScheduleTriggerRecurrenceArgs();

    @InputImport(name="endTime")
    private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    @InputImport(name="frequency")
    private final @Nullable Input<Either<String,RecurrenceFrequency>> frequency;

    public Input<Either<String,RecurrenceFrequency>> getFrequency() {
        return this.frequency == null ? Input.empty() : this.frequency;
    }

    @InputImport(name="interval")
    private final @Nullable Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    @InputImport(name="schedule")
    private final @Nullable Input<RecurrenceScheduleArgs> schedule;

    public Input<RecurrenceScheduleArgs> getSchedule() {
        return this.schedule == null ? Input.empty() : this.schedule;
    }

    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    @InputImport(name="timeZone")
    private final @Nullable Input<String> timeZone;

    public Input<String> getTimeZone() {
        return this.timeZone == null ? Input.empty() : this.timeZone;
    }

    public ScheduleTriggerRecurrenceArgs(
        @Nullable Input<String> endTime,
        @Nullable Input<Either<String,RecurrenceFrequency>> frequency,
        @Nullable Input<Integer> interval,
        @Nullable Input<RecurrenceScheduleArgs> schedule,
        @Nullable Input<String> startTime,
        @Nullable Input<String> timeZone) {
        this.endTime = endTime;
        this.frequency = frequency;
        this.interval = interval;
        this.schedule = schedule;
        this.startTime = startTime;
        this.timeZone = timeZone;
    }

    private ScheduleTriggerRecurrenceArgs() {
        this.endTime = Input.empty();
        this.frequency = Input.empty();
        this.interval = Input.empty();
        this.schedule = Input.empty();
        this.startTime = Input.empty();
        this.timeZone = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleTriggerRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endTime;
        private @Nullable Input<Either<String,RecurrenceFrequency>> frequency;
        private @Nullable Input<Integer> interval;
        private @Nullable Input<RecurrenceScheduleArgs> schedule;
        private @Nullable Input<String> startTime;
        private @Nullable Input<String> timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleTriggerRecurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.schedule = defaults.schedule;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setFrequency(@Nullable Input<Either<String,RecurrenceFrequency>> frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder setFrequency(@Nullable Either<String,RecurrenceFrequency> frequency) {
            this.frequency = Input.ofNullable(frequency);
            return this;
        }

        public Builder setInterval(@Nullable Input<Integer> interval) {
            this.interval = interval;
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = Input.ofNullable(interval);
            return this;
        }

        public Builder setSchedule(@Nullable Input<RecurrenceScheduleArgs> schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSchedule(@Nullable RecurrenceScheduleArgs schedule) {
            this.schedule = Input.ofNullable(schedule);
            return this;
        }

        public Builder setStartTime(@Nullable Input<String> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = Input.ofNullable(startTime);
            return this;
        }

        public Builder setTimeZone(@Nullable Input<String> timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = Input.ofNullable(timeZone);
            return this;
        }

        public ScheduleTriggerRecurrenceArgs build() {
            return new ScheduleTriggerRecurrenceArgs(endTime, frequency, interval, schedule, startTime, timeZone);
        }
    }
}