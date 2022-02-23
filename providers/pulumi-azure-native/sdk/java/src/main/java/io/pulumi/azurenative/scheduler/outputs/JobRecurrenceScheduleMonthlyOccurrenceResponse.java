// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobRecurrenceScheduleMonthlyOccurrenceResponse {
    /**
     * Gets or sets the day. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
     * 
     */
    private final @Nullable String day;
    /**
     * Gets or sets the occurrence. Must be between -5 and 5.
     * 
     */
    private final @Nullable Integer occurrence;

    @OutputCustomType.Constructor({"day","occurrence"})
    private JobRecurrenceScheduleMonthlyOccurrenceResponse(
        @Nullable String day,
        @Nullable Integer occurrence) {
        this.day = day;
        this.occurrence = occurrence;
    }

    /**
     * Gets or sets the day. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
     * 
     */
    public Optional<String> getDay() {
        return Optional.ofNullable(this.day);
    }
    /**
     * Gets or sets the occurrence. Must be between -5 and 5.
     * 
     */
    public Optional<Integer> getOccurrence() {
        return Optional.ofNullable(this.occurrence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobRecurrenceScheduleMonthlyOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String day;
        private @Nullable Integer occurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(JobRecurrenceScheduleMonthlyOccurrenceResponse defaults) {
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
        public JobRecurrenceScheduleMonthlyOccurrenceResponse build() {
            return new JobRecurrenceScheduleMonthlyOccurrenceResponse(day, occurrence);
        }
    }
}
