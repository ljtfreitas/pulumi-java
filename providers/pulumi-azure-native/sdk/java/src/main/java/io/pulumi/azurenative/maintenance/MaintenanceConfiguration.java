// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.maintenance;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.maintenance.MaintenanceConfigurationArgs;
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
 * Maintenance configuration record type
 * API Version: 2020-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:maintenance:MaintenanceConfiguration configuration1 /subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourcegroups/examplerg/providers/Microsoft.Maintenance/maintenanceConfigurations/configuration1 
 * ```
 * 
 */
@ResourceType(type="azure-native:maintenance:MaintenanceConfiguration")
public class MaintenanceConfiguration extends io.pulumi.resources.CustomResource {
    /**
     * Gets or sets extensionProperties of the maintenanceConfiguration. This is for future use only and would be a set of key value pairs for additional information e.g. whether to follow SDP etc.
     * 
     */
    @OutputExport(name="extensionProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> extensionProperties;

    /**
     * @return Gets or sets extensionProperties of the maintenanceConfiguration. This is for future use only and would be a set of key value pairs for additional information e.g. whether to follow SDP etc.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getExtensionProperties() {
        return this.extensionProperties;
    }
    /**
     * Gets or sets location of the resource
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Gets or sets location of the resource
     * 
     */
    public Output</* @Nullable */ String> getLocation() {
        return this.location;
    }
    /**
     * Gets or sets maintenanceScope of the configuration. It represent the impact area of the maintenance
     * 
     */
    @OutputExport(name="maintenanceScope", type=String.class, parameters={})
    private Output</* @Nullable */ String> maintenanceScope;

    /**
     * @return Gets or sets maintenanceScope of the configuration. It represent the impact area of the maintenance
     * 
     */
    public Output</* @Nullable */ String> getMaintenanceScope() {
        return this.maintenanceScope;
    }
    /**
     * Name of the resource
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Gets or sets namespace of the resource e.g. Microsoft.Maintenance or Microsoft.Sql
     * 
     */
    @OutputExport(name="namespace", type=String.class, parameters={})
    private Output</* @Nullable */ String> namespace;

    /**
     * @return Gets or sets namespace of the resource e.g. Microsoft.Maintenance or Microsoft.Sql
     * 
     */
    public Output</* @Nullable */ String> getNamespace() {
        return this.namespace;
    }
    /**
     * Gets or sets tags of the resource
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Gets or sets tags of the resource
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Type of the resource
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the resource
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
    public MaintenanceConfiguration(String name, MaintenanceConfigurationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:maintenance:MaintenanceConfiguration", name, args == null ? MaintenanceConfigurationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private MaintenanceConfiguration(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:maintenance:MaintenanceConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:maintenance/v20180601preview:MaintenanceConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:maintenance/v20200401:MaintenanceConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:maintenance/v20200701preview:MaintenanceConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:maintenance/v20210401preview:MaintenanceConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:maintenance/v20210501:MaintenanceConfiguration").build()),
                Input.of(Alias.builder().setType("azure-native:maintenance/v20210901preview:MaintenanceConfiguration").build())
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
    public static MaintenanceConfiguration get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new MaintenanceConfiguration(name, id, options);
    }
}
