// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.enums.RecurrenceFrequency;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobMaxRecurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobMaxRecurrenceArgs Empty = new JobMaxRecurrenceArgs();

    /**
     * Gets or sets the frequency of recurrence (second, minute, hour, day, week, month).
     * 
     */
    @InputImport(name="frequency")
    private final @Nullable Input<RecurrenceFrequency> frequency;

    public Input<RecurrenceFrequency> getFrequency() {
        return this.frequency == null ? Input.empty() : this.frequency;
    }

    /**
     * Gets or sets the interval between retries.
     * 
     */
    @InputImport(name="interval")
    private final @Nullable Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    public JobMaxRecurrenceArgs(
        @Nullable Input<RecurrenceFrequency> frequency,
        @Nullable Input<Integer> interval) {
        this.frequency = frequency;
        this.interval = interval;
    }

    private JobMaxRecurrenceArgs() {
        this.frequency = Input.empty();
        this.interval = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobMaxRecurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RecurrenceFrequency> frequency;
        private @Nullable Input<Integer> interval;

        public Builder() {
    	      // Empty
        }

        public Builder(JobMaxRecurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
        }

        public Builder setFrequency(@Nullable Input<RecurrenceFrequency> frequency) {
            this.frequency = frequency;
            return this;
        }

        public Builder setFrequency(@Nullable RecurrenceFrequency frequency) {
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

        public JobMaxRecurrenceArgs build() {
            return new JobMaxRecurrenceArgs(frequency, interval);
        }
    }
}
