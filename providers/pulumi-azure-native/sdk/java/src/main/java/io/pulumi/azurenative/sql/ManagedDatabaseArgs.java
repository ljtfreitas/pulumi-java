// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.sql.enums.CatalogCollationType;
import io.pulumi.azurenative.sql.enums.ManagedDatabaseCreateMode;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedDatabaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedDatabaseArgs Empty = new ManagedDatabaseArgs();

    /**
     * Whether to auto complete restore of this managed database.
     * 
     */
    @InputImport(name="autoCompleteRestore")
        private final @Nullable Input<Boolean> autoCompleteRestore;

    public Input<Boolean> getAutoCompleteRestore() {
        return this.autoCompleteRestore == null ? Input.empty() : this.autoCompleteRestore;
    }

    /**
     * Collation of the metadata catalog.
     * 
     */
    @InputImport(name="catalogCollation")
        private final @Nullable Input<Either<String,CatalogCollationType>> catalogCollation;

    public Input<Either<String,CatalogCollationType>> getCatalogCollation() {
        return this.catalogCollation == null ? Input.empty() : this.catalogCollation;
    }

    /**
     * Collation of the managed database.
     * 
     */
    @InputImport(name="collation")
        private final @Nullable Input<String> collation;

    public Input<String> getCollation() {
        return this.collation == null ? Input.empty() : this.collation;
    }

    /**
     * Managed database create mode. PointInTimeRestore: Create a database by restoring a point in time backup of an existing database. SourceDatabaseName, SourceManagedInstanceName and PointInTime must be specified. RestoreExternalBackup: Create a database by restoring from external backup files. Collation, StorageContainerUri and StorageContainerSasToken must be specified. Recovery: Creates a database by restoring a geo-replicated backup. RecoverableDatabaseId must be specified as the recoverable database resource ID to restore. RestoreLongTermRetentionBackup: Create a database by restoring from a long term retention backup (longTermRetentionBackupResourceId required).
     * 
     */
    @InputImport(name="createMode")
        private final @Nullable Input<Either<String,ManagedDatabaseCreateMode>> createMode;

    public Input<Either<String,ManagedDatabaseCreateMode>> getCreateMode() {
        return this.createMode == null ? Input.empty() : this.createMode;
    }

    /**
     * The name of the database.
     * 
     */
    @InputImport(name="databaseName")
        private final @Nullable Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName == null ? Input.empty() : this.databaseName;
    }

    /**
     * Last backup file name for restore of this managed database.
     * 
     */
    @InputImport(name="lastBackupName")
        private final @Nullable Input<String> lastBackupName;

    public Input<String> getLastBackupName() {
        return this.lastBackupName == null ? Input.empty() : this.lastBackupName;
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
     * The name of the Long Term Retention backup to be used for restore of this managed database.
     * 
     */
    @InputImport(name="longTermRetentionBackupResourceId")
        private final @Nullable Input<String> longTermRetentionBackupResourceId;

    public Input<String> getLongTermRetentionBackupResourceId() {
        return this.longTermRetentionBackupResourceId == null ? Input.empty() : this.longTermRetentionBackupResourceId;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @InputImport(name="managedInstanceName", required=true)
        private final Input<String> managedInstanceName;

    public Input<String> getManagedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The resource identifier of the recoverable database associated with create operation of this database.
     * 
     */
    @InputImport(name="recoverableDatabaseId")
        private final @Nullable Input<String> recoverableDatabaseId;

    public Input<String> getRecoverableDatabaseId() {
        return this.recoverableDatabaseId == null ? Input.empty() : this.recoverableDatabaseId;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The restorable dropped database resource id to restore when creating this database.
     * 
     */
    @InputImport(name="restorableDroppedDatabaseId")
        private final @Nullable Input<String> restorableDroppedDatabaseId;

    public Input<String> getRestorableDroppedDatabaseId() {
        return this.restorableDroppedDatabaseId == null ? Input.empty() : this.restorableDroppedDatabaseId;
    }

    /**
     * Conditional. If createMode is PointInTimeRestore, this value is required. Specifies the point in time (ISO8601 format) of the source database that will be restored to create the new database.
     * 
     */
    @InputImport(name="restorePointInTime")
        private final @Nullable Input<String> restorePointInTime;

    public Input<String> getRestorePointInTime() {
        return this.restorePointInTime == null ? Input.empty() : this.restorePointInTime;
    }

    /**
     * The resource identifier of the source database associated with create operation of this database.
     * 
     */
    @InputImport(name="sourceDatabaseId")
        private final @Nullable Input<String> sourceDatabaseId;

    public Input<String> getSourceDatabaseId() {
        return this.sourceDatabaseId == null ? Input.empty() : this.sourceDatabaseId;
    }

    /**
     * Conditional. If createMode is RestoreExternalBackup, this value is required. Specifies the storage container sas token.
     * 
     */
    @InputImport(name="storageContainerSasToken")
        private final @Nullable Input<String> storageContainerSasToken;

    public Input<String> getStorageContainerSasToken() {
        return this.storageContainerSasToken == null ? Input.empty() : this.storageContainerSasToken;
    }

    /**
     * Conditional. If createMode is RestoreExternalBackup, this value is required. Specifies the uri of the storage container where backups for this restore are stored.
     * 
     */
    @InputImport(name="storageContainerUri")
        private final @Nullable Input<String> storageContainerUri;

    public Input<String> getStorageContainerUri() {
        return this.storageContainerUri == null ? Input.empty() : this.storageContainerUri;
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

    public ManagedDatabaseArgs(
        @Nullable Input<Boolean> autoCompleteRestore,
        @Nullable Input<Either<String,CatalogCollationType>> catalogCollation,
        @Nullable Input<String> collation,
        @Nullable Input<Either<String,ManagedDatabaseCreateMode>> createMode,
        @Nullable Input<String> databaseName,
        @Nullable Input<String> lastBackupName,
        @Nullable Input<String> location,
        @Nullable Input<String> longTermRetentionBackupResourceId,
        Input<String> managedInstanceName,
        @Nullable Input<String> recoverableDatabaseId,
        Input<String> resourceGroupName,
        @Nullable Input<String> restorableDroppedDatabaseId,
        @Nullable Input<String> restorePointInTime,
        @Nullable Input<String> sourceDatabaseId,
        @Nullable Input<String> storageContainerSasToken,
        @Nullable Input<String> storageContainerUri,
        @Nullable Input<Map<String,String>> tags) {
        this.autoCompleteRestore = autoCompleteRestore;
        this.catalogCollation = catalogCollation;
        this.collation = collation;
        this.createMode = createMode;
        this.databaseName = databaseName;
        this.lastBackupName = lastBackupName;
        this.location = location;
        this.longTermRetentionBackupResourceId = longTermRetentionBackupResourceId;
        this.managedInstanceName = Objects.requireNonNull(managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
        this.recoverableDatabaseId = recoverableDatabaseId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restorableDroppedDatabaseId = restorableDroppedDatabaseId;
        this.restorePointInTime = restorePointInTime;
        this.sourceDatabaseId = sourceDatabaseId;
        this.storageContainerSasToken = storageContainerSasToken;
        this.storageContainerUri = storageContainerUri;
        this.tags = tags;
    }

    private ManagedDatabaseArgs() {
        this.autoCompleteRestore = Input.empty();
        this.catalogCollation = Input.empty();
        this.collation = Input.empty();
        this.createMode = Input.empty();
        this.databaseName = Input.empty();
        this.lastBackupName = Input.empty();
        this.location = Input.empty();
        this.longTermRetentionBackupResourceId = Input.empty();
        this.managedInstanceName = Input.empty();
        this.recoverableDatabaseId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.restorableDroppedDatabaseId = Input.empty();
        this.restorePointInTime = Input.empty();
        this.sourceDatabaseId = Input.empty();
        this.storageContainerSasToken = Input.empty();
        this.storageContainerUri = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoCompleteRestore;
        private @Nullable Input<Either<String,CatalogCollationType>> catalogCollation;
        private @Nullable Input<String> collation;
        private @Nullable Input<Either<String,ManagedDatabaseCreateMode>> createMode;
        private @Nullable Input<String> databaseName;
        private @Nullable Input<String> lastBackupName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> longTermRetentionBackupResourceId;
        private Input<String> managedInstanceName;
        private @Nullable Input<String> recoverableDatabaseId;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> restorableDroppedDatabaseId;
        private @Nullable Input<String> restorePointInTime;
        private @Nullable Input<String> sourceDatabaseId;
        private @Nullable Input<String> storageContainerSasToken;
        private @Nullable Input<String> storageContainerUri;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedDatabaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCompleteRestore = defaults.autoCompleteRestore;
    	      this.catalogCollation = defaults.catalogCollation;
    	      this.collation = defaults.collation;
    	      this.createMode = defaults.createMode;
    	      this.databaseName = defaults.databaseName;
    	      this.lastBackupName = defaults.lastBackupName;
    	      this.location = defaults.location;
    	      this.longTermRetentionBackupResourceId = defaults.longTermRetentionBackupResourceId;
    	      this.managedInstanceName = defaults.managedInstanceName;
    	      this.recoverableDatabaseId = defaults.recoverableDatabaseId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorableDroppedDatabaseId = defaults.restorableDroppedDatabaseId;
    	      this.restorePointInTime = defaults.restorePointInTime;
    	      this.sourceDatabaseId = defaults.sourceDatabaseId;
    	      this.storageContainerSasToken = defaults.storageContainerSasToken;
    	      this.storageContainerUri = defaults.storageContainerUri;
    	      this.tags = defaults.tags;
        }

        public Builder setAutoCompleteRestore(@Nullable Input<Boolean> autoCompleteRestore) {
            this.autoCompleteRestore = autoCompleteRestore;
            return this;
        }

        public Builder setAutoCompleteRestore(@Nullable Boolean autoCompleteRestore) {
            this.autoCompleteRestore = Input.ofNullable(autoCompleteRestore);
            return this;
        }

        public Builder setCatalogCollation(@Nullable Input<Either<String,CatalogCollationType>> catalogCollation) {
            this.catalogCollation = catalogCollation;
            return this;
        }

        public Builder setCatalogCollation(@Nullable Either<String,CatalogCollationType> catalogCollation) {
            this.catalogCollation = Input.ofNullable(catalogCollation);
            return this;
        }

        public Builder setCollation(@Nullable Input<String> collation) {
            this.collation = collation;
            return this;
        }

        public Builder setCollation(@Nullable String collation) {
            this.collation = Input.ofNullable(collation);
            return this;
        }

        public Builder setCreateMode(@Nullable Input<Either<String,ManagedDatabaseCreateMode>> createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder setCreateMode(@Nullable Either<String,ManagedDatabaseCreateMode> createMode) {
            this.createMode = Input.ofNullable(createMode);
            return this;
        }

        public Builder setDatabaseName(@Nullable Input<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public Builder setDatabaseName(@Nullable String databaseName) {
            this.databaseName = Input.ofNullable(databaseName);
            return this;
        }

        public Builder setLastBackupName(@Nullable Input<String> lastBackupName) {
            this.lastBackupName = lastBackupName;
            return this;
        }

        public Builder setLastBackupName(@Nullable String lastBackupName) {
            this.lastBackupName = Input.ofNullable(lastBackupName);
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

        public Builder setLongTermRetentionBackupResourceId(@Nullable Input<String> longTermRetentionBackupResourceId) {
            this.longTermRetentionBackupResourceId = longTermRetentionBackupResourceId;
            return this;
        }

        public Builder setLongTermRetentionBackupResourceId(@Nullable String longTermRetentionBackupResourceId) {
            this.longTermRetentionBackupResourceId = Input.ofNullable(longTermRetentionBackupResourceId);
            return this;
        }

        public Builder setManagedInstanceName(Input<String> managedInstanceName) {
            this.managedInstanceName = Objects.requireNonNull(managedInstanceName);
            return this;
        }

        public Builder setManagedInstanceName(String managedInstanceName) {
            this.managedInstanceName = Input.of(Objects.requireNonNull(managedInstanceName));
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

        public Builder setRestorableDroppedDatabaseId(@Nullable Input<String> restorableDroppedDatabaseId) {
            this.restorableDroppedDatabaseId = restorableDroppedDatabaseId;
            return this;
        }

        public Builder setRestorableDroppedDatabaseId(@Nullable String restorableDroppedDatabaseId) {
            this.restorableDroppedDatabaseId = Input.ofNullable(restorableDroppedDatabaseId);
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

        public Builder setSourceDatabaseId(@Nullable Input<String> sourceDatabaseId) {
            this.sourceDatabaseId = sourceDatabaseId;
            return this;
        }

        public Builder setSourceDatabaseId(@Nullable String sourceDatabaseId) {
            this.sourceDatabaseId = Input.ofNullable(sourceDatabaseId);
            return this;
        }

        public Builder setStorageContainerSasToken(@Nullable Input<String> storageContainerSasToken) {
            this.storageContainerSasToken = storageContainerSasToken;
            return this;
        }

        public Builder setStorageContainerSasToken(@Nullable String storageContainerSasToken) {
            this.storageContainerSasToken = Input.ofNullable(storageContainerSasToken);
            return this;
        }

        public Builder setStorageContainerUri(@Nullable Input<String> storageContainerUri) {
            this.storageContainerUri = storageContainerUri;
            return this;
        }

        public Builder setStorageContainerUri(@Nullable String storageContainerUri) {
            this.storageContainerUri = Input.ofNullable(storageContainerUri);
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
        public ManagedDatabaseArgs build() {
            return new ManagedDatabaseArgs(autoCompleteRestore, catalogCollation, collation, createMode, databaseName, lastBackupName, location, longTermRetentionBackupResourceId, managedInstanceName, recoverableDatabaseId, resourceGroupName, restorableDroppedDatabaseId, restorePointInTime, sourceDatabaseId, storageContainerSasToken, storageContainerUri, tags);
        }
    }
}
