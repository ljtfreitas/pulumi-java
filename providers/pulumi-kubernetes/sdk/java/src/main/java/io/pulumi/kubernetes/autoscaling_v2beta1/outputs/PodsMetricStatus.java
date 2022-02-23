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
public final class PodsMetricStatus {
    /**
     * currentAverageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    private final String currentAverageValue;
    /**
     * metricName is the name of the metric in question
     * 
     */
    private final String metricName;
    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    private final @Nullable LabelSelector selector;

    @OutputCustomType.Constructor({"currentAverageValue","metricName","selector"})
    private PodsMetricStatus(
        String currentAverageValue,
        String metricName,
        @Nullable LabelSelector selector) {
        this.currentAverageValue = Objects.requireNonNull(currentAverageValue);
        this.metricName = Objects.requireNonNull(metricName);
        this.selector = selector;
    }

    /**
     * currentAverageValue is the current value of the average of the metric across all relevant pods (as a quantity)
     * 
     */
    public String getCurrentAverageValue() {
        return this.currentAverageValue;
    }
    /**
     * metricName is the name of the metric in question
     * 
     */
    public String getMetricName() {
        return this.metricName;
    }
    /**
     * selector is the string-encoded form of a standard kubernetes label selector for the given metric When set in the PodsMetricSource, it is passed as an additional parameter to the metrics server for more specific metrics scoping. When unset, just the metricName will be used to gather metrics.
     * 
     */
    public Optional<LabelSelector> getSelector() {
        return Optional.ofNullable(this.selector);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodsMetricStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String currentAverageValue;
        private String metricName;
        private @Nullable LabelSelector selector;

        public Builder() {
    	      // Empty
        }

        public Builder(PodsMetricStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentAverageValue = defaults.currentAverageValue;
    	      this.metricName = defaults.metricName;
    	      this.selector = defaults.selector;
        }

        public Builder setCurrentAverageValue(String currentAverageValue) {
            this.currentAverageValue = Objects.requireNonNull(currentAverageValue);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setSelector(@Nullable LabelSelector selector) {
            this.selector = selector;
            return this;
        }
        public PodsMetricStatus build() {
            return new PodsMetricStatus(currentAverageValue, metricName, selector);
        }
    }
}
