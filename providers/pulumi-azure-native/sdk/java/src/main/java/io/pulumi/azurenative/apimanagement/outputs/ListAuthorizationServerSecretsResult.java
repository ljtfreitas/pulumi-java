// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListAuthorizationServerSecretsResult {
    /**
     * oAuth Authorization Server Secrets.
     * 
     */
    private final @Nullable String clientSecret;
    /**
     * Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password.
     * 
     */
    private final @Nullable String resourceOwnerPassword;
    /**
     * Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username.
     * 
     */
    private final @Nullable String resourceOwnerUsername;

    @OutputCustomType.Constructor({"clientSecret","resourceOwnerPassword","resourceOwnerUsername"})
    private ListAuthorizationServerSecretsResult(
        @Nullable String clientSecret,
        @Nullable String resourceOwnerPassword,
        @Nullable String resourceOwnerUsername) {
        this.clientSecret = clientSecret;
        this.resourceOwnerPassword = resourceOwnerPassword;
        this.resourceOwnerUsername = resourceOwnerUsername;
    }

    /**
     * oAuth Authorization Server Secrets.
     * 
     */
    public Optional<String> getClientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }
    /**
     * Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner password.
     * 
     */
    public Optional<String> getResourceOwnerPassword() {
        return Optional.ofNullable(this.resourceOwnerPassword);
    }
    /**
     * Can be optionally specified when resource owner password grant type is supported by this authorization server. Default resource owner username.
     * 
     */
    public Optional<String> getResourceOwnerUsername() {
        return Optional.ofNullable(this.resourceOwnerUsername);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListAuthorizationServerSecretsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientSecret;
        private @Nullable String resourceOwnerPassword;
        private @Nullable String resourceOwnerUsername;

        public Builder() {
    	      // Empty
        }

        public Builder(ListAuthorizationServerSecretsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientSecret = defaults.clientSecret;
    	      this.resourceOwnerPassword = defaults.resourceOwnerPassword;
    	      this.resourceOwnerUsername = defaults.resourceOwnerUsername;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setResourceOwnerPassword(@Nullable String resourceOwnerPassword) {
            this.resourceOwnerPassword = resourceOwnerPassword;
            return this;
        }

        public Builder setResourceOwnerUsername(@Nullable String resourceOwnerUsername) {
            this.resourceOwnerUsername = resourceOwnerUsername;
            return this;
        }
        public ListAuthorizationServerSecretsResult build() {
            return new ListAuthorizationServerSecretsResult(clientSecret, resourceOwnerPassword, resourceOwnerUsername);
        }
    }
}
