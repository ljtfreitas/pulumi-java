// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.enums.JobScheduleDay;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobRecurrenceScheduleMonthlyOccurrenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobRecurrenceScheduleMonthlyOccurrenceArgs Empty = new JobRecurrenceScheduleMonthlyOccurrenceArgs();

    /**
     * Gets or sets the day. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
     * 
     */
    @InputImport(name="day")
    private final @Nullable Input<JobScheduleDay> day;

    public Input<JobScheduleDay> getDay() {
        return this.day == null ? Input.empty() : this.day;
    }

    /**
     * Gets or sets the occurrence. Must be between -5 and 5.
     * 
     */
    @InputImport(name="occurrence")
    private final @Nullable Input<Integer> occurrence;

    public Input<Integer> getOccurrence() {
        return this.occurrence == null ? Input.empty() : this.occurrence;
    }

    public JobRecurrenceScheduleMonthlyOccurrenceArgs(
        @Nullable Input<JobScheduleDay> day,
        @Nullable Input<Integer> occurrence) {
        this.day = day;
        this.occurrence = occurrence;
    }

    private JobRecurrenceScheduleMonthlyOccurrenceArgs() {
        this.day = Input.empty();
        this.occurrence = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobRecurrenceScheduleMonthlyOccurrenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<JobScheduleDay> day;
        private @Nullable Input<Integer> occurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(JobRecurrenceScheduleMonthlyOccurrenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.occurrence = defaults.occurrence;
        }

        public Builder setDay(@Nullable Input<JobScheduleDay> day) {
            this.day = day;
            return this;
        }

        public Builder setDay(@Nullable JobScheduleDay day) {
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

        public JobRecurrenceScheduleMonthlyOccurrenceArgs build() {
            return new JobRecurrenceScheduleMonthlyOccurrenceArgs(day, occurrence);
        }
    }
}
