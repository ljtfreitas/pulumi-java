// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iam.AccessKeyArgs;
import io.pulumi.aws.iam.inputs.AccessKeyState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an IAM access key. This is a set of credentials that allow API requests to be made as an IAM user.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * IAM Access Keys can be imported using the identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:iam/accessKey:AccessKey example AKIA1234567890
 * ```
 * 
 *  Resource attributes such as `encrypted_secret`, `key_fingerprint`, `pgp_key`, `secret`, `ses_smtp_password_v4`, and `encrypted_ses_smtp_password_v4` are not available for imported resources as this information cannot be read from the IAM API.
 * 
 */
@ResourceType(type="aws:iam/accessKey:AccessKey")
public class AccessKey extends io.pulumi.resources.CustomResource {
    /**
     * Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the access key was created.
     * 
     */
    @Export(name="createDate", type=String.class, parameters={})
    private Output<String> createDate;

    /**
     * @return Date and time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) that the access key was created.
     * 
     */
    public Output<String> getCreateDate() {
        return this.createDate;
    }
    @Export(name="encryptedSecret", type=String.class, parameters={})
    private Output<String> encryptedSecret;

    public Output<String> getEncryptedSecret() {
        return this.encryptedSecret;
    }
    @Export(name="encryptedSesSmtpPasswordV4", type=String.class, parameters={})
    private Output<String> encryptedSesSmtpPasswordV4;

    public Output<String> getEncryptedSesSmtpPasswordV4() {
        return this.encryptedSesSmtpPasswordV4;
    }
    /**
     * Fingerprint of the PGP key used to encrypt the secret. This attribute is not available for imported resources.
     * 
     */
    @Export(name="keyFingerprint", type=String.class, parameters={})
    private Output<String> keyFingerprint;

    /**
     * @return Fingerprint of the PGP key used to encrypt the secret. This attribute is not available for imported resources.
     * 
     */
    public Output<String> getKeyFingerprint() {
        return this.keyFingerprint;
    }
    /**
     * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`, for use in the `encrypted_secret` output attribute.
     * 
     */
    @Export(name="pgpKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> pgpKey;

    /**
     * @return Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:some_person_that_exists`, for use in the `encrypted_secret` output attribute.
     * 
     */
    public Output</* @Nullable */ String> getPgpKey() {
        return this.pgpKey;
    }
    /**
     * Secret access key. This attribute is not available for imported resources. Note that this will be written to the state file. If you use this, please protect your backend state file judiciously. Alternatively, you may supply a `pgp_key` instead, which will prevent the secret from being stored in plaintext, at the cost of preventing the use of the secret key in automation.
     * 
     */
    @Export(name="secret", type=String.class, parameters={})
    private Output<String> secret;

    /**
     * @return Secret access key. This attribute is not available for imported resources. Note that this will be written to the state file. If you use this, please protect your backend state file judiciously. Alternatively, you may supply a `pgp_key` instead, which will prevent the secret from being stored in plaintext, at the cost of preventing the use of the secret key in automation.
     * 
     */
    public Output<String> getSecret() {
        return this.secret;
    }
    /**
     * Secret access key converted into an SES SMTP password by applying [AWS's documented Sigv4 conversion algorithm](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/smtp-credentials.html#smtp-credentials-convert). This attribute is not available for imported resources. As SigV4 is region specific, valid Provider regions are `ap-south-1`, `ap-southeast-2`, `eu-central-1`, `eu-west-1`, `us-east-1` and `us-west-2`. See current [AWS SES regions](https://docs.aws.amazon.com/general/latest/gr/rande.html#ses_region).
     * 
     */
    @Export(name="sesSmtpPasswordV4", type=String.class, parameters={})
    private Output<String> sesSmtpPasswordV4;

    /**
     * @return Secret access key converted into an SES SMTP password by applying [AWS's documented Sigv4 conversion algorithm](https://docs.aws.amazon.com/ses/latest/DeveloperGuide/smtp-credentials.html#smtp-credentials-convert). This attribute is not available for imported resources. As SigV4 is region specific, valid Provider regions are `ap-south-1`, `ap-southeast-2`, `eu-central-1`, `eu-west-1`, `us-east-1` and `us-west-2`. See current [AWS SES regions](https://docs.aws.amazon.com/general/latest/gr/rande.html#ses_region).
     * 
     */
    public Output<String> getSesSmtpPasswordV4() {
        return this.sesSmtpPasswordV4;
    }
    /**
     * Access key status to apply. Defaults to `Active`. Valid values are `Active` and `Inactive`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return Access key status to apply. Defaults to `Active`. Valid values are `Active` and `Inactive`.
     * 
     */
    public Output</* @Nullable */ String> getStatus() {
        return this.status;
    }
    /**
     * IAM user to associate with this access key.
     * 
     */
    @Export(name="user", type=String.class, parameters={})
    private Output<String> user;

    /**
     * @return IAM user to associate with this access key.
     * 
     */
    public Output<String> getUser() {
        return this.user;
    }

    public interface BuilderApplicator {
        public void apply(AccessKeyArgs.Builder a);
    }
    private static io.pulumi.aws.iam.AccessKeyArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.iam.AccessKeyArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public AccessKey(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessKey(String name) {
        this(name, AccessKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessKey(String name, AccessKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessKey(String name, AccessKeyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/accessKey:AccessKey", name, args == null ? AccessKeyArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private AccessKey(String name, Output<String> id, @Nullable AccessKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/accessKey:AccessKey", name, state, makeResourceOptions(options, id));
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
    public static AccessKey get(String name, Output<String> id, @Nullable AccessKeyState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new AccessKey(name, id, state, options);
    }
}
