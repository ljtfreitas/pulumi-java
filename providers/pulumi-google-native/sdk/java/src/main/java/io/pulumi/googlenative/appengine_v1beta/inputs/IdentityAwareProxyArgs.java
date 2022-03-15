// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identity-Aware Proxy
 * 
 */
public final class IdentityAwareProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityAwareProxyArgs Empty = new IdentityAwareProxyArgs();

    /**
     * Whether the serving infrastructure will authenticate and authorize all incoming requests.If true, the oauth2_client_id and oauth2_client_secret fields must be non-empty.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * OAuth2 client ID to use for the authentication flow.
     * 
     */
    @Import(name="oauth2ClientId")
      private final @Nullable Output<String> oauth2ClientId;

    public Output<String> getOauth2ClientId() {
        return this.oauth2ClientId == null ? Output.empty() : this.oauth2ClientId;
    }

    /**
     * OAuth2 client secret to use for the authentication flow.For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2_client_secret_sha256 field.@InputOnly
     * 
     */
    @Import(name="oauth2ClientSecret")
      private final @Nullable Output<String> oauth2ClientSecret;

    public Output<String> getOauth2ClientSecret() {
        return this.oauth2ClientSecret == null ? Output.empty() : this.oauth2ClientSecret;
    }

    public IdentityAwareProxyArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> oauth2ClientId,
        @Nullable Output<String> oauth2ClientSecret) {
        this.enabled = enabled;
        this.oauth2ClientId = oauth2ClientId;
        this.oauth2ClientSecret = oauth2ClientSecret;
    }

    private IdentityAwareProxyArgs() {
        this.enabled = Output.empty();
        this.oauth2ClientId = Output.empty();
        this.oauth2ClientSecret = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityAwareProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> oauth2ClientId;
        private @Nullable Output<String> oauth2ClientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityAwareProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.oauth2ClientId = defaults.oauth2ClientId;
    	      this.oauth2ClientSecret = defaults.oauth2ClientSecret;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder oauth2ClientId(@Nullable Output<String> oauth2ClientId) {
            this.oauth2ClientId = oauth2ClientId;
            return this;
        }

        public Builder oauth2ClientId(@Nullable String oauth2ClientId) {
            this.oauth2ClientId = Output.ofNullable(oauth2ClientId);
            return this;
        }

        public Builder oauth2ClientSecret(@Nullable Output<String> oauth2ClientSecret) {
            this.oauth2ClientSecret = oauth2ClientSecret;
            return this;
        }

        public Builder oauth2ClientSecret(@Nullable String oauth2ClientSecret) {
            this.oauth2ClientSecret = Output.ofNullable(oauth2ClientSecret);
            return this;
        }
        public IdentityAwareProxyArgs build() {
            return new IdentityAwareProxyArgs(enabled, oauth2ClientId, oauth2ClientSecret);
        }
    }
}
