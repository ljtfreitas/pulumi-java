// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.autoscaling_v2beta1.outputs.CrossVersionObjectReference;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObjectMetricStatus {
    /**
     * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    private final @Nullable String averageValue;
    /**
     * currentValue is the current value of the metric (as a quantity).
     * 
     */
    private final String currentValue;
    /**
     * metricName is the name of the metric in question.
     * 
     */
    private final String metricName;
    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    private final @Nullable LabelSelector selector;
    /**
     * target is the described Kubernetes object.
     * 
     */
    private final CrossVersionObjectReference target;

    @CustomType.Constructor
    private ObjectMetricStatus(
        @CustomType.Parameter("averageValue") @Nullable String averageValue,
        @CustomType.Parameter("currentValue") String currentValue,
        @CustomType.Parameter("metricName") String metricName,
        @CustomType.Parameter("selector") @Nullable LabelSelector selector,
        @CustomType.Parameter("target") CrossVersionObjectReference target) {
        this.averageValue = averageValue;
        this.currentValue = currentValue;
        this.metricName = metricName;
        this.selector = selector;
        this.target = target;
    }

    /**
     * averageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
    */
    public Optional<String> getAverageValue() {
        return Optional.ofNullable(this.averageValue);
    }
    /**
     * currentValue is the current value of the metric (as a quantity).
     * 
    */
    public String getCurrentValue() {
        return this.currentValue;
    }
    /**
     * metricName is the name of the metric in question.
     * 
    */
    public String getMetricName() {
        return this.metricName;
    }
    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the ObjectMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
    */
    public Optional<LabelSelector> getSelector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * target is the described Kubernetes object.
     * 
    */
    public CrossVersionObjectReference getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMetricStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String averageValue;
        private String currentValue;
        private String metricName;
        private @Nullable LabelSelector selector;
        private CrossVersionObjectReference target;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectMetricStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.averageValue = defaults.averageValue;
    	      this.currentValue = defaults.currentValue;
    	      this.metricName = defaults.metricName;
    	      this.selector = defaults.selector;
    	      this.target = defaults.target;
        }

        public Builder averageValue(@Nullable String averageValue) {
            this.averageValue = averageValue;
            return this;
        }

        public Builder currentValue(String currentValue) {
            this.currentValue = Objects.requireNonNull(currentValue);
            return this;
        }

        public Builder metricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder selector(@Nullable LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        public Builder target(CrossVersionObjectReference target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public ObjectMetricStatus build() {
            return new ObjectMetricStatus(averageValue, currentValue, metricName, selector, target);
        }
    }
}
