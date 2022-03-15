// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.aws.alb.inputs.ListenerDefaultActionAuthenticateCognitoGetArgs;
import io.pulumi.aws.alb.inputs.ListenerDefaultActionAuthenticateOidcGetArgs;
import io.pulumi.aws.alb.inputs.ListenerDefaultActionFixedResponseGetArgs;
import io.pulumi.aws.alb.inputs.ListenerDefaultActionForwardGetArgs;
import io.pulumi.aws.alb.inputs.ListenerDefaultActionRedirectGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerDefaultActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerDefaultActionGetArgs Empty = new ListenerDefaultActionGetArgs();

    /**
     * Configuration block for using Amazon Cognito to authenticate users. Specify only when `type` is `authenticate-cognito`. Detailed below.
     * 
     */
    @Import(name="authenticateCognito")
      private final @Nullable Output<ListenerDefaultActionAuthenticateCognitoGetArgs> authenticateCognito;

    public Output<ListenerDefaultActionAuthenticateCognitoGetArgs> getAuthenticateCognito() {
        return this.authenticateCognito == null ? Output.empty() : this.authenticateCognito;
    }

    /**
     * Configuration block for an identity provider that is compliant with OpenID Connect (OIDC). Specify only when `type` is `authenticate-oidc`. Detailed below.
     * 
     */
    @Import(name="authenticateOidc")
      private final @Nullable Output<ListenerDefaultActionAuthenticateOidcGetArgs> authenticateOidc;

    public Output<ListenerDefaultActionAuthenticateOidcGetArgs> getAuthenticateOidc() {
        return this.authenticateOidc == null ? Output.empty() : this.authenticateOidc;
    }

    /**
     * Information for creating an action that returns a custom HTTP response. Required if `type` is `fixed-response`.
     * 
     */
    @Import(name="fixedResponse")
      private final @Nullable Output<ListenerDefaultActionFixedResponseGetArgs> fixedResponse;

    public Output<ListenerDefaultActionFixedResponseGetArgs> getFixedResponse() {
        return this.fixedResponse == null ? Output.empty() : this.fixedResponse;
    }

    /**
     * Configuration block for creating an action that distributes requests among one or more target groups. Specify only if `type` is `forward`. If you specify both `forward` block and `target_group_arn` attribute, you can specify only one target group using `forward` and it must be the same target group specified in `target_group_arn`. Detailed below.
     * 
     */
    @Import(name="forward")
      private final @Nullable Output<ListenerDefaultActionForwardGetArgs> forward;

    public Output<ListenerDefaultActionForwardGetArgs> getForward() {
        return this.forward == null ? Output.empty() : this.forward;
    }

    /**
     * Order for the action. This value is required for rules with multiple actions. The action with the lowest value for order is performed first. Valid values are between `1` and `50000`.
     * 
     */
    @Import(name="order")
      private final @Nullable Output<Integer> order;

    public Output<Integer> getOrder() {
        return this.order == null ? Output.empty() : this.order;
    }

    /**
     * Configuration block for creating a redirect action. Required if `type` is `redirect`. Detailed below.
     * 
     */
    @Import(name="redirect")
      private final @Nullable Output<ListenerDefaultActionRedirectGetArgs> redirect;

    public Output<ListenerDefaultActionRedirectGetArgs> getRedirect() {
        return this.redirect == null ? Output.empty() : this.redirect;
    }

    /**
     * ARN of the Target Group to which to route traffic. Specify only if `type` is `forward` and you want to route to a single target group. To route to one or more target groups, use a `forward` block instead.
     * 
     */
    @Import(name="targetGroupArn")
      private final @Nullable Output<String> targetGroupArn;

    public Output<String> getTargetGroupArn() {
        return this.targetGroupArn == null ? Output.empty() : this.targetGroupArn;
    }

    /**
     * Type of routing action. Valid values are `forward`, `redirect`, `fixed-response`, `authenticate-cognito` and `authenticate-oidc`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ListenerDefaultActionGetArgs(
        @Nullable Output<ListenerDefaultActionAuthenticateCognitoGetArgs> authenticateCognito,
        @Nullable Output<ListenerDefaultActionAuthenticateOidcGetArgs> authenticateOidc,
        @Nullable Output<ListenerDefaultActionFixedResponseGetArgs> fixedResponse,
        @Nullable Output<ListenerDefaultActionForwardGetArgs> forward,
        @Nullable Output<Integer> order,
        @Nullable Output<ListenerDefaultActionRedirectGetArgs> redirect,
        @Nullable Output<String> targetGroupArn,
        Output<String> type) {
        this.authenticateCognito = authenticateCognito;
        this.authenticateOidc = authenticateOidc;
        this.fixedResponse = fixedResponse;
        this.forward = forward;
        this.order = order;
        this.redirect = redirect;
        this.targetGroupArn = targetGroupArn;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ListenerDefaultActionGetArgs() {
        this.authenticateCognito = Output.empty();
        this.authenticateOidc = Output.empty();
        this.fixedResponse = Output.empty();
        this.forward = Output.empty();
        this.order = Output.empty();
        this.redirect = Output.empty();
        this.targetGroupArn = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerDefaultActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ListenerDefaultActionAuthenticateCognitoGetArgs> authenticateCognito;
        private @Nullable Output<ListenerDefaultActionAuthenticateOidcGetArgs> authenticateOidc;
        private @Nullable Output<ListenerDefaultActionFixedResponseGetArgs> fixedResponse;
        private @Nullable Output<ListenerDefaultActionForwardGetArgs> forward;
        private @Nullable Output<Integer> order;
        private @Nullable Output<ListenerDefaultActionRedirectGetArgs> redirect;
        private @Nullable Output<String> targetGroupArn;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerDefaultActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticateCognito = defaults.authenticateCognito;
    	      this.authenticateOidc = defaults.authenticateOidc;
    	      this.fixedResponse = defaults.fixedResponse;
    	      this.forward = defaults.forward;
    	      this.order = defaults.order;
    	      this.redirect = defaults.redirect;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.type = defaults.type;
        }

        public Builder authenticateCognito(@Nullable Output<ListenerDefaultActionAuthenticateCognitoGetArgs> authenticateCognito) {
            this.authenticateCognito = authenticateCognito;
            return this;
        }

        public Builder authenticateCognito(@Nullable ListenerDefaultActionAuthenticateCognitoGetArgs authenticateCognito) {
            this.authenticateCognito = Output.ofNullable(authenticateCognito);
            return this;
        }

        public Builder authenticateOidc(@Nullable Output<ListenerDefaultActionAuthenticateOidcGetArgs> authenticateOidc) {
            this.authenticateOidc = authenticateOidc;
            return this;
        }

        public Builder authenticateOidc(@Nullable ListenerDefaultActionAuthenticateOidcGetArgs authenticateOidc) {
            this.authenticateOidc = Output.ofNullable(authenticateOidc);
            return this;
        }

        public Builder fixedResponse(@Nullable Output<ListenerDefaultActionFixedResponseGetArgs> fixedResponse) {
            this.fixedResponse = fixedResponse;
            return this;
        }

        public Builder fixedResponse(@Nullable ListenerDefaultActionFixedResponseGetArgs fixedResponse) {
            this.fixedResponse = Output.ofNullable(fixedResponse);
            return this;
        }

        public Builder forward(@Nullable Output<ListenerDefaultActionForwardGetArgs> forward) {
            this.forward = forward;
            return this;
        }

        public Builder forward(@Nullable ListenerDefaultActionForwardGetArgs forward) {
            this.forward = Output.ofNullable(forward);
            return this;
        }

        public Builder order(@Nullable Output<Integer> order) {
            this.order = order;
            return this;
        }

        public Builder order(@Nullable Integer order) {
            this.order = Output.ofNullable(order);
            return this;
        }

        public Builder redirect(@Nullable Output<ListenerDefaultActionRedirectGetArgs> redirect) {
            this.redirect = redirect;
            return this;
        }

        public Builder redirect(@Nullable ListenerDefaultActionRedirectGetArgs redirect) {
            this.redirect = Output.ofNullable(redirect);
            return this;
        }

        public Builder targetGroupArn(@Nullable Output<String> targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }

        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = Output.ofNullable(targetGroupArn);
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public ListenerDefaultActionGetArgs build() {
            return new ListenerDefaultActionGetArgs(authenticateCognito, authenticateOidc, fixedResponse, forward, order, redirect, targetGroupArn, type);
        }
    }
}
