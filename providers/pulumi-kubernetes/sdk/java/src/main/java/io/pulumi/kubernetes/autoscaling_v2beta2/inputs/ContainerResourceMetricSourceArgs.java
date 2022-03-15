// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.MetricTargetArgs;
import java.lang.String;
import java.util.Objects;


/**
 * ContainerResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
 * 
 */
public final class ContainerResourceMetricSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerResourceMetricSourceArgs Empty = new ContainerResourceMetricSourceArgs();

    /**
     * container is the name of the container in the pods of the scaling target
     * 
     */
    @Import(name="container", required=true)
      private final Output<String> container;

    public Output<String> getContainer() {
        return this.container;
    }

    /**
     * name is the name of the resource in question.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
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

    public ContainerResourceMetricSourceArgs(
        Output<String> container,
        Output<String> name,
        Output<MetricTargetArgs> target) {
        this.container = Objects.requireNonNull(container, "expected parameter 'container' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private ContainerResourceMetricSourceArgs() {
        this.container = Output.empty();
        this.name = Output.empty();
        this.target = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceMetricSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> container;
        private Output<String> name;
        private Output<MetricTargetArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourceMetricSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.name = defaults.name;
    	      this.target = defaults.target;
        }

        public Builder container(Output<String> container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder container(String container) {
            this.container = Output.of(Objects.requireNonNull(container));
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
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
        public ContainerResourceMetricSourceArgs build() {
            return new ContainerResourceMetricSourceArgs(container, name, target);
        }
    }
}
