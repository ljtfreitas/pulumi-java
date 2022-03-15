// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.servicecatalog.TagOptionArgs;
import io.pulumi.aws.servicecatalog.inputs.TagOptionState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Service Catalog Tag Option.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_servicecatalog_tag_option` can be imported using the tag option ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:servicecatalog/tagOption:TagOption example tag-pjtvagohlyo3m
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/tagOption:TagOption")
public class TagOption extends io.pulumi.resources.CustomResource {
    /**
     * Whether tag option is active. Default is `true`.
     * 
     */
    @Export(name="active", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return Whether tag option is active. Default is `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getActive() {
        return this.active;
    }
    /**
     * Tag option key.
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return Tag option key.
     * 
     */
    public Output<String> getKey() {
        return this.key;
    }
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    public Output<String> getOwner() {
        return this.owner;
    }
    /**
     * Tag option value.
     * 
     */
    @Export(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return Tag option value.
     * 
     */
    public Output<String> getValue() {
        return this.value;
    }

    public interface BuilderApplicator {
        public void apply(TagOptionArgs.Builder a);
    }
    private static io.pulumi.aws.servicecatalog.TagOptionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.servicecatalog.TagOptionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public TagOption(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagOption(String name) {
        this(name, TagOptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagOption(String name, TagOptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagOption(String name, TagOptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/tagOption:TagOption", name, args == null ? TagOptionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private TagOption(String name, Output<String> id, @Nullable TagOptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/tagOption:TagOption", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TagOption get(String name, Output<String> id, @Nullable TagOptionState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TagOption(name, id, state, options);
    }
}
