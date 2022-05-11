// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LinuxWebAppAuthSettingsGoogle {
    /**
     * @return The OpenID Connect Client ID for the Google web application.
     * 
     */
    private final String clientId;
    /**
     * @return The client secret associated with the Google web application.  Cannot be specified with `client_secret_setting_name`.
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * @return The app setting name that contains the `client_secret` value used for Google Login. Cannot be specified with `client_secret`.
     * 
     */
    private final @Nullable String clientSecretSettingName;
    /**
     * @return Specifies a list of OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication. If not specified, &#34;openid&#34;, &#34;profile&#34;, and &#34;email&#34; are used as default scopes.
     * 
     */
    private final @Nullable List<String> oauthScopes;

    @CustomType.Constructor
    private LinuxWebAppAuthSettingsGoogle(
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientSecret") @Nullable String clientSecret,
        @CustomType.Parameter("clientSecretSettingName") @Nullable String clientSecretSettingName,
        @CustomType.Parameter("oauthScopes") @Nullable List<String> oauthScopes) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.clientSecretSettingName = clientSecretSettingName;
        this.oauthScopes = oauthScopes;
    }

    /**
     * @return The OpenID Connect Client ID for the Google web application.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The client secret associated with the Google web application.  Cannot be specified with `client_secret_setting_name`.
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * @return The app setting name that contains the `client_secret` value used for Google Login. Cannot be specified with `client_secret`.
     * 
     */
    public Optional<String> clientSecretSettingName() {
        return Optional.ofNullable(this.clientSecretSettingName);
    }
    /**
     * @return Specifies a list of OAuth 2.0 scopes that will be requested as part of Google Sign-In authentication. If not specified, &#34;openid&#34;, &#34;profile&#34;, and &#34;email&#34; are used as default scopes.
     * 
     */
    public List<String> oauthScopes() {
        return this.oauthScopes == null ? List.of() : this.oauthScopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxWebAppAuthSettingsGoogle defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private @Nullable String clientSecret;
        private @Nullable String clientSecretSettingName;
        private @Nullable List<String> oauthScopes;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxWebAppAuthSettingsGoogle defaults) {
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
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder clientSecretSettingName(@Nullable String clientSecretSettingName) {
            this.clientSecretSettingName = clientSecretSettingName;
            return this;
        }
        public Builder oauthScopes(@Nullable List<String> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }        public LinuxWebAppAuthSettingsGoogle build() {
            return new LinuxWebAppAuthSettingsGoogle(clientId, clientSecret, clientSecretSettingName, oauthScopes);
        }
    }
}
