// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectorProfileConnectorOAuthRequest {
    /**
     * The code provided by the connector when it has been authenticated via the connected app.
     * 
     */
    private final @Nullable String authCode;
    /**
     * The URL to which the authentication server redirects the browser after authorization has been
     * granted.
     * 
     */
    private final @Nullable String redirectUri;

    @CustomType.Constructor
    private ConnectorProfileConnectorOAuthRequest(
        @CustomType.Parameter("authCode") @Nullable String authCode,
        @CustomType.Parameter("redirectUri") @Nullable String redirectUri) {
        this.authCode = authCode;
        this.redirectUri = redirectUri;
    }

    /**
     * The code provided by the connector when it has been authenticated via the connected app.
     * 
    */
    public Optional<String> getAuthCode() {
        return Optional.ofNullable(this.authCode);
    }
    /**
     * The URL to which the authentication server redirects the browser after authorization has been
     * granted.
     * 
    */
    public Optional<String> getRedirectUri() {
        return Optional.ofNullable(this.redirectUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileConnectorOAuthRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authCode;
        private @Nullable String redirectUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileConnectorOAuthRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authCode = defaults.authCode;
    	      this.redirectUri = defaults.redirectUri;
        }

        public Builder authCode(@Nullable String authCode) {
            this.authCode = authCode;
            return this;
        }

        public Builder redirectUri(@Nullable String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public ConnectorProfileConnectorOAuthRequest build() {
            return new ConnectorProfileConnectorOAuthRequest(authCode, redirectUri);
        }
    }
}
