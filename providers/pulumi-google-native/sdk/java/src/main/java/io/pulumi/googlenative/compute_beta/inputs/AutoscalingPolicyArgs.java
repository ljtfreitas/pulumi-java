// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.AutoscalingPolicyMode;
import io.pulumi.googlenative.compute_beta.inputs.AutoscalingPolicyCpuUtilizationArgs;
import io.pulumi.googlenative.compute_beta.inputs.AutoscalingPolicyCustomMetricUtilizationArgs;
import io.pulumi.googlenative.compute_beta.inputs.AutoscalingPolicyLoadBalancingUtilizationArgs;
import io.pulumi.googlenative.compute_beta.inputs.AutoscalingPolicyScaleDownControlArgs;
import io.pulumi.googlenative.compute_beta.inputs.AutoscalingPolicyScaleInControlArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cloud Autoscaler policy.
 * 
 */
public final class AutoscalingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyArgs Empty = new AutoscalingPolicyArgs();

    /**
     * The number of seconds that the autoscaler waits before it starts collecting information from a new instance. This prevents the autoscaler from collecting information when the instance is initializing, during which the collected usage would not be reliable. The default time autoscaler waits is 60 seconds. Virtual machine initialization times might vary because of numerous factors. We recommend that you test how long an instance may take to initialize. To do this, create an instance and time the startup process.
     * 
     */
    @InputImport(name="coolDownPeriodSec")
      private final @Nullable Input<Integer> coolDownPeriodSec;

    public Input<Integer> getCoolDownPeriodSec() {
        return this.coolDownPeriodSec == null ? Input.empty() : this.coolDownPeriodSec;
    }

    /**
     * Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU utilization of a managed instance group.
     * 
     */
    @InputImport(name="cpuUtilization")
      private final @Nullable Input<AutoscalingPolicyCpuUtilizationArgs> cpuUtilization;

    public Input<AutoscalingPolicyCpuUtilizationArgs> getCpuUtilization() {
        return this.cpuUtilization == null ? Input.empty() : this.cpuUtilization;
    }

    /**
     * Configuration parameters of autoscaling based on a custom metric.
     * 
     */
    @InputImport(name="customMetricUtilizations")
      private final @Nullable Input<List<AutoscalingPolicyCustomMetricUtilizationArgs>> customMetricUtilizations;

    public Input<List<AutoscalingPolicyCustomMetricUtilizationArgs>> getCustomMetricUtilizations() {
        return this.customMetricUtilizations == null ? Input.empty() : this.customMetricUtilizations;
    }

    /**
     * Configuration parameters of autoscaling based on load balancer.
     * 
     */
    @InputImport(name="loadBalancingUtilization")
      private final @Nullable Input<AutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization;

    public Input<AutoscalingPolicyLoadBalancingUtilizationArgs> getLoadBalancingUtilization() {
        return this.loadBalancingUtilization == null ? Input.empty() : this.loadBalancingUtilization;
    }

    /**
     * The maximum number of instances that the autoscaler can scale out to. This is required when creating or updating an autoscaler. The maximum number of replicas must not be lower than minimal number of replicas.
     * 
     */
    @InputImport(name="maxNumReplicas")
      private final @Nullable Input<Integer> maxNumReplicas;

    public Input<Integer> getMaxNumReplicas() {
        return this.maxNumReplicas == null ? Input.empty() : this.maxNumReplicas;
    }

    /**
     * The minimum number of replicas that the autoscaler can scale in to. This cannot be less than 0. If not provided, autoscaler chooses a default value depending on maximum number of instances allowed.
     * 
     */
    @InputImport(name="minNumReplicas")
      private final @Nullable Input<Integer> minNumReplicas;

    public Input<Integer> getMinNumReplicas() {
        return this.minNumReplicas == null ? Input.empty() : this.minNumReplicas;
    }

    /**
     * Defines operating mode for this policy.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<AutoscalingPolicyMode> mode;

    public Input<AutoscalingPolicyMode> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    @InputImport(name="scaleDownControl")
      private final @Nullable Input<AutoscalingPolicyScaleDownControlArgs> scaleDownControl;

    public Input<AutoscalingPolicyScaleDownControlArgs> getScaleDownControl() {
        return this.scaleDownControl == null ? Input.empty() : this.scaleDownControl;
    }

    @InputImport(name="scaleInControl")
      private final @Nullable Input<AutoscalingPolicyScaleInControlArgs> scaleInControl;

    public Input<AutoscalingPolicyScaleInControlArgs> getScaleInControl() {
        return this.scaleInControl == null ? Input.empty() : this.scaleInControl;
    }

    /**
     * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler, and they can overlap. During overlapping periods the greatest min_required_replicas of all scaling schedules is applied. Up to 128 scaling schedules are allowed.
     * 
     */
    @InputImport(name="scalingSchedules")
      private final @Nullable Input<Map<String,String>> scalingSchedules;

    public Input<Map<String,String>> getScalingSchedules() {
        return this.scalingSchedules == null ? Input.empty() : this.scalingSchedules;
    }

    public AutoscalingPolicyArgs(
        @Nullable Input<Integer> coolDownPeriodSec,
        @Nullable Input<AutoscalingPolicyCpuUtilizationArgs> cpuUtilization,
        @Nullable Input<List<AutoscalingPolicyCustomMetricUtilizationArgs>> customMetricUtilizations,
        @Nullable Input<AutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization,
        @Nullable Input<Integer> maxNumReplicas,
        @Nullable Input<Integer> minNumReplicas,
        @Nullable Input<AutoscalingPolicyMode> mode,
        @Nullable Input<AutoscalingPolicyScaleDownControlArgs> scaleDownControl,
        @Nullable Input<AutoscalingPolicyScaleInControlArgs> scaleInControl,
        @Nullable Input<Map<String,String>> scalingSchedules) {
        this.coolDownPeriodSec = coolDownPeriodSec;
        this.cpuUtilization = cpuUtilization;
        this.customMetricUtilizations = customMetricUtilizations;
        this.loadBalancingUtilization = loadBalancingUtilization;
        this.maxNumReplicas = maxNumReplicas;
        this.minNumReplicas = minNumReplicas;
        this.mode = mode;
        this.scaleDownControl = scaleDownControl;
        this.scaleInControl = scaleInControl;
        this.scalingSchedules = scalingSchedules;
    }

    private AutoscalingPolicyArgs() {
        this.coolDownPeriodSec = Input.empty();
        this.cpuUtilization = Input.empty();
        this.customMetricUtilizations = Input.empty();
        this.loadBalancingUtilization = Input.empty();
        this.maxNumReplicas = Input.empty();
        this.minNumReplicas = Input.empty();
        this.mode = Input.empty();
        this.scaleDownControl = Input.empty();
        this.scaleInControl = Input.empty();
        this.scalingSchedules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> coolDownPeriodSec;
        private @Nullable Input<AutoscalingPolicyCpuUtilizationArgs> cpuUtilization;
        private @Nullable Input<List<AutoscalingPolicyCustomMetricUtilizationArgs>> customMetricUtilizations;
        private @Nullable Input<AutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization;
        private @Nullable Input<Integer> maxNumReplicas;
        private @Nullable Input<Integer> minNumReplicas;
        private @Nullable Input<AutoscalingPolicyMode> mode;
        private @Nullable Input<AutoscalingPolicyScaleDownControlArgs> scaleDownControl;
        private @Nullable Input<AutoscalingPolicyScaleInControlArgs> scaleInControl;
        private @Nullable Input<Map<String,String>> scalingSchedules;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coolDownPeriodSec = defaults.coolDownPeriodSec;
    	      this.cpuUtilization = defaults.cpuUtilization;
    	      this.customMetricUtilizations = defaults.customMetricUtilizations;
    	      this.loadBalancingUtilization = defaults.loadBalancingUtilization;
    	      this.maxNumReplicas = defaults.maxNumReplicas;
    	      this.minNumReplicas = defaults.minNumReplicas;
    	      this.mode = defaults.mode;
    	      this.scaleDownControl = defaults.scaleDownControl;
    	      this.scaleInControl = defaults.scaleInControl;
    	      this.scalingSchedules = defaults.scalingSchedules;
        }

        public Builder setCoolDownPeriodSec(@Nullable Input<Integer> coolDownPeriodSec) {
            this.coolDownPeriodSec = coolDownPeriodSec;
            return this;
        }

        public Builder setCoolDownPeriodSec(@Nullable Integer coolDownPeriodSec) {
            this.coolDownPeriodSec = Input.ofNullable(coolDownPeriodSec);
            return this;
        }

        public Builder setCpuUtilization(@Nullable Input<AutoscalingPolicyCpuUtilizationArgs> cpuUtilization) {
            this.cpuUtilization = cpuUtilization;
            return this;
        }

        public Builder setCpuUtilization(@Nullable AutoscalingPolicyCpuUtilizationArgs cpuUtilization) {
            this.cpuUtilization = Input.ofNullable(cpuUtilization);
            return this;
        }

        public Builder setCustomMetricUtilizations(@Nullable Input<List<AutoscalingPolicyCustomMetricUtilizationArgs>> customMetricUtilizations) {
            this.customMetricUtilizations = customMetricUtilizations;
            return this;
        }

        public Builder setCustomMetricUtilizations(@Nullable List<AutoscalingPolicyCustomMetricUtilizationArgs> customMetricUtilizations) {
            this.customMetricUtilizations = Input.ofNullable(customMetricUtilizations);
            return this;
        }

        public Builder setLoadBalancingUtilization(@Nullable Input<AutoscalingPolicyLoadBalancingUtilizationArgs> loadBalancingUtilization) {
            this.loadBalancingUtilization = loadBalancingUtilization;
            return this;
        }

        public Builder setLoadBalancingUtilization(@Nullable AutoscalingPolicyLoadBalancingUtilizationArgs loadBalancingUtilization) {
            this.loadBalancingUtilization = Input.ofNullable(loadBalancingUtilization);
            return this;
        }

        public Builder setMaxNumReplicas(@Nullable Input<Integer> maxNumReplicas) {
            this.maxNumReplicas = maxNumReplicas;
            return this;
        }

        public Builder setMaxNumReplicas(@Nullable Integer maxNumReplicas) {
            this.maxNumReplicas = Input.ofNullable(maxNumReplicas);
            return this;
        }

        public Builder setMinNumReplicas(@Nullable Input<Integer> minNumReplicas) {
            this.minNumReplicas = minNumReplicas;
            return this;
        }

        public Builder setMinNumReplicas(@Nullable Integer minNumReplicas) {
            this.minNumReplicas = Input.ofNullable(minNumReplicas);
            return this;
        }

        public Builder setMode(@Nullable Input<AutoscalingPolicyMode> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable AutoscalingPolicyMode mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setScaleDownControl(@Nullable Input<AutoscalingPolicyScaleDownControlArgs> scaleDownControl) {
            this.scaleDownControl = scaleDownControl;
            return this;
        }

        public Builder setScaleDownControl(@Nullable AutoscalingPolicyScaleDownControlArgs scaleDownControl) {
            this.scaleDownControl = Input.ofNullable(scaleDownControl);
            return this;
        }

        public Builder setScaleInControl(@Nullable Input<AutoscalingPolicyScaleInControlArgs> scaleInControl) {
            this.scaleInControl = scaleInControl;
            return this;
        }

        public Builder setScaleInControl(@Nullable AutoscalingPolicyScaleInControlArgs scaleInControl) {
            this.scaleInControl = Input.ofNullable(scaleInControl);
            return this;
        }

        public Builder setScalingSchedules(@Nullable Input<Map<String,String>> scalingSchedules) {
            this.scalingSchedules = scalingSchedules;
            return this;
        }

        public Builder setScalingSchedules(@Nullable Map<String,String> scalingSchedules) {
            this.scalingSchedules = Input.ofNullable(scalingSchedules);
            return this;
        }
        public AutoscalingPolicyArgs build() {
            return new AutoscalingPolicyArgs(coolDownPeriodSec, cpuUtilization, customMetricUtilizations, loadBalancingUtilization, maxNumReplicas, minNumReplicas, mode, scaleDownControl, scaleInControl, scalingSchedules);
        }
    }
}
