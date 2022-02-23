// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.aws.securityhub.inputs.InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InsightFiltersResourceAwsIamAccessKeyCreatedAtGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersResourceAwsIamAccessKeyCreatedAtGetArgs Empty = new InsightFiltersResourceAwsIamAccessKeyCreatedAtGetArgs();

    /**
     * A configuration block of the date range for the date filter. See date_range below for more details.
     * 
     */
    @InputImport(name="dateRange")
    private final @Nullable Input<InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeGetArgs> dateRange;

    public Input<InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeGetArgs> getDateRange() {
        return this.dateRange == null ? Input.empty() : this.dateRange;
    }

    /**
     * An end date for the date filter. Required with `start` if `date_range` is not specified.
     * 
     */
    @InputImport(name="end")
    private final @Nullable Input<String> end;

    public Input<String> getEnd() {
        return this.end == null ? Input.empty() : this.end;
    }

    /**
     * A start date for the date filter. Required with `end` if `date_range` is not specified.
     * 
     */
    @InputImport(name="start")
    private final @Nullable Input<String> start;

    public Input<String> getStart() {
        return this.start == null ? Input.empty() : this.start;
    }

    public InsightFiltersResourceAwsIamAccessKeyCreatedAtGetArgs(
        @Nullable Input<InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeGetArgs> dateRange,
        @Nullable Input<String> end,
        @Nullable Input<String> start) {
        this.dateRange = dateRange;
        this.end = end;
        this.start = start;
    }

    private InsightFiltersResourceAwsIamAccessKeyCreatedAtGetArgs() {
        this.dateRange = Input.empty();
        this.end = Input.empty();
        this.start = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersResourceAwsIamAccessKeyCreatedAtGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeGetArgs> dateRange;
        private @Nullable Input<String> end;
        private @Nullable Input<String> start;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersResourceAwsIamAccessKeyCreatedAtGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateRange = defaults.dateRange;
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder setDateRange(@Nullable Input<InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeGetArgs> dateRange) {
            this.dateRange = dateRange;
            return this;
        }

        public Builder setDateRange(@Nullable InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeGetArgs dateRange) {
            this.dateRange = Input.ofNullable(dateRange);
            return this;
        }

        public Builder setEnd(@Nullable Input<String> end) {
            this.end = end;
            return this;
        }

        public Builder setEnd(@Nullable String end) {
            this.end = Input.ofNullable(end);
            return this;
        }

        public Builder setStart(@Nullable Input<String> start) {
            this.start = start;
            return this;
        }

        public Builder setStart(@Nullable String start) {
            this.start = Input.ofNullable(start);
            return this;
        }
        public InsightFiltersResourceAwsIamAccessKeyCreatedAtGetArgs build() {
            return new InsightFiltersResourceAwsIamAccessKeyCreatedAtGetArgs(dateRange, end, start);
        }
    }
}
