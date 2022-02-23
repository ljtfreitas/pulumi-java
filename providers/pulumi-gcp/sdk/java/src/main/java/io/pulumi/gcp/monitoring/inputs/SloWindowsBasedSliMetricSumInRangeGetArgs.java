// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.monitoring.inputs.SloWindowsBasedSliMetricSumInRangeRangeGetArgs;
import java.lang.String;
import java.util.Objects;


public final class SloWindowsBasedSliMetricSumInRangeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloWindowsBasedSliMetricSumInRangeGetArgs Empty = new SloWindowsBasedSliMetricSumInRangeGetArgs();

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
    @InputImport(name="range", required=true)
        private final Input<SloWindowsBasedSliMetricSumInRangeRangeGetArgs> range;

    public Input<SloWindowsBasedSliMetricSumInRangeRangeGetArgs> getRange() {
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
    @InputImport(name="timeSeries", required=true)
        private final Input<String> timeSeries;

    public Input<String> getTimeSeries() {
        return this.timeSeries;
    }

    public SloWindowsBasedSliMetricSumInRangeGetArgs(
        Input<SloWindowsBasedSliMetricSumInRangeRangeGetArgs> range,
        Input<String> timeSeries) {
        this.range = Objects.requireNonNull(range, "expected parameter 'range' to be non-null");
        this.timeSeries = Objects.requireNonNull(timeSeries, "expected parameter 'timeSeries' to be non-null");
    }

    private SloWindowsBasedSliMetricSumInRangeGetArgs() {
        this.range = Input.empty();
        this.timeSeries = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliMetricSumInRangeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<SloWindowsBasedSliMetricSumInRangeRangeGetArgs> range;
        private Input<String> timeSeries;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliMetricSumInRangeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.range = defaults.range;
    	      this.timeSeries = defaults.timeSeries;
        }

        public Builder setRange(Input<SloWindowsBasedSliMetricSumInRangeRangeGetArgs> range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }

        public Builder setRange(SloWindowsBasedSliMetricSumInRangeRangeGetArgs range) {
            this.range = Input.of(Objects.requireNonNull(range));
            return this;
        }

        public Builder setTimeSeries(Input<String> timeSeries) {
            this.timeSeries = Objects.requireNonNull(timeSeries);
            return this;
        }

        public Builder setTimeSeries(String timeSeries) {
            this.timeSeries = Input.of(Objects.requireNonNull(timeSeries));
            return this;
        }
        public SloWindowsBasedSliMetricSumInRangeGetArgs build() {
            return new SloWindowsBasedSliMetricSumInRangeGetArgs(range, timeSeries);
        }
    }
}
