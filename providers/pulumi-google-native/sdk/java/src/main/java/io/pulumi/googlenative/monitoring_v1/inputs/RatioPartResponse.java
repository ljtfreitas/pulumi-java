// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.monitoring_v1.inputs.AggregationResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a query to build the numerator or denominator of a TimeSeriesFilterRatio.
 * 
 */
public final class RatioPartResponse extends io.pulumi.resources.InvokeArgs {

    public static final RatioPartResponse Empty = new RatioPartResponse();

    /**
     * By default, the raw time series data is returned. Use this field to combine multiple time series for different views of the data.
     * 
     */
    @Import(name="aggregation", required=true)
      private final AggregationResponse aggregation;

    public AggregationResponse getAggregation() {
        return this.aggregation;
    }

    /**
     * The monitoring filter (https://cloud.google.com/monitoring/api/v3/filters) that identifies the metric types, resources, and projects to query.
     * 
     */
    @Import(name="filter", required=true)
      private final String filter;

    public String getFilter() {
        return this.filter;
    }

    public RatioPartResponse(
        AggregationResponse aggregation,
        String filter) {
        this.aggregation = Objects.requireNonNull(aggregation, "expected parameter 'aggregation' to be non-null");
        this.filter = Objects.requireNonNull(filter, "expected parameter 'filter' to be non-null");
    }

    private RatioPartResponse() {
        this.aggregation = null;
        this.filter = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RatioPartResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AggregationResponse aggregation;
        private String filter;

        public Builder() {
    	      // Empty
        }

        public Builder(RatioPartResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.filter = defaults.filter;
        }

        public Builder aggregation(AggregationResponse aggregation) {
            this.aggregation = Objects.requireNonNull(aggregation);
            return this;
        }

        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        public RatioPartResponse build() {
            return new RatioPartResponse(aggregation, filter);
        }
    }
}
