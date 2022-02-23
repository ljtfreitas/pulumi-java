// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.inputs.GoogleMonitoringV3RangeArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A DistributionCut defines a TimeSeries and thresholds used for measuring good service and total service. The TimeSeries must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind = CUMULATIVE. The computed good_service will be the estimated count of values in the Distribution that fall within the specified min and max.
 * 
 */
public final class DistributionCutArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionCutArgs Empty = new DistributionCutArgs();

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries aggregating values. Must have ValueType = DISTRIBUTION and MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @InputImport(name="distributionFilter")
      private final @Nullable Input<String> distributionFilter;

    public Input<String> getDistributionFilter() {
        return this.distributionFilter == null ? Input.empty() : this.distributionFilter;
    }

    /**
     * Range of values considered "good." For a one-sided range, set one bound to an infinite value.
     * 
     */
    @InputImport(name="range")
      private final @Nullable Input<GoogleMonitoringV3RangeArgs> range;

    public Input<GoogleMonitoringV3RangeArgs> getRange() {
        return this.range == null ? Input.empty() : this.range;
    }

    public DistributionCutArgs(
        @Nullable Input<String> distributionFilter,
        @Nullable Input<GoogleMonitoringV3RangeArgs> range) {
        this.distributionFilter = distributionFilter;
        this.range = range;
    }

    private DistributionCutArgs() {
        this.distributionFilter = Input.empty();
        this.range = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionCutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> distributionFilter;
        private @Nullable Input<GoogleMonitoringV3RangeArgs> range;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionCutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionFilter = defaults.distributionFilter;
    	      this.range = defaults.range;
        }

        public Builder setDistributionFilter(@Nullable Input<String> distributionFilter) {
            this.distributionFilter = distributionFilter;
            return this;
        }

        public Builder setDistributionFilter(@Nullable String distributionFilter) {
            this.distributionFilter = Input.ofNullable(distributionFilter);
            return this;
        }

        public Builder setRange(@Nullable Input<GoogleMonitoringV3RangeArgs> range) {
            this.range = range;
            return this;
        }

        public Builder setRange(@Nullable GoogleMonitoringV3RangeArgs range) {
            this.range = Input.ofNullable(range);
            return this;
        }
        public DistributionCutArgs build() {
            return new DistributionCutArgs(distributionFilter, range);
        }
    }
}
