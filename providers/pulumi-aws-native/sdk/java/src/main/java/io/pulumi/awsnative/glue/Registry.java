// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.glue.RegistryArgs;
import io.pulumi.awsnative.glue.outputs.RegistryTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * This resource creates a Registry for authoring schemas as part of Glue Schema Registry.
 * 
 */
@ResourceType(type="aws-native:glue:Registry")
public class Registry extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name for the created Registry.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name for the created Registry.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A description of the registry. If description is not provided, there will not be any default value for this.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the registry. If description is not provided, there will not be any default value for this.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Name of the registry to be created of max length of 255, and may only contain letters, numbers, hyphen, underscore, dollar sign, or hash mark.  No whitespace.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the registry to be created of max length of 255, and may only contain letters, numbers, hyphen, underscore, dollar sign, or hash mark.  No whitespace.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * List of tags to tag the Registry
     * 
     */
    @Export(name="tags", type=List.class, parameters={RegistryTag.class})
    private Output</* @Nullable */ List<RegistryTag>> tags;

    /**
     * @return List of tags to tag the Registry
     * 
     */
    public Output</* @Nullable */ List<RegistryTag>> getTags() {
        return this.tags;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable RegistryArgs.Builder a);
    }
    private static io.pulumi.awsnative.glue.RegistryArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.awsnative.glue.RegistryArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Registry(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Registry(String name) {
        this(name, RegistryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Registry(String name, @Nullable RegistryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Registry(String name, @Nullable RegistryArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:glue:Registry", name, args == null ? RegistryArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Registry(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:glue:Registry", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
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
    public static Registry get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Registry(name, id, options);
    }
}
