// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.ApiOAuthSettingsParameterResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiOAuthSettingsResponse {
    /**
     * Resource provider client id
     * 
     */
    private final @Nullable String clientId;
    /**
     * Client Secret needed for OAuth
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * OAuth parameters key is the name of parameter
     * 
     */
    private final @Nullable Map<String,ApiOAuthSettingsParameterResponse> customParameters;
    /**
     * Identity provider
     * 
     */
    private final @Nullable String identityProvider;
    /**
     * Read only properties for this oauth setting.
     * 
     */
    private final @Nullable Object properties;
    /**
     * Url
     * 
     */
    private final @Nullable String redirectUrl;
    /**
     * OAuth scopes
     * 
     */
    private final @Nullable List<String> scopes;

    @OutputCustomType.Constructor({"clientId","clientSecret","customParameters","identityProvider","properties","redirectUrl","scopes"})
    private ApiOAuthSettingsResponse(
        @Nullable String clientId,
        @Nullable String clientSecret,
        @Nullable Map<String,ApiOAuthSettingsParameterResponse> customParameters,
        @Nullable String identityProvider,
        @Nullable Object properties,
        @Nullable String redirectUrl,
        @Nullable List<String> scopes) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.customParameters = customParameters;
        this.identityProvider = identityProvider;
        this.properties = properties;
        this.redirectUrl = redirectUrl;
        this.scopes = scopes;
    }

    /**
     * Resource provider client id
     * 
     */
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * Client Secret needed for OAuth
     * 
     */
    public Optional<String> getClientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * OAuth parameters key is the name of parameter
     * 
     */
    public Map<String,ApiOAuthSettingsParameterResponse> getCustomParameters() {
        return this.customParameters == null ? Map.of() : this.customParameters;
    }
    /**
     * Identity provider
     * 
     */
    public Optional<String> getIdentityProvider() {
        return Optional.ofNullable(this.identityProvider);
    }
    /**
     * Read only properties for this oauth setting.
     * 
     */
    public Optional<Object> getProperties() {
        return Optional.ofNullable(this.properties);
    }
    /**
     * Url
     * 
     */
    public Optional<String> getRedirectUrl() {
        return Optional.ofNullable(this.redirectUrl);
    }
    /**
     * OAuth scopes
     * 
     */
    public List<String> getScopes() {
        return this.scopes == null ? List.of() : this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiOAuthSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String clientSecret;
        private @Nullable Map<String,ApiOAuthSettingsParameterResponse> customParameters;
        private @Nullable String identityProvider;
        private @Nullable Object properties;
        private @Nullable String redirectUrl;
        private @Nullable List<String> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiOAuthSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.customParameters = defaults.customParameters;
    	      this.identityProvider = defaults.identityProvider;
    	      this.properties = defaults.properties;
    	      this.redirectUrl = defaults.redirectUrl;
    	      this.scopes = defaults.scopes;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setCustomParameters(@Nullable Map<String,ApiOAuthSettingsParameterResponse> customParameters) {
            this.customParameters = customParameters;
            return this;
        }

        public Builder setIdentityProvider(@Nullable String identityProvider) {
            this.identityProvider = identityProvider;
            return this;
        }

        public Builder setProperties(@Nullable Object properties) {
            this.properties = properties;
            return this;
        }

        public Builder setRedirectUrl(@Nullable String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }

        public Builder setScopes(@Nullable List<String> scopes) {
            this.scopes = scopes;
            return this;
        }

        public ApiOAuthSettingsResponse build() {
            return new ApiOAuthSettingsResponse(clientId, clientSecret, customParameters, identityProvider, properties, redirectUrl, scopes);
        }
    }
}
