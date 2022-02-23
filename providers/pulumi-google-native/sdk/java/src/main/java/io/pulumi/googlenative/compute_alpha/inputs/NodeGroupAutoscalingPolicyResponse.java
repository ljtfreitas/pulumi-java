// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class NodeGroupAutoscalingPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final NodeGroupAutoscalingPolicyResponse Empty = new NodeGroupAutoscalingPolicyResponse();

    /**
     * The maximum number of nodes that the group should have. Must be set if autoscaling is enabled. Maximum value allowed is 100.
     * 
     */
    @InputImport(name="maxNodes", required=true)
      private final Integer maxNodes;

    public Integer getMaxNodes() {
        return this.maxNodes;
    }

    /**
     * The minimum number of nodes that the group should have.
     * 
     */
    @InputImport(name="minNodes", required=true)
      private final Integer minNodes;

    public Integer getMinNodes() {
        return this.minNodes;
    }

    /**
     * The autoscaling mode. Set to one of: ON, OFF, or ONLY_SCALE_OUT. For more information, see Autoscaler modes.
     * 
     */
    @InputImport(name="mode", required=true)
      private final String mode;

    public String getMode() {
        return this.mode;
    }

    public NodeGroupAutoscalingPolicyResponse(
        Integer maxNodes,
        Integer minNodes,
        String mode) {
        this.maxNodes = Objects.requireNonNull(maxNodes, "expected parameter 'maxNodes' to be non-null");
        this.minNodes = Objects.requireNonNull(minNodes, "expected parameter 'minNodes' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
    }

    private NodeGroupAutoscalingPolicyResponse() {
        this.maxNodes = null;
        this.minNodes = null;
        this.mode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupAutoscalingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxNodes;
        private Integer minNodes;
        private String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupAutoscalingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodes = defaults.maxNodes;
    	      this.minNodes = defaults.minNodes;
    	      this.mode = defaults.mode;
        }

        public Builder setMaxNodes(Integer maxNodes) {
            this.maxNodes = Objects.requireNonNull(maxNodes);
            return this;
        }

        public Builder setMinNodes(Integer minNodes) {
            this.minNodes = Objects.requireNonNull(minNodes);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public NodeGroupAutoscalingPolicyResponse build() {
            return new NodeGroupAutoscalingPolicyResponse(maxNodes, minNodes, mode);
        }
    }
}
