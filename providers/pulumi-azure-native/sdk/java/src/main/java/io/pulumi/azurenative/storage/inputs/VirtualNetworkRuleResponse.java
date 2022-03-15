// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Virtual Network rule.
 * 
 */
public final class VirtualNetworkRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkRuleResponse Empty = new VirtualNetworkRuleResponse();

    /**
     * The action of virtual network rule.
     * 
     */
    @Import(name="action")
      private final @Nullable String action;

    public Optional<String> getAction() {
        return this.action == null ? Optional.empty() : Optional.ofNullable(this.action);
    }

    /**
     * Gets the state of virtual network rule.
     * 
     */
    @Import(name="state")
      private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    /**
     * Resource ID of a subnet, for example: /subscriptions/{subscriptionId}/resourceGroups/{groupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     */
    @Import(name="virtualNetworkResourceId", required=true)
      private final String virtualNetworkResourceId;

    public String getVirtualNetworkResourceId() {
        return this.virtualNetworkResourceId;
    }

    public VirtualNetworkRuleResponse(
        @Nullable String action,
        @Nullable String state,
        String virtualNetworkResourceId) {
        this.action = action == null ? "Allow" : action;
        this.state = state;
        this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId, "expected parameter 'virtualNetworkResourceId' to be non-null");
    }

    private VirtualNetworkRuleResponse() {
        this.action = null;
        this.state = null;
        this.virtualNetworkResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable String state;
        private String virtualNetworkResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.state = defaults.state;
    	      this.virtualNetworkResourceId = defaults.virtualNetworkResourceId;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder virtualNetworkResourceId(String virtualNetworkResourceId) {
            this.virtualNetworkResourceId = Objects.requireNonNull(virtualNetworkResourceId);
            return this;
        }
        public VirtualNetworkRuleResponse build() {
            return new VirtualNetworkRuleResponse(action, state, virtualNetworkResourceId);
        }
    }
}
