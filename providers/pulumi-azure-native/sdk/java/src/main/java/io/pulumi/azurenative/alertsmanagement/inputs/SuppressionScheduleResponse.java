// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Schedule for a given suppression configuration.
 * 
 */
public final class SuppressionScheduleResponse extends io.pulumi.resources.InvokeArgs {

    public static final SuppressionScheduleResponse Empty = new SuppressionScheduleResponse();

    /**
     * End date for suppression
     * 
     */
    @InputImport(name="endDate")
        private final @Nullable String endDate;

    public Optional<String> getEndDate() {
        return this.endDate == null ? Optional.empty() : Optional.ofNullable(this.endDate);
    }

    /**
     * End date for suppression
     * 
     */
    @InputImport(name="endTime")
        private final @Nullable String endTime;

    public Optional<String> getEndTime() {
        return this.endTime == null ? Optional.empty() : Optional.ofNullable(this.endTime);
    }

    /**
     * Specifies the values for recurrence pattern
     * 
     */
    @InputImport(name="recurrenceValues")
        private final @Nullable List<Integer> recurrenceValues;

    public List<Integer> getRecurrenceValues() {
        return this.recurrenceValues == null ? List.of() : this.recurrenceValues;
    }

    /**
     * Start date for suppression
     * 
     */
    @InputImport(name="startDate")
        private final @Nullable String startDate;

    public Optional<String> getStartDate() {
        return this.startDate == null ? Optional.empty() : Optional.ofNullable(this.startDate);
    }

    /**
     * Start time for suppression
     * 
     */
    @InputImport(name="startTime")
        private final @Nullable String startTime;

    public Optional<String> getStartTime() {
        return this.startTime == null ? Optional.empty() : Optional.ofNullable(this.startTime);
    }

    public SuppressionScheduleResponse(
        @Nullable String endDate,
        @Nullable String endTime,
        @Nullable List<Integer> recurrenceValues,
        @Nullable String startDate,
        @Nullable String startTime) {
        this.endDate = endDate;
        this.endTime = endTime;
        this.recurrenceValues = recurrenceValues;
        this.startDate = startDate;
        this.startTime = startTime;
    }

    private SuppressionScheduleResponse() {
        this.endDate = null;
        this.endTime = null;
        this.recurrenceValues = List.of();
        this.startDate = null;
        this.startTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuppressionScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endDate;
        private @Nullable String endTime;
        private @Nullable List<Integer> recurrenceValues;
        private @Nullable String startDate;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SuppressionScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.endTime = defaults.endTime;
    	      this.recurrenceValues = defaults.recurrenceValues;
    	      this.startDate = defaults.startDate;
    	      this.startTime = defaults.startTime;
        }

        public Builder setEndDate(@Nullable String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder setEndTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setRecurrenceValues(@Nullable List<Integer> recurrenceValues) {
            this.recurrenceValues = recurrenceValues;
            return this;
        }

        public Builder setStartDate(@Nullable String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public SuppressionScheduleResponse build() {
            return new SuppressionScheduleResponse(endDate, endTime, recurrenceValues, startDate, startTime);
        }
    }
}
