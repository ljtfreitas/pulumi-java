// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.Action;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="action")
    private final @Nullable Input<Either<String,Action>> action;

    public Input<Either<String,Action>> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     */
    @InputImport(name="virtualNetworkResourceId", required=true)
    private final Input<String> virtualNetworkResourceId;

    public Input<String> getVirtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    public VirtualNetworkRuleArgs(
        @Nullable Input<Either<String,Action>> action,
        Input<String> virtualNetworkResourceId) {
        this.action = action == null ? Input.ofLeft("Allow") : action;
        this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId, "expected parameter 'virtualNetworkResourceId' to be non-null");
    }

    private VirtualNetworkRuleArgs() {
        this.action = Input.empty();
        this.virtualNetworkResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,Action>> action;
        private Input<String> virtualNetworkResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.virtualNetworkResourceId = defaults.virtualNetworkResourceId;
        }

        public Builder setAction(@Nullable Input<Either<String,Action>> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable Either<String,Action> action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setVirtualNetworkResourceId(Input<String> virtualNetworkResourceId) {
            this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId);
            return this;
        }

        public Builder setVirtualNetworkResourceId(String virtualNetworkResourceId) {
            this.virtualNetworkResourceId = Input.of(Objects.requireNonNull(virtualNetworkResourceId));
            return this;
        }

        public VirtualNetworkRuleArgs build() {
            return new VirtualNetworkRuleArgs(action, virtualNetworkResourceId);
        }
    }
}
