// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.monitoring_v1.outputs.TableDisplayOptionsResponse;
import io.pulumi.googlenative.monitoring_v1.outputs.TimeSeriesQueryResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TableDataSetResponse {
    /**
     * Optional. The lower bound on data point frequency for this data set, implemented by specifying the minimum alignment period to use in a time series query For example, if the data is published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It would not make sense to fetch and align data at one minute intervals.
     * 
     */
    private final String minAlignmentPeriod;
    /**
     * Optional. Table display options for configuring how the table is rendered.
     * 
     */
    private final TableDisplayOptionsResponse tableDisplayOptions;
    /**
     * Optional. A template string for naming TimeSeries in the resulting data set. This should be a string with interpolations of the form ${label_name}, which will resolve to the label's value i.e. "${resource.labels.project_id}."
     * 
     */
    private final String tableTemplate;
    /**
     * Fields for querying time series data from the Stackdriver metrics API.
     * 
     */
    private final TimeSeriesQueryResponse timeSeriesQuery;

    @CustomType.Constructor
    private TableDataSetResponse(
        @CustomType.Parameter("minAlignmentPeriod") String minAlignmentPeriod,
        @CustomType.Parameter("tableDisplayOptions") TableDisplayOptionsResponse tableDisplayOptions,
        @CustomType.Parameter("tableTemplate") String tableTemplate,
        @CustomType.Parameter("timeSeriesQuery") TimeSeriesQueryResponse timeSeriesQuery) {
        this.minAlignmentPeriod = minAlignmentPeriod;
        this.tableDisplayOptions = tableDisplayOptions;
        this.tableTemplate = tableTemplate;
        this.timeSeriesQuery = timeSeriesQuery;
    }

    /**
     * Optional. The lower bound on data point frequency for this data set, implemented by specifying the minimum alignment period to use in a time series query For example, if the data is published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It would not make sense to fetch and align data at one minute intervals.
     * 
    */
    public String getMinAlignmentPeriod() {
        return this.minAlignmentPeriod;
    }
    /**
     * Optional. Table display options for configuring how the table is rendered.
     * 
    */
    public TableDisplayOptionsResponse getTableDisplayOptions() {
        return this.tableDisplayOptions;
    }
    /**
     * Optional. A template string for naming TimeSeries in the resulting data set. This should be a string with interpolations of the form ${label_name}, which will resolve to the label's value i.e. "${resource.labels.project_id}."
     * 
    */
    public String getTableTemplate() {
        return this.tableTemplate;
    }
    /**
     * Fields for querying time series data from the Stackdriver metrics API.
     * 
    */
    public TimeSeriesQueryResponse getTimeSeriesQuery() {
        return this.timeSeriesQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableDataSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String minAlignmentPeriod;
        private TableDisplayOptionsResponse tableDisplayOptions;
        private String tableTemplate;
        private TimeSeriesQueryResponse timeSeriesQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(TableDataSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minAlignmentPeriod = defaults.minAlignmentPeriod;
    	      this.tableDisplayOptions = defaults.tableDisplayOptions;
    	      this.tableTemplate = defaults.tableTemplate;
    	      this.timeSeriesQuery = defaults.timeSeriesQuery;
        }

        public Builder minAlignmentPeriod(String minAlignmentPeriod) {
            this.minAlignmentPeriod = Objects.requireNonNull(minAlignmentPeriod);
            return this;
        }

        public Builder tableDisplayOptions(TableDisplayOptionsResponse tableDisplayOptions) {
            this.tableDisplayOptions = Objects.requireNonNull(tableDisplayOptions);
            return this;
        }

        public Builder tableTemplate(String tableTemplate) {
            this.tableTemplate = Objects.requireNonNull(tableTemplate);
            return this;
        }

        public Builder timeSeriesQuery(TimeSeriesQueryResponse timeSeriesQuery) {
            this.timeSeriesQuery = Objects.requireNonNull(timeSeriesQuery);
            return this;
        }
        public TableDataSetResponse build() {
            return new TableDataSetResponse(minAlignmentPeriod, tableDisplayOptions, tableTemplate, timeSeriesQuery);
        }
    }
}
