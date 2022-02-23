// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.enums.ConditionOperator;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * How the data that is collected should be combined over time.
 * 
 */
public final class ManagementEventAggregationConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementEventAggregationConditionArgs Empty = new ManagementEventAggregationConditionArgs();

    /**
     * the condition operator.
     * 
     */
    @InputImport(name="operator")
        private final @Nullable Input<ConditionOperator> operator;

    public Input<ConditionOperator> getOperator() {
        return this.operator == null ? Input.empty() : this.operator;
    }

    /**
     * The threshold value that activates the alert.
     * 
     */
    @InputImport(name="threshold")
        private final @Nullable Input<Double> threshold;

    public Input<Double> getThreshold() {
        return this.threshold == null ? Input.empty() : this.threshold;
    }

    /**
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     */
    @InputImport(name="windowSize")
        private final @Nullable Input<String> windowSize;

    public Input<String> getWindowSize() {
        return this.windowSize == null ? Input.empty() : this.windowSize;
    }

    public ManagementEventAggregationConditionArgs(
        @Nullable Input<ConditionOperator> operator,
        @Nullable Input<Double> threshold,
        @Nullable Input<String> windowSize) {
        this.operator = operator;
        this.threshold = threshold;
        this.windowSize = windowSize;
    }

    private ManagementEventAggregationConditionArgs() {
        this.operator = Input.empty();
        this.threshold = Input.empty();
        this.windowSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementEventAggregationConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConditionOperator> operator;
        private @Nullable Input<Double> threshold;
        private @Nullable Input<String> windowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementEventAggregationConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.windowSize = defaults.windowSize;
        }

        public Builder setOperator(@Nullable Input<ConditionOperator> operator) {
            this.operator = operator;
            return this;
        }

        public Builder setOperator(@Nullable ConditionOperator operator) {
            this.operator = Input.ofNullable(operator);
            return this;
        }

        public Builder setThreshold(@Nullable Input<Double> threshold) {
            this.threshold = threshold;
            return this;
        }

        public Builder setThreshold(@Nullable Double threshold) {
            this.threshold = Input.ofNullable(threshold);
            return this;
        }

        public Builder setWindowSize(@Nullable Input<String> windowSize) {
            this.windowSize = windowSize;
            return this;
        }

        public Builder setWindowSize(@Nullable String windowSize) {
            this.windowSize = Input.ofNullable(windowSize);
            return this;
        }
        public ManagementEventAggregationConditionArgs build() {
            return new ManagementEventAggregationConditionArgs(operator, threshold, windowSize);
        }
    }
}
