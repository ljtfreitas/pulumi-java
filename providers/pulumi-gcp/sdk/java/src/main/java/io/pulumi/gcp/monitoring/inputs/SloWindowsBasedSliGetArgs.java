// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliGoodTotalRatioThresholdGetArgs;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricMeanInRangeGetArgs;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricSumInRangeGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloWindowsBasedSliGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloWindowsBasedSliGetArgs Empty = new SloWindowsBasedSliGetArgs();

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * with ValueType = BOOL. The window is good if any true values
     * appear in the window. One of `good_bad_metric_filter`,
     * `good_total_ratio_threshold`, `metric_mean_in_range`,
     * `metric_sum_in_range` must be set for `windows_based_sli`.
     * 
     */
    @Import(name="goodBadMetricFilter")
      private final @Nullable Output<String> goodBadMetricFilter;

    public Output<String> getGoodBadMetricFilter() {
        return this.goodBadMetricFilter == null ? Output.empty() : this.goodBadMetricFilter;
    }

    /**
     * Criterion that describes a window as good if its performance is
     * high enough. One of `good_bad_metric_filter`,
     * `good_total_ratio_threshold`, `metric_mean_in_range`,
     * `metric_sum_in_range` must be set for `windows_based_sli`.
     * Structure is documented below.
     * 
     */
    @Import(name="goodTotalRatioThreshold")
      private final @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdGetArgs> goodTotalRatioThreshold;

    public Output<SloWindowsBasedSliGoodTotalRatioThresholdGetArgs> getGoodTotalRatioThreshold() {
        return this.goodTotalRatioThreshold == null ? Output.empty() : this.goodTotalRatioThreshold;
    }

    /**
     * Criterion that describes a window as good if the metric's value
     * is in a good range, *averaged* across returned streams.
     * One of `good_bad_metric_filter`,
     * `good_total_ratio_threshold`, `metric_mean_in_range`,
     * `metric_sum_in_range` must be set for `windows_based_sli`.
     * Average value X of `time_series` should satisfy
     * `range.min <= X <= range.max` for a good window.
     * Structure is documented below.
     * 
     */
    @Import(name="metricMeanInRange")
      private final @Nullable Output<SloWindowsBasedSliMetricMeanInRangeGetArgs> metricMeanInRange;

    public Output<SloWindowsBasedSliMetricMeanInRangeGetArgs> getMetricMeanInRange() {
        return this.metricMeanInRange == null ? Output.empty() : this.metricMeanInRange;
    }

    /**
     * Criterion that describes a window as good if the metric's value
     * is in a good range, *summed* across returned streams.
     * Summed value `X` of `time_series` should satisfy
     * `range.min <= X <= range.max` for a good window.
     * One of `good_bad_metric_filter`,
     * `good_total_ratio_threshold`, `metric_mean_in_range`,
     * `metric_sum_in_range` must be set for `windows_based_sli`.
     * Structure is documented below.
     * 
     */
    @Import(name="metricSumInRange")
      private final @Nullable Output<SloWindowsBasedSliMetricSumInRangeGetArgs> metricSumInRange;

    public Output<SloWindowsBasedSliMetricSumInRangeGetArgs> getMetricSumInRange() {
        return this.metricSumInRange == null ? Output.empty() : this.metricSumInRange;
    }

    /**
     * Duration over which window quality is evaluated, given as a
     * duration string "{X}s" representing X seconds. Must be an
     * integer fraction of a day and at least 60s.
     * 
     */
    @Import(name="windowPeriod")
      private final @Nullable Output<String> windowPeriod;

    public Output<String> getWindowPeriod() {
        return this.windowPeriod == null ? Output.empty() : this.windowPeriod;
    }

    public SloWindowsBasedSliGetArgs(
        @Nullable Output<String> goodBadMetricFilter,
        @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdGetArgs> goodTotalRatioThreshold,
        @Nullable Output<SloWindowsBasedSliMetricMeanInRangeGetArgs> metricMeanInRange,
        @Nullable Output<SloWindowsBasedSliMetricSumInRangeGetArgs> metricSumInRange,
        @Nullable Output<String> windowPeriod) {
        this.goodBadMetricFilter = goodBadMetricFilter;
        this.goodTotalRatioThreshold = goodTotalRatioThreshold;
        this.metricMeanInRange = metricMeanInRange;
        this.metricSumInRange = metricSumInRange;
        this.windowPeriod = windowPeriod;
    }

    private SloWindowsBasedSliGetArgs() {
        this.goodBadMetricFilter = Output.empty();
        this.goodTotalRatioThreshold = Output.empty();
        this.metricMeanInRange = Output.empty();
        this.metricSumInRange = Output.empty();
        this.windowPeriod = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> goodBadMetricFilter;
        private @Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdGetArgs> goodTotalRatioThreshold;
        private @Nullable Output<SloWindowsBasedSliMetricMeanInRangeGetArgs> metricMeanInRange;
        private @Nullable Output<SloWindowsBasedSliMetricSumInRangeGetArgs> metricSumInRange;
        private @Nullable Output<String> windowPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.goodBadMetricFilter = defaults.goodBadMetricFilter;
    	      this.goodTotalRatioThreshold = defaults.goodTotalRatioThreshold;
    	      this.metricMeanInRange = defaults.metricMeanInRange;
    	      this.metricSumInRange = defaults.metricSumInRange;
    	      this.windowPeriod = defaults.windowPeriod;
        }

        public Builder goodBadMetricFilter(@Nullable Output<String> goodBadMetricFilter) {
            this.goodBadMetricFilter = goodBadMetricFilter;
            return this;
        }

        public Builder goodBadMetricFilter(@Nullable String goodBadMetricFilter) {
            this.goodBadMetricFilter = Output.ofNullable(goodBadMetricFilter);
            return this;
        }

        public Builder goodTotalRatioThreshold(@Nullable Output<SloWindowsBasedSliGoodTotalRatioThresholdGetArgs> goodTotalRatioThreshold) {
            this.goodTotalRatioThreshold = goodTotalRatioThreshold;
            return this;
        }

        public Builder goodTotalRatioThreshold(@Nullable SloWindowsBasedSliGoodTotalRatioThresholdGetArgs goodTotalRatioThreshold) {
            this.goodTotalRatioThreshold = Output.ofNullable(goodTotalRatioThreshold);
            return this;
        }

        public Builder metricMeanInRange(@Nullable Output<SloWindowsBasedSliMetricMeanInRangeGetArgs> metricMeanInRange) {
            this.metricMeanInRange = metricMeanInRange;
            return this;
        }

        public Builder metricMeanInRange(@Nullable SloWindowsBasedSliMetricMeanInRangeGetArgs metricMeanInRange) {
            this.metricMeanInRange = Output.ofNullable(metricMeanInRange);
            return this;
        }

        public Builder metricSumInRange(@Nullable Output<SloWindowsBasedSliMetricSumInRangeGetArgs> metricSumInRange) {
            this.metricSumInRange = metricSumInRange;
            return this;
        }

        public Builder metricSumInRange(@Nullable SloWindowsBasedSliMetricSumInRangeGetArgs metricSumInRange) {
            this.metricSumInRange = Output.ofNullable(metricSumInRange);
            return this;
        }

        public Builder windowPeriod(@Nullable Output<String> windowPeriod) {
            this.windowPeriod = windowPeriod;
            return this;
        }

        public Builder windowPeriod(@Nullable String windowPeriod) {
            this.windowPeriod = Output.ofNullable(windowPeriod);
            return this;
        }
        public SloWindowsBasedSliGetArgs build() {
            return new SloWindowsBasedSliGetArgs(goodBadMetricFilter, goodTotalRatioThreshold, metricMeanInRange, metricSumInRange, windowPeriod);
        }
    }
}
