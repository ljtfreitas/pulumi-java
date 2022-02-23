// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.NodeGroupAutoscalingPolicyMode;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupAutoscalingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupAutoscalingPolicyArgs Empty = new NodeGroupAutoscalingPolicyArgs();

    /**
     * The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100.
     * 
     */
    @InputImport(name="maxNodes")
      private final @Nullable Input<Integer> maxNodes;

    public Input<Integer> getMaxNodes() {
        return this.maxNodes == null ? Input.empty() : this.maxNodes;
    }

    /**
     * The minimum number of nodes that the group should have.
     * 
     */
    @InputImport(name="minNodes")
      private final @Nullable Input<Integer> minNodes;

    public Input<Integer> getMinNodes() {
        return this.minNodes == null ? Input.empty() : this.minNodes;
    }

    /**
     * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<NodeGroupAutoscalingPolicyMode> mode;

    public Input<NodeGroupAutoscalingPolicyMode> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    public NodeGroupAutoscalingPolicyArgs(
        @Nullable Input<Integer> maxNodes,
        @Nullable Input<Integer> minNodes,
        @Nullable Input<NodeGroupAutoscalingPolicyMode> mode) {
        this.maxNodes = maxNodes;
        this.minNodes = minNodes;
        this.mode = mode;
    }

    private NodeGroupAutoscalingPolicyArgs() {
        this.maxNodes = Input.empty();
        this.minNodes = Input.empty();
        this.mode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupAutoscalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> maxNodes;
        private @Nullable Input<Integer> minNodes;
        private @Nullable Input<NodeGroupAutoscalingPolicyMode> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupAutoscalingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodes = defaults.maxNodes;
    	      this.minNodes = defaults.minNodes;
    	      this.mode = defaults.mode;
        }

        public Builder setMaxNodes(@Nullable Input<Integer> maxNodes) {
            this.maxNodes = maxNodes;
            return this;
        }

        public Builder setMaxNodes(@Nullable Integer maxNodes) {
            this.maxNodes = Input.ofNullable(maxNodes);
            return this;
        }

        public Builder setMinNodes(@Nullable Input<Integer> minNodes) {
            this.minNodes = minNodes;
            return this;
        }

        public Builder setMinNodes(@Nullable Integer minNodes) {
            this.minNodes = Input.ofNullable(minNodes);
            return this;
        }

        public Builder setMode(@Nullable Input<NodeGroupAutoscalingPolicyMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable NodeGroupAutoscalingPolicyMode mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }
        public NodeGroupAutoscalingPolicyArgs build() {
            return new NodeGroupAutoscalingPolicyArgs(maxNodes, minNodes, mode);
        }
    }
}
