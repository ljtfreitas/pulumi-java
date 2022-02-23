// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters of the search job that initiated this table.
 * 
 */
public final class SearchResultsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SearchResultsResponse Empty = new SearchResultsResponse();

    /**
     * Search results table's Description.
     * 
     */
    @InputImport(name="description")
        private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The timestamp to end the search by (UTC)
     * 
     */
    @InputImport(name="endSearchTime")
        private final @Nullable String endSearchTime;

    public Optional<String> getEndSearchTime() {
        return this.endSearchTime == null ? Optional.empty() : Optional.ofNullable(this.endSearchTime);
    }

    /**
     * Limit the search job to return up to specified number of rows.
     * 
     */
    @InputImport(name="limit")
        private final @Nullable Integer limit;

    public Optional<Integer> getLimit() {
        return this.limit == null ? Optional.empty() : Optional.ofNullable(this.limit);
    }

    /**
     * Search job query.
     * 
     */
    @InputImport(name="query")
        private final @Nullable String query;

    public Optional<String> getQuery() {
        return this.query == null ? Optional.empty() : Optional.ofNullable(this.query);
    }

    /**
     * The table to search data from.
     * 
     */
    @InputImport(name="sourceTable", required=true)
        private final String sourceTable;

    public String getSourceTable() {
        return this.sourceTable;
    }

    /**
     * The timestamp to start the search from (UTC)
     * 
     */
    @InputImport(name="startSearchTime")
        private final @Nullable String startSearchTime;

    public Optional<String> getStartSearchTime() {
        return this.startSearchTime == null ? Optional.empty() : Optional.ofNullable(this.startSearchTime);
    }

    public SearchResultsResponse(
        @Nullable String description,
        @Nullable String endSearchTime,
        @Nullable Integer limit,
        @Nullable String query,
        String sourceTable,
        @Nullable String startSearchTime) {
        this.description = description;
        this.endSearchTime = endSearchTime;
        this.limit = limit;
        this.query = query;
        this.sourceTable = Objects.requireNonNull(sourceTable, "expected parameter 'sourceTable' to be non-null");
        this.startSearchTime = startSearchTime;
    }

    private SearchResultsResponse() {
        this.description = null;
        this.endSearchTime = null;
        this.limit = null;
        this.query = null;
        this.sourceTable = null;
        this.startSearchTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SearchResultsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String endSearchTime;
        private @Nullable Integer limit;
        private @Nullable String query;
        private String sourceTable;
        private @Nullable String startSearchTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SearchResultsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.endSearchTime = defaults.endSearchTime;
    	      this.limit = defaults.limit;
    	      this.query = defaults.query;
    	      this.sourceTable = defaults.sourceTable;
    	      this.startSearchTime = defaults.startSearchTime;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEndSearchTime(@Nullable String endSearchTime) {
            this.endSearchTime = endSearchTime;
            return this;
        }

        public Builder setLimit(@Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder setQuery(@Nullable String query) {
            this.query = query;
            return this;
        }

        public Builder setSourceTable(String sourceTable) {
            this.sourceTable = Objects.requireNonNull(sourceTable);
            return this;
        }

        public Builder setStartSearchTime(@Nullable String startSearchTime) {
            this.startSearchTime = startSearchTime;
            return this;
        }
        public SearchResultsResponse build() {
            return new SearchResultsResponse(description, endSearchTime, limit, query, sourceTable, startSearchTime);
        }
    }
}
