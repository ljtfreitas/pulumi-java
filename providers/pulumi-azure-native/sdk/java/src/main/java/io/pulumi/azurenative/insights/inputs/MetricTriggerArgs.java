// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.enums.ComparisonOperationType;
import io.pulumi.azurenative.insights.enums.MetricStatisticType;
import io.pulumi.azurenative.insights.enums.TimeAggregationType;
import io.pulumi.azurenative.insights.inputs.ScaleRuleMetricDimensionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The trigger that results in a scaling action.
 * 
 */
public final class MetricTriggerArgs extends io.pulumi.resources.ResourceArgs {

    public static final MetricTriggerArgs Empty = new MetricTriggerArgs();

    /**
     * List of dimension conditions. For example: [{"DimensionName":"AppName","Operator":"Equals","Values":["App1"]},{"DimensionName":"Deployment","Operator":"Equals","Values":["default"]}].
     * 
     */
    @InputImport(name="dimensions")
    private final @Nullable Input<List<ScaleRuleMetricDimensionArgs>> dimensions;

    public Input<List<ScaleRuleMetricDimensionArgs>> getDimensions() {
        return this.dimensions == null ? Input.empty() : this.dimensions;
    }

    /**
     * a value indicating whether metric should divide per instance.
     * 
     */
    @InputImport(name="dividePerInstance")
    private final @Nullable Input<Boolean> dividePerInstance;

    public Input<Boolean> getDividePerInstance() {
        return this.dividePerInstance == null ? Input.empty() : this.dividePerInstance;
    }

    /**
     * the name of the metric that defines what the rule monitors.
     * 
     */
    @InputImport(name="metricName", required=true)
    private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    /**
     * the namespace of the metric that defines what the rule monitors.
     * 
     */
    @InputImport(name="metricNamespace")
    private final @Nullable Input<String> metricNamespace;

    public Input<String> getMetricNamespace() {
        return this.metricNamespace == null ? Input.empty() : this.metricNamespace;
    }

    /**
     * the location of the resource the rule monitors.
     * 
     */
    @InputImport(name="metricResourceLocation")
    private final @Nullable Input<String> metricResourceLocation;

    public Input<String> getMetricResourceLocation() {
        return this.metricResourceLocation == null ? Input.empty() : this.metricResourceLocation;
    }

    /**
     * the resource identifier of the resource the rule monitors.
     * 
     */
    @InputImport(name="metricResourceUri", required=true)
    private final Input<String> metricResourceUri;

    public Input<String> getMetricResourceUri() {
        return this.metricResourceUri;
    }

    /**
     * the operator that is used to compare the metric data and the threshold.
     * 
     */
    @InputImport(name="operator", required=true)
    private final Input<ComparisonOperationType> operator;

    public Input<ComparisonOperationType> getOperator() {
        return this.operator;
    }

    /**
     * the metric statistic type. How the metrics from multiple instances are combined.
     * 
     */
    @InputImport(name="statistic", required=true)
    private final Input<MetricStatisticType> statistic;

    public Input<MetricStatisticType> getStatistic() {
        return this.statistic;
    }

    /**
     * the threshold of the metric that triggers the scale action.
     * 
     */
    @InputImport(name="threshold", required=true)
    private final Input<Double> threshold;

    public Input<Double> getThreshold() {
        return this.threshold;
    }

    /**
     * time aggregation type. How the data that is collected should be combined over time. The default value is Average.
     * 
     */
    @InputImport(name="timeAggregation", required=true)
    private final Input<TimeAggregationType> timeAggregation;

    public Input<TimeAggregationType> getTimeAggregation() {
        return this.timeAggregation;
    }

    /**
     * the granularity of metrics the rule monitors. Must be one of the predefined values returned from metric definitions for the metric. Must be between 12 hours and 1 minute.
     * 
     */
    @InputImport(name="timeGrain", required=true)
    private final Input<String> timeGrain;

    public Input<String> getTimeGrain() {
        return this.timeGrain;
    }

    /**
     * the range of time in which instance data is collected. This value must be greater than the delay in metric collection, which can vary from resource-to-resource. Must be between 12 hours and 5 minutes.
     * 
     */
    @InputImport(name="timeWindow", required=true)
    private final Input<String> timeWindow;

    public Input<String> getTimeWindow() {
        return this.timeWindow;
    }

