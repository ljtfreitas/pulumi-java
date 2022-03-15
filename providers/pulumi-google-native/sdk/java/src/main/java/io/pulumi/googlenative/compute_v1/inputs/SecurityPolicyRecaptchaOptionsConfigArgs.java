// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyRecaptchaOptionsConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRecaptchaOptionsConfigArgs Empty = new SecurityPolicyRecaptchaOptionsConfigArgs();

    /**
     * An optional field to supply a reCAPTCHA site key to be used for all the rules using the redirect action with the type of GOOGLE_RECAPTCHA under the security policy. The specified site key needs to be created from the reCAPTCHA API. The user is responsible for the validity of the specified site key. If not specified, a Google-managed site key is used.
     * 
     */
    @Import(name="redirectSiteKey")
      private final @Nullable Output<String> redirectSiteKey;

    public Output<String> getRedirectSiteKey() {
        return this.redirectSiteKey == null ? Output.empty() : this.redirectSiteKey;
    }

    public SecurityPolicyRecaptchaOptionsConfigArgs(@Nullable Output<String> redirectSiteKey) {
        this.redirectSiteKey = redirectSiteKey;
    }

    private SecurityPolicyRecaptchaOptionsConfigArgs() {
        this.redirectSiteKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRecaptchaOptionsConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> redirectSiteKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRecaptchaOptionsConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.redirectSiteKey = defaults.redirectSiteKey;
        }

        public Builder redirectSiteKey(@Nullable Output<String> redirectSiteKey) {
            this.redirectSiteKey = redirectSiteKey;
            return this;
        }

        public Builder redirectSiteKey(@Nullable String redirectSiteKey) {
            this.redirectSiteKey = Output.ofNullable(redirectSiteKey);
            return this;
        }
        public SecurityPolicyRecaptchaOptionsConfigArgs build() {
            return new SecurityPolicyRecaptchaOptionsConfigArgs(redirectSiteKey);
        }
    }
}
