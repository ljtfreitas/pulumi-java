// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagementEventAggregationConditionResponse {
    /**
     * the condition operator.
     * 
     */
    private final @Nullable String operator;
    /**
     * The threshold value that activates the alert.
     * 
     */
    private final @Nullable Double threshold;
    /**
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     */
    private final @Nullable String windowSize;

    @CustomType.Constructor
    private ManagementEventAggregationConditionResponse(
        @CustomType.Parameter("operator") @Nullable String operator,
        @CustomType.Parameter("threshold") @Nullable Double threshold,
        @CustomType.Parameter("windowSize") @Nullable String windowSize) {
        this.operator = operator;
        this.threshold = threshold;
        this.windowSize = windowSize;
    }

    /**
     * the condition operator.
     * 
    */
    public Optional<String> getOperator() {
        return Optional.ofNullable(this.operator);
    }
    /**
     * The threshold value that activates the alert.
     * 
    */
    public Optional<Double> getThreshold() {
        return Optional.ofNullable(this.threshold);
    }
    /**
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
    */
    public Optional<String> getWindowSize() {
        return Optional.ofNullable(this.windowSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementEventAggregationConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String operator;
        private @Nullable Double threshold;
        private @Nullable String windowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementEventAggregationConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.windowSize = defaults.windowSize;
        }

        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }

        public Builder threshold(@Nullable Double threshold) {
            this.threshold = threshold;
            return this;
        }

        public Builder windowSize(@Nullable String windowSize) {
            this.windowSize = windowSize;
            return this;
        }
        public ManagementEventAggregationConditionResponse build() {
            return new ManagementEventAggregationConditionResponse(operator, threshold, windowSize);
        }
    }
}
