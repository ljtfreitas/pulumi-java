// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.signalrservice.SignalRArgs;
import io.pulumi.azurenative.signalrservice.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.signalrservice.outputs.ResourceSkuResponse;
import io.pulumi.azurenative.signalrservice.outputs.ServerlessUpstreamSettingsResponse;
import io.pulumi.azurenative.signalrservice.outputs.SignalRCorsSettingsResponse;
import io.pulumi.azurenative.signalrservice.outputs.SignalRFeatureResponse;
import io.pulumi.azurenative.signalrservice.outputs.SignalRNetworkACLsResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A class represent a SignalR service resource.
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:signalrservice:SignalR mySignalRService /subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/Microsoft.SignalRService/SignalR/mySignalRService 
 * ```
 * 
 */
@ResourceType(type="azure-native:signalrservice:SignalR")
public class SignalR extends io.pulumi.resources.CustomResource {
    /**
     * Cross-Origin Resource Sharing (CORS) settings.
     * 
     */
    @Export(name="cors", type=SignalRCorsSettingsResponse.class, parameters={})
    private Output</* @Nullable */ SignalRCorsSettingsResponse> cors;

    /**
     * @return Cross-Origin Resource Sharing (CORS) settings.
     * 
     */
    public Output</* @Nullable */ SignalRCorsSettingsResponse> getCors() {
        return this.cors;
    }
    /**
     * The publicly accessible IP of the SignalR service.
     * 
     */
    @Export(name="externalIP", type=String.class, parameters={})
    private Output<String> externalIP;

    /**
     * @return The publicly accessible IP of the SignalR service.
     * 
     */
    public Output<String> getExternalIP() {
        return this.externalIP;
    }
    /**
     * List of SignalR featureFlags. e.g. ServiceMode.
     * 
     * FeatureFlags that are not included in the parameters for the update operation will not be modified.
     * And the response will only include featureFlags that are explicitly set.
     * When a featureFlag is not explicitly set, SignalR service will use its globally default value.
     * But keep in mind, the default value doesn't mean "false". It varies in terms of different FeatureFlags.
     * 
     */
    @Export(name="features", type=List.class, parameters={SignalRFeatureResponse.class})
    private Output</* @Nullable */ List<SignalRFeatureResponse>> features;

    /**
     * @return List of SignalR featureFlags. e.g. ServiceMode.
     * 
     * FeatureFlags that are not included in the parameters for the update operation will not be modified.
     * And the response will only include featureFlags that are explicitly set.
     * When a featureFlag is not explicitly set, SignalR service will use its globally default value.
     * But keep in mind, the default value doesn't mean "false". It varies in terms of different FeatureFlags.
     * 
     */
    public Output</* @Nullable */ List<SignalRFeatureResponse>> getFeatures() {
        return this.features;
    }
    /**
     * FQDN of the SignalR service instance. Format: xxx.service.signalr.net
     * 
     */
    @Export(name="hostName", type=String.class, parameters={})
    private Output<String> hostName;

    /**
     * @return FQDN of the SignalR service instance. Format: xxx.service.signalr.net
     * 
     */
    public Output<String> getHostName() {
        return this.hostName;
    }
    /**
     * Prefix for the hostName of the SignalR service. Retained for future use.
     * The hostname will be of format: &lt;hostNamePrefix&gt;.service.signalr.net.
     * 
     */
    @Export(name="hostNamePrefix", type=String.class, parameters={})
    private Output<String> hostNamePrefix;

    /**
     * @return Prefix for the hostName of the SignalR service. Retained for future use.
     * The hostname will be of format: &lt;hostNamePrefix&gt;.service.signalr.net.
     * 
     */
    public Output<String> getHostNamePrefix() {
        return this.hostNamePrefix;
    }
    /**
     * The kind of the service - e.g. "SignalR", or "RawWebSockets" for "Microsoft.SignalRService/SignalR"
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return The kind of the service - e.g. "SignalR", or "RawWebSockets" for "Microsoft.SignalRService/SignalR"
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * The GEO location of the SignalR service. e.g. West US | East US | North Central US | South Central US.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The GEO location of the SignalR service. e.g. West US | East US | North Central US | South Central US.
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Network ACLs
     * 
     */
    @Export(name="networkACLs", type=SignalRNetworkACLsResponse.class, parameters={})
    private Output</* @Nullable */ SignalRNetworkACLsResponse> networkACLs;

    /**
     * @return Network ACLs
     * 
     */
    public Output</* @Nullable */ SignalRNetworkACLsResponse> getNetworkACLs() {
        return this.networkACLs;
    }
    /**
     * Private endpoint connections to the SignalR resource.
     * 
     */
    @Export(name="privateEndpointConnections", type=List.class, parameters={PrivateEndpointConnectionResponse.class})
    private Output<List<PrivateEndpointConnectionResponse>> privateEndpointConnections;

    /**
     * @return Private endpoint connections to the SignalR resource.
     * 
     */
    public Output<List<PrivateEndpointConnectionResponse>> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Provisioning state of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The publicly accessible port of the SignalR service which is designed for browser/client side usage.
     * 
     */
    @Export(name="publicPort", type=Integer.class, parameters={})
    private Output<Integer> publicPort;

    /**
     * @return The publicly accessible port of the SignalR service which is designed for browser/client side usage.
     * 
     */
    public Output<Integer> getPublicPort() {
        return this.publicPort;
    }
    /**
     * The publicly accessible port of the SignalR service which is designed for customer server side usage.
     * 
     */
    @Export(name="serverPort", type=Integer.class, parameters={})
    private Output<Integer> serverPort;

    /**
     * @return The publicly accessible port of the SignalR service which is designed for customer server side usage.
     * 
     */
    public Output<Integer> getServerPort() {
        return this.serverPort;
    }
    /**
     * The billing information of the resource.(e.g. Free, Standard)
     * 
     */
    @Export(name="sku", type=ResourceSkuResponse.class, parameters={})
    private Output</* @Nullable */ ResourceSkuResponse> sku;

    /**
     * @return The billing information of the resource.(e.g. Free, Standard)
     * 
     */
    public Output</* @Nullable */ ResourceSkuResponse> getSku() {
        return this.sku;
    }
    /**
     * Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags of the service which is a list of key value pairs that describe the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource - e.g. "Microsoft.SignalRService/SignalR"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource - e.g. "Microsoft.SignalRService/SignalR"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Upstream settings when the Azure SignalR is in server-less mode.
     * 
     */
    @Export(name="upstream", type=ServerlessUpstreamSettingsResponse.class, parameters={})
    private Output</* @Nullable */ ServerlessUpstreamSettingsResponse> upstream;

    /**
     * @return Upstream settings when the Azure SignalR is in server-less mode.
     * 
     */
    public Output</* @Nullable */ ServerlessUpstreamSettingsResponse> getUpstream() {
        return this.upstream;
    }
    /**
     * Version of the SignalR resource. Probably you need the same or higher version of client SDKs.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Version of the SignalR resource. Probably you need the same or higher version of client SDKs.
     * 
     */
    public Output<String> getVersion() {
        return this.version;
    }

    public interface BuilderApplicator {
        public void apply(SignalRArgs.Builder a);
    }
    private static io.pulumi.azurenative.signalrservice.SignalRArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.signalrservice.SignalRArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public SignalR(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SignalR(String name) {
        this(name, SignalRArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SignalR(String name, SignalRArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SignalR(String name, SignalRArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:signalrservice:SignalR", name, args == null ? SignalRArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private SignalR(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:signalrservice:SignalR", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:signalrservice/v20180301preview:SignalR").build()),
                Output.of(Alias.builder().setType("azure-native:signalrservice/v20181001:SignalR").build()),
                Output.of(Alias.builder().setType("azure-native:signalrservice/v20200501:SignalR").build()),
                Output.of(Alias.builder().setType("azure-native:signalrservice/v20200701preview:SignalR").build()),
                Output.of(Alias.builder().setType("azure-native:signalrservice/v20210401preview:SignalR").build()),
                Output.of(Alias.builder().setType("azure-native:signalrservice/v20210601preview:SignalR").build()),
                Output.of(Alias.builder().setType("azure-native:signalrservice/v20210901preview:SignalR").build()),
                Output.of(Alias.builder().setType("azure-native:signalrservice/v20211001:SignalR").build())
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
    public static SignalR get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SignalR(name, id, options);
    }
}
