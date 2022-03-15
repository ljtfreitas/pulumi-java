// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a whole calendar date, for example a date of birth. The time of day and time zone are either specified elsewhere or are not significant. The date is relative to the [Proleptic Gregorian Calendar](https://en.wikipedia.org/wiki/Proleptic_Gregorian_calendar). The date must be a valid calendar date between the year 1 and 9999.
 * 
 */
public final class DateArgs extends io.pulumi.resources.ResourceArgs {

    public static final DateArgs Empty = new DateArgs();

    /**
     * Day of month. Must be from 1 to 31 and valid for the year and month.
     * 
     */
    @Import(name="day")
      private final @Nullable Output<Integer> day;

    public Output<Integer> getDay() {
        return this.day == null ? Output.empty() : this.day;
    }

    /**
     * Month of date. Must be from 1 to 12.
     * 
     */
    @Import(name="month")
      private final @Nullable Output<Integer> month;

    public Output<Integer> getMonth() {
        return this.month == null ? Output.empty() : this.month;
    }

    /**
     * Year of date. Must be from 1 to 9999.
     * 
     */
    @Import(name="year")
      private final @Nullable Output<Integer> year;

    public Output<Integer> getYear() {
        return this.year == null ? Output.empty() : this.year;
    }

    public DateArgs(
        @Nullable Output<Integer> day,
        @Nullable Output<Integer> month,
        @Nullable Output<Integer> year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private DateArgs() {
        this.day = Output.empty();
        this.month = Output.empty();
        this.year = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> day;
        private @Nullable Output<Integer> month;
        private @Nullable Output<Integer> year;

        public Builder() {
    	      // Empty
        }

        public Builder(DateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        public Builder day(@Nullable Output<Integer> day) {
            this.day = day;
            return this;
        }

        public Builder day(@Nullable Integer day) {
            this.day = Output.ofNullable(day);
            return this;
        }

        public Builder month(@Nullable Output<Integer> month) {
            this.month = month;
            return this;
        }

        public Builder month(@Nullable Integer month) {
            this.month = Output.ofNullable(month);
            return this;
        }

        public Builder year(@Nullable Output<Integer> year) {
            this.year = year;
            return this;
        }

        public Builder year(@Nullable Integer year) {
            this.year = Output.ofNullable(year);
            return this;
        }
        public DateArgs build() {
            return new DateArgs(day, month, year);
        }
    }
}
