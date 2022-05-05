// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.acmpca.CertificateAuthorityArgs;
import com.pulumi.aws.acmpca.inputs.CertificateAuthorityState;
import com.pulumi.aws.acmpca.outputs.CertificateAuthorityCertificateAuthorityConfiguration;
import com.pulumi.aws.acmpca.outputs.CertificateAuthorityRevocationConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage AWS Certificate Manager Private Certificate Authorities (ACM PCA Certificate Authorities).
 * 
 * &gt; **NOTE:** Creating this resource will leave the certificate authority in a `PENDING_CERTIFICATE` status, which means it cannot yet issue certificates. To complete this setup, you must fully sign the certificate authority CSR available in the `certificate_signing_request` attribute and import the signed certificate using the AWS SDK, CLI or Console. This provider can support another resource to manage that workflow automatically in the future.
 * 
 * ## Example Usage
 * ### Basic
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
 *         var example = new CertificateAuthority(&#34;example&#34;, CertificateAuthorityArgs.builder()        
 *             .certificateAuthorityConfiguration(CertificateAuthorityCertificateAuthorityConfiguration.builder()
 *                 .keyAlgorithm(&#34;RSA_4096&#34;)
 *                 .signingAlgorithm(&#34;SHA512WITHRSA&#34;)
 *                 .subject(CertificateAuthorityCertificateAuthorityConfigurationSubject.builder()
 *                     .commonName(&#34;example.com&#34;)
 *                     .build())
 *                 .build())
 *             .permanentDeletionTimeInDays(7)
 *             .build());
 * 
 *         }
 * }
 * ```
 * ### Enable Certificate Revocation List
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
 *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
 * 
 *         final var acmpcaBucketAccess = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatement.builder()
 *                 .actions(                
 *                     &#34;s3:GetBucketAcl&#34;,
 *                     &#34;s3:GetBucketLocation&#34;,
 *                     &#34;s3:PutObject&#34;,
 *                     &#34;s3:PutObjectAcl&#34;)
 *                 .resources(                
 *                     exampleBucketV2.getArn(),
 *                     exampleBucketV2.getArn().apply(arn -&gt; String.format(&#34;%s/*&#34;, arn)))
 *                 .principals(GetPolicyDocumentStatementPrincipal.builder()
 *                     .identifiers(&#34;acm-pca.amazonaws.com&#34;)
 *                     .type(&#34;Service&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleBucketPolicy = new BucketPolicy(&#34;exampleBucketPolicy&#34;, BucketPolicyArgs.builder()        
 *             .bucket(exampleBucketV2.getId())
 *             .policy(acmpcaBucketAccess.apply(getPolicyDocumentResult -&gt; getPolicyDocumentResult).apply(acmpcaBucketAccess -&gt; acmpcaBucketAccess.apply(getPolicyDocumentResult -&gt; getPolicyDocumentResult.getJson())))
 *             .build());
 * 
 *         var exampleCertificateAuthority = new CertificateAuthority(&#34;exampleCertificateAuthority&#34;, CertificateAuthorityArgs.builder()        
 *             .certificateAuthorityConfiguration(CertificateAuthorityCertificateAuthorityConfiguration.builder()
 *                 .keyAlgorithm(&#34;RSA_4096&#34;)
 *                 .signingAlgorithm(&#34;SHA512WITHRSA&#34;)
 *                 .subject(CertificateAuthorityCertificateAuthorityConfigurationSubject.builder()
 *                     .commonName(&#34;example.com&#34;)
 *                     .build())
 *                 .build())
 *             .revocationConfiguration(CertificateAuthorityRevocationConfiguration.builder()
 *                 .crlConfiguration(CertificateAuthorityRevocationConfigurationCrlConfiguration.builder()
 *                     .customCname(&#34;crl.example.com&#34;)
 *                     .enabled(true)
 *                     .expirationInDays(7)
 *                     .s3BucketName(exampleBucketV2.getId())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         }
 * }
 * ```
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
public class CertificateAuthority extends com.pulumi.resources.CustomResource {
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
    public Output<String> arn() {
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
    public Output<String> certificate() {
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
    public Output<CertificateAuthorityCertificateAuthorityConfiguration> certificateAuthorityConfiguration() {
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
    public Output<String> certificateChain() {
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
    public Output<String> certificateSigningRequest() {
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
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
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
    public Output<String> notAfter() {
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
    public Output<String> notBefore() {
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
    public Output<Optional<Integer>> permanentDeletionTimeInDays() {
        return Codegen.optional(this.permanentDeletionTimeInDays);
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
    public Output<Optional<CertificateAuthorityRevocationConfiguration>> revocationConfiguration() {
        return Codegen.optional(this.revocationConfiguration);
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
    public Output<String> serial() {
        return this.serial;
    }
    /**
     * (**Deprecated** use the `enabled` attribute instead) Status of the certificate authority.
     * 
     * @deprecated
     * The reported value of the &#34;status&#34; attribute is often inaccurate. Use the resource&#39;s &#34;enabled&#34; attribute to explicitly set status.
     * 
     */
    @Deprecated /* The reported value of the ""status"" attribute is often inaccurate. Use the resource's ""enabled"" attribute to explicitly set status. */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return (**Deprecated** use the `enabled` attribute instead) Status of the certificate authority.
     * 
     */
    public Output<String> status() {
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
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
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
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
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
    public CertificateAuthority(String name, CertificateAuthorityArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:acmpca/certificateAuthority:CertificateAuthority", name, args == null ? CertificateAuthorityArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CertificateAuthority(String name, Output<String> id, @Nullable CertificateAuthorityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:acmpca/certificateAuthority:CertificateAuthority", name, state, makeResourceOptions(options, id));
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
    public static CertificateAuthority get(String name, Output<String> id, @Nullable CertificateAuthorityState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CertificateAuthority(name, id, state, options);
    }
}
