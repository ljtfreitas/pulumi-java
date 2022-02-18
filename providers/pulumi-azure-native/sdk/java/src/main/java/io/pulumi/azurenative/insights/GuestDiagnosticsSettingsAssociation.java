// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.GuestDiagnosticsSettingsAssociationArgs;
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
 * Virtual machine guest diagnostic settings resource.
 * API Version: 2018-06-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:GuestDiagnosticsSettingsAssociation healthSystemMachineConfigAssociation /subscriptions/8498f01b-8064-4e37-856e-318f3c6c685f/resourceGroups/healthsystem/providers/Microsoft.Compute/virtualMachines/eastussojai/providers/microsoft.insights/guestDiagnosticSettingsAssociation/healthSystemMachineConfigAssociation 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:GuestDiagnosticsSettingsAssociation")
public class GuestDiagnosticsSettingsAssociation extends io.pulumi.resources.CustomResource {
    /**
     * The guest diagnostic settings name.
     * 
     */
    @OutputExport(name="guestDiagnosticSettingsName", type=String.class, parameters={})
    private Output<String> guestDiagnosticSettingsName;

    /**
     * @return The guest diagnostic settings name.
     * 
     */
    public Output<String> getGuestDiagnosticSettingsName() {
        return this.guestDiagnosticSettingsName;
    }
    /**
     * Resource location
     * 
     */
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Azure resource name
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Resource tags
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * Azure resource type
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
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
    public GuestDiagnosticsSettingsAssociation(String name, GuestDiagnosticsSettingsAssociationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:GuestDiagnosticsSettingsAssociation", name, args == null ? GuestDiagnosticsSettingsAssociationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GuestDiagnosticsSettingsAssociation(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:GuestDiagnosticsSettingsAssociation", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:insights/v20180601preview:GuestDiagnosticsSettingsAssociation").build())
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
    public static GuestDiagnosticsSettingsAssociation get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GuestDiagnosticsSettingsAssociation(name, id, options);
    }
}
