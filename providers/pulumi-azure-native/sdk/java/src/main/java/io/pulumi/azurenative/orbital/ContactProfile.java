// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.orbital.ContactProfileArgs;
import io.pulumi.azurenative.orbital.outputs.ContactProfileLinkResponse;
import io.pulumi.azurenative.orbital.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Customer creates a Contact Profile Resource, which will contain all of the configurations required for scheduling a contact.
 * API Version: 2021-04-04-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:orbital:ContactProfile contactProfile1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Orbital/contactProfiles/contactProfile1 
 * ```
 * 
 */
@ResourceType(type="azure-native:orbital:ContactProfile")
public class ContactProfile extends io.pulumi.resources.CustomResource {
    /**
     * Auto track configuration.
     * 
     */
    @Export(name="autoTrackingConfiguration", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoTrackingConfiguration;

    /**
     * @return Auto track configuration.
     * 
     */
    public Output</* @Nullable */ String> getAutoTrackingConfiguration() {
        return this.autoTrackingConfiguration;
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
     * The URI of the Event Hub used for telemetry
     * 
     */
    @Export(name="eventHubUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubUri;

    /**
     * @return The URI of the Event Hub used for telemetry
     * 
     */
    public Output</* @Nullable */ String> getEventHubUri() {
        return this.eventHubUri;
    }
    /**
     * Links of the Contact Profile
     * 
     */
    @Export(name="links", type=List.class, parameters={ContactProfileLinkResponse.class})
    private Output<List<ContactProfileLinkResponse>> links;

    /**
     * @return Links of the Contact Profile
     * 
     */
    public Output<List<ContactProfileLinkResponse>> getLinks() {
        return this.links;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> getLocation() {
        return this.location;
    }
    /**
     * Minimum viable elevation for the contact in decimal degrees.
     * 
     */
    @Export(name="minimumElevationDegrees", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> minimumElevationDegrees;

    /**
     * @return Minimum viable elevation for the contact in decimal degrees.
     * 
     */
    public Output</* @Nullable */ Double> getMinimumElevationDegrees() {
        return this.minimumElevationDegrees;
    }
    /**
     * Minimum viable contact duration in ISO 8601 format.
     * 
     */
    @Export(name="minimumViableContactDuration", type=String.class, parameters={})
    private Output</* @Nullable */ String> minimumViableContactDuration;

    /**
     * @return Minimum viable contact duration in ISO 8601 format.
     * 
     */
    public Output</* @Nullable */ String> getMinimumViableContactDuration() {
        return this.minimumViableContactDuration;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
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
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(ContactProfileArgs.Builder a);
    }
    private static io.pulumi.azurenative.orbital.ContactProfileArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.orbital.ContactProfileArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ContactProfile(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContactProfile(String name) {
        this(name, ContactProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContactProfile(String name, ContactProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContactProfile(String name, ContactProfileArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:orbital:ContactProfile", name, args == null ? ContactProfileArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ContactProfile(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:orbital:ContactProfile", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:orbital/v20210404preview:ContactProfile").build())
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
    public static ContactProfile get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ContactProfile(name, id, options);
    }
}
