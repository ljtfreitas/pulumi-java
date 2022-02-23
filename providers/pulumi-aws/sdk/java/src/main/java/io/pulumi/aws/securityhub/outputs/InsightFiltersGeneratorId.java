// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class InsightFiltersGeneratorId {
    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    private final String comparison;
    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"comparison","value"})
    private InsightFiltersGeneratorId(
        String comparison,
        String value) {
        this.comparison = Objects.requireNonNull(comparison);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    public String getComparison() {
        return this.comparison;
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

    public static Builder builder(InsightFiltersGeneratorId defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comparison;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersGeneratorId defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.value = defaults.value;
        }

        public Builder setComparison(String comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public InsightFiltersGeneratorId build() {
            return new InsightFiltersGeneratorId(comparison, value);
        }
    }
}
