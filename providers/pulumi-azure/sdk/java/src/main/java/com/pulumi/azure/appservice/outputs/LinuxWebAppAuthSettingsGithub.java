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
public final class LinuxWebAppAuthSettingsGithub {
    /**
     * @return The ID of the GitHub app used for login.
     * 
     */
    private final String clientId;
    /**
     * @return The Client Secret of the GitHub app used for GitHub Login. Cannot be specified with `client_secret_setting_name`.
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * @return The app setting name that contains the `client_secret` value used for GitHub Login. Cannot be specified with `client_secret`.
     * 
     */
    private final @Nullable String clientSecretSettingName;
    /**
     * @return Specifies a list of OAuth 2.0 scopes that will be requested as part of GitHub Login authentication.
     * 
     */
    private final @Nullable List<String> oauthScopes;

    @CustomType.Constructor
    private LinuxWebAppAuthSettingsGithub(
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
     * @return The ID of the GitHub app used for login.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The Client Secret of the GitHub app used for GitHub Login. Cannot be specified with `client_secret_setting_name`.
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * @return The app setting name that contains the `client_secret` value used for GitHub Login. Cannot be specified with `client_secret`.
     * 
     */
    public Optional<String> clientSecretSettingName() {
        return Optional.ofNullable(this.clientSecretSettingName);
    }
    /**
     * @return Specifies a list of OAuth 2.0 scopes that will be requested as part of GitHub Login authentication.
     * 
     */
    public List<String> oauthScopes() {
        return this.oauthScopes == null ? List.of() : this.oauthScopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxWebAppAuthSettingsGithub defaults) {
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

        public Builder(LinuxWebAppAuthSettingsGithub defaults) {
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
        }        public LinuxWebAppAuthSettingsGithub build() {
            return new LinuxWebAppAuthSettingsGithub(clientId, clientSecret, clientSecretSettingName, oauthScopes);
        }
    }
}
