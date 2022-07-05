// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.appengine.v1beta.inputs.CpuUtilizationArgs;
import com.pulumi.googlenative.appengine.v1beta.inputs.CustomMetricArgs;
import com.pulumi.googlenative.appengine.v1beta.inputs.DiskUtilizationArgs;
import com.pulumi.googlenative.appengine.v1beta.inputs.NetworkUtilizationArgs;
import com.pulumi.googlenative.appengine.v1beta.inputs.RequestUtilizationArgs;
import com.pulumi.googlenative.appengine.v1beta.inputs.StandardSchedulerSettingsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Automatic scaling is based on request rate, response latencies, and other application metrics.
 * 
 */
public final class AutomaticScalingArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomaticScalingArgs Empty = new AutomaticScalingArgs();

    /**
     * The time period that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="coolDownPeriod")
    private @Nullable Output<String> coolDownPeriod;

    /**
     * @return The time period that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. Only applicable in the App Engine flexible environment.
     * 
     */
    public Optional<Output<String>> coolDownPeriod() {
        return Optional.ofNullable(this.coolDownPeriod);
    }

    /**
     * Target scaling by CPU usage.
     * 
     */
    @Import(name="cpuUtilization")
    private @Nullable Output<CpuUtilizationArgs> cpuUtilization;

    /**
     * @return Target scaling by CPU usage.
     * 
     */
    public Optional<Output<CpuUtilizationArgs>> cpuUtilization() {
        return Optional.ofNullable(this.cpuUtilization);
    }

    /**
     * Target scaling by user-provided metrics. Only applicable in the App Engine flexible environment.
     * 
     */
    @Import(name="customMetrics")
    private @Nullable Output<List<CustomMetricArgs>> customMetrics;

    /**
     * @return Target scaling by user-provided metrics. Only applicable in the App Engine flexible environment.
     * 
     */
    public Optional<Output<List<CustomMetricArgs>>> customMetrics() {
        return Optional.ofNullable(this.customMetrics);
    }

    /**
     * Target scaling by disk usage.
     * 
     */
    @Import(name="diskUtilization")
    private @Nullable Output<DiskUtilizationArgs> diskUtilization;

    /**
     * @return Target scaling by disk usage.
     * 
     */
    public Optional<Output<DiskUtilizationArgs>> diskUtilization() {
        return Optional.ofNullable(this.diskUtilization);
    }

    /**
     * Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value.
     * 
     */
    @Import(name="maxConcurrentRequests")
    private @Nullable Output<Integer> maxConcurrentRequests;

    /**
     * @return Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value.
     * 
     */
    public Optional<Output<Integer>> maxConcurrentRequests() {
        return Optional.ofNullable(this.maxConcurrentRequests);
    }

    /**
     * Maximum number of idle instances that should be maintained for this version.
     * 
     */
    @Import(name="maxIdleInstances")
    private @Nullable Output<Integer> maxIdleInstances;

    /**
     * @return Maximum number of idle instances that should be maintained for this version.
     * 
     */
    public Optional<Output<Integer>> maxIdleInstances() {
        return Optional.ofNullable(this.maxIdleInstances);
    }

    /**
     * Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    @Import(name="maxPendingLatency")
    private @Nullable Output<String> maxPendingLatency;

    /**
     * @return Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    public Optional<Output<String>> maxPendingLatency() {
        return Optional.ofNullable(this.maxPendingLatency);
    }

    /**
     * Maximum number of instances that should be started to handle requests for this version.
     * 
     */
    @Import(name="maxTotalInstances")
    private @Nullable Output<Integer> maxTotalInstances;

    /**
     * @return Maximum number of instances that should be started to handle requests for this version.
     * 
     */
    public Optional<Output<Integer>> maxTotalInstances() {
        return Optional.ofNullable(this.maxTotalInstances);
    }

    /**
     * Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
     * 
     */
    @Import(name="minIdleInstances")
    private @Nullable Output<Integer> minIdleInstances;

    /**
     * @return Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
     * 
     */
    public Optional<Output<Integer>> minIdleInstances() {
        return Optional.ofNullable(this.minIdleInstances);
    }

    /**
     * Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    @Import(name="minPendingLatency")
    private @Nullable Output<String> minPendingLatency;

    /**
     * @return Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
     * 
     */
    public Optional<Output<String>> minPendingLatency() {
        return Optional.ofNullable(this.minPendingLatency);
    }

    /**
     * Minimum number of running instances that should be maintained for this version.
     * 
     */
    @Import(name="minTotalInstances")
    private @Nullable Output<Integer> minTotalInstances;

    /**
     * @return Minimum number of running instances that should be maintained for this version.
     * 
     */
    public Optional<Output<Integer>> minTotalInstances() {
        return Optional.ofNullable(this.minTotalInstances);
    }

    /**
     * Target scaling by network usage.
     * 
     */
    @Import(name="networkUtilization")
    private @Nullable Output<NetworkUtilizationArgs> networkUtilization;

    /**
     * @return Target scaling by network usage.
     * 
     */
    public Optional<Output<NetworkUtilizationArgs>> networkUtilization() {
        return Optional.ofNullable(this.networkUtilization);
    }

    /**
     * Target scaling by request utilization.
     * 
     */
    @Import(name="requestUtilization")
    private @Nullable Output<RequestUtilizationArgs> requestUtilization;

    /**
     * @return Target scaling by request utilization.
     * 
     */
    public Optional<Output<RequestUtilizationArgs>> requestUtilization() {
        return Optional.ofNullable(this.requestUtilization);
    }

    /**
     * Scheduler settings for standard environment.
     * 
     */
    @Import(name="standardSchedulerSettings")
    private @Nullable Output<StandardSchedulerSettingsArgs> standardSchedulerSettings;

    /**
     * @return Scheduler settings for standard environment.
     * 
     */
    public Optional<Output<StandardSchedulerSettingsArgs>> standardSchedulerSettings() {
        return Optional.ofNullable(this.standardSchedulerSettings);
    }

    private AutomaticScalingArgs() {}

    private AutomaticScalingArgs(AutomaticScalingArgs $) {
        this.coolDownPeriod = $.coolDownPeriod;
        this.cpuUtilization = $.cpuUtilization;
        this.customMetrics = $.customMetrics;
        this.diskUtilization = $.diskUtilization;
        this.maxConcurrentRequests = $.maxConcurrentRequests;
        this.maxIdleInstances = $.maxIdleInstances;
        this.maxPendingLatency = $.maxPendingLatency;
        this.maxTotalInstances = $.maxTotalInstances;
        this.minIdleInstances = $.minIdleInstances;
        this.minPendingLatency = $.minPendingLatency;
        this.minTotalInstances = $.minTotalInstances;
        this.networkUtilization = $.networkUtilization;
        this.requestUtilization = $.requestUtilization;
        this.standardSchedulerSettings = $.standardSchedulerSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomaticScalingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomaticScalingArgs $;

        public Builder() {
            $ = new AutomaticScalingArgs();
        }

        public Builder(AutomaticScalingArgs defaults) {
            $ = new AutomaticScalingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param coolDownPeriod The time period that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. Only applicable in the App Engine flexible environment.
         * 
         * @return builder
         * 
         */
        public Builder coolDownPeriod(@Nullable Output<String> coolDownPeriod) {
            $.coolDownPeriod = coolDownPeriod;
            return this;
        }

        /**
         * @param coolDownPeriod The time period that the Autoscaler (https://cloud.google.com/compute/docs/autoscaler/) should wait before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. Only applicable in the App Engine flexible environment.
         * 
         * @return builder
         * 
         */
        public Builder coolDownPeriod(String coolDownPeriod) {
            return coolDownPeriod(Output.of(coolDownPeriod));
        }

        /**
         * @param cpuUtilization Target scaling by CPU usage.
         * 
         * @return builder
         * 
         */
        public Builder cpuUtilization(@Nullable Output<CpuUtilizationArgs> cpuUtilization) {
            $.cpuUtilization = cpuUtilization;
            return this;
        }

        /**
         * @param cpuUtilization Target scaling by CPU usage.
         * 
         * @return builder
         * 
         */
        public Builder cpuUtilization(CpuUtilizationArgs cpuUtilization) {
            return cpuUtilization(Output.of(cpuUtilization));
        }

        /**
         * @param customMetrics Target scaling by user-provided metrics. Only applicable in the App Engine flexible environment.
         * 
         * @return builder
         * 
         */
        public Builder customMetrics(@Nullable Output<List<CustomMetricArgs>> customMetrics) {
            $.customMetrics = customMetrics;
            return this;
        }

        /**
         * @param customMetrics Target scaling by user-provided metrics. Only applicable in the App Engine flexible environment.
         * 
         * @return builder
         * 
         */
        public Builder customMetrics(List<CustomMetricArgs> customMetrics) {
            return customMetrics(Output.of(customMetrics));
        }

        /**
         * @param customMetrics Target scaling by user-provided metrics. Only applicable in the App Engine flexible environment.
         * 
         * @return builder
         * 
         */
        public Builder customMetrics(CustomMetricArgs... customMetrics) {
            return customMetrics(List.of(customMetrics));
        }

        /**
         * @param diskUtilization Target scaling by disk usage.
         * 
         * @return builder
         * 
         */
        public Builder diskUtilization(@Nullable Output<DiskUtilizationArgs> diskUtilization) {
            $.diskUtilization = diskUtilization;
            return this;
        }

        /**
         * @param diskUtilization Target scaling by disk usage.
         * 
         * @return builder
         * 
         */
        public Builder diskUtilization(DiskUtilizationArgs diskUtilization) {
            return diskUtilization(Output.of(diskUtilization));
        }

        /**
         * @param maxConcurrentRequests Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentRequests(@Nullable Output<Integer> maxConcurrentRequests) {
            $.maxConcurrentRequests = maxConcurrentRequests;
            return this;
        }

        /**
         * @param maxConcurrentRequests Number of concurrent requests an automatic scaling instance can accept before the scheduler spawns a new instance.Defaults to a runtime-specific value.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentRequests(Integer maxConcurrentRequests) {
            return maxConcurrentRequests(Output.of(maxConcurrentRequests));
        }

        /**
         * @param maxIdleInstances Maximum number of idle instances that should be maintained for this version.
         * 
         * @return builder
         * 
         */
        public Builder maxIdleInstances(@Nullable Output<Integer> maxIdleInstances) {
            $.maxIdleInstances = maxIdleInstances;
            return this;
        }

        /**
         * @param maxIdleInstances Maximum number of idle instances that should be maintained for this version.
         * 
         * @return builder
         * 
         */
        public Builder maxIdleInstances(Integer maxIdleInstances) {
            return maxIdleInstances(Output.of(maxIdleInstances));
        }

        /**
         * @param maxPendingLatency Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
         * 
         * @return builder
         * 
         */
        public Builder maxPendingLatency(@Nullable Output<String> maxPendingLatency) {
            $.maxPendingLatency = maxPendingLatency;
            return this;
        }

        /**
         * @param maxPendingLatency Maximum amount of time that a request should wait in the pending queue before starting a new instance to handle it.
         * 
         * @return builder
         * 
         */
        public Builder maxPendingLatency(String maxPendingLatency) {
            return maxPendingLatency(Output.of(maxPendingLatency));
        }

        /**
         * @param maxTotalInstances Maximum number of instances that should be started to handle requests for this version.
         * 
         * @return builder
         * 
         */
        public Builder maxTotalInstances(@Nullable Output<Integer> maxTotalInstances) {
            $.maxTotalInstances = maxTotalInstances;
            return this;
        }

        /**
         * @param maxTotalInstances Maximum number of instances that should be started to handle requests for this version.
         * 
         * @return builder
         * 
         */
        public Builder maxTotalInstances(Integer maxTotalInstances) {
            return maxTotalInstances(Output.of(maxTotalInstances));
        }

        /**
         * @param minIdleInstances Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
         * 
         * @return builder
         * 
         */
        public Builder minIdleInstances(@Nullable Output<Integer> minIdleInstances) {
            $.minIdleInstances = minIdleInstances;
            return this;
        }

        /**
         * @param minIdleInstances Minimum number of idle instances that should be maintained for this version. Only applicable for the default version of a service.
         * 
         * @return builder
         * 
         */
        public Builder minIdleInstances(Integer minIdleInstances) {
            return minIdleInstances(Output.of(minIdleInstances));
        }

        /**
         * @param minPendingLatency Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
         * 
         * @return builder
         * 
         */
        public Builder minPendingLatency(@Nullable Output<String> minPendingLatency) {
            $.minPendingLatency = minPendingLatency;
            return this;
        }

        /**
         * @param minPendingLatency Minimum amount of time a request should wait in the pending queue before starting a new instance to handle it.
         * 
         * @return builder
         * 
         */
        public Builder minPendingLatency(String minPendingLatency) {
            return minPendingLatency(Output.of(minPendingLatency));
        }

        /**
         * @param minTotalInstances Minimum number of running instances that should be maintained for this version.
         * 
         * @return builder
         * 
         */
        public Builder minTotalInstances(@Nullable Output<Integer> minTotalInstances) {
            $.minTotalInstances = minTotalInstances;
            return this;
        }

        /**
         * @param minTotalInstances Minimum number of running instances that should be maintained for this version.
         * 
         * @return builder
         * 
         */
        public Builder minTotalInstances(Integer minTotalInstances) {
            return minTotalInstances(Output.of(minTotalInstances));
        }

        /**
         * @param networkUtilization Target scaling by network usage.
         * 
         * @return builder
         * 
         */
        public Builder networkUtilization(@Nullable Output<NetworkUtilizationArgs> networkUtilization) {
            $.networkUtilization = networkUtilization;
            return this;
        }

        /**
         * @param networkUtilization Target scaling by network usage.
         * 
         * @return builder
         * 
         */
        public Builder networkUtilization(NetworkUtilizationArgs networkUtilization) {
            return networkUtilization(Output.of(networkUtilization));
        }

        /**
         * @param requestUtilization Target scaling by request utilization.
         * 
         * @return builder
         * 
         */
        public Builder requestUtilization(@Nullable Output<RequestUtilizationArgs> requestUtilization) {
            $.requestUtilization = requestUtilization;
            return this;
        }

        /**
         * @param requestUtilization Target scaling by request utilization.
         * 
         * @return builder
         * 
         */
        public Builder requestUtilization(RequestUtilizationArgs requestUtilization) {
            return requestUtilization(Output.of(requestUtilization));
        }

        /**
         * @param standardSchedulerSettings Scheduler settings for standard environment.
         * 
         * @return builder
         * 
         */
        public Builder standardSchedulerSettings(@Nullable Output<StandardSchedulerSettingsArgs> standardSchedulerSettings) {
            $.standardSchedulerSettings = standardSchedulerSettings;
            return this;
        }

        /**
         * @param standardSchedulerSettings Scheduler settings for standard environment.
         * 
         * @return builder
         * 
         */
        public Builder standardSchedulerSettings(StandardSchedulerSettingsArgs standardSchedulerSettings) {
            return standardSchedulerSettings(Output.of(standardSchedulerSettings));
        }

        public AutomaticScalingArgs build() {
            return $;
        }
    }

}
