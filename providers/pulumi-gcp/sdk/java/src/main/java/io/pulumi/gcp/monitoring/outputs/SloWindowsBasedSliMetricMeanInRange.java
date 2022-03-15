// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.monitoring.outputs.SloWindowsBasedSliMetricMeanInRangeRange;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SloWindowsBasedSliMetricMeanInRange {
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
    private final SloWindowsBasedSliMetricMeanInRangeRange range;
    /**
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying the TimeSeries to use for evaluating window
     * quality. The provided TimeSeries must have
     * ValueType = INT64 or ValueType = DOUBLE and
     * MetricKind = GAUGE.
     * Summed value `X` should satisfy
     * `range.min <= X <= range.max` for a good window.
     * 
     */
    private final String timeSeries;

    @CustomType.Constructor
    private SloWindowsBasedSliMetricMeanInRange(
        @CustomType.Parameter("range") SloWindowsBasedSliMetricMeanInRangeRange range,
        @CustomType.Parameter("timeSeries") String timeSeries) {
        this.range = range;
        this.timeSeries = timeSeries;
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
    public SloWindowsBasedSliMetricMeanInRangeRange getRange() {
        return this.range;
    }
    /**
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying the TimeSeries to use for evaluating window
     * quality. The provided TimeSeries must have
     * ValueType = INT64 or ValueType = DOUBLE and
     * MetricKind = GAUGE.
     * Summed value `X` should satisfy
     * `range.min <= X <= range.max` for a good window.
     * 
    */
    public String getTimeSeries() {
        return this.timeSeries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliMetricMeanInRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SloWindowsBasedSliMetricMeanInRangeRange range;
        private String timeSeries;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliMetricMeanInRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.range = defaults.range;
    	      this.timeSeries = defaults.timeSeries;
        }

        public Builder range(SloWindowsBasedSliMetricMeanInRangeRange range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }

        public Builder timeSeries(String timeSeries) {
            this.timeSeries = Objects.requireNonNull(timeSeries);
            return this;
        }
        public SloWindowsBasedSliMetricMeanInRange build() {
            return new SloWindowsBasedSliMetricMeanInRange(range, timeSeries);
        }
    }
}
