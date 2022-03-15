// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Represents a whole calendar date, for example a date of birth. The time of day and time zone are either specified elsewhere or are not significant. The date is relative to the [Proleptic Gregorian Calendar](https://en.wikipedia.org/wiki/Proleptic_Gregorian_calendar). The date must be a valid calendar date between the year 1 and 9999.
 * 
 */
public final class DateResponse extends io.pulumi.resources.InvokeArgs {

    public static final DateResponse Empty = new DateResponse();

    /**
     * Day of month. Must be from 1 to 31 and valid for the year and month.
     * 
     */
    @Import(name="day", required=true)
      private final Integer day;

    public Integer getDay() {
        return this.day;
    }

    /**
     * Month of date. Must be from 1 to 12.
     * 
     */
    @Import(name="month", required=true)
      private final Integer month;

    public Integer getMonth() {
        return this.month;
    }

    /**
     * Year of date. Must be from 1 to 9999.
     * 
     */
    @Import(name="year", required=true)
      private final Integer year;

    public Integer getYear() {
        return this.year;
    }

    public DateResponse(
        Integer day,
        Integer month,
        Integer year) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.month = Objects.requireNonNull(month, "expected parameter 'month' to be non-null");
        this.year = Objects.requireNonNull(year, "expected parameter 'year' to be non-null");
    }

    private DateResponse() {
        this.day = null;
        this.month = null;
        this.year = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer day;
        private Integer month;
        private Integer year;

        public Builder() {
    	      // Empty
        }

        public Builder(DateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        public Builder day(Integer day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }

        public Builder month(Integer month) {
            this.month = Objects.requireNonNull(month);
            return this;
        }

        public Builder year(Integer year) {
            this.year = Objects.requireNonNull(year);
            return this;
        }
        public DateResponse build() {
            return new DateResponse(day, month, year);
        }
    }
}
