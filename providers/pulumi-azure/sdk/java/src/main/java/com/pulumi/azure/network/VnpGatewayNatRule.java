// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.network.VnpGatewayNatRuleArgs;
import com.pulumi.azure.network.inputs.VnpGatewayNatRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a VPN Gateway NAT Rule.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleVirtualWan = new VirtualWan(&#34;exampleVirtualWan&#34;, VirtualWanArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .build());
 * 
 *         var exampleVirtualHub = new VirtualHub(&#34;exampleVirtualHub&#34;, VirtualHubArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .addressPrefix(&#34;10.0.1.0/24&#34;)
 *             .virtualWanId(exampleVirtualWan.getId())
 *             .build());
 * 
 *         var exampleVpnGateway = new VpnGateway(&#34;exampleVpnGateway&#34;, VpnGatewayArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .virtualHubId(exampleVirtualHub.getId())
 *             .build());
 * 
 *         var exampleVnpGatewayNatRule = new VnpGatewayNatRule(&#34;exampleVnpGatewayNatRule&#34;, VnpGatewayNatRuleArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .vpnGatewayId(exampleVpnGateway.getId())
 *             .externalAddressSpaceMappings(&#34;192.168.21.0/26&#34;)
 *             .internalAddressSpaceMappings(&#34;10.4.0.0/26&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * VPN Gateway NAT Rules can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:network/vnpGatewayNatRule:VnpGatewayNatRule example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/resGroup1/providers/Microsoft.Network/vpnGateways/vpnGateway1/natRules/natRule1
 * ```
 * 
 */
@ResourceType(type="azure:network/vnpGatewayNatRule:VnpGatewayNatRule")
public class VnpGatewayNatRule extends com.pulumi.resources.CustomResource {
    /**
     * A list of CIDR Ranges which are used for external mapping of the VPN Gateway NAT Rule.
     * 
     */
    @Export(name="externalAddressSpaceMappings", type=List.class, parameters={String.class})
    private Output<List<String>> externalAddressSpaceMappings;

    /**
     * @return A list of CIDR Ranges which are used for external mapping of the VPN Gateway NAT Rule.
     * 
     */
    public Output<List<String>> externalAddressSpaceMappings() {
        return this.externalAddressSpaceMappings;
    }
    /**
     * A list of CIDR Ranges which are used for internal mapping of the VPN Gateway NAT Rule.
     * 
     */
    @Export(name="internalAddressSpaceMappings", type=List.class, parameters={String.class})
    private Output<List<String>> internalAddressSpaceMappings;

    /**
     * @return A list of CIDR Ranges which are used for internal mapping of the VPN Gateway NAT Rule.
     * 
     */
    public Output<List<String>> internalAddressSpaceMappings() {
        return this.internalAddressSpaceMappings;
    }
    /**
     * The ID of the IP Configuration this VPN Gateway NAT Rule applies to. Possible values are `Instance0` and `Instance1`.
     * 
     */
    @Export(name="ipConfigurationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipConfigurationId;

    /**
     * @return The ID of the IP Configuration this VPN Gateway NAT Rule applies to. Possible values are `Instance0` and `Instance1`.
     * 
     */
    public Output<Optional<String>> ipConfigurationId() {
        return Codegen.optional(this.ipConfigurationId);
    }
    /**
     * The source NAT direction of the VPN NAT. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="mode", type=String.class, parameters={})
    private Output</* @Nullable */ String> mode;

    /**
     * @return The source NAT direction of the VPN NAT. Possible values are `EgressSnat` and `IngressSnat`. Defaults to `EgressSnat`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> mode() {
        return Codegen.optional(this.mode);
    }
    /**
     * The name which should be used for this VPN Gateway NAT Rule. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name which should be used for this VPN Gateway NAT Rule. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Name of the Resource Group in which this VPN Gateway NAT Rule should be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group in which this VPN Gateway NAT Rule should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The type of the VPN Gateway NAT Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of the VPN Gateway NAT Rule. Possible values are `Dynamic` and `Static`. Defaults to `Static`. Changing this forces a new resource to be created.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * The ID of the VPN Gateway that this VPN Gateway NAT Rule belongs to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="vpnGatewayId", type=String.class, parameters={})
    private Output<String> vpnGatewayId;

    /**
     * @return The ID of the VPN Gateway that this VPN Gateway NAT Rule belongs to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> vpnGatewayId() {
        return this.vpnGatewayId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VnpGatewayNatRule(String name) {
        this(name, VnpGatewayNatRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VnpGatewayNatRule(String name, VnpGatewayNatRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VnpGatewayNatRule(String name, VnpGatewayNatRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/vnpGatewayNatRule:VnpGatewayNatRule", name, args == null ? VnpGatewayNatRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VnpGatewayNatRule(String name, Output<String> id, @Nullable VnpGatewayNatRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:network/vnpGatewayNatRule:VnpGatewayNatRule", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VnpGatewayNatRule get(String name, Output<String> id, @Nullable VnpGatewayNatRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VnpGatewayNatRule(name, id, state, options);
    }
}
