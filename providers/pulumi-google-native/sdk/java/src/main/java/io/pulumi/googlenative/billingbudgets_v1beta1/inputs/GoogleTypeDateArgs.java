// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.billingbudgets_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a whole or partial calendar date, such as a birthday. The time of day and time zone are either specified elsewhere or are insignificant. The date is relative to the Gregorian Calendar. This can represent one of the following: * A full date, with non-zero year, month, and day values * A month and day value, with a zero year, such as an anniversary * A year on its own, with zero month and day values * A year and month value, with a zero day, such as a credit card expiration date Related types are google.type.TimeOfDay and `google.protobuf.Timestamp`.
 * 
 */
public final class GoogleTypeDateArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleTypeDateArgs Empty = new GoogleTypeDateArgs();

    /**
     * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year by itself or a year and month where the day isn't significant.
     * 
     */
    @InputImport(name="day")
      private final @Nullable Input<Integer> day;

    public Input<Integer> getDay() {
        return this.day == null ? Input.empty() : this.day;
    }

    /**
     * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
     * 
     */
    @InputImport(name="month")
      private final @Nullable Input<Integer> month;

    public Input<Integer> getMonth() {
        return this.month == null ? Input.empty() : this.month;
    }

    /**
     * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
     * 
     */
    @InputImport(name="year")
      private final @Nullable Input<Integer> year;

    public Input<Integer> getYear() {
        return this.year == null ? Input.empty() : this.year;
    }

    public GoogleTypeDateArgs(
        @Nullable Input<Integer> day,
        @Nullable Input<Integer> month,
        @Nullable Input<Integer> year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private GoogleTypeDateArgs() {
        this.day = Input.empty();
        this.month = Input.empty();
        this.year = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleTypeDateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> day;
        private @Nullable Input<Integer> month;
        private @Nullable Input<Integer> year;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleTypeDateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        public Builder setDay(@Nullable Input<Integer> day) {
            this.day = day;
            return this;
        }

        public Builder setDay(@Nullable Integer day) {
            this.day = Input.ofNullable(day);
            return this;
        }

        public Builder setMonth(@Nullable Input<Integer> month) {
            this.month = month;
            return this;
        }

        public Builder setMonth(@Nullable Integer month) {
            this.month = Input.ofNullable(month);
            return this;
        }

        public Builder setYear(@Nullable Input<Integer> year) {
            this.year = year;
            return this;
        }

        public Builder setYear(@Nullable Integer year) {
            this.year = Input.ofNullable(year);
            return this;
        }
        public GoogleTypeDateArgs build() {
            return new GoogleTypeDateArgs(day, month, year);
        }
    }
}
