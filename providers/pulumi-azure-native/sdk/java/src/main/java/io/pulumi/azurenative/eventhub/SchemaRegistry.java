// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventhub.SchemaRegistryArgs;
import io.pulumi.azurenative.eventhub.outputs.SystemDataResponse;
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
 * Single item in List or Get Schema Group operation
 * API Version: 2021-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventhub:SchemaRegistry testSchemaGroup1 /subscriptions/e8baea74-64ce-459b-bee3-5aa4c47b3ae3/resourceGroups/alitest/providers/Microsoft.EventHub/namespaces/ali-ua-test-eh-system-1/schemagroups/testSchemaGroup1 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventhub:SchemaRegistry")
public class SchemaRegistry extends io.pulumi.resources.CustomResource {
    /**
     * Exact time the Schema Group was created.
     * 
     */
    @OutputExport(name="createdAtUtc", type=String.class, parameters={})
    private Output<String> createdAtUtc;

    /**
     * @return Exact time the Schema Group was created.
     * 
     */
    public Output<String> getCreatedAtUtc() {
        return this.createdAtUtc;
    }
    /**
     * The ETag value.
     * 
     */
    @OutputExport(name="eTag", type=String.class, parameters={})
    private Output<String> eTag;

    /**
     * @return The ETag value.
     * 
     */
    public Output<String> getETag() {
        return this.eTag;
    }
    /**
     * dictionary object for SchemaGroup group properties
     * 
     */
    @OutputExport(name="groupProperties", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> groupProperties;

    /**
     * @return dictionary object for SchemaGroup group properties
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getGroupProperties() {
        return this.groupProperties;
    }
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
    @OutputExport(name="schemaCompatibility", type=String.class, parameters={})
    private Output</* @Nullable */ String> schemaCompatibility;

    public Output</* @Nullable */ String> getSchemaCompatibility() {
        return this.schemaCompatibility;
    }
    @OutputExport(name="schemaType", type=String.class, parameters={})
    private Output</* @Nullable */ String> schemaType;

    public Output</* @Nullable */ String> getSchemaType() {
        return this.schemaType;
    }
    /**
     * The system meta data relating to this resource.
     * 
     */
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system meta data relating to this resource.
     * 
     */
    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.EventHub/Namespaces" or "Microsoft.EventHub/Namespaces/EventHubs"
     * 
     */
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.EventHub/Namespaces" or "Microsoft.EventHub/Namespaces/EventHubs"
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * Exact time the Schema Group was updated
     * 
     */
    @OutputExport(name="updatedAtUtc", type=String.class, parameters={})
    private Output<String> updatedAtUtc;

    /**
     * @return Exact time the Schema Group was updated
     * 
     */
    public Output<String> getUpdatedAtUtc() {
        return this.updatedAtUtc;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SchemaRegistry(String name, SchemaRegistryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:SchemaRegistry", name, args == null ? SchemaRegistryArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SchemaRegistry(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventhub:SchemaRegistry", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:eventhub/v20211101:SchemaRegistry").build())
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
    public static SchemaRegistry get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SchemaRegistry(name, id, options);
    }
}
