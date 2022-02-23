// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.outputs;

import io.pulumi.azurenative.eventhub.outputs.SubnetResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NWRuleSetVirtualNetworkRulesResponse {
    /**
     * Value that indicates whether to ignore missing VNet Service Endpoint
     * 
     */
    private final @Nullable Boolean ignoreMissingVnetServiceEndpoint;
    /**
     * Subnet properties
     * 
     */
    private final @Nullable SubnetResponse subnet;

    @OutputCustomType.Constructor({"ignoreMissingVnetServiceEndpoint","subnet"})
    private NWRuleSetVirtualNetworkRulesResponse(
        @Nullable Boolean ignoreMissingVnetServiceEndpoint,
        @Nullable SubnetResponse subnet) {
        this.ignoreMissingVnetServiceEndpoint = ignoreMissingVnetServiceEndpoint;
        this.subnet = subnet;
    }

    /**
     * Value that indicates whether to ignore missing VNet Service Endpoint
     * 
     */
    public Optional<Boolean> getIgnoreMissingVnetServiceEndpoint() {
        return Optional.ofNullable(this.ignoreMissingVnetServiceEndpoint);
    }
    /**
     * Subnet properties
     * 
     */
    public Optional<SubnetResponse> getSubnet() {
        return Optional.ofNullable(this.subnet);
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
