// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks;

import io.pulumi.azurenative.databricks.inputs.AddressSpaceArgs;
import io.pulumi.azurenative.databricks.inputs.VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs;
import io.pulumi.azurenative.databricks.inputs.VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VNetPeeringArgs extends io.pulumi.resources.ResourceArgs {

    public static final VNetPeeringArgs Empty = new VNetPeeringArgs();

    /**
     * Whether the forwarded traffic from the VMs in the local virtual network will be allowed/disallowed in remote virtual network.
     * 
     */
    @InputImport(name="allowForwardedTraffic")
    private final @Nullable Input<Boolean> allowForwardedTraffic;

    public Input<Boolean> getAllowForwardedTraffic() {
        return this.allowForwardedTraffic == null ? Input.empty() : this.allowForwardedTraffic;
    }

    /**
     * If gateway links can be used in remote virtual networking to link to this virtual network.
     * 
     */
    @InputImport(name="allowGatewayTransit")
    private final @Nullable Input<Boolean> allowGatewayTransit;

    public Input<Boolean> getAllowGatewayTransit() {
        return this.allowGatewayTransit == null ? Input.empty() : this.allowGatewayTransit;
    }

    /**
     * Whether the VMs in the local virtual network space would be able to access the VMs in remote virtual network space.
     * 
     */
    @InputImport(name="allowVirtualNetworkAccess")
    private final @Nullable Input<Boolean> allowVirtualNetworkAccess;

    public Input<Boolean> getAllowVirtualNetworkAccess() {
        return this.allowVirtualNetworkAccess == null ? Input.empty() : this.allowVirtualNetworkAccess;
    }

    /**
     * The reference to the databricks virtual network address space.
     * 
     */
    @InputImport(name="databricksAddressSpace")
    private final @Nullable Input<AddressSpaceArgs> databricksAddressSpace;

    public Input<AddressSpaceArgs> getDatabricksAddressSpace() {
        return this.databricksAddressSpace == null ? Input.empty() : this.databricksAddressSpace;
    }

    /**
     *  The remote virtual network should be in the same region. See here to learn more (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
     * 
     */
    @InputImport(name="databricksVirtualNetwork")
    private final @Nullable Input<VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs> databricksVirtualNetwork;

    public Input<VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs> getDatabricksVirtualNetwork() {
        return this.databricksVirtualNetwork == null ? Input.empty() : this.databricksVirtualNetwork;
    }

    /**
     * The name of the workspace vNet peering.
     * 
     */
    @InputImport(name="peeringName")
    private final @Nullable Input<String> peeringName;

    public Input<String> getPeeringName() {
        return this.peeringName == null ? Input.empty() : this.peeringName;
    }

    /**
     * The reference to the remote virtual network address space.
     * 
     */
    @InputImport(name="remoteAddressSpace")
    private final @Nullable Input<AddressSpaceArgs> remoteAddressSpace;

    public Input<AddressSpaceArgs> getRemoteAddressSpace() {
        return this.remoteAddressSpace == null ? Input.empty() : this.remoteAddressSpace;
    }

    /**
     *  The remote virtual network should be in the same region. See here to learn more (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
     * 
     */
    @InputImport(name="remoteVirtualNetwork", required=true)
    private final Input<VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs> remoteVirtualNetwork;

    public Input<VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs> getRemoteVirtualNetwork() {
        return this.remoteVirtualNetwork;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * If remote gateways can be used on this virtual network. If the flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network already has a gateway.
     * 
     */
    @InputImport(name="useRemoteGateways")
    private final @Nullable Input<Boolean> useRemoteGateways;

    public Input<Boolean> getUseRemoteGateways() {
        return this.useRemoteGateways == null ? Input.empty() : this.useRemoteGateways;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public VNetPeeringArgs(
        @Nullable Input<Boolean> allowForwardedTraffic,
        @Nullable Input<Boolean> allowGatewayTransit,
        @Nullable Input<Boolean> allowVirtualNetworkAccess,
        @Nullable Input<AddressSpaceArgs> databricksAddressSpace,
        @Nullable Input<VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs> databricksVirtualNetwork,
        @Nullable Input<String> peeringName,
        @Nullable Input<AddressSpaceArgs> remoteAddressSpace,
        Input<VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs> remoteVirtualNetwork,
        Input<String> resourceGroupName,
        @Nullable Input<Boolean> useRemoteGateways,
        Input<String> workspaceName) {
        this.allowForwardedTraffic = allowForwardedTraffic;
        this.allowGatewayTransit = allowGatewayTransit;
        this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
        this.databricksAddressSpace = databricksAddressSpace;
        this.databricksVirtualNetwork = databricksVirtualNetwork;
        this.peeringName = peeringName;
        this.remoteAddressSpace = remoteAddressSpace;
        this.remoteVirtualNetwork = Objects.requireNonNull(remoteVirtualNetwork, "expected parameter 'remoteVirtualNetwork' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.useRemoteGateways = useRemoteGateways;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private VNetPeeringArgs() {
        this.allowForwardedTraffic = Input.empty();
        this.allowGatewayTransit = Input.empty();
        this.allowVirtualNetworkAccess = Input.empty();
        this.databricksAddressSpace = Input.empty();
        this.databricksVirtualNetwork = Input.empty();
        this.peeringName = Input.empty();
        this.remoteAddressSpace = Input.empty();
        this.remoteVirtualNetwork = Input.empty();
        this.resourceGroupName = Input.empty();
        this.useRemoteGateways = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VNetPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowForwardedTraffic;
        private @Nullable Input<Boolean> allowGatewayTransit;
        private @Nullable Input<Boolean> allowVirtualNetworkAccess;
        private @Nullable Input<AddressSpaceArgs> databricksAddressSpace;
        private @Nullable Input<VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs> databricksVirtualNetwork;
        private @Nullable Input<String> peeringName;
        private @Nullable Input<AddressSpaceArgs> remoteAddressSpace;
        private Input<VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs> remoteVirtualNetwork;
        private Input<String> resourceGroupName;
        private @Nullable Input<Boolean> useRemoteGateways;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(VNetPeeringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowForwardedTraffic = defaults.allowForwardedTraffic;
    	      this.allowGatewayTransit = defaults.allowGatewayTransit;
    	      this.allowVirtualNetworkAccess = defaults.allowVirtualNetworkAccess;
    	      this.databricksAddressSpace = defaults.databricksAddressSpace;
    	      this.databricksVirtualNetwork = defaults.databricksVirtualNetwork;
    	      this.peeringName = defaults.peeringName;
    	      this.remoteAddressSpace = defaults.remoteAddressSpace;
    	      this.remoteVirtualNetwork = defaults.remoteVirtualNetwork;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.useRemoteGateways = defaults.useRemoteGateways;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setAllowForwardedTraffic(@Nullable Input<Boolean> allowForwardedTraffic) {
            this.allowForwardedTraffic = allowForwardedTraffic;
            return this;
        }

        public Builder setAllowForwardedTraffic(@Nullable Boolean allowForwardedTraffic) {
            this.allowForwardedTraffic = Input.ofNullable(allowForwardedTraffic);
            return this;
        }

        public Builder setAllowGatewayTransit(@Nullable Input<Boolean> allowGatewayTransit) {
            this.allowGatewayTransit = allowGatewayTransit;
            return this;
        }

        public Builder setAllowGatewayTransit(@Nullable Boolean allowGatewayTransit) {
            this.allowGatewayTransit = Input.ofNullable(allowGatewayTransit);
            return this;
        }

        public Builder setAllowVirtualNetworkAccess(@Nullable Input<Boolean> allowVirtualNetworkAccess) {
            this.allowVirtualNetworkAccess = allowVirtualNetworkAccess;
            return this;
        }

        public Builder setAllowVirtualNetworkAccess(@Nullable Boolean allowVirtualNetworkAccess) {
            this.allowVirtualNetworkAccess = Input.ofNullable(allowVirtualNetworkAccess);
            return this;
        }

        public Builder setDatabricksAddressSpace(@Nullable Input<AddressSpaceArgs> databricksAddressSpace) {
            this.databricksAddressSpace = databricksAddressSpace;
            return this;
        }

        public Builder setDatabricksAddressSpace(@Nullable AddressSpaceArgs databricksAddressSpace) {
            this.databricksAddressSpace = Input.ofNullable(databricksAddressSpace);
            return this;
        }

        public Builder setDatabricksVirtualNetwork(@Nullable Input<VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs> databricksVirtualNetwork) {
            this.databricksVirtualNetwork = databricksVirtualNetwork;
            return this;
        }

        public Builder setDatabricksVirtualNetwork(@Nullable VirtualNetworkPeeringPropertiesFormatDatabricksVirtualNetworkArgs databricksVirtualNetwork) {
            this.databricksVirtualNetwork = Input.ofNullable(databricksVirtualNetwork);
            return this;
        }

        public Builder setPeeringName(@Nullable Input<String> peeringName) {
            this.peeringName = peeringName;
            return this;
        }

        public Builder setPeeringName(@Nullable String peeringName) {
            this.peeringName = Input.ofNullable(peeringName);
            return this;
        }

        public Builder setRemoteAddressSpace(@Nullable Input<AddressSpaceArgs> remoteAddressSpace) {
            this.remoteAddressSpace = remoteAddressSpace;
            return this;
        }

        public Builder setRemoteAddressSpace(@Nullable AddressSpaceArgs remoteAddressSpace) {
            this.remoteAddressSpace = Input.ofNullable(remoteAddressSpace);
            return this;
        }

        public Builder setRemoteVirtualNetwork(Input<VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs> remoteVirtualNetwork) {
            this.remoteVirtualNetwork = Objects.requireNonNull(remoteVirtualNetwork);
            return this;
        }

        public Builder setRemoteVirtualNetwork(VirtualNetworkPeeringPropertiesFormatRemoteVirtualNetworkArgs remoteVirtualNetwork) {
            this.remoteVirtualNetwork = Input.of(Objects.requireNonNull(remoteVirtualNetwork));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setUseRemoteGateways(@Nullable Input<Boolean> useRemoteGateways) {
            this.useRemoteGateways = useRemoteGateways;
            return this;
        }

        public Builder setUseRemoteGateways(@Nullable Boolean useRemoteGateways) {
            this.useRemoteGateways = Input.ofNullable(useRemoteGateways);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public VNetPeeringArgs build() {
            return new VNetPeeringArgs(allowForwardedTraffic, allowGatewayTransit, allowVirtualNetworkAccess, databricksAddressSpace, databricksVirtualNetwork, peeringName, remoteAddressSpace, remoteVirtualNetwork, resourceGroupName, useRemoteGateways, workspaceName);
        }
    }
}
