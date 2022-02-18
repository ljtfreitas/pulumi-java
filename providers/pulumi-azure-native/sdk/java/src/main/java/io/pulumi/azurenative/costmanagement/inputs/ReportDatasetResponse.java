// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.ReportAggregationResponse;
import io.pulumi.azurenative.costmanagement.inputs.ReportDatasetConfigurationResponse;
import io.pulumi.azurenative.costmanagement.inputs.ReportFilterResponse;
import io.pulumi.azurenative.costmanagement.inputs.ReportGroupingResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The definition of data present in the report.
 * 
 */
public final class ReportDatasetResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReportDatasetResponse Empty = new ReportDatasetResponse();

    /**
     * Dictionary of aggregation expression to use in the report. The key of each item in the dictionary is the alias for the aggregated column. Report can have up to 2 aggregation clauses.
     * 
     */
    @InputImport(name="aggregation")
    private final @Nullable Map<String,ReportAggregationResponse> aggregation;

    public Map<String,ReportAggregationResponse> getAggregation() {
        return this.aggregation == null ? Map.of() : this.aggregation;
    }

    /**
     * Has configuration information for the data in the report. The configuration will be ignored if aggregation and grouping are provided.
     * 
     */
    @InputImport(name="configuration")
    private final @Nullable ReportDatasetConfigurationResponse configuration;

    public Optional<ReportDatasetConfigurationResponse> getConfiguration() {
        return this.configuration == null ? Optional.empty() : Optional.ofNullable(this.configuration);
    }

    /**
     * Has filter expression to use in the report.
     * 
     */
    @InputImport(name="filter")
    private final @Nullable ReportFilterResponse filter;

    public Optional<ReportFilterResponse> getFilter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    /**
     * The granularity of rows in the report.
     * 
     */
    @InputImport(name="granularity")
    private final @Nullable String granularity;

    public Optional<String> getGranularity() {
        return this.granularity == null ? Optional.empty() : Optional.ofNullable(this.granularity);
    }

    /**
     * Array of group by expression to use in the report. Report can have up to 2 group by clauses.
     * 
     */
    @InputImport(name="grouping")
    private final @Nullable List<ReportGroupingResponse> grouping;

    public List<ReportGroupingResponse> getGrouping() {
        return this.grouping == null ? List.of() : this.grouping;
    }

    public ReportDatasetResponse(
        @Nullable Map<String,ReportAggregationResponse> aggregation,
        @Nullable ReportDatasetConfigurationResponse configuration,
        @Nullable ReportFilterResponse filter,
        @Nullable String granularity,
        @Nullable List<ReportGroupingResponse> grouping) {
        this.aggregation = aggregation;
        this.configuration = configuration;
        this.filter = filter;
        this.granularity = granularity;
        this.grouping = grouping;
    }

    private ReportDatasetResponse() {
        this.aggregation = Map.of();
        this.configuration = null;
        this.filter = null;
        this.granularity = null;
        this.grouping = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,ReportAggregationResponse> aggregation;
        private @Nullable ReportDatasetConfigurationResponse configuration;
        private @Nullable ReportFilterResponse filter;
        private @Nullable String granularity;
        private @Nullable List<ReportGroupingResponse> grouping;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.configuration = defaults.configuration;
    	      this.filter = defaults.filter;
    	      this.granularity = defaults.granularity;
    	      this.grouping = defaults.grouping;
        }

        public Builder setAggregation(@Nullable Map<String,ReportAggregationResponse> aggregation) {
            this.aggregation = aggregation;
            return this;
        }

        public Builder setConfiguration(@Nullable ReportDatasetConfigurationResponse configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setFilter(@Nullable ReportFilterResponse filter) {
            this.filter = filter;
            return this;
        }

        public Builder setGranularity(@Nullable String granularity) {
            this.granularity = granularity;
            return this;
        }

        public Builder setGrouping(@Nullable List<ReportGroupingResponse> grouping) {
            this.grouping = grouping;
            return this;
        }

        public ReportDatasetResponse build() {
            return new ReportDatasetResponse(aggregation, configuration, filter, granularity, grouping);
        }
    }
}
