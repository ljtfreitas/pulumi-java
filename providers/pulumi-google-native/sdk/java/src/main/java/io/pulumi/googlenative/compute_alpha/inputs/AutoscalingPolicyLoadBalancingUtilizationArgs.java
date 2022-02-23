// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration parameters of autoscaling based on load balancing.
 * 
 */
public final class AutoscalingPolicyLoadBalancingUtilizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyLoadBalancingUtilizationArgs Empty = new AutoscalingPolicyLoadBalancingUtilizationArgs();

    /**
     * Fraction of backend capacity utilization (set in HTTP(S) load balancing configuration) that the autoscaler maintains. Must be a positive float value. If not defined, the default is 0.8.
     * 
     */
    @InputImport(name="utilizationTarget")
      private final @Nullable Input<Double> utilizationTarget;

    public Input<Double> getUtilizationTarget() {
        return this.utilizationTarget == null ? Input.empty() : this.utilizationTarget;
    }

    public AutoscalingPolicyLoadBalancingUtilizationArgs(@Nullable Input<Double> utilizationTarget) {
        this.utilizationTarget = utilizationTarget;
    }

    private AutoscalingPolicyLoadBalancingUtilizationArgs() {
        this.utilizationTarget = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyLoadBalancingUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> utilizationTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyLoadBalancingUtilizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.utilizationTarget = defaults.utilizationTarget;
        }

        public Builder setUtilizationTarget(@Nullable Input<Double> utilizationTarget) {
            this.utilizationTarget = utilizationTarget;
            return this;
        }

        public Builder setUtilizationTarget(@Nullable Double utilizationTarget) {
            this.utilizationTarget = Input.ofNullable(utilizationTarget);
            return this;
        }
        public AutoscalingPolicyLoadBalancingUtilizationArgs build() {
            return new AutoscalingPolicyLoadBalancingUtilizationArgs(utilizationTarget);
        }
    }
}
