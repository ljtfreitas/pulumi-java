// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Target scaling by CPU usage.
 * 
 */
public final class CpuUtilizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CpuUtilizationArgs Empty = new CpuUtilizationArgs();

    /**
     * Period of time over which CPU utilization is calculated.
     * 
     */
    @InputImport(name="aggregationWindowLength")
      private final @Nullable Input<String> aggregationWindowLength;

    public Input<String> getAggregationWindowLength() {
        return this.aggregationWindowLength == null ? Input.empty() : this.aggregationWindowLength;
    }

    /**
     * Target CPU utilization ratio to maintain when scaling. Must be between 0 and 1.
     * 
     */
    @InputImport(name="targetUtilization")
      private final @Nullable Input<Double> targetUtilization;

    public Input<Double> getTargetUtilization() {
        return this.targetUtilization == null ? Input.empty() : this.targetUtilization;
    }

    public CpuUtilizationArgs(
        @Nullable Input<String> aggregationWindowLength,
        @Nullable Input<Double> targetUtilization) {
        this.aggregationWindowLength = aggregationWindowLength;
        this.targetUtilization = targetUtilization;
    }

    private CpuUtilizationArgs() {
        this.aggregationWindowLength = Input.empty();
        this.targetUtilization = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CpuUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> aggregationWindowLength;
        private @Nullable Input<Double> targetUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(CpuUtilizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationWindowLength = defaults.aggregationWindowLength;
    	      this.targetUtilization = defaults.targetUtilization;
        }

        public Builder setAggregationWindowLength(@Nullable Input<String> aggregationWindowLength) {
            this.aggregationWindowLength = aggregationWindowLength;
            return this;
        }

        public Builder setAggregationWindowLength(@Nullable String aggregationWindowLength) {
            this.aggregationWindowLength = Input.ofNullable(aggregationWindowLength);
            return this;
        }

        public Builder setTargetUtilization(@Nullable Input<Double> targetUtilization) {
            this.targetUtilization = targetUtilization;
            return this;
        }

        public Builder setTargetUtilization(@Nullable Double targetUtilization) {
            this.targetUtilization = Input.ofNullable(targetUtilization);
            return this;
        }
        public CpuUtilizationArgs build() {
            return new CpuUtilizationArgs(aggregationWindowLength, targetUtilization);
        }
    }
}
