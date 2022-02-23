// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iam.PolicyArgs;
import io.pulumi.aws.iam.inputs.PolicyState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an IAM policy.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IAM Policies can be imported using the `arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:iam/policy:Policy administrator arn:aws:iam::123456789012:policy/UsersManageOwnCredentials
 * ```
 * 
 */
@ResourceType(type="aws:iam/policy:Policy")
public class Policy extends io.pulumi.resources.CustomResource {
    /**
     * The ARN assigned by AWS to this policy.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN assigned by AWS to this policy.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Description of the IAM policy.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the IAM policy.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * The name of the policy. If omitted, this provider will assign a random, unique name.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the policy. If omitted, this provider will assign a random, unique name.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @OutputExport(name="namePrefix", type=String.class, parameters={})
    private Output</* @Nullable */ String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output</* @Nullable */ String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * Path in which to create the policy.
     * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
     * 
     */
    @OutputExport(name="path", type=String.class, parameters={})
    private Output</* @Nullable */ String> path;

    /**
     * @return Path in which to create the policy.
     * See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
     * 
     */
    public Output</* @Nullable */ String> getPath() {
        return this.path;
    }
    /**
     * The policy document. This is a JSON formatted string.
     * 
     */
    @OutputExport(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return The policy document. This is a JSON formatted string.
     * 
     */
    public Output<String> getPolicy() {
        return this.policy;
    }
    /**
     * The policy's ID.
     * 
     */
    @OutputExport(name="policyId", type=String.class, parameters={})
    private Output<String> policyId;

    /**
     * @return The policy's ID.
     * 
     */
    public Output<String> getPolicyId() {
        return this.policyId;
    }
    /**
     * Map of resource tags for the IAM Policy
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of resource tags for the IAM Policy
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider.
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider.
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
    public Policy(String name, PolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/policy:Policy", name, args == null ? PolicyArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Policy(String name, Input<String> id, @Nullable PolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/policy:Policy", name, state, makeResourceOptions(options, id));
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
    public static Policy get(String name, Input<String> id, @Nullable PolicyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Policy(name, id, state, options);
    }
}
