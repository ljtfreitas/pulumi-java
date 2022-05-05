// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.batch.SchedulingPolicyArgs;
import com.pulumi.aws.batch.inputs.SchedulingPolicyState;
import com.pulumi.aws.batch.outputs.SchedulingPolicyFairSharePolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Batch Scheduling Policy resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new SchedulingPolicy(&#34;example&#34;, SchedulingPolicyArgs.builder()        
 *             .fairSharePolicy(SchedulingPolicyFairSharePolicy.builder()
 *                 .computeReservation(1)
 *                 .shareDecaySeconds(3600)
 *                 .shareDistributions(                
 *                     SchedulingPolicyFairSharePolicyShareDistribution.builder()
 *                         .shareIdentifier(&#34;A1*&#34;)
 *                         .weightFactor(0.1)
 *                         .build(),
 *                     SchedulingPolicyFairSharePolicyShareDistribution.builder()
 *                         .shareIdentifier(&#34;A2&#34;)
 *                         .weightFactor(0.2)
 *                         .build())
 *                 .build())
 *             .tags(Map.of(&#34;Name&#34;, &#34;Example Batch Scheduling Policy&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
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
public class SchedulingPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name of the scheduling policy.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name of the scheduling policy.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="fairSharePolicy", type=SchedulingPolicyFairSharePolicy.class, parameters={})
    private Output</* @Nullable */ SchedulingPolicyFairSharePolicy> fairSharePolicy;

    public Output<Optional<SchedulingPolicyFairSharePolicy>> fairSharePolicy() {
        return Codegen.optional(this.fairSharePolicy);
    }
    /**
     * Specifies the name of the scheduling policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the scheduling policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SchedulingPolicy(String name) {
        this(name, SchedulingPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SchedulingPolicy(String name, @Nullable SchedulingPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SchedulingPolicy(String name, @Nullable SchedulingPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:batch/schedulingPolicy:SchedulingPolicy", name, args == null ? SchedulingPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SchedulingPolicy(String name, Output<String> id, @Nullable SchedulingPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:batch/schedulingPolicy:SchedulingPolicy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static SchedulingPolicy get(String name, Output<String> id, @Nullable SchedulingPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SchedulingPolicy(name, id, state, options);
    }
}
