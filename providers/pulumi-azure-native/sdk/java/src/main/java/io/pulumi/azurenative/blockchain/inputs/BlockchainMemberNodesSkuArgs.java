// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Payload of the blockchain member nodes Sku for a blockchain member.
 * 
 */
public final class BlockchainMemberNodesSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlockchainMemberNodesSkuArgs Empty = new BlockchainMemberNodesSkuArgs();

    /**
     * Gets or sets the nodes capacity.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<Integer> capacity;

    public Output<Integer> getCapacity() {
        return this.capacity == null ? Output.empty() : this.capacity;
    }

    public BlockchainMemberNodesSkuArgs(@Nullable Output<Integer> capacity) {
        this.capacity = capacity;
    }

    private BlockchainMemberNodesSkuArgs() {
        this.capacity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlockchainMemberNodesSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> capacity;

        public Builder() {
    	      // Empty
        }

        public Builder(BlockchainMemberNodesSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
        }

        public Builder capacity(@Nullable Output<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = Output.ofNullable(capacity);
            return this;
        }
        public BlockchainMemberNodesSkuArgs build() {
            return new BlockchainMemberNodesSkuArgs(capacity);
        }
    }
}
