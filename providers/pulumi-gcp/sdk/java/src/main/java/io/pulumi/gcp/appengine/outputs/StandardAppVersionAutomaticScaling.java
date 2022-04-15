// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.appengine.outputs.StandardAppVersionAutomaticScalingStandardSchedulerSettings;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StandardAppVersionAutomaticScaling {
    /**
     * Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.
     * Defaults to a runtime-specific value.
     * 
     */
    private final @Nullable Integer maxConcurrentRequests;
    /**
     * Maximum number of idle instances that should be maintained for this version.
     * 
     */
    private final @Nullable Integer maxIdleInstances;
    /**
     * Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final @Nullable String maxPendingLatency;
    /**
     * Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
     * 
     */
    private final @Nullable Integer minIdleInstances;
    /**
     * Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    private final @Nullable String minPendingLatency;
    /**
     * Scheduler settings for standard environment.
     * Structure is documented below.
     * 
     */
    private final @Nullable StandardAppVersionAutomaticScalingStandardSchedulerSettings standardSchedulerSettings;

    @CustomType.Constructor
    private StandardAppVersionAutomaticScaling(
        @CustomType.Parameter("maxConcurrentRequests") @Nullable Integer maxConcurrentRequests,
        @CustomType.Parameter("maxIdleInstances") @Nullable Integer maxIdleInstances,
        @CustomType.Parameter("maxPendingLatency") @Nullable String maxPendingLatency,
        @CustomType.Parameter("minIdleInstances") @Nullable Integer minIdleInstances,
        @CustomType.Parameter("minPendingLatency") @Nullable String minPendingLatency,
        @CustomType.Parameter("standardSchedulerSettings") @Nullable StandardAppVersionAutomaticScalingStandardSchedulerSettings standardSchedulerSettings) {
        this.maxConcurrentRequests = maxConcurrentRequests;
        this.maxIdleInstances = maxIdleInstances;
        this.maxPendingLatency = maxPendingLatency;
        this.minIdleInstances = minIdleInstances;
        this.minPendingLatency = minPendingLatency;
        this.standardSchedulerSettings = standardSchedulerSettings;
    }

    /**
     * Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.
     * Defaults to a runtime-specific value.
     * 
    */
    public Optional<Integer> maxConcurrentRequests() {
        return Optional.ofNullable(this.maxConcurrentRequests);
    }
    /**
     * Maximum number of idle instances that should be maintained for this version.
     * 
    */
    public Optional<Integer> maxIdleInstances() {
        return Optional.ofNullable(this.maxIdleInstances);
    }
    /**
     * Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
    */
    public Optional<String> maxPendingLatency() {
        return Optional.ofNullable(this.maxPendingLatency);
    }
    /**
     * Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
     * 
    */
    public Optional<Integer> minIdleInstances() {
        return Optional.ofNullable(this.minIdleInstances);
    }
    /**
     * Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
    */
    public Optional<String> minPendingLatency() {
        return Optional.ofNullable(this.minPendingLatency);
    }
    /**
     * Scheduler settings for standard environment.
     * Structure is documented below.
     * 
    */
    public Optional<StandardAppVersionAutomaticScalingStandardSchedulerSettings> standardSchedulerSettings() {
        return Optional.ofNullable(this.standardSchedulerSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardAppVersionAutomaticScaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxConcurrentRequests;
        private @Nullable Integer maxIdleInstances;
        private @Nullable String maxPendingLatency;
        private @Nullable Integer minIdleInstances;
        private @Nullable String minPendingLatency;
        private @Nullable StandardAppVersionAutomaticScalingStandardSchedulerSettings standardSchedulerSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardAppVersionAutomaticScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConcurrentRequests = defaults.maxConcurrentRequests;
    	      this.maxIdleInstances = defaults.maxIdleInstances;
    	      this.maxPendingLatency = defaults.maxPendingLatency;
    	      this.minIdleInstances = defaults.minIdleInstances;
    	      this.minPendingLatency = defaults.minPendingLatency;
    	      this.standardSchedulerSettings = defaults.standardSchedulerSettings;
        }

        public Builder maxConcurrentRequests(@Nullable Integer maxConcurrentRequests) {
            this.maxConcurrentRequests = maxConcurrentRequests;
            return this;
        }
        public Builder maxIdleInstances(@Nullable Integer maxIdleInstances) {
            this.maxIdleInstances = maxIdleInstances;
            return this;
        }
        public Builder maxPendingLatency(@Nullable String maxPendingLatency) {
            this.maxPendingLatency = maxPendingLatency;
            return this;
        }
        public Builder minIdleInstances(@Nullable Integer minIdleInstances) {
            this.minIdleInstances = minIdleInstances;
            return this;
        }
        public Builder minPendingLatency(@Nullable String minPendingLatency) {
            this.minPendingLatency = minPendingLatency;
            return this;
        }
        public Builder standardSchedulerSettings(@Nullable StandardAppVersionAutomaticScalingStandardSchedulerSettings standardSchedulerSettings) {
            this.standardSchedulerSettings = standardSchedulerSettings;
            return this;
        }        public StandardAppVersionAutomaticScaling build() {
            return new StandardAppVersionAutomaticScaling(maxConcurrentRequests, maxIdleInstances, maxPendingLatency, minIdleInstances, minPendingLatency, standardSchedulerSettings);
        }
    }
}
