// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
 * 
 */
public final class ResourceMetricStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceMetricStatusArgs Empty = new ResourceMetricStatusArgs();

    /**
     * currentAverageUtilization is the current value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.  It will only be present if `targetAverageValue` was set in the corresponding metric specification.
     * 
     */
    @Import(name="currentAverageUtilization")
      private final @Nullable Output<Integer> currentAverageUtilization;

    public Output<Integer> getCurrentAverageUtilization() {
        return this.currentAverageUtilization == null ? Output.empty() : this.currentAverageUtilization;
    }

    /**
     * currentAverageValue is the current value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the "pods" metric source type. It will always be set, regardless of the corresponding metric specification.
     * 
     */
    @Import(name="currentAverageValue", required=true)
      private final Output<String> currentAverageValue;

    public Output<String> getCurrentAverageValue() {
        return this.currentAverageValue;
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

    public ResourceMetricStatusArgs(
        @Nullable Output<Integer> currentAverageUtilization,
        Output<String> currentAverageValue,
        Output<String> name) {
        this.currentAverageUtilization = currentAverageUtilization;
        this.currentAverageValue = Objects.requireNonNull(currentAverageValue, "expected parameter 'currentAverageValue' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ResourceMetricStatusArgs() {
        this.currentAverageUtilization = Output.empty();
        this.currentAverageValue = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceMetricStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> currentAverageUtilization;
        private Output<String> currentAverageValue;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceMetricStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentAverageUtilization = defaults.currentAverageUtilization;
    	      this.currentAverageValue = defaults.currentAverageValue;
    	      this.name = defaults.name;
        }

        public Builder currentAverageUtilization(@Nullable Output<Integer> currentAverageUtilization) {
            this.currentAverageUtilization = currentAverageUtilization;
            return this;
        }

        public Builder currentAverageUtilization(@Nullable Integer currentAverageUtilization) {
            this.currentAverageUtilization = Output.ofNullable(currentAverageUtilization);
            return this;
        }

        public Builder currentAverageValue(Output<String> currentAverageValue) {
            this.currentAverageValue = Objects.requireNonNull(currentAverageValue);
            return this;
        }

        public Builder currentAverageValue(String currentAverageValue) {
            this.currentAverageValue = Output.of(Objects.requireNonNull(currentAverageValue));
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
        public ResourceMetricStatusArgs build() {
            return new ResourceMetricStatusArgs(currentAverageUtilization, currentAverageValue, name);
        }
    }
}
