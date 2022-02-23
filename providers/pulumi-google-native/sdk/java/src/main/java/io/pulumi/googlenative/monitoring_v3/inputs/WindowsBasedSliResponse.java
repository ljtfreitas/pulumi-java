// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v3.inputs.MetricRangeResponse;
import io.pulumi.googlenative.monitoring_v3.inputs.PerformanceThresholdResponse;
import java.lang.String;
import java.util.Objects;


/**
 * A WindowsBasedSli defines good_service as the count of time windows for which the provided service was of good quality. Criteria for determining if service was good are embedded in the window_criterion.
 * 
 */
public final class WindowsBasedSliResponse extends io.pulumi.resources.InvokeArgs {

    public static final WindowsBasedSliResponse Empty = new WindowsBasedSliResponse();

    /**
     * A monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) specifying a TimeSeries with ValueType = BOOL. The window is good if any true values appear in the window.
     * 
     */
    @InputImport(name="goodBadMetricFilter", required=true)
      private final String goodBadMetricFilter;

    public String getGoodBadMetricFilter() {
        return this.goodBadMetricFilter;
    }

    /**
     * A window is good if its performance is high enough.
     * 
     */
    @InputImport(name="goodTotalRatioThreshold", required=true)
      private final PerformanceThresholdResponse goodTotalRatioThreshold;

    public PerformanceThresholdResponse getGoodTotalRatioThreshold() {
        return this.goodTotalRatioThreshold;
    }

    /**
     * A window is good if the metric's value is in a good range, averaged across returned streams.
     * 
     */
    @InputImport(name="metricMeanInRange", required=true)
      private final MetricRangeResponse metricMeanInRange;

    public MetricRangeResponse getMetricMeanInRange() {
        return this.metricMeanInRange;
    }

    /**
     * A window is good if the metric's value is in a good range, summed across returned streams.
     * 
     */
    @InputImport(name="metricSumInRange", required=true)
      private final MetricRangeResponse metricSumInRange;

    public MetricRangeResponse getMetricSumInRange() {
        return this.metricSumInRange;
    }

    /**
     * Duration over which window quality is evaluated. Must be an integer fraction of a day and at least 60s.
     * 
     */
    @InputImport(name="windowPeriod", required=true)
      private final String windowPeriod;

    public String getWindowPeriod() {
        return this.windowPeriod;
    }

    public WindowsBasedSliResponse(
        String goodBadMetricFilter,
        PerformanceThresholdResponse goodTotalRatioThreshold,
        MetricRangeResponse metricMeanInRange,
        MetricRangeResponse metricSumInRange,
        String windowPeriod) {
        this.goodBadMetricFilter = Objects.requireNonNull(goodBadMetricFilter, "expected parameter 'goodBadMetricFilter' to be non-null");
        this.goodTotalRatioThreshold = Objects.requireNonNull(goodTotalRatioThreshold, "expected parameter 'goodTotalRatioThreshold' to be non-null");
        this.metricMeanInRange = Objects.requireNonNull(metricMeanInRange, "expected parameter 'metricMeanInRange' to be non-null");
        this.metricSumInRange = Objects.requireNonNull(metricSumInRange, "expected parameter 'metricSumInRange' to be non-null");
        this.windowPeriod = Objects.requireNonNull(windowPeriod, "expected parameter 'windowPeriod' to be non-null");
    }

    private WindowsBasedSliResponse() {
        this.goodBadMetricFilter = null;
        this.goodTotalRatioThreshold = null;
        this.metricMeanInRange = null;
        this.metricSumInRange = null;
        this.windowPeriod = null;
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

        public Builder setGoodBadMetricFilter(String goodBadMetricFilter) {
            this.goodBadMetricFilter = Objects.requireNonNull(goodBadMetricFilter);
            return this;
        }

        public Builder setGoodTotalRatioThreshold(PerformanceThresholdResponse goodTotalRatioThreshold) {
            this.goodTotalRatioThreshold = Objects.requireNonNull(goodTotalRatioThreshold);
            return this;
        }

        public Builder setMetricMeanInRange(MetricRangeResponse metricMeanInRange) {
            this.metricMeanInRange = Objects.requireNonNull(metricMeanInRange);
            return this;
        }

        public Builder setMetricSumInRange(MetricRangeResponse metricSumInRange) {
            this.metricSumInRange = Objects.requireNonNull(metricSumInRange);
            return this;
        }

        public Builder setWindowPeriod(String windowPeriod) {
            this.windowPeriod = Objects.requireNonNull(windowPeriod);
            return this;
        }
        public WindowsBasedSliResponse build() {
            return new WindowsBasedSliResponse(goodBadMetricFilter, goodTotalRatioThreshold, metricMeanInRange, metricSumInRange, windowPeriod);
        }
    }
}
