// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionAutomaticScalingCpuUtilization;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionAutomaticScalingDiskUtilization;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionAutomaticScalingNetworkUtilization;
import io.pulumi.gcp.appengine.outputs.FlexibleAppVersionAutomaticScalingRequestUtilization;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlexibleAppVersionAutomaticScaling {
    /**
     * The time period that the Autoscaler should wait before it starts collecting information from a new instance.
     * This prevents the autoscaler from collecting information when the instance is initializing,
     * during which the collected usage would not be reliable. Default: 120s
     * 
     */
    private final @Nullable String coolDownPeriod;
    /**
     * Target scaling by CPU usage.
     * Structure is documented below.
     * 
     */
    private final FlexibleAppVersionAutomaticScalingCpuUtilization cpuUtilization;
    /**
     * Target scaling by disk usage.
     * Structure is documented below.
     * 
     */
    private final @Nullable FlexibleAppVersionAutomaticScalingDiskUtilization diskUtilization;
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
     * 
     */
    private final @Nullable String maxPendingLatency;
    /**
     * Maximum number of instances that should be started to handle requests for this version. Default: 20
     * 
     */
    private final @Nullable Integer maxTotalInstances;
    /**
     * Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
     * 
     */
    private final @Nullable Integer minIdleInstances;
    /**
     * Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    private final @Nullable String minPendingLatency;
    /**
     * Minimum number of running instances that should be maintained for this version. Default: 2
     * 
     */
    private final @Nullable Integer minTotalInstances;
    /**
     * Target scaling by network usage.
     * Structure is documented below.
     * 
     */
    private final @Nullable FlexibleAppVersionAutomaticScalingNetworkUtilization networkUtilization;
    /**
     * Target scaling by request utilization.
     * Structure is documented below.
     * 
     */
    private final @Nullable FlexibleAppVersionAutomaticScalingRequestUtilization requestUtilization;

    @OutputCustomType.Constructor({"coolDownPeriod","cpuUtilization","diskUtilization","maxConcurrentRequests","maxIdleInstances","maxPendingLatency","maxTotalInstances","minIdleInstances","minPendingLatency","minTotalInstances","networkUtilization","requestUtilization"})
    private FlexibleAppVersionAutomaticScaling(
        @Nullable String coolDownPeriod,
        FlexibleAppVersionAutomaticScalingCpuUtilization cpuUtilization,
        @Nullable FlexibleAppVersionAutomaticScalingDiskUtilization diskUtilization,
        @Nullable Integer maxConcurrentRequests,
        @Nullable Integer maxIdleInstances,
        @Nullable String maxPendingLatency,
        @Nullable Integer maxTotalInstances,
        @Nullable Integer minIdleInstances,
        @Nullable String minPendingLatency,
        @Nullable Integer minTotalInstances,
        @Nullable FlexibleAppVersionAutomaticScalingNetworkUtilization networkUtilization,
        @Nullable FlexibleAppVersionAutomaticScalingRequestUtilization requestUtilization) {
        this.coolDownPeriod = coolDownPeriod;
        this.cpuUtilization = Objects.requireNonNull(cpuUtilization);
        this.diskUtilization = diskUtilization;
        this.maxConcurrentRequests = maxConcurrentRequests;
        this.maxIdleInstances = maxIdleInstances;
        this.maxPendingLatency = maxPendingLatency;
        this.maxTotalInstances = maxTotalInstances;
        this.minIdleInstances = minIdleInstances;
        this.minPendingLatency = minPendingLatency;
        this.minTotalInstances = minTotalInstances;
        this.networkUtilization = networkUtilization;
        this.requestUtilization = requestUtilization;
    }

    /**
     * The time period that the Autoscaler should wait before it starts collecting information from a new instance.
     * This prevents the autoscaler from collecting information when the instance is initializing,
     * during which the collected usage would not be reliable. Default: 120s
     * 
     */
    public Optional<String> getCoolDownPeriod() {
        return Optional.ofNullable(this.coolDownPeriod);
    }
    /**
     * Target scaling by CPU usage.
     * Structure is documented below.
     * 
     */
    public FlexibleAppVersionAutomaticScalingCpuUtilization getCpuUtilization() {
        return this.cpuUtilization;
    }
    /**
     * Target scaling by disk usage.
     * Structure is documented below.
     * 
     */
    public Optional<FlexibleAppVersionAutomaticScalingDiskUtilization> getDiskUtilization() {
        return Optional.ofNullable(this.diskUtilization);
    }
    /**
     * Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.
     * Defaults to a runtime-specific value.
     * 
     */
    public Optional<Integer> getMaxConcurrentRequests() {
        return Optional.ofNullable(this.maxConcurrentRequests);
    }
    /**
     * Maximum number of idle instances that should be maintained for this version.
     * 
     */
    public Optional<Integer> getMaxIdleInstances() {
        return Optional.ofNullable(this.maxIdleInstances);
    }
    /**
     * Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    public Optional<String> getMaxPendingLatency() {
        return Optional.ofNullable(this.maxPendingLatency);
    }
    /**
     * Maximum number of instances that should be started to handle requests for this version. Default: 20
     * 
     */
    public Optional<Integer> getMaxTotalInstances() {
        return Optional.ofNullable(this.maxTotalInstances);
    }
    /**
     * Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
     * 
     */
    public Optional<Integer> getMinIdleInstances() {
        return Optional.ofNullable(this.minIdleInstances);
    }
    /**
     * Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    public Optional<String> getMinPendingLatency() {
        return Optional.ofNullable(this.minPendingLatency);
    }
    /**
     * Minimum number of running instances that should be maintained for this version. Default: 2
     * 
     */
    public Optional<Integer> getMinTotalInstances() {
        return Optional.ofNullable(this.minTotalInstances);
    }
    /**
     * Target scaling by network usage.
     * Structure is documented below.
     * 
     */
    public Optional<FlexibleAppVersionAutomaticScalingNetworkUtilization> getNetworkUtilization() {
        return Optional.ofNullable(this.networkUtilization);
    }
    /**
     * Target scaling by request utilization.
     * Structure is documented below.
     * 
     */
    public Optional<FlexibleAppVersionAutomaticScalingRequestUtilization> getRequestUtilization() {
        return Optional.ofNullable(this.requestUtilization);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionAutomaticScaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String coolDownPeriod;
        private FlexibleAppVersionAutomaticScalingCpuUtilization cpuUtilization;
        private @Nullable FlexibleAppVersionAutomaticScalingDiskUtilization diskUtilization;
        private @Nullable Integer maxConcurrentRequests;
        private @Nullable Integer maxIdleInstances;
        private @Nullable String maxPendingLatency;
        private @Nullable Integer maxTotalInstances;
        private @Nullable Integer minIdleInstances;
        private @Nullable String minPendingLatency;
        private @Nullable Integer minTotalInstances;
        private @Nullable FlexibleAppVersionAutomaticScalingNetworkUtilization networkUtilization;
        private @Nullable FlexibleAppVersionAutomaticScalingRequestUtilization requestUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionAutomaticScaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coolDownPeriod = defaults.coolDownPeriod;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.diskUtilization = defaults.diskUtilization;
    	      this.maxConcurrentRequests = defaults.maxConcurrentRequests;
    	      this.maxIdleInstances = defaults.maxIdleInstances;
    	      this.maxPendingLatency = defaults.maxPendingLatency;
    	      this.maxTotalInstances = defaults.maxTotalInstances;
    	      this.minIdleInstances = defaults.minIdleInstances;
    	      this.minPendingLatency = defaults.minPendingLatency;
    	      this.minTotalInstances = defaults.minTotalInstances;
    	      this.networkUtilization = defaults.networkUtilization;
    	      this.requestUtilization = defaults.requestUtilization;
        }

        public Builder setCoolDownPeriod(@Nullable String coolDownPeriod) {
            this.coolDownPeriod = coolDownPeriod;
            return this;
        }

        public Builder setCpuUtilization(FlexibleAppVersionAutomaticScalingCpuUtilization cpuUtilization) {
            this.cpuUtilization = Objects.requireNonNull(cpuUtilization);
            return this;
        }

        public Builder setDiskUtilization(@Nullable FlexibleAppVersionAutomaticScalingDiskUtilization diskUtilization) {
            this.diskUtilization = diskUtilization;
            return this;
        }

        public Builder setMaxConcurrentRequests(@Nullable Integer maxConcurrentRequests) {
            this.maxConcurrentRequests = maxConcurrentRequests;
            return this;
        }

        public Builder setMaxIdleInstances(@Nullable Integer maxIdleInstances) {
            this.maxIdleInstances = maxIdleInstances;
            return this;
        }

        public Builder setMaxPendingLatency(@Nullable String maxPendingLatency) {
            this.maxPendingLatency = maxPendingLatency;
            return this;
        }

        public Builder setMaxTotalInstances(@Nullable Integer maxTotalInstances) {
            this.maxTotalInstances = maxTotalInstances;
            return this;
        }

        public Builder setMinIdleInstances(@Nullable Integer minIdleInstances) {
            this.minIdleInstances = minIdleInstances;
            return this;
        }

        public Builder setMinPendingLatency(@Nullable String minPendingLatency) {
            this.minPendingLatency = minPendingLatency;
            return this;
        }

        public Builder setMinTotalInstances(@Nullable Integer minTotalInstances) {
            this.minTotalInstances = minTotalInstances;
            return this;
        }

        public Builder setNetworkUtilization(@Nullable FlexibleAppVersionAutomaticScalingNetworkUtilization networkUtilization) {
            this.networkUtilization = networkUtilization;
            return this;
        }

        public Builder setRequestUtilization(@Nullable FlexibleAppVersionAutomaticScalingRequestUtilization requestUtilization) {
            this.requestUtilization = requestUtilization;
            return this;
        }
        public FlexibleAppVersionAutomaticScaling build() {
            return new FlexibleAppVersionAutomaticScaling(coolDownPeriod, cpuUtilization, diskUtilization, maxConcurrentRequests, maxIdleInstances, maxPendingLatency, maxTotalInstances, minIdleInstances, minPendingLatency, minTotalInstances, networkUtilization, requestUtilization);
        }
    }
}
