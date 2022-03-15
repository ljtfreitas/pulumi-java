// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_alpha.outputs.FixedOrPercentResponse;
import io.pulumi.googlenative.compute_alpha.outputs.InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceGroupManagerAutoHealingPolicyResponse {
    /**
     * Restricts what triggers autohealing.
     * 
     */
    private final InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse autoHealingTriggers;
    /**
     * The URL for the health check that signals autohealing.
     * 
     */
    private final String healthCheck;
    /**
     * The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
     * 
     */
    private final Integer initialDelaySec;
    /**
     * Maximum number of instances that can be unavailable when autohealing. When 'percent' is used, the value is rounded if necessary. The instance is considered available if all of the following conditions are satisfied: 1. Instance's status is RUNNING. 2. Instance's currentAction is NONE (in particular its liveness health check result was observed to be HEALTHY at least once as it passed VERIFYING). 3. There is no outgoing action on an instance triggered by IGM. By default, number of concurrently autohealed instances is smaller than the managed instance group target size. However, if a zonal managed instance group has only one instance, or a regional managed instance group has only one instance per zone, autohealing will recreate these instances when they become unhealthy.
     * 
     */
    private final FixedOrPercentResponse maxUnavailable;
    private final String updateInstances;

    @CustomType.Constructor
    private InstanceGroupManagerAutoHealingPolicyResponse(
        @CustomType.Parameter("autoHealingTriggers") InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse autoHealingTriggers,
        @CustomType.Parameter("healthCheck") String healthCheck,
        @CustomType.Parameter("initialDelaySec") Integer initialDelaySec,
        @CustomType.Parameter("maxUnavailable") FixedOrPercentResponse maxUnavailable,
        @CustomType.Parameter("updateInstances") String updateInstances) {
        this.autoHealingTriggers = autoHealingTriggers;
        this.healthCheck = healthCheck;
        this.initialDelaySec = initialDelaySec;
        this.maxUnavailable = maxUnavailable;
        this.updateInstances = updateInstances;
    }

    /**
     * Restricts what triggers autohealing.
     * 
    */
    public InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse getAutoHealingTriggers() {
        return this.autoHealingTriggers;
    }
    /**
     * The URL for the health check that signals autohealing.
     * 
    */
    public String getHealthCheck() {
        return this.healthCheck;
    }
    /**
     * The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
     * 
    */
    public Integer getInitialDelaySec() {
        return this.initialDelaySec;
    }
    /**
     * Maximum number of instances that can be unavailable when autohealing. When 'percent' is used, the value is rounded if necessary. The instance is considered available if all of the following conditions are satisfied: 1. Instance's status is RUNNING. 2. Instance's currentAction is NONE (in particular its liveness health check result was observed to be HEALTHY at least once as it passed VERIFYING). 3. There is no outgoing action on an instance triggered by IGM. By default, number of concurrently autohealed instances is smaller than the managed instance group target size. However, if a zonal managed instance group has only one instance, or a regional managed instance group has only one instance per zone, autohealing will recreate these instances when they become unhealthy.
     * 
    */
    public FixedOrPercentResponse getMaxUnavailable() {
        return this.maxUnavailable;
    }
    public String getUpdateInstances() {
        return this.updateInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerAutoHealingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse autoHealingTriggers;
        private String healthCheck;
        private Integer initialDelaySec;
        private FixedOrPercentResponse maxUnavailable;
        private String updateInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerAutoHealingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoHealingTriggers = defaults.autoHealingTriggers;
    	      this.healthCheck = defaults.healthCheck;
    	      this.initialDelaySec = defaults.initialDelaySec;
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.updateInstances = defaults.updateInstances;
        }

        public Builder autoHealingTriggers(InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse autoHealingTriggers) {
            this.autoHealingTriggers = Objects.requireNonNull(autoHealingTriggers);
            return this;
        }

        public Builder healthCheck(String healthCheck) {
            this.healthCheck = Objects.requireNonNull(healthCheck);
            return this;
        }

        public Builder initialDelaySec(Integer initialDelaySec) {
            this.initialDelaySec = Objects.requireNonNull(initialDelaySec);
            return this;
        }

        public Builder maxUnavailable(FixedOrPercentResponse maxUnavailable) {
            this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
            return this;
        }

        public Builder updateInstances(String updateInstances) {
            this.updateInstances = Objects.requireNonNull(updateInstances);
            return this;
        }
        public InstanceGroupManagerAutoHealingPolicyResponse build() {
            return new InstanceGroupManagerAutoHealingPolicyResponse(autoHealingTriggers, healthCheck, initialDelaySec, maxUnavailable, updateInstances);
        }
    }
}
