// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identity-Aware Proxy
 * 
 */
public final class IdentityAwareProxyArgs extends com.pulumi.resources.ResourceArgs {

    public static final IdentityAwareProxyArgs Empty = new IdentityAwareProxyArgs();

    /**
     * Whether the serving infrastructure will authenticate and authorize all incoming requests.If true, the oauth2_client_id and oauth2_client_secret fields must be non-empty.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the serving infrastructure will authenticate and authorize all incoming requests.If true, the oauth2_client_id and oauth2_client_secret fields must be non-empty.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * OAuth2 client ID to use for the authentication flow.
     * 
     */
    @Import(name="oauth2ClientId")
    private @Nullable Output<String> oauth2ClientId;

    /**
     * @return OAuth2 client ID to use for the authentication flow.
     * 
     */
    public Optional<Output<String>> oauth2ClientId() {
        return Optional.ofNullable(this.oauth2ClientId);
    }

    /**
     * OAuth2 client secret to use for the authentication flow.For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2_client_secret_sha256 field.@InputOnly
     * 
     */
    @Import(name="oauth2ClientSecret")
    private @Nullable Output<String> oauth2ClientSecret;

    /**
     * @return OAuth2 client secret to use for the authentication flow.For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2_client_secret_sha256 field.@InputOnly
     * 
     */
    public Optional<Output<String>> oauth2ClientSecret() {
        return Optional.ofNullable(this.oauth2ClientSecret);
    }

    private IdentityAwareProxyArgs() {}

    private IdentityAwareProxyArgs(IdentityAwareProxyArgs $) {
        this.enabled = $.enabled;
        this.oauth2ClientId = $.oauth2ClientId;
        this.oauth2ClientSecret = $.oauth2ClientSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityAwareProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityAwareProxyArgs $;

        public Builder() {
            $ = new IdentityAwareProxyArgs();
        }

        public Builder(IdentityAwareProxyArgs defaults) {
            $ = new IdentityAwareProxyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether the serving infrastructure will authenticate and authorize all incoming requests.If true, the oauth2_client_id and oauth2_client_secret fields must be non-empty.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the serving infrastructure will authenticate and authorize all incoming requests.If true, the oauth2_client_id and oauth2_client_secret fields must be non-empty.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param oauth2ClientId OAuth2 client ID to use for the authentication flow.
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientId(@Nullable Output<String> oauth2ClientId) {
            $.oauth2ClientId = oauth2ClientId;
            return this;
        }

        /**
         * @param oauth2ClientId OAuth2 client ID to use for the authentication flow.
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientId(String oauth2ClientId) {
            return oauth2ClientId(Output.of(oauth2ClientId));
        }

        /**
         * @param oauth2ClientSecret OAuth2 client secret to use for the authentication flow.For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2_client_secret_sha256 field.@InputOnly
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientSecret(@Nullable Output<String> oauth2ClientSecret) {
            $.oauth2ClientSecret = oauth2ClientSecret;
            return this;
        }

        /**
         * @param oauth2ClientSecret OAuth2 client secret to use for the authentication flow.For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the oauth2_client_secret_sha256 field.@InputOnly
         * 
         * @return builder
         * 
         */
        public Builder oauth2ClientSecret(String oauth2ClientSecret) {
            return oauth2ClientSecret(Output.of(oauth2ClientSecret));
        }

        public IdentityAwareProxyArgs build() {
            return $;
        }
    }

}
