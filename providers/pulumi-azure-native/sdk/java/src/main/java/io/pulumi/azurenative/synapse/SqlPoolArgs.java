// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.synapse.enums.CreateMode;
import io.pulumi.azurenative.synapse.enums.StorageAccountType;
import io.pulumi.azurenative.synapse.inputs.SkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlPoolArgs Empty = new SqlPoolArgs();

    /**
     * Collation mode
     * 
     */
    @InputImport(name="collation")
    private final @Nullable Input<String> collation;

    public Input<String> getCollation() {
        return this.collation == null ? Input.empty() : this.collation;
    }

    /**
     * Specifies the mode of sql pool creation.
     * 
     * Default: regular sql pool creation.
     * 
     * PointInTimeRestore: Creates a sql pool by restoring a point in time backup of an existing sql pool. sourceDatabaseId must be specified as the resource ID of the existing sql pool, and restorePointInTime must be specified.
     * 
     * Recovery: Creates a sql pool by a geo-replicated backup. sourceDatabaseId  must be specified as the recoverableDatabaseId to restore.
     * 
     * Restore: Creates a sql pool by restoring a backup of a deleted sql  pool. SourceDatabaseId should be the sql pool's original resource ID. SourceDatabaseId and sourceDatabaseDeletionDate must be specified.
     * 
     */
    @InputImport(name="createMode")
    private final @Nullable Input<Either<String,CreateMode>> createMode;

    public Input<Either<String,CreateMode>> getCreateMode() {
        return this.createMode == null ? Input.empty() : this.createMode;
    }

    /**
     * Date the SQL pool was created
     * 
     */
    @InputImport(name="creationDate")
    private final @Nullable Input<String> creationDate;

    public Input<String> getCreationDate() {
        return this.creationDate == null ? Input.empty() : this.creationDate;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Maximum size in bytes
     * 
     */
    @InputImport(name="maxSizeBytes")
    private final @Nullable Input<Double> maxSizeBytes;

    public Input<Double> getMaxSizeBytes() {
        return this.maxSizeBytes == null ? Input.empty() : this.maxSizeBytes;
    }

    /**
     * Resource state
     * 
     */
    @InputImport(name="provisioningState")
    private final @Nullable Input<String> provisioningState;

    public Input<String> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    /**
     * Backup database to restore from
     * 
     */
    @InputImport(name="recoverableDatabaseId")
    private final @Nullable Input<String> recoverableDatabaseId;

    public Input<String> getRecoverableDatabaseId() {
        return this.recoverableDatabaseId == null ? Input.empty() : this.recoverableDatabaseId;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Snapshot time to restore
     * 
     */
    @InputImport(name="restorePointInTime")
    private final @Nullable Input<String> restorePointInTime;

    public Input<String> getRestorePointInTime() {
        return this.restorePointInTime == null ? Input.empty() : this.restorePointInTime;
    }

    /**
     * SQL pool SKU
     * 
     */
    @InputImport(name="sku")
    private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Source database to create from
     * 
     */
    @InputImport(name="sourceDatabaseId")
    private final @Nullable Input<String> sourceDatabaseId;

    public Input<String> getSourceDatabaseId() {
        return this.sourceDatabaseId == null ? Input.empty() : this.sourceDatabaseId;
    }

    /**
     * SQL pool name
     * 
     */
    @InputImport(name="sqlPoolName")
    private final @Nullable Input<String> sqlPoolName;

    public Input<String> getSqlPoolName() {
        return this.sqlPoolName == null ? Input.empty() : this.sqlPoolName;
    }

    /**
     * Resource status
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The storage account type used to store backups for this sql pool.
     * 
     */
    @InputImport(name="storageAccountType")
    private final @Nullable Input<Either<String,StorageAccountType>> storageAccountType;

    public Input<Either<String,StorageAccountType>> getStorageAccountType() {
        return this.storageAccountType == null ? Input.empty() : this.storageAccountType;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the workspace
     * 
     */
    @InputImport(name="workspaceName", required=true)
    private final Input<String> workspaceName;

    public Input<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public SqlPoolArgs(
        @Nullable Input<String> collation,
        @Nullable Input<Either<String,CreateMode>> createMode,
        @Nullable Input<String> creationDate,
        @Nullable Input<String> location,
        @Nullable Input<Double> maxSizeBytes,
        @Nullable Input<String> provisioningState,
        @Nullable Input<String> recoverableDatabaseId,
        Input<String> resourceGroupName,
        @Nullable Input<String> restorePointInTime,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<String> sourceDatabaseId,
        @Nullable Input<String> sqlPoolName,
        @Nullable Input<String> status,
        @Nullable Input<Either<String,StorageAccountType>> storageAccountType,
        @Nullable Input<Map<String,String>> tags,
        Input<String> workspaceName) {
        this.collation = collation;
        this.createMode = createMode;
        this.creationDate = creationDate;
        this.location = location;
        this.maxSizeBytes = maxSizeBytes;
        this.provisioningState = provisioningState;
        this.recoverableDatabaseId = recoverableDatabaseId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restorePointInTime = restorePointInTime;
        this.sku = sku;
        this.sourceDatabaseId = sourceDatabaseId;
        this.sqlPoolName = sqlPoolName;
        this.status = status;
        this.storageAccountType = storageAccountType;
        this.tags = tags;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private SqlPoolArgs() {
        this.collation = Input.empty();
        this.createMode = Input.empty();
        this.creationDate = Input.empty();
        this.location = Input.empty();
        this.maxSizeBytes = Input.empty();
        this.provisioningState = Input.empty();
        this.recoverableDatabaseId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.restorePointInTime = Input.empty();
        this.sku = Input.empty();
        this.sourceDatabaseId = Input.empty();
        this.sqlPoolName = Input.empty();
        this.status = Input.empty();
        this.storageAccountType = Input.empty();
        this.tags = Input.empty();
        this.workspaceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> collation;
        private @Nullable Input<Either<String,CreateMode>> createMode;
        private @Nullable Input<String> creationDate;
        private @Nullable Input<String> location;
        private @Nullable Input<Double> maxSizeBytes;
        private @Nullable Input<String> provisioningState;
        private @Nullable Input<String> recoverableDatabaseId;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> restorePointInTime;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<String> sourceDatabaseId;
        private @Nullable Input<String> sqlPoolName;
        private @Nullable Input<String> status;
        private @Nullable Input<Either<String,StorageAccountType>> storageAccountType;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collation = defaults.collation;
    	      this.createMode = defaults.createMode;
    	      this.creationDate = defaults.creationDate;
    	      this.location = defaults.location;
    	      this.maxSizeBytes = defaults.maxSizeBytes;
    	      this.provisioningState = defaults.provisioningState;
    	      this.recoverableDatabaseId = defaults.recoverableDatabaseId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorePointInTime = defaults.restorePointInTime;
    	      this.sku = defaults.sku;
    	      this.sourceDatabaseId = defaults.sourceDatabaseId;
    	      this.sqlPoolName = defaults.sqlPoolName;
    	      this.status = defaults.status;
    	      this.storageAccountType = defaults.storageAccountType;
    	      this.tags = defaults.tags;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder setCollation(@Nullable Input<String> collation) {
            this.collation = collation;
            return this;
        }

        public Builder setCollation(@Nullable String collation) {
            this.collation = Input.ofNullable(collation);
            return this;
        }

        public Builder setCreateMode(@Nullable Input<Either<String,CreateMode>> createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder setCreateMode(@Nullable Either<String,CreateMode> createMode) {
            this.createMode = Input.ofNullable(createMode);
            return this;
        }

        public Builder setCreationDate(@Nullable Input<String> creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public Builder setCreationDate(@Nullable String creationDate) {
            this.creationDate = Input.ofNullable(creationDate);
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

        public Builder setMaxSizeBytes(@Nullable Input<Double> maxSizeBytes) {
            this.maxSizeBytes = maxSizeBytes;
            return this;
        }

        public Builder setMaxSizeBytes(@Nullable Double maxSizeBytes) {
            this.maxSizeBytes = Input.ofNullable(maxSizeBytes);
            return this;
        }

        public Builder setProvisioningState(@Nullable Input<String> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
            return this;
        }

        public Builder setRecoverableDatabaseId(@Nullable Input<String> recoverableDatabaseId) {
            this.recoverableDatabaseId = recoverableDatabaseId;
            return this;
        }

        public Builder setRecoverableDatabaseId(@Nullable String recoverableDatabaseId) {
            this.recoverableDatabaseId = Input.ofNullable(recoverableDatabaseId);
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

        public Builder setRestorePointInTime(@Nullable Input<String> restorePointInTime) {
            this.restorePointInTime = restorePointInTime;
            return this;
        }

        public Builder setRestorePointInTime(@Nullable String restorePointInTime) {
            this.restorePointInTime = Input.ofNullable(restorePointInTime);
            return this;
        }

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setSourceDatabaseId(@Nullable Input<String> sourceDatabaseId) {
            this.sourceDatabaseId = sourceDatabaseId;
            return this;
        }

        public Builder setSourceDatabaseId(@Nullable String sourceDatabaseId) {
            this.sourceDatabaseId = Input.ofNullable(sourceDatabaseId);
            return this;
        }

        public Builder setSqlPoolName(@Nullable Input<String> sqlPoolName) {
            this.sqlPoolName = sqlPoolName;
            return this;
        }

        public Builder setSqlPoolName(@Nullable String sqlPoolName) {
            this.sqlPoolName = Input.ofNullable(sqlPoolName);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setStorageAccountType(@Nullable Input<Either<String,StorageAccountType>> storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }

        public Builder setStorageAccountType(@Nullable Either<String,StorageAccountType> storageAccountType) {
            this.storageAccountType = Input.ofNullable(storageAccountType);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setWorkspaceName(Input<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder setWorkspaceName(String workspaceName) {
            this.workspaceName = Input.of(Objects.requireNonNull(workspaceName));
            return this;
        }

        public SqlPoolArgs build() {
            return new SqlPoolArgs(collation, createMode, creationDate, location, maxSizeBytes, provisioningState, recoverableDatabaseId, resourceGroupName, restorePointInTime, sku, sourceDatabaseId, sqlPoolName, status, storageAccountType, tags, workspaceName);
        }
    }
}
