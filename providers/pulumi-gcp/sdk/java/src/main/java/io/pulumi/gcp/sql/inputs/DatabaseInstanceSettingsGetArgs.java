// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsBackupConfigurationGetArgs;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsDatabaseFlagGetArgs;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsInsightsConfigGetArgs;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsIpConfigurationGetArgs;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsLocationPreferenceGetArgs;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsMaintenanceWindowGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsGetArgs Empty = new DatabaseInstanceSettingsGetArgs();

    /**
     * This specifies when the instance should be
     * active. Can be either `ALWAYS`, `NEVER` or `ON_DEMAND`.
     * 
     */
    @InputImport(name="activationPolicy")
        private final @Nullable Input<String> activationPolicy;

    public Input<String> getActivationPolicy() {
        return this.activationPolicy == null ? Input.empty() : this.activationPolicy;
    }

    /**
     * The availability type of the Cloud SQL
     * instance, high availability (`REGIONAL`) or single zone (`ZONAL`).' For MySQL
     * instances, ensure that `settings.backup_configuration.enabled` and
     * `settings.backup_configuration.binary_log_enabled` are both set to `true`.
     * 
     */
    @InputImport(name="availabilityType")
        private final @Nullable Input<String> availabilityType;

    public Input<String> getAvailabilityType() {
        return this.availabilityType == null ? Input.empty() : this.availabilityType;
    }

    @InputImport(name="backupConfiguration")
        private final @Nullable Input<DatabaseInstanceSettingsBackupConfigurationGetArgs> backupConfiguration;

    public Input<DatabaseInstanceSettingsBackupConfigurationGetArgs> getBackupConfiguration() {
        return this.backupConfiguration == null ? Input.empty() : this.backupConfiguration;
    }

    /**
     * The name of server instance collation.
     * 
     */
    @InputImport(name="collation")
        private final @Nullable Input<String> collation;

    public Input<String> getCollation() {
        return this.collation == null ? Input.empty() : this.collation;
    }

    @InputImport(name="databaseFlags")
        private final @Nullable Input<List<DatabaseInstanceSettingsDatabaseFlagGetArgs>> databaseFlags;

    public Input<List<DatabaseInstanceSettingsDatabaseFlagGetArgs>> getDatabaseFlags() {
        return this.databaseFlags == null ? Input.empty() : this.databaseFlags;
    }

    /**
     * Configuration to increase storage size automatically.  Note that future apply calls will attempt to resize the disk to the value specified in `disk_size` - if this is set, do not set `disk_size`.
     * 
     */
    @InputImport(name="diskAutoresize")
        private final @Nullable Input<Boolean> diskAutoresize;

    public Input<Boolean> getDiskAutoresize() {
        return this.diskAutoresize == null ? Input.empty() : this.diskAutoresize;
    }

    @InputImport(name="diskAutoresizeLimit")
        private final @Nullable Input<Integer> diskAutoresizeLimit;

    public Input<Integer> getDiskAutoresizeLimit() {
        return this.diskAutoresizeLimit == null ? Input.empty() : this.diskAutoresizeLimit;
    }

    /**
     * The size of data disk, in GB. Size of a running instance cannot be reduced but can be increased.
     * 
     */
    @InputImport(name="diskSize")
        private final @Nullable Input<Integer> diskSize;

    public Input<Integer> getDiskSize() {
        return this.diskSize == null ? Input.empty() : this.diskSize;
    }

    /**
     * The type of data disk: PD_SSD or PD_HDD.
     * 
     */
    @InputImport(name="diskType")
        private final @Nullable Input<String> diskType;

    public Input<String> getDiskType() {
        return this.diskType == null ? Input.empty() : this.diskType;
    }

    @InputImport(name="insightsConfig")
        private final @Nullable Input<DatabaseInstanceSettingsInsightsConfigGetArgs> insightsConfig;

    public Input<DatabaseInstanceSettingsInsightsConfigGetArgs> getInsightsConfig() {
        return this.insightsConfig == null ? Input.empty() : this.insightsConfig;
    }

    @InputImport(name="ipConfiguration")
        private final @Nullable Input<DatabaseInstanceSettingsIpConfigurationGetArgs> ipConfiguration;

    public Input<DatabaseInstanceSettingsIpConfigurationGetArgs> getIpConfiguration() {
        return this.ipConfiguration == null ? Input.empty() : this.ipConfiguration;
    }

    @InputImport(name="locationPreference")
        private final @Nullable Input<DatabaseInstanceSettingsLocationPreferenceGetArgs> locationPreference;

    public Input<DatabaseInstanceSettingsLocationPreferenceGetArgs> getLocationPreference() {
        return this.locationPreference == null ? Input.empty() : this.locationPreference;
    }

    @InputImport(name="maintenanceWindow")
        private final @Nullable Input<DatabaseInstanceSettingsMaintenanceWindowGetArgs> maintenanceWindow;

    public Input<DatabaseInstanceSettingsMaintenanceWindowGetArgs> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Input.empty() : this.maintenanceWindow;
    }

    /**
     * Pricing plan for this instance, can only be `PER_USE`.
     * 
     */
    @InputImport(name="pricingPlan")
        private final @Nullable Input<String> pricingPlan;

    public Input<String> getPricingPlan() {
        return this.pricingPlan == null ? Input.empty() : this.pricingPlan;
    }

    /**
     * The machine type to use. See [tiers](https://cloud.google.com/sql/docs/admin-api/v1beta4/tiers)
     * for more details and supported versions. Postgres supports only shared-core machine types,
     * and custom machine types such as `db-custom-2-13312`. See the [Custom Machine Type Documentation](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#create) to learn about specifying custom machine types.
     * 
     */
    @InputImport(name="tier", required=true)
        private final Input<String> tier;

    public Input<String> getTier() {
        return this.tier;
    }

    /**
     * A set of key/value user label pairs to assign to the instance.
     * 
     */
    @InputImport(name="userLabels")
        private final @Nullable Input<Map<String,String>> userLabels;

    public Input<Map<String,String>> getUserLabels() {
        return this.userLabels == null ? Input.empty() : this.userLabels;
    }

    @InputImport(name="version")
        private final @Nullable Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public DatabaseInstanceSettingsGetArgs(
        @Nullable Input<String> activationPolicy,
        @Nullable Input<String> availabilityType,
        @Nullable Input<DatabaseInstanceSettingsBackupConfigurationGetArgs> backupConfiguration,
        @Nullable Input<String> collation,
        @Nullable Input<List<DatabaseInstanceSettingsDatabaseFlagGetArgs>> databaseFlags,
        @Nullable Input<Boolean> diskAutoresize,
        @Nullable Input<Integer> diskAutoresizeLimit,
        @Nullable Input<Integer> diskSize,
        @Nullable Input<String> diskType,
        @Nullable Input<DatabaseInstanceSettingsInsightsConfigGetArgs> insightsConfig,
        @Nullable Input<DatabaseInstanceSettingsIpConfigurationGetArgs> ipConfiguration,
        @Nullable Input<DatabaseInstanceSettingsLocationPreferenceGetArgs> locationPreference,
        @Nullable Input<DatabaseInstanceSettingsMaintenanceWindowGetArgs> maintenanceWindow,
        @Nullable Input<String> pricingPlan,
        Input<String> tier,
        @Nullable Input<Map<String,String>> userLabels,
        @Nullable Input<Integer> version) {
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
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
        this.userLabels = userLabels;
        this.version = version;
    }

    private DatabaseInstanceSettingsGetArgs() {
        this.activationPolicy = Input.empty();
        this.availabilityType = Input.empty();
        this.backupConfiguration = Input.empty();
        this.collation = Input.empty();
        this.databaseFlags = Input.empty();
        this.diskAutoresize = Input.empty();
        this.diskAutoresizeLimit = Input.empty();
        this.diskSize = Input.empty();
        this.diskType = Input.empty();
        this.insightsConfig = Input.empty();
        this.ipConfiguration = Input.empty();
        this.locationPreference = Input.empty();
        this.maintenanceWindow = Input.empty();
        this.pricingPlan = Input.empty();
        this.tier = Input.empty();
        this.userLabels = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> activationPolicy;
        private @Nullable Input<String> availabilityType;
        private @Nullable Input<DatabaseInstanceSettingsBackupConfigurationGetArgs> backupConfiguration;
        private @Nullable Input<String> collation;
        private @Nullable Input<List<DatabaseInstanceSettingsDatabaseFlagGetArgs>> databaseFlags;
        private @Nullable Input<Boolean> diskAutoresize;
        private @Nullable Input<Integer> diskAutoresizeLimit;
        private @Nullable Input<Integer> diskSize;
        private @Nullable Input<String> diskType;
        private @Nullable Input<DatabaseInstanceSettingsInsightsConfigGetArgs> insightsConfig;
        private @Nullable Input<DatabaseInstanceSettingsIpConfigurationGetArgs> ipConfiguration;
        private @Nullable Input<DatabaseInstanceSettingsLocationPreferenceGetArgs> locationPreference;
        private @Nullable Input<DatabaseInstanceSettingsMaintenanceWindowGetArgs> maintenanceWindow;
        private @Nullable Input<String> pricingPlan;
        private Input<String> tier;
        private @Nullable Input<Map<String,String>> userLabels;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceSettingsGetArgs defaults) {
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

        public Builder setActivationPolicy(@Nullable Input<String> activationPolicy) {
            this.activationPolicy = activationPolicy;
            return this;
        }

        public Builder setActivationPolicy(@Nullable String activationPolicy) {
            this.activationPolicy = Input.ofNullable(activationPolicy);
            return this;
        }

        public Builder setAvailabilityType(@Nullable Input<String> availabilityType) {
            this.availabilityType = availabilityType;
            return this;
        }

        public Builder setAvailabilityType(@Nullable String availabilityType) {
            this.availabilityType = Input.ofNullable(availabilityType);
            return this;
        }

        public Builder setBackupConfiguration(@Nullable Input<DatabaseInstanceSettingsBackupConfigurationGetArgs> backupConfiguration) {
            this.backupConfiguration = backupConfiguration;
            return this;
        }

        public Builder setBackupConfiguration(@Nullable DatabaseInstanceSettingsBackupConfigurationGetArgs backupConfiguration) {
            this.backupConfiguration = Input.ofNullable(backupConfiguration);
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

        public Builder setDatabaseFlags(@Nullable Input<List<DatabaseInstanceSettingsDatabaseFlagGetArgs>> databaseFlags) {
            this.databaseFlags = databaseFlags;
            return this;
        }

        public Builder setDatabaseFlags(@Nullable List<DatabaseInstanceSettingsDatabaseFlagGetArgs> databaseFlags) {
            this.databaseFlags = Input.ofNullable(databaseFlags);
            return this;
        }

        public Builder setDiskAutoresize(@Nullable Input<Boolean> diskAutoresize) {
            this.diskAutoresize = diskAutoresize;
            return this;
        }

        public Builder setDiskAutoresize(@Nullable Boolean diskAutoresize) {
            this.diskAutoresize = Input.ofNullable(diskAutoresize);
            return this;
        }

        public Builder setDiskAutoresizeLimit(@Nullable Input<Integer> diskAutoresizeLimit) {
            this.diskAutoresizeLimit = diskAutoresizeLimit;
            return this;
        }

        public Builder setDiskAutoresizeLimit(@Nullable Integer diskAutoresizeLimit) {
            this.diskAutoresizeLimit = Input.ofNullable(diskAutoresizeLimit);
            return this;
        }

        public Builder setDiskSize(@Nullable Input<Integer> diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        public Builder setDiskSize(@Nullable Integer diskSize) {
            this.diskSize = Input.ofNullable(diskSize);
            return this;
        }

        public Builder setDiskType(@Nullable Input<String> diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder setDiskType(@Nullable String diskType) {
            this.diskType = Input.ofNullable(diskType);
            return this;
        }

        public Builder setInsightsConfig(@Nullable Input<DatabaseInstanceSettingsInsightsConfigGetArgs> insightsConfig) {
            this.insightsConfig = insightsConfig;
            return this;
        }

        public Builder setInsightsConfig(@Nullable DatabaseInstanceSettingsInsightsConfigGetArgs insightsConfig) {
            this.insightsConfig = Input.ofNullable(insightsConfig);
            return this;
        }

        public Builder setIpConfiguration(@Nullable Input<DatabaseInstanceSettingsIpConfigurationGetArgs> ipConfiguration) {
            this.ipConfiguration = ipConfiguration;
            return this;
        }

        public Builder setIpConfiguration(@Nullable DatabaseInstanceSettingsIpConfigurationGetArgs ipConfiguration) {
            this.ipConfiguration = Input.ofNullable(ipConfiguration);
            return this;
        }

        public Builder setLocationPreference(@Nullable Input<DatabaseInstanceSettingsLocationPreferenceGetArgs> locationPreference) {
            this.locationPreference = locationPreference;
            return this;
        }

        public Builder setLocationPreference(@Nullable DatabaseInstanceSettingsLocationPreferenceGetArgs locationPreference) {
            this.locationPreference = Input.ofNullable(locationPreference);
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable Input<DatabaseInstanceSettingsMaintenanceWindowGetArgs> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable DatabaseInstanceSettingsMaintenanceWindowGetArgs maintenanceWindow) {
            this.maintenanceWindow = Input.ofNullable(maintenanceWindow);
            return this;
        }

        public Builder setPricingPlan(@Nullable Input<String> pricingPlan) {
            this.pricingPlan = pricingPlan;
            return this;
        }

        public Builder setPricingPlan(@Nullable String pricingPlan) {
            this.pricingPlan = Input.ofNullable(pricingPlan);
            return this;
        }

        public Builder setTier(Input<String> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Input.of(Objects.requireNonNull(tier));
            return this;
        }

        public Builder setUserLabels(@Nullable Input<Map<String,String>> userLabels) {
            this.userLabels = userLabels;
            return this;
        }

        public Builder setUserLabels(@Nullable Map<String,String> userLabels) {
            this.userLabels = Input.ofNullable(userLabels);
            return this;
        }

        public Builder setVersion(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public DatabaseInstanceSettingsGetArgs build() {
            return new DatabaseInstanceSettingsGetArgs(activationPolicy, availabilityType, backupConfiguration, collation, databaseFlags, diskAutoresize, diskAutoresizeLimit, diskSize, diskType, insightsConfig, ipConfiguration, locationPreference, maintenanceWindow, pricingPlan, tier, userLabels, version);
        }
    }
}
