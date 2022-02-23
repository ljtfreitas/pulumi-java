// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.websecurityscanner_v1.inputs.CustomAccountArgs;
import io.pulumi.googlenative.websecurityscanner_v1.inputs.GoogleAccountArgs;
import io.pulumi.googlenative.websecurityscanner_v1.inputs.IapCredentialArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Scan authentication configuration.
 * 
 */
public final class AuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthenticationArgs Empty = new AuthenticationArgs();

    /**
     * Authentication using a custom account.
     * 
     */
    @InputImport(name="customAccount")
      private final @Nullable Input<CustomAccountArgs> customAccount;

    public Input<CustomAccountArgs> getCustomAccount() {
        return this.customAccount == null ? Input.empty() : this.customAccount;
    }

    /**
     * Authentication using a Google account.
     * 
     */
    @InputImport(name="googleAccount")
      private final @Nullable Input<GoogleAccountArgs> googleAccount;

    public Input<GoogleAccountArgs> getGoogleAccount() {
        return this.googleAccount == null ? Input.empty() : this.googleAccount;
    }

    /**
     * Authentication using Identity-Aware-Proxy (IAP).
     * 
     */
    @InputImport(name="iapCredential")
      private final @Nullable Input<IapCredentialArgs> iapCredential;

    public Input<IapCredentialArgs> getIapCredential() {
        return this.iapCredential == null ? Input.empty() : this.iapCredential;
    }

    public AuthenticationArgs(
        @Nullable Input<CustomAccountArgs> customAccount,
        @Nullable Input<GoogleAccountArgs> googleAccount,
        @Nullable Input<IapCredentialArgs> iapCredential) {
        this.customAccount = customAccount;
        this.googleAccount = googleAccount;
        this.iapCredential = iapCredential;
    }

    private AuthenticationArgs() {
        this.customAccount = Input.empty();
        this.googleAccount = Input.empty();
        this.iapCredential = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CustomAccountArgs> customAccount;
        private @Nullable Input<GoogleAccountArgs> googleAccount;
        private @Nullable Input<IapCredentialArgs> iapCredential;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customAccount = defaults.customAccount;
    	      this.googleAccount = defaults.googleAccount;
    	      this.iapCredential = defaults.iapCredential;
        }

        public Builder setCustomAccount(@Nullable Input<CustomAccountArgs> customAccount) {
            this.customAccount = customAccount;
            return this;
        }

        public Builder setCustomAccount(@Nullable CustomAccountArgs customAccount) {
            this.customAccount = Input.ofNullable(customAccount);
            return this;
        }

        public Builder setGoogleAccount(@Nullable Input<GoogleAccountArgs> googleAccount) {
            this.googleAccount = googleAccount;
            return this;
        }

        public Builder setGoogleAccount(@Nullable GoogleAccountArgs googleAccount) {
            this.googleAccount = Input.ofNullable(googleAccount);
            return this;
        }

        public Builder setIapCredential(@Nullable Input<IapCredentialArgs> iapCredential) {
            this.iapCredential = iapCredential;
            return this;
        }

        public Builder setIapCredential(@Nullable IapCredentialArgs iapCredential) {
            this.iapCredential = Input.ofNullable(iapCredential);
            return this;
        }
        public AuthenticationArgs build() {
            return new AuthenticationArgs(customAccount, googleAccount, iapCredential);
        }
    }
}
