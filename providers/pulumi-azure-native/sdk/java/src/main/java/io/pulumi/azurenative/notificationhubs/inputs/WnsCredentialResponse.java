// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub WnsCredential.
 * 
 */
public final class WnsCredentialResponse extends io.pulumi.resources.InvokeArgs {

    public static final WnsCredentialResponse Empty = new WnsCredentialResponse();

    /**
     * The package ID for this credential.
     * 
     */
    @InputImport(name="packageSid")
        private final @Nullable String packageSid;

    public Optional<String> getPackageSid() {
        return this.packageSid == null ? Optional.empty() : Optional.ofNullable(this.packageSid);
    }

    /**
     * The secret key.
     * 
     */
    @InputImport(name="secretKey")
        private final @Nullable String secretKey;

    public Optional<String> getSecretKey() {
        return this.secretKey == null ? Optional.empty() : Optional.ofNullable(this.secretKey);
    }

    /**
     * The Windows Live endpoint.
     * 
     */
    @InputImport(name="windowsLiveEndpoint")
        private final @Nullable String windowsLiveEndpoint;

    public Optional<String> getWindowsLiveEndpoint() {
        return this.windowsLiveEndpoint == null ? Optional.empty() : Optional.ofNullable(this.windowsLiveEndpoint);
    }

    public WnsCredentialResponse(
        @Nullable String packageSid,
        @Nullable String secretKey,
        @Nullable String windowsLiveEndpoint) {
        this.packageSid = packageSid;
        this.secretKey = secretKey;
        this.windowsLiveEndpoint = windowsLiveEndpoint;
    }

    private WnsCredentialResponse() {
        this.packageSid = null;
        this.secretKey = null;
        this.windowsLiveEndpoint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WnsCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String packageSid;
        private @Nullable String secretKey;
        private @Nullable String windowsLiveEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(WnsCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packageSid = defaults.packageSid;
    	      this.secretKey = defaults.secretKey;
    	      this.windowsLiveEndpoint = defaults.windowsLiveEndpoint;
        }

        public Builder setPackageSid(@Nullable String packageSid) {
            this.packageSid = packageSid;
            return this;
        }

        public Builder setSecretKey(@Nullable String secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        public Builder setWindowsLiveEndpoint(@Nullable String windowsLiveEndpoint) {
            this.windowsLiveEndpoint = windowsLiveEndpoint;
            return this;
        }
        public WnsCredentialResponse build() {
            return new WnsCredentialResponse(packageSid, secretKey, windowsLiveEndpoint);
        }
    }
}
