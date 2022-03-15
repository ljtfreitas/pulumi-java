// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionCorsPolicyArgs;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionFaultInjectionPolicyArgs;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionRequestMirrorPolicyArgs;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionRetryPolicyArgs;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionTimeoutArgs;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionUrlRewriteArgs;
import io.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionArgs Empty = new URLMapDefaultRouteActionArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see
     * [W3C Recommendation for Cross Origin Resource Sharing](https://www.w3.org/TR/cors/)
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
      private final @Nullable Output<URLMapDefaultRouteActionCorsPolicyArgs> corsPolicy;

    public Output<URLMapDefaultRouteActionCorsPolicyArgs> getCorsPolicy() {
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
      private final @Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;

    public Output<URLMapDefaultRouteActionFaultInjectionPolicyArgs> getFaultInjectionPolicy() {
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
      private final @Nullable Output<URLMapDefaultRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;

    public Output<URLMapDefaultRouteActionRequestMirrorPolicyArgs> getRequestMirrorPolicy() {
        return this.requestMirrorPolicy == null ? Output.empty() : this.requestMirrorPolicy;
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<URLMapDefaultRouteActionRetryPolicyArgs> retryPolicy;

    public Output<URLMapDefaultRouteActionRetryPolicyArgs> getRetryPolicy() {
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
      private final @Nullable Output<URLMapDefaultRouteActionTimeoutArgs> timeout;

    public Output<URLMapDefaultRouteActionTimeoutArgs> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
      private final @Nullable Output<URLMapDefaultRouteActionUrlRewriteArgs> urlRewrite;

    public Output<URLMapDefaultRouteActionUrlRewriteArgs> getUrlRewrite() {
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
      private final @Nullable Output<List<URLMapDefaultRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

    public Output<List<URLMapDefaultRouteActionWeightedBackendServiceArgs>> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? Output.empty() : this.weightedBackendServices;
    }

    public URLMapDefaultRouteActionArgs(
        @Nullable Output<URLMapDefaultRouteActionCorsPolicyArgs> corsPolicy,
        @Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy,
        @Nullable Output<URLMapDefaultRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy,
        @Nullable Output<URLMapDefaultRouteActionRetryPolicyArgs> retryPolicy,
        @Nullable Output<URLMapDefaultRouteActionTimeoutArgs> timeout,
        @Nullable Output<URLMapDefaultRouteActionUrlRewriteArgs> urlRewrite,
        @Nullable Output<List<URLMapDefaultRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    private URLMapDefaultRouteActionArgs() {
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

    public static Builder builder(URLMapDefaultRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<URLMapDefaultRouteActionCorsPolicyArgs> corsPolicy;
        private @Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;
        private @Nullable Output<URLMapDefaultRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;
        private @Nullable Output<URLMapDefaultRouteActionRetryPolicyArgs> retryPolicy;
        private @Nullable Output<URLMapDefaultRouteActionTimeoutArgs> timeout;
        private @Nullable Output<URLMapDefaultRouteActionUrlRewriteArgs> urlRewrite;
        private @Nullable Output<List<URLMapDefaultRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder corsPolicy(@Nullable Output<URLMapDefaultRouteActionCorsPolicyArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder corsPolicy(@Nullable URLMapDefaultRouteActionCorsPolicyArgs corsPolicy) {
            this.corsPolicy = Output.ofNullable(corsPolicy);
            return this;
        }

        public Builder faultInjectionPolicy(@Nullable Output<URLMapDefaultRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        public Builder faultInjectionPolicy(@Nullable URLMapDefaultRouteActionFaultInjectionPolicyArgs faultInjectionPolicy) {
            this.faultInjectionPolicy = Output.ofNullable(faultInjectionPolicy);
            return this;
        }

        public Builder requestMirrorPolicy(@Nullable Output<URLMapDefaultRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        public Builder requestMirrorPolicy(@Nullable URLMapDefaultRouteActionRequestMirrorPolicyArgs requestMirrorPolicy) {
            this.requestMirrorPolicy = Output.ofNullable(requestMirrorPolicy);
            return this;
        }

        public Builder retryPolicy(@Nullable Output<URLMapDefaultRouteActionRetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder retryPolicy(@Nullable URLMapDefaultRouteActionRetryPolicyArgs retryPolicy) {
            this.retryPolicy = Output.ofNullable(retryPolicy);
            return this;
        }

        public Builder timeout(@Nullable Output<URLMapDefaultRouteActionTimeoutArgs> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable URLMapDefaultRouteActionTimeoutArgs timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }

        public Builder urlRewrite(@Nullable Output<URLMapDefaultRouteActionUrlRewriteArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder urlRewrite(@Nullable URLMapDefaultRouteActionUrlRewriteArgs urlRewrite) {
            this.urlRewrite = Output.ofNullable(urlRewrite);
            return this;
        }

        public Builder weightedBackendServices(@Nullable Output<List<URLMapDefaultRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }

        public Builder weightedBackendServices(@Nullable List<URLMapDefaultRouteActionWeightedBackendServiceArgs> weightedBackendServices) {
            this.weightedBackendServices = Output.ofNullable(weightedBackendServices);
            return this;
        }
        public URLMapDefaultRouteActionArgs build() {
            return new URLMapDefaultRouteActionArgs(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}
