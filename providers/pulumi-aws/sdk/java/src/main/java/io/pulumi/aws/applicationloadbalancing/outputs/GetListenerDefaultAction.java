// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.outputs;

import io.pulumi.aws.applicationloadbalancing.outputs.GetListenerDefaultActionAuthenticateCognito;
import io.pulumi.aws.applicationloadbalancing.outputs.GetListenerDefaultActionAuthenticateOidc;
import io.pulumi.aws.applicationloadbalancing.outputs.GetListenerDefaultActionFixedResponse;
import io.pulumi.aws.applicationloadbalancing.outputs.GetListenerDefaultActionForward;
import io.pulumi.aws.applicationloadbalancing.outputs.GetListenerDefaultActionRedirect;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetListenerDefaultAction {
    private final List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos;
    private final List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs;
    private final List<GetListenerDefaultActionFixedResponse> fixedResponses;
    private final List<GetListenerDefaultActionForward> forwards;
    private final Integer order;
    private final List<GetListenerDefaultActionRedirect> redirects;
    private final String targetGroupArn;
    private final String type;

    @OutputCustomType.Constructor({"authenticateCognitos","authenticateOidcs","fixedResponses","forwards","order","redirects","targetGroupArn","type"})
    private GetListenerDefaultAction(
        List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos,
        List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs,
        List<GetListenerDefaultActionFixedResponse> fixedResponses,
        List<GetListenerDefaultActionForward> forwards,
        Integer order,
        List<GetListenerDefaultActionRedirect> redirects,
        String targetGroupArn,
        String type) {
        this.authenticateCognitos = Objects.requireNonNull(authenticateCognitos);
        this.authenticateOidcs = Objects.requireNonNull(authenticateOidcs);
        this.fixedResponses = Objects.requireNonNull(fixedResponses);
        this.forwards = Objects.requireNonNull(forwards);
        this.order = Objects.requireNonNull(order);
        this.redirects = Objects.requireNonNull(redirects);
        this.targetGroupArn = Objects.requireNonNull(targetGroupArn);
        this.type = Objects.requireNonNull(type);
    }

    public List<GetListenerDefaultActionAuthenticateCognito> getAuthenticateCognitos() {
        return this.authenticateCognitos;
    }
    public List<GetListenerDefaultActionAuthenticateOidc> getAuthenticateOidcs() {
        return this.authenticateOidcs;
    }
    public List<GetListenerDefaultActionFixedResponse> getFixedResponses() {
        return this.fixedResponses;
    }
    public List<GetListenerDefaultActionForward> getForwards() {
        return this.forwards;
    }
    public Integer getOrder() {
        return this.order;
    }
    public List<GetListenerDefaultActionRedirect> getRedirects() {
        return this.redirects;
    }
    public String getTargetGroupArn() {
        return this.targetGroupArn;
    }
    public String getType() {
        return this.type;
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
