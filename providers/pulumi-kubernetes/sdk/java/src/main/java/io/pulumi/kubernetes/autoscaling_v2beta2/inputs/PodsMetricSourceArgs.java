// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricIdentifierArgs;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricTargetArgs;
import java.util.Objects;


/**
 * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
 * 
 */
public final class PodsMetricSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodsMetricSourceArgs Empty = new PodsMetricSourceArgs();

    /**
     * metric identifies the target metric by name and selector
     * 
     */
    @InputImport(name="metric", required=true)
        private final Input<MetricIdentifierArgs> metric;

    public Input<MetricIdentifierArgs> getMetric() {
        return this.metric;
    }

    /**
     * target specifies the target value for the given metric
     * 
     */
    @InputImport(name="target", required=true)
        private final Input<MetricTargetArgs> target;

    public Input<MetricTargetArgs> getTarget() {
        return this.target;
    }

    public PodsMetricSourceArgs(
        Input<MetricIdentifierArgs> metric,
        Input<MetricTargetArgs> target) {
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private PodsMetricSourceArgs() {
        this.metric = Input.empty();
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodsMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<MetricIdentifierArgs> metric;
        private Input<MetricTargetArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(PodsMetricSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.target = defaults.target;
        }

        public Builder setMetric(Input<MetricIdentifierArgs> metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder setMetric(MetricIdentifierArgs metric) {
            this.metric = Input.of(Objects.requireNonNull(metric));
            return this;
        }

        public Builder setTarget(Input<MetricTargetArgs> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setTarget(MetricTargetArgs target) {
            this.target = Input.of(Objects.requireNonNull(target));
            return this;
        }
        public PodsMetricSourceArgs build() {
            return new PodsMetricSourceArgs(metric, target);
        }
    }
}
