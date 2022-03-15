// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dlm;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.dlm.LifecyclePolicyArgs;
import io.pulumi.aws.dlm.inputs.LifecyclePolicyState;
import io.pulumi.aws.dlm.outputs.LifecyclePolicyPolicyDetails;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a [Data Lifecycle Manager (DLM) lifecycle policy](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/snapshot-lifecycle.html) for managing snapshots.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DLM lifecycle policies can be imported by their policy ID
 * 
 * ```sh
 *  $ pulumi import aws:dlm/lifecyclePolicy:LifecyclePolicy example policy-abcdef12345678901
 * ```
 * 
 */
@ResourceType(type="aws:dlm/lifecyclePolicy:LifecyclePolicy")
public class LifecyclePolicy extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the DLM Lifecycle Policy.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A description for the DLM lifecycle policy.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return A description for the DLM lifecycle policy.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The ARN of an IAM role that is able to be assumed by the DLM service.
     * 
     */
    @Export(name="executionRoleArn", type=String.class, parameters={})
    private Output<String> executionRoleArn;

    /**
     * @return The ARN of an IAM role that is able to be assumed by the DLM service.
     * 
     */
    public Output<String> getExecutionRoleArn() {
        return this.executionRoleArn;
    }
    /**
     * See the `policy_details` configuration block. Max of 1.
     * 
     */
    @Export(name="policyDetails", type=LifecyclePolicyPolicyDetails.class, parameters={})
    private Output<LifecyclePolicyPolicyDetails> policyDetails;

    /**
     * @return See the `policy_details` configuration block. Max of 1.
     * 
     */
    public Output<LifecyclePolicyPolicyDetails> getPolicyDetails() {
        return this.policyDetails;
    }
    /**
     * Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output</* @Nullable */ String> state;

    /**
     * @return Whether the lifecycle policy should be enabled or disabled. `ENABLED` or `DISABLED` are valid values. Defaults to `ENABLED`.
     * 
     */
    public Output</* @Nullable */ String> getState() {
        return this.state;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    public interface BuilderApplicator {
        public void apply(LifecyclePolicyArgs.Builder a);
    }
    private static io.pulumi.aws.dlm.LifecyclePolicyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.dlm.LifecyclePolicyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public LifecyclePolicy(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LifecyclePolicy(String name) {
        this(name, LifecyclePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LifecyclePolicy(String name, LifecyclePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LifecyclePolicy(String name, LifecyclePolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dlm/lifecyclePolicy:LifecyclePolicy", name, args == null ? LifecyclePolicyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private LifecyclePolicy(String name, Output<String> id, @Nullable LifecyclePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:dlm/lifecyclePolicy:LifecyclePolicy", name, state, makeResourceOptions(options, id));
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
    public static LifecyclePolicy get(String name, Output<String> id, @Nullable LifecyclePolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LifecyclePolicy(name, id, state, options);
    }
}
