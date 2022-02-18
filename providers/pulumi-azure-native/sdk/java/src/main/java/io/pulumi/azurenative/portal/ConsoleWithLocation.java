// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.portal.ConsoleWithLocationArgs;
import io.pulumi.azurenative.portal.outputs.ConsolePropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Cloud shell console
 * API Version: 2018-10-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:portal:ConsoleWithLocation myresource1 /providers/Microsoft.Portal/locations/{location}/consoles/{consoleName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:portal:ConsoleWithLocation")
public class ConsoleWithLocation extends io.pulumi.resources.CustomResource {
    /**
     * Cloud shell console properties.
     * 
     */
    @OutputExport(name="properties", type=ConsolePropertiesResponse.class, parameters={})
    private Output<ConsolePropertiesResponse> properties;

    /**
     * @return Cloud shell console properties.
     * 
     */
    public Output<ConsolePropertiesResponse> getProperties() {
        return this.properties;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConsoleWithLocation(String name, ConsoleWithLocationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:portal:ConsoleWithLocation", name, args == null ? ConsoleWithLocationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConsoleWithLocation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:portal:ConsoleWithLocation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:portal/v20181001:ConsoleWithLocation").build())
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
    public static ConsoleWithLocation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConsoleWithLocation(name, id, options);
    }
}
