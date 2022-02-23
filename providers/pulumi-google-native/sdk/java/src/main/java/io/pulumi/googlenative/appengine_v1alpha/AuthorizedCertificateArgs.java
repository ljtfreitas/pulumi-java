// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.appengine_v1alpha.inputs.CertificateRawDataArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorizedCertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorizedCertificateArgs Empty = new AuthorizedCertificateArgs();

    @InputImport(name="appId", required=true)
      private final Input<String> appId;

    public Input<String> getAppId() {
        return this.appId;
    }

    /**
     * The SSL certificate serving the AuthorizedCertificate resource. This must be obtained independently from a certificate authority.
     * 
     */
    @InputImport(name="certificateRawData")
      private final @Nullable Input<CertificateRawDataArgs> certificateRawData;

    public Input<CertificateRawDataArgs> getCertificateRawData() {
        return this.certificateRawData == null ? Input.empty() : this.certificateRawData;
    }

    /**
     * The user-specified display name of the certificate. This is not guaranteed to be unique. Example: My Certificate.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    public AuthorizedCertificateArgs(
        Input<String> appId,
        @Nullable Input<CertificateRawDataArgs> certificateRawData,
        @Nullable Input<String> displayName) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.certificateRawData = certificateRawData;
        this.displayName = displayName;
    }

    private AuthorizedCertificateArgs() {
        this.appId = Input.empty();
        this.certificateRawData = Input.empty();
        this.displayName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizedCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appId;
        private @Nullable Input<CertificateRawDataArgs> certificateRawData;
        private @Nullable Input<String> displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizedCertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.certificateRawData = defaults.certificateRawData;
    	      this.displayName = defaults.displayName;
        }

        public Builder setAppId(Input<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setAppId(String appId) {
            this.appId = Input.of(Objects.requireNonNull(appId));
            return this;
        }

        public Builder setCertificateRawData(@Nullable Input<CertificateRawDataArgs> certificateRawData) {
            this.certificateRawData = certificateRawData;
            return this;
        }

        public Builder setCertificateRawData(@Nullable CertificateRawDataArgs certificateRawData) {
            this.certificateRawData = Input.ofNullable(certificateRawData);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }
        public AuthorizedCertificateArgs build() {
            return new AuthorizedCertificateArgs(appId, certificateRawData, displayName);
        }
    }
}
