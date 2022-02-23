// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.EntityInsightItemResponseQueryTimeInterval;
import io.pulumi.azurenative.securityinsights.inputs.InsightsTableResultResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Entity insight Item.
 * 
 */
public final class EntityInsightItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final EntityInsightItemResponse Empty = new EntityInsightItemResponse();

    /**
     * Query results for table insights query.
     * 
     */
    @InputImport(name="chartQueryResults")
        private final @Nullable List<InsightsTableResultResponse> chartQueryResults;

    public List<InsightsTableResultResponse> getChartQueryResults() {
        return this.chartQueryResults == null ? List.of() : this.chartQueryResults;
    }

    /**
     * The query id of the insight
     * 
     */
    @InputImport(name="queryId")
        private final @Nullable String queryId;

    public Optional<String> getQueryId() {
        return this.queryId == null ? Optional.empty() : Optional.ofNullable(this.queryId);
    }

    /**
     * The Time interval that the query actually executed on.
     * 
     */
    @InputImport(name="queryTimeInterval")
        private final @Nullable EntityInsightItemResponseQueryTimeInterval queryTimeInterval;

    public Optional<EntityInsightItemResponseQueryTimeInterval> getQueryTimeInterval() {
        return this.queryTimeInterval == null ? Optional.empty() : Optional.ofNullable(this.queryTimeInterval);
    }

    /**
     * Query results for table insights query.
     * 
     */
    @InputImport(name="tableQueryResults")
        private final @Nullable InsightsTableResultResponse tableQueryResults;

    public Optional<InsightsTableResultResponse> getTableQueryResults() {
        return this.tableQueryResults == null ? Optional.empty() : Optional.ofNullable(this.tableQueryResults);
    }

    public EntityInsightItemResponse(
        @Nullable List<InsightsTableResultResponse> chartQueryResults,
        @Nullable String queryId,
        @Nullable EntityInsightItemResponseQueryTimeInterval queryTimeInterval,
        @Nullable InsightsTableResultResponse tableQueryResults) {
        this.chartQueryResults = chartQueryResults;
        this.queryId = queryId;
        this.queryTimeInterval = queryTimeInterval;
        this.tableQueryResults = tableQueryResults;
    }

    private EntityInsightItemResponse() {
        this.chartQueryResults = List.of();
        this.queryId = null;
        this.queryTimeInterval = null;
        this.tableQueryResults = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityInsightItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<InsightsTableResultResponse> chartQueryResults;
        private @Nullable String queryId;
        private @Nullable EntityInsightItemResponseQueryTimeInterval queryTimeInterval;
        private @Nullable InsightsTableResultResponse tableQueryResults;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityInsightItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chartQueryResults = defaults.chartQueryResults;
    	      this.queryId = defaults.queryId;
    	      this.queryTimeInterval = defaults.queryTimeInterval;
    	      this.tableQueryResults = defaults.tableQueryResults;
        }

        public Builder setChartQueryResults(@Nullable List<InsightsTableResultResponse> chartQueryResults) {
            this.chartQueryResults = chartQueryResults;
            return this;
        }

        public Builder setQueryId(@Nullable String queryId) {
            this.queryId = queryId;
            return this;
        }

        public Builder setQueryTimeInterval(@Nullable EntityInsightItemResponseQueryTimeInterval queryTimeInterval) {
            this.queryTimeInterval = queryTimeInterval;
            return this;
        }

        public Builder setTableQueryResults(@Nullable InsightsTableResultResponse tableQueryResults) {
            this.tableQueryResults = tableQueryResults;
            return this;
        }
        public EntityInsightItemResponse build() {
            return new EntityInsightItemResponse(chartQueryResults, queryId, queryTimeInterval, tableQueryResults);
        }
    }
}
