// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


public final class GetListenerDefaultActionAuthenticateOidc extends io.pulumi.resources.InvokeArgs {

    public static final GetListenerDefaultActionAuthenticateOidc Empty = new GetListenerDefaultActionAuthenticateOidc();

    @InputImport(name="authenticationRequestExtraParams", required=true)
    private final Map<String,String> authenticationRequestExtraParams;

    public Map<String,String> getAuthenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams;
    }

    @InputImport(name="authorizationEndpoint", required=true)
    private final String authorizationEndpoint;

    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    @InputImport(name="clientId", required=true)
    private final String clientId;

    public String getClientId() {
        return this.clientId;
    }

    @InputImport(name="clientSecret", required=true)
    private final String clientSecret;

    public String getClientSecret() {
        return this.clientSecret;
    }

    @InputImport(name="issuer", required=true)
    private final String issuer;

    public String getIssuer() {
        return this.issuer;
    }

    @InputImport(name="onUnauthenticatedRequest", required=true)
    private final String onUnauthenticatedRequest;

    public String getOnUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest;
    }

    @InputImport(name="scope", required=true)
    private final String scope;

    public String getScope() {
        return this.scope;
    }

    @InputImport(name="sessionCookieName", required=true)
    private final String sessionCookieName;

    public String getSessionCookieName() {
        return this.sessionCookieName;
    }

    @InputImport(name="sessionTimeout", required=true)
    private final Integer sessionTimeout;

    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    @InputImport(name="tokenEndpoint", required=true)
    private final String tokenEndpoint;

    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    @InputImport(name="userInfoEndpoint", required=true)
    private final String userInfoEndpoint;

    public String getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public GetListenerDefaultActionAuthenticateOidc(
        Map<String,String> authenticationRequestExtraParams,
        String authorizationEndpoint,
        String clientId,
        String clientSecret,
        String issuer,
        String onUnauthenticatedRequest,
        String scope,
        String sessionCookieName,
        Integer sessionTimeout,
        String tokenEndpoint,
        String userInfoEndpoint) {
        this.authenticationRequestExtraParams = Objects.requireNonNull(authenticationRequestExtraParams, "expected parameter 'authenticationRequestExtraParams' to be non-null");
        this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint, "expected parameter 'authorizationEndpoint' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.clientSecret = Objects.requireNonNull(clientSecret, "expected parameter 'clientSecret' to be non-null");
        this.issuer = Objects.requireNonNull(issuer, "expected parameter 'issuer' to be non-null");
        this.onUnauthenticatedRequest = Objects.requireNonNull(onUnauthenticatedRequest, "expected parameter 'onUnauthenticatedRequest' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.sessionCookieName = Objects.requireNonNull(sessionCookieName, "expected parameter 'sessionCookieName' to be non-null");
        this.sessionTimeout = Objects.requireNonNull(sessionTimeout, "expected parameter 'sessionTimeout' to be non-null");
        this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint, "expected parameter 'tokenEndpoint' to be non-null");
        this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint, "expected parameter 'userInfoEndpoint' to be non-null");
    }

    private GetListenerDefaultActionAuthenticateOidc() {
        this.authenticationRequestExtraParams = Map.of();
        this.authorizationEndpoint = null;
        this.clientId = null;
        this.clientSecret = null;
        this.issuer = null;
        this.onUnauthenticatedRequest = null;
        this.scope = null;
        this.sessionCookieName = null;
        this.sessionTimeout = null;
        this.tokenEndpoint = null;
        this.userInfoEndpoint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionAuthenticateOidc defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> authenticationRequestExtraParams;
        private String authorizationEndpoint;
        private String clientId;
        private String clientSecret;
        private String issuer;
        private String onUnauthenticatedRequest;
        private String scope;
        private String sessionCookieName;
        private Integer sessionTimeout;
        private String tokenEndpoint;
        private String userInfoEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultActionAuthenticateOidc defaults) {
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

        public Builder setAuthenticationRequestExtraParams(Map<String,String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = Objects.requireNonNull(authenticationRequestExtraParams);
            return this;
        }

        public Builder setAuthorizationEndpoint(String authorizationEndpoint) {
            this.authorizationEndpoint = Objects.requireNonNull(authorizationEndpoint);
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

        public Builder setIssuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }

        public Builder setOnUnauthenticatedRequest(String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = Objects.requireNonNull(onUnauthenticatedRequest);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setSessionCookieName(String sessionCookieName) {
            this.sessionCookieName = Objects.requireNonNull(sessionCookieName);
            return this;
        }

        public Builder setSessionTimeout(Integer sessionTimeout) {
            this.sessionTimeout = Objects.requireNonNull(sessionTimeout);
            return this;
        }

        public Builder setTokenEndpoint(String tokenEndpoint) {
            this.tokenEndpoint = Objects.requireNonNull(tokenEndpoint);
            return this;
        }

        public Builder setUserInfoEndpoint(String userInfoEndpoint) {
            this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint);
            return this;
        }
        public GetListenerDefaultActionAuthenticateOidc build() {
            return new GetListenerDefaultActionAuthenticateOidc(authenticationRequestExtraParams, authorizationEndpoint, clientId, clientSecret, issuer, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, tokenEndpoint, userInfoEndpoint);
        }
    }
}
