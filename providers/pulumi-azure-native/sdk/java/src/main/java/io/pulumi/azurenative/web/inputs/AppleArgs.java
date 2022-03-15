// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.AppleRegistrationArgs;
import io.pulumi.azurenative.web.inputs.LoginScopesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the Apple provider.
 * 
 */
public final class AppleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppleArgs Empty = new AppleArgs();

    /**
     * <code>false</code> if the Apple provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The configuration settings of the login flow.
     * 
     */
    @Import(name="login")
      private final @Nullable Output<LoginScopesArgs> login;

    public Output<LoginScopesArgs> getLogin() {
        return this.login == null ? Output.empty() : this.login;
    }

    /**
     * The configuration settings of the Apple registration.
     * 
     */
    @Import(name="registration")
      private final @Nullable Output<AppleRegistrationArgs> registration;

    public Output<AppleRegistrationArgs> getRegistration() {
        return this.registration == null ? Output.empty() : this.registration;
    }

    public AppleArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<LoginScopesArgs> login,
        @Nullable Output<AppleRegistrationArgs> registration) {
        this.enabled = enabled;
        this.login = login;
        this.registration = registration;
    }

    private AppleArgs() {
        this.enabled = Output.empty();
        this.login = Output.empty();
        this.registration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<LoginScopesArgs> login;
        private @Nullable Output<AppleRegistrationArgs> registration;

        public Builder() {
    	      // Empty
        }

        public Builder(AppleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder login(@Nullable Output<LoginScopesArgs> login) {
            this.login = login;
            return this;
        }

        public Builder login(@Nullable LoginScopesArgs login) {
            this.login = Output.ofNullable(login);
            return this;
        }

        public Builder registration(@Nullable Output<AppleRegistrationArgs> registration) {
            this.registration = registration;
            return this;
        }

        public Builder registration(@Nullable AppleRegistrationArgs registration) {
            this.registration = Output.ofNullable(registration);
            return this;
        }
        public AppleArgs build() {
            return new AppleArgs(enabled, login, registration);
        }
    }
}
