// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BackendServiceIAPResponse {
    /**
     * Whether the serving infrastructure will authenticate and authorize all incoming requests. If true, the oauth2ClientId and oauth2ClientSecret fields must be non-empty.
     * 
     */
    private final Boolean enabled;
    /**
     * OAuth2 client ID to use for the authentication flow.
     * 
     */
    private final String oauth2ClientId;
    /**
     * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. @InputOnly
     * 
     */
    private final String oauth2ClientSecret;
    /**
     * SHA256 hash value for the field oauth2_client_secret above.
     * 
     */
    private final String oauth2ClientSecretSha256;

    @CustomType.Constructor
    private BackendServiceIAPResponse(
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("oauth2ClientId") String oauth2ClientId,
        @CustomType.Parameter("oauth2ClientSecret") String oauth2ClientSecret,
        @CustomType.Parameter("oauth2ClientSecretSha256") String oauth2ClientSecretSha256) {
        this.enabled = enabled;
        this.oauth2ClientId = oauth2ClientId;
        this.oauth2ClientSecret = oauth2ClientSecret;
        this.oauth2ClientSecretSha256 = oauth2ClientSecretSha256;
    }

    /**
     * Whether the serving infrastructure will authenticate and authorize all incoming requests. If true, the oauth2ClientId and oauth2ClientSecret fields must be non-empty.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * OAuth2 client ID to use for the authentication flow.
     * 
    */
    public String getOauth2ClientId() {
        return this.oauth2ClientId;
    }
    /**
     * OAuth2 client secret to use for the authentication flow. For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2ClientSecretSha256 field. @InputOnly
     * 
    */
    public String getOauth2ClientSecret() {
        return this.oauth2ClientSecret;
    }
    /**
     * SHA256 hash value for the field oauth2_client_secret above.
     * 
    */
    public String getOauth2ClientSecretSha256() {
        return this.oauth2ClientSecretSha256;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceIAPResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String oauth2ClientId;
        private String oauth2ClientSecret;
        private String oauth2ClientSecretSha256;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceIAPResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.oauth2ClientId = defaults.oauth2ClientId;
    	      this.oauth2ClientSecret = defaults.oauth2ClientSecret;
    	      this.oauth2ClientSecretSha256 = defaults.oauth2ClientSecretSha256;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder oauth2ClientId(String oauth2ClientId) {
            this.oauth2ClientId = Objects.requireNonNull(oauth2ClientId);
            return this;
        }

        public Builder oauth2ClientSecret(String oauth2ClientSecret) {
            this.oauth2ClientSecret = Objects.requireNonNull(oauth2ClientSecret);
            return this;
        }

        public Builder oauth2ClientSecretSha256(String oauth2ClientSecretSha256) {
            this.oauth2ClientSecretSha256 = Objects.requireNonNull(oauth2ClientSecretSha256);
            return this;
        }
        public BackendServiceIAPResponse build() {
            return new BackendServiceIAPResponse(enabled, oauth2ClientId, oauth2ClientSecret, oauth2ClientSecretSha256);
        }
    }
}
