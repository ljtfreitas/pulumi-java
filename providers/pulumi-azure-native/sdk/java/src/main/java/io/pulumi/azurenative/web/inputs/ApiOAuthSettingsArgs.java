// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ApiOAuthSettingsParameterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * OAuth settings for the connection provider
 * 
 */
public final class ApiOAuthSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiOAuthSettingsArgs Empty = new ApiOAuthSettingsArgs();

    /**
     * Resource provider client id
     * 
     */
    @InputImport(name="clientId")
        private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * Client Secret needed for OAuth
     * 
     */
    @InputImport(name="clientSecret")
        private final @Nullable Input<String> clientSecret;

    public Input<String> getClientSecret() {
        return this.clientSecret == null ? Input.empty() : this.clientSecret;
    }

    /**
     * OAuth parameters key is the name of parameter
     * 
     */
    @InputImport(name="customParameters")
        private final @Nullable Input<Map<String,ApiOAuthSettingsParameterArgs>> customParameters;

    public Input<Map<String,ApiOAuthSettingsParameterArgs>> getCustomParameters() {
        return this.customParameters == null ? Input.empty() : this.customParameters;
    }

    /**
     * Identity provider
     * 
     */
    @InputImport(name="identityProvider")
        private final @Nullable Input<String> identityProvider;

    public Input<String> getIdentityProvider() {
        return this.identityProvider == null ? Input.empty() : this.identityProvider;
    }

    /**
     * Read only properties for this oauth setting.
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Input<Object> properties;

    public Input<Object> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * Url
     * 
     */
    @InputImport(name="redirectUrl")
        private final @Nullable Input<String> redirectUrl;

    public Input<String> getRedirectUrl() {
        return this.redirectUrl == null ? Input.empty() : this.redirectUrl;
    }

    /**
     * OAuth scopes
     * 
     */
    @InputImport(name="scopes")
        private final @Nullable Input<List<String>> scopes;

    public Input<List<String>> getScopes() {
        return this.scopes == null ? Input.empty() : this.scopes;
    }

    public ApiOAuthSettingsArgs(
        @Nullable Input<String> clientId,
        @Nullable Input<String> clientSecret,
        @Nullable Input<Map<String,ApiOAuthSettingsParameterArgs>> customParameters,
        @Nullable Input<String> identityProvider,
        @Nullable Input<Object> properties,
        @Nullable Input<String> redirectUrl,
        @Nullable Input<List<String>> scopes) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.customParameters = customParameters;
        this.identityProvider = identityProvider;
        this.properties = properties;
        this.redirectUrl = redirectUrl;
        this.scopes = scopes;
    }

    private ApiOAuthSettingsArgs() {
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
        this.customParameters = Input.empty();
        this.identityProvider = Input.empty();
        this.properties = Input.empty();
        this.redirectUrl = Input.empty();
        this.scopes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiOAuthSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> clientSecret;
        private @Nullable Input<Map<String,ApiOAuthSettingsParameterArgs>> customParameters;
        private @Nullable Input<String> identityProvider;
        private @Nullable Input<Object> properties;
        private @Nullable Input<String> redirectUrl;
        private @Nullable Input<List<String>> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiOAuthSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.customParameters = defaults.customParameters;
    	      this.identityProvider = defaults.identityProvider;
    	      this.properties = defaults.properties;
    	      this.redirectUrl = defaults.redirectUrl;
    	      this.scopes = defaults.scopes;
        }

        public Builder setClientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder setClientSecret(@Nullable Input<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = Input.ofNullable(clientSecret);
            return this;
        }

        public Builder setCustomParameters(@Nullable Input<Map<String,ApiOAuthSettingsParameterArgs>> customParameters) {
            this.customParameters = customParameters;
            return this;
        }

        public Builder setCustomParameters(@Nullable Map<String,ApiOAuthSettingsParameterArgs> customParameters) {
            this.customParameters = Input.ofNullable(customParameters);
            return this;
        }

        public Builder setIdentityProvider(@Nullable Input<String> identityProvider) {
            this.identityProvider = identityProvider;
            return this;
        }

        public Builder setIdentityProvider(@Nullable String identityProvider) {
            this.identityProvider = Input.ofNullable(identityProvider);
            return this;
        }

        public Builder setProperties(@Nullable Input<Object> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Object properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setRedirectUrl(@Nullable Input<String> redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }

        public Builder setRedirectUrl(@Nullable String redirectUrl) {
            this.redirectUrl = Input.ofNullable(redirectUrl);
            return this;
        }

        public Builder setScopes(@Nullable Input<List<String>> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder setScopes(@Nullable List<String> scopes) {
            this.scopes = Input.ofNullable(scopes);
            return this;
        }
        public ApiOAuthSettingsArgs build() {
            return new ApiOAuthSettingsArgs(clientId, clientSecret, customParameters, identityProvider, properties, redirectUrl, scopes);
        }
    }
}
