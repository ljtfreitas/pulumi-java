// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca.inputs;

import io.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class CertificateAuthorityCertificateAuthorityConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityCertificateAuthorityConfigurationGetArgs Empty = new CertificateAuthorityCertificateAuthorityConfigurationGetArgs();

    /**
     * Type of the public key algorithm and size, in bits, of the key pair that your key pair creates when it issues a certificate. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
     * 
     */
    @InputImport(name="keyAlgorithm", required=true)
    private final Input<String> keyAlgorithm;

    public Input<String> getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * Name of the algorithm your private CA uses to sign certificate requests. Valid values can be found in the [ACM PCA Documentation](https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_CertificateAuthorityConfiguration.html).
     * 
     */
    @InputImport(name="signingAlgorithm", required=true)
    private final Input<String> signingAlgorithm;

    public Input<String> getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * Nested argument that contains X.500 distinguished name information. At least one nested attribute must be specified.
     * 
     */
    @InputImport(name="subject", required=true)
    private final Input<CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs> subject;

    public Input<CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs> getSubject() {
        return this.subject;
    }

    public CertificateAuthorityCertificateAuthorityConfigurationGetArgs(
        Input<String> keyAlgorithm,
        Input<String> signingAlgorithm,
        Input<CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs> subject) {
        this.keyAlgorithm = Objects.requireNonNull(keyAlgorithm, "expected parameter 'keyAlgorithm' to be non-null");
        this.signingAlgorithm = Objects.requireNonNull(signingAlgorithm, "expected parameter 'signingAlgorithm' to be non-null");
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
    }

    private CertificateAuthorityCertificateAuthorityConfigurationGetArgs() {
        this.keyAlgorithm = Input.empty();
        this.signingAlgorithm = Input.empty();
        this.subject = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityCertificateAuthorityConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyAlgorithm;
        private Input<String> signingAlgorithm;
        private Input<CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs> subject;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityCertificateAuthorityConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyAlgorithm = defaults.keyAlgorithm;
    	      this.signingAlgorithm = defaults.signingAlgorithm;
    	      this.subject = defaults.subject;
        }

        public Builder setKeyAlgorithm(Input<String> keyAlgorithm) {
            this.keyAlgorithm = Objects.requireNonNull(keyAlgorithm);
            return this;
        }

        public Builder setKeyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = Input.of(Objects.requireNonNull(keyAlgorithm));
            return this;
        }

        public Builder setSigningAlgorithm(Input<String> signingAlgorithm) {
            this.signingAlgorithm = Objects.requireNonNull(signingAlgorithm);
            return this;
        }

        public Builder setSigningAlgorithm(String signingAlgorithm) {
            this.signingAlgorithm = Input.of(Objects.requireNonNull(signingAlgorithm));
            return this;
        }

        public Builder setSubject(Input<CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs> subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder setSubject(CertificateAuthorityCertificateAuthorityConfigurationSubjectGetArgs subject) {
            this.subject = Input.of(Objects.requireNonNull(subject));
            return this;
        }
        public CertificateAuthorityCertificateAuthorityConfigurationGetArgs build() {
            return new CertificateAuthorityCertificateAuthorityConfigurationGetArgs(keyAlgorithm, signingAlgorithm, subject);
        }
    }
}
