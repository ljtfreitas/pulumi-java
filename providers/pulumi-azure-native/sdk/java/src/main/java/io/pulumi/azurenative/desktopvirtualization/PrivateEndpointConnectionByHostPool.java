// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.desktopvirtualization.PrivateEndpointConnectionByHostPoolArgs;
import io.pulumi.azurenative.desktopvirtualization.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.desktopvirtualization.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.azurenative.desktopvirtualization.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The Private Endpoint Connection resource.
 * API Version: 2021-04-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:desktopvirtualization:PrivateEndpointConnectionByHostPool hostPool1.377103f1-5179-4bdf-8556-4cdd3207cc5b /subscriptions/daefabc0-95b4-48b3-b645-8a753a63c4fa/resourceGroups/resourceGroup1/providers/Microsoft.DesktopVirtualization/hostpools/hostPool1/privateEndpointConnections/hostPool1.377103f1-5179-4bdf-8556-4cdd3207cc5b 
 * ```
 * 
 */
@ResourceType(type="azure-native:desktopvirtualization:PrivateEndpointConnectionByHostPool")
public class PrivateEndpointConnectionByHostPool extends io.pulumi.resources.CustomResource {
    /**
     * The name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The resource of private end point.
     * 
     */
    @OutputExport(name="privateEndpoint", type=PrivateEndpointResponse.class, parameters={})
    private Output</* @Nullable */ PrivateEndpointResponse> privateEndpoint;

    /**
     * @return The resource of private end point.
     * 
     */
    public Output</* @Nullable */ PrivateEndpointResponse> getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @OutputExport(name="privateLinkServiceConnectionState", type=PrivateLinkServiceConnectionStateResponse.class, parameters={})
    private Output<PrivateLinkServiceConnectionStateResponse> privateLinkServiceConnectionState;

    /**
     * @return A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    public Output<PrivateLinkServiceConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    /**
     * The provisioning state of the private endpoint connection resource.
     * 
     */
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the private endpoint connection resource.
     * 
     */
    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Metadata pertaining to creation and last modification of the resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PrivateEndpointConnectionByHostPool(String name, PrivateEndpointConnectionByHostPoolArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:PrivateEndpointConnectionByHostPool", name, args == null ? PrivateEndpointConnectionByHostPoolArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateEndpointConnectionByHostPool(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:PrivateEndpointConnectionByHostPool", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210401preview:PrivateEndpointConnectionByHostPool").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210903preview:PrivateEndpointConnectionByHostPool").build())
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
    public static PrivateEndpointConnectionByHostPool get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointConnectionByHostPool(name, id, options);
    }
}
