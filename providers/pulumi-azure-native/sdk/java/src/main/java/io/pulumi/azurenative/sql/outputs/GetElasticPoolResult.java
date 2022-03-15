// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.ElasticPoolPerDatabaseSettingsResponse;
import io.pulumi.azurenative.sql.outputs.SkuResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetElasticPoolResult {
    /**
     * The creation date of the elastic pool (ISO8601 format).
     * 
     */
    private final String creationDate;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Kind of elastic pool. This is metadata used for the Azure portal experience.
     * 
     */
    private final String kind;
    /**
     * The license type to apply for this elastic pool.
     * 
     */
    private final @Nullable String licenseType;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Maintenance configuration id assigned to the elastic pool. This configuration defines the period when the maintenance updates will will occur.
     * 
     */
    private final @Nullable String maintenanceConfigurationId;
    /**
     * The storage limit for the database elastic pool in bytes.
     * 
     */
    private final @Nullable Double maxSizeBytes;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The per database settings for the elastic pool.
     * 
     */
    private final @Nullable ElasticPoolPerDatabaseSettingsResponse perDatabaseSettings;
    /**
     * The elastic pool SKU.
     * 
     * The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or the following command:
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * The state of the elastic pool.
     * 
     */
    private final String state;
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
     * Whether or not this elastic pool is zone redundant, which means the replicas of this elastic pool will be spread across multiple availability zones.
     * 
     */
    private final @Nullable Boolean zoneRedundant;

    @CustomType.Constructor
    private GetElasticPoolResult(
        @CustomType.Parameter("creationDate") String creationDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("licenseType") @Nullable String licenseType,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("maintenanceConfigurationId") @Nullable String maintenanceConfigurationId,
        @CustomType.Parameter("maxSizeBytes") @Nullable Double maxSizeBytes,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("perDatabaseSettings") @Nullable ElasticPoolPerDatabaseSettingsResponse perDatabaseSettings,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("zoneRedundant") @Nullable Boolean zoneRedundant) {
        this.creationDate = creationDate;
        this.id = id;
        this.kind = kind;
        this.licenseType = licenseType;
        this.location = location;
        this.maintenanceConfigurationId = maintenanceConfigurationId;
        this.maxSizeBytes = maxSizeBytes;
        this.name = name;
        this.perDatabaseSettings = perDatabaseSettings;
        this.sku = sku;
        this.state = state;
        this.tags = tags;
        this.type = type;
        this.zoneRedundant = zoneRedundant;
    }

    /**
     * The creation date of the elastic pool (ISO8601 format).
     * 
    */
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of elastic pool. This is metadata used for the Azure portal experience.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The license type to apply for this elastic pool.
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
     * Maintenance configuration id assigned to the elastic pool. This configuration defines the period when the maintenance updates will will occur.
     * 
    */
    public Optional<String> getMaintenanceConfigurationId() {
        return Optional.ofNullable(this.maintenanceConfigurationId);
    }
    /**
     * The storage limit for the database elastic pool in bytes.
     * 
    */
    public Optional<Double> getMaxSizeBytes() {
        return Optional.ofNullable(this.maxSizeBytes);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The per database settings for the elastic pool.
     * 
    */
    public Optional<ElasticPoolPerDatabaseSettingsResponse> getPerDatabaseSettings() {
        return Optional.ofNullable(this.perDatabaseSettings);
    }
    /**
     * The elastic pool SKU.
     * 
     * The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name, tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the `Capabilities_ListByLocation` REST API or the following command:
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * The state of the elastic pool.
     * 
    */
    public String getState() {
        return this.state;
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
     * Whether or not this elastic pool is zone redundant, which means the replicas of this elastic pool will be spread across multiple availability zones.
     * 
    */
    public Optional<Boolean> getZoneRedundant() {
        return Optional.ofNullable(this.zoneRedundant);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetElasticPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationDate;
        private String id;
        private String kind;
        private @Nullable String licenseType;
        private String location;
        private @Nullable String maintenanceConfigurationId;
        private @Nullable Double maxSizeBytes;
        private String name;
        private @Nullable ElasticPoolPerDatabaseSettingsResponse perDatabaseSettings;
        private @Nullable SkuResponse sku;
        private String state;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable Boolean zoneRedundant;

        public Builder() {
    	      // Empty
        }

        public Builder(GetElasticPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationDate = defaults.creationDate;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.licenseType = defaults.licenseType;
    	      this.location = defaults.location;
    	      this.maintenanceConfigurationId = defaults.maintenanceConfigurationId;
    	      this.maxSizeBytes = defaults.maxSizeBytes;
    	      this.name = defaults.name;
    	      this.perDatabaseSettings = defaults.perDatabaseSettings;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.zoneRedundant = defaults.zoneRedundant;
        }

        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder licenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder maintenanceConfigurationId(@Nullable String maintenanceConfigurationId) {
            this.maintenanceConfigurationId = maintenanceConfigurationId;
            return this;
        }

        public Builder maxSizeBytes(@Nullable Double maxSizeBytes) {
            this.maxSizeBytes = maxSizeBytes;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder perDatabaseSettings(@Nullable ElasticPoolPerDatabaseSettingsResponse perDatabaseSettings) {
            this.perDatabaseSettings = perDatabaseSettings;
            return this;
        }

        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder zoneRedundant(@Nullable Boolean zoneRedundant) {
            this.zoneRedundant = zoneRedundant;
            return this;
        }
        public GetElasticPoolResult build() {
            return new GetElasticPoolResult(creationDate, id, kind, licenseType, location, maintenanceConfigurationId, maxSizeBytes, name, perDatabaseSettings, sku, state, tags, type, zoneRedundant);
        }
    }
}
