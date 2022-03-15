// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.MetricRangeResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.PerformanceThresholdResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WindowsBasedSliResponse {
    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries with ValueType = BOOL. The window is good if any true values appear in the window.
     * 
     */
    private final String goodBadMetricFilter;
    /**
     * A window is good if its performance is high enough.
     * 
     */
    private final PerformanceThresholdResponse goodTotalRatioThreshold;
    /**
     * A window is good if the metric's value is in a good range, averaged across returned streams.
     * 
     */
    private final MetricRangeResponse metricMeanInRange;
    /**
     * A window is good if the metric's value is in a good range, summed across returned streams.
     * 
     */
    private final MetricRangeResponse metricSumInRange;
    /**
     * Duration over which window quality is evaluated. Must be an integer fraction of a day and at least 60s.
     * 
     */
    private final String windowPeriod;

    @CustomType.Constructor
    private WindowsBasedSliResponse(
        @CustomType.Parameter("goodBadMetricFilter") String goodBadMetricFilter,
        @CustomType.Parameter("goodTotalRatioThreshold") PerformanceThresholdResponse goodTotalRatioThreshold,
        @CustomType.Parameter("metricMeanInRange") MetricRangeResponse metricMeanInRange,
        @CustomType.Parameter("metricSumInRange") MetricRangeResponse metricSumInRange,
        @CustomType.Parameter("windowPeriod") String windowPeriod) {
        this.goodBadMetricFilter = goodBadMetricFilter;
        this.goodTotalRatioThreshold = goodTotalRatioThreshold;
        this.metricMeanInRange = metricMeanInRange;
        this.metricSumInRange = metricSumInRange;
        this.windowPeriod = windowPeriod;
    }

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries with ValueType = BOOL. The window is good if any true values appear in the window.
     * 
    */
    public String getGoodBadMetricFilter() {
        return this.goodBadMetricFilter;
    }
    /**
     * A window is good if its performance is high enough.
     * 
    */
    public PerformanceThresholdResponse getGoodTotalRatioThreshold() {
        return this.goodTotalRatioThreshold;
    }
    /**
     * A window is good if the metric's value is in a good range, averaged across returned streams.
     * 
    */
    public MetricRangeResponse getMetricMeanInRange() {
        return this.metricMeanInRange;
    }
    /**
     * A window is good if the metric's value is in a good range, summed across returned streams.
     * 
    */
    public MetricRangeResponse getMetricSumInRange() {
        return this.metricSumInRange;
    }
    /**
     * Duration over which window quality is evaluated. Must be an integer fraction of a day and at least 60s.
     * 
    */
    public String getWindowPeriod() {
        return this.windowPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsBasedSliResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String goodBadMetricFilter;
        private PerformanceThresholdResponse goodTotalRatioThreshold;
        private MetricRangeResponse metricMeanInRange;
        private MetricRangeResponse metricSumInRange;
        private String windowPeriod;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsBasedSliResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.goodBadMetricFilter = defaults.goodBadMetricFilter;
    	      this.goodTotalRatioThreshold = defaults.goodTotalRatioThreshold;
    	      this.metricMeanInRange = defaults.metricMeanInRange;
    	      this.metricSumInRange = defaults.metricSumInRange;
    	      this.windowPeriod = defaults.windowPeriod;
        }

        public Builder goodBadMetricFilter(String goodBadMetricFilter) {
            this.goodBadMetricFilter = Objects.requireNonNull(goodBadMetricFilter);
            return this;
        }

        public Builder goodTotalRatioThreshold(PerformanceThresholdResponse goodTotalRatioThreshold) {
            this.goodTotalRatioThreshold = Objects.requireNonNull(goodTotalRatioThreshold);
            return this;
        }

        public Builder metricMeanInRange(MetricRangeResponse metricMeanInRange) {
            this.metricMeanInRange = Objects.requireNonNull(metricMeanInRange);
            return this;
        }

        public Builder metricSumInRange(MetricRangeResponse metricSumInRange) {
            this.metricSumInRange = Objects.requireNonNull(metricSumInRange);
            return this;
        }

        public Builder windowPeriod(String windowPeriod) {
            this.windowPeriod = Objects.requireNonNull(windowPeriod);
            return this;
        }
        public WindowsBasedSliResponse build() {
            return new WindowsBasedSliResponse(goodBadMetricFilter, goodTotalRatioThreshold, metricMeanInRange, metricSumInRange, windowPeriod);
        }
    }
}
