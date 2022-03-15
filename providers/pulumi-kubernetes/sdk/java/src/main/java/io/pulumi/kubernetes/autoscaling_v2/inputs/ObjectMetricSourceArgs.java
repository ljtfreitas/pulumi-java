// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.autoscaling_v2.inputs.CrossVersionObjectReferenceArgs;
import io.pulumi.kubernetes.autoscaling_v2.inputs.MetricIdentifierArgs;
import io.pulumi.kubernetes.autoscaling_v2.inputs.MetricTargetArgs;
import java.util.Objects;


/**
 * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 * 
 */
public final class ObjectMetricSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectMetricSourceArgs Empty = new ObjectMetricSourceArgs();

    /**
     * describedObject specifies the descriptions of a object,such as kind,name apiVersion
     * 
     */
    @Import(name="describedObject", required=true)
      private final Output<CrossVersionObjectReferenceArgs> describedObject;

    public Output<CrossVersionObjectReferenceArgs> getDescribedObject() {
        return this.describedObject;
    }

    /**
     * metric identifies the target metric by name and selector
     * 
     */
    @Import(name="metric", required=true)
      private final Output<MetricIdentifierArgs> metric;

    public Output<MetricIdentifierArgs> getMetric() {
        return this.metric;
    }

    /**
     * target specifies the target value for the given metric
     * 
     */
    @Import(name="target", required=true)
      private final Output<MetricTargetArgs> target;

    public Output<MetricTargetArgs> getTarget() {
        return this.target;
    }

    public ObjectMetricSourceArgs(
        Output<CrossVersionObjectReferenceArgs> describedObject,
        Output<MetricIdentifierArgs> metric,
        Output<MetricTargetArgs> target) {
        this.describedObject = Objects.requireNonNull(describedObject, "expected parameter 'describedObject' to be non-null");
        this.metric = Objects.requireNonNull(metric, "expected parameter 'metric' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private ObjectMetricSourceArgs() {
        this.describedObject = Output.empty();
        this.metric = Output.empty();
        this.target = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<CrossVersionObjectReferenceArgs> describedObject;
        private Output<MetricIdentifierArgs> metric;
        private Output<MetricTargetArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectMetricSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.describedObject = defaults.describedObject;
    	      this.metric = defaults.metric;
    	      this.target = defaults.target;
        }

        public Builder describedObject(Output<CrossVersionObjectReferenceArgs> describedObject) {
            this.describedObject = Objects.requireNonNull(describedObject);
            return this;
        }

        public Builder describedObject(CrossVersionObjectReferenceArgs describedObject) {
            this.describedObject = Output.of(Objects.requireNonNull(describedObject));
            return this;
        }

        public Builder metric(Output<MetricIdentifierArgs> metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder metric(MetricIdentifierArgs metric) {
            this.metric = Output.of(Objects.requireNonNull(metric));
            return this;
        }

        public Builder target(Output<MetricTargetArgs> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder target(MetricTargetArgs target) {
            this.target = Output.of(Objects.requireNonNull(target));
            return this;
        }
        public ObjectMetricSourceArgs build() {
            return new ObjectMetricSourceArgs(describedObject, metric, target);
        }
    }
}
