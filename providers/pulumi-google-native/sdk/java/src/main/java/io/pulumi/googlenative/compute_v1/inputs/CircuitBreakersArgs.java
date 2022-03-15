// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings controlling the volume of requests, connections and retries to this backend service.
 * 
 */
public final class CircuitBreakersArgs extends io.pulumi.resources.ResourceArgs {

    public static final CircuitBreakersArgs Empty = new CircuitBreakersArgs();

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="maxConnections")
      private final @Nullable Output<Integer> maxConnections;

    public Output<Integer> getMaxConnections() {
        return this.maxConnections == null ? Output.empty() : this.maxConnections;
    }

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="maxPendingRequests")
      private final @Nullable Output<Integer> maxPendingRequests;

    public Output<Integer> getMaxPendingRequests() {
        return this.maxPendingRequests == null ? Output.empty() : this.maxPendingRequests;
    }

    /**
     * The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit.
     * 
     */
    @Import(name="maxRequests")
      private final @Nullable Output<Integer> maxRequests;

    public Output<Integer> getMaxRequests() {
        return this.maxRequests == null ? Output.empty() : this.maxRequests;
    }

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="maxRequestsPerConnection")
      private final @Nullable Output<Integer> maxRequestsPerConnection;

    public Output<Integer> getMaxRequestsPerConnection() {
        return this.maxRequestsPerConnection == null ? Output.empty() : this.maxRequestsPerConnection;
    }

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="maxRetries")
      private final @Nullable Output<Integer> maxRetries;

    public Output<Integer> getMaxRetries() {
        return this.maxRetries == null ? Output.empty() : this.maxRetries;
    }

    public CircuitBreakersArgs(
        @Nullable Output<Integer> maxConnections,
        @Nullable Output<Integer> maxPendingRequests,
        @Nullable Output<Integer> maxRequests,
        @Nullable Output<Integer> maxRequestsPerConnection,
        @Nullable Output<Integer> maxRetries) {
        this.maxConnections = maxConnections;
        this.maxPendingRequests = maxPendingRequests;
        this.maxRequests = maxRequests;
        this.maxRequestsPerConnection = maxRequestsPerConnection;
        this.maxRetries = maxRetries;
    }

    private CircuitBreakersArgs() {
        this.maxConnections = Output.empty();
        this.maxPendingRequests = Output.empty();
        this.maxRequests = Output.empty();
        this.maxRequestsPerConnection = Output.empty();
        this.maxRetries = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CircuitBreakersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxConnections;
        private @Nullable Output<Integer> maxPendingRequests;
        private @Nullable Output<Integer> maxRequests;
        private @Nullable Output<Integer> maxRequestsPerConnection;
        private @Nullable Output<Integer> maxRetries;

        public Builder() {
    	      // Empty
        }

        public Builder(CircuitBreakersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
    	      this.maxRequests = defaults.maxRequests;
    	      this.maxRequestsPerConnection = defaults.maxRequestsPerConnection;
    	      this.maxRetries = defaults.maxRetries;
        }

        public Builder maxConnections(@Nullable Output<Integer> maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        public Builder maxConnections(@Nullable Integer maxConnections) {
            this.maxConnections = Output.ofNullable(maxConnections);
            return this;
        }

        public Builder maxPendingRequests(@Nullable Output<Integer> maxPendingRequests) {
            this.maxPendingRequests = maxPendingRequests;
            return this;
        }

        public Builder maxPendingRequests(@Nullable Integer maxPendingRequests) {
            this.maxPendingRequests = Output.ofNullable(maxPendingRequests);
            return this;
        }

        public Builder maxRequests(@Nullable Output<Integer> maxRequests) {
            this.maxRequests = maxRequests;
            return this;
        }

        public Builder maxRequests(@Nullable Integer maxRequests) {
            this.maxRequests = Output.ofNullable(maxRequests);
            return this;
        }

        public Builder maxRequestsPerConnection(@Nullable Output<Integer> maxRequestsPerConnection) {
            this.maxRequestsPerConnection = maxRequestsPerConnection;
            return this;
        }

        public Builder maxRequestsPerConnection(@Nullable Integer maxRequestsPerConnection) {
            this.maxRequestsPerConnection = Output.ofNullable(maxRequestsPerConnection);
            return this;
        }

        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        public Builder maxRetries(@Nullable Integer maxRetries) {
            this.maxRetries = Output.ofNullable(maxRetries);
            return this;
        }
        public CircuitBreakersArgs build() {
            return new CircuitBreakersArgs(maxConnections, maxPendingRequests, maxRequests, maxRequestsPerConnection, maxRetries);
        }
    }
}
