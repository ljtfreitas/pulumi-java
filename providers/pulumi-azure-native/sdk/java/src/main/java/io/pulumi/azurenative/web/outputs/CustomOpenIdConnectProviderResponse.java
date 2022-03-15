// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.OpenIdConnectLoginResponse;
import io.pulumi.azurenative.web.outputs.OpenIdConnectRegistrationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomOpenIdConnectProviderResponse {
    /**
     * <code>false</code> if the custom Open ID provider provider should not be enabled; otherwise, <code>true</code>.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The configuration settings of the login flow of the custom Open ID Connect provider.
     * 
     */
    private final @Nullable OpenIdConnectLoginResponse login;
    /**
     * The configuration settings of the app registration for the custom Open ID Connect provider.
     * 
     */
    private final @Nullable OpenIdConnectRegistrationResponse registration;

    @CustomType.Constructor
    private CustomOpenIdConnectProviderResponse(
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("login") @Nullable OpenIdConnectLoginResponse login,
        @CustomType.Parameter("registration") @Nullable OpenIdConnectRegistrationResponse registration) {
        this.enabled = enabled;
        this.login = login;
        this.registration = registration;
    }

    /**
     * <code>false</code> if the custom Open ID provider provider should not be enabled; otherwise, <code>true</code>.
     * 
    */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The configuration settings of the login flow of the custom Open ID Connect provider.
     * 
    */
    public Optional<OpenIdConnectLoginResponse> getLogin() {
        return Optional.ofNullable(this.login);
    }
    /**
     * The configuration settings of the app registration for the custom Open ID Connect provider.
     * 
    */
    public Optional<OpenIdConnectRegistrationResponse> getRegistration() {
        return Optional.ofNullable(this.registration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomOpenIdConnectProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable OpenIdConnectLoginResponse login;
        private @Nullable OpenIdConnectRegistrationResponse registration;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomOpenIdConnectProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.login = defaults.login;
    	      this.registration = defaults.registration;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder login(@Nullable OpenIdConnectLoginResponse login) {
            this.login = login;
            return this;
        }

        public Builder registration(@Nullable OpenIdConnectRegistrationResponse registration) {
            this.registration = registration;
            return this;
        }
        public CustomOpenIdConnectProviderResponse build() {
            return new CustomOpenIdConnectProviderResponse(enabled, login, registration);
        }
    }
}
