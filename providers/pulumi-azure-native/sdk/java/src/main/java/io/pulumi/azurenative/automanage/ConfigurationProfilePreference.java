// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automanage;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automanage.ConfigurationProfilePreferenceArgs;
import io.pulumi.azurenative.automanage.outputs.ConfigurationProfilePreferencePropertiesResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Definition of the configuration profile preference.
 * API Version: 2020-06-30-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:automanage:ConfigurationProfilePreference defaultProfilePreference /subscriptions/subscriptionId/resourceGroups/myResourceGroupName/providers/Microsoft.Automanage/configurationProfilePreferences/defaultProfilePreference 
 * ```
 * 
 */
@ResourceType(type="azure-native:automanage:ConfigurationProfilePreference")
public class ConfigurationProfilePreference extends io.pulumi.resources.CustomResource {
    /**
     * The geo-location where the resource lives
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
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
     * Properties of the configuration profile preference.
     * 
     */
    @OutputExport(name="properties", type=ConfigurationProfilePreferencePropertiesResponse.class, parameters={})
    private Output<ConfigurationProfilePreferencePropertiesResponse> properties;

    /**
     * @return Properties of the configuration profile preference.
     * 
     */
    public Output<ConfigurationProfilePreferencePropertiesResponse> getProperties() {
        return this.properties;
    }
    /**
     * Resource tags.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
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
    public ConfigurationProfilePreference(String name, ConfigurationProfilePreferenceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automanage:ConfigurationProfilePreference", name, args == null ? ConfigurationProfilePreferenceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ConfigurationProfilePreference(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:automanage:ConfigurationProfilePreference", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:automanage/v20200630preview:ConfigurationProfilePreference").build())
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
    public static ConfigurationProfilePreference get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ConfigurationProfilePreference(name, id, options);
    }
}
