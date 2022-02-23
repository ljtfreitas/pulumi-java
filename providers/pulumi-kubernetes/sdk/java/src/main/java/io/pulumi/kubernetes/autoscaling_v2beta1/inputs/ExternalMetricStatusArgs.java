// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.meta_v1.inputs.LabelSelectorArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
 * 
 */
public final class ExternalMetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExternalMetricStatusArgs Empty = new ExternalMetricStatusArgs();

    /**
     * currentAverageValue is the current value of metric averaged over autoscaled pods.
     * 
     */
    @InputImport(name="currentAverageValue")
        private final @Nullable Input<String> currentAverageValue;

    public Input<String> getCurrentAverageValue() {
        return this.currentAverageValue == null ? Input.empty() : this.currentAverageValue;
    }

    /**
     * currentValue is the current value of the metric (as a quantity)
     * 
     */
    @InputImport(name="currentValue", required=true)
        private final Input<String> currentValue;

    public Input<String> getCurrentValue() {
        return this.currentValue;
    }

    /**
     * metricName is the name of a metric used for autoscaling in metric system.
     * 
     */
    @InputImport(name="metricName", required=true)
        private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    /**
     * metricSelector is used to identify a specific time series within a given metric.
     * 
     */
    @InputImport(name="metricSelector")
        private final @Nullable Input<LabelSelectorArgs> metricSelector;

    public Input<LabelSelectorArgs> getMetricSelector() {
        return this.metricSelector == null ? Input.empty() : this.metricSelector;
    }

    public ExternalMetricStatusArgs(
        @Nullable Input<String> currentAverageValue,
        Input<String> currentValue,
        Input<String> metricName,
        @Nullable Input<LabelSelectorArgs> metricSelector) {
        this.currentAverageValue = currentAverageValue;
        this.currentValue = Objects.requireNonNull(currentValue, "expected parameter 'currentValue' to be non-null");
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.metricSelector = metricSelector;
    }

    private ExternalMetricStatusArgs() {
        this.currentAverageValue = Input.empty();
        this.currentValue = Input.empty();
        this.metricName = Input.empty();
        this.metricSelector = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> currentAverageValue;
        private Input<String> currentValue;
        private Input<String> metricName;
        private @Nullable Input<LabelSelectorArgs> metricSelector;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalMetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentAverageValue = defaults.currentAverageValue;
    	      this.currentValue = defaults.currentValue;
    	      this.metricName = defaults.metricName;
    	      this.metricSelector = defaults.metricSelector;
        }

        public Builder setCurrentAverageValue(@Nullable Input<String> currentAverageValue) {
            this.currentAverageValue = currentAverageValue;
            return this;
        }

        public Builder setCurrentAverageValue(@Nullable String currentAverageValue) {
            this.currentAverageValue = Input.ofNullable(currentAverageValue);
            return this;
        }

        public Builder setCurrentValue(Input<String> currentValue) {
            this.currentValue = Objects.requireNonNull(currentValue);
            return this;
        }

        public Builder setCurrentValue(String currentValue) {
            this.currentValue = Input.of(Objects.requireNonNull(currentValue));
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

        public Builder setMetricSelector(@Nullable Input<LabelSelectorArgs> metricSelector) {
            this.metricSelector = metricSelector;
            return this;
        }

        public Builder setMetricSelector(@Nullable LabelSelectorArgs metricSelector) {
            this.metricSelector = Input.ofNullable(metricSelector);
            return this;
        }
        public ExternalMetricStatusArgs build() {
            return new ExternalMetricStatusArgs(currentAverageValue, currentValue, metricName, metricSelector);
        }
    }
}
