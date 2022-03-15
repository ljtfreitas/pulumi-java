// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appconfiguration.KeyValueArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The key-value resource along with all resource properties.
 * API Version: 2020-07-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:appconfiguration:KeyValue myKey$myLabel /subscriptions/c80fb759-c965-4c6a-9110-9b2b2d038882/resourceGroups/myResourceGroup/providers/Microsoft.AppConfiguration/configurationStores/contoso/keyValues/myKey$myLabel 
 * ```
 * 
 */
@ResourceType(type="azure-native:appconfiguration:KeyValue")
public class KeyValue extends io.pulumi.resources.CustomResource {
    /**
     * The content type of the key-value's value.
     * Providing a proper content-type can enable transformations of values when they are retrieved by applications.
     * 
     */
    @Export(name="contentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentType;

    /**
     * @return The content type of the key-value's value.
     * Providing a proper content-type can enable transformations of values when they are retrieved by applications.
     * 
     */
    public Output</* @Nullable */ String> getContentType() {
        return this.contentType;
    }
    /**
     * An ETag indicating the state of a key-value within a configuration store.
     * 
     */
    @Export(name="eTag", type=String.class, parameters={})
    private Output<String> eTag;

    /**
     * @return An ETag indicating the state of a key-value within a configuration store.
     * 
     */
    public Output<String> getETag() {
        return this.eTag;
    }
    /**
     * The primary identifier of a key-value.
     * The key is used in unison with the label to uniquely identify a key-value.
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return The primary identifier of a key-value.
     * The key is used in unison with the label to uniquely identify a key-value.
     * 
     */
    public Output<String> getKey() {
        return this.key;
    }
    /**
     * A value used to group key-values.
     * The label is used in unison with the key to uniquely identify a key-value.
     * 
     */
    @Export(name="label", type=String.class, parameters={})
    private Output<String> label;

    /**
     * @return A value used to group key-values.
     * The label is used in unison with the key to uniquely identify a key-value.
     * 
     */
    public Output<String> getLabel() {
        return this.label;
    }
    /**
     * The last time a modifying operation was performed on the given key-value.
     * 
     */
    @Export(name="lastModified", type=String.class, parameters={})
    private Output<String> lastModified;

    /**
     * @return The last time a modifying operation was performed on the given key-value.
     * 
     */
    public Output<String> getLastModified() {
        return this.lastModified;
    }
    /**
     * A value indicating whether the key-value is locked.
     * A locked key-value may not be modified until it is unlocked.
     * 
     */
    @Export(name="locked", type=Boolean.class, parameters={})
    private Output<Boolean> locked;

    /**
     * @return A value indicating whether the key-value is locked.
     * A locked key-value may not be modified until it is unlocked.
     * 
     */
    public Output<Boolean> getLocked() {
        return this.locked;
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
     * A dictionary of tags that can help identify what a key-value may be applicable for.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A dictionary of tags that can help identify what a key-value may be applicable for.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> getType() {
        return this.type;
    }
    /**
     * The value of the key-value.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output</* @Nullable */ String> value;

    /**
     * @return The value of the key-value.
     * 
     */
    public Output</* @Nullable */ String> getValue() {
        return this.value;
    }

    public interface BuilderApplicator {
        public void apply(KeyValueArgs.Builder a);
    }
    private static io.pulumi.azurenative.appconfiguration.KeyValueArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.appconfiguration.KeyValueArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public KeyValue(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KeyValue(String name) {
        this(name, KeyValueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KeyValue(String name, KeyValueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeyValue(String name, KeyValueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appconfiguration:KeyValue", name, args == null ? KeyValueArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private KeyValue(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:appconfiguration:KeyValue", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:appconfiguration/v20200701preview:KeyValue").build()),
                Output.of(Alias.builder().setType("azure-native:appconfiguration/v20210301preview:KeyValue").build()),
                Output.of(Alias.builder().setType("azure-native:appconfiguration/v20211001preview:KeyValue").build())
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
    public static KeyValue get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new KeyValue(name, id, options);
    }
}
