// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.monitoring.inputs.SloRequestBasedSliDistributionCutRangeArgs;
import java.lang.String;
import java.util.Objects;


public final class SloRequestBasedSliDistributionCutArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloRequestBasedSliDistributionCutArgs Empty = new SloRequestBasedSliDistributionCutArgs();

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * aggregating values to quantify the good service provided.
     * Must have ValueType = DISTRIBUTION and
     * MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="distributionFilter", required=true)
      private final Output<String> distributionFilter;

    public Output<String> distributionFilter() {
        return this.distributionFilter;
    }

    /**
     * Range of numerical values. The computed good_service
     * will be the count of values x in the Distribution such
     * that range.min <= x <= range.max. inclusive of min and
     * max. Open ranges can be defined by setting
     * just one of min or max. Summed value `X` should satisfy
     * `range.min <= X <= range.max` for a good window.
     * Structure is documented below.
     * 
     */
    @Import(name="range", required=true)
      private final Output<SloRequestBasedSliDistributionCutRangeArgs> range;

    public Output<SloRequestBasedSliDistributionCutRangeArgs> range() {
        return this.range;
    }

    public SloRequestBasedSliDistributionCutArgs(
        Output<String> distributionFilter,
        Output<SloRequestBasedSliDistributionCutRangeArgs> range) {
        this.distributionFilter = Objects.requireNonNull(distributionFilter, "expected parameter 'distributionFilter' to be non-null");
        this.range = Objects.requireNonNull(range, "expected parameter 'range' to be non-null");
    }

    private SloRequestBasedSliDistributionCutArgs() {
        this.distributionFilter = Codegen.empty();
        this.range = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloRequestBasedSliDistributionCutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> distributionFilter;
        private Output<SloRequestBasedSliDistributionCutRangeArgs> range;

        public Builder() {
    	      // Empty
        }

        public Builder(SloRequestBasedSliDistributionCutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionFilter = defaults.distributionFilter;
    	      this.range = defaults.range;
        }

        public Builder distributionFilter(Output<String> distributionFilter) {
            this.distributionFilter = Objects.requireNonNull(distributionFilter);
            return this;
        }
        public Builder distributionFilter(String distributionFilter) {
            this.distributionFilter = Output.of(Objects.requireNonNull(distributionFilter));
            return this;
        }
        public Builder range(Output<SloRequestBasedSliDistributionCutRangeArgs> range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }
        public Builder range(SloRequestBasedSliDistributionCutRangeArgs range) {
            this.range = Output.of(Objects.requireNonNull(range));
            return this;
        }        public SloRequestBasedSliDistributionCutArgs build() {
            return new SloRequestBasedSliDistributionCutArgs(distributionFilter, range);
        }
    }
}
