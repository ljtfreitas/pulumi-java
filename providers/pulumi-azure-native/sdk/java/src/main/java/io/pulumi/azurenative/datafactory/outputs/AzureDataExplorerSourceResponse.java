// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureDataExplorerSourceResponse {
    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    private final @Nullable Object additionalColumns;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * The name of the Boolean option that controls whether truncation is applied to result-sets that go beyond a certain row-count limit.
     * 
     */
    private final @Nullable Object noTruncation;
    /**
     * Database query. Should be a Kusto Query Language (KQL) query. Type: string (or Expression with resultType string).
     * 
     */
    private final Object query;
    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..
     * 
     */
    private final @Nullable Object queryTimeout;
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sourceRetryCount;
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sourceRetryWait;
    /**
     * Copy source type.
     * Expected value is 'AzureDataExplorerSource'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AzureDataExplorerSourceResponse(
        @CustomType.Parameter("additionalColumns") @Nullable Object additionalColumns,
        @CustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @CustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @CustomType.Parameter("noTruncation") @Nullable Object noTruncation,
        @CustomType.Parameter("query") Object query,
        @CustomType.Parameter("queryTimeout") @Nullable Object queryTimeout,
        @CustomType.Parameter("sourceRetryCount") @Nullable Object sourceRetryCount,
        @CustomType.Parameter("sourceRetryWait") @Nullable Object sourceRetryWait,
        @CustomType.Parameter("type") String type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.noTruncation = noTruncation;
        this.query = query;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = type;
    }

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
    */
    public Optional<Object> getAdditionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * The name of the Boolean option that controls whether truncation is applied to result-sets that go beyond a certain row-count limit.
     * 
    */
    public Optional<Object> getNoTruncation() {
        return Optional.ofNullable(this.noTruncation);
    }
    /**
     * Database query. Should be a Kusto Query Language (KQL) query. Type: string (or Expression with resultType string).
     * 
    */
    public Object getQuery() {
        return this.query;
    }
    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..
     * 
    */
    public Optional<Object> getQueryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getSourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getSourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }
    /**
     * Copy source type.
     * Expected value is 'AzureDataExplorerSource'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataExplorerSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object noTruncation;
        private Object query;
        private @Nullable Object queryTimeout;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataExplorerSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.noTruncation = defaults.noTruncation;
    	      this.query = defaults.query;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder noTruncation(@Nullable Object noTruncation) {
            this.noTruncation = noTruncation;
            return this;
        }

        public Builder query(Object query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder queryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public AzureDataExplorerSourceResponse build() {
            return new AzureDataExplorerSourceResponse(additionalColumns, disableMetricsCollection, maxConcurrentConnections, noTruncation, query, queryTimeout, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
