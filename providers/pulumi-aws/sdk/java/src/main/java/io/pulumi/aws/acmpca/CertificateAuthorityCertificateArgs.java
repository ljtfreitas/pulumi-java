// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateAuthorityCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityCertificateArgs Empty = new CertificateAuthorityCertificateArgs();

    /**
     * The PEM-encoded certificate for the Certificate Authority.
     * 
     */
    @Import(name="certificate", required=true)
      private final Output<String> certificate;

    public Output<String> getCertificate() {
        return this.certificate;
    }

    /**
     * Amazon Resource Name (ARN) of the Certificate Authority.
     * 
     */
    @Import(name="certificateAuthorityArn", required=true)
      private final Output<String> certificateAuthorityArn;

    public Output<String> getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA. Required for subordinate Certificate Authorities. Not allowed for root Certificate Authorities.
     * 
     */
    @Import(name="certificateChain")
      private final @Nullable Output<String> certificateChain;

    public Output<String> getCertificateChain() {
        return this.certificateChain == null ? Output.empty() : this.certificateChain;
    }

    public CertificateAuthorityCertificateArgs(
        Output<String> certificate,
        Output<String> certificateAuthorityArn,
        @Nullable Output<String> certificateChain) {
        this.certificate = Objects.requireNonNull(certificate, "expected parameter 'certificate' to be non-null");
        this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn, "expected parameter 'certificateAuthorityArn' to be non-null");
        this.certificateChain = certificateChain;
    }

    private CertificateAuthorityCertificateArgs() {
        this.certificate = Output.empty();
        this.certificateAuthorityArn = Output.empty();
        this.certificateChain = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificate;
        private Output<String> certificateAuthorityArn;
        private @Nullable Output<String> certificateChain;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.certificateAuthorityArn = defaults.certificateAuthorityArn;
    	      this.certificateChain = defaults.certificateChain;
        }

        public Builder certificate(Output<String> certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder certificate(String certificate) {
            this.certificate = Output.of(Objects.requireNonNull(certificate));
            return this;
        }

        public Builder certificateAuthorityArn(Output<String> certificateAuthorityArn) {
            this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn);
            return this;
        }

        public Builder certificateAuthorityArn(String certificateAuthorityArn) {
            this.certificateAuthorityArn = Output.of(Objects.requireNonNull(certificateAuthorityArn));
            return this;
        }

        public Builder certificateChain(@Nullable Output<String> certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }

        public Builder certificateChain(@Nullable String certificateChain) {
            this.certificateChain = Output.ofNullable(certificateChain);
            return this;
        }
        public CertificateAuthorityCertificateArgs build() {
            return new CertificateAuthorityCertificateArgs(certificate, certificateAuthorityArn, certificateChain);
        }
    }
}
