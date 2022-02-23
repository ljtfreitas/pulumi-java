// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.batch;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.batch.SchedulingPolicyArgs;
import io.pulumi.aws.batch.inputs.SchedulingPolicyState;
import io.pulumi.aws.batch.outputs.SchedulingPolicyFairSharePolicy;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Batch Scheduling Policy resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Batch Scheduling Policy can be imported using the `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:batch/schedulingPolicy:SchedulingPolicy test_policy arn:aws:batch:us-east-1:123456789012:scheduling-policy/sample
 * ```
 * 
 */
@ResourceType(type="aws:batch/schedulingPolicy:SchedulingPolicy")
public class SchedulingPolicy extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name of the scheduling policy.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name of the scheduling policy.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="fairSharePolicy", type=SchedulingPolicyFairSharePolicy.class, parameters={})
    private Output</* @Nullable */ SchedulingPolicyFairSharePolicy> fairSharePolicy;

    public Output</* @Nullable */ SchedulingPolicyFairSharePolicy> getFairSharePolicy() {
        return this.fairSharePolicy;
    }
    /**
     * Specifies the name of the scheduling policy.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the scheduling policy.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SchedulingPolicy(String name, @Nullable SchedulingPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:batch/schedulingPolicy:SchedulingPolicy", name, args == null ? SchedulingPolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private SchedulingPolicy(String name, Input<String> id, @Nullable SchedulingPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:batch/schedulingPolicy:SchedulingPolicy", name, state, makeResourceOptions(options, id));
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
    public static SchedulingPolicy get(String name, Input<String> id, @Nullable SchedulingPolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new SchedulingPolicy(name, id, state, options);
    }
}