// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionTimeoutArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs;
import io.pulumi.gcp.compute.inputs.URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapPathMatcherRouteRuleRouteActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapPathMatcherRouteRuleRouteActionArgs Empty = new URLMapPathMatcherRouteRuleRouteActionArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy;

    public Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> getCorsPolicy() {
        return this.corsPolicy == null ? Output.empty() : this.corsPolicy;
    }

    /**
     * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure.
     * As part of fault injection, when clients send requests to a backend service, delays can be introduced by Loadbalancer on a
     * percentage of requests before sending those request to the backend service. Similarly requests from clients can be aborted
     * by the Loadbalancer for a percentage of requests.
     * timeout and retryPolicy will be ignored by clients that are configured with a faultInjectionPolicy.
     * Structure is documented below.
     * 
     */
    @Import(name="faultInjectionPolicy")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;

    public Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> getFaultInjectionPolicy() {
        return this.faultInjectionPolicy == null ? Output.empty() : this.faultInjectionPolicy;
    }

    /**
     * Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service.
     * Loadbalancer does not wait for responses from the shadow service. Prior to sending traffic to the shadow service,
     * the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    @Import(name="requestMirrorPolicy")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;

    public Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> getRequestMirrorPolicy() {
        return this.requestMirrorPolicy == null ? Output.empty() : this.requestMirrorPolicy;
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy;

    public Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Output.empty() : this.retryPolicy;
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been
     * fully processed (i.e. end-of-stream) up until the response has been completely processed. Timeout includes all retries.
     * If not specified, will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout;

    public Output<URLMapPathMatcherRouteRuleRouteActionTimeoutArgs> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
      private final @Nullable Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite;

    public Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> getUrlRewrite() {
        return this.urlRewrite == null ? Output.empty() : this.urlRewrite;
    }

    /**
     * A list of weighted backend services to send traffic to when a route match occurs.
     * The weights determine the fraction of traffic that flows to their corresponding backend service.
     * If all traffic needs to go to a single backend service, there must be one weightedBackendService
     * with weight set to a non 0 number.
     * Once a backendService is identified and before forwarding the request to the backend service,
     * advanced routing actions like Url rewrites and header transformations are applied depending on
     * additional settings specified in this HttpRouteAction.
     * Structure is documented below.
     * 
     */
    @Import(name="weightedBackendServices")
      private final @Nullable Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

    public Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? Output.empty() : this.weightedBackendServices;
    }

    public URLMapPathMatcherRouteRuleRouteActionArgs(
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy,
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy,
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy,
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy,
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout,
        @Nullable Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite,
        @Nullable Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    private URLMapPathMatcherRouteRuleRouteActionArgs() {
        this.corsPolicy = Output.empty();
        this.faultInjectionPolicy = Output.empty();
        this.requestMirrorPolicy = Output.empty();
        this.retryPolicy = Output.empty();
        this.timeout = Output.empty();
        this.urlRewrite = Output.empty();
        this.weightedBackendServices = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherRouteRuleRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy;
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy;
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout;
        private @Nullable Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite;
        private @Nullable Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherRouteRuleRouteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder corsPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder corsPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionCorsPolicyArgs corsPolicy) {
            this.corsPolicy = Output.ofNullable(corsPolicy);
            return this;
        }

        public Builder faultInjectionPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        public Builder faultInjectionPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionFaultInjectionPolicyArgs faultInjectionPolicy) {
            this.faultInjectionPolicy = Output.ofNullable(faultInjectionPolicy);
            return this;
        }

        public Builder requestMirrorPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        public Builder requestMirrorPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionRequestMirrorPolicyArgs requestMirrorPolicy) {
            this.requestMirrorPolicy = Output.ofNullable(requestMirrorPolicy);
            return this;
        }

        public Builder retryPolicy(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder retryPolicy(@Nullable URLMapPathMatcherRouteRuleRouteActionRetryPolicyArgs retryPolicy) {
            this.retryPolicy = Output.ofNullable(retryPolicy);
            return this;
        }

        public Builder timeout(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionTimeoutArgs> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable URLMapPathMatcherRouteRuleRouteActionTimeoutArgs timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }

        public Builder urlRewrite(@Nullable Output<URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder urlRewrite(@Nullable URLMapPathMatcherRouteRuleRouteActionUrlRewriteArgs urlRewrite) {
            this.urlRewrite = Output.ofNullable(urlRewrite);
            return this;
        }

        public Builder weightedBackendServices(@Nullable Output<List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }

        public Builder weightedBackendServices(@Nullable List<URLMapPathMatcherRouteRuleRouteActionWeightedBackendServiceArgs> weightedBackendServices) {
            this.weightedBackendServices = Output.ofNullable(weightedBackendServices);
            return this;
        }
        public URLMapPathMatcherRouteRuleRouteActionArgs build() {
            return new URLMapPathMatcherRouteRuleRouteActionArgs(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}
