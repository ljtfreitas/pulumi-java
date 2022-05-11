// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.VirtualNetworkGatewayConnectionArgs;
import com.pulumi.azurenative.network.outputs.IpsecPolicyResponse;
import com.pulumi.azurenative.network.outputs.LocalNetworkGatewayResponse;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.azurenative.network.outputs.TrafficSelectorPolicyResponse;
import com.pulumi.azurenative.network.outputs.TunnelConnectionHealthResponse;
import com.pulumi.azurenative.network.outputs.VirtualNetworkGatewayResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A common class for general resource information.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * ### CreateVirtualNetworkGatewayConnection_S2S
 * 
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
 *         var virtualNetworkGatewayConnection = new VirtualNetworkGatewayConnection(&#34;virtualNetworkGatewayConnection&#34;, VirtualNetworkGatewayConnectionArgs.builder()        
 *             .connectionMode(&#34;Default&#34;)
 *             .connectionProtocol(&#34;IKEv2&#34;)
 *             .connectionType(&#34;IPsec&#34;)
 *             .dpdTimeoutSeconds(30)
 *             .enableBgp(false)
 *             .ipsecPolicies()
 *             .localNetworkGateway2(Map.ofEntries(
 *                 Map.entry(&#34;gatewayIpAddress&#34;, &#34;x.x.x.x&#34;),
 *                 Map.entry(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/localNetworkGateways/localgw&#34;),
 *                 Map.entry(&#34;localNetworkAddressSpace&#34;, Map.of(&#34;addressPrefixes&#34;, &#34;10.1.0.0/16&#34;)),
 *                 Map.entry(&#34;location&#34;, &#34;centralus&#34;),
 *                 Map.entry(&#34;tags&#34;, )
 *             ))
 *             .location(&#34;centralus&#34;)
 *             .resourceGroupName(&#34;rg1&#34;)
 *             .routingWeight(0)
 *             .sharedKey(&#34;Abc123&#34;)
 *             .trafficSelectorPolicies()
 *             .usePolicyBasedTrafficSelectors(false)
 *             .virtualNetworkGateway1(Map.ofEntries(
 *                 Map.entry(&#34;activeActive&#34;, false),
 *                 Map.entry(&#34;bgpSettings&#34;, Map.ofEntries(
 *                     Map.entry(&#34;asn&#34;, 65514),
 *                     Map.entry(&#34;bgpPeeringAddress&#34;, &#34;10.0.1.30&#34;),
 *                     Map.entry(&#34;peerWeight&#34;, 0)
 *                 )),
 *                 Map.entry(&#34;enableBgp&#34;, false),
 *                 Map.entry(&#34;gatewayType&#34;, &#34;Vpn&#34;),
 *                 Map.entry(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworkGateways/vpngw&#34;),
 *                 Map.entry(&#34;ipConfigurations&#34;, Map.ofEntries(
 *                     Map.entry(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworkGateways/vpngw/ipConfigurations/gwipconfig1&#34;),
 *                     Map.entry(&#34;name&#34;, &#34;gwipconfig1&#34;),
 *                     Map.entry(&#34;privateIPAllocationMethod&#34;, &#34;Dynamic&#34;),
 *                     Map.entry(&#34;publicIPAddress&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/gwpip&#34;)),
 *                     Map.entry(&#34;subnet&#34;, Map.of(&#34;id&#34;, &#34;/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnet1/subnets/GatewaySubnet&#34;))
 *                 )),
 *                 Map.entry(&#34;location&#34;, &#34;centralus&#34;),
 *                 Map.entry(&#34;sku&#34;, Map.ofEntries(
 *                     Map.entry(&#34;name&#34;, &#34;VpnGw1&#34;),
 *                     Map.entry(&#34;tier&#34;, &#34;VpnGw1&#34;)
 *                 )),
 *                 Map.entry(&#34;tags&#34;, ),
 *                 Map.entry(&#34;vpnType&#34;, &#34;RouteBased&#34;)
 *             ))
 *             .virtualNetworkGatewayConnectionName(&#34;connS2S&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:VirtualNetworkGatewayConnection connS2S /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/connections/connS2S 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VirtualNetworkGatewayConnection")
public class VirtualNetworkGatewayConnection extends com.pulumi.resources.CustomResource {
    /**
     * The authorizationKey.
     * 
     */
    @Export(name="authorizationKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizationKey;

    /**
     * @return The authorizationKey.
     * 
     */
    public Output<Optional<String>> authorizationKey() {
        return Codegen.optional(this.authorizationKey);
    }
    /**
     * The connection mode for this connection.
     * 
     */
    @Export(name="connectionMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectionMode;

    /**
     * @return The connection mode for this connection.
     * 
     */
    public Output<Optional<String>> connectionMode() {
        return Codegen.optional(this.connectionMode);
    }
    /**
     * Connection protocol used for this connection.
     * 
     */
    @Export(name="connectionProtocol", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectionProtocol;

    /**
     * @return Connection protocol used for this connection.
     * 
     */
    public Output<Optional<String>> connectionProtocol() {
        return Codegen.optional(this.connectionProtocol);
    }
    /**
     * Virtual Network Gateway connection status.
     * 
     */
    @Export(name="connectionStatus", type=String.class, parameters={})
    private Output<String> connectionStatus;

    /**
     * @return Virtual Network Gateway connection status.
     * 
     */
    public Output<String> connectionStatus() {
        return this.connectionStatus;
    }
    /**
     * Gateway connection type.
     * 
     */
    @Export(name="connectionType", type=String.class, parameters={})
    private Output<String> connectionType;

    /**
     * @return Gateway connection type.
     * 
     */
    public Output<String> connectionType() {
        return this.connectionType;
    }
    /**
     * The dead peer detection timeout of this connection in seconds.
     * 
     */
    @Export(name="dpdTimeoutSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> dpdTimeoutSeconds;

    /**
     * @return The dead peer detection timeout of this connection in seconds.
     * 
     */
    public Output<Optional<Integer>> dpdTimeoutSeconds() {
        return Codegen.optional(this.dpdTimeoutSeconds);
    }
    /**
     * The egress bytes transferred in this connection.
     * 
     */
    @Export(name="egressBytesTransferred", type=Double.class, parameters={})
    private Output<Double> egressBytesTransferred;

    /**
     * @return The egress bytes transferred in this connection.
     * 
     */
    public Output<Double> egressBytesTransferred() {
        return this.egressBytesTransferred;
    }
    /**
     * EnableBgp flag.
     * 
     */
    @Export(name="enableBgp", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableBgp;

    /**
     * @return EnableBgp flag.
     * 
     */
    public Output<Optional<Boolean>> enableBgp() {
        return Codegen.optional(this.enableBgp);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Bypass ExpressRoute Gateway for data forwarding.
     * 
     */
    @Export(name="expressRouteGatewayBypass", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> expressRouteGatewayBypass;

    /**
     * @return Bypass ExpressRoute Gateway for data forwarding.
     * 
     */
    public Output<Optional<Boolean>> expressRouteGatewayBypass() {
        return Codegen.optional(this.expressRouteGatewayBypass);
    }
    /**
     * The ingress bytes transferred in this connection.
     * 
     */
    @Export(name="ingressBytesTransferred", type=Double.class, parameters={})
    private Output<Double> ingressBytesTransferred;

    /**
     * @return The ingress bytes transferred in this connection.
     * 
     */
    public Output<Double> ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }
    /**
     * The IPSec Policies to be considered by this connection.
     * 
     */
    @Export(name="ipsecPolicies", type=List.class, parameters={IpsecPolicyResponse.class})
    private Output</* @Nullable */ List<IpsecPolicyResponse>> ipsecPolicies;

    /**
     * @return The IPSec Policies to be considered by this connection.
     * 
     */
    public Output<Optional<List<IpsecPolicyResponse>>> ipsecPolicies() {
        return Codegen.optional(this.ipsecPolicies);
    }
    /**
     * The reference to local network gateway resource.
     * 
     */
    @Export(name="localNetworkGateway2", type=LocalNetworkGatewayResponse.class, parameters={})
    private Output</* @Nullable */ LocalNetworkGatewayResponse> localNetworkGateway2;

    /**
     * @return The reference to local network gateway resource.
     * 
     */
    public Output<Optional<LocalNetworkGatewayResponse>> localNetworkGateway2() {
        return Codegen.optional(this.localNetworkGateway2);
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The reference to peerings resource.
     * 
     */
    @Export(name="peer", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> peer;

    /**
     * @return The reference to peerings resource.
     * 
     */
    public Output<Optional<SubResourceResponse>> peer() {
        return Codegen.optional(this.peer);
    }
    /**
     * The provisioning state of the virtual network gateway connection resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the virtual network gateway connection resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the virtual network gateway connection resource.
     * 
     */
    @Export(name="resourceGuid", type=String.class, parameters={})
    private Output<String> resourceGuid;

    /**
     * @return The resource GUID property of the virtual network gateway connection resource.
     * 
     */
    public Output<String> resourceGuid() {
        return this.resourceGuid;
    }
    /**
     * The routing weight.
     * 
     */
    @Export(name="routingWeight", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> routingWeight;

    /**
     * @return The routing weight.
     * 
     */
    public Output<Optional<Integer>> routingWeight() {
        return Codegen.optional(this.routingWeight);
    }
    /**
     * The IPSec shared key.
     * 
     */
    @Export(name="sharedKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> sharedKey;

    /**
     * @return The IPSec shared key.
     * 
     */
    public Output<Optional<String>> sharedKey() {
        return Codegen.optional(this.sharedKey);
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The Traffic Selector Policies to be considered by this connection.
     * 
     */
    @Export(name="trafficSelectorPolicies", type=List.class, parameters={TrafficSelectorPolicyResponse.class})
    private Output</* @Nullable */ List<TrafficSelectorPolicyResponse>> trafficSelectorPolicies;

    /**
     * @return The Traffic Selector Policies to be considered by this connection.
     * 
     */
    public Output<Optional<List<TrafficSelectorPolicyResponse>>> trafficSelectorPolicies() {
        return Codegen.optional(this.trafficSelectorPolicies);
    }
    /**
     * Collection of all tunnels&#39; connection health status.
     * 
     */
    @Export(name="tunnelConnectionStatus", type=List.class, parameters={TunnelConnectionHealthResponse.class})
    private Output<List<TunnelConnectionHealthResponse>> tunnelConnectionStatus;

    /**
     * @return Collection of all tunnels&#39; connection health status.
     * 
     */
    public Output<List<TunnelConnectionHealthResponse>> tunnelConnectionStatus() {
        return this.tunnelConnectionStatus;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Use private local Azure IP for the connection.
     * 
     */
    @Export(name="useLocalAzureIpAddress", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> useLocalAzureIpAddress;

    /**
     * @return Use private local Azure IP for the connection.
     * 
     */
    public Output<Optional<Boolean>> useLocalAzureIpAddress() {
        return Codegen.optional(this.useLocalAzureIpAddress);
    }
    /**
     * Enable policy-based traffic selectors.
     * 
     */
    @Export(name="usePolicyBasedTrafficSelectors", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> usePolicyBasedTrafficSelectors;

    /**
     * @return Enable policy-based traffic selectors.
     * 
     */
    public Output<Optional<Boolean>> usePolicyBasedTrafficSelectors() {
        return Codegen.optional(this.usePolicyBasedTrafficSelectors);
    }
    /**
     * The reference to virtual network gateway resource.
     * 
     */
    @Export(name="virtualNetworkGateway1", type=VirtualNetworkGatewayResponse.class, parameters={})
    private Output<VirtualNetworkGatewayResponse> virtualNetworkGateway1;

    /**
     * @return The reference to virtual network gateway resource.
     * 
     */
    public Output<VirtualNetworkGatewayResponse> virtualNetworkGateway1() {
        return this.virtualNetworkGateway1;
    }
    /**
     * The reference to virtual network gateway resource.
     * 
     */
    @Export(name="virtualNetworkGateway2", type=VirtualNetworkGatewayResponse.class, parameters={})
    private Output</* @Nullable */ VirtualNetworkGatewayResponse> virtualNetworkGateway2;

    /**
     * @return The reference to virtual network gateway resource.
     * 
     */
    public Output<Optional<VirtualNetworkGatewayResponse>> virtualNetworkGateway2() {
        return Codegen.optional(this.virtualNetworkGateway2);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualNetworkGatewayConnection(String name) {
        this(name, VirtualNetworkGatewayConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualNetworkGatewayConnection(String name, VirtualNetworkGatewayConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualNetworkGatewayConnection(String name, VirtualNetworkGatewayConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualNetworkGatewayConnection", name, args == null ? VirtualNetworkGatewayConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualNetworkGatewayConnection(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:VirtualNetworkGatewayConnection", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20150615:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160330:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160601:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20160901:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20161201:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170301:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170601:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170801:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20170901:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171001:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20171101:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180101:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180201:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180401:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180601:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180701:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20180801:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190801:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:VirtualNetworkGatewayConnection").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210801:VirtualNetworkGatewayConnection").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VirtualNetworkGatewayConnection get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualNetworkGatewayConnection(name, id, options);
    }
}
