// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionCorsPolicy;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionRetryPolicy;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionTimeout;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionUrlRewrite;
import io.pulumi.gcp.compute.outputs.URLMapPathMatcherDefaultRouteActionWeightedBackendService;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class URLMapPathMatcherDefaultRouteAction {
    private final @Nullable URLMapPathMatcherDefaultRouteActionCorsPolicy corsPolicy;
    private final @Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy;
    private final @Nullable URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy;
    private final @Nullable URLMapPathMatcherDefaultRouteActionRetryPolicy retryPolicy;
    private final @Nullable URLMapPathMatcherDefaultRouteActionTimeout timeout;
    private final @Nullable URLMapPathMatcherDefaultRouteActionUrlRewrite urlRewrite;
    private final @Nullable List<URLMapPathMatcherDefaultRouteActionWeightedBackendService> weightedBackendServices;

    @OutputCustomType.Constructor({"corsPolicy","faultInjectionPolicy","requestMirrorPolicy","retryPolicy","timeout","urlRewrite","weightedBackendServices"})
    private URLMapPathMatcherDefaultRouteAction(
        @Nullable URLMapPathMatcherDefaultRouteActionCorsPolicy corsPolicy,
        @Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy,
        @Nullable URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy,
        @Nullable URLMapPathMatcherDefaultRouteActionRetryPolicy retryPolicy,
        @Nullable URLMapPathMatcherDefaultRouteActionTimeout timeout,
        @Nullable URLMapPathMatcherDefaultRouteActionUrlRewrite urlRewrite,
        @Nullable List<URLMapPathMatcherDefaultRouteActionWeightedBackendService> weightedBackendServices) {
        this.corsPolicy = corsPolicy;
        this.faultInjectionPolicy = faultInjectionPolicy;
        this.requestMirrorPolicy = requestMirrorPolicy;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
        this.urlRewrite = urlRewrite;
        this.weightedBackendServices = weightedBackendServices;
    }

    public Optional<URLMapPathMatcherDefaultRouteActionCorsPolicy> getCorsPolicy() {
        return Optional.ofNullable(this.corsPolicy);
    }
    public Optional<URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy> getFaultInjectionPolicy() {
        return Optional.ofNullable(this.faultInjectionPolicy);
    }
    public Optional<URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy> getRequestMirrorPolicy() {
        return Optional.ofNullable(this.requestMirrorPolicy);
    }
    public Optional<URLMapPathMatcherDefaultRouteActionRetryPolicy> getRetryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    public Optional<URLMapPathMatcherDefaultRouteActionTimeout> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }
    public Optional<URLMapPathMatcherDefaultRouteActionUrlRewrite> getUrlRewrite() {
        return Optional.ofNullable(this.urlRewrite);
    }
    public List<URLMapPathMatcherDefaultRouteActionWeightedBackendService> getWeightedBackendServices() {
        return this.weightedBackendServices == null ? List.of() : this.weightedBackendServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapPathMatcherDefaultRouteAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable URLMapPathMatcherDefaultRouteActionCorsPolicy corsPolicy;
        private @Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy;
        private @Nullable URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy;
        private @Nullable URLMapPathMatcherDefaultRouteActionRetryPolicy retryPolicy;
        private @Nullable URLMapPathMatcherDefaultRouteActionTimeout timeout;
        private @Nullable URLMapPathMatcherDefaultRouteActionUrlRewrite urlRewrite;
        private @Nullable List<URLMapPathMatcherDefaultRouteActionWeightedBackendService> weightedBackendServices;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapPathMatcherDefaultRouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.faultInjectionPolicy = defaults.faultInjectionPolicy;
    	      this.requestMirrorPolicy = defaults.requestMirrorPolicy;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
    	      this.urlRewrite = defaults.urlRewrite;
    	      this.weightedBackendServices = defaults.weightedBackendServices;
        }

        public Builder setCorsPolicy(@Nullable URLMapPathMatcherDefaultRouteActionCorsPolicy corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }

        public Builder setFaultInjectionPolicy(@Nullable URLMapPathMatcherDefaultRouteActionFaultInjectionPolicy faultInjectionPolicy) {
            this.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        public Builder setRequestMirrorPolicy(@Nullable URLMapPathMatcherDefaultRouteActionRequestMirrorPolicy requestMirrorPolicy) {
            this.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        public Builder setRetryPolicy(@Nullable URLMapPathMatcherDefaultRouteActionRetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder setTimeout(@Nullable URLMapPathMatcherDefaultRouteActionTimeout timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setUrlRewrite(@Nullable URLMapPathMatcherDefaultRouteActionUrlRewrite urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }

        public Builder setWeightedBackendServices(@Nullable List<URLMapPathMatcherDefaultRouteActionWeightedBackendService> weightedBackendServices) {
            this.weightedBackendServices = weightedBackendServices;
            return this;
        }

        public URLMapPathMatcherDefaultRouteAction build() {
            return new URLMapPathMatcherDefaultRouteAction(corsPolicy, faultInjectionPolicy, requestMirrorPolicy, retryPolicy, timeout, urlRewrite, weightedBackendServices);
        }
    }
}