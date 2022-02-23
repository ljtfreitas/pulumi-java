// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RecurrencePatternResponse {
    /**
     * When the recurrence will expire. This date is inclusive.
     * 
     */
    private final String expirationDate;
    /**
     * The frequency of the recurrence.
     * 
     */
    private final String frequency;
    /**
     * The interval to invoke the schedule on. For example, interval = 2 and RecurrenceFrequency.Daily will run every 2 days. When no interval is supplied, an interval of 1 is used.
     * 
     */
    private final @Nullable Integer interval;
    /**
     * The week days the schedule runs. Used for when the Frequency is set to Weekly.
     * 
     */
    private final @Nullable List<String> weekDays;

    @OutputCustomType.Constructor({"expirationDate","frequency","interval","weekDays"})
    private RecurrencePatternResponse(
        String expirationDate,
        String frequency,
        @Nullable Integer interval,
        @Nullable List<String> weekDays) {
        this.expirationDate = Objects.requireNonNull(expirationDate);
        this.frequency = Objects.requireNonNull(frequency);
        this.interval = interval;
        this.weekDays = weekDays;
    }

    /**
     * When the recurrence will expire. This date is inclusive.
     * 
     */
    public String getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * The frequency of the recurrence.
     * 
     */
    public String getFrequency() {
        return this.frequency;
    }
    /**
     * The interval to invoke the schedule on. For example, interval = 2 and RecurrenceFrequency.Daily will run every 2 days. When no interval is supplied, an interval of 1 is used.
     * 
     */
    public Optional<Integer> getInterval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * The week days the schedule runs. Used for when the Frequency is set to Weekly.
     * 
     */
    public List<String> getWeekDays() {
        return this.weekDays == null ? List.of() : this.weekDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrencePatternResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationDate;
        private String frequency;
        private @Nullable Integer interval;
        private @Nullable List<String> weekDays;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrencePatternResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationDate = defaults.expirationDate;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.weekDays = defaults.weekDays;
        }

        public Builder setExpirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }

        public Builder setFrequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }

        public Builder setWeekDays(@Nullable List<String> weekDays) {
            this.weekDays = weekDays;
            return this;
        }
        public RecurrencePatternResponse build() {
            return new RecurrencePatternResponse(expirationDate, frequency, interval, weekDays);
        }
    }
}
