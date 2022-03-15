// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherPathRuleRouteActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherPathRuleRouteActionArgs Empty = new RegionUrlMapPathMatcherPathRuleRouteActionArgs();

    /**
     * The specification for allowing client side cross-origin requests. Please see W3C
     * Recommendation for Cross Origin Resource Sharing
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
      private final @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy;

    public Output<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs> getCorsPolicy() {
        return this.corsPolicy == null ? Output.empty() : this.corsPolicy;
    }

    /**
     * The specification for fault injection introduced into traffic to test the
     * resiliency of clients to backend service failure. As part of fault injection,
     * when clients send requests to a backend service, delays can be introduced by
     * Loadbalancer on a percentage of requests before sending those request to the
     * backend service. Similarly requests from clients can be aborted by the
     * Loadbalancer for a percentage of requests. timeout and retry_policy will be
     * ignored by clients that are configured with a fault_injection_policy.
     * Structure is documented below.
     * 
     */
    @Import(name="faultInjectionPolicy")
      private final @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;

    public Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> getFaultInjectionPolicy() {
        return this.faultInjectionPolicy == null ? Output.empty() : this.faultInjectionPolicy;
    }

    /**
     * Specifies the policy on how requests intended for the route's backends are
     * shadowed to a separate mirrored backend service. Loadbalancer does not wait for
     * responses from the shadow service. Prior to sending traffic to the shadow
     * service, the host / authority header is suffixed with -shadow.
     * Structure is documented below.
     * 
     */
    @Import(name="requestMirrorPolicy")
      private final @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;

    public Output<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> getRequestMirrorPolicy() {
        return this.requestMirrorPolicy == null ? Output.empty() : this.requestMirrorPolicy;
    }

    /**
     * Specifies the retry policy associated with this route.
     * Structure is documented below.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy;

    public Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Output.empty() : this.retryPolicy;
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time
     * the request is has been fully processed (i.e. end-of-stream) up until the
     * response has been completely processed. Timeout includes all retries. If not
     * specified, the default value is 15 seconds.
     * Structure is documented below.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout;

    public Output<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * The spec to modify the URL of the request, prior to forwarding the request to
     * the matched service
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
      private final @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite;

    public Output<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs> getUrlRewrite() {
        return this.urlRewrite == null ? Output.empty() : this.urlRewrite;
    }

    /**
     * A list of weighted backend services to send traffic to when a route match
     * occurs. The weights determine the fraction of traffic that flows to their
     * corresponding backend service. If all traffic needs to go to a single backend
     * service, there must be one  weightedBackendService with weight set to a non 0
     * number. Once a backendService is identified and before forwarding the request to
     * the backend service, advanced routing actions like Url rewrites and header
     * transformations are applied depending on additional settings specified in this
     * HttpRouteAction.
     * Structure is documented below.
     * 
     */
    @Import(name="weightedBackendServices")
      private final @Nullable Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

    public Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? Output.empty() : this.weightedBackendServices;
    }

    public RegionUrlMapPathMatcherPathRuleRouteActionArgs(
        @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy,
        @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy,
        @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy,
        @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy,
        @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout,
        @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite,
        @Nullable Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    private RegionUrlMapPathMatcherPathRuleRouteActionArgs() {
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

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy;
        private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy;
        private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy;
        private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy;
        private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout;
        private @Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite;
        private @Nullable Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder corsPolicy(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder corsPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionCorsPolicyArgs corsPolicy) {
            this.corsPolicy = Output.ofNullable(corsPolicy);
            return this;
        }

        public Builder faultInjectionPolicy(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs> faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        public Builder faultInjectionPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionFaultInjectionPolicyArgs faultInjectionPolicy) {
            this.faultInjectionPolicy = Output.ofNullable(faultInjectionPolicy);
            return this;
        }

        public Builder requestMirrorPolicy(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs> requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        public Builder requestMirrorPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicyArgs requestMirrorPolicy) {
            this.requestMirrorPolicy = Output.ofNullable(requestMirrorPolicy);
            return this;
        }

        public Builder retryPolicy(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder retryPolicy(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionRetryPolicyArgs retryPolicy) {
            this.retryPolicy = Output.ofNullable(retryPolicy);
            return this;
        }

        public Builder timeout(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder timeout(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionTimeoutArgs timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }

        public Builder urlRewrite(@Nullable Output<RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder urlRewrite(@Nullable RegionUrlMapPathMatcherPathRuleRouteActionUrlRewriteArgs urlRewrite) {
            this.urlRewrite = Output.ofNullable(urlRewrite);
            return this;
        }

        public Builder weightedBackendServices(@Nullable Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs>> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }

        public Builder weightedBackendServices(@Nullable List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceArgs> weightedBackendServices) {
            this.weightedBackendServices = Output.ofNullable(weightedBackendServices);
            return this;
        }
        public RegionUrlMapPathMatcherPathRuleRouteActionArgs build() {
            return new RegionUrlMapPathMatcherPathRuleRouteActionArgs(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}
