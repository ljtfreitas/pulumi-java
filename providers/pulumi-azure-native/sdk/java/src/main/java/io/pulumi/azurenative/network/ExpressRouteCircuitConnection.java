// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.ExpressRouteCircuitConnectionArgs;
import io.pulumi.azurenative.network.outputs.Ipv6CircuitConnectionConfigResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Express Route Circuit Connection in an ExpressRouteCircuitPeering resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:ExpressRouteCircuitConnection circuitConnectionUSAUS /subscriptions/subid1/resourceGroups/dedharcktinit/providers/Microsoft.Network/expressRouteCircuits/ExpressRouteARMCircuitA/peerings/AzurePrivatePeering/connections/circuitConnectionUSAUS 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:ExpressRouteCircuitConnection")
public class ExpressRouteCircuitConnection extends io.pulumi.resources.CustomResource {
    /**
     * /29 IP address space to carve out Customer addresses for tunnels.
     * 
     */
    @Export(name="addressPrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> addressPrefix;

    /**
     * @return /29 IP address space to carve out Customer addresses for tunnels.
     * 
     */
    public Output</* @Nullable */ String> getAddressPrefix() {
        return this.addressPrefix;
    }
    /**
     * The authorization key.
     * 
     */
    @Export(name="authorizationKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> authorizationKey;

    /**
     * @return The authorization key.
     * 
     */
    public Output</* @Nullable */ String> getAuthorizationKey() {
        return this.authorizationKey;
    }
    /**
     * Express Route Circuit connection state.
     * 
     */
    @Export(name="circuitConnectionStatus", type=String.class, parameters={})
    private Output<String> circuitConnectionStatus;

    /**
     * @return Express Route Circuit connection state.
     * 
     */
    public Output<String> getCircuitConnectionStatus() {
        return this.circuitConnectionStatus;
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
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * Reference to Express Route Circuit Private Peering Resource of the circuit initiating connection.
     * 
     */
    @Export(name="expressRouteCircuitPeering", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> expressRouteCircuitPeering;

    /**
     * @return Reference to Express Route Circuit Private Peering Resource of the circuit initiating connection.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getExpressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }
    /**
     * IPv6 Address PrefixProperties of the express route circuit connection.
     * 
     */
    @Export(name="ipv6CircuitConnectionConfig", type=Ipv6CircuitConnectionConfigResponse.class, parameters={})
    private Output</* @Nullable */ Ipv6CircuitConnectionConfigResponse> ipv6CircuitConnectionConfig;

    /**
     * @return IPv6 Address PrefixProperties of the express route circuit connection.
     * 
     */
    public Output</* @Nullable */ Ipv6CircuitConnectionConfigResponse> getIpv6CircuitConnectionConfig() {
        return this.ipv6CircuitConnectionConfig;
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Output</* @Nullable */ String> getName() {
        return this.name;
    }
    /**
     * Reference to Express Route Circuit Private Peering Resource of the peered circuit.
     * 
     */
    @Export(name="peerExpressRouteCircuitPeering", type=SubResourceResponse.class, parameters={})
    private Output</* @Nullable */ SubResourceResponse> peerExpressRouteCircuitPeering;

    /**
     * @return Reference to Express Route Circuit Private Peering Resource of the peered circuit.
     * 
     */
    public Output</* @Nullable */ SubResourceResponse> getPeerExpressRouteCircuitPeering() {
        return this.peerExpressRouteCircuitPeering;
    }
    /**
     * The provisioning state of the express route circuit connection resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the express route circuit connection resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ExpressRouteCircuitConnectionArgs.Builder a);
    }
    private static io.pulumi.azurenative.network.ExpressRouteCircuitConnectionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.network.ExpressRouteCircuitConnectionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ExpressRouteCircuitConnection(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExpressRouteCircuitConnection(String name) {
        this(name, ExpressRouteCircuitConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExpressRouteCircuitConnection(String name, ExpressRouteCircuitConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExpressRouteCircuitConnection(String name, ExpressRouteCircuitConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ExpressRouteCircuitConnection", name, args == null ? ExpressRouteCircuitConnectionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ExpressRouteCircuitConnection(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:network:ExpressRouteCircuitConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:network/v20180201:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180401:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180601:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180701:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20180801:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20181001:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20181101:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20181201:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190201:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190401:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190601:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190701:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190801:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20190901:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20191101:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20191201:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200301:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200401:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200501:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200601:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200701:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20200801:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20201101:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210201:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210301:ExpressRouteCircuitConnection").build()),
                Output.of(Alias.builder().setType("azure-native:network/v20210501:ExpressRouteCircuitConnection").build())
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
    public static ExpressRouteCircuitConnection get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ExpressRouteCircuitConnection(name, id, options);
    }
}
