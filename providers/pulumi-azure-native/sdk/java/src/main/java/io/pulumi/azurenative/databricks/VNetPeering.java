// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databricks.VNetPeeringArgs;
import io.pulumi.azurenative.databricks.outputs.AddressSpaceResponse;
import io.pulumi.azurenative.databricks.outputs.VirtualNetworkPeeringPropertiesFormatResponseDatabricksVirtualNetwork;
import io.pulumi.azurenative.databricks.outputs.VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Peerings in a VirtualNetwork resource
 * API Version: 2018-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:databricks:vNetPeering vNetPeeringTest /subscriptions/0140911e-1040-48da-8bc9-b99fb3dd88a6/resourceGroups/subramantest/providers/Microsoft.Databricks/workspaces/adbworkspace/virtualNetworkPeerings/vNetPeeringTest 
 * ```
 * 
 */
@ResourceType(type="azure-native:databricks:vNetPeering")
public class VNetPeering extends io.pulumi.resources.CustomResource {
    /**
     * Whether the forwarded traffic from the VMs in the local virtual network will be allowed/disallowed in remote virtual network.
     * 
     */
    @OutputExport(name="allowForwardedTraffic", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowForwardedTraffic;

    /**
     * @return Whether the forwarded traffic from the VMs in the local virtual network will be allowed/disallowed in remote virtual network.
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowForwardedTraffic() {
        return this.allowForwardedTraffic;
    }
    /**
     * If gateway links can be used in remote virtual networking to link to this virtual network.
     * 
     */
    @OutputExport(name="allowGatewayTransit", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowGatewayTransit;

    /**
     * @return If gateway links can be used in remote virtual networking to link to this virtual network.
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowGatewayTransit() {
        return this.allowGatewayTransit;
    }
    /**
     * Whether the VMs in the local virtual network space would be able to access the VMs in remote virtual network space.
     * 
     */
    @OutputExport(name="allowVirtualNetworkAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowVirtualNetworkAccess;

    /**
     * @return Whether the VMs in the local virtual network space would be able to access the VMs in remote virtual network space.
     * 
     */
    public Output</* @Nullable */ Boolean> getAllowVirtualNetworkAccess() {
        return this.allowVirtualNetworkAccess;
    }
    /**
     * The reference to the databricks virtual network address space.
     * 
     */
    @OutputExport(name="databricksAddressSpace", type=AddressSpaceResponse.class, parameters={})
    private Output</* @Nullable */ AddressSpaceResponse> databricksAddressSpace;

    /**
     * @return The reference to the databricks virtual network address space.
     * 
     */
    public Output</* @Nullable */ AddressSpaceResponse> getDatabricksAddressSpace() {
        return this.databricksAddressSpace;
    }
    /**
     *  The remote virtual network should be in the same region. See here to learn more (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
     * 
     */
    @OutputExport(name="databricksVirtualNetwork", type=VirtualNetworkPeeringPropertiesFormatResponseDatabricksVirtualNetwork.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkPeeringPropertiesFormatResponseDatabricksVirtualNetwork> databricksVirtualNetwork;

    /**
     * @return  The remote virtual network should be in the same region. See here to learn more (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
     * 
     */
    public Output</* @Nullable */ VirtualNetworkPeeringPropertiesFormatResponseDatabricksVirtualNetwork> getDatabricksVirtualNetwork() {
        return this.databricksVirtualNetwork;
    }
    /**
     * Name of the virtual network peering resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the virtual network peering resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The status of the virtual network peering.
     * 
     */
    @OutputExport(name="peeringState", type=String.class, parameters={})
    private Output<String> peeringState;

    /**
     * @return The status of the virtual network peering.
     * 
     */
    public Output<String> getPeeringState() {
        return this.peeringState;
    }
    /**
     * The provisioning state of the virtual network peering resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the virtual network peering resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The reference to the remote virtual network address space.
     * 
     */
    @OutputExport(name="remoteAddressSpace", type=AddressSpaceResponse.class, parameters={})
    private Output</* @Nullable */ AddressSpaceResponse> remoteAddressSpace;

    /**
     * @return The reference to the remote virtual network address space.
     * 
     */
    public Output</* @Nullable */ AddressSpaceResponse> getRemoteAddressSpace() {
        return this.remoteAddressSpace;
    }
    /**
     *  The remote virtual network should be in the same region. See here to learn more (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
     * 
     */
    @OutputExport(name="remoteVirtualNetwork", type=VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork.class, parameters={})
    private Output<VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork> remoteVirtualNetwork;

    /**
     * @return  The remote virtual network should be in the same region. See here to learn more (https://docs.microsoft.com/en-us/azure/databricks/administration-guide/cloud-configurations/azure/vnet-peering).
     * 
     */
    public Output<VirtualNetworkPeeringPropertiesFormatResponseRemoteVirtualNetwork> getRemoteVirtualNetwork() {
        return this.remoteVirtualNetwork;
    }
    /**
     * type of the virtual network peering resource
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return type of the virtual network peering resource
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * If remote gateways can be used on this virtual network. If the flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network already has a gateway.
     * 
     */
    @OutputExport(name="useRemoteGateways", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useRemoteGateways;

    /**
     * @return If remote gateways can be used on this virtual network. If the flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual network already has a gateway.
     * 
     */
    public Output</* @Nullable */ Boolean> getUseRemoteGateways() {
        return this.useRemoteGateways;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VNetPeering(String name, VNetPeeringArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databricks:vNetPeering", name, args == null ? VNetPeeringArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VNetPeering(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:databricks:vNetPeering", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:databricks/v20180401:vNetPeering").build()),
                Input.of(Alias.builder().setType("azure-native:databricks/v20210401preview:vNetPeering").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VNetPeering get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VNetPeering(name, id, options);
    }
}
