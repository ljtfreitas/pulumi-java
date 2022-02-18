// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub WnsCredential.
 * 
 */
public final class WnsCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final WnsCredentialArgs Empty = new WnsCredentialArgs();

    /**
     * The package ID for this credential.
     * 
     */
    @InputImport(name="packageSid")
    private final @Nullable Input<String> packageSid;

    public Input<String> getPackageSid() {
        return this.packageSid == null ? Input.empty() : this.packageSid;
    }

    /**
     * The secret key.
     * 
     */
    @InputImport(name="secretKey")
    private final @Nullable Input<String> secretKey;

    public Input<String> getSecretKey() {
        return this.secretKey == null ? Input.empty() : this.secretKey;
    }

    /**
     * The Windows Live endpoint.
     * 
     */
    @InputImport(name="windowsLiveEndpoint")
    private final @Nullable Input<String> windowsLiveEndpoint;

    public Input<String> getWindowsLiveEndpoint() {
        return this.windowsLiveEndpoint == null ? Input.empty() : this.windowsLiveEndpoint;
    }

    public WnsCredentialArgs(
        @Nullable Input<String> packageSid,
        @Nullable Input<String> secretKey,
        @Nullable Input<String> windowsLiveEndpoint) {
        this.packageSid = packageSid;
        this.secretKey = secretKey;
        this.windowsLiveEndpoint = windowsLiveEndpoint;
    }

    private WnsCredentialArgs() {
        this.packageSid = Input.empty();
        this.secretKey = Input.empty();
        this.windowsLiveEndpoint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WnsCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> packageSid;
        private @Nullable Input<String> secretKey;
        private @Nullable Input<String> windowsLiveEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(WnsCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packageSid = defaults.packageSid;
    	      this.secretKey = defaults.secretKey;
    	      this.windowsLiveEndpoint = defaults.windowsLiveEndpoint;
        }

        public Builder setPackageSid(@Nullable Input<String> packageSid) {
            this.packageSid = packageSid;
            return this;
        }

        public Builder setPackageSid(@Nullable String packageSid) {
            this.packageSid = Input.ofNullable(packageSid);
            return this;
        }

        public Builder setSecretKey(@Nullable Input<String> secretKey) {
            this.secretKey = secretKey;
            return this;
        }

        public Builder setSecretKey(@Nullable String secretKey) {
            this.secretKey = Input.ofNullable(secretKey);
            return this;
        }

        public Builder setWindowsLiveEndpoint(@Nullable Input<String> windowsLiveEndpoint) {
            this.windowsLiveEndpoint = windowsLiveEndpoint;
            return this;
        }

        public Builder setWindowsLiveEndpoint(@Nullable String windowsLiveEndpoint) {
            this.windowsLiveEndpoint = Input.ofNullable(windowsLiveEndpoint);
            return this;
        }

        public WnsCredentialArgs build() {
            return new WnsCredentialArgs(packageSid, secretKey, windowsLiveEndpoint);
        }
    }
}
