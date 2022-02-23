// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.FixedOrPercentResponse;
import io.pulumi.googlenative.compute_alpha.inputs.InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class InstanceGroupManagerAutoHealingPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerAutoHealingPolicyResponse Empty = new InstanceGroupManagerAutoHealingPolicyResponse();

    /**
     * Restricts what triggers autohealing.
     * 
     */
    @InputImport(name="autoHealingTriggers", required=true)
      private final InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse autoHealingTriggers;

    public InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse getAutoHealingTriggers() {
        return this.autoHealingTriggers;
    }

    /**
     * The URL for the health check that signals autohealing.
     * 
     */
    @InputImport(name="healthCheck", required=true)
      private final String healthCheck;

    public String getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * The number of seconds that the managed instance group waits before it applies autohealing policies to new instances or recently recreated instances. This initial delay allows instances to initialize and run their startup scripts before the instance group determines that they are UNHEALTHY. This prevents the managed instance group from recreating its instances prematurely. This value must be from range [0, 3600].
     * 
     */
    @InputImport(name="initialDelaySec", required=true)
      private final Integer initialDelaySec;

    public Integer getInitialDelaySec() {
        return this.initialDelaySec;
    }

    /**
     * Maximum number of instances that can be unavailable when autohealing. When 'percent' is used, the value is rounded if necessary. The instance is considered available if all of the following conditions are satisfied: 1. Instance's status is RUNNING. 2. Instance's currentAction is NONE (in particular its liveness health check result was observed to be HEALTHY at least once as it passed VERIFYING). 3. There is no outgoing action on an instance triggered by IGM. By default, number of concurrently autohealed instances is smaller than the managed instance group target size. However, if a zonal managed instance group has only one instance, or a regional managed instance group has only one instance per zone, autohealing will recreate these instances when they become unhealthy.
     * 
     */
    @InputImport(name="maxUnavailable", required=true)
      private final FixedOrPercentResponse maxUnavailable;

    public FixedOrPercentResponse getMaxUnavailable() {
        return this.maxUnavailable;
    }

    @InputImport(name="updateInstances", required=true)
      private final String updateInstances;

    public String getUpdateInstances() {
        return this.updateInstances;
    }

    public InstanceGroupManagerAutoHealingPolicyResponse(
        InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse autoHealingTriggers,
        String healthCheck,
        Integer initialDelaySec,
        FixedOrPercentResponse maxUnavailable,
        String updateInstances) {
        this.autoHealingTriggers = Objects.requireNonNull(autoHealingTriggers, "expected parameter 'autoHealingTriggers' to be non-null");
        this.healthCheck = Objects.requireNonNull(healthCheck, "expected parameter 'healthCheck' to be non-null");
        this.initialDelaySec = Objects.requireNonNull(initialDelaySec, "expected parameter 'initialDelaySec' to be non-null");
        this.maxUnavailable = Objects.requireNonNull(maxUnavailable, "expected parameter 'maxUnavailable' to be non-null");
        this.updateInstances = Objects.requireNonNull(updateInstances, "expected parameter 'updateInstances' to be non-null");
    }

    private InstanceGroupManagerAutoHealingPolicyResponse() {
        this.autoHealingTriggers = null;
        this.healthCheck = null;
        this.initialDelaySec = null;
        this.maxUnavailable = null;
        this.updateInstances = null;
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

        public Builder setAutoHealingTriggers(InstanceGroupManagerAutoHealingPolicyAutoHealingTriggersResponse autoHealingTriggers) {
            this.autoHealingTriggers = Objects.requireNonNull(autoHealingTriggers);
            return this;
        }

        public Builder setHealthCheck(String healthCheck) {
            this.healthCheck = Objects.requireNonNull(healthCheck);
            return this;
        }

        public Builder setInitialDelaySec(Integer initialDelaySec) {
            this.initialDelaySec = Objects.requireNonNull(initialDelaySec);
            return this;
        }

        public Builder setMaxUnavailable(FixedOrPercentResponse maxUnavailable) {
            this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
            return this;
        }

        public Builder setUpdateInstances(String updateInstances) {
            this.updateInstances = Objects.requireNonNull(updateInstances);
            return this;
        }
        public InstanceGroupManagerAutoHealingPolicyResponse build() {
            return new InstanceGroupManagerAutoHealingPolicyResponse(autoHealingTriggers, healthCheck, initialDelaySec, maxUnavailable, updateInstances);
        }
    }
}
