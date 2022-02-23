// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of the create advanced schedule monthly occurrence.
 * 
 */
public final class AdvancedScheduleMonthlyOccurrenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AdvancedScheduleMonthlyOccurrenceResponse Empty = new AdvancedScheduleMonthlyOccurrenceResponse();

    /**
     * Day of the occurrence. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
     * 
     */
    @InputImport(name="day")
        private final @Nullable String day;

    public Optional<String> getDay() {
        return this.day == null ? Optional.empty() : Optional.ofNullable(this.day);
    }

    /**
     * Occurrence of the week within the month. Must be between 1 and 5
     * 
     */
    @InputImport(name="occurrence")
        private final @Nullable Integer occurrence;

    public Optional<Integer> getOccurrence() {
        return this.occurrence == null ? Optional.empty() : Optional.ofNullable(this.occurrence);
    }

    public AdvancedScheduleMonthlyOccurrenceResponse(
        @Nullable String day,
        @Nullable Integer occurrence) {
        this.day = day;
        this.occurrence = occurrence;
    }

    private AdvancedScheduleMonthlyOccurrenceResponse() {
        this.day = null;
        this.occurrence = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedScheduleMonthlyOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String day;
        private @Nullable Integer occurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedScheduleMonthlyOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.occurrence = defaults.occurrence;
        }

        public Builder setDay(@Nullable String day) {
            this.day = day;
            return this;
        }

        public Builder setOccurrence(@Nullable Integer occurrence) {
            this.occurrence = occurrence;
            return this;
        }
        public AdvancedScheduleMonthlyOccurrenceResponse build() {
            return new AdvancedScheduleMonthlyOccurrenceResponse(day, occurrence);
        }
    }
}
