// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.monitoring.inputs.SloRequestBasedSliDistributionCutArgs;
import io.pulumi.gcp.monitoring.inputs.SloRequestBasedSliGoodTotalRatioArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloRequestBasedSliArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloRequestBasedSliArgs Empty = new SloRequestBasedSliArgs();

    /**
     * Used when good_service is defined by a count of values aggregated in a
     * Distribution that fall into a good range. The total_service is the
     * total count of all values aggregated in the Distribution.
     * Defines a distribution TimeSeries filter and thresholds used for
     * measuring good service and total service.
     * Structure is documented below.
     * 
     */
    @Import(name="distributionCut")
      private final @Nullable Output<SloRequestBasedSliDistributionCutArgs> distributionCut;

    public Output<SloRequestBasedSliDistributionCutArgs> getDistributionCut() {
        return this.distributionCut == null ? Output.empty() : this.distributionCut;
    }

    /**
     * A means to compute a ratio of `good_service` to `total_service`.
     * Defines computing this ratio with two TimeSeries [monitoring filters](https://cloud.google.com/monitoring/api/v3/filters)
     * Must specify exactly two of good, bad, and total service filters.
     * The relationship good_service + bad_service = total_service
     * will be assumed.
     * Structure is documented below.
     * 
     */
    @Import(name="goodTotalRatio")
      private final @Nullable Output<SloRequestBasedSliGoodTotalRatioArgs> goodTotalRatio;

    public Output<SloRequestBasedSliGoodTotalRatioArgs> getGoodTotalRatio() {
        return this.goodTotalRatio == null ? Output.empty() : this.goodTotalRatio;
    }

    public SloRequestBasedSliArgs(
        @Nullable Output<SloRequestBasedSliDistributionCutArgs> distributionCut,
        @Nullable Output<SloRequestBasedSliGoodTotalRatioArgs> goodTotalRatio) {
        this.distributionCut = distributionCut;
        this.goodTotalRatio = goodTotalRatio;
    }

    private SloRequestBasedSliArgs() {
        this.distributionCut = Output.empty();
        this.goodTotalRatio = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloRequestBasedSliArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SloRequestBasedSliDistributionCutArgs> distributionCut;
        private @Nullable Output<SloRequestBasedSliGoodTotalRatioArgs> goodTotalRatio;

        public Builder() {
    	      // Empty
        }

        public Builder(SloRequestBasedSliArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionCut = defaults.distributionCut;
    	      this.goodTotalRatio = defaults.goodTotalRatio;
        }

        public Builder distributionCut(@Nullable Output<SloRequestBasedSliDistributionCutArgs> distributionCut) {
            this.distributionCut = distributionCut;
            return this;
        }

        public Builder distributionCut(@Nullable SloRequestBasedSliDistributionCutArgs distributionCut) {
            this.distributionCut = Output.ofNullable(distributionCut);
            return this;
        }

        public Builder goodTotalRatio(@Nullable Output<SloRequestBasedSliGoodTotalRatioArgs> goodTotalRatio) {
            this.goodTotalRatio = goodTotalRatio;
            return this;
        }

        public Builder goodTotalRatio(@Nullable SloRequestBasedSliGoodTotalRatioArgs goodTotalRatio) {
            this.goodTotalRatio = Output.ofNullable(goodTotalRatio);
            return this;
        }
        public SloRequestBasedSliArgs build() {
            return new SloRequestBasedSliArgs(distributionCut, goodTotalRatio);
        }
    }
}
