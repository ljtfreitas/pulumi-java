// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LogMetricTriggerResponse {
    /**
     * Evaluation of metric on a particular column
     * 
     */
    private final @Nullable String metricColumn;
    /**
     * Metric Trigger Type - 'Consecutive' or 'Total'
     * 
     */
    private final @Nullable String metricTriggerType;
    /**
     * The threshold of the metric trigger.
     * 
     */
    private final @Nullable Double threshold;
    /**
     * Evaluation operation for Metric -'GreaterThan' or 'LessThan' or 'Equal'.
     * 
     */
    private final @Nullable String thresholdOperator;

    @OutputCustomType.Constructor({"metricColumn","metricTriggerType","threshold","thresholdOperator"})
    private LogMetricTriggerResponse(
        @Nullable String metricColumn,
        @Nullable String metricTriggerType,
        @Nullable Double threshold,
        @Nullable String thresholdOperator) {
        this.metricColumn = metricColumn;
        this.metricTriggerType = metricTriggerType;
        this.threshold = threshold;
        this.thresholdOperator = thresholdOperator;
    }

    /**
     * Evaluation of metric on a particular column
     * 
     */
    public Optional<String> getMetricColumn() {
        return Optional.ofNullable(this.metricColumn);
    }
    /**
     * Metric Trigger Type - 'Consecutive' or 'Total'
     * 
     */
    public Optional<String> getMetricTriggerType() {
        return Optional.ofNullable(this.metricTriggerType);
    }
    /**
     * The threshold of the metric trigger.
     * 
     */
    public Optional<Double> getThreshold() {
        return Optional.ofNullable(this.threshold);
    }
    /**
     * Evaluation operation for Metric -'GreaterThan' or 'LessThan' or 'Equal'.
     * 
     */
    public Optional<String> getThresholdOperator() {
        return Optional.ofNullable(this.thresholdOperator);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogMetricTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String metricColumn;
        private @Nullable String metricTriggerType;
        private @Nullable Double threshold;
        private @Nullable String thresholdOperator;

        public Builder() {
    	      // Empty
        }

        public Builder(LogMetricTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricColumn = defaults.metricColumn;
    	      this.metricTriggerType = defaults.metricTriggerType;
    	      this.threshold = defaults.threshold;
    	      this.thresholdOperator = defaults.thresholdOperator;
        }

        public Builder setMetricColumn(@Nullable String metricColumn) {
            this.metricColumn = metricColumn;
            return this;
        }

        public Builder setMetricTriggerType(@Nullable String metricTriggerType) {
            this.metricTriggerType = metricTriggerType;
            return this;
        }

        public Builder setThreshold(@Nullable Double threshold) {
            this.threshold = threshold;
            return this;
        }

        public Builder setThresholdOperator(@Nullable String thresholdOperator) {
            this.thresholdOperator = thresholdOperator;
            return this;
        }
        public LogMetricTriggerResponse build() {
            return new LogMetricTriggerResponse(metricColumn, metricTriggerType, threshold, thresholdOperator);
        }
    }
}
