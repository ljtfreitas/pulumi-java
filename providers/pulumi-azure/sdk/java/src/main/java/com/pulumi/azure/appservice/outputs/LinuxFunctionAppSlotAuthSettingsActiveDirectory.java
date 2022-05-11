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
public final class LinuxFunctionAppSlotAuthSettingsActiveDirectory {
    /**
     * @return an `allowed_audiences` block as detailed below.
     * 
     */
    private final @Nullable List<String> allowedAudiences;
    /**
     * @return The ID of the Client to use to authenticate with Azure Active Directory.
     * 
     */
    private final String clientId;
    /**
     * @return The Client Secret for the Client ID. Cannot be used with `client_secret_setting_name`.
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * @return The App Setting name that contains the client secret of the Client. Cannot be used with `client_secret`.
     * 
     */
    private final @Nullable String clientSecretSettingName;

    @CustomType.Constructor
    private LinuxFunctionAppSlotAuthSettingsActiveDirectory(
        @CustomType.Parameter("allowedAudiences") @Nullable List<String> allowedAudiences,
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientSecret") @Nullable String clientSecret,
        @CustomType.Parameter("clientSecretSettingName") @Nullable String clientSecretSettingName) {
        this.allowedAudiences = allowedAudiences;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.clientSecretSettingName = clientSecretSettingName;
    }

    /**
     * @return an `allowed_audiences` block as detailed below.
     * 
     */
    public List<String> allowedAudiences() {
        return this.allowedAudiences == null ? List.of() : this.allowedAudiences;
    }
    /**
     * @return The ID of the Client to use to authenticate with Azure Active Directory.
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return The Client Secret for the Client ID. Cannot be used with `client_secret_setting_name`.
     * 
     */
    public Optional<String> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * @return The App Setting name that contains the client secret of the Client. Cannot be used with `client_secret`.
     * 
     */
    public Optional<String> clientSecretSettingName() {
        return Optional.ofNullable(this.clientSecretSettingName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxFunctionAppSlotAuthSettingsActiveDirectory defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedAudiences;
        private String clientId;
        private @Nullable String clientSecret;
        private @Nullable String clientSecretSettingName;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxFunctionAppSlotAuthSettingsActiveDirectory defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedAudiences = defaults.allowedAudiences;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.clientSecretSettingName = defaults.clientSecretSettingName;
        }

        public Builder allowedAudiences(@Nullable List<String> allowedAudiences) {
            this.allowedAudiences = allowedAudiences;
            return this;
        }
        public Builder allowedAudiences(String... allowedAudiences) {
            return allowedAudiences(List.of(allowedAudiences));
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
        }        public LinuxFunctionAppSlotAuthSettingsActiveDirectory build() {
            return new LinuxFunctionAppSlotAuthSettingsActiveDirectory(allowedAudiences, clientId, clientSecret, clientSecretSettingName);
        }
    }
}
