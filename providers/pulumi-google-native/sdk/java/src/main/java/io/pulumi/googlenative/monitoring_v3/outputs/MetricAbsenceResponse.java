// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.monitoring_v3.outputs.AggregationResponse;
import io.pulumi.googlenative.monitoring_v3.outputs.TriggerResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MetricAbsenceResponse {
    /**
     * Specifies the alignment of data points in individual time series as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources). Multiple aggregations are applied in the order specified.This field is similar to the one in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list). It is advisable to use the ListTimeSeries method when debugging this field.
     * 
     */
    private final List<AggregationResponse> aggregations;
    /**
     * The amount of time that a time series must fail to report new data to be considered failing. The minimum value of this field is 120 seconds. Larger values that are a multiple of a minute--for example, 240 or 300 seconds--are supported. If an invalid value is given, an error will be returned. The Duration.nanos field is ignored.
     * 
     */
    private final String duration;
    /**
     * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series should be compared with the threshold.The filter is similar to the one that is specified in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list) (that call is useful to verify the time series that will be retrieved / processed). The filter must specify the metric type and the resource type. Optionally, it can specify resource labels and metric labels. This field must not exceed 2048 Unicode characters in length.
     * 
     */
    private final String filter;
    /**
     * The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations.
     * 
     */
    private final TriggerResponse trigger;

    @CustomType.Constructor
    private MetricAbsenceResponse(
        @CustomType.Parameter("aggregations") List<AggregationResponse> aggregations,
        @CustomType.Parameter("duration") String duration,
        @CustomType.Parameter("filter") String filter,
        @CustomType.Parameter("trigger") TriggerResponse trigger) {
        this.aggregations = aggregations;
        this.duration = duration;
        this.filter = filter;
        this.trigger = trigger;
    }

    /**
     * Specifies the alignment of data points in individual time series as well as how to combine the retrieved time series together (such as when aggregating multiple streams on each resource to a single stream for each resource or when aggregating streams across all members of a group of resources). Multiple aggregations are applied in the order specified.This field is similar to the one in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list). It is advisable to use the ListTimeSeries method when debugging this field.
     * 
    */
    public List<AggregationResponse> getAggregations() {
        return this.aggregations;
    }
    /**
     * The amount of time that a time series must fail to report new data to be considered failing. The minimum value of this field is 120 seconds. Larger values that are a multiple of a minute--for example, 240 or 300 seconds--are supported. If an invalid value is given, an error will be returned. The Duration.nanos field is ignored.
     * 
    */
    public String getDuration() {
        return this.duration;
    }
    /**
     * A filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies which time series should be compared with the threshold.The filter is similar to the one that is specified in the ListTimeSeries request (https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.timeSeries/list) (that call is useful to verify the time series that will be retrieved / processed). The filter must specify the metric type and the resource type. Optionally, it can specify resource labels and metric labels. This field must not exceed 2048 Unicode characters in length.
     * 
    */
    public String getFilter() {
        return this.filter;
    }
    /**
     * The number/percent of time series for which the comparison must hold in order for the condition to trigger. If unspecified, then the condition will trigger if the comparison is true for any of the time series that have been identified by filter and aggregations.
     * 
    */
    public TriggerResponse getTrigger() {
        return this.trigger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricAbsenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AggregationResponse> aggregations;
        private String duration;
        private String filter;
        private TriggerResponse trigger;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricAbsenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregations = defaults.aggregations;
    	      this.duration = defaults.duration;
    	      this.filter = defaults.filter;
    	      this.trigger = defaults.trigger;
        }

        public Builder aggregations(List<AggregationResponse> aggregations) {
            this.aggregations = Objects.requireNonNull(aggregations);
            return this;
        }

        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }

        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }

        public Builder trigger(TriggerResponse trigger) {
            this.trigger = Objects.requireNonNull(trigger);
            return this;
        }
        public MetricAbsenceResponse build() {
            return new MetricAbsenceResponse(aggregations, duration, filter, trigger);
        }
    }
}
