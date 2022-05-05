// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kms.GrantArgs;
import com.pulumi.aws.kms.inputs.GrantState;
import com.pulumi.aws.kms.outputs.GrantConstraint;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource-based access control mechanism for a KMS customer master key.
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
 *         var key = new Key(&#34;key&#34;);
 * 
 *         var role = new Role(&#34;role&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Action&#34;: &#34;sts:AssumeRole&#34;,
 *       &#34;Principal&#34;: {
 *         &#34;Service&#34;: &#34;lambda.amazonaws.com&#34;
 *       },
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Sid&#34;: &#34;&#34;
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var grant = new Grant(&#34;grant&#34;, GrantArgs.builder()        
 *             .keyId(key.getKeyId())
 *             .granteePrincipal(role.getArn())
 *             .operations(            
 *                 &#34;Encrypt&#34;,
 *                 &#34;Decrypt&#34;,
 *                 &#34;GenerateDataKey&#34;)
 *             .constraints(GrantConstraint.builder()
 *                 .encryptionContextEquals(Map.of(&#34;Department&#34;, &#34;Finance&#34;))
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * KMS Grants can be imported using the Key ID and Grant ID separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:kms/grant:Grant test 1234abcd-12ab-34cd-56ef-1234567890ab:abcde1237f76e4ba7987489ac329fbfba6ad343d6f7075dbd1ef191f0120514
 * ```
 * 
 */
@ResourceType(type="aws:kms/grant:Grant")
public class Grant extends com.pulumi.resources.CustomResource {
    /**
     * A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
     * 
     */
    @Export(name="constraints", type=List.class, parameters={GrantConstraint.class})
    private Output</* @Nullable */ List<GrantConstraint>> constraints;

    /**
     * @return A structure that you can use to allow certain operations in the grant only when the desired encryption context is present. For more information about encryption context, see [Encryption Context](http://docs.aws.amazon.com/kms/latest/developerguide/encryption-context.html).
     * 
     */
    public Output<Optional<List<GrantConstraint>>> constraints() {
        return Codegen.optional(this.constraints);
    }
    /**
     * A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
     * 
     */
    @Export(name="grantCreationTokens", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> grantCreationTokens;

    /**
     * @return A list of grant tokens to be used when creating the grant. See [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token) for more information about grant tokens.
     * 
     */
    public Output<Optional<List<String>>> grantCreationTokens() {
        return Codegen.optional(this.grantCreationTokens);
    }
    /**
     * The unique identifier for the grant.
     * 
     */
    @Export(name="grantId", type=String.class, parameters={})
    private Output<String> grantId;

    /**
     * @return The unique identifier for the grant.
     * 
     */
    public Output<String> grantId() {
        return this.grantId;
    }
    /**
     * The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
     * 
     */
    @Export(name="grantToken", type=String.class, parameters={})
    private Output<String> grantToken;

    /**
     * @return The grant token for the created grant. For more information, see [Grant Tokens](http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token).
     * 
     */
    public Output<String> grantToken() {
        return this.grantToken;
    }
    /**
     * The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers&#39;s state may not always be refreshed to reflect what is true in AWS.
     * 
     */
    @Export(name="granteePrincipal", type=String.class, parameters={})
    private Output<String> granteePrincipal;

    /**
     * @return The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers&#39;s state may not always be refreshed to reflect what is true in AWS.
     * 
     */
    public Output<String> granteePrincipal() {
        return this.granteePrincipal;
    }
    /**
     * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
     * 
     */
    @Export(name="keyId", type=String.class, parameters={})
    private Output<String> keyId;

    /**
     * @return The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN.
     * 
     */
    public Output<String> keyId() {
        return this.keyId;
    }
    /**
     * A friendly name for identifying the grant.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A friendly name for identifying the grant.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
     * 
     */
    @Export(name="operations", type=List.class, parameters={String.class})
    private Output<List<String>> operations;

    /**
     * @return A list of operations that the grant permits. The permitted values are: `Decrypt`, `Encrypt`, `GenerateDataKey`, `GenerateDataKeyWithoutPlaintext`, `ReEncryptFrom`, `ReEncryptTo`, `Sign`, `Verify`, `GetPublicKey`, `CreateGrant`, `RetireGrant`, `DescribeKey`, `GenerateDataKeyPair`, or `GenerateDataKeyPairWithoutPlaintext`.
     * 
     */
    public Output<List<String>> operations() {
        return this.operations;
    }
    /**
     * -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
     * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
     * 
     */
    @Export(name="retireOnDelete", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> retireOnDelete;

    /**
     * @return -(Defaults to false, Forces new resources) If set to false (the default) the grants will be revoked upon deletion, and if set to true the grants will try to be retired upon deletion. Note that retiring grants requires special permissions, hence why we default to revoking grants.
     * See [RetireGrant](https://docs.aws.amazon.com/kms/latest/APIReference/API_RetireGrant.html) for more information.
     * 
     */
    public Output<Optional<Boolean>> retireOnDelete() {
        return Codegen.optional(this.retireOnDelete);
    }
    /**
     * The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers&#39;s state may not always be refreshed to reflect what is true in AWS.
     * 
     */
    @Export(name="retiringPrincipal", type=String.class, parameters={})
    private Output</* @Nullable */ String> retiringPrincipal;

    /**
     * @return The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers&#39;s state may not always be refreshed to reflect what is true in AWS.
     * 
     */
    public Output<Optional<String>> retiringPrincipal() {
        return Codegen.optional(this.retiringPrincipal);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Grant(String name) {
        this(name, GrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Grant(String name, GrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Grant(String name, GrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/grant:Grant", name, args == null ? GrantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Grant(String name, Output<String> id, @Nullable GrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/grant:Grant", name, state, makeResourceOptions(options, id));
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
    public static Grant get(String name, Output<String> id, @Nullable GrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Grant(name, id, state, options);
    }
}
