// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.autoscaling_v2beta2.outputs.MetricIdentifier;
import io.pulumi.kubernetes.autoscaling_v2beta2.outputs.MetricValueStatus;
import java.util.Objects;

@CustomType
public final class ExternalMetricStatus {
    /**
     * current contains the current value for the given metric
     * 
     */
    private final MetricValueStatus current;
    /**
     * metric identifies the target metric by name and selector
     * 
     */
    private final MetricIdentifier metric;

    @CustomType.Constructor
    private ExternalMetricStatus(
        @CustomType.Parameter("current") MetricValueStatus current,
        @CustomType.Parameter("metric") MetricIdentifier metric) {
        this.current = current;
        this.metric = metric;
    }

    /**
     * current contains the current value for the given metric
     * 
    */
    public MetricValueStatus getCurrent() {
        return this.current;
    }
    /**
     * metric identifies the target metric by name and selector
     * 
    */
    public MetricIdentifier getMetric() {
        return this.metric;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalMetricStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetricValueStatus current;
        private MetricIdentifier metric;

        public Builder() {
    	      // Empty
        }

        public Builder(ExternalMetricStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.current = defaults.current;
    	      this.metric = defaults.metric;
        }

        public Builder current(MetricValueStatus current) {
            this.current = Objects.requireNonNull(current);
            return this;
        }

        public Builder metric(MetricIdentifier metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }
        public ExternalMetricStatus build() {
            return new ExternalMetricStatus(current, metric);
        }
    }
}
