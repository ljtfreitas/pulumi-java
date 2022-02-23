// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NodeGroupAutoscalingPolicy {
    /**
     * Maximum size of the node group. Set to a value less than or equal
     * to 100 and greater than or equal to min-nodes.
     * 
     */
    private final @Nullable Integer maxNodes;
    /**
     * Minimum size of the node group. Must be less
     * than or equal to max-nodes. The default value is 0.
     * 
     */
    private final @Nullable Integer minNodes;
    /**
     * The autoscaling mode. Set to one of the following:
     * - OFF: Disables the autoscaler.
     * - ON: Enables scaling in and scaling out.
     * - ONLY_SCALE_OUT: Enables only scaling out.
     *   You must use this mode if your node groups are configured to
     *   restart their hosted VMs on minimal servers.
     *   Possible values are `OFF`, `ON`, and `ONLY_SCALE_OUT`.
     * 
     */
    private final @Nullable String mode;

    @OutputCustomType.Constructor({"maxNodes","minNodes","mode"})
    private NodeGroupAutoscalingPolicy(
        @Nullable Integer maxNodes,
        @Nullable Integer minNodes,
        @Nullable String mode) {
        this.maxNodes = maxNodes;
        this.minNodes = minNodes;
        this.mode = mode;
    }

    /**
     * Maximum size of the node group. Set to a value less than or equal
     * to 100 and greater than or equal to min-nodes.
     * 
     */
    public Optional<Integer> getMaxNodes() {
        return Optional.ofNullable(this.maxNodes);
    }
    /**
     * Minimum size of the node group. Must be less
     * than or equal to max-nodes. The default value is 0.
     * 
     */
    public Optional<Integer> getMinNodes() {
        return Optional.ofNullable(this.minNodes);
    }
    /**
     * The autoscaling mode. Set to one of the following:
     * - OFF: Disables the autoscaler.
     * - ON: Enables scaling in and scaling out.
     * - ONLY_SCALE_OUT: Enables only scaling out.
     *   You must use this mode if your node groups are configured to
     *   restart their hosted VMs on minimal servers.
     *   Possible values are `OFF`, `ON`, and `ONLY_SCALE_OUT`.
     * 
     */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupAutoscalingPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxNodes;
        private @Nullable Integer minNodes;
        private @Nullable String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupAutoscalingPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodes = defaults.maxNodes;
    	      this.minNodes = defaults.minNodes;
    	      this.mode = defaults.mode;
        }

        public Builder setMaxNodes(@Nullable Integer maxNodes) {
            this.maxNodes = maxNodes;
            return this;
        }

        public Builder setMinNodes(@Nullable Integer minNodes) {
            this.minNodes = minNodes;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public NodeGroupAutoscalingPolicy build() {
            return new NodeGroupAutoscalingPolicy(maxNodes, minNodes, mode);
        }
    }
}
