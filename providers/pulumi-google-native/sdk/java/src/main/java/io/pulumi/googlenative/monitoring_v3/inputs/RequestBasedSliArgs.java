// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.inputs.DistributionCutArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.TimeSeriesRatioArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Service Level Indicators for which atomic units of service are counted directly.
 * 
 */
public final class RequestBasedSliArgs extends io.pulumi.resources.ResourceArgs {

    public static final RequestBasedSliArgs Empty = new RequestBasedSliArgs();

    /**
     * distribution_cut is used when good_service is a count of values aggregated in a Distribution that fall into a good range. The total_service is the total count of all values aggregated in the Distribution.
     * 
     */
    @InputImport(name="distributionCut")
      private final @Nullable Input<DistributionCutArgs> distributionCut;

    public Input<DistributionCutArgs> getDistributionCut() {
        return this.distributionCut == null ? Input.empty() : this.distributionCut;
    }

    /**
     * good_total_ratio is used when the ratio of good_service to total_service is computed from two TimeSeries.
     * 
     */
    @InputImport(name="goodTotalRatio")
      private final @Nullable Input<TimeSeriesRatioArgs> goodTotalRatio;

    public Input<TimeSeriesRatioArgs> getGoodTotalRatio() {
        return this.goodTotalRatio == null ? Input.empty() : this.goodTotalRatio;
    }

    public RequestBasedSliArgs(
        @Nullable Input<DistributionCutArgs> distributionCut,
        @Nullable Input<TimeSeriesRatioArgs> goodTotalRatio) {
        this.distributionCut = distributionCut;
        this.goodTotalRatio = goodTotalRatio;
    }

    private RequestBasedSliArgs() {
        this.distributionCut = Input.empty();
        this.goodTotalRatio = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestBasedSliArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DistributionCutArgs> distributionCut;
        private @Nullable Input<TimeSeriesRatioArgs> goodTotalRatio;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestBasedSliArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionCut = defaults.distributionCut;
    	      this.goodTotalRatio = defaults.goodTotalRatio;
        }

        public Builder setDistributionCut(@Nullable Input<DistributionCutArgs> distributionCut) {
            this.distributionCut = distributionCut;
            return this;
        }

        public Builder setDistributionCut(@Nullable DistributionCutArgs distributionCut) {
            this.distributionCut = Input.ofNullable(distributionCut);
            return this;
        }

        public Builder setGoodTotalRatio(@Nullable Input<TimeSeriesRatioArgs> goodTotalRatio) {
            this.goodTotalRatio = goodTotalRatio;
            return this;
        }

        public Builder setGoodTotalRatio(@Nullable TimeSeriesRatioArgs goodTotalRatio) {
            this.goodTotalRatio = Input.ofNullable(goodTotalRatio);
            return this;
        }
        public RequestBasedSliArgs build() {
            return new RequestBasedSliArgs(distributionCut, goodTotalRatio);
        }
    }
}
