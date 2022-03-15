// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.AppRegistrationArgs;
import io.pulumi.azurenative.web.inputs.LoginScopesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the Facebook provider.
 * 
 */
public final class FacebookArgs extends io.pulumi.resources.ResourceArgs {

    public static final FacebookArgs Empty = new FacebookArgs();

    /**
     * <code>false</code> if the Facebook provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The version of the Facebook api to be used while logging in.
     * 
     */
    @Import(name="graphApiVersion")
      private final @Nullable Output<String> graphApiVersion;

    public Output<String> getGraphApiVersion() {
        return this.graphApiVersion == null ? Output.empty() : this.graphApiVersion;
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
     * The configuration settings of the app registration for the Facebook provider.
     * 
     */
    @Import(name="registration")
      private final @Nullable Output<AppRegistrationArgs> registration;

    public Output<AppRegistrationArgs> getRegistration() {
        return this.registration == null ? Output.empty() : this.registration;
    }

    public FacebookArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> graphApiVersion,
        @Nullable Output<LoginScopesArgs> login,
        @Nullable Output<AppRegistrationArgs> registration) {
        this.enabled = enabled;
        this.graphApiVersion = graphApiVersion;
        this.login = login;
        this.registration = registration;
    }

    private FacebookArgs() {
        this.enabled = Output.empty();
        this.graphApiVersion = Output.empty();
        this.login = Output.empty();
        this.registration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacebookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> graphApiVersion;
        private @Nullable Output<LoginScopesArgs> login;
        private @Nullable Output<AppRegistrationArgs> registration;

        public Builder() {
    	      // Empty
        }

        public Builder(FacebookArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.graphApiVersion = defaults.graphApiVersion;
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

        public Builder graphApiVersion(@Nullable Output<String> graphApiVersion) {
            this.graphApiVersion = graphApiVersion;
            return this;
        }

        public Builder graphApiVersion(@Nullable String graphApiVersion) {
            this.graphApiVersion = Output.ofNullable(graphApiVersion);
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

        public Builder registration(@Nullable Output<AppRegistrationArgs> registration) {
            this.registration = registration;
            return this;
        }

        public Builder registration(@Nullable AppRegistrationArgs registration) {
            this.registration = Output.ofNullable(registration);
            return this;
        }
        public FacebookArgs build() {
            return new FacebookArgs(enabled, graphApiVersion, login, registration);
        }
    }
}
