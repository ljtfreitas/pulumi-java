// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.monitoring_v3.inputs.MetricRangeArgs;
import io.pulumi.googlenative.monitoring_v3.inputs.PerformanceThresholdArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A WindowsBasedSli defines good_service as the count of time windows for which the provided service was of good quality. Criteria for determining if service was good are embedded in the window_criterion.
 * 
 */
public final class WindowsBasedSliArgs extends io.pulumi.resources.ResourceArgs {

    public static final WindowsBasedSliArgs Empty = new WindowsBasedSliArgs();

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries with ValueType = BOOL. The window is good if any true values appear in the window.
     * 
     */
    @Import(name="goodBadMetricFilter")
      private final @Nullable Output<String> goodBadMetricFilter;

    public Output<String> getGoodBadMetricFilter() {
        return this.goodBadMetricFilter == null ? Output.empty() : this.goodBadMetricFilter;
    }

    /**
     * A window is good if its performance is high enough.
     * 
     */
    @Import(name="goodTotalRatioThreshold")
      private final @Nullable Output<PerformanceThresholdArgs> goodTotalRatioThreshold;

    public Output<PerformanceThresholdArgs> getGoodTotalRatioThreshold() {
        return this.goodTotalRatioThreshold == null ? Output.empty() : this.goodTotalRatioThreshold;
    }

    /**
     * A window is good if the metric's value is in a good range, averaged across returned streams.
     * 
     */
    @Import(name="metricMeanInRange")
      private final @Nullable Output<MetricRangeArgs> metricMeanInRange;

    public Output<MetricRangeArgs> getMetricMeanInRange() {
        return this.metricMeanInRange == null ? Output.empty() : this.metricMeanInRange;
    }

    /**
     * A window is good if the metric's value is in a good range, summed across returned streams.
     * 
     */
    @Import(name="metricSumInRange")
      private final @Nullable Output<MetricRangeArgs> metricSumInRange;

    public Output<MetricRangeArgs> getMetricSumInRange() {
        return this.metricSumInRange == null ? Output.empty() : this.metricSumInRange;
    }

    /**
     * Duration over which window quality is evaluated. Must be an integer fraction of a day and at least 60s.
     * 
     */
    @Import(name="windowPeriod")
      private final @Nullable Output<String> windowPeriod;

    public Output<String> getWindowPeriod() {
        return this.windowPeriod == null ? Output.empty() : this.windowPeriod;
    }

    public WindowsBasedSliArgs(
        @Nullable Output<String> goodBadMetricFilter,
        @Nullable Output<PerformanceThresholdArgs> goodTotalRatioThreshold,
        @Nullable Output<MetricRangeArgs> metricMeanInRange,
        @Nullable Output<MetricRangeArgs> metricSumInRange,
        @Nullable Output<String> windowPeriod) {
        this.goodBadMetricFilter = goodBadMetricFilter;
        this.goodTotalRatioThreshold = goodTotalRatioThreshold;
        this.metricMeanInRange = metricMeanInRange;
        this.metricSumInRange = metricSumInRange;
        this.windowPeriod = windowPeriod;
    }

    private WindowsBasedSliArgs() {
        this.goodBadMetricFilter = Output.empty();
        this.goodTotalRatioThreshold = Output.empty();
        this.metricMeanInRange = Output.empty();
        this.metricSumInRange = Output.empty();
        this.windowPeriod = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsBasedSliArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> goodBadMetricFilter;
        private @Nullable Output<PerformanceThresholdArgs> goodTotalRatioThreshold;
        private @Nullable Output<MetricRangeArgs> metricMeanInRange;
        private @Nullable Output<MetricRangeArgs> metricSumInRange;
        private @Nullable Output<String> windowPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsBasedSliArgs defaults) {
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

        public Builder goodTotalRatioThreshold(@Nullable Output<PerformanceThresholdArgs> goodTotalRatioThreshold) {
            this.goodTotalRatioThreshold = goodTotalRatioThreshold;
            return this;
        }

        public Builder goodTotalRatioThreshold(@Nullable PerformanceThresholdArgs goodTotalRatioThreshold) {
            this.goodTotalRatioThreshold = Output.ofNullable(goodTotalRatioThreshold);
            return this;
        }

        public Builder metricMeanInRange(@Nullable Output<MetricRangeArgs> metricMeanInRange) {
            this.metricMeanInRange = metricMeanInRange;
            return this;
        }

        public Builder metricMeanInRange(@Nullable MetricRangeArgs metricMeanInRange) {
            this.metricMeanInRange = Output.ofNullable(metricMeanInRange);
            return this;
        }

        public Builder metricSumInRange(@Nullable Output<MetricRangeArgs> metricSumInRange) {
            this.metricSumInRange = metricSumInRange;
            return this;
        }

        public Builder metricSumInRange(@Nullable MetricRangeArgs metricSumInRange) {
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
        public WindowsBasedSliArgs build() {
            return new WindowsBasedSliArgs(goodBadMetricFilter, goodTotalRatioThreshold, metricMeanInRange, metricSumInRange, windowPeriod);
        }
    }
}
