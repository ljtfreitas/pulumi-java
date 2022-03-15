// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerAuthenticateCognitoConfig {
    private final @Nullable Object authenticationRequestExtraParams;
    private final @Nullable String onUnauthenticatedRequest;
    private final @Nullable String scope;
    private final @Nullable String sessionCookieName;
    private final @Nullable String sessionTimeout;
    private final String userPoolArn;
    private final String userPoolClientId;
    private final String userPoolDomain;

    @CustomType.Constructor
    private ListenerAuthenticateCognitoConfig(
        @CustomType.Parameter("authenticationRequestExtraParams") @Nullable Object authenticationRequestExtraParams,
        @CustomType.Parameter("onUnauthenticatedRequest") @Nullable String onUnauthenticatedRequest,
        @CustomType.Parameter("scope") @Nullable String scope,
        @CustomType.Parameter("sessionCookieName") @Nullable String sessionCookieName,
        @CustomType.Parameter("sessionTimeout") @Nullable String sessionTimeout,
        @CustomType.Parameter("userPoolArn") String userPoolArn,
        @CustomType.Parameter("userPoolClientId") String userPoolClientId,
        @CustomType.Parameter("userPoolDomain") String userPoolDomain) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.userPoolArn = userPoolArn;
        this.userPoolClientId = userPoolClientId;
        this.userPoolDomain = userPoolDomain;
    }

    public Optional<Object> getAuthenticationRequestExtraParams() {
        return Optional.ofNullable(this.authenticationRequestExtraParams);
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
    public Optional<String> getSessionTimeout() {
        return Optional.ofNullable(this.sessionTimeout);
    }
    public String getUserPoolArn() {
        return this.userPoolArn;
    }
    public String getUserPoolClientId() {
        return this.userPoolClientId;
    }
    public String getUserPoolDomain() {
        return this.userPoolDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerAuthenticateCognitoConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object authenticationRequestExtraParams;
        private @Nullable String onUnauthenticatedRequest;
        private @Nullable String scope;
        private @Nullable String sessionCookieName;
        private @Nullable String sessionTimeout;
        private String userPoolArn;
        private String userPoolClientId;
        private String userPoolDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerAuthenticateCognitoConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationRequestExtraParams = defaults.authenticationRequestExtraParams;
    	      this.onUnauthenticatedRequest = defaults.onUnauthenticatedRequest;
    	      this.scope = defaults.scope;
    	      this.sessionCookieName = defaults.sessionCookieName;
    	      this.sessionTimeout = defaults.sessionTimeout;
    	      this.userPoolArn = defaults.userPoolArn;
    	      this.userPoolClientId = defaults.userPoolClientId;
    	      this.userPoolDomain = defaults.userPoolDomain;
        }

        public Builder authenticationRequestExtraParams(@Nullable Object authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
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

        public Builder sessionTimeout(@Nullable String sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        public Builder userPoolArn(String userPoolArn) {
            this.userPoolArn = Objects.requireNonNull(userPoolArn);
            return this;
        }

        public Builder userPoolClientId(String userPoolClientId) {
            this.userPoolClientId = Objects.requireNonNull(userPoolClientId);
            return this;
        }

        public Builder userPoolDomain(String userPoolDomain) {
            this.userPoolDomain = Objects.requireNonNull(userPoolDomain);
            return this;
        }
        public ListenerAuthenticateCognitoConfig build() {
            return new ListenerAuthenticateCognitoConfig(authenticationRequestExtraParams, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, userPoolArn, userPoolClientId, userPoolDomain);
        }
    }
}
