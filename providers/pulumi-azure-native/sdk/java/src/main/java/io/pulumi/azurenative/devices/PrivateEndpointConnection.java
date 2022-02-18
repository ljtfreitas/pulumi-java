// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devices.PrivateEndpointConnectionArgs;
import io.pulumi.azurenative.devices.outputs.PrivateEndpointConnectionPropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The private endpoint connection of an IotHub
 * API Version: 2020-08-31.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devices:PrivateEndpointConnection myPrivateEndpointConnection /subscriptions/91d12660-3dec-467a-be2a-213b5544ddc0/resourceGroups/myResourceGroup/providers/Microsoft.Devices/IotHubs/testHub/PrivateEndpointConnections/myPrivateEndpointConnection 
 * ```
 * 
 */
@ResourceType(type="azure-native:devices:PrivateEndpointConnection")
public class PrivateEndpointConnection extends io.pulumi.resources.CustomResource {
    /**
     * The resource name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The properties of a private endpoint connection
     * 
     */
    @OutputExport(name="properties", type=PrivateEndpointConnectionPropertiesResponse.class, parameters={})
    private Output<PrivateEndpointConnectionPropertiesResponse> properties;

    /**
     * @return The properties of a private endpoint connection
     * 
     */
    public Output<PrivateEndpointConnectionPropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * The resource type.
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
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
    public PrivateEndpointConnection(String name, PrivateEndpointConnectionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devices:PrivateEndpointConnection", name, args == null ? PrivateEndpointConnectionArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private PrivateEndpointConnection(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:devices:PrivateEndpointConnection", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:devices/v20200301:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200401:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200615:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200710preview:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200801:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200831:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20200831preview:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20210201preview:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20210303preview:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20210331:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20210701:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20210701preview:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20210702:PrivateEndpointConnection").build()),
                Input.of(Alias.builder().setType("azure-native:devices/v20210702preview:PrivateEndpointConnection").build())
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
    public static PrivateEndpointConnection get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PrivateEndpointConnection(name, id, options);
    }
}