    public MetricTriggerArgs(
        @Nullable Input<List<ScaleRuleMetricDimensionArgs>> dimensions,
        @Nullable Input<Boolean> dividePerInstance,
        Input<String> metricName,
        @Nullable Input<String> metricNamespace,
        @Nullable Input<String> metricResourceLocation,
        Input<String> metricResourceUri,
        Input<ComparisonOperationType> operator,
        Input<MetricStatisticType> statistic,
        Input<Double> threshold,
        Input<TimeAggregationType> timeAggregation,
        Input<String> timeGrain,
        Input<String> timeWindow) {
        this.dimensions = dimensions;
        this.dividePerInstance = dividePerInstance;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.metricNamespace = metricNamespace;
        this.metricResourceLocation = metricResourceLocation;
        this.metricResourceUri = Objects.requireNonNull(metricResourceUri, "expected parameter 'metricResourceUri' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.statistic = Objects.requireNonNull(statistic, "expected parameter 'statistic' to be non-null");
        this.threshold = Objects.requireNonNull(threshold, "expected parameter 'threshold' to be non-null");
        this.timeAggregation = Objects.requireNonNull(timeAggregation, "expected parameter 'timeAggregation' to be non-null");
        this.timeGrain = Objects.requireNonNull(timeGrain, "expected parameter 'timeGrain' to be non-null");
        this.timeWindow = Objects.requireNonNull(timeWindow, "expected parameter 'timeWindow' to be non-null");
    }

    private MetricTriggerArgs() {
        this.dimensions = Input.empty();
        this.dividePerInstance = Input.empty();
        this.metricName = Input.empty();
        this.metricNamespace = Input.empty();
        this.metricResourceLocation = Input.empty();
        this.metricResourceUri = Input.empty();
        this.operator = Input.empty();
        this.statistic = Input.empty();
        this.threshold = Input.empty();
        this.timeAggregation = Input.empty();
        this.timeGrain = Input.empty();
        this.timeWindow = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ScaleRuleMetricDimensionArgs>> dimensions;
        private @Nullable Input<Boolean> dividePerInstance;
        private Input<String> metricName;
        private @Nullable Input<String> metricNamespace;
        private @Nullable Input<String> metricResourceLocation;
        private Input<String> metricResourceUri;
        private Input<ComparisonOperationType> operator;
        private Input<MetricStatisticType> statistic;
        private Input<Double> threshold;
        private Input<TimeAggregationType> timeAggregation;
        private Input<String> timeGrain;
        private Input<String> timeWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
    	      this.dividePerInstance = defaults.dividePerInstance;
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.metricResourceLocation = defaults.metricResourceLocation;
    	      this.metricResourceUri = defaults.metricResourceUri;
    	      this.operator = defaults.operator;
    	      this.statistic = defaults.statistic;
    	      this.threshold = defaults.threshold;
    	      this.timeAggregation = defaults.timeAggregation;
    	      this.timeGrain = defaults.timeGrain;
    	      this.timeWindow = defaults.timeWindow;
        }

        public Builder setDimensions(@Nullable Input<List<ScaleRuleMetricDimensionArgs>> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setDimensions(@Nullable List<ScaleRuleMetricDimensionArgs> dimensions) {
            this.dimensions = Input.ofNullable(dimensions);
            return this;
        }

        public Builder setDividePerInstance(@Nullable Input<Boolean> dividePerInstance) {
            this.dividePerInstance = dividePerInstance;
            return this;
        }

        public Builder setDividePerInstance(@Nullable Boolean dividePerInstance) {
            this.dividePerInstance = Input.ofNullable(dividePerInstance);
            return this;
        }

        public Builder setMetricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder setMetricNamespace(@Nullable Input<String> metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }

        public Builder setMetricNamespace(@Nullable String metricNamespace) {
            this.metricNamespace = Input.ofNullable(metricNamespace);
            return this;
        }

        public Builder setMetricResourceLocation(@Nullable Input<String> metricResourceLocation) {
            this.metricResourceLocation = metricResourceLocation;
            return this;
        }

        public Builder setMetricResourceLocation(@Nullable String metricResourceLocation) {
            this.metricResourceLocation = Input.ofNullable(metricResourceLocation);
            return this;
        }

        public Builder setMetricResourceUri(Input<String> metricResourceUri) {
            this.metricResourceUri = Objects.requireNonNull(metricResourceUri);
            return this;
        }

        public Builder setMetricResourceUri(String metricResourceUri) {
            this.metricResourceUri = Input.of(Objects.requireNonNull(metricResourceUri));
            return this;
        }

        public Builder setOperator(Input<ComparisonOperationType> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setOperator(ComparisonOperationType operator) {
            this.operator = Input.of(Objects.requireNonNull(operator));
            return this;
        }

        public Builder setStatistic(Input<MetricStatisticType> statistic) {
            this.statistic = Objects.requireNonNull(statistic);
            return this;
        }

        public Builder setStatistic(MetricStatisticType statistic) {
            this.statistic = Input.of(Objects.requireNonNull(statistic));
            return this;
        }

        public Builder setThreshold(Input<Double> threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }

        public Builder setThreshold(Double threshold) {
            this.threshold = Input.of(Objects.requireNonNull(threshold));
            return this;
        }

        public Builder setTimeAggregation(Input<TimeAggregationType> timeAggregation) {
            this.timeAggregation = Objects.requireNonNull(timeAggregation);
            return this;
        }

        public Builder setTimeAggregation(TimeAggregationType timeAggregation) {
            this.timeAggregation = Input.of(Objects.requireNonNull(timeAggregation));
            return this;
        }

        public Builder setTimeGrain(Input<String> timeGrain) {
            this.timeGrain = Objects.requireNonNull(timeGrain);
            return this;
        }

        public Builder setTimeGrain(String timeGrain) {
            this.timeGrain = Input.of(Objects.requireNonNull(timeGrain));
            return this;
        }

        public Builder setTimeWindow(Input<String> timeWindow) {
            this.timeWindow = Objects.requireNonNull(timeWindow);
            return this;
        }

        public Builder setTimeWindow(String timeWindow) {
            this.timeWindow = Input.of(Objects.requireNonNull(timeWindow));
            return this;
        }

        public MetricTriggerArgs build() {
            return new MetricTriggerArgs(dimensions, dividePerInstance, metricName, metricNamespace, metricResourceLocation, metricResourceUri, operator, statistic, threshold, timeAggregation, timeGrain, timeWindow);
        }
    }
}
