// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iot.CertificateArgs;
import io.pulumi.aws.iot.inputs.CertificateState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates and manages an AWS IoT certificate.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws:iot/certificate:Certificate")
public class Certificate extends io.pulumi.resources.CustomResource {
    /**
     * Boolean flag to indicate if the certificate should be active
     * 
     */
    @OutputExport(name="active", type=Boolean.class, parameters={})
    private Output<Boolean> active;

    /**
     * @return Boolean flag to indicate if the certificate should be active
     * 
     */
    public Output<Boolean> getActive() {
        return this.active;
    }
    /**
     * The ARN of the created certificate.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the created certificate.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * The certificate data, in PEM format.
     * 
     */
    @OutputExport(name="certificatePem", type=String.class, parameters={})
    private Output<String> certificatePem;

    /**
     * @return The certificate data, in PEM format.
     * 
     */
    public Output<String> getCertificatePem() {
        return this.certificatePem;
    }
    /**
     * The certificate signing request. Review
     * [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
     * for more information on generating a certificate from a certificate signing request (CSR).
     * If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
     * for more information on generating keys and a certificate.
     * 
     */
    @OutputExport(name="csr", type=String.class, parameters={})
    private Output</* @Nullable */ String> csr;

    /**
     * @return The certificate signing request. Review
     * [CreateCertificateFromCsr](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
     * for more information on generating a certificate from a certificate signing request (CSR).
     * If none is specified both the certificate and keys will be generated, review [CreateKeysAndCertificate](https://docs.aws.amazon.com/iot/latest/apireference/API_CreateKeysAndCertificate.html)
     * for more information on generating keys and a certificate.
     * 
     */
    public Output</* @Nullable */ String> getCsr() {
        return this.csr;
    }
    /**
     * When no CSR is provided, the private key.
     * 
     */
    @OutputExport(name="privateKey", type=String.class, parameters={})
    private Output<String> privateKey;

    /**
     * @return When no CSR is provided, the private key.
     * 
     */
    public Output<String> getPrivateKey() {
        return this.privateKey;
    }
    /**
     * When no CSR is provided, the public key.
     * 
     */
    @OutputExport(name="publicKey", type=String.class, parameters={})
    private Output<String> publicKey;

    /**
     * @return When no CSR is provided, the public key.
     * 
     */
    public Output<String> getPublicKey() {
        return this.publicKey;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, CertificateArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/certificate:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Certificate(String name, Input<String> id, @Nullable CertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/certificate:Certificate", name, state, makeResourceOptions(options, id));
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
    public static Certificate get(String name, Input<String> id, @Nullable CertificateState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, state, options);
    }
}
