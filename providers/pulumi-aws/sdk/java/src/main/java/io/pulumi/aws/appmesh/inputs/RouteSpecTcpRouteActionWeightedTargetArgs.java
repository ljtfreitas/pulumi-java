// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RouteSpecTcpRouteActionWeightedTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecTcpRouteActionWeightedTargetArgs Empty = new RouteSpecTcpRouteActionWeightedTargetArgs();

    /**
     * The virtual node to associate with the weighted target. Must be between 1 and 255 characters in length.
     * 
     */
    @InputImport(name="virtualNode", required=true)
    private final Input<String> virtualNode;

    public Input<String> getVirtualNode() {
        return this.virtualNode;
    }

    /**
     * The relative weight of the weighted target. An integer between 0 and 100.
     * 
     */
    @InputImport(name="weight", required=true)
    private final Input<Integer> weight;

    public Input<Integer> getWeight() {
        return this.weight;
    }

    public RouteSpecTcpRouteActionWeightedTargetArgs(
        Input<String> virtualNode,
        Input<Integer> weight) {
        this.virtualNode = Objects.requireNonNull(virtualNode, "expected parameter 'virtualNode' to be non-null");
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
    }

    private RouteSpecTcpRouteActionWeightedTargetArgs() {
        this.virtualNode = Input.empty();
        this.weight = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecTcpRouteActionWeightedTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> virtualNode;
        private Input<Integer> weight;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecTcpRouteActionWeightedTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualNode = defaults.virtualNode;
    	      this.weight = defaults.weight;
        }

        public Builder setVirtualNode(Input<String> virtualNode) {
            this.virtualNode = Objects.requireNonNull(virtualNode);
            return this;
        }

        public Builder setVirtualNode(String virtualNode) {
            this.virtualNode = Input.of(Objects.requireNonNull(virtualNode));
            return this;
        }

        public Builder setWeight(Input<Integer> weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }

        public Builder setWeight(Integer weight) {
            this.weight = Input.of(Objects.requireNonNull(weight));
            return this;
        }
        public RouteSpecTcpRouteActionWeightedTargetArgs build() {
            return new RouteSpecTcpRouteActionWeightedTargetArgs(virtualNode, weight);
        }
    }
}
