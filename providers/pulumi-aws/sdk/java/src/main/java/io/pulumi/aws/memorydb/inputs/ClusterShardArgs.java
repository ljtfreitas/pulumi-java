// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb.inputs;

import io.pulumi.aws.memorydb.inputs.ClusterShardNodeArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterShardArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterShardArgs Empty = new ClusterShardArgs();

    /**
     * Name of this node.
     * * `endpoint`
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Set of nodes in this shard.
     * 
     */
    @InputImport(name="nodes")
    private final @Nullable Input<List<ClusterShardNodeArgs>> nodes;

    public Input<List<ClusterShardNodeArgs>> getNodes() {
        return this.nodes == null ? Input.empty() : this.nodes;
    }

    /**
     * Number of individual nodes in this shard.
     * 
     */
    @InputImport(name="numNodes")
    private final @Nullable Input<Integer> numNodes;

    public Input<Integer> getNumNodes() {
        return this.numNodes == null ? Input.empty() : this.numNodes;
    }

    /**
     * Keyspace for this shard. Example: `0-16383`.
     * 
     */
    @InputImport(name="slots")
    private final @Nullable Input<String> slots;

    public Input<String> getSlots() {
        return this.slots == null ? Input.empty() : this.slots;
    }

    public ClusterShardArgs(
        @Nullable Input<String> name,
        @Nullable Input<List<ClusterShardNodeArgs>> nodes,
        @Nullable Input<Integer> numNodes,
        @Nullable Input<String> slots) {
        this.name = name;
        this.nodes = nodes;
        this.numNodes = numNodes;
        this.slots = slots;
    }

    private ClusterShardArgs() {
        this.name = Input.empty();
        this.nodes = Input.empty();
        this.numNodes = Input.empty();
        this.slots = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterShardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<List<ClusterShardNodeArgs>> nodes;
        private @Nullable Input<Integer> numNodes;
        private @Nullable Input<String> slots;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterShardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nodes = defaults.nodes;
    	      this.numNodes = defaults.numNodes;
    	      this.slots = defaults.slots;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNodes(@Nullable Input<List<ClusterShardNodeArgs>> nodes) {
            this.nodes = nodes;
            return this;
        }

        public Builder setNodes(@Nullable List<ClusterShardNodeArgs> nodes) {
            this.nodes = Input.ofNullable(nodes);
            return this;
        }

        public Builder setNumNodes(@Nullable Input<Integer> numNodes) {
            this.numNodes = numNodes;
            return this;
        }

        public Builder setNumNodes(@Nullable Integer numNodes) {
            this.numNodes = Input.ofNullable(numNodes);
            return this;
        }

        public Builder setSlots(@Nullable Input<String> slots) {
            this.slots = slots;
            return this;
        }

        public Builder setSlots(@Nullable String slots) {
            this.slots = Input.ofNullable(slots);
            return this;
        }
        public ClusterShardArgs build() {
            return new ClusterShardArgs(name, nodes, numNodes, slots);
        }
    }
}
