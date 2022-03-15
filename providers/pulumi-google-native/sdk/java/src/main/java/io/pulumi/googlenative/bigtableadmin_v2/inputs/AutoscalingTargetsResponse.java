// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * The Autoscaling targets for a Cluster. These determine the recommended nodes.
 * 
 */
public final class AutoscalingTargetsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutoscalingTargetsResponse Empty = new AutoscalingTargetsResponse();

    /**
     * The cpu utilization that the Autoscaler should be trying to achieve. This number is on a scale from 0 (no utilization) to 100 (total utilization), and is limited between 10 and 80.
     * 
     */
    @Import(name="cpuUtilizationPercent", required=true)
      private final Integer cpuUtilizationPercent;

    public Integer getCpuUtilizationPercent() {
        return this.cpuUtilizationPercent;
    }

    public AutoscalingTargetsResponse(Integer cpuUtilizationPercent) {
        this.cpuUtilizationPercent = Objects.requireNonNull(cpuUtilizationPercent, "expected parameter 'cpuUtilizationPercent' to be non-null");
    }

    private AutoscalingTargetsResponse() {
        this.cpuUtilizationPercent = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingTargetsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cpuUtilizationPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingTargetsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuUtilizationPercent = defaults.cpuUtilizationPercent;
        }

        public Builder cpuUtilizationPercent(Integer cpuUtilizationPercent) {
            this.cpuUtilizationPercent = Objects.requireNonNull(cpuUtilizationPercent);
            return this;
        }
        public AutoscalingTargetsResponse build() {
            return new AutoscalingTargetsResponse(cpuUtilizationPercent);
        }
    }
}
