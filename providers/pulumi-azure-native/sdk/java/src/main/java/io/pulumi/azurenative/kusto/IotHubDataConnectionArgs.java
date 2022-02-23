// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.kusto.enums.IotHubDataFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IotHubDataConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final IotHubDataConnectionArgs Empty = new IotHubDataConnectionArgs();

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
     * The iot hub consumer group.
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
        private final @Nullable Input<Either<String,IotHubDataFormat>> dataFormat;

    public Input<Either<String,IotHubDataFormat>> getDataFormat() {
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
     * System properties of the iot hub
     * 
     */
    @InputImport(name="eventSystemProperties")
        private final @Nullable Input<List<String>> eventSystemProperties;

    public Input<List<String>> getEventSystemProperties() {
        return this.eventSystemProperties == null ? Input.empty() : this.eventSystemProperties;
    }

    /**
     * The resource ID of the Iot hub to be used to create a data connection.
     * 
     */
    @InputImport(name="iotHubResourceId", required=true)
        private final Input<String> iotHubResourceId;

    public Input<String> getIotHubResourceId() {
        return this.iotHubResourceId;
    }

    /**
     * Kind of the endpoint for the data connection
     * Expected value is 'IotHub'.
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
     * The name of the share access policy
     * 
     */
    @InputImport(name="sharedAccessPolicyName", required=true)
        private final Input<String> sharedAccessPolicyName;

    public Input<String> getSharedAccessPolicyName() {
        return this.sharedAccessPolicyName;
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

    public IotHubDataConnectionArgs(
        Input<String> clusterName,
        Input<String> consumerGroup,
        @Nullable Input<String> dataConnectionName,
        @Nullable Input<Either<String,IotHubDataFormat>> dataFormat,
        Input<String> databaseName,
        @Nullable Input<List<String>> eventSystemProperties,
        Input<String> iotHubResourceId,
        Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> mappingRuleName,
        Input<String> resourceGroupName,
        Input<String> sharedAccessPolicyName,
        @Nullable Input<String> tableName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.consumerGroup = Objects.requireNonNull(consumerGroup, "expected parameter 'consumerGroup' to be non-null");
        this.dataConnectionName = dataConnectionName;
        this.dataFormat = dataFormat;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.eventSystemProperties = eventSystemProperties;
        this.iotHubResourceId = Objects.requireNonNull(iotHubResourceId, "expected parameter 'iotHubResourceId' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.mappingRuleName = mappingRuleName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sharedAccessPolicyName = Objects.requireNonNull(sharedAccessPolicyName, "expected parameter 'sharedAccessPolicyName' to be non-null");
        this.tableName = tableName;
    }

    private IotHubDataConnectionArgs() {
        this.clusterName = Input.empty();
        this.consumerGroup = Input.empty();
        this.dataConnectionName = Input.empty();
        this.dataFormat = Input.empty();
        this.databaseName = Input.empty();
        this.eventSystemProperties = Input.empty();
        this.iotHubResourceId = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.mappingRuleName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sharedAccessPolicyName = Input.empty();
        this.tableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubDataConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterName;
        private Input<String> consumerGroup;
        private @Nullable Input<String> dataConnectionName;
        private @Nullable Input<Either<String,IotHubDataFormat>> dataFormat;
        private Input<String> databaseName;
        private @Nullable Input<List<String>> eventSystemProperties;
        private Input<String> iotHubResourceId;
        private Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> mappingRuleName;
        private Input<String> resourceGroupName;
        private Input<String> sharedAccessPolicyName;
        private @Nullable Input<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(IotHubDataConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.consumerGroup = defaults.consumerGroup;
    	      this.dataConnectionName = defaults.dataConnectionName;
    	      this.dataFormat = defaults.dataFormat;
    	      this.databaseName = defaults.databaseName;
    	      this.eventSystemProperties = defaults.eventSystemProperties;
    	      this.iotHubResourceId = defaults.iotHubResourceId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.mappingRuleName = defaults.mappingRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.tableName = defaults.tableName;
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

        public Builder setDataFormat(@Nullable Input<Either<String,IotHubDataFormat>> dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }

        public Builder setDataFormat(@Nullable Either<String,IotHubDataFormat> dataFormat) {
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

        public Builder setEventSystemProperties(@Nullable Input<List<String>> eventSystemProperties) {
            this.eventSystemProperties = eventSystemProperties;
            return this;
        }

        public Builder setEventSystemProperties(@Nullable List<String> eventSystemProperties) {
            this.eventSystemProperties = Input.ofNullable(eventSystemProperties);
            return this;
        }

        public Builder setIotHubResourceId(Input<String> iotHubResourceId) {
            this.iotHubResourceId = Objects.requireNonNull(iotHubResourceId);
            return this;
        }

        public Builder setIotHubResourceId(String iotHubResourceId) {
            this.iotHubResourceId = Input.of(Objects.requireNonNull(iotHubResourceId));
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

        public Builder setSharedAccessPolicyName(Input<String> sharedAccessPolicyName) {
            this.sharedAccessPolicyName = Objects.requireNonNull(sharedAccessPolicyName);
            return this;
        }

        public Builder setSharedAccessPolicyName(String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = Input.of(Objects.requireNonNull(sharedAccessPolicyName));
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
        public IotHubDataConnectionArgs build() {
            return new IotHubDataConnectionArgs(clusterName, consumerGroup, dataConnectionName, dataFormat, databaseName, eventSystemProperties, iotHubResourceId, kind, location, mappingRuleName, resourceGroupName, sharedAccessPolicyName, tableName);
        }
    }
}
