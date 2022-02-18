// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity source for SAP Business Warehouse Open Hub Destination source.
 * 
 */
public final class SapOpenHubSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SapOpenHubSourceArgs Empty = new SapOpenHubSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @InputImport(name="additionalColumns")
    private final @Nullable Input<Object> additionalColumns;

    public Input<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Input.empty() : this.additionalColumns;
    }

    /**
     * The ID of request for delta loading. Once it is set, only data with requestId larger than the value of this property will be retrieved. The default value is 0. Type: integer (or Expression with resultType integer ).
     * 
     */
    @InputImport(name="baseRequestId")
    private final @Nullable Input<Object> baseRequestId;

    public Input<Object> getBaseRequestId() {
        return this.baseRequestId == null ? Input.empty() : this.baseRequestId;
    }

    /**
     * Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="customRfcReadTableFunctionModule")
    private final @Nullable Input<Object> customRfcReadTableFunctionModule;

    public Input<Object> getCustomRfcReadTableFunctionModule() {
        return this.customRfcReadTableFunctionModule == null ? Input.empty() : this.customRfcReadTableFunctionModule;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
    private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    /**
     * Whether to exclude the records of the last request. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="excludeLastRequest")
    private final @Nullable Input<Object> excludeLastRequest;

    public Input<Object> getExcludeLastRequest() {
        return this.excludeLastRequest == null ? Input.empty() : this.excludeLastRequest;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
    private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="queryTimeout")
    private final @Nullable Input<Object> queryTimeout;

    public Input<Object> getQueryTimeout() {
        return this.queryTimeout == null ? Input.empty() : this.queryTimeout;
    }

    /**
     * The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="sapDataColumnDelimiter")
    private final @Nullable Input<Object> sapDataColumnDelimiter;

    public Input<Object> getSapDataColumnDelimiter() {
        return this.sapDataColumnDelimiter == null ? Input.empty() : this.sapDataColumnDelimiter;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sourceRetryCount")
    private final @Nullable Input<Object> sourceRetryCount;

    public Input<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Input.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sourceRetryWait")
    private final @Nullable Input<Object> sourceRetryWait;

    public Input<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Input.empty() : this.sourceRetryWait;
    }

    /**
     * Copy source type.
     * Expected value is 'SapOpenHubSource'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public SapOpenHubSourceArgs(
        @Nullable Input<Object> additionalColumns,
        @Nullable Input<Object> baseRequestId,
        @Nullable Input<Object> customRfcReadTableFunctionModule,
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> excludeLastRequest,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> queryTimeout,
        @Nullable Input<Object> sapDataColumnDelimiter,
        @Nullable Input<Object> sourceRetryCount,
        @Nullable Input<Object> sourceRetryWait,
        Input<String> type) {
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
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SapOpenHubSourceArgs() {
        this.additionalColumns = Input.empty();
        this.baseRequestId = Input.empty();
        this.customRfcReadTableFunctionModule = Input.empty();
        this.disableMetricsCollection = Input.empty();
        this.excludeLastRequest = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.queryTimeout = Input.empty();
        this.sapDataColumnDelimiter = Input.empty();
        this.sourceRetryCount = Input.empty();
        this.sourceRetryWait = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapOpenHubSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> additionalColumns;
        private @Nullable Input<Object> baseRequestId;
        private @Nullable Input<Object> customRfcReadTableFunctionModule;
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> excludeLastRequest;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> queryTimeout;
        private @Nullable Input<Object> sapDataColumnDelimiter;
        private @Nullable Input<Object> sourceRetryCount;
        private @Nullable Input<Object> sourceRetryWait;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SapOpenHubSourceArgs defaults) {
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

        public Builder setAdditionalColumns(@Nullable Input<Object> additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder setAdditionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = Input.ofNullable(additionalColumns);
            return this;
        }

        public Builder setBaseRequestId(@Nullable Input<Object> baseRequestId) {
            this.baseRequestId = baseRequestId;
            return this;
        }

        public Builder setBaseRequestId(@Nullable Object baseRequestId) {
            this.baseRequestId = Input.ofNullable(baseRequestId);
            return this;
        }

        public Builder setCustomRfcReadTableFunctionModule(@Nullable Input<Object> customRfcReadTableFunctionModule) {
            this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
            return this;
        }

        public Builder setCustomRfcReadTableFunctionModule(@Nullable Object customRfcReadTableFunctionModule) {
            this.customRfcReadTableFunctionModule = Input.ofNullable(customRfcReadTableFunctionModule);
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder setExcludeLastRequest(@Nullable Input<Object> excludeLastRequest) {
            this.excludeLastRequest = excludeLastRequest;
            return this;
        }

        public Builder setExcludeLastRequest(@Nullable Object excludeLastRequest) {
            this.excludeLastRequest = Input.ofNullable(excludeLastRequest);
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Input<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Input.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder setQueryTimeout(@Nullable Input<Object> queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder setQueryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = Input.ofNullable(queryTimeout);
            return this;
        }

        public Builder setSapDataColumnDelimiter(@Nullable Input<Object> sapDataColumnDelimiter) {
            this.sapDataColumnDelimiter = sapDataColumnDelimiter;
            return this;
        }

        public Builder setSapDataColumnDelimiter(@Nullable Object sapDataColumnDelimiter) {
            this.sapDataColumnDelimiter = Input.ofNullable(sapDataColumnDelimiter);
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Input<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder setSourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Input.ofNullable(sourceRetryCount);
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Input<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder setSourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Input.ofNullable(sourceRetryWait);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public SapOpenHubSourceArgs build() {
            return new SapOpenHubSourceArgs(additionalColumns, baseRequestId, customRfcReadTableFunctionModule, disableMetricsCollection, excludeLastRequest, maxConcurrentConnections, queryTimeout, sapDataColumnDelimiter, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
