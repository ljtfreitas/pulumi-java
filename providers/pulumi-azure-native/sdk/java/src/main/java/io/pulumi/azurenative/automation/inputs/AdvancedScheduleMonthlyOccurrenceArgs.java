// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.enums.ScheduleDay;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of the create advanced schedule monthly occurrence.
 * 
 */
public final class AdvancedScheduleMonthlyOccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdvancedScheduleMonthlyOccurrenceArgs Empty = new AdvancedScheduleMonthlyOccurrenceArgs();

    /**
     * Day of the occurrence. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
     * 
     */
    @InputImport(name="day")
        private final @Nullable Input<Either<String,ScheduleDay>> day;

    public Input<Either<String,ScheduleDay>> getDay() {
        return this.day == null ? Input.empty() : this.day;
    }

    /**
     * Occurrence of the week within the month. Must be between 1 and 5
     * 
     */
    @InputImport(name="occurrence")
        private final @Nullable Input<Integer> occurrence;

    public Input<Integer> getOccurrence() {
        return this.occurrence == null ? Input.empty() : this.occurrence;
    }

    public AdvancedScheduleMonthlyOccurrenceArgs(
        @Nullable Input<Either<String,ScheduleDay>> day,
        @Nullable Input<Integer> occurrence) {
        this.day = day;
        this.occurrence = occurrence;
    }

    private AdvancedScheduleMonthlyOccurrenceArgs() {
        this.day = Input.empty();
        this.occurrence = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedScheduleMonthlyOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ScheduleDay>> day;
        private @Nullable Input<Integer> occurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedScheduleMonthlyOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.occurrence = defaults.occurrence;
        }

        public Builder setDay(@Nullable Input<Either<String,ScheduleDay>> day) {
            this.day = day;
            return this;
        }

        public Builder setDay(@Nullable Either<String,ScheduleDay> day) {
            this.day = Input.ofNullable(day);
            return this;
        }

        public Builder setOccurrence(@Nullable Input<Integer> occurrence) {
            this.occurrence = occurrence;
            return this;
        }

        public Builder setOccurrence(@Nullable Integer occurrence) {
            this.occurrence = Input.ofNullable(occurrence);
            return this;
        }
        public AdvancedScheduleMonthlyOccurrenceArgs build() {
            return new AdvancedScheduleMonthlyOccurrenceArgs(day, occurrence);
        }
    }
}
