// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersThreatIntelIndicatorValueGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersThreatIntelIndicatorValueGetArgs Empty = new InsightFiltersThreatIntelIndicatorValueGetArgs();

    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    @Import(name="comparison", required=true)
      private final Output<String> comparison;

    public Output<String> getComparison() {
        return this.comparison;
    }

    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public InsightFiltersThreatIntelIndicatorValueGetArgs(
        Output<String> comparison,
        Output<String> value) {
        this.comparison = Objects.requireNonNull(comparison, "expected parameter 'comparison' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private InsightFiltersThreatIntelIndicatorValueGetArgs() {
        this.comparison = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersThreatIntelIndicatorValueGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> comparison;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersThreatIntelIndicatorValueGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.value = defaults.value;
        }

        public Builder comparison(Output<String> comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }

        public Builder comparison(String comparison) {
            this.comparison = Output.of(Objects.requireNonNull(comparison));
            return this;
        }

        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }
        public InsightFiltersThreatIntelIndicatorValueGetArgs build() {
            return new InsightFiltersThreatIntelIndicatorValueGetArgs(comparison, value);
        }
    }
}
