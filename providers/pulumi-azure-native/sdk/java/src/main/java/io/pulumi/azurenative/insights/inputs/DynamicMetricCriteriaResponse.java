// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.DynamicThresholdFailingPeriodsResponse;
import io.pulumi.azurenative.insights.inputs.MetricDimensionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Criterion for dynamic threshold.
 * 
 */
public final class DynamicMetricCriteriaResponse extends io.pulumi.resources.InvokeArgs {

    public static final DynamicMetricCriteriaResponse Empty = new DynamicMetricCriteriaResponse();

    /**
     * The extent of deviation required to trigger an alert. This will affect how tight the threshold is to the metric series pattern.
     * 
     */
    @InputImport(name="alertSensitivity", required=true)
    private final String alertSensitivity;

    public String getAlertSensitivity() {
        return this.alertSensitivity;
    }

    /**
     * Specifies the type of threshold criteria
     * Expected value is 'DynamicThresholdCriterion'.
     * 
     */
    @InputImport(name="criterionType", required=true)
    private final String criterionType;

    public String getCriterionType() {
        return this.criterionType;
    }

    /**
     * List of dimension conditions.
     * 
     */
    @InputImport(name="dimensions")
    private final @Nullable List<MetricDimensionResponse> dimensions;

    public List<MetricDimensionResponse> getDimensions() {
        return this.dimensions == null ? List.of() : this.dimensions;
    }

    /**
     * The minimum number of violations required within the selected lookback time window required to raise an alert.
     * 
     */
    @InputImport(name="failingPeriods", required=true)
    private final DynamicThresholdFailingPeriodsResponse failingPeriods;

    public DynamicThresholdFailingPeriodsResponse getFailingPeriods() {
        return this.failingPeriods;
    }

    /**
     * Use this option to set the date from which to start learning the metric historical data and calculate the dynamic thresholds (in ISO8601 format)
     * 
     */
    @InputImport(name="ignoreDataBefore")
    private final @Nullable String ignoreDataBefore;

    public Optional<String> getIgnoreDataBefore() {
        return this.ignoreDataBefore == null ? Optional.empty() : Optional.ofNullable(this.ignoreDataBefore);
    }

    /**
     * Name of the metric.
     * 
     */
    @InputImport(name="metricName", required=true)
    private final String metricName;

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * Namespace of the metric.
     * 
     */
    @InputImport(name="metricNamespace")
    private final @Nullable String metricNamespace;

    public Optional<String> getMetricNamespace() {
        return this.metricNamespace == null ? Optional.empty() : Optional.ofNullable(this.metricNamespace);
    }

    /**
     * Name of the criteria.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The operator used to compare the metric value against the threshold.
     * 
     */
    @InputImport(name="operator", required=true)
    private final String operator;

    public String getOperator() {
        return this.operator;
    }

    /**
     * Allows creating an alert rule on a custom metric that isn't yet emitted, by causing the metric validation to be skipped.
     * 
     */
    @InputImport(name="skipMetricValidation")
    private final @Nullable Boolean skipMetricValidation;

    public Optional<Boolean> getSkipMetricValidation() {
        return this.skipMetricValidation == null ? Optional.empty() : Optional.ofNullable(this.skipMetricValidation);
    }

    /**
     * the criteria time aggregation types.
     * 
     */
    @InputImport(name="timeAggregation", required=true)
    private final String timeAggregation;

    public String getTimeAggregation() {
        return this.timeAggregation;
    }

    public DynamicMetricCriteriaResponse(
        String alertSensitivity,
        String criterionType,
        @Nullable List<MetricDimensionResponse> dimensions,
        DynamicThresholdFailingPeriodsResponse failingPeriods,
        @Nullable String ignoreDataBefore,
        String metricName,
        @Nullable String metricNamespace,
        String name,
        String operator,
        @Nullable Boolean skipMetricValidation,
        String timeAggregation) {
        this.alertSensitivity = Objects.requireNonNull(alertSensitivity, "expected parameter 'alertSensitivity' to be non-null");
        this.criterionType = Objects.requireNonNull(criterionType, "expected parameter 'criterionType' to be non-null");
        this.dimensions = dimensions;
        this.failingPeriods = Objects.requireNonNull(failingPeriods, "expected parameter 'failingPeriods' to be non-null");
        this.ignoreDataBefore = ignoreDataBefore;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.metricNamespace = metricNamespace;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.skipMetricValidation = skipMetricValidation;
        this.timeAggregation = Objects.requireNonNull(timeAggregation, "expected parameter 'timeAggregation' to be non-null");
    }

    private DynamicMetricCriteriaResponse() {
        this.alertSensitivity = null;
        this.criterionType = null;
        this.dimensions = List.of();
        this.failingPeriods = null;
        this.ignoreDataBefore = null;
        this.metricName = null;
        this.metricNamespace = null;
        this.name = null;
        this.operator = null;
        this.skipMetricValidation = null;
        this.timeAggregation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DynamicMetricCriteriaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alertSensitivity;
        private String criterionType;
        private @Nullable List<MetricDimensionResponse> dimensions;
        private DynamicThresholdFailingPeriodsResponse failingPeriods;
        private @Nullable String ignoreDataBefore;
        private String metricName;
        private @Nullable String metricNamespace;
        private String name;
        private String operator;
        private @Nullable Boolean skipMetricValidation;
        private String timeAggregation;

        public Builder() {
    	      // Empty
        }

        public Builder(DynamicMetricCriteriaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertSensitivity = defaults.alertSensitivity;
    	      this.criterionType = defaults.criterionType;
    	      this.dimensions = defaults.dimensions;
    	      this.failingPeriods = defaults.failingPeriods;
    	      this.ignoreDataBefore = defaults.ignoreDataBefore;
    	      this.metricName = defaults.metricName;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.name = defaults.name;
    	      this.operator = defaults.operator;
    	      this.skipMetricValidation = defaults.skipMetricValidation;
    	      this.timeAggregation = defaults.timeAggregation;
        }

        public Builder setAlertSensitivity(String alertSensitivity) {
            this.alertSensitivity = Objects.requireNonNull(alertSensitivity);
            return this;
        }

        public Builder setCriterionType(String criterionType) {
            this.criterionType = Objects.requireNonNull(criterionType);
            return this;
        }

        public Builder setDimensions(@Nullable List<MetricDimensionResponse> dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setFailingPeriods(DynamicThresholdFailingPeriodsResponse failingPeriods) {
            this.failingPeriods = Objects.requireNonNull(failingPeriods);
            return this;
        }

        public Builder setIgnoreDataBefore(@Nullable String ignoreDataBefore) {
            this.ignoreDataBefore = ignoreDataBefore;
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricNamespace(@Nullable String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setSkipMetricValidation(@Nullable Boolean skipMetricValidation) {
            this.skipMetricValidation = skipMetricValidation;
            return this;
        }

        public Builder setTimeAggregation(String timeAggregation) {
            this.timeAggregation = Objects.requireNonNull(timeAggregation);
            return this;
        }

        public DynamicMetricCriteriaResponse build() {
            return new DynamicMetricCriteriaResponse(alertSensitivity, criterionType, dimensions, failingPeriods, ignoreDataBefore, metricName, metricNamespace, name, operator, skipMetricValidation, timeAggregation);
        }
    }
}
