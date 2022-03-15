// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.Action;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Virtual network rule.
 * 
 */
public final class VirtualNetworkRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkRuleArgs Empty = new VirtualNetworkRuleArgs();

    /**
     * The action of virtual network rule.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<Either<String,Action>> action;

    public Output<Either<String,Action>> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     */
    @Import(name="virtualNetworkResourceId", required=true)
      private final Output<String> virtualNetworkResourceId;

    public Output<String> getVirtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    public VirtualNetworkRuleArgs(
        @Nullable Output<Either<String,Action>> action,
        Output<String> virtualNetworkResourceId) {
        this.action = action == null ? Output.ofLeft("Allow") : action;
        this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId, "expected parameter 'virtualNetworkResourceId' to be non-null");
    }

    private VirtualNetworkRuleArgs() {
        this.action = Output.empty();
        this.virtualNetworkResourceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,Action>> action;
        private Output<String> virtualNetworkResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.virtualNetworkResourceId = defaults.virtualNetworkResourceId;
        }

        public Builder action(@Nullable Output<Either<String,Action>> action) {
            this.action = action;
            return this;
        }

        public Builder action(@Nullable Either<String,Action> action) {
            this.action = Output.ofNullable(action);
            return this;
        }

        public Builder virtualNetworkResourceId(Output<String> virtualNetworkResourceId) {
            this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId);
            return this;
        }

        public Builder virtualNetworkResourceId(String virtualNetworkResourceId) {
            this.virtualNetworkResourceId = Output.of(Objects.requireNonNull(virtualNetworkResourceId));
            return this;
        }
        public VirtualNetworkRuleArgs build() {
            return new VirtualNetworkRuleArgs(action, virtualNetworkResourceId);
        }
    }
}
