// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeArgs Empty = new InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeArgs();

    /**
     * A date range unit for the date filter. Valid values: `DAYS`.
     * 
     */
    @InputImport(name="unit", required=true)
    private final Input<String> unit;

    public Input<String> getUnit() {
        return this.unit;
    }

    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    @InputImport(name="value", required=true)
    private final Input<Integer> value;

    public Input<Integer> getValue() {
        return this.value;
    }

    public InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeArgs(
        Input<String> unit,
        Input<Integer> value) {
        this.unit = Objects.requireNonNull(unit, "expected parameter 'unit' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeArgs() {
        this.unit = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> unit;
        private Input<Integer> value;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder setUnit(Input<String> unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public Builder setUnit(String unit) {
            this.unit = Input.of(Objects.requireNonNull(unit));
            return this;
        }

        public Builder setValue(Input<Integer> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder setValue(Integer value) {
            this.value = Input.of(Objects.requireNonNull(value));
            return this;
        }
        public InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeArgs build() {
            return new InsightFiltersResourceAwsIamAccessKeyCreatedAtDateRangeArgs(unit, value);
        }
    }
}
