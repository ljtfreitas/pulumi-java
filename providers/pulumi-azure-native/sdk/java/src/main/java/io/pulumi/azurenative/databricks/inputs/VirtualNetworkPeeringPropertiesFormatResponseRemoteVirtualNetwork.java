// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 *  The remote virtual network should be in the same region. See here to learn more (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
 * 
 */
public final class VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork Empty = new VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork();

    /**
     * The Id of the remote virtual network.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork(@Nullable String id) {
        this.id = id;
    }

    private VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork build() {
            return new VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork(id);
        }
    }
}
