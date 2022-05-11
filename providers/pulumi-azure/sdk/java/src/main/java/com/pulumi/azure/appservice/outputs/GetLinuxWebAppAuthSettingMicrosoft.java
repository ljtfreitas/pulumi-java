// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLinuxWebAppAuthSettingMicrosoft {
    /**
     * @return The OAuth 2.0 client ID used by the app for authentication.
     * 
     */
    private final String clientId;
    /**
     * @return The OAuth 2.0 client secret used by the app for authentication.
     * 
     */
    private final String clientSecret;
    /**
     * @return The app setting name containing the OAuth 2.0 client secret used by the app for authentication.
     * 
     */
    private final String clientSecretSettingName;
    /**
     * @return A list of OAuth 2.0 scopes requested as part of Microsoft Account authentication.
     * 
     */
    private final List<String> oauthScopes;

    @CustomType.Constructor
    private GetLinuxWebAppAuthSettingMicrosoft(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientSecret") String clientSecret,
        @CustomType.Parameter("clientSecretSettingName") String clientSecretSettingName,
        @CustomType.Parameter("oauthScopes") List<String> oauthScopes) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.clientSecretSettingName = clientSecretSettingName;
        this.oauthScopes = oauthScopes;
    }

    /**
     * @return The OAuth 2.0 client ID used by the app for authentication.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The OAuth 2.0 client secret used by the app for authentication.
     * 
     */
    public String clientSecret() {
        return this.clientSecret;
    }
    /**
     * @return The app setting name containing the OAuth 2.0 client secret used by the app for authentication.
     * 
     */
    public String clientSecretSettingName() {
        return this.clientSecretSettingName;
    }
    /**
     * @return A list of OAuth 2.0 scopes requested as part of Microsoft Account authentication.
     * 
     */
    public List<String> oauthScopes() {
        return this.oauthScopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinuxWebAppAuthSettingMicrosoft defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String clientSecret;
        private String clientSecretSettingName;
        private List<String> oauthScopes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinuxWebAppAuthSettingMicrosoft defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.clientSecretSettingName = defaults.clientSecretSettingName;
    	      this.oauthScopes = defaults.oauthScopes;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }
        public Builder clientSecretSettingName(String clientSecretSettingName) {
            this.clientSecretSettingName = Objects.requireNonNull(clientSecretSettingName);
            return this;
        }
        public Builder oauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }        public GetLinuxWebAppAuthSettingMicrosoft build() {
            return new GetLinuxWebAppAuthSettingMicrosoft(clientId, clientSecret, clientSecretSettingName, oauthScopes);
        }
    }
}
