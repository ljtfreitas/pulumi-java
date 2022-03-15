// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


/**
 * Configuration parameters of autoscaling based on load balancing.
 * 
 */
public final class AutoscalingPolicyLoadBalancingUtilizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoscalingPolicyLoadBalancingUtilizationResponse Empty = new AutoscalingPolicyLoadBalancingUtilizationResponse();

    /**
     * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @Import(name="utilizationTarget", required=true)
      private final Double utilizationTarget;

    public Double getUtilizationTarget() {
        return this.utilizationTarget;
    }

    public AutoscalingPolicyLoadBalancingUtilizationResponse(Double utilizationTarget) {
        this.utilizationTarget = Objects.requireNonNull(utilizationTarget, "expected parameter 'utilizationTarget' to be non-null");
    }

    private AutoscalingPolicyLoadBalancingUtilizationResponse() {
        this.utilizationTarget = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyLoadBalancingUtilizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double utilizationTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyLoadBalancingUtilizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.utilizationTarget = defaults.utilizationTarget;
        }

        public Builder utilizationTarget(Double utilizationTarget) {
            this.utilizationTarget = Objects.requireNonNull(utilizationTarget);
            return this;
        }
        public AutoscalingPolicyLoadBalancingUtilizationResponse build() {
            return new AutoscalingPolicyLoadBalancingUtilizationResponse(utilizationTarget);
        }
    }
}
