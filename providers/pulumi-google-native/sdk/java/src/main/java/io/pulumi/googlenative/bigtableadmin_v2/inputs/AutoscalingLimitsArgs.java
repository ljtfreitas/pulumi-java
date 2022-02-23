// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Limits for the number of nodes a Cluster can autoscale up/down to.
 * 
 */
public final class AutoscalingLimitsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingLimitsArgs Empty = new AutoscalingLimitsArgs();

    /**
     * Maximum number of nodes to scale up to.
     * 
     */
    @InputImport(name="maxServeNodes", required=true)
      private final Input<Integer> maxServeNodes;

    public Input<Integer> getMaxServeNodes() {
        return this.maxServeNodes;
    }

    /**
     * Minimum number of nodes to scale down to.
     * 
     */
    @InputImport(name="minServeNodes", required=true)
      private final Input<Integer> minServeNodes;

    public Input<Integer> getMinServeNodes() {
        return this.minServeNodes;
    }

    public AutoscalingLimitsArgs(
        Input<Integer> maxServeNodes,
        Input<Integer> minServeNodes) {
        this.maxServeNodes = Objects.requireNonNull(maxServeNodes, "expected parameter 'maxServeNodes' to be non-null");
        this.minServeNodes = Objects.requireNonNull(minServeNodes, "expected parameter 'minServeNodes' to be non-null");
    }

    private AutoscalingLimitsArgs() {
        this.maxServeNodes = Input.empty();
        this.minServeNodes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxServeNodes;
        private Input<Integer> minServeNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingLimitsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxServeNodes = defaults.maxServeNodes;
    	      this.minServeNodes = defaults.minServeNodes;
        }

        public Builder setMaxServeNodes(Input<Integer> maxServeNodes) {
            this.maxServeNodes = Objects.requireNonNull(maxServeNodes);
            return this;
        }

        public Builder setMaxServeNodes(Integer maxServeNodes) {
            this.maxServeNodes = Input.of(Objects.requireNonNull(maxServeNodes));
            return this;
        }

        public Builder setMinServeNodes(Input<Integer> minServeNodes) {
            this.minServeNodes = Objects.requireNonNull(minServeNodes);
            return this;
        }

        public Builder setMinServeNodes(Integer minServeNodes) {
            this.minServeNodes = Input.of(Objects.requireNonNull(minServeNodes));
            return this;
        }
        public AutoscalingLimitsArgs build() {
            return new AutoscalingLimitsArgs(maxServeNodes, minServeNodes);
        }
    }
}
