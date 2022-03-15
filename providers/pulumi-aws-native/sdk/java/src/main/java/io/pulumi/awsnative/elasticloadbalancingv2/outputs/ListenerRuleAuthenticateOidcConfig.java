// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleAuthenticateOidcConfig {
    private final @Nullable Object authenticationRequestExtraParams;
    private final String authorizationEndpoint;
    private final String clientId;
    private final String clientSecret;
    private final String issuer;
    private final @Nullable String onUnauthenticatedRequest;
    private final @Nullable String scope;
    private final @Nullable String sessionCookieName;
    private final @Nullable Integer sessionTimeout;
    private final String tokenEndpoint;
    private final @Nullable Boolean useExistingClientSecret;
    private final String userInfoEndpoint;

    @CustomType.Constructor
    private ListenerRuleAuthenticateOidcConfig(
        @CustomType.Parameter("authenticationRequestExtraParams") @Nullable Object authenticationRequestExtraParams,
        @CustomType.Parameter("authorizationEndpoint") String authorizationEndpoint,
        @CustomType.Parameter("clientId") String clientId,
        @CustomType.Parameter("clientSecret") String clientSecret,
        @CustomType.Parameter("issuer") String issuer,
        @CustomType.Parameter("onUnauthenticatedRequest") @Nullable String onUnauthenticatedRequest,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("sessionCookieName") @Nullable String sessionCookieName,
        @CustomType.Parameter("sessionTimeout") @Nullable Integer sessionTimeout,
        @CustomType.Parameter("tokenEndpoint") String tokenEndpoint,
        @CustomType.Parameter("useExistingClientSecret") @Nullable Boolean useExistingClientSecret,
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
        this.useExistingClientSecret = useExistingClientSecret;
        this.userInfoEndpoint = userInfoEndpoint;
    }

    public Optional<Object> getAuthenticationRequestExtraParams() {
        return Optional.ofNullable(this.authenticationRequestExtraParams);
    }
    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }
    public String getClientId() {
        return this.clientId;
    }
    public String getClientSecret() {
        return this.clientSecret;
    }
    public String getIssuer() {
        return this.issuer;
    }
    public Optional<String> getOnUnauthenticatedRequest() {
        return Optional.ofNullable(this.onUnauthenticatedRequest);
    }
    public Optional<String> getScope() {
        return Optional.ofNullable(this.scope);
    }
    public Optional<String> getSessionCookieName() {
        return Optional.ofNullable(this.sessionCookieName);
    }
    public Optional<Integer> getSessionTimeout() {
        return Optional.ofNullable(this.sessionTimeout);
    }
    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }
    public Optional<Boolean> getUseExistingClientSecret() {
        return Optional.ofNullable(this.useExistingClientSecret);
    }
    public String getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleAuthenticateOidcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object authenticationRequestExtraParams;
        private String authorizationEndpoint;
        private String clientId;
        private String clientSecret;
        private String issuer;
        private @Nullable String onUnauthenticatedRequest;
        private @Nullable String scope;
        private @Nullable String sessionCookieName;
        private @Nullable Integer sessionTimeout;
        private String tokenEndpoint;
        private @Nullable Boolean useExistingClientSecret;
        private String userInfoEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleAuthenticateOidcConfig defaults) {
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
    	      this.useExistingClientSecret = defaults.useExistingClientSecret;
    	      this.userInfoEndpoint = defaults.userInfoEndpoint;
        }

        public Builder authenticationRequestExtraParams(@Nullable Object authenticationRequestExtraParams) {
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

        public Builder useExistingClientSecret(@Nullable Boolean useExistingClientSecret) {
            this.useExistingClientSecret = useExistingClientSecret;
            return this;
        }

        public Builder userInfoEndpoint(String userInfoEndpoint) {
            this.userInfoEndpoint = Objects.requireNonNull(userInfoEndpoint);
            return this;
        }
        public ListenerRuleAuthenticateOidcConfig build() {
            return new ListenerRuleAuthenticateOidcConfig(authenticationRequestExtraParams, authorizationEndpoint, clientId, clientSecret, issuer, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, tokenEndpoint, useExistingClientSecret, userInfoEndpoint);
        }
    }
}
