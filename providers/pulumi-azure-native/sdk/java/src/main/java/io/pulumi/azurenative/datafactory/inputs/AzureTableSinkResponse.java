// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Azure Table sink.
 * 
 */
public final class AzureTableSinkResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureTableSinkResponse Empty = new AzureTableSinkResponse();

    /**
     * Azure Table default partition key value. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="azureTableDefaultPartitionKeyValue")
        private final @Nullable Object azureTableDefaultPartitionKeyValue;

    public Optional<Object> getAzureTableDefaultPartitionKeyValue() {
        return this.azureTableDefaultPartitionKeyValue == null ? Optional.empty() : Optional.ofNullable(this.azureTableDefaultPartitionKeyValue);
    }

    /**
     * Azure Table insert type. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="azureTableInsertType")
        private final @Nullable Object azureTableInsertType;

    public Optional<Object> getAzureTableInsertType() {
        return this.azureTableInsertType == null ? Optional.empty() : Optional.ofNullable(this.azureTableInsertType);
    }

    /**
     * Azure Table partition key name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="azureTablePartitionKeyName")
        private final @Nullable Object azureTablePartitionKeyName;

    public Optional<Object> getAzureTablePartitionKeyName() {
        return this.azureTablePartitionKeyName == null ? Optional.empty() : Optional.ofNullable(this.azureTablePartitionKeyName);
    }

    /**
     * Azure Table row key name. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="azureTableRowKeyName")
        private final @Nullable Object azureTableRowKeyName;

    public Optional<Object> getAzureTableRowKeyName() {
        return this.azureTableRowKeyName == null ? Optional.empty() : Optional.ofNullable(this.azureTableRowKeyName);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
        private final @Nullable Object disableMetricsCollection;

    public Optional<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
        private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sinkRetryCount")
        private final @Nullable Object sinkRetryCount;

    public Optional<Object> getSinkRetryCount() {
        return this.sinkRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sinkRetryCount);
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sinkRetryWait")
        private final @Nullable Object sinkRetryWait;

    public Optional<Object> getSinkRetryWait() {
        return this.sinkRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sinkRetryWait);
    }

    /**
     * Copy sink type.
     * Expected value is 'AzureTableSink'.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @InputImport(name="writeBatchSize")
        private final @Nullable Object writeBatchSize;

    public Optional<Object> getWriteBatchSize() {
        return this.writeBatchSize == null ? Optional.empty() : Optional.ofNullable(this.writeBatchSize);
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="writeBatchTimeout")
        private final @Nullable Object writeBatchTimeout;

    public Optional<Object> getWriteBatchTimeout() {
        return this.writeBatchTimeout == null ? Optional.empty() : Optional.ofNullable(this.writeBatchTimeout);
    }

    public AzureTableSinkResponse(
        @Nullable Object azureTableDefaultPartitionKeyValue,
        @Nullable Object azureTableInsertType,
        @Nullable Object azureTablePartitionKeyName,
        @Nullable Object azureTableRowKeyName,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object sinkRetryCount,
        @Nullable Object sinkRetryWait,
        String type,
        @Nullable Object writeBatchSize,
        @Nullable Object writeBatchTimeout) {
        this.azureTableDefaultPartitionKeyValue = azureTableDefaultPartitionKeyValue;
        this.azureTableInsertType = azureTableInsertType;
        this.azureTablePartitionKeyName = azureTablePartitionKeyName;
        this.azureTableRowKeyName = azureTableRowKeyName;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.sinkRetryCount = sinkRetryCount;
        this.sinkRetryWait = sinkRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.writeBatchSize = writeBatchSize;
        this.writeBatchTimeout = writeBatchTimeout;
    }

    private AzureTableSinkResponse() {
        this.azureTableDefaultPartitionKeyValue = null;
        this.azureTableInsertType = null;
        this.azureTablePartitionKeyName = null;
        this.azureTableRowKeyName = null;
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.sinkRetryCount = null;
        this.sinkRetryWait = null;
        this.type = null;
        this.writeBatchSize = null;
        this.writeBatchTimeout = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureTableSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object azureTableDefaultPartitionKeyValue;
        private @Nullable Object azureTableInsertType;
        private @Nullable Object azureTablePartitionKeyName;
        private @Nullable Object azureTableRowKeyName;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object sinkRetryCount;
        private @Nullable Object sinkRetryWait;
        private String type;
        private @Nullable Object writeBatchSize;
        private @Nullable Object writeBatchTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureTableSinkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureTableDefaultPartitionKeyValue = defaults.azureTableDefaultPartitionKeyValue;
    	      this.azureTableInsertType = defaults.azureTableInsertType;
    	      this.azureTablePartitionKeyName = defaults.azureTablePartitionKeyName;
    	      this.azureTableRowKeyName = defaults.azureTableRowKeyName;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.sinkRetryCount = defaults.sinkRetryCount;
    	      this.sinkRetryWait = defaults.sinkRetryWait;
    	      this.type = defaults.type;
    	      this.writeBatchSize = defaults.writeBatchSize;
    	      this.writeBatchTimeout = defaults.writeBatchTimeout;
        }

        public Builder setAzureTableDefaultPartitionKeyValue(@Nullable Object azureTableDefaultPartitionKeyValue) {
            this.azureTableDefaultPartitionKeyValue = azureTableDefaultPartitionKeyValue;
            return this;
        }

        public Builder setAzureTableInsertType(@Nullable Object azureTableInsertType) {
            this.azureTableInsertType = azureTableInsertType;
            return this;
        }

        public Builder setAzureTablePartitionKeyName(@Nullable Object azureTablePartitionKeyName) {
            this.azureTablePartitionKeyName = azureTablePartitionKeyName;
            return this;
        }

        public Builder setAzureTableRowKeyName(@Nullable Object azureTableRowKeyName) {
            this.azureTableRowKeyName = azureTableRowKeyName;
            return this;
        }

        public Builder setDisableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder setMaxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder setSinkRetryCount(@Nullable Object sinkRetryCount) {
            this.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder setSinkRetryWait(@Nullable Object sinkRetryWait) {
            this.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWriteBatchSize(@Nullable Object writeBatchSize) {
            this.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder setWriteBatchTimeout(@Nullable Object writeBatchTimeout) {
            this.writeBatchTimeout = writeBatchTimeout;
            return this;
        }
        public AzureTableSinkResponse build() {
            return new AzureTableSinkResponse(azureTableDefaultPartitionKeyValue, azureTableInsertType, azureTablePartitionKeyName, azureTableRowKeyName, disableMetricsCollection, maxConcurrentConnections, sinkRetryCount, sinkRetryWait, type, writeBatchSize, writeBatchTimeout);
        }
    }
}
