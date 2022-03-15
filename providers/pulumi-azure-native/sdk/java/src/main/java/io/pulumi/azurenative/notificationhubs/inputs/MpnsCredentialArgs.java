// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub MpnsCredential.
 * 
 */
public final class MpnsCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final MpnsCredentialArgs Empty = new MpnsCredentialArgs();

    /**
     * The certificate key for this credential.
     * 
     */
    @Import(name="certificateKey")
      private final @Nullable Output<String> certificateKey;

    public Output<String> getCertificateKey() {
        return this.certificateKey == null ? Output.empty() : this.certificateKey;
    }

    /**
     * The MPNS certificate.
     * 
     */
    @Import(name="mpnsCertificate")
      private final @Nullable Output<String> mpnsCertificate;

    public Output<String> getMpnsCertificate() {
        return this.mpnsCertificate == null ? Output.empty() : this.mpnsCertificate;
    }

    /**
     * The MPNS certificate Thumbprint
     * 
     */
    @Import(name="thumbprint")
      private final @Nullable Output<String> thumbprint;

    public Output<String> getThumbprint() {
        return this.thumbprint == null ? Output.empty() : this.thumbprint;
    }

    public MpnsCredentialArgs(
        @Nullable Output<String> certificateKey,
        @Nullable Output<String> mpnsCertificate,
        @Nullable Output<String> thumbprint) {
        this.certificateKey = certificateKey;
        this.mpnsCertificate = mpnsCertificate;
        this.thumbprint = thumbprint;
    }

    private MpnsCredentialArgs() {
        this.certificateKey = Output.empty();
        this.mpnsCertificate = Output.empty();
        this.thumbprint = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MpnsCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateKey;
        private @Nullable Output<String> mpnsCertificate;
        private @Nullable Output<String> thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(MpnsCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateKey = defaults.certificateKey;
    	      this.mpnsCertificate = defaults.mpnsCertificate;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder certificateKey(@Nullable Output<String> certificateKey) {
            this.certificateKey = certificateKey;
            return this;
        }

        public Builder certificateKey(@Nullable String certificateKey) {
            this.certificateKey = Output.ofNullable(certificateKey);
            return this;
        }

        public Builder mpnsCertificate(@Nullable Output<String> mpnsCertificate) {
            this.mpnsCertificate = mpnsCertificate;
            return this;
        }

        public Builder mpnsCertificate(@Nullable String mpnsCertificate) {
            this.mpnsCertificate = Output.ofNullable(mpnsCertificate);
            return this;
        }

        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = Output.ofNullable(thumbprint);
            return this;
        }
        public MpnsCredentialArgs build() {
            return new MpnsCredentialArgs(certificateKey, mpnsCertificate, thumbprint);
        }
    }
}
