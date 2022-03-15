// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InsightFiltersUserDefinedValue {
    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    private final String comparison;
    /**
     * The key of the map filter. For example, for `ResourceTags`, `Key` identifies the name of the tag. For `UserDefinedFields`, `Key` is the name of the field.
     * 
     */
    private final String key;
    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private InsightFiltersUserDefinedValue(
        @CustomType.Parameter("comparison") String comparison,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.comparison = comparison;
        this.key = key;
        this.value = value;
    }

    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
    */
    public String getComparison() {
        return this.comparison;
    }
    /**
     * The key of the map filter. For example, for `ResourceTags`, `Key` identifies the name of the tag. For `UserDefinedFields`, `Key` is the name of the field.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * A date range value for the date filter, provided as an Integer.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersUserDefinedValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comparison;
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersUserDefinedValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder comparison(String comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public InsightFiltersUserDefinedValue build() {
            return new InsightFiltersUserDefinedValue(comparison, key, value);
        }
    }
}
