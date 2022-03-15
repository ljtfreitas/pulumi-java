// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RouteSpecGrpcRouteActionWeightedTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecGrpcRouteActionWeightedTargetGetArgs Empty = new RouteSpecGrpcRouteActionWeightedTargetGetArgs();

    /**
     * The virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="virtualNode", required=true)
      private final Output<String> virtualNode;

    public Output<String> getVirtualNode() {
        return this.virtualNode;
    }

    /**
     * The relative weight of the weighted target. An integer between 0 and 100.
     * 
     */
    @Import(name="weight", required=true)
      private final Output<Integer> weight;

    public Output<Integer> getWeight() {
        return this.weight;
    }

    public RouteSpecGrpcRouteActionWeightedTargetGetArgs(
        Output<String> virtualNode,
        Output<Integer> weight) {
        this.virtualNode = Objects.requireNonNull(virtualNode, "expected parameter 'virtualNode' to be non-null");
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
    }

    private RouteSpecGrpcRouteActionWeightedTargetGetArgs() {
        this.virtualNode = Output.empty();
        this.weight = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteActionWeightedTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> virtualNode;
        private Output<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGrpcRouteActionWeightedTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualNode = defaults.virtualNode;
    	      this.weight = defaults.weight;
        }

        public Builder virtualNode(Output<String> virtualNode) {
            this.virtualNode = Objects.requireNonNull(virtualNode);
            return this;
        }

        public Builder virtualNode(String virtualNode) {
            this.virtualNode = Output.of(Objects.requireNonNull(virtualNode));
            return this;
        }

        public Builder weight(Output<Integer> weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public Builder weight(Integer weight) {
            this.weight = Output.of(Objects.requireNonNull(weight));
            return this;
        }
        public RouteSpecGrpcRouteActionWeightedTargetGetArgs build() {
            return new RouteSpecGrpcRouteActionWeightedTargetGetArgs(virtualNode, weight);
        }
    }
}
