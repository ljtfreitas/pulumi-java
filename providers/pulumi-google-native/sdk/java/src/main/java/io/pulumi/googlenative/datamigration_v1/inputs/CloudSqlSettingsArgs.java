// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datamigration_v1.enums.CloudSqlSettingsActivationPolicy;
import io.pulumi.googlenative.datamigration_v1.enums.CloudSqlSettingsDataDiskType;
import io.pulumi.googlenative.datamigration_v1.enums.CloudSqlSettingsDatabaseVersion;
import io.pulumi.googlenative.datamigration_v1.inputs.SqlIpConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings for creating a Cloud SQL database instance.
 * 
 */
public final class CloudSqlSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudSqlSettingsArgs Empty = new CloudSqlSettingsArgs();

    /**
     * The activation policy specifies when the instance is activated; it is applicable only when the instance state is 'RUNNABLE'. Valid values: 'ALWAYS': The instance is on, and remains so even in the absence of connection requests. `NEVER`: The instance is off; it is not activated, even if a connection request arrives.
     * 
     */
    @Import(name="activationPolicy")
      private final @Nullable Output<CloudSqlSettingsActivationPolicy> activationPolicy;

    public Output<CloudSqlSettingsActivationPolicy> getActivationPolicy() {
        return this.activationPolicy == null ? Output.empty() : this.activationPolicy;
    }

    /**
     * [default: ON] If you enable this setting, Cloud SQL checks your available storage every 30 seconds. If the available storage falls below a threshold size, Cloud SQL automatically adds additional storage capacity. If the available storage repeatedly falls below the threshold size, Cloud SQL continues to add storage until it reaches the maximum of 30 TB.
     * 
     */
    @Import(name="autoStorageIncrease")
      private final @Nullable Output<Boolean> autoStorageIncrease;

    public Output<Boolean> getAutoStorageIncrease() {
        return this.autoStorageIncrease == null ? Output.empty() : this.autoStorageIncrease;
    }

    /**
     * The KMS key name used for the csql instance.
     * 
     */
    @Import(name="cmekKeyName")
      private final @Nullable Output<String> cmekKeyName;

    public Output<String> getCmekKeyName() {
        return this.cmekKeyName == null ? Output.empty() : this.cmekKeyName;
    }

    /**
     * The Cloud SQL default instance level collation.
     * 
     */
    @Import(name="collation")
      private final @Nullable Output<String> collation;

    public Output<String> getCollation() {
        return this.collation == null ? Output.empty() : this.collation;
    }

    /**
     * The storage capacity available to the database, in GB. The minimum (and default) size is 10GB.
     * 
     */
    @Import(name="dataDiskSizeGb")
      private final @Nullable Output<String> dataDiskSizeGb;

    public Output<String> getDataDiskSizeGb() {
        return this.dataDiskSizeGb == null ? Output.empty() : this.dataDiskSizeGb;
    }

    /**
     * The type of storage: `PD_SSD` (default) or `PD_HDD`.
     * 
     */
    @Import(name="dataDiskType")
      private final @Nullable Output<CloudSqlSettingsDataDiskType> dataDiskType;

    public Output<CloudSqlSettingsDataDiskType> getDataDiskType() {
        return this.dataDiskType == null ? Output.empty() : this.dataDiskType;
    }

    /**
     * The database flags passed to the Cloud SQL instance at startup. An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @Import(name="databaseFlags")
      private final @Nullable Output<Map<String,String>> databaseFlags;

    public Output<Map<String,String>> getDatabaseFlags() {
        return this.databaseFlags == null ? Output.empty() : this.databaseFlags;
    }

    /**
     * The database engine type and version.
     * 
     */
    @Import(name="databaseVersion")
      private final @Nullable Output<CloudSqlSettingsDatabaseVersion> databaseVersion;

    public Output<CloudSqlSettingsDatabaseVersion> getDatabaseVersion() {
        return this.databaseVersion == null ? Output.empty() : this.databaseVersion;
    }

    /**
     * The settings for IP Management. This allows to enable or disable the instance IP and manage which external networks can connect to the instance. The IPv4 address cannot be disabled.
     * 
     */
    @Import(name="ipConfig")
      private final @Nullable Output<SqlIpConfigArgs> ipConfig;

    public Output<SqlIpConfigArgs> getIpConfig() {
        return this.ipConfig == null ? Output.empty() : this.ipConfig;
    }

    /**
     * Input only. Initial root password.
     * 
     */
    @Import(name="rootPassword")
      private final @Nullable Output<String> rootPassword;

    public Output<String> getRootPassword() {
        return this.rootPassword == null ? Output.empty() : this.rootPassword;
    }

    /**
     * The Database Migration Service source connection profile ID, in the format: `projects/my_project_name/locations/us-central1/connectionProfiles/connection_profile_ID`
     * 
     */
    @Import(name="sourceId")
      private final @Nullable Output<String> sourceId;

    public Output<String> getSourceId() {
        return this.sourceId == null ? Output.empty() : this.sourceId;
    }

    /**
     * The maximum size to which storage capacity can be automatically increased. The default value is 0, which specifies that there is no limit.
     * 
     */
    @Import(name="storageAutoResizeLimit")
      private final @Nullable Output<String> storageAutoResizeLimit;

    public Output<String> getStorageAutoResizeLimit() {
        return this.storageAutoResizeLimit == null ? Output.empty() : this.storageAutoResizeLimit;
    }

    /**
     * The tier (or machine type) for this instance, for example: `db-n1-standard-1` (MySQL instances) or `db-custom-1-3840` (PostgreSQL instances). For more information, see [Cloud SQL Instance Settings](https://cloud.google.com/sql/docs/mysql/instance-settings).
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<String> tier;

    public Output<String> getTier() {
        return this.tier == null ? Output.empty() : this.tier;
    }

    /**
     * The resource labels for a Cloud SQL instance to use to annotate any related underlying resources such as Compute Engine VMs. An object containing a list of "key": "value" pairs. Example: `{ "name": "wrench", "mass": "18kg", "count": "3" }`.
     * 
     */
    @Import(name="userLabels")
      private final @Nullable Output<Map<String,String>> userLabels;

    public Output<Map<String,String>> getUserLabels() {
        return this.userLabels == null ? Output.empty() : this.userLabels;
    }

    /**
     * The Google Cloud Platform zone where your Cloud SQL datdabse instance is located.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public CloudSqlSettingsArgs(
        @Nullable Output<CloudSqlSettingsActivationPolicy> activationPolicy,
        @Nullable Output<Boolean> autoStorageIncrease,
        @Nullable Output<String> cmekKeyName,
        @Nullable Output<String> collation,
        @Nullable Output<String> dataDiskSizeGb,
        @Nullable Output<CloudSqlSettingsDataDiskType> dataDiskType,
        @Nullable Output<Map<String,String>> databaseFlags,
        @Nullable Output<CloudSqlSettingsDatabaseVersion> databaseVersion,
        @Nullable Output<SqlIpConfigArgs> ipConfig,
        @Nullable Output<String> rootPassword,
        @Nullable Output<String> sourceId,
        @Nullable Output<String> storageAutoResizeLimit,
        @Nullable Output<String> tier,
        @Nullable Output<Map<String,String>> userLabels,
        @Nullable Output<String> zone) {
        this.activationPolicy = activationPolicy;
        this.autoStorageIncrease = autoStorageIncrease;
        this.cmekKeyName = cmekKeyName;
        this.collation = collation;
        this.dataDiskSizeGb = dataDiskSizeGb;
        this.dataDiskType = dataDiskType;
        this.databaseFlags = databaseFlags;
        this.databaseVersion = databaseVersion;
        this.ipConfig = ipConfig;
        this.rootPassword = rootPassword;
        this.sourceId = sourceId;
        this.storageAutoResizeLimit = storageAutoResizeLimit;
        this.tier = tier;
        this.userLabels = userLabels;
        this.zone = zone;
    }

    private CloudSqlSettingsArgs() {
        this.activationPolicy = Output.empty();
        this.autoStorageIncrease = Output.empty();
        this.cmekKeyName = Output.empty();
        this.collation = Output.empty();
        this.dataDiskSizeGb = Output.empty();
        this.dataDiskType = Output.empty();
        this.databaseFlags = Output.empty();
        this.databaseVersion = Output.empty();
        this.ipConfig = Output.empty();
        this.rootPassword = Output.empty();
        this.sourceId = Output.empty();
        this.storageAutoResizeLimit = Output.empty();
        this.tier = Output.empty();
        this.userLabels = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudSqlSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CloudSqlSettingsActivationPolicy> activationPolicy;
        private @Nullable Output<Boolean> autoStorageIncrease;
        private @Nullable Output<String> cmekKeyName;
        private @Nullable Output<String> collation;
        private @Nullable Output<String> dataDiskSizeGb;
        private @Nullable Output<CloudSqlSettingsDataDiskType> dataDiskType;
        private @Nullable Output<Map<String,String>> databaseFlags;
        private @Nullable Output<CloudSqlSettingsDatabaseVersion> databaseVersion;
        private @Nullable Output<SqlIpConfigArgs> ipConfig;
        private @Nullable Output<String> rootPassword;
        private @Nullable Output<String> sourceId;
        private @Nullable Output<String> storageAutoResizeLimit;
        private @Nullable Output<String> tier;
        private @Nullable Output<Map<String,String>> userLabels;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudSqlSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationPolicy = defaults.activationPolicy;
    	      this.autoStorageIncrease = defaults.autoStorageIncrease;
    	      this.cmekKeyName = defaults.cmekKeyName;
    	      this.collation = defaults.collation;
    	      this.dataDiskSizeGb = defaults.dataDiskSizeGb;
    	      this.dataDiskType = defaults.dataDiskType;
    	      this.databaseFlags = defaults.databaseFlags;
    	      this.databaseVersion = defaults.databaseVersion;
    	      this.ipConfig = defaults.ipConfig;
    	      this.rootPassword = defaults.rootPassword;
    	      this.sourceId = defaults.sourceId;
    	      this.storageAutoResizeLimit = defaults.storageAutoResizeLimit;
    	      this.tier = defaults.tier;
    	      this.userLabels = defaults.userLabels;
    	      this.zone = defaults.zone;
        }

        public Builder activationPolicy(@Nullable Output<CloudSqlSettingsActivationPolicy> activationPolicy) {
            this.activationPolicy = activationPolicy;
            return this;
        }

        public Builder activationPolicy(@Nullable CloudSqlSettingsActivationPolicy activationPolicy) {
            this.activationPolicy = Output.ofNullable(activationPolicy);
            return this;
        }

        public Builder autoStorageIncrease(@Nullable Output<Boolean> autoStorageIncrease) {
            this.autoStorageIncrease = autoStorageIncrease;
            return this;
        }

        public Builder autoStorageIncrease(@Nullable Boolean autoStorageIncrease) {
            this.autoStorageIncrease = Output.ofNullable(autoStorageIncrease);
            return this;
        }

        public Builder cmekKeyName(@Nullable Output<String> cmekKeyName) {
            this.cmekKeyName = cmekKeyName;
            return this;
        }

        public Builder cmekKeyName(@Nullable String cmekKeyName) {
            this.cmekKeyName = Output.ofNullable(cmekKeyName);
            return this;
        }

        public Builder collation(@Nullable Output<String> collation) {
            this.collation = collation;
            return this;
        }

        public Builder collation(@Nullable String collation) {
            this.collation = Output.ofNullable(collation);
            return this;
        }

        public Builder dataDiskSizeGb(@Nullable Output<String> dataDiskSizeGb) {
            this.dataDiskSizeGb = dataDiskSizeGb;
            return this;
        }

        public Builder dataDiskSizeGb(@Nullable String dataDiskSizeGb) {
            this.dataDiskSizeGb = Output.ofNullable(dataDiskSizeGb);
            return this;
        }

        public Builder dataDiskType(@Nullable Output<CloudSqlSettingsDataDiskType> dataDiskType) {
            this.dataDiskType = dataDiskType;
            return this;
        }

        public Builder dataDiskType(@Nullable CloudSqlSettingsDataDiskType dataDiskType) {
            this.dataDiskType = Output.ofNullable(dataDiskType);
            return this;
        }

        public Builder databaseFlags(@Nullable Output<Map<String,String>> databaseFlags) {
            this.databaseFlags = databaseFlags;
            return this;
        }

        public Builder databaseFlags(@Nullable Map<String,String> databaseFlags) {
            this.databaseFlags = Output.ofNullable(databaseFlags);
            return this;
        }

        public Builder databaseVersion(@Nullable Output<CloudSqlSettingsDatabaseVersion> databaseVersion) {
            this.databaseVersion = databaseVersion;
            return this;
        }

        public Builder databaseVersion(@Nullable CloudSqlSettingsDatabaseVersion databaseVersion) {
            this.databaseVersion = Output.ofNullable(databaseVersion);
            return this;
        }

        public Builder ipConfig(@Nullable Output<SqlIpConfigArgs> ipConfig) {
            this.ipConfig = ipConfig;
            return this;
        }

        public Builder ipConfig(@Nullable SqlIpConfigArgs ipConfig) {
            this.ipConfig = Output.ofNullable(ipConfig);
            return this;
        }

        public Builder rootPassword(@Nullable Output<String> rootPassword) {
            this.rootPassword = rootPassword;
            return this;
        }

        public Builder rootPassword(@Nullable String rootPassword) {
            this.rootPassword = Output.ofNullable(rootPassword);
            return this;
        }

        public Builder sourceId(@Nullable Output<String> sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        public Builder sourceId(@Nullable String sourceId) {
            this.sourceId = Output.ofNullable(sourceId);
            return this;
        }

        public Builder storageAutoResizeLimit(@Nullable Output<String> storageAutoResizeLimit) {
            this.storageAutoResizeLimit = storageAutoResizeLimit;
            return this;
        }

        public Builder storageAutoResizeLimit(@Nullable String storageAutoResizeLimit) {
            this.storageAutoResizeLimit = Output.ofNullable(storageAutoResizeLimit);
            return this;
        }

        public Builder tier(@Nullable Output<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = Output.ofNullable(tier);
            return this;
        }

        public Builder userLabels(@Nullable Output<Map<String,String>> userLabels) {
            this.userLabels = userLabels;
            return this;
        }

        public Builder userLabels(@Nullable Map<String,String> userLabels) {
            this.userLabels = Output.ofNullable(userLabels);
            return this;
        }

        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }
        public CloudSqlSettingsArgs build() {
            return new CloudSqlSettingsArgs(activationPolicy, autoStorageIncrease, cmekKeyName, collation, dataDiskSizeGb, dataDiskType, databaseFlags, databaseVersion, ipConfig, rootPassword, sourceId, storageAutoResizeLimit, tier, userLabels, zone);
        }
    }
}
