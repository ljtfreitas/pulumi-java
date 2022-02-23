// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.azurenative.servicebus.inputs.SubnetResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of VirtualNetworkRules - NetworkRules resource.
 * 
 */
public final class NWRuleSetVirtualNetworkRulesResponse extends io.pulumi.resources.InvokeArgs {

    public static final NWRuleSetVirtualNetworkRulesResponse Empty = new NWRuleSetVirtualNetworkRulesResponse();

    /**
     * Value that indicates whether to ignore missing VNet Service Endpoint
     * 
     */
    @InputImport(name="ignoreMissingVnetServiceEndpoint")
        private final @Nullable Boolean ignoreMissingVnetServiceEndpoint;

    public Optional<Boolean> getIgnoreMissingVnetServiceEndpoint() {
        return this.ignoreMissingVnetServiceEndpoint == null ? Optional.empty() : Optional.ofNullable(this.ignoreMissingVnetServiceEndpoint);
    }

    /**
     * Subnet properties
     * 
     */
    @InputImport(name="subnet")
        private final @Nullable SubnetResponse subnet;

    public Optional<SubnetResponse> getSubnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    public NWRuleSetVirtualNetworkRulesResponse(
        @Nullable Boolean ignoreMissingVnetServiceEndpoint,
        @Nullable SubnetResponse subnet) {
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        this.subnet = subnet;
    }

    private NWRuleSetVirtualNetworkRulesResponse() {
        this.ignoreMissingVnetServiceEndpoint = null;
        this.subnet = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NWRuleSetVirtualNetworkRulesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean ignoreMissingVnetServiceEndpoint;
        private @Nullable SubnetResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(NWRuleSetVirtualNetworkRulesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ignoreMissingVnetServiceEndpoint = defaults.ignoreMissingVnetServiceEndpoint;
    	      this.subnet = defaults.subnet;
        }

        public Builder setIgnoreMissingVnetServiceEndpoint(@Nullable Boolean ignoreMissingVnetServiceEndpoint) {
            this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
            return this;
        }

        public Builder setSubnet(@Nullable SubnetResponse subnet) {
            this.subnet = subnet;
            return this;
        }
        public NWRuleSetVirtualNetworkRulesResponse build() {
            return new NWRuleSetVirtualNetworkRulesResponse(ignoreMissingVnetServiceEndpoint, subnet);
        }
    }
}
