// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.meta_v1.outputs.LabelSelector;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PodsMetricSource {
    /**
     * metricName is the name of the metric in question
     * 
     */
    private final String metricName;
    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     * 
     */
    private final @Nullable LabelSelector selector;
    /**
     * targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    private final String targetAverageValue;

    @OutputCustomType.Constructor({"metricName","selector","targetAverageValue"})
    private PodsMetricSource(
        String metricName,
        @Nullable LabelSelector selector,
        String targetAverageValue) {
        this.metricName = Objects.requireNonNull(metricName);
        this.selector = selector;
        this.targetAverageValue = Objects.requireNonNull(targetAverageValue);
    }

    /**
     * metricName is the name of the metric in question
     * 
     */
    public String getMetricName() {
        return this.metricName;
    }
    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set, it is passed as an additional parameter to the metrics server for more specific metrics scoping When unset, just the metricName will be used to gather metrics.
     * 
     */
    public Optional<LabelSelector> getSelector() {
        return Optional.ofNullable(this.selector);
    }
    /**
     * targetAverageValue is the target value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    public String getTargetAverageValue() {
        return this.targetAverageValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodsMetricSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metricName;
        private @Nullable LabelSelector selector;
        private String targetAverageValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PodsMetricSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricName = defaults.metricName;
    	      this.selector = defaults.selector;
    	      this.targetAverageValue = defaults.targetAverageValue;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setSelector(@Nullable LabelSelector selector) {
            this.selector = selector;
            return this;
        }

        public Builder setTargetAverageValue(String targetAverageValue) {
            this.targetAverageValue = Objects.requireNonNull(targetAverageValue);
            return this;
        }
        public PodsMetricSource build() {
            return new PodsMetricSource(metricName, selector, targetAverageValue);
        }
    }
}
