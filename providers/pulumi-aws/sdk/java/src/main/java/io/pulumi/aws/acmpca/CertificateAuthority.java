// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.acmpca.CertificateAuthorityArgs;
import io.pulumi.aws.acmpca.inputs.CertificateAuthorityState;
import io.pulumi.aws.acmpca.outputs.CertificateAuthorityCertificateAuthorityConfiguration;
import io.pulumi.aws.acmpca.outputs.CertificateAuthorityRevocationConfiguration;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage AWS Certificate Manager Private Certificate Authorities (ACM PCA Certificate Authorities).
 * 
 * > **NOTE:** Creating this resource will leave the certificate authority in a `PENDING_CERTIFICATE` status, which means it cannot yet issue certificates. To complete this setup, you must fully sign the certificate authority CSR available in the `certificate_signing_request` attribute and import the signed certificate using the AWS SDK, CLI or Console. This provider can support another resource to manage that workflow automatically in the future.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_acmpca_certificate_authority` can be imported by using the certificate authority Amazon Resource Name (ARN), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:acmpca/certificateAuthority:CertificateAuthority example arn:aws:acm-pca:us-east-1:123456789012:certificate-authority/12345678-1234-1234-1234-123456789012
 * ```
 * 
 */
@ResourceType(type="aws:acmpca/certificateAuthority:CertificateAuthority")
public class CertificateAuthority extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the certificate authority.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the certificate authority.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    @Export(name="certificate", type=String.class, parameters={})
    private Output<String> certificate;

    /**
     * @return Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    public Output<String> getCertificate() {
        return this.certificate;
    }
    /**
     * Nested argument containing algorithms and certificate subject information. Defined below.
     * 
     */
    @Export(name="certificateAuthorityConfiguration", type=CertificateAuthorityCertificateAuthorityConfiguration.class, parameters={})
    private Output<CertificateAuthorityCertificateAuthorityConfiguration> certificateAuthorityConfiguration;

    /**
     * @return Nested argument containing algorithms and certificate subject information. Defined below.
     * 
     */
    public Output<CertificateAuthorityCertificateAuthorityConfiguration> getCertificateAuthorityConfiguration() {
        return this.certificateAuthorityConfiguration;
    }
    /**
     * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    @Export(name="certificateChain", type=String.class, parameters={})
    private Output<String> certificateChain;

    /**
     * @return Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
     * 
     */
    public Output<String> getCertificateChain() {
        return this.certificateChain;
    }
    /**
     * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     * 
     */
    @Export(name="certificateSigningRequest", type=String.class, parameters={})
    private Output<String> certificateSigningRequest;

    /**
     * @return The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
     * 
     */
    public Output<String> getCertificateSigningRequest() {
        return this.certificateSigningRequest;
    }
    /**
     * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnabled() {
        return this.enabled;
    }
    /**
     * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    @Export(name="notAfter", type=String.class, parameters={})
    private Output<String> notAfter;

    /**
     * @return Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    public Output<String> getNotAfter() {
        return this.notAfter;
    }
    /**
     * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    @Export(name="notBefore", type=String.class, parameters={})
    private Output<String> notBefore;

    /**
     * @return Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
     * 
     */
    public Output<String> getNotBefore() {
        return this.notBefore;
    }
    /**
     * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
     * 
     */
    @Export(name="permanentDeletionTimeInDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> permanentDeletionTimeInDays;

    /**
     * @return The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
     * 
     */
    public Output</* @Nullable */ Integer> getPermanentDeletionTimeInDays() {
        return this.permanentDeletionTimeInDays;
    }
    /**
     * Nested argument containing revocation configuration. Defined below.
     * 
     */
    @Export(name="revocationConfiguration", type=CertificateAuthorityRevocationConfiguration.class, parameters={})
    private Output</* @Nullable */ CertificateAuthorityRevocationConfiguration> revocationConfiguration;

    /**
     * @return Nested argument containing revocation configuration. Defined below.
     * 
     */
    public Output</* @Nullable */ CertificateAuthorityRevocationConfiguration> getRevocationConfiguration() {
        return this.revocationConfiguration;
    }
    /**
     * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
     * 
     */
    @Export(name="serial", type=String.class, parameters={})
    private Output<String> serial;

    /**
     * @return Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
     * 
     */
    public Output<String> getSerial() {
        return this.serial;
    }
    /**
     * Status of the certificate authority.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the certificate authority.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Specifies a key-value map of user-defined tags that are attached to the certificate authority. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Specifies a key-value map of user-defined tags that are attached to the certificate authority. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    /**
     * The type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
     * 
     */
    public Output</* @Nullable */ String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(CertificateAuthorityArgs.Builder a);
    }
    private static io.pulumi.aws.acmpca.CertificateAuthorityArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.acmpca.CertificateAuthorityArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public CertificateAuthority(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CertificateAuthority(String name) {
        this(name, CertificateAuthorityArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CertificateAuthority(String name, CertificateAuthorityArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CertificateAuthority(String name, CertificateAuthorityArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:acmpca/certificateAuthority:CertificateAuthority", name, args == null ? CertificateAuthorityArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private CertificateAuthority(String name, Output<String> id, @Nullable CertificateAuthorityState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:acmpca/certificateAuthority:CertificateAuthority", name, state, makeResourceOptions(options, id));
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
    public static CertificateAuthority get(String name, Output<String> id, @Nullable CertificateAuthorityState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new CertificateAuthority(name, id, state, options);
    }
}
