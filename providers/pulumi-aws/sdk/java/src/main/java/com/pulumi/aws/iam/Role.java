// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iam.RoleArgs;
import com.pulumi.aws.iam.inputs.RoleState;
import com.pulumi.aws.iam.outputs.RoleInlinePolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an IAM role.
 * 
 * &gt; **NOTE:** If policies are attached to the role via the `aws.iam.PolicyAttachment` resource and you are modifying the role `name` or `path`, the `force_detach_policies` argument must be set to `true` and applied before attempting the operation otherwise you will encounter a `DeleteConflict` error. The `aws.iam.RolePolicyAttachment` resource does not have this requirement.
 * 
 * &gt; **NOTE:** If you use this resource&#39;s `managed_policy_arns` argument or `inline_policy` configuration blocks, this resource will take over exclusive management of the role&#39;s respective policy types (e.g., both policy types if both arguments are used). These arguments are incompatible with other ways of managing a role&#39;s policies, such as `aws.iam.PolicyAttachment`, `aws.iam.RolePolicyAttachment`, and `aws.iam.RolePolicy`. If you attempt to manage a role&#39;s policies by multiple means, you will get resource cycling and/or errors.
 * 
 * ## Example Usage
 * ### Basic Example
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testRole = new Role(&#34;testRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;Statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Action&#34;, &#34;sts:AssumeRole&#34;),
 *                         jsonProperty(&#34;Effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;Sid&#34;, &#34;&#34;),
 *                         jsonProperty(&#34;Principal&#34;, jsonObject(
 *                             jsonProperty(&#34;Service&#34;, &#34;ec2.amazonaws.com&#34;)
 *                         ))
 *                     )))
 *                 )))
 *             .tags(Map.of(&#34;tag-key&#34;, &#34;tag-value&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Example of Using Data Source for Assume Role Policy
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
 *         final var instance-assume-role-policy = Output.of(IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatement.builder()
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipal.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;ec2.amazonaws.com&#34;)
 *                     .build())
 *                 .build())
 *             .build()));
 * 
 *         var instance = new Role(&#34;instance&#34;, RoleArgs.builder()        
 *             .path(&#34;/system/&#34;)
 *             .assumeRolePolicy(instance_assume_role_policy.getJson())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Example of Exclusive Inline Policies
 * 
 * This example creates an IAM role with two inline IAM policies. If someone adds another inline policy out-of-band, on the next apply, the provider will remove that policy. If someone deletes these policies out-of-band, the provider will recreate them.
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var inlinePolicy = Output.of(IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatement.builder()
 *                 .actions(&#34;ec2:DescribeAccountAttributes&#34;)
 *                 .resources(&#34;*&#34;)
 *                 .build())
 *             .build()));
 * 
 *         var example = new Role(&#34;example&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(data.getAws_iam_policy_document().getInstance_assume_role_policy().getJson())
 *             .inlinePolicies(            
 *                 RoleInlinePolicy.builder()
 *                     .name(&#34;my_inline_policy&#34;)
 *                     .policy(serializeJson(
 *                         jsonObject(
 *                             jsonProperty(&#34;Version&#34;, &#34;2012-10-17&#34;),
 *                             jsonProperty(&#34;Statement&#34;, jsonArray(jsonObject(
 *                                 jsonProperty(&#34;Action&#34;, jsonArray(&#34;ec2:Describe*&#34;)),
 *                                 jsonProperty(&#34;Effect&#34;, &#34;Allow&#34;),
 *                                 jsonProperty(&#34;Resource&#34;, &#34;*&#34;)
 *                             )))
 *                         )))
 *                     .build(),
 *                 RoleInlinePolicy.builder()
 *                     .name(&#34;policy-8675309&#34;)
 *                     .policy(inlinePolicy.apply(getPolicyDocumentResult -&gt; getPolicyDocumentResult.getJson()))
 *                     .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Example of Removing Inline Policies
 * 
 * This example creates an IAM role with what appears to be empty IAM `inline_policy` argument instead of using `inline_policy` as a configuration block. The result is that if someone were to add an inline policy out-of-band, on the next apply, the provider will remove that policy.
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
 *         var example = new Role(&#34;example&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(data.getAws_iam_policy_document().getInstance_assume_role_policy().getJson())
 *             .inlinePolicies()
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Example of Exclusive Managed Policies
 * 
 * This example creates an IAM role and attaches two managed IAM policies. If someone attaches another managed policy out-of-band, on the next apply, the provider will detach that policy. If someone detaches these policies out-of-band, the provider will attach them again.
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var policyOne = new Policy(&#34;policyOne&#34;, PolicyArgs.builder()        
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;Statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Action&#34;, jsonArray(&#34;ec2:Describe*&#34;)),
 *                         jsonProperty(&#34;Effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;Resource&#34;, &#34;*&#34;)
 *                     )))
 *                 )))
 *             .build());
 * 
 *         var policyTwo = new Policy(&#34;policyTwo&#34;, PolicyArgs.builder()        
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;Version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;Statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;Action&#34;, jsonArray(
 *                             &#34;s3:ListAllMyBuckets&#34;, 
 *                             &#34;s3:ListBucket&#34;, 
 *                             &#34;s3:HeadBucket&#34;
 *                         )),
 *                         jsonProperty(&#34;Effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;Resource&#34;, &#34;*&#34;)
 *                     )))
 *                 )))
 *             .build());
 * 
 *         var example = new Role(&#34;example&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(data.getAws_iam_policy_document().getInstance_assume_role_policy().getJson())
 *             .managedPolicyArns(            
 *                 policyOne.getArn(),
 *                 policyTwo.getArn())
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Example of Removing Managed Policies
 * 
 * This example creates an IAM role with an empty `managed_policy_arns` argument. If someone attaches a policy out-of-band, on the next apply, the provider will detach that policy.
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
 *         var example = new Role(&#34;example&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(data.getAws_iam_policy_document().getInstance_assume_role_policy().getJson())
 *             .managedPolicyArns()
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * IAM Roles can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:iam/role:Role developer developer_name
 * ```
 * 
 */
@ResourceType(type="aws:iam/role:Role")
public class Role extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) specifying the role.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) specifying the role.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Policy that grants an entity permission to assume the role.
     * 
     */
    @Export(name="assumeRolePolicy", type=String.class, parameters={})
    private Output<String> assumeRolePolicy;

    /**
     * @return Policy that grants an entity permission to assume the role.
     * 
     */
    public Output<String> assumeRolePolicy() {
        return this.assumeRolePolicy;
    }
    /**
     * Creation date of the IAM role.
     * 
     */
    @Export(name="createDate", type=String.class, parameters={})
    private Output<String> createDate;

    /**
     * @return Creation date of the IAM role.
     * 
     */
    public Output<String> createDate() {
        return this.createDate;
    }
    /**
     * Description of the role.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the role.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether to force detaching any policies the role has before destroying it. Defaults to `false`.
     * 
     */
    @Export(name="forceDetachPolicies", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDetachPolicies;

    /**
     * @return Whether to force detaching any policies the role has before destroying it. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> forceDetachPolicies() {
        return Codegen.optional(this.forceDetachPolicies);
    }
    /**
     * Configuration block defining an exclusive set of IAM inline policies associated with the IAM role. See below. If no blocks are configured, this provider will not manage any inline policies in this resource. Configuring one empty block (i.e., `inline_policy {}`) will cause the provider to remove _all_ inline policies added out of band on `apply`.
     * 
     */
    @Export(name="inlinePolicies", type=List.class, parameters={RoleInlinePolicy.class})
    private Output<List<RoleInlinePolicy>> inlinePolicies;

    /**
     * @return Configuration block defining an exclusive set of IAM inline policies associated with the IAM role. See below. If no blocks are configured, this provider will not manage any inline policies in this resource. Configuring one empty block (i.e., `inline_policy {}`) will cause the provider to remove _all_ inline policies added out of band on `apply`.
     * 
     */
    public Output<List<RoleInlinePolicy>> inlinePolicies() {
        return this.inlinePolicies;
    }
    /**
     * Set of exclusive IAM managed policy ARNs to attach to the IAM role. If this attribute is not configured, this provider will ignore policy attachments to this resource. When configured, the provider will align the role&#39;s managed policy attachments with this set by attaching or detaching managed policies. Configuring an empty set (i.e., `managed_policy_arns = []`) will cause the provider to remove _all_ managed policy attachments.
     * 
     */
    @Export(name="managedPolicyArns", type=List.class, parameters={String.class})
    private Output<List<String>> managedPolicyArns;

    /**
     * @return Set of exclusive IAM managed policy ARNs to attach to the IAM role. If this attribute is not configured, this provider will ignore policy attachments to this resource. When configured, the provider will align the role&#39;s managed policy attachments with this set by attaching or detaching managed policies. Configuring an empty set (i.e., `managed_policy_arns = []`) will cause the provider to remove _all_ managed policy attachments.
     * 
     */
    public Output<List<String>> managedPolicyArns() {
        return this.managedPolicyArns;
    }
    /**
     * Maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
     * 
     */
    @Export(name="maxSessionDuration", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxSessionDuration;

    /**
     * @return Maximum session duration (in seconds) that you want to set for the specified role. If you do not specify a value for this setting, the default maximum of one hour is applied. This setting can have a value from 1 hour to 12 hours.
     * 
     */
    public Output<Optional<Integer>> maxSessionDuration() {
        return Codegen.optional(this.maxSessionDuration);
    }
    /**
     * Name of the role policy.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the role policy.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique friendly name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * Path to the role. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
     * 
     */
    @Export(name="path", type=String.class, parameters={})
    private Output</* @Nullable */ String> path;

    /**
     * @return Path to the role. See [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) for more information.
     * 
     */
    public Output<Optional<String>> path() {
        return Codegen.optional(this.path);
    }
    /**
     * ARN of the policy that is used to set the permissions boundary for the role.
     * 
     */
    @Export(name="permissionsBoundary", type=String.class, parameters={})
    private Output</* @Nullable */ String> permissionsBoundary;

    /**
     * @return ARN of the policy that is used to set the permissions boundary for the role.
     * 
     */
    public Output<Optional<String>> permissionsBoundary() {
        return Codegen.optional(this.permissionsBoundary);
    }
    /**
     * Key-value mapping of tags for the IAM role. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of tags for the IAM role. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Stable and unique string identifying the role.
     * 
     */
    @Export(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return Stable and unique string identifying the role.
     * 
     */
    public Output<String> uniqueId() {
        return this.uniqueId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Role(String name) {
        this(name, RoleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Role(String name, RoleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Role(String name, RoleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/role:Role", name, args == null ? RoleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Role(String name, Output<String> id, @Nullable RoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/role:Role", name, state, makeResourceOptions(options, id));
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
    public static Role get(String name, Output<String> id, @Nullable RoleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Role(name, id, state, options);
    }
}
