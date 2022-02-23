// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.aws.elasticloadbalancingv2.inputs.GetListenerDefaultActionAuthenticateCognito;
import io.pulumi.aws.elasticloadbalancingv2.inputs.GetListenerDefaultActionAuthenticateOidc;
import io.pulumi.aws.elasticloadbalancingv2.inputs.GetListenerDefaultActionFixedResponse;
import io.pulumi.aws.elasticloadbalancingv2.inputs.GetListenerDefaultActionForward;
import io.pulumi.aws.elasticloadbalancingv2.inputs.GetListenerDefaultActionRedirect;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetListenerDefaultAction extends io.pulumi.resources.InvokeArgs {

    public static final GetListenerDefaultAction Empty = new GetListenerDefaultAction();

    @InputImport(name="authenticateCognitos", required=true)
    private final List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos;

    public List<GetListenerDefaultActionAuthenticateCognito> getAuthenticateCognitos() {
        return this.authenticateCognitos;
    }

    @InputImport(name="authenticateOidcs", required=true)
    private final List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs;

    public List<GetListenerDefaultActionAuthenticateOidc> getAuthenticateOidcs() {
        return this.authenticateOidcs;
    }

    @InputImport(name="fixedResponses", required=true)
    private final List<GetListenerDefaultActionFixedResponse> fixedResponses;

    public List<GetListenerDefaultActionFixedResponse> getFixedResponses() {
        return this.fixedResponses;
    }

    @InputImport(name="forwards", required=true)
    private final List<GetListenerDefaultActionForward> forwards;

    public List<GetListenerDefaultActionForward> getForwards() {
        return this.forwards;
    }

    @InputImport(name="order", required=true)
    private final Integer order;

    public Integer getOrder() {
        return this.order;
    }

    @InputImport(name="redirects", required=true)
    private final List<GetListenerDefaultActionRedirect> redirects;

    public List<GetListenerDefaultActionRedirect> getRedirects() {
        return this.redirects;
    }

    @InputImport(name="targetGroupArn", required=true)
    private final String targetGroupArn;

    public String getTargetGroupArn() {
        return this.targetGroupArn;
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public GetListenerDefaultAction(
        List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos,
        List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs,
        List<GetListenerDefaultActionFixedResponse> fixedResponses,
        List<GetListenerDefaultActionForward> forwards,
        Integer order,
        List<GetListenerDefaultActionRedirect> redirects,
        String targetGroupArn,
        String type) {
        this.authenticateCognitos = Objects.requireNonNull(authenticateCognitos, "expected parameter 'authenticateCognitos' to be non-null");
        this.authenticateOidcs = Objects.requireNonNull(authenticateOidcs, "expected parameter 'authenticateOidcs' to be non-null");
        this.fixedResponses = Objects.requireNonNull(fixedResponses, "expected parameter 'fixedResponses' to be non-null");
        this.forwards = Objects.requireNonNull(forwards, "expected parameter 'forwards' to be non-null");
        this.order = Objects.requireNonNull(order, "expected parameter 'order' to be non-null");
        this.redirects = Objects.requireNonNull(redirects, "expected parameter 'redirects' to be non-null");
        this.targetGroupArn = Objects.requireNonNull(targetGroupArn, "expected parameter 'targetGroupArn' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetListenerDefaultAction() {
        this.authenticateCognitos = List.of();
        this.authenticateOidcs = List.of();
        this.fixedResponses = List.of();
        this.forwards = List.of();
        this.order = null;
        this.redirects = List.of();
        this.targetGroupArn = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos;
        private List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs;
        private List<GetListenerDefaultActionFixedResponse> fixedResponses;
        private List<GetListenerDefaultActionForward> forwards;
        private Integer order;
        private List<GetListenerDefaultActionRedirect> redirects;
        private String targetGroupArn;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticateCognitos = defaults.authenticateCognitos;
    	      this.authenticateOidcs = defaults.authenticateOidcs;
    	      this.fixedResponses = defaults.fixedResponses;
    	      this.forwards = defaults.forwards;
    	      this.order = defaults.order;
    	      this.redirects = defaults.redirects;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.type = defaults.type;
        }

        public Builder setAuthenticateCognitos(List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos) {
            this.authenticateCognitos = Objects.requireNonNull(authenticateCognitos);
            return this;
        }

        public Builder setAuthenticateOidcs(List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs) {
            this.authenticateOidcs = Objects.requireNonNull(authenticateOidcs);
            return this;
        }

        public Builder setFixedResponses(List<GetListenerDefaultActionFixedResponse> fixedResponses) {
            this.fixedResponses = Objects.requireNonNull(fixedResponses);
            return this;
        }

        public Builder setForwards(List<GetListenerDefaultActionForward> forwards) {
            this.forwards = Objects.requireNonNull(forwards);
            return this;
        }

        public Builder setOrder(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }

        public Builder setRedirects(List<GetListenerDefaultActionRedirect> redirects) {
            this.redirects = Objects.requireNonNull(redirects);
            return this;
        }

        public Builder setTargetGroupArn(String targetGroupArn) {
            this.targetGroupArn = Objects.requireNonNull(targetGroupArn);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetListenerDefaultAction build() {
            return new GetListenerDefaultAction(authenticateCognitos, authenticateOidcs, fixedResponses, forwards, order, redirects, targetGroupArn, type);
        }
    }
}
