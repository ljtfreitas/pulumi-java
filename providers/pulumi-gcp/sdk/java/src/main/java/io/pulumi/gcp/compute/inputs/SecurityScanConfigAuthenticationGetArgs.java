// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationCustomAccountGetArgs;
import io.pulumi.gcp.compute.inputs.SecurityScanConfigAuthenticationGoogleAccountGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityScanConfigAuthenticationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityScanConfigAuthenticationGetArgs Empty = new SecurityScanConfigAuthenticationGetArgs();

    /**
     * Describes authentication configuration that uses a custom account.
     * Structure is documented below.
     * 
     */
    @Import(name="customAccount")
      private final @Nullable Output<SecurityScanConfigAuthenticationCustomAccountGetArgs> customAccount;

    public Output<SecurityScanConfigAuthenticationCustomAccountGetArgs> customAccount() {
        return this.customAccount == null ? Codegen.empty() : this.customAccount;
    }

    /**
     * Describes authentication configuration that uses a Google account.
     * Structure is documented below.
     * 
     */
    @Import(name="googleAccount")
      private final @Nullable Output<SecurityScanConfigAuthenticationGoogleAccountGetArgs> googleAccount;

    public Output<SecurityScanConfigAuthenticationGoogleAccountGetArgs> googleAccount() {
        return this.googleAccount == null ? Codegen.empty() : this.googleAccount;
    }

    public SecurityScanConfigAuthenticationGetArgs(
        @Nullable Output<SecurityScanConfigAuthenticationCustomAccountGetArgs> customAccount,
        @Nullable Output<SecurityScanConfigAuthenticationGoogleAccountGetArgs> googleAccount) {
        this.customAccount = customAccount;
        this.googleAccount = googleAccount;
    }

    private SecurityScanConfigAuthenticationGetArgs() {
        this.customAccount = Codegen.empty();
        this.googleAccount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityScanConfigAuthenticationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecurityScanConfigAuthenticationCustomAccountGetArgs> customAccount;
        private @Nullable Output<SecurityScanConfigAuthenticationGoogleAccountGetArgs> googleAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityScanConfigAuthenticationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customAccount = defaults.customAccount;
    	      this.googleAccount = defaults.googleAccount;
        }

        public Builder customAccount(@Nullable Output<SecurityScanConfigAuthenticationCustomAccountGetArgs> customAccount) {
            this.customAccount = customAccount;
            return this;
        }
        public Builder customAccount(@Nullable SecurityScanConfigAuthenticationCustomAccountGetArgs customAccount) {
            this.customAccount = Codegen.ofNullable(customAccount);
            return this;
        }
        public Builder googleAccount(@Nullable Output<SecurityScanConfigAuthenticationGoogleAccountGetArgs> googleAccount) {
            this.googleAccount = googleAccount;
            return this;
        }
        public Builder googleAccount(@Nullable SecurityScanConfigAuthenticationGoogleAccountGetArgs googleAccount) {
            this.googleAccount = Codegen.ofNullable(googleAccount);
            return this;
        }        public SecurityScanConfigAuthenticationGetArgs build() {
            return new SecurityScanConfigAuthenticationGetArgs(customAccount, googleAccount);
        }
    }
}
