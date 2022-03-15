// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * SSL certificate information.
 * 
 */
public final class CertificateInformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateInformationArgs Empty = new CertificateInformationArgs();

    /**
     * Expiration date of the certificate. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    @Import(name="expiry", required=true)
      private final Output<String> expiry;

    public Output<String> getExpiry() {
        return this.expiry;
    }

    /**
     * Subject of the certificate.
     * 
     */
    @Import(name="subject", required=true)
      private final Output<String> subject;

    public Output<String> getSubject() {
        return this.subject;
    }

    /**
     * Thumbprint of the certificate.
     * 
     */
    @Import(name="thumbprint", required=true)
      private final Output<String> thumbprint;

    public Output<String> getThumbprint() {
        return this.thumbprint;
    }

    public CertificateInformationArgs(
        Output<String> expiry,
        Output<String> subject,
        Output<String> thumbprint) {
        this.expiry = Objects.requireNonNull(expiry, "expected parameter 'expiry' to be non-null");
        this.subject = Objects.requireNonNull(subject, "expected parameter 'subject' to be non-null");
        this.thumbprint = Objects.requireNonNull(thumbprint, "expected parameter 'thumbprint' to be non-null");
    }

    private CertificateInformationArgs() {
        this.expiry = Output.empty();
        this.subject = Output.empty();
        this.thumbprint = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateInformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> expiry;
        private Output<String> subject;
        private Output<String> thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateInformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiry = defaults.expiry;
    	      this.subject = defaults.subject;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder expiry(Output<String> expiry) {
            this.expiry = Objects.requireNonNull(expiry);
            return this;
        }

        public Builder expiry(String expiry) {
            this.expiry = Output.of(Objects.requireNonNull(expiry));
            return this;
        }

        public Builder subject(Output<String> subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }

        public Builder subject(String subject) {
            this.subject = Output.of(Objects.requireNonNull(subject));
            return this;
        }

        public Builder thumbprint(Output<String> thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }

        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Output.of(Objects.requireNonNull(thumbprint));
            return this;
        }
        public CertificateInformationArgs build() {
            return new CertificateInformationArgs(expiry, subject, thumbprint);
        }
    }
}
