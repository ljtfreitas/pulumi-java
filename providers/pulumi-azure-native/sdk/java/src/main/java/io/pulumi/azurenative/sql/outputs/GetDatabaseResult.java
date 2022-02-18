// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDatabaseResult {
    /**
     * Time in minutes after which database is automatically paused. A value of -1 means that automatic pause is disabled
     * 
     */
    private final @Nullable Integer autoPauseDelay;
    /**
     * Collation of the metadata catalog.
     * 
     */
    private final @Nullable String catalogCollation;
    /**
     * The collation of the database.
     * 
     */
    private final @Nullable String collation;
    /**
     * The creation date of the database (ISO8601 format).
     * 
     */
    private final String creationDate;
    /**
     * The storage account type used to store backups for this database.
     * 
     */
    private final String currentBackupStorageRedundancy;
    /**
     * The current service level objective name of the database.
     * 
     */
    private final String currentServiceObjectiveName;
    /**
     * The name and tier of the SKU.
     * 
     */
    private final SkuResponse currentSku;
    /**
     * The ID of the database.
     * 
     */
    private final String databaseId;
    /**
     * The default secondary region for this database.
     * 
     */
    private final String defaultSecondaryLocation;
    /**
     * This records the earliest start date and time that restore is available for this database (ISO8601 format).
     * 
     */
    private final String earliestRestoreDate;
    /**
     * The resource identifier of the elastic pool containing this database.
     * 
     */
    private final @Nullable String elasticPoolId;
    /**
     * Failover Group resource identifier that this database belongs to.
     * 
     */
    private final String failoverGroupId;
    /**
     * The number of secondary replicas associated with the database that are used to provide high availability.
     * 
     */
    private final @Nullable Integer highAvailabilityReplicaCount;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Kind of database. This is metadata used for the Azure portal experience.
     * 
     */
    private final String kind;
    /**
     * The license type to apply for this database. `LicenseIncluded` if you need a license, or `BasePrice` if you have a license and are eligible for the Azure Hybrid Benefit.
     * 
     */
    private final @Nullable String licenseType;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Maintenance configuration id assigned to the database. This configuration defines the period when the maintenance updates will occur.
     * 
     */
    private final @Nullable String maintenanceConfigurationId;
    /**
     * Resource that manages the database.
     * 
     */
    private final String managedBy;
    /**
     * The max log size for this database.
     * 
     */
    private final Double maxLogSizeBytes;
    /**
     * The max size of the database expressed in bytes.
     * 
     */
    private final @Nullable Double maxSizeBytes;
    /**
     * Minimal capacity that database will always have allocated, if not paused
     * 
     */
    private final @Nullable Double minCapacity;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The date when database was paused by user configuration or action(ISO8601 format). Null if the database is ready.
     * 
     */
    private final String pausedDate;
    /**
     * The state of read-only routing. If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica in the same region.
     * 
     */
    private final @Nullable String readScale;
    /**
     * The storage account type to be used to store backups for this database.
     * 
     */
    private final @Nullable String requestedBackupStorageRedundancy;
    /**
     * The requested service level objective name of the database.
     * 
     */
    private final String requestedServiceObjectiveName;
    /**
     * The date when database was resumed by user action or database login (ISO8601 format). Null if the database is paused.
     * 
     */
    private final String resumedDate;
    /**
     * The secondary type of the database if it is a secondary.  Valid values are Geo and Named.
     * 
     */
    private final @Nullable String secondaryType;
    /**
     * The database SKU.
     * 
     * The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or one of the following commands:
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * The status of the database.
     * 
     */
    private final String status;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones.
     * 
     */
    private final @Nullable Boolean zoneRedundant;

    @OutputCustomType.Constructor({"autoPauseDelay","catalogCollation","collation","creationDate","currentBackupStorageRedundancy","currentServiceObjectiveName","currentSku","databaseId","defaultSecondaryLocation","earliestRestoreDate","elasticPoolId","failoverGroupId","highAvailabilityReplicaCount","id","kind","licenseType","location","maintenanceConfigurationId","managedBy","maxLogSizeBytes","maxSizeBytes","minCapacity","name","pausedDate","readScale","requestedBackupStorageRedundancy","requestedServiceObjectiveName","resumedDate","secondaryType","sku","status","tags","type","zoneRedundant"})
    private GetDatabaseResult(
        @Nullable Integer autoPauseDelay,
        @Nullable String catalogCollation,
        @Nullable String collation,
        String creationDate,
        String currentBackupStorageRedundancy,
        String currentServiceObjectiveName,
        SkuResponse currentSku,
        String databaseId,
        String defaultSecondaryLocation,
        String earliestRestoreDate,
        @Nullable String elasticPoolId,
        String failoverGroupId,
        @Nullable Integer highAvailabilityReplicaCount,
        String id,
        String kind,
        @Nullable String licenseType,
        String location,
        @Nullable String maintenanceConfigurationId,
        String managedBy,
        Double maxLogSizeBytes,
        @Nullable Double maxSizeBytes,
        @Nullable Double minCapacity,
        String name,
        String pausedDate,
        @Nullable String readScale,
        @Nullable String requestedBackupStorageRedundancy,
        String requestedServiceObjectiveName,
        String resumedDate,
        @Nullable String secondaryType,
        @Nullable SkuResponse sku,
        String status,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable Boolean zoneRedundant) {
        this.autoPauseDelay = autoPauseDelay;
        this.catalogCollation = catalogCollation;
        this.collation = collation;
        this.creationDate = Objects.requireNonNull(creationDate);
        this.currentBackupStorageRedundancy = Objects.requireNonNull(currentBackupStorageRedundancy);
        this.currentServiceObjectiveName = Objects.requireNonNull(currentServiceObjectiveName);
        this.currentSku = Objects.requireNonNull(currentSku);
        this.databaseId = Objects.requireNonNull(databaseId);
        this.defaultSecondaryLocation = Objects.requireNonNull(defaultSecondaryLocation);
        this.earliestRestoreDate = Objects.requireNonNull(earliestRestoreDate);
        this.elasticPoolId = elasticPoolId;
        this.failoverGroupId = Objects.requireNonNull(failoverGroupId);
        this.highAvailabilityReplicaCount = highAvailabilityReplicaCount;
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.licenseType = licenseType;
        this.location = Objects.requireNonNull(location);
        this.maintenanceConfigurationId = maintenanceConfigurationId;
        this.managedBy = Objects.requireNonNull(managedBy);
        this.maxLogSizeBytes = Objects.requireNonNull(maxLogSizeBytes);
        this.maxSizeBytes = maxSizeBytes;
        this.minCapacity = minCapacity;
        this.name = Objects.requireNonNull(name);
        this.pausedDate = Objects.requireNonNull(pausedDate);
        this.readScale = readScale;
        this.requestedBackupStorageRedundancy = requestedBackupStorageRedundancy;
        this.requestedServiceObjectiveName = Objects.requireNonNull(requestedServiceObjectiveName);
        this.resumedDate = Objects.requireNonNull(resumedDate);
        this.secondaryType = secondaryType;
        this.sku = sku;
        this.status = Objects.requireNonNull(status);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.zoneRedundant = zoneRedundant;
    }

    /**
     * Time in minutes after which database is automatically paused. A value of -1 means that automatic pause is disabled
     * 
     */
    public Optional<Integer> getAutoPauseDelay() {
        return Optional.ofNullable(this.autoPauseDelay);
    }
    /**
     * Collation of the metadata catalog.
     * 
     */
    public Optional<String> getCatalogCollation() {
        return Optional.ofNullable(this.catalogCollation);
    }
    /**
     * The collation of the database.
     * 
     */
    public Optional<String> getCollation() {
        return Optional.ofNullable(this.collation);
    }
    /**
     * The creation date of the database (ISO8601 format).
     * 
     */
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * The storage account type used to store backups for this database.
     * 
     */
    public String getCurrentBackupStorageRedundancy() {
        return this.currentBackupStorageRedundancy;
    }
    /**
     * The current service level objective name of the database.
     * 
     */
    public String getCurrentServiceObjectiveName() {
        return this.currentServiceObjectiveName;
    }
    /**
     * The name and tier of the SKU.
     * 
     */
    public SkuResponse getCurrentSku() {
        return this.currentSku;
    }
    /**
     * The ID of the database.
     * 
     */
    public String getDatabaseId() {
        return this.databaseId;
    }
    /**
     * The default secondary region for this database.
     * 
     */
    public String getDefaultSecondaryLocation() {
        return this.defaultSecondaryLocation;
    }
    /**
     * This records the earliest start date and time that restore is available for this database (ISO8601 format).
     * 
     */
    public String getEarliestRestoreDate() {
        return this.earliestRestoreDate;
    }
    /**
     * The resource identifier of the elastic pool containing this database.
     * 
     */
    public Optional<String> getElasticPoolId() {
        return Optional.ofNullable(this.elasticPoolId);
    }
    /**
     * Failover Group resource identifier that this database belongs to.
     * 
     */
    public String getFailoverGroupId() {
        return this.failoverGroupId;
    }
    /**
     * The number of secondary replicas associated with the database that are used to provide high availability.
     * 
     */
    public Optional<Integer> getHighAvailabilityReplicaCount() {
        return Optional.ofNullable(this.highAvailabilityReplicaCount);
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of database. This is metadata used for the Azure portal experience.
     * 
     */
    public String getKind() {
        return this.kind;
    }
    /**
     * The license type to apply for this database. `LicenseIncluded` if you need a license, or `BasePrice` if you have a license and are eligible for the Azure Hybrid Benefit.
     * 
     */
    public Optional<String> getLicenseType() {
        return Optional.ofNullable(this.licenseType);
    }
    /**
     * Resource location.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Maintenance configuration id assigned to the database. This configuration defines the period when the maintenance updates will occur.
     * 
     */
    public Optional<String> getMaintenanceConfigurationId() {
        return Optional.ofNullable(this.maintenanceConfigurationId);
    }
    /**
     * Resource that manages the database.
     * 
     */
    public String getManagedBy() {
        return this.managedBy;
    }
    /**
     * The max log size for this database.
     * 
     */
    public Double getMaxLogSizeBytes() {
        return this.maxLogSizeBytes;
    }
    /**
     * The max size of the database expressed in bytes.
     * 
     */
    public Optional<Double> getMaxSizeBytes() {
        return Optional.ofNullable(this.maxSizeBytes);
    }
    /**
     * Minimal capacity that database will always have allocated, if not paused
     * 
     */
    public Optional<Double> getMinCapacity() {
        return Optional.ofNullable(this.minCapacity);
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The date when database was paused by user configuration or action(ISO8601 format). Null if the database is ready.
     * 
     */
    public String getPausedDate() {
        return this.pausedDate;
    }
    /**
     * The state of read-only routing. If enabled, connections that have application intent set to readonly in their connection string may be routed to a readonly secondary replica in the same region.
     * 
     */
    public Optional<String> getReadScale() {
        return Optional.ofNullable(this.readScale);
    }
    /**
     * The storage account type to be used to store backups for this database.
     * 
     */
    public Optional<String> getRequestedBackupStorageRedundancy() {
        return Optional.ofNullable(this.requestedBackupStorageRedundancy);
    }
    /**
     * The requested service level objective name of the database.
     * 
     */
    public String getRequestedServiceObjectiveName() {
        return this.requestedServiceObjectiveName;
    }
    /**
     * The date when database was resumed by user action or database login (ISO8601 format). Null if the database is paused.
     * 
     */
    public String getResumedDate() {
        return this.resumedDate;
    }
    /**
     * The secondary type of the database if it is a secondary.  Valid values are Geo and Named.
     * 
     */
    public Optional<String> getSecondaryType() {
        return Optional.ofNullable(this.secondaryType);
    }
    /**
     * The database SKU.
     * 
     * The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or one of the following commands:
     * 
     */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * The status of the database.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Whether or not this database is zone redundant, which means the replicas of this database will be spread across multiple availability zones.
     * 
     */
    public Optional<Boolean> getZoneRedundant() {
        return Optional.ofNullable(this.zoneRedundant);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer autoPauseDelay;
        private @Nullable String catalogCollation;
        private @Nullable String collation;
        private String creationDate;
        private String currentBackupStorageRedundancy;
        private String currentServiceObjectiveName;
        private SkuResponse currentSku;
        private String databaseId;
        private String defaultSecondaryLocation;
        private String earliestRestoreDate;
        private @Nullable String elasticPoolId;
        private String failoverGroupId;
        private @Nullable Integer highAvailabilityReplicaCount;
        private String id;
        private String kind;
        private @Nullable String licenseType;
        private String location;
        private @Nullable String maintenanceConfigurationId;
        private String managedBy;
        private Double maxLogSizeBytes;
        private @Nullable Double maxSizeBytes;
        private @Nullable Double minCapacity;
        private String name;
        private String pausedDate;
        private @Nullable String readScale;
        private @Nullable String requestedBackupStorageRedundancy;
        private String requestedServiceObjectiveName;
        private String resumedDate;
        private @Nullable String secondaryType;
        private @Nullable SkuResponse sku;
        private String status;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable Boolean zoneRedundant;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoPauseDelay = defaults.autoPauseDelay;
    	      this.catalogCollation = defaults.catalogCollation;
    	      this.collation = defaults.collation;
    	      this.creationDate = defaults.creationDate;
    	      this.currentBackupStorageRedundancy = defaults.currentBackupStorageRedundancy;
    	      this.currentServiceObjectiveName = defaults.currentServiceObjectiveName;
    	      this.currentSku = defaults.currentSku;
    	      this.databaseId = defaults.databaseId;
    	      this.defaultSecondaryLocation = defaults.defaultSecondaryLocation;
    	      this.earliestRestoreDate = defaults.earliestRestoreDate;
    	      this.elasticPoolId = defaults.elasticPoolId;
    	      this.failoverGroupId = defaults.failoverGroupId;
    	      this.highAvailabilityReplicaCount = defaults.highAvailabilityReplicaCount;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.licenseType = defaults.licenseType;
    	      this.location = defaults.location;
    	      this.maintenanceConfigurationId = defaults.maintenanceConfigurationId;
    	      this.managedBy = defaults.managedBy;
    	      this.maxLogSizeBytes = defaults.maxLogSizeBytes;
    	      this.maxSizeBytes = defaults.maxSizeBytes;
    	      this.minCapacity = defaults.minCapacity;
    	      this.name = defaults.name;
    	      this.pausedDate = defaults.pausedDate;
    	      this.readScale = defaults.readScale;
    	      this.requestedBackupStorageRedundancy = defaults.requestedBackupStorageRedundancy;
    	      this.requestedServiceObjectiveName = defaults.requestedServiceObjectiveName;
    	      this.resumedDate = defaults.resumedDate;
    	      this.secondaryType = defaults.secondaryType;
    	      this.sku = defaults.sku;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zoneRedundant = defaults.zoneRedundant;
        }

        public Builder setAutoPauseDelay(@Nullable Integer autoPauseDelay) {
            this.autoPauseDelay = autoPauseDelay;
            return this;
        }

        public Builder setCatalogCollation(@Nullable String catalogCollation) {
            this.catalogCollation = catalogCollation;
            return this;
        }

        public Builder setCollation(@Nullable String collation) {
            this.collation = collation;
            return this;
        }

        public Builder setCreationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder setCurrentBackupStorageRedundancy(String currentBackupStorageRedundancy) {
            this.currentBackupStorageRedundancy = Objects.requireNonNull(currentBackupStorageRedundancy);
            return this;
        }

        public Builder setCurrentServiceObjectiveName(String currentServiceObjectiveName) {
            this.currentServiceObjectiveName = Objects.requireNonNull(currentServiceObjectiveName);
            return this;
        }

        public Builder setCurrentSku(SkuResponse currentSku) {
            this.currentSku = Objects.requireNonNull(currentSku);
            return this;
        }

        public Builder setDatabaseId(String databaseId) {
            this.databaseId = Objects.requireNonNull(databaseId);
            return this;
        }

        public Builder setDefaultSecondaryLocation(String defaultSecondaryLocation) {
            this.defaultSecondaryLocation = Objects.requireNonNull(defaultSecondaryLocation);
            return this;
        }

        public Builder setEarliestRestoreDate(String earliestRestoreDate) {
            this.earliestRestoreDate = Objects.requireNonNull(earliestRestoreDate);
            return this;
        }

        public Builder setElasticPoolId(@Nullable String elasticPoolId) {
            this.elasticPoolId = elasticPoolId;
            return this;
        }

        public Builder setFailoverGroupId(String failoverGroupId) {
            this.failoverGroupId = Objects.requireNonNull(failoverGroupId);
            return this;
        }

        public Builder setHighAvailabilityReplicaCount(@Nullable Integer highAvailabilityReplicaCount) {
            this.highAvailabilityReplicaCount = highAvailabilityReplicaCount;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLicenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMaintenanceConfigurationId(@Nullable String maintenanceConfigurationId) {
            this.maintenanceConfigurationId = maintenanceConfigurationId;
            return this;
        }

        public Builder setManagedBy(String managedBy) {
            this.managedBy = Objects.requireNonNull(managedBy);
            return this;
        }

        public Builder setMaxLogSizeBytes(Double maxLogSizeBytes) {
            this.maxLogSizeBytes = Objects.requireNonNull(maxLogSizeBytes);
            return this;
        }

        public Builder setMaxSizeBytes(@Nullable Double maxSizeBytes) {
            this.maxSizeBytes = maxSizeBytes;
            return this;
        }

        public Builder setMinCapacity(@Nullable Double minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPausedDate(String pausedDate) {
            this.pausedDate = Objects.requireNonNull(pausedDate);
            return this;
        }

        public Builder setReadScale(@Nullable String readScale) {
            this.readScale = readScale;
            return this;
        }

        public Builder setRequestedBackupStorageRedundancy(@Nullable String requestedBackupStorageRedundancy) {
            this.requestedBackupStorageRedundancy = requestedBackupStorageRedundancy;
            return this;
        }

        public Builder setRequestedServiceObjectiveName(String requestedServiceObjectiveName) {
            this.requestedServiceObjectiveName = Objects.requireNonNull(requestedServiceObjectiveName);
            return this;
        }

        public Builder setResumedDate(String resumedDate) {
            this.resumedDate = Objects.requireNonNull(resumedDate);
            return this;
        }

        public Builder setSecondaryType(@Nullable String secondaryType) {
            this.secondaryType = secondaryType;
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setZoneRedundant(@Nullable Boolean zoneRedundant) {
            this.zoneRedundant = zoneRedundant;
            return this;
        }

        public GetDatabaseResult build() {
            return new GetDatabaseResult(autoPauseDelay, catalogCollation, collation, creationDate, currentBackupStorageRedundancy, currentServiceObjectiveName, currentSku, databaseId, defaultSecondaryLocation, earliestRestoreDate, elasticPoolId, failoverGroupId, highAvailabilityReplicaCount, id, kind, licenseType, location, maintenanceConfigurationId, managedBy, maxLogSizeBytes, maxSizeBytes, minCapacity, name, pausedDate, readScale, requestedBackupStorageRedundancy, requestedServiceObjectiveName, resumedDate, secondaryType, sku, status, tags, type, zoneRedundant);
        }
    }
}
