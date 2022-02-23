// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Online deployment scoring requests configuration.
 * 
 */
public final class OnlineRequestSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final OnlineRequestSettingsResponse Empty = new OnlineRequestSettingsResponse();

    /**
     * The number of requests allowed to queue at once for this deployment.
     * 
     */
    @InputImport(name="maxConcurrentRequestsPerInstance")
        private final @Nullable Integer maxConcurrentRequestsPerInstance;

    public Optional<Integer> getMaxConcurrentRequestsPerInstance() {
        return this.maxConcurrentRequestsPerInstance == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentRequestsPerInstance);
    }

    /**
     * The maximum queue wait time in ISO 8601 format. Supports millisecond precision.
     * 
     */
    @InputImport(name="maxQueueWait")
        private final @Nullable String maxQueueWait;

    public Optional<String> getMaxQueueWait() {
        return this.maxQueueWait == null ? Optional.empty() : Optional.ofNullable(this.maxQueueWait);
    }

    /**
     * The request timeout in ISO 8601 format. Supports millisecond precision.
     * 
     */
    @InputImport(name="requestTimeout")
        private final @Nullable String requestTimeout;

    public Optional<String> getRequestTimeout() {
        return this.requestTimeout == null ? Optional.empty() : Optional.ofNullable(this.requestTimeout);
    }

    public OnlineRequestSettingsResponse(
        @Nullable Integer maxConcurrentRequestsPerInstance,
        @Nullable String maxQueueWait,
        @Nullable String requestTimeout) {
        this.maxConcurrentRequestsPerInstance = maxConcurrentRequestsPerInstance;
        this.maxQueueWait = maxQueueWait;
        this.requestTimeout = requestTimeout;
    }

    private OnlineRequestSettingsResponse() {
        this.maxConcurrentRequestsPerInstance = null;
        this.maxQueueWait = null;
        this.requestTimeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnlineRequestSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxConcurrentRequestsPerInstance;
        private @Nullable String maxQueueWait;
        private @Nullable String requestTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(OnlineRequestSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConcurrentRequestsPerInstance = defaults.maxConcurrentRequestsPerInstance;
    	      this.maxQueueWait = defaults.maxQueueWait;
    	      this.requestTimeout = defaults.requestTimeout;
        }

        public Builder setMaxConcurrentRequestsPerInstance(@Nullable Integer maxConcurrentRequestsPerInstance) {
            this.maxConcurrentRequestsPerInstance = maxConcurrentRequestsPerInstance;
            return this;
        }

        public Builder setMaxQueueWait(@Nullable String maxQueueWait) {
            this.maxQueueWait = maxQueueWait;
            return this;
        }

        public Builder setRequestTimeout(@Nullable String requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public OnlineRequestSettingsResponse build() {
            return new OnlineRequestSettingsResponse(maxConcurrentRequestsPerInstance, maxQueueWait, requestTimeout);
        }
    }
}
