// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesFilterArgs;
import io.pulumi.googlenative.monitoring_v1.inputs.TimeSeriesFilterRatioArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * TimeSeriesQuery collects the set of supported methods for querying time series data from the Stackdriver metrics API.
 * 
 */
public final class TimeSeriesQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final TimeSeriesQueryArgs Empty = new TimeSeriesQueryArgs();

    /**
     * Filter parameters to fetch time series.
     * 
     */
    @InputImport(name="timeSeriesFilter")
      private final @Nullable Input<TimeSeriesFilterArgs> timeSeriesFilter;

    public Input<TimeSeriesFilterArgs> getTimeSeriesFilter() {
        return this.timeSeriesFilter == null ? Input.empty() : this.timeSeriesFilter;
    }

    /**
     * Parameters to fetch a ratio between two time series filters.
     * 
     */
    @InputImport(name="timeSeriesFilterRatio")
      private final @Nullable Input<TimeSeriesFilterRatioArgs> timeSeriesFilterRatio;

    public Input<TimeSeriesFilterRatioArgs> getTimeSeriesFilterRatio() {
        return this.timeSeriesFilterRatio == null ? Input.empty() : this.timeSeriesFilterRatio;
    }

    /**
     * A query used to fetch time series.
     * 
     */
    @InputImport(name="timeSeriesQueryLanguage")
      private final @Nullable Input<String> timeSeriesQueryLanguage;

    public Input<String> getTimeSeriesQueryLanguage() {
        return this.timeSeriesQueryLanguage == null ? Input.empty() : this.timeSeriesQueryLanguage;
    }

    /**
     * The unit of data contained in fetched time series. If non-empty, this unit will override any unit that accompanies fetched data. The format is the same as the unit (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors) field in MetricDescriptor.
     * 
     */
    @InputImport(name="unitOverride")
      private final @Nullable Input<String> unitOverride;

    public Input<String> getUnitOverride() {
        return this.unitOverride == null ? Input.empty() : this.unitOverride;
    }

    public TimeSeriesQueryArgs(
        @Nullable Input<TimeSeriesFilterArgs> timeSeriesFilter,
        @Nullable Input<TimeSeriesFilterRatioArgs> timeSeriesFilterRatio,
        @Nullable Input<String> timeSeriesQueryLanguage,
        @Nullable Input<String> unitOverride) {
        this.timeSeriesFilter = timeSeriesFilter;
        this.timeSeriesFilterRatio = timeSeriesFilterRatio;
        this.timeSeriesQueryLanguage = timeSeriesQueryLanguage;
        this.unitOverride = unitOverride;
    }

    private TimeSeriesQueryArgs() {
        this.timeSeriesFilter = Input.empty();
        this.timeSeriesFilterRatio = Input.empty();
        this.timeSeriesQueryLanguage = Input.empty();
        this.unitOverride = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimeSeriesQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TimeSeriesFilterArgs> timeSeriesFilter;
        private @Nullable Input<TimeSeriesFilterRatioArgs> timeSeriesFilterRatio;
        private @Nullable Input<String> timeSeriesQueryLanguage;
        private @Nullable Input<String> unitOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(TimeSeriesQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeSeriesFilter = defaults.timeSeriesFilter;
    	      this.timeSeriesFilterRatio = defaults.timeSeriesFilterRatio;
    	      this.timeSeriesQueryLanguage = defaults.timeSeriesQueryLanguage;
    	      this.unitOverride = defaults.unitOverride;
        }

        public Builder setTimeSeriesFilter(@Nullable Input<TimeSeriesFilterArgs> timeSeriesFilter) {
            this.timeSeriesFilter = timeSeriesFilter;
            return this;
        }

        public Builder setTimeSeriesFilter(@Nullable TimeSeriesFilterArgs timeSeriesFilter) {
            this.timeSeriesFilter = Input.ofNullable(timeSeriesFilter);
            return this;
        }

        public Builder setTimeSeriesFilterRatio(@Nullable Input<TimeSeriesFilterRatioArgs> timeSeriesFilterRatio) {
            this.timeSeriesFilterRatio = timeSeriesFilterRatio;
            return this;
        }

        public Builder setTimeSeriesFilterRatio(@Nullable TimeSeriesFilterRatioArgs timeSeriesFilterRatio) {
            this.timeSeriesFilterRatio = Input.ofNullable(timeSeriesFilterRatio);
            return this;
        }

        public Builder setTimeSeriesQueryLanguage(@Nullable Input<String> timeSeriesQueryLanguage) {
            this.timeSeriesQueryLanguage = timeSeriesQueryLanguage;
            return this;
        }

        public Builder setTimeSeriesQueryLanguage(@Nullable String timeSeriesQueryLanguage) {
            this.timeSeriesQueryLanguage = Input.ofNullable(timeSeriesQueryLanguage);
            return this;
        }

        public Builder setUnitOverride(@Nullable Input<String> unitOverride) {
            this.unitOverride = unitOverride;
            return this;
        }

        public Builder setUnitOverride(@Nullable String unitOverride) {
            this.unitOverride = Input.ofNullable(unitOverride);
            return this;
        }
        public TimeSeriesQueryArgs build() {
            return new TimeSeriesQueryArgs(timeSeriesFilter, timeSeriesFilterRatio, timeSeriesQueryLanguage, unitOverride);
        }
    }
}
