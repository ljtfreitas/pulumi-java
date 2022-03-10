// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.awsnative.appflow.outputs.ConnectorProfileConnectorOAuthRequest;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorProfileGoogleAnalyticsConnectorProfileCredentials {
    /**
     * The credentials used to access protected resources.
     * 
     */
    private final @Nullable String accessToken;
    /**
     * The identiﬁer for the desired client.
     * 
     */
    private final String clientId;
    /**
     * The client secret used by the oauth client to authenticate to the authorization server.
     * 
     */
    private final String clientSecret;
    /**
     * The oauth needed to request security tokens from the connector endpoint.
     * 
     */
    private final @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest;
    /**
     * The credentials used to acquire new access tokens.
     * 
     */
    private final @Nullable String refreshToken;

    @OutputCustomType.Constructor
    private ConnectorProfileGoogleAnalyticsConnectorProfileCredentials(
        @OutputCustomType.Parameter("accessToken") @Nullable String accessToken,
        @OutputCustomType.Parameter("clientId") String clientId,
        @OutputCustomType.Parameter("clientSecret") String clientSecret,
        @OutputCustomType.Parameter("connectorOAuthRequest") @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest,
        @OutputCustomType.Parameter("refreshToken") @Nullable String refreshToken) {
        this.accessToken = accessToken;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.connectorOAuthRequest = connectorOAuthRequest;
        this.refreshToken = refreshToken;
    }

    /**
     * The credentials used to access protected resources.
     * 
    */
    public Optional<String> getAccessToken() {
        return Optional.ofNullable(this.accessToken);
    }
    /**
     * The identiﬁer for the desired client.
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * The client secret used by the oauth client to authenticate to the authorization server.
     * 
    */
    public String getClientSecret() {
        return this.clientSecret;
    }
    /**
     * The oauth needed to request security tokens from the connector endpoint.
     * 
    */
    public Optional<ConnectorProfileConnectorOAuthRequest> getConnectorOAuthRequest() {
        return Optional.ofNullable(this.connectorOAuthRequest);
    }
    /**
     * The credentials used to acquire new access tokens.
     * 
    */
    public Optional<String> getRefreshToken() {
        return Optional.ofNullable(this.refreshToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileGoogleAnalyticsConnectorProfileCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessToken;
        private String clientId;
        private String clientSecret;
        private @Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest;
        private @Nullable String refreshToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileGoogleAnalyticsConnectorProfileCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.connectorOAuthRequest = defaults.connectorOAuthRequest;
    	      this.refreshToken = defaults.refreshToken;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }

        public Builder setConnectorOAuthRequest(@Nullable ConnectorProfileConnectorOAuthRequest connectorOAuthRequest) {
            this.connectorOAuthRequest = connectorOAuthRequest;
            return this;
        }

        public Builder setRefreshToken(@Nullable String refreshToken) {
            this.refreshToken = refreshToken;
            return this;
        }
        public ConnectorProfileGoogleAnalyticsConnectorProfileCredentials build() {
            return new ConnectorProfileGoogleAnalyticsConnectorProfileCredentials(accessToken, clientId, clientSecret, connectorOAuthRequest, refreshToken);
        }
    }
}
