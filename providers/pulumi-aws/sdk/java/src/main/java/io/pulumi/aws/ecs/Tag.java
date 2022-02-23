// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ecs.TagArgs;
import io.pulumi.aws.ecs.inputs.TagState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * `aws_ecs_tag` can be imported by using the ECS resource identifier and key, separated by a comma (`,`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ecs/tag:Tag example arn:aws:ecs:us-east-1:123456789012:cluster/example,Name
 * ```
 * 
 */
@ResourceType(type="aws:ecs/tag:Tag")
public class Tag extends io.pulumi.resources.CustomResource {
    /**
     * Tag name.
     * 
     */
    @OutputExport(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return Tag name.
     * 
     */
    public Output<String> getKey() {
        return this.key;
    }
    /**
     * Amazon Resource Name (ARN) of the ECS resource to tag.
     * 
     */
    @OutputExport(name="resourceArn", type=String.class, parameters={})
    private Output<String> resourceArn;

    /**
     * @return Amazon Resource Name (ARN) of the ECS resource to tag.
     * 
     */
    public Output<String> getResourceArn() {
        return this.resourceArn;
    }
    /**
     * Tag value.
     * 
     */
    @OutputExport(name="value", type=String.class, parameters={})
    private Output<String> value;

    /**
     * @return Tag value.
     * 
     */
    public Output<String> getValue() {
        return this.value;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tag(String name, TagArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/tag:Tag", name, args == null ? TagArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Tag(String name, Input<String> id, @Nullable TagState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ecs/tag:Tag", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
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
    public static Tag get(String name, Input<String> id, @Nullable TagState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Tag(name, id, state, options);
    }
}
