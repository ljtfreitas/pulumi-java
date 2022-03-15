// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkGatewayAdvertisedRoutesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkGatewayAdvertisedRoutesArgs Empty = new GetVirtualNetworkGatewayAdvertisedRoutesArgs();

    /**
     * The IP address of the peer.
     * 
     */
    @Import(name="peer", required=true)
      private final String peer;

    public String getPeer() {
        return this.peer;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the virtual network gateway.
     * 
     */
    @Import(name="virtualNetworkGatewayName", required=true)
      private final String virtualNetworkGatewayName;

    public String getVirtualNetworkGatewayName() {
        return this.virtualNetworkGatewayName;
    }

    public GetVirtualNetworkGatewayAdvertisedRoutesArgs(
        String peer,
        String resourceGroupName,
        String virtualNetworkGatewayName) {
        this.peer = Objects.requireNonNull(peer, "expected parameter 'peer' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualNetworkGatewayName = Objects.requireNonNull(virtualNetworkGatewayName, "expected parameter 'virtualNetworkGatewayName' to be non-null");
    }

    private GetVirtualNetworkGatewayAdvertisedRoutesArgs() {
        this.peer = null;
        this.resourceGroupName = null;
        this.virtualNetworkGatewayName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkGatewayAdvertisedRoutesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String peer;
        private String resourceGroupName;
        private String virtualNetworkGatewayName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkGatewayAdvertisedRoutesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.peer = defaults.peer;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualNetworkGatewayName = defaults.virtualNetworkGatewayName;
        }

        public Builder peer(String peer) {
            this.peer = Objects.requireNonNull(peer);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder virtualNetworkGatewayName(String virtualNetworkGatewayName) {
            this.virtualNetworkGatewayName = Objects.requireNonNull(virtualNetworkGatewayName);
            return this;
        }
        public GetVirtualNetworkGatewayAdvertisedRoutesArgs build() {
            return new GetVirtualNetworkGatewayAdvertisedRoutesArgs(peer, resourceGroupName, virtualNetworkGatewayName);
        }
    }
}
