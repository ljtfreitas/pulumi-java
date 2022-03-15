// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.autoscaling.TagArgs;
import io.pulumi.aws.autoscaling.inputs.TagState;
import io.pulumi.aws.autoscaling.outputs.TagTag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * `aws_autoscaling_group_tag` can be imported by using the ASG name and key, separated by a comma (`,`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:autoscaling/tag:Tag example asg-example,k8s.io/cluster-autoscaler/node-template/label/eks.amazonaws.com/capacityType
 * ```
 * 
 */
@ResourceType(type="aws:autoscaling/tag:Tag")
public class Tag extends io.pulumi.resources.CustomResource {
    /**
     * The name of the Autoscaling Group to apply the tag to.
     * 
     */
    @Export(name="autoscalingGroupName", type=String.class, parameters={})
    private Output<String> autoscalingGroupName;

    /**
     * @return The name of the Autoscaling Group to apply the tag to.
     * 
     */
    public Output<String> getAutoscalingGroupName() {
        return this.autoscalingGroupName;
    }
    /**
     * The tag to create. The `tag` block is documented below.
     * 
     */
    @Export(name="tag", type=TagTag.class, parameters={})
    private Output<TagTag> tag;

    /**
     * @return The tag to create. The `tag` block is documented below.
     * 
     */
    public Output<TagTag> getTag() {
        return this.tag;
    }

    public interface BuilderApplicator {
        public void apply(TagArgs.Builder a);
    }
    private static io.pulumi.aws.autoscaling.TagArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.autoscaling.TagArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Tag(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Tag(String name) {
        this(name, TagArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tag(String name, TagArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tag(String name, TagArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscaling/tag:Tag", name, args == null ? TagArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Tag(String name, Output<String> id, @Nullable TagState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscaling/tag:Tag", name, state, makeResourceOptions(options, id));
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
    public static Tag get(String name, Output<String> id, @Nullable TagState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Tag(name, id, state, options);
    }
}
