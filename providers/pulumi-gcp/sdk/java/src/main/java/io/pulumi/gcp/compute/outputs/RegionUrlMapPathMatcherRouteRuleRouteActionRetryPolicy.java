// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeout;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicy {
    /**
     * Specifies the allowed number retries. This number must be > 0.
     * 
     */
    private final Integer numRetries;
    /**
     * Specifies a non-zero timeout per retry attempt.
     * Structure is documented below.
     * 
     */
    private final @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeout perTryTimeout;
    /**
     * Specifies one or more conditions when this retry rule applies. Valid values are:
     * - 5xx: Loadbalancer will attempt a retry if the backend service responds with
     *   any 5xx response code, or if the backend service does not respond at all,
     *   example: disconnects, reset, read timeout, connection failure, and refused
     *   streams.
     * - gateway-error: Similar to 5xx, but only applies to response codes
     *   502, 503 or 504.
     * - connect-failure: Loadbalancer will retry on failures
     *   connecting to backend services, for example due to connection timeouts.
     * - retriable-4xx: Loadbalancer will retry for retriable 4xx response codes.
     *   Currently the only retriable error supported is 409.
     * - refused-stream: Loadbalancer will retry if the backend service resets the stream with a
     *   REFUSED_STREAM error code. This reset type indicates that it is safe to retry.
     * - cancelled: Loadbalancer will retry if the gRPC status code in the response
     *   header is set to cancelled
     * - deadline-exceeded: Loadbalancer will retry if the
     *   gRPC status code in the response header is set to deadline-exceeded
     * - resource-exhausted: Loadbalancer will retry if the gRPC status code in the response
     *   header is set to resource-exhausted
     * - unavailable: Loadbalancer will retry if
     *   the gRPC status code in the response header is set to unavailable
     * 
     */
    private final @Nullable List<String> retryConditions;

    @OutputCustomType.Constructor({"numRetries","perTryTimeout","retryConditions"})
    private RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicy(
        Integer numRetries,
        @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeout perTryTimeout,
        @Nullable List<String> retryConditions) {
        this.numRetries = Objects.requireNonNull(numRetries);
        this.perTryTimeout = perTryTimeout;
        this.retryConditions = retryConditions;
    }

    /**
     * Specifies the allowed number retries. This number must be > 0.
     * 
     */
    public Integer getNumRetries() {
        return this.numRetries;
    }
    /**
     * Specifies a non-zero timeout per retry attempt.
     * Structure is documented below.
     * 
     */
    public Optional<RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeout> getPerTryTimeout() {
        return Optional.ofNullable(this.perTryTimeout);
    }
    /**
     * Specifies one or more conditions when this retry rule applies. Valid values are:
     * - 5xx: Loadbalancer will attempt a retry if the backend service responds with
     *   any 5xx response code, or if the backend service does not respond at all,
     *   example: disconnects, reset, read timeout, connection failure, and refused
     *   streams.
     * - gateway-error: Similar to 5xx, but only applies to response codes
     *   502, 503 or 504.
     * - connect-failure: Loadbalancer will retry on failures
     *   connecting to backend services, for example due to connection timeouts.
     * - retriable-4xx: Loadbalancer will retry for retriable 4xx response codes.
     *   Currently the only retriable error supported is 409.
     * - refused-stream: Loadbalancer will retry if the backend service resets the stream with a
     *   REFUSED_STREAM error code. This reset type indicates that it is safe to retry.
     * - cancelled: Loadbalancer will retry if the gRPC status code in the response
     *   header is set to cancelled
     * - deadline-exceeded: Loadbalancer will retry if the
     *   gRPC status code in the response header is set to deadline-exceeded
     * - resource-exhausted: Loadbalancer will retry if the gRPC status code in the response
     *   header is set to resource-exhausted
     * - unavailable: Loadbalancer will retry if
     *   the gRPC status code in the response header is set to unavailable
     * 
     */
    public List<String> getRetryConditions() {
        return this.retryConditions == null ? List.of() : this.retryConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer numRetries;
        private @Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeout perTryTimeout;
        private @Nullable List<String> retryConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numRetries = defaults.numRetries;
    	      this.perTryTimeout = defaults.perTryTimeout;
    	      this.retryConditions = defaults.retryConditions;
        }

        public Builder setNumRetries(Integer numRetries) {
            this.numRetries = Objects.requireNonNull(numRetries);
            return this;
        }

        public Builder setPerTryTimeout(@Nullable RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicyPerTryTimeout perTryTimeout) {
            this.perTryTimeout = perTryTimeout;
            return this;
        }

        public Builder setRetryConditions(@Nullable List<String> retryConditions) {
            this.retryConditions = retryConditions;
            return this;
        }
        public RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicy build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionRetryPolicy(numRetries, perTryTimeout, retryConditions);
        }
    }
}
