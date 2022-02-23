// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class RegionInstanceGroupManagerAutoHealingPoliciesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerAutoHealingPoliciesGetArgs Empty = new RegionInstanceGroupManagerAutoHealingPoliciesGetArgs();

    /**
     * The health check resource that signals autohealing.
     * 
     */
    @InputImport(name="healthCheck", required=true)
        private final Input<String> healthCheck;

    public Input<String> getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * The number of seconds that the managed instance group waits before
     * it applies autohealing policies to new instances or recently recreated instances. Between 0 and 3600.
     * 
     */
    @InputImport(name="initialDelaySec", required=true)
        private final Input<Integer> initialDelaySec;

    public Input<Integer> getInitialDelaySec() {
        return this.initialDelaySec;
    }

    public RegionInstanceGroupManagerAutoHealingPoliciesGetArgs(
        Input<String> healthCheck,
        Input<Integer> initialDelaySec) {
        this.healthCheck = Objects.requireNonNull(healthCheck, "expected parameter 'healthCheck' to be non-null");
        this.initialDelaySec = Objects.requireNonNull(initialDelaySec, "expected parameter 'initialDelaySec' to be non-null");
    }

    private RegionInstanceGroupManagerAutoHealingPoliciesGetArgs() {
        this.healthCheck = Input.empty();
        this.initialDelaySec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerAutoHealingPoliciesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> healthCheck;
        private Input<Integer> initialDelaySec;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerAutoHealingPoliciesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheck = defaults.healthCheck;
    	      this.initialDelaySec = defaults.initialDelaySec;
        }

        public Builder setHealthCheck(Input<String> healthCheck) {
            this.healthCheck = Objects.requireNonNull(healthCheck);
            return this;
        }

        public Builder setHealthCheck(String healthCheck) {
            this.healthCheck = Input.of(Objects.requireNonNull(healthCheck));
            return this;
        }

        public Builder setInitialDelaySec(Input<Integer> initialDelaySec) {
            this.initialDelaySec = Objects.requireNonNull(initialDelaySec);
            return this;
        }

        public Builder setInitialDelaySec(Integer initialDelaySec) {
            this.initialDelaySec = Input.of(Objects.requireNonNull(initialDelaySec));
            return this;
        }
        public RegionInstanceGroupManagerAutoHealingPoliciesGetArgs build() {
            return new RegionInstanceGroupManagerAutoHealingPoliciesGetArgs(healthCheck, initialDelaySec);
        }
    }
}
