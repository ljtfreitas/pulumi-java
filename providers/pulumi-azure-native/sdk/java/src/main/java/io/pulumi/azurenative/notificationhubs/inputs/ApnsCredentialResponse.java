// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub ApnsCredential.
 * 
 */
public final class ApnsCredentialResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApnsCredentialResponse Empty = new ApnsCredentialResponse();

    /**
     * The APNS certificate. Specify if using Certificate Authentication Mode.
     * 
     */
    @InputImport(name="apnsCertificate")
        private final @Nullable String apnsCertificate;

    public Optional<String> getApnsCertificate() {
        return this.apnsCertificate == null ? Optional.empty() : Optional.ofNullable(this.apnsCertificate);
    }

    /**
     * The issuer (iss) registered claim key. The value is a 10-character TeamId, obtained from your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @InputImport(name="appId")
        private final @Nullable String appId;

    public Optional<String> getAppId() {
        return this.appId == null ? Optional.empty() : Optional.ofNullable(this.appId);
    }

    /**
     * The name of the application or BundleId. Specify if using Token Authentication Mode.
     * 
     */
    @InputImport(name="appName")
        private final @Nullable String appName;

    public Optional<String> getAppName() {
        return this.appName == null ? Optional.empty() : Optional.ofNullable(this.appName);
    }

    /**
     * The APNS certificate password if it exists.
     * 
     */
    @InputImport(name="certificateKey")
        private final @Nullable String certificateKey;

    public Optional<String> getCertificateKey() {
        return this.certificateKey == null ? Optional.empty() : Optional.ofNullable(this.certificateKey);
    }

    /**
     * The APNS endpoint of this credential. If using Certificate Authentication Mode and Sandbox specify 'gateway.sandbox.push.apple.com'. If using Certificate Authentication Mode and Production specify 'gateway.push.apple.com'. If using Token Authentication Mode and Sandbox specify 'https://api.development.push.apple.com:443/3/device'. If using Token Authentication Mode and Production specify 'https://api.push.apple.com:443/3/device'.
     * 
     */
    @InputImport(name="endpoint")
        private final @Nullable String endpoint;

    public Optional<String> getEndpoint() {
        return this.endpoint == null ? Optional.empty() : Optional.ofNullable(this.endpoint);
    }

    /**
     * A 10-character key identifier (kid) key, obtained from your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @InputImport(name="keyId")
        private final @Nullable String keyId;

    public Optional<String> getKeyId() {
        return this.keyId == null ? Optional.empty() : Optional.ofNullable(this.keyId);
    }

    /**
     * The APNS certificate thumbprint. Specify if using Certificate Authentication Mode.
     * 
     */
    @InputImport(name="thumbprint")
        private final @Nullable String thumbprint;

    public Optional<String> getThumbprint() {
        return this.thumbprint == null ? Optional.empty() : Optional.ofNullable(this.thumbprint);
    }

    /**
     * Provider Authentication Token, obtained through your developer account. Specify if using Token Authentication Mode.
     * 
     */
    @InputImport(name="token")
        private final @Nullable String token;

    public Optional<String> getToken() {
        return this.token == null ? Optional.empty() : Optional.ofNullable(this.token);
    }

    public ApnsCredentialResponse(
        @Nullable String apnsCertificate,
        @Nullable String appId,
        @Nullable String appName,
        @Nullable String certificateKey,
        @Nullable String endpoint,
        @Nullable String keyId,
        @Nullable String thumbprint,
        @Nullable String token) {
        this.apnsCertificate = apnsCertificate;
        this.appId = appId;
        this.appName = appName;
        this.certificateKey = certificateKey;
        this.endpoint = endpoint;
        this.keyId = keyId;
        this.thumbprint = thumbprint;
        this.token = token;
    }

    private ApnsCredentialResponse() {
        this.apnsCertificate = null;
        this.appId = null;
        this.appName = null;
        this.certificateKey = null;
        this.endpoint = null;
        this.keyId = null;
        this.thumbprint = null;
        this.token = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApnsCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String apnsCertificate;
        private @Nullable String appId;
        private @Nullable String appName;
        private @Nullable String certificateKey;
        private @Nullable String endpoint;
        private @Nullable String keyId;
        private @Nullable String thumbprint;
        private @Nullable String token;

        public Builder() {
    	      // Empty
        }

        public Builder(ApnsCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apnsCertificate = defaults.apnsCertificate;
    	      this.appId = defaults.appId;
    	      this.appName = defaults.appName;
    	      this.certificateKey = defaults.certificateKey;
    	      this.endpoint = defaults.endpoint;
    	      this.keyId = defaults.keyId;
    	      this.thumbprint = defaults.thumbprint;
    	      this.token = defaults.token;
        }

        public Builder setApnsCertificate(@Nullable String apnsCertificate) {
            this.apnsCertificate = apnsCertificate;
            return this;
        }

        public Builder setAppId(@Nullable String appId) {
            this.appId = appId;
            return this;
        }

        public Builder setAppName(@Nullable String appName) {
            this.appName = appName;
            return this;
        }

        public Builder setCertificateKey(@Nullable String certificateKey) {
            this.certificateKey = certificateKey;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setKeyId(@Nullable String keyId) {
            this.keyId = keyId;
            return this;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public Builder setToken(@Nullable String token) {
            this.token = token;
            return this;
        }
        public ApnsCredentialResponse build() {
            return new ApnsCredentialResponse(apnsCertificate, appId, appName, certificateKey, endpoint, keyId, thumbprint, token);
        }
    }
}
