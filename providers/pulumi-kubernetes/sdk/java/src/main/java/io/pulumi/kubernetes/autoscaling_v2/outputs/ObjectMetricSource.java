// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.autoscaling_v2.outputs.CrossVersionObjectReference;
import io.pulumi.kubernetes.autoscaling_v2.outputs.MetricIdentifier;
import io.pulumi.kubernetes.autoscaling_v2.outputs.MetricTarget;
import java.util.Objects;

@CustomType
public final class ObjectMetricSource {
    /**
     * describedObject specifies the descriptions of a object,such as kind,name apiVersion
     * 
     */
    private final CrossVersionObjectReference describedObject;
    /**
     * metric identifies the target metric by name and selector
     * 
     */
    private final MetricIdentifier metric;
    /**
     * target specifies the target value for the given metric
     * 
     */
    private final MetricTarget target;

    @CustomType.Constructor
    private ObjectMetricSource(
        @CustomType.Parameter("describedObject") CrossVersionObjectReference describedObject,
        @CustomType.Parameter("metric") MetricIdentifier metric,
        @CustomType.Parameter("target") MetricTarget target) {
        this.describedObject = describedObject;
        this.metric = metric;
        this.target = target;
    }

    /**
     * describedObject specifies the descriptions of a object,such as kind,name apiVersion
     * 
    */
    public CrossVersionObjectReference getDescribedObject() {
        return this.describedObject;
    }
    /**
     * metric identifies the target metric by name and selector
     * 
    */
    public MetricIdentifier getMetric() {
        return this.metric;
    }
    /**
     * target specifies the target value for the given metric
     * 
    */
    public MetricTarget getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectMetricSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CrossVersionObjectReference describedObject;
        private MetricIdentifier metric;
        private MetricTarget target;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectMetricSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.describedObject = defaults.describedObject;
    	      this.metric = defaults.metric;
    	      this.target = defaults.target;
        }

        public Builder describedObject(CrossVersionObjectReference describedObject) {
            this.describedObject = Objects.requireNonNull(describedObject);
            return this;
        }

        public Builder metric(MetricIdentifier metric) {
            this.metric = Objects.requireNonNull(metric);
            return this;
        }

        public Builder target(MetricTarget target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public ObjectMetricSource build() {
            return new ObjectMetricSource(describedObject, metric, target);
        }
    }
}
