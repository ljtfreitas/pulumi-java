// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration and status of a self-managed SSL certificate.
 * 
 */
public final class SslCertificateSelfManagedSslCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final SslCertificateSelfManagedSslCertificateArgs Empty = new SslCertificateSelfManagedSslCertificateArgs();

    /**
     * A local certificate file. The certificate must be in PEM format. The certificate chain must be no greater than 5 certs long. The chain must include at least one intermediate cert.
     * 
     */
    @Import(name="certificate")
      private final @Nullable Output<String> certificate;

    public Output<String> getCertificate() {
        return this.certificate == null ? Output.empty() : this.certificate;
    }

    /**
     * A write-only private key in PEM format. Only insert requests will include this field.
     * 
     */
    @Import(name="privateKey")
      private final @Nullable Output<String> privateKey;

    public Output<String> getPrivateKey() {
        return this.privateKey == null ? Output.empty() : this.privateKey;
    }

    public SslCertificateSelfManagedSslCertificateArgs(
        @Nullable Output<String> certificate,
        @Nullable Output<String> privateKey) {
        this.certificate = certificate;
        this.privateKey = privateKey;
    }

    private SslCertificateSelfManagedSslCertificateArgs() {
        this.certificate = Output.empty();
        this.privateKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslCertificateSelfManagedSslCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificate;
        private @Nullable Output<String> privateKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SslCertificateSelfManagedSslCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.privateKey = defaults.privateKey;
        }

        public Builder certificate(@Nullable Output<String> certificate) {
            this.certificate = certificate;
            return this;
        }

        public Builder certificate(@Nullable String certificate) {
            this.certificate = Output.ofNullable(certificate);
            return this;
        }

        public Builder privateKey(@Nullable Output<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = Output.ofNullable(privateKey);
            return this;
        }
        public SslCertificateSelfManagedSslCertificateArgs build() {
            return new SslCertificateSelfManagedSslCertificateArgs(certificate, privateKey);
        }
    }
}
