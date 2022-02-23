// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.kusto.enums.BlobStorageEventType;
import io.pulumi.azurenative.kusto.enums.EventGridDataFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventGridDataConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventGridDataConnectionArgs Empty = new EventGridDataConnectionArgs();

    /**
     * The name of blob storage event type to process.
     * 
     */
    @InputImport(name="blobStorageEventType")
        private final @Nullable Input<Either<String,BlobStorageEventType>> blobStorageEventType;

    public Input<Either<String,BlobStorageEventType>> getBlobStorageEventType() {
        return this.blobStorageEventType == null ? Input.empty() : this.blobStorageEventType;
    }

    /**
     * The name of the Kusto cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
        private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The event hub consumer group.
     * 
     */
    @InputImport(name="consumerGroup", required=true)
        private final Input<String> consumerGroup;

    public Input<String> getConsumerGroup() {
        return this.consumerGroup;
    }

    /**
     * The name of the data connection.
     * 
     */
    @InputImport(name="dataConnectionName")
        private final @Nullable Input<String> dataConnectionName;

    public Input<String> getDataConnectionName() {
        return this.dataConnectionName == null ? Input.empty() : this.dataConnectionName;
    }

    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    @InputImport(name="dataFormat")
        private final @Nullable Input<Either<String,EventGridDataFormat>> dataFormat;

    public Input<Either<String,EventGridDataFormat>> getDataFormat() {
        return this.dataFormat == null ? Input.empty() : this.dataFormat;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @InputImport(name="databaseName", required=true)
        private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The resource ID where the event grid is configured to send events.
     * 
     */
    @InputImport(name="eventHubResourceId", required=true)
        private final Input<String> eventHubResourceId;

    public Input<String> getEventHubResourceId() {
        return this.eventHubResourceId;
    }

    /**
     * A Boolean value that, if set to true, indicates that ingestion should ignore the first record of every file
     * 
     */
    @InputImport(name="ignoreFirstRecord")
        private final @Nullable Input<Boolean> ignoreFirstRecord;

    public Input<Boolean> getIgnoreFirstRecord() {
        return this.ignoreFirstRecord == null ? Input.empty() : this.ignoreFirstRecord;
    }

    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'EventGrid'.
     * 
     */
    @InputImport(name="kind", required=true)
        private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    @InputImport(name="mappingRuleName")
        private final @Nullable Input<String> mappingRuleName;

    public Input<String> getMappingRuleName() {
        return this.mappingRuleName == null ? Input.empty() : this.mappingRuleName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource ID of the storage account where the data resides.
     * 
     */
    @InputImport(name="storageAccountResourceId", required=true)
        private final Input<String> storageAccountResourceId;

    public Input<String> getStorageAccountResourceId() {
        return this.storageAccountResourceId;
    }

    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    @InputImport(name="tableName")
        private final @Nullable Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName == null ? Input.empty() : this.tableName;
    }

    public EventGridDataConnectionArgs(
        @Nullable Input<Either<String,BlobStorageEventType>> blobStorageEventType,
        Input<String> clusterName,
        Input<String> consumerGroup,
        @Nullable Input<String> dataConnectionName,
        @Nullable Input<Either<String,EventGridDataFormat>> dataFormat,
        Input<String> databaseName,
        Input<String> eventHubResourceId,
        @Nullable Input<Boolean> ignoreFirstRecord,
        Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> mappingRuleName,
        Input<String> resourceGroupName,
        Input<String> storageAccountResourceId,
        @Nullable Input<String> tableName) {
        this.blobStorageEventType = blobStorageEventType;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.consumerGroup = Objects.requireNonNull(consumerGroup, "expected parameter 'consumerGroup' to be non-null");
        this.dataConnectionName = dataConnectionName;
        this.dataFormat = dataFormat;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.eventHubResourceId = Objects.requireNonNull(eventHubResourceId, "expected parameter 'eventHubResourceId' to be non-null");
        this.ignoreFirstRecord = ignoreFirstRecord;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.mappingRuleName = mappingRuleName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccountResourceId = Objects.requireNonNull(storageAccountResourceId, "expected parameter 'storageAccountResourceId' to be non-null");
        this.tableName = tableName;
    }

    private EventGridDataConnectionArgs() {
        this.blobStorageEventType = Input.empty();
        this.clusterName = Input.empty();
        this.consumerGroup = Input.empty();
        this.dataConnectionName = Input.empty();
        this.dataFormat = Input.empty();
        this.databaseName = Input.empty();
        this.eventHubResourceId = Input.empty();
        this.ignoreFirstRecord = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.mappingRuleName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.storageAccountResourceId = Input.empty();
        this.tableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventGridDataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,BlobStorageEventType>> blobStorageEventType;
        private Input<String> clusterName;
        private Input<String> consumerGroup;
        private @Nullable Input<String> dataConnectionName;
        private @Nullable Input<Either<String,EventGridDataFormat>> dataFormat;
        private Input<String> databaseName;
        private Input<String> eventHubResourceId;
        private @Nullable Input<Boolean> ignoreFirstRecord;
        private Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> mappingRuleName;
        private Input<String> resourceGroupName;
        private Input<String> storageAccountResourceId;
        private @Nullable Input<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(EventGridDataConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobStorageEventType = defaults.blobStorageEventType;
    	      this.clusterName = defaults.clusterName;
    	      this.consumerGroup = defaults.consumerGroup;
    	      this.dataConnectionName = defaults.dataConnectionName;
    	      this.dataFormat = defaults.dataFormat;
    	      this.databaseName = defaults.databaseName;
    	      this.eventHubResourceId = defaults.eventHubResourceId;
    	      this.ignoreFirstRecord = defaults.ignoreFirstRecord;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.mappingRuleName = defaults.mappingRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccountResourceId = defaults.storageAccountResourceId;
    	      this.tableName = defaults.tableName;
        }

        public Builder setBlobStorageEventType(@Nullable Input<Either<String,BlobStorageEventType>> blobStorageEventType) {
            this.blobStorageEventType = blobStorageEventType;
            return this;
        }

        public Builder setBlobStorageEventType(@Nullable Either<String,BlobStorageEventType> blobStorageEventType) {
            this.blobStorageEventType = Input.ofNullable(blobStorageEventType);
            return this;
        }

        public Builder setClusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder setConsumerGroup(Input<String> consumerGroup) {
            this.consumerGroup = Objects.requireNonNull(consumerGroup);
            return this;
        }

        public Builder setConsumerGroup(String consumerGroup) {
            this.consumerGroup = Input.of(Objects.requireNonNull(consumerGroup));
            return this;
        }

        public Builder setDataConnectionName(@Nullable Input<String> dataConnectionName) {
            this.dataConnectionName = dataConnectionName;
            return this;
        }

        public Builder setDataConnectionName(@Nullable String dataConnectionName) {
            this.dataConnectionName = Input.ofNullable(dataConnectionName);
            return this;
        }

        public Builder setDataFormat(@Nullable Input<Either<String,EventGridDataFormat>> dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }

        public Builder setDataFormat(@Nullable Either<String,EventGridDataFormat> dataFormat) {
            this.dataFormat = Input.ofNullable(dataFormat);
            return this;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setEventHubResourceId(Input<String> eventHubResourceId) {
            this.eventHubResourceId = Objects.requireNonNull(eventHubResourceId);
            return this;
        }

        public Builder setEventHubResourceId(String eventHubResourceId) {
            this.eventHubResourceId = Input.of(Objects.requireNonNull(eventHubResourceId));
            return this;
        }

        public Builder setIgnoreFirstRecord(@Nullable Input<Boolean> ignoreFirstRecord) {
            this.ignoreFirstRecord = ignoreFirstRecord;
            return this;
        }

        public Builder setIgnoreFirstRecord(@Nullable Boolean ignoreFirstRecord) {
            this.ignoreFirstRecord = Input.ofNullable(ignoreFirstRecord);
            return this;
        }

        public Builder setKind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMappingRuleName(@Nullable Input<String> mappingRuleName) {
            this.mappingRuleName = mappingRuleName;
            return this;
        }

        public Builder setMappingRuleName(@Nullable String mappingRuleName) {
            this.mappingRuleName = Input.ofNullable(mappingRuleName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setStorageAccountResourceId(Input<String> storageAccountResourceId) {
            this.storageAccountResourceId = Objects.requireNonNull(storageAccountResourceId);
            return this;
        }

        public Builder setStorageAccountResourceId(String storageAccountResourceId) {
            this.storageAccountResourceId = Input.of(Objects.requireNonNull(storageAccountResourceId));
            return this;
        }

        public Builder setTableName(@Nullable Input<String> tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder setTableName(@Nullable String tableName) {
            this.tableName = Input.ofNullable(tableName);
            return this;
        }
        public EventGridDataConnectionArgs build() {
            return new EventGridDataConnectionArgs(blobStorageEventType, clusterName, consumerGroup, dataConnectionName, dataFormat, databaseName, eventHubResourceId, ignoreFirstRecord, kind, location, mappingRuleName, resourceGroupName, storageAccountResourceId, tableName);
        }
    }
}
