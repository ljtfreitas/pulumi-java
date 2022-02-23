// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SapOpenHubSourceResponse {
    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    private final @Nullable Object additionalColumns;
    /**
     * The ID of request for delta loading. Once it is set, only data with requestId larger than the value of this property will be retrieved. The default value is 0. Type: integer (or Expression with resultType integer ).
     * 
     */
    private final @Nullable Object baseRequestId;
    /**
     * Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object customRfcReadTableFunctionModule;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * Whether to exclude the records of the last request. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object excludeLastRequest;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object queryTimeout;
    /**
     * The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object sapDataColumnDelimiter;
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
     * Expected value is 'SapOpenHubSource'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"additionalColumns","baseRequestId","customRfcReadTableFunctionModule","disableMetricsCollection","excludeLastRequest","maxConcurrentConnections","queryTimeout","sapDataColumnDelimiter","sourceRetryCount","sourceRetryWait","type"})
    private SapOpenHubSourceResponse(
        @Nullable Object additionalColumns,
        @Nullable Object baseRequestId,
        @Nullable Object customRfcReadTableFunctionModule,
        @Nullable Object disableMetricsCollection,
        @Nullable Object excludeLastRequest,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object queryTimeout,
        @Nullable Object sapDataColumnDelimiter,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        String type) {
        this.additionalColumns = additionalColumns;
        this.baseRequestId = baseRequestId;
        this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
        this.disableMetricsCollection = disableMetricsCollection;
        this.excludeLastRequest = excludeLastRequest;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.queryTimeout = queryTimeout;
        this.sapDataColumnDelimiter = sapDataColumnDelimiter;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    public Optional<Object> getAdditionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }
    /**
     * The ID of request for delta loading. Once it is set, only data with requestId larger than the value of this property will be retrieved. The default value is 0. Type: integer (or Expression with resultType integer ).
     * 
     */
    public Optional<Object> getBaseRequestId() {
        return Optional.ofNullable(this.baseRequestId);
    }
    /**
     * Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getCustomRfcReadTableFunctionModule() {
        return Optional.ofNullable(this.customRfcReadTableFunctionModule);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * Whether to exclude the records of the last request. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> getExcludeLastRequest() {
        return Optional.ofNullable(this.excludeLastRequest);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Object> getQueryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }
    /**
     * The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getSapDataColumnDelimiter() {
        return Optional.ofNullable(this.sapDataColumnDelimiter);
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
     * Expected value is 'SapOpenHubSource'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapOpenHubSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object baseRequestId;
        private @Nullable Object customRfcReadTableFunctionModule;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object excludeLastRequest;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object queryTimeout;
        private @Nullable Object sapDataColumnDelimiter;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SapOpenHubSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.baseRequestId = defaults.baseRequestId;
    	      this.customRfcReadTableFunctionModule = defaults.customRfcReadTableFunctionModule;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.excludeLastRequest = defaults.excludeLastRequest;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sapDataColumnDelimiter = defaults.sapDataColumnDelimiter;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder setBaseRequestId(@Nullable Object baseRequestId) {
            this.baseRequestId = baseRequestId;
            return this;
        }

        public Builder setCustomRfcReadTableFunctionModule(@Nullable Object customRfcReadTableFunctionModule) {
            this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setExcludeLastRequest(@Nullable Object excludeLastRequest) {
            this.excludeLastRequest = excludeLastRequest;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setQueryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder setSapDataColumnDelimiter(@Nullable Object sapDataColumnDelimiter) {
            this.sapDataColumnDelimiter = sapDataColumnDelimiter;
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SapOpenHubSourceResponse build() {
            return new SapOpenHubSourceResponse(additionalColumns, baseRequestId, customRfcReadTableFunctionModule, disableMetricsCollection, excludeLastRequest, maxConcurrentConnections, queryTimeout, sapDataColumnDelimiter, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
