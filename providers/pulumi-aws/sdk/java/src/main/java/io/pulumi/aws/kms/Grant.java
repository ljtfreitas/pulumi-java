// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kms;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.kms.GrantArgs;
import io.pulumi.aws.kms.inputs.GrantState;
import io.pulumi.aws.kms.outputs.GrantConstraint;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a resource-based access control mechanism for a KMS customer master key.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * KMS Grants can be imported using the Key ID and Grant ID separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:kms/grant:Grant test 1234abcd-12ab-34cd-56ef-1234567890ababcde1237f76e4ba7987489ac329fbfba6ad343d6f7075dbd1ef191f0120514
 * ```
 * 
 */
@ResourceType(type="aws:kms/grant:Grant")
public class Grant extends io.pulumi.resources.CustomResource {
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
    public Output</* @Nullable */ List<GrantConstraint>> getConstraints() {
        return this.constraints;
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
    public Output</* @Nullable */ List<String>> getGrantCreationTokens() {
        return this.grantCreationTokens;
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
    public Output<String> getGrantId() {
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
    public Output<String> getGrantToken() {
        return this.grantToken;
    }
    /**
     * The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
     * 
     */
    @Export(name="granteePrincipal", type=String.class, parameters={})
    private Output<String> granteePrincipal;

    /**
     * @return The principal that is given permission to perform the operations that the grant permits in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
     * 
     */
    public Output<String> getGranteePrincipal() {
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
    public Output<String> getKeyId() {
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
    public Output<String> getName() {
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
    public Output<List<String>> getOperations() {
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
    public Output</* @Nullable */ Boolean> getRetireOnDelete() {
        return this.retireOnDelete;
    }
    /**
     * The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
     * 
     */
    @Export(name="retiringPrincipal", type=String.class, parameters={})
    private Output</* @Nullable */ String> retiringPrincipal;

    /**
     * @return The principal that is given permission to retire the grant by using RetireGrant operation in ARN format. Note that due to eventual consistency issues around IAM principals, the providers's state may not always be refreshed to reflect what is true in AWS.
     * 
     */
    public Output</* @Nullable */ String> getRetiringPrincipal() {
        return this.retiringPrincipal;
    }

    public interface BuilderApplicator {
        public void apply(GrantArgs.Builder a);
    }
    private static io.pulumi.aws.kms.GrantArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.kms.GrantArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Grant(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
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
    public Grant(String name, GrantArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/grant:Grant", name, args == null ? GrantArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Grant(String name, Output<String> id, @Nullable GrantState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/grant:Grant", name, state, makeResourceOptions(options, id));
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
    public static Grant get(String name, Output<String> id, @Nullable GrantState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Grant(name, id, state, options);
    }
}
