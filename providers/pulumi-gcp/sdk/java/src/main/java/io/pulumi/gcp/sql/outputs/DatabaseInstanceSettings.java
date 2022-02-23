// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceSettingsBackupConfiguration;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceSettingsDatabaseFlag;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceSettingsInsightsConfig;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceSettingsIpConfiguration;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceSettingsLocationPreference;
import io.pulumi.gcp.sql.outputs.DatabaseInstanceSettingsMaintenanceWindow;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabaseInstanceSettings {
    /**
     * This specifies when the instance should be
     * active. Can be either `ALWAYS`, `NEVER` or `ON_DEMAND`.
     * 
     */
    private final @Nullable String activationPolicy;
    /**
     * The availability type of the Cloud SQL
     * instance, high availability (`REGIONAL`) or single zone (`ZONAL`).' For MySQL
     * instances, ensure that `settings.backup_configuration.enabled` and
     * `settings.backup_configuration.binary_log_enabled` are both set to `true`.
     * 
     */
    private final @Nullable String availabilityType;
    private final @Nullable DatabaseInstanceSettingsBackupConfiguration backupConfiguration;
    /**
     * The name of server instance collation.
     * 
     */
    private final @Nullable String collation;
    private final @Nullable List<DatabaseInstanceSettingsDatabaseFlag> databaseFlags;
    /**
     * Configuration to increase storage size automatically.  Note that future apply calls will attempt to resize the disk to the value specified in `disk_size` - if this is set, do not set `disk_size`.
     * 
     */
    private final @Nullable Boolean diskAutoresize;
    private final @Nullable Integer diskAutoresizeLimit;
    /**
     * The size of data disk, in GB. Size of a running instance cannot be reduced but can be increased.
     * 
     */
    private final @Nullable Integer diskSize;
    /**
     * The type of data disk: PD_SSD or PD_HDD.
     * 
     */
    private final @Nullable String diskType;
    private final @Nullable DatabaseInstanceSettingsInsightsConfig insightsConfig;
    private final @Nullable DatabaseInstanceSettingsIpConfiguration ipConfiguration;
    private final @Nullable DatabaseInstanceSettingsLocationPreference locationPreference;
    private final @Nullable DatabaseInstanceSettingsMaintenanceWindow maintenanceWindow;
    /**
     * Pricing plan for this instance, can only be `PER_USE`.
     * 
     */
    private final @Nullable String pricingPlan;
    /**
     * The machine type to use. See [tiers](https://cloud.google.com/sql/docs/admin-api/v1beta4/tiers)
     * for more details and supported versions. Postgres supports only shared-core machine types,
     * and custom machine types such as `db-custom-2-13312`. See the [Custom Machine Type Documentation](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#create) to learn about specifying custom machine types.
     * 
     */
    private final String tier;
    /**
     * A set of key/value user label pairs to assign to the instance.
     * 
     */
    private final @Nullable Map<String,String> userLabels;
    private final @Nullable Integer version;

    @OutputCustomType.Constructor({"activationPolicy","availabilityType","backupConfiguration","collation","databaseFlags","diskAutoresize","diskAutoresizeLimit","diskSize","diskType","insightsConfig","ipConfiguration","locationPreference","maintenanceWindow","pricingPlan","tier","userLabels","version"})
    private DatabaseInstanceSettings(
        @Nullable String activationPolicy,
        @Nullable String availabilityType,
        @Nullable DatabaseInstanceSettingsBackupConfiguration backupConfiguration,
        @Nullable String collation,
        @Nullable List<DatabaseInstanceSettingsDatabaseFlag> databaseFlags,
        @Nullable Boolean diskAutoresize,
        @Nullable Integer diskAutoresizeLimit,
        @Nullable Integer diskSize,
        @Nullable String diskType,
        @Nullable DatabaseInstanceSettingsInsightsConfig insightsConfig,
        @Nullable DatabaseInstanceSettingsIpConfiguration ipConfiguration,
        @Nullable DatabaseInstanceSettingsLocationPreference locationPreference,
        @Nullable DatabaseInstanceSettingsMaintenanceWindow maintenanceWindow,
        @Nullable String pricingPlan,
        String tier,
        @Nullable Map<String,String> userLabels,
        @Nullable Integer version) {
        this.activationPolicy = activationPolicy;
        this.availabilityType = availabilityType;
        this.backupConfiguration = backupConfiguration;
        this.collation = collation;
        this.databaseFlags = databaseFlags;
        this.diskAutoresize = diskAutoresize;
        this.diskAutoresizeLimit = diskAutoresizeLimit;
        this.diskSize = diskSize;
        this.diskType = diskType;
        this.insightsConfig = insightsConfig;
        this.ipConfiguration = ipConfiguration;
        this.locationPreference = locationPreference;
        this.maintenanceWindow = maintenanceWindow;
        this.pricingPlan = pricingPlan;
        this.tier = Objects.requireNonNull(tier);
        this.userLabels = userLabels;
        this.version = version;
    }

    /**
     * This specifies when the instance should be
     * active. Can be either `ALWAYS`, `NEVER` or `ON_DEMAND`.
     * 
     */
    public Optional<String> getActivationPolicy() {
        return Optional.ofNullable(this.activationPolicy);
    }
    /**
     * The availability type of the Cloud SQL
     * instance, high availability (`REGIONAL`) or single zone (`ZONAL`).' For MySQL
     * instances, ensure that `settings.backup_configuration.enabled` and
     * `settings.backup_configuration.binary_log_enabled` are both set to `true`.
     * 
     */
    public Optional<String> getAvailabilityType() {
        return Optional.ofNullable(this.availabilityType);
    }
    public Optional<DatabaseInstanceSettingsBackupConfiguration> getBackupConfiguration() {
        return Optional.ofNullable(this.backupConfiguration);
    }
    /**
     * The name of server instance collation.
     * 
     */
    public Optional<String> getCollation() {
        return Optional.ofNullable(this.collation);
    }
    public List<DatabaseInstanceSettingsDatabaseFlag> getDatabaseFlags() {
        return this.databaseFlags == null ? List.of() : this.databaseFlags;
    }
    /**
     * Configuration to increase storage size automatically.  Note that future apply calls will attempt to resize the disk to the value specified in `disk_size` - if this is set, do not set `disk_size`.
     * 
     */
    public Optional<Boolean> getDiskAutoresize() {
        return Optional.ofNullable(this.diskAutoresize);
    }
    public Optional<Integer> getDiskAutoresizeLimit() {
        return Optional.ofNullable(this.diskAutoresizeLimit);
    }
    /**
     * The size of data disk, in GB. Size of a running instance cannot be reduced but can be increased.
     * 
     */
    public Optional<Integer> getDiskSize() {
        return Optional.ofNullable(this.diskSize);
    }
    /**
     * The type of data disk: PD_SSD or PD_HDD.
     * 
     */
    public Optional<String> getDiskType() {
        return Optional.ofNullable(this.diskType);
    }
    public Optional<DatabaseInstanceSettingsInsightsConfig> getInsightsConfig() {
        return Optional.ofNullable(this.insightsConfig);
    }
    public Optional<DatabaseInstanceSettingsIpConfiguration> getIpConfiguration() {
        return Optional.ofNullable(this.ipConfiguration);
    }
    public Optional<DatabaseInstanceSettingsLocationPreference> getLocationPreference() {
        return Optional.ofNullable(this.locationPreference);
    }
    public Optional<DatabaseInstanceSettingsMaintenanceWindow> getMaintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }
    /**
     * Pricing plan for this instance, can only be `PER_USE`.
     * 
     */
    public Optional<String> getPricingPlan() {
        return Optional.ofNullable(this.pricingPlan);
    }
    /**
     * The machine type to use. See [tiers](https://cloud.google.com/sql/docs/admin-api/v1beta4/tiers)
     * for more details and supported versions. Postgres supports only shared-core machine types,
     * and custom machine types such as `db-custom-2-13312`. See the [Custom Machine Type Documentation](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#create) to learn about specifying custom machine types.
     * 
     */
    public String getTier() {
        return this.tier;
    }
    /**
     * A set of key/value user label pairs to assign to the instance.
     * 
     */
    public Map<String,String> getUserLabels() {
        return this.userLabels == null ? Map.of() : this.userLabels;
    }
    public Optional<Integer> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activationPolicy;
        private @Nullable String availabilityType;
        private @Nullable DatabaseInstanceSettingsBackupConfiguration backupConfiguration;
        private @Nullable String collation;
        private @Nullable List<DatabaseInstanceSettingsDatabaseFlag> databaseFlags;
        private @Nullable Boolean diskAutoresize;
        private @Nullable Integer diskAutoresizeLimit;
        private @Nullable Integer diskSize;
        private @Nullable String diskType;
        private @Nullable DatabaseInstanceSettingsInsightsConfig insightsConfig;
        private @Nullable DatabaseInstanceSettingsIpConfiguration ipConfiguration;
        private @Nullable DatabaseInstanceSettingsLocationPreference locationPreference;
        private @Nullable DatabaseInstanceSettingsMaintenanceWindow maintenanceWindow;
        private @Nullable String pricingPlan;
        private String tier;
        private @Nullable Map<String,String> userLabels;
        private @Nullable Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationPolicy = defaults.activationPolicy;
    	      this.availabilityType = defaults.availabilityType;
    	      this.backupConfiguration = defaults.backupConfiguration;
    	      this.collation = defaults.collation;
    	      this.databaseFlags = defaults.databaseFlags;
    	      this.diskAutoresize = defaults.diskAutoresize;
    	      this.diskAutoresizeLimit = defaults.diskAutoresizeLimit;
    	      this.diskSize = defaults.diskSize;
    	      this.diskType = defaults.diskType;
    	      this.insightsConfig = defaults.insightsConfig;
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.locationPreference = defaults.locationPreference;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.pricingPlan = defaults.pricingPlan;
    	      this.tier = defaults.tier;
    	      this.userLabels = defaults.userLabels;
    	      this.version = defaults.version;
        }

        public Builder setActivationPolicy(@Nullable String activationPolicy) {
            this.activationPolicy = activationPolicy;
            return this;
        }

        public Builder setAvailabilityType(@Nullable String availabilityType) {
            this.availabilityType = availabilityType;
            return this;
        }

        public Builder setBackupConfiguration(@Nullable DatabaseInstanceSettingsBackupConfiguration backupConfiguration) {
            this.backupConfiguration = backupConfiguration;
            return this;
        }

        public Builder setCollation(@Nullable String collation) {
            this.collation = collation;
            return this;
        }

        public Builder setDatabaseFlags(@Nullable List<DatabaseInstanceSettingsDatabaseFlag> databaseFlags) {
            this.databaseFlags = databaseFlags;
            return this;
        }

        public Builder setDiskAutoresize(@Nullable Boolean diskAutoresize) {
            this.diskAutoresize = diskAutoresize;
            return this;
        }

        public Builder setDiskAutoresizeLimit(@Nullable Integer diskAutoresizeLimit) {
            this.diskAutoresizeLimit = diskAutoresizeLimit;
            return this;
        }

        public Builder setDiskSize(@Nullable Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        public Builder setDiskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder setInsightsConfig(@Nullable DatabaseInstanceSettingsInsightsConfig insightsConfig) {
            this.insightsConfig = insightsConfig;
            return this;
        }

        public Builder setIpConfiguration(@Nullable DatabaseInstanceSettingsIpConfiguration ipConfiguration) {
            this.ipConfiguration = ipConfiguration;
            return this;
        }

        public Builder setLocationPreference(@Nullable DatabaseInstanceSettingsLocationPreference locationPreference) {
            this.locationPreference = locationPreference;
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable DatabaseInstanceSettingsMaintenanceWindow maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder setPricingPlan(@Nullable String pricingPlan) {
            this.pricingPlan = pricingPlan;
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public Builder setUserLabels(@Nullable Map<String,String> userLabels) {
            this.userLabels = userLabels;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = version;
            return this;
        }
        public DatabaseInstanceSettings build() {
            return new DatabaseInstanceSettings(activationPolicy, availabilityType, backupConfiguration, collation, databaseFlags, diskAutoresize, diskAutoresizeLimit, diskSize, diskType, insightsConfig, ipConfiguration, locationPreference, maintenanceWindow, pricingPlan, tier, userLabels, version);
        }
    }
}
