// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionAuthenticateCognitoGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionAuthenticateCognitoGetArgs Empty = new ListenerRuleActionAuthenticateCognitoGetArgs();

    /**
     * The query parameters to include in the redirect request to the authorization endpoint. Max: 10.
     * 
     */
    @Import(name="authenticationRequestExtraParams")
      private final @Nullable Output<Map<String,String>> authenticationRequestExtraParams;

    public Output<Map<String,String>> getAuthenticationRequestExtraParams() {
        return this.authenticationRequestExtraParams == null ? Output.empty() : this.authenticationRequestExtraParams;
    }

    /**
     * The behavior if the user is not authenticated. Valid values: `deny`, `allow` and `authenticate`
     * 
     */
    @Import(name="onUnauthenticatedRequest")
      private final @Nullable Output<String> onUnauthenticatedRequest;

    public Output<String> getOnUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest == null ? Output.empty() : this.onUnauthenticatedRequest;
    }

    /**
     * The set of user claims to be requested from the IdP.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<String> scope;

    public Output<String> getScope() {
        return this.scope == null ? Output.empty() : this.scope;
    }

    /**
     * The name of the cookie used to maintain session information.
     * 
     */
    @Import(name="sessionCookieName")
      private final @Nullable Output<String> sessionCookieName;

    public Output<String> getSessionCookieName() {
        return this.sessionCookieName == null ? Output.empty() : this.sessionCookieName;
    }

    /**
     * The maximum duration of the authentication session, in seconds.
     * 
     */
    @Import(name="sessionTimeout")
      private final @Nullable Output<Integer> sessionTimeout;

    public Output<Integer> getSessionTimeout() {
        return this.sessionTimeout == null ? Output.empty() : this.sessionTimeout;
    }

    /**
     * The ARN of the Cognito user pool.
     * 
     */
    @Import(name="userPoolArn", required=true)
      private final Output<String> userPoolArn;

    public Output<String> getUserPoolArn() {
        return this.userPoolArn;
    }

    /**
     * The ID of the Cognito user pool client.
     * 
     */
    @Import(name="userPoolClientId", required=true)
      private final Output<String> userPoolClientId;

    public Output<String> getUserPoolClientId() {
        return this.userPoolClientId;
    }

    /**
     * The domain prefix or fully-qualified domain name of the Cognito user pool.
     * 
     */
    @Import(name="userPoolDomain", required=true)
      private final Output<String> userPoolDomain;

    public Output<String> getUserPoolDomain() {
        return this.userPoolDomain;
    }

    public ListenerRuleActionAuthenticateCognitoGetArgs(
        @Nullable Output<Map<String,String>> authenticationRequestExtraParams,
        @Nullable Output<String> onUnauthenticatedRequest,
        @Nullable Output<String> scope,
        @Nullable Output<String> sessionCookieName,
        @Nullable Output<Integer> sessionTimeout,
        Output<String> userPoolArn,
        Output<String> userPoolClientId,
        Output<String> userPoolDomain) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
        this.scope = scope;
        this.sessionCookieName = sessionCookieName;
        this.sessionTimeout = sessionTimeout;
        this.userPoolArn = Objects.requireNonNull(userPoolArn, "expected parameter 'userPoolArn' to be non-null");
        this.userPoolClientId = Objects.requireNonNull(userPoolClientId, "expected parameter 'userPoolClientId' to be non-null");
        this.userPoolDomain = Objects.requireNonNull(userPoolDomain, "expected parameter 'userPoolDomain' to be non-null");
    }

    private ListenerRuleActionAuthenticateCognitoGetArgs() {
        this.authenticationRequestExtraParams = Output.empty();
        this.onUnauthenticatedRequest = Output.empty();
        this.scope = Output.empty();
        this.sessionCookieName = Output.empty();
        this.sessionTimeout = Output.empty();
        this.userPoolArn = Output.empty();
        this.userPoolClientId = Output.empty();
        this.userPoolDomain = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionAuthenticateCognitoGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> authenticationRequestExtraParams;
        private @Nullable Output<String> onUnauthenticatedRequest;
        private @Nullable Output<String> scope;
        private @Nullable Output<String> sessionCookieName;
        private @Nullable Output<Integer> sessionTimeout;
        private Output<String> userPoolArn;
        private Output<String> userPoolClientId;
        private Output<String> userPoolDomain;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionAuthenticateCognitoGetArgs defaults) {
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

        public Builder authenticationRequestExtraParams(@Nullable Output<Map<String,String>> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = authenticationRequestExtraParams;
            return this;
        }

        public Builder authenticationRequestExtraParams(@Nullable Map<String,String> authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = Output.ofNullable(authenticationRequestExtraParams);
            return this;
        }

        public Builder onUnauthenticatedRequest(@Nullable Output<String> onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = onUnauthenticatedRequest;
            return this;
        }

        public Builder onUnauthenticatedRequest(@Nullable String onUnauthenticatedRequest) {
            this.onUnauthenticatedRequest = Output.ofNullable(onUnauthenticatedRequest);
            return this;
        }

        public Builder scope(@Nullable Output<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder scope(@Nullable String scope) {
            this.scope = Output.ofNullable(scope);
            return this;
        }

        public Builder sessionCookieName(@Nullable Output<String> sessionCookieName) {
            this.sessionCookieName = sessionCookieName;
            return this;
        }

        public Builder sessionCookieName(@Nullable String sessionCookieName) {
            this.sessionCookieName = Output.ofNullable(sessionCookieName);
            return this;
        }

        public Builder sessionTimeout(@Nullable Output<Integer> sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        public Builder sessionTimeout(@Nullable Integer sessionTimeout) {
            this.sessionTimeout = Output.ofNullable(sessionTimeout);
            return this;
        }

        public Builder userPoolArn(Output<String> userPoolArn) {
            this.userPoolArn = Objects.requireNonNull(userPoolArn);
            return this;
        }

        public Builder userPoolArn(String userPoolArn) {
            this.userPoolArn = Output.of(Objects.requireNonNull(userPoolArn));
            return this;
        }

        public Builder userPoolClientId(Output<String> userPoolClientId) {
            this.userPoolClientId = Objects.requireNonNull(userPoolClientId);
            return this;
        }

        public Builder userPoolClientId(String userPoolClientId) {
            this.userPoolClientId = Output.of(Objects.requireNonNull(userPoolClientId));
            return this;
        }

        public Builder userPoolDomain(Output<String> userPoolDomain) {
            this.userPoolDomain = Objects.requireNonNull(userPoolDomain);
            return this;
        }

        public Builder userPoolDomain(String userPoolDomain) {
            this.userPoolDomain = Output.of(Objects.requireNonNull(userPoolDomain));
            return this;
        }
        public ListenerRuleActionAuthenticateCognitoGetArgs build() {
            return new ListenerRuleActionAuthenticateCognitoGetArgs(authenticationRequestExtraParams, onUnauthenticatedRequest, scope, sessionCookieName, sessionTimeout, userPoolArn, userPoolClientId, userPoolDomain);
        }
    }
}
