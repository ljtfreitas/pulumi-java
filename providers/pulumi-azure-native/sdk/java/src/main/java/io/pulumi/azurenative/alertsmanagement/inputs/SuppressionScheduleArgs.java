// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Schedule for a given suppression configuration.
 * 
 */
public final class SuppressionScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SuppressionScheduleArgs Empty = new SuppressionScheduleArgs();

    /**
     * End date for suppression
     * 
     */
    @InputImport(name="endDate")
    private final @Nullable Input<String> endDate;

    public Input<String> getEndDate() {
        return this.endDate == null ? Input.empty() : this.endDate;
    }

    /**
     * End date for suppression
     * 
     */
    @InputImport(name="endTime")
    private final @Nullable Input<String> endTime;

    public Input<String> getEndTime() {
        return this.endTime == null ? Input.empty() : this.endTime;
    }

    /**
     * Specifies the values for recurrence pattern
     * 
     */
    @InputImport(name="recurrenceValues")
    private final @Nullable Input<List<Integer>> recurrenceValues;

    public Input<List<Integer>> getRecurrenceValues() {
        return this.recurrenceValues == null ? Input.empty() : this.recurrenceValues;
    }

    /**
     * Start date for suppression
     * 
     */
    @InputImport(name="startDate")
    private final @Nullable Input<String> startDate;

    public Input<String> getStartDate() {
        return this.startDate == null ? Input.empty() : this.startDate;
    }

    /**
     * Start time for suppression
     * 
     */
    @InputImport(name="startTime")
    private final @Nullable Input<String> startTime;

    public Input<String> getStartTime() {
        return this.startTime == null ? Input.empty() : this.startTime;
    }

    public SuppressionScheduleArgs(
        @Nullable Input<String> endDate,
        @Nullable Input<String> endTime,
        @Nullable Input<List<Integer>> recurrenceValues,
        @Nullable Input<String> startDate,
        @Nullable Input<String> startTime) {
        this.endDate = endDate;
        this.endTime = endTime;
        this.recurrenceValues = recurrenceValues;
        this.startDate = startDate;
        this.startTime = startTime;
    }

    private SuppressionScheduleArgs() {
        this.endDate = Input.empty();
        this.endTime = Input.empty();
        this.recurrenceValues = Input.empty();
        this.startDate = Input.empty();
        this.startTime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuppressionScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endDate;
        private @Nullable Input<String> endTime;
        private @Nullable Input<List<Integer>> recurrenceValues;
        private @Nullable Input<String> startDate;
        private @Nullable Input<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SuppressionScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.endTime = defaults.endTime;
    	      this.recurrenceValues = defaults.recurrenceValues;
    	      this.startDate = defaults.startDate;
    	      this.startTime = defaults.startTime;
        }

        public Builder setEndDate(@Nullable Input<String> endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setEndDate(@Nullable String endDate) {
            this.endDate = Input.ofNullable(endDate);
            return this;
        }

        public Builder setEndTime(@Nullable Input<String> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = Input.ofNullable(endTime);
            return this;
        }

        public Builder setRecurrenceValues(@Nullable Input<List<Integer>> recurrenceValues) {
            this.recurrenceValues = recurrenceValues;
            return this;
        }

        public Builder setRecurrenceValues(@Nullable List<Integer> recurrenceValues) {
            this.recurrenceValues = Input.ofNullable(recurrenceValues);
            return this;
        }

        public Builder setStartDate(@Nullable Input<String> startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setStartDate(@Nullable String startDate) {
            this.startDate = Input.ofNullable(startDate);
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

        public SuppressionScheduleArgs build() {
            return new SuppressionScheduleArgs(endDate, endTime, recurrenceValues, startDate, startTime);
        }
    }
}
