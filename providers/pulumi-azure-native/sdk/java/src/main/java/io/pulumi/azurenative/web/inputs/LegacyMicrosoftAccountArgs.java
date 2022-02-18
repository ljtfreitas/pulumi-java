// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.AllowedAudiencesValidationArgs;
import io.pulumi.azurenative.web.inputs.ClientRegistrationArgs;
import io.pulumi.azurenative.web.inputs.LoginScopesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the legacy Microsoft Account provider.
 * 
 */
public final class LegacyMicrosoftAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final LegacyMicrosoftAccountArgs Empty = new LegacyMicrosoftAccountArgs();

    /**
     * <code>false</code> if the legacy Microsoft Account provider should not be enabled despite the set registration; otherwise, <code>true</code>.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The configuration settings of the login flow.
     * 
     */
    @InputImport(name="login")
    private final @Nullable Input<LoginScopesArgs> login;

    public Input<LoginScopesArgs> getLogin() {
        return this.login == null ? Input.empty() : this.login;
    }

    /**
     * The configuration settings of the app registration for the legacy Microsoft Account provider.
     * 
     */
    @InputImport(name="registration")
    private final @Nullable Input<ClientRegistrationArgs> registration;

    public Input<ClientRegistrationArgs> getRegistration() {
        return this.registration == null ? Input.empty() : this.registration;
    }

    /**
     * The configuration settings of the legacy Microsoft Account provider token validation flow.
     * 
     */
    @InputImport(name="validation")
    private final @Nullable Input<AllowedAudiencesValidationArgs> validation;

    public Input<AllowedAudiencesValidationArgs> getValidation() {
        return this.validation == null ? Input.empty() : this.validation;
    }

    public LegacyMicrosoftAccountArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<LoginScopesArgs> login,
        @Nullable Input<ClientRegistrationArgs> registration,
        @Nullable Input<AllowedAudiencesValidationArgs> validation) {
        this.enabled = enabled;
        this.login = login;
        this.registration = registration;
        this.validation = validation;
    }

    private LegacyMicrosoftAccountArgs() {
        this.enabled = Input.empty();
        this.login = Input.empty();
        this.registration = Input.empty();
        this.validation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LegacyMicrosoftAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<LoginScopesArgs> login;
        private @Nullable Input<ClientRegistrationArgs> registration;
        private @Nullable Input<AllowedAudiencesValidationArgs> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(LegacyMicrosoftAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
    	      this.validation = defaults.validation;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setLogin(@Nullable Input<LoginScopesArgs> login) {
            this.login = login;
            return this;
        }

        public Builder setLogin(@Nullable LoginScopesArgs login) {
            this.login = Input.ofNullable(login);
            return this;
        }

        public Builder setRegistration(@Nullable Input<ClientRegistrationArgs> registration) {
            this.registration = registration;
            return this;
        }

        public Builder setRegistration(@Nullable ClientRegistrationArgs registration) {
            this.registration = Input.ofNullable(registration);
            return this;
        }

        public Builder setValidation(@Nullable Input<AllowedAudiencesValidationArgs> validation) {
            this.validation = validation;
            return this;
        }

        public Builder setValidation(@Nullable AllowedAudiencesValidationArgs validation) {
            this.validation = Input.ofNullable(validation);
            return this;
        }

        public LegacyMicrosoftAccountArgs build() {
            return new LegacyMicrosoftAccountArgs(enabled, login, registration, validation);
        }
    }
}
