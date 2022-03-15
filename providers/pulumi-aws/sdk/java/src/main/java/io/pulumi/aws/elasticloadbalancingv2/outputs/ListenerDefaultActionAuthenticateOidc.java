// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerDefaultActionAuthenticateOidc {
    /**
     * Query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
     */
    private final @Nullable Map<String,String> authenticationRequestExtraParams;
    /**
     * Authorization endpoint of the IdP.
     * 
     */
    private final String authorizationEndpoint;
    /**
     * OAuth 2.0 client identifier.
     * 
     */
    private final String clientId;
    /**
     * OAuth 2.0 client secret.
     * 
     */
    private final String clientSecret;
    /**
     * OIDC issuer identifier of the IdP.
     * 
     */
    private final String issuer;
    /**
     * Behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
     */
    private final @Nullable String onUnauthenticatedRequest;
    /**
     * Set of user claims to be requested from the IdP.
     * 
     */
    private final @Nullable String scope;
    /**
     * Name of the cookie used to maintain session information.
     * 
     */
    private final @Nullable String sessionCookieName;
    /**
     * Maximum duration of the authentication session, in seconds.
     * 
     */
    private final @Nullable Integer sessionTimeout;
    /**
     * Token endpoint of the IdP.
     * 
     */
    private final String tokenEndpoint;
    /**
     * User info endpoint of the IdP.
     * 
     */
    private final String userInfoEndpoint;

    @CustomType.Constructor
    private ListenerDefaultActionAuthenticateOidc(
        @CustomType.Parameter("authenticationRequestExtraParams") @Nullable Map<String,String> authenticationRequestExtraParams,
        @CustomType.Parameter("authorizationEndpoint") String authorizationEndpoint,
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientSecret") String clientSecret,
        @CustomType.Parameter("issuer") String issuer,
        @CustomType.Parameter("onUnauthenticatedRequest") @Nullable String onUnauthenticatedRequest,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("sessionCookieName") @Nullable String sessionCookieName,
        @CustomType.Parameter("sessionTimeout") @Nullable Integer sessionTimeout,
        @CustomType.Parameter("tokenEndpoint") String tokenEndpoint,
        @CustomType.Parameter("userInfoEndpoint") String userInfoEndpoint) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.authorizationEndpoint = authorizationEndpoint;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.issuer = issuer;
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.tokenEndpoint = tokenEndpoint;
        this.userInfoEndpoint = userInfoEndpoint;
    }

    /**
     * Query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
    */
    public Map<String,String> getAuthenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams == null ? Map.of() : this.authenticationRequestExtraParams;
    }
    /**
     * Authorization endpoint of the IdP.
     * 
    */
    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }
    /**
     * OAuth 2.0 client identifier.
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * OAuth 2.0 client secret.
     * 
    */
    public String getClientSecret() {
        return this.clientSecret;
    }
    /**
     * OIDC issuer identifier of the IdP.
     * 
    */
    public String getIssuer() {
        return this.issuer;
    }
    /**
     * Behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
    */
    public Optional<String> getOnUnauthenticatedRequest() {
        return Optional.ofNullable(this.onUnauthenticatedRequest);
    }
    /**
     * Set of user claims to be requested from the IdP.
     * 
    */
    public Optional<String> getScope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * Name of the cookie used to maintain session information.
     * 
    */
    public Optional<String> getSessionCookieName() {
        return Optional.ofNullable(this.sessionCookieName);
    }
    /**
     * Maximum duration of the authentication session, in seconds.
     * 
    */
    public Optional<Integer> getSessionTimeout() {
        return Optional.ofNullable(this.sessionTimeout);
    }
    /**
     * Token endpoint of the IdP.
     * 
    */
    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }
    /**
     * User info endpoint of the IdP.
     * 
    */
    public String getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionAuthenticateOidc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> authenticationRequestExtraParams;
        private String authorizationEndpoint;
        private String clientId;
        private String clientSecret;
        private String issuer;
        private @Nullable String onUnauthenticatedRequest;
        private @Nullable String scope;
        private @Nullable String sessionCookieName;
        private @Nullable Integer sessionTimeout;
        private String tokenEndpoint;
        private String userInfoEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionAuthenticateOidc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationRequestExtraParams = defaults.authenticationRequestExtraParams;
    	      this.authorizationEndpoint = defaults.authorizationEndpoint;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
    	      this.issuer = defaults.issuer;
    	      this.onUnauthenticatedRequest = defaults.onUnauthenticatedRequest;
    	      this.scope = defaults.scope;
    	      this.sessionCookieName = defaults.sessionCookieName;
    	      this.sessionTimeout = defaults.sessionTimeout;
    	      this.tokenEndpoint = defaults.tokenEndpoint;
    	      this.userInfoEndpoint = defaults.userInfoEndpoint;
        }

        public Builder authenticationRequestExtraParams(@Nullable Map<String,String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }

        public Builder authorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
            return this;
        }

        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            this.clientSecret = Objects.requireNonNull(clientSecret);
            return this;
        }

        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder onUnauthenticatedRequest(@Nullable String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }

        public Builder scope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }

        public Builder sessionCookieName(@Nullable String sessionCookieName) {
            this.sessionCookieName = sessionCookieName;
            return this;
        }

        public Builder sessionTimeout(@Nullable Integer sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        public Builder tokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint);
            return this;
        }

        public Builder userInfoEndpoint(String userInfoEndpoint) {
            this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint);
            return this;
        }
        public ListenerDefaultActionAuthenticateOidc build() {
            return new ListenerDefaultActionAuthenticateOidc(authenticationRequestExtraParams, authorizationEndpoint, clientId, clientSecret, issuer, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, tokenEndpoint, userInfoEndpoint);
        }
    }
}
