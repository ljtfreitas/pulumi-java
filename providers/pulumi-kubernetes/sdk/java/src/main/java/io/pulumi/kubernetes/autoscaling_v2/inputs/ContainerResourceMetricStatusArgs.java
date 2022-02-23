// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2.inputs.MetricValueStatusArgs;
import java.lang.String;
import java.util.Objects;


/**
 * ContainerResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing a single container in each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
 * 
 */
public final class ContainerResourceMetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerResourceMetricStatusArgs Empty = new ContainerResourceMetricStatusArgs();

    /**
     * Container is the name of the container in the pods of the scaling target
     * 
     */
    @InputImport(name="container", required=true)
        private final Input<String> container;

    public Input<String> getContainer() {
        return this.container;
    }

    /**
     * current contains the current value for the given metric
     * 
     */
    @InputImport(name="current", required=true)
        private final Input<MetricValueStatusArgs> current;

    public Input<MetricValueStatusArgs> getCurrent() {
        return this.current;
    }

    /**
     * Name is the name of the resource in question.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public ContainerResourceMetricStatusArgs(
        Input<String> container,
        Input<MetricValueStatusArgs> current,
        Input<String> name) {
        this.container = Objects.requireNonNull(container, "expected parameter 'container' to be non-null");
        this.current = Objects.requireNonNull(current, "expected parameter 'current' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ContainerResourceMetricStatusArgs() {
        this.container = Input.empty();
        this.current = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> container;
        private Input<MetricValueStatusArgs> current;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourceMetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.container = defaults.container;
    	      this.current = defaults.current;
    	      this.name = defaults.name;
        }

        public Builder setContainer(Input<String> container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder setContainer(String container) {
            this.container = Input.of(Objects.requireNonNull(container));
            return this;
        }

        public Builder setCurrent(Input<MetricValueStatusArgs> current) {
            this.current = Objects.requireNonNull(current);
            return this;
        }

        public Builder setCurrent(MetricValueStatusArgs current) {
            this.current = Input.of(Objects.requireNonNull(current));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public ContainerResourceMetricStatusArgs build() {
            return new ContainerResourceMetricStatusArgs(container, current, name);
        }
    }
}
