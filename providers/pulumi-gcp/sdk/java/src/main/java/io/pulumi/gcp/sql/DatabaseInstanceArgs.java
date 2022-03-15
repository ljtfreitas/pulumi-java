// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceCloneArgs;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceReplicaConfigurationArgs;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceRestoreBackupContextArgs;
import io.pulumi.gcp.sql.inputs.DatabaseInstanceSettingsArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceArgs Empty = new DatabaseInstanceArgs();

    /**
     * The context needed to create this instance as a clone of another instance. When this field is set during
     * resource creation, this provider will attempt to clone another instance as indicated in the context. The
     * configuration is detailed below.
     * 
     */
    @Import(name="clone")
      private final @Nullable Output<DatabaseInstanceCloneArgs> clone;

    public Output<DatabaseInstanceCloneArgs> getClone() {
        return this.clone == null ? Output.empty() : this.clone;
    }

    /**
     * The MySQL, PostgreSQL or
     * SQL Server version to use. Supported values include `MYSQL_5_6`,
     * `MYSQL_5_7`, `MYSQL_8_0`, `POSTGRES_9_6`,`POSTGRES_10`, `POSTGRES_11`,
     * `POSTGRES_12`, `POSTGRES_13`, `SQLSERVER_2017_STANDARD`,
     * `SQLSERVER_2017_ENTERPRISE`, `SQLSERVER_2017_EXPRESS`, `SQLSERVER_2017_WEB`.
     * `SQLSERVER_2019_STANDARD`, `SQLSERVER_2019_ENTERPRISE`, `SQLSERVER_2019_EXPRESS`,
     * `SQLSERVER_2019_WEB`.
     * [Database Version Policies](https://cloud.google.com/sql/docs/db-versions)
     * includes an up-to-date reference of supported versions.
     * 
     */
    @Import(name="databaseVersion", required=true)
      private final Output<String> databaseVersion;

    public Output<String> getDatabaseVersion() {
        return this.databaseVersion;
    }

    /**
     * Whether or not to allow he provider to destroy the instance. Unless this field is set to false
     * in state, a `destroy` or `update` command that deletes the instance will fail.
     * 
     */
    @Import(name="deletionProtection")
      private final @Nullable Output<Boolean> deletionProtection;

    public Output<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Output.empty() : this.deletionProtection;
    }

    /**
     * The full path to the encryption key used for the CMEK disk encryption.  Setting
     * up disk encryption currently requires manual steps outside of this provider.
     * The provided key must be in the same region as the SQL instance.  In order
     * to use this feature, a special kind of service account must be created and
     * granted permission on this key.  This step can currently only be done
     * manually, please see [this step](https://cloud.google.com/sql/docs/mysql/configure-cmek#service-account).
     * That service account needs the `Cloud KMS > Cloud KMS CryptoKey Encrypter/Decrypter` role on your
     * key - please see [this step](https://cloud.google.com/sql/docs/mysql/configure-cmek#grantkey).
     * 
     */
    @Import(name="encryptionKeyName")
      private final @Nullable Output<String> encryptionKeyName;

    public Output<String> getEncryptionKeyName() {
        return this.encryptionKeyName == null ? Output.empty() : this.encryptionKeyName;
    }

    /**
     * The name of the existing instance that will
     * act as the master in the replication setup. Note, this requires the master to
     * have `binary_log_enabled` set, as well as existing backups.
     * 
     */
    @Import(name="masterInstanceName")
      private final @Nullable Output<String> masterInstanceName;

    public Output<String> getMasterInstanceName() {
        return this.masterInstanceName == null ? Output.empty() : this.masterInstanceName;
    }

    /**
     * A name for this whitelist entry.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The full project ID of the source instance.`
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The region the instance will sit in. Note, Cloud SQL is not
     * available in all regions - choose from one of the options listed [here](https://cloud.google.com/sql/docs/mysql/instance-locations).
     * A valid region must be provided to use this resource. If a region is not provided in the resource definition,
     * the provider region will be used instead, but this will be an apply-time error for instances if the provider
     * region is not supported with Cloud SQL. If you choose not to provide the `region` argument for this resource,
     * make sure you understand this.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * The configuration for replication. The
     * configuration is detailed below. Valid only for MySQL instances.
     * 
     */
    @Import(name="replicaConfiguration")
      private final @Nullable Output<DatabaseInstanceReplicaConfigurationArgs> replicaConfiguration;

    public Output<DatabaseInstanceReplicaConfigurationArgs> getReplicaConfiguration() {
        return this.replicaConfiguration == null ? Output.empty() : this.replicaConfiguration;
    }

    /**
     * The context needed to restore the database to a backup run. This field will
     * cause the provider to trigger the database to restore from the backup run indicated. The configuration is detailed below.
     * **NOTE:** Restoring from a backup is an imperative action and not recommended via this provider. Adding or modifying this
     * block during resource creation/update will trigger the restore action after the resource is created/updated.
     * 
     */
    @Import(name="restoreBackupContext")
      private final @Nullable Output<DatabaseInstanceRestoreBackupContextArgs> restoreBackupContext;

    public Output<DatabaseInstanceRestoreBackupContextArgs> getRestoreBackupContext() {
        return this.restoreBackupContext == null ? Output.empty() : this.restoreBackupContext;
    }

    /**
     * Initial root password. Required for MS SQL Server, ignored by MySQL and PostgreSQL.
     * 
     */
    @Import(name="rootPassword")
      private final @Nullable Output<String> rootPassword;

    public Output<String> getRootPassword() {
        return this.rootPassword == null ? Output.empty() : this.rootPassword;
    }

    /**
     * The settings to use for the database. The
     * configuration is detailed below. Required if `clone` is not set.
     * 
     */
    @Import(name="settings")
      private final @Nullable Output<DatabaseInstanceSettingsArgs> settings;

    public Output<DatabaseInstanceSettingsArgs> getSettings() {
        return this.settings == null ? Output.empty() : this.settings;
    }

    public DatabaseInstanceArgs(
        @Nullable Output<DatabaseInstanceCloneArgs> clone,
        Output<String> databaseVersion,
        @Nullable Output<Boolean> deletionProtection,
        @Nullable Output<String> encryptionKeyName,
        @Nullable Output<String> masterInstanceName,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<DatabaseInstanceReplicaConfigurationArgs> replicaConfiguration,
        @Nullable Output<DatabaseInstanceRestoreBackupContextArgs> restoreBackupContext,
        @Nullable Output<String> rootPassword,
        @Nullable Output<DatabaseInstanceSettingsArgs> settings) {
        this.clone = clone;
        this.databaseVersion = Objects.requireNonNull(databaseVersion, "expected parameter 'databaseVersion' to be non-null");
        this.deletionProtection = deletionProtection;
        this.encryptionKeyName = encryptionKeyName;
        this.masterInstanceName = masterInstanceName;
        this.name = name;
        this.project = project;
        this.region = region;
        this.replicaConfiguration = replicaConfiguration;
        this.restoreBackupContext = restoreBackupContext;
        this.rootPassword = rootPassword;
        this.settings = settings;
    }

    private DatabaseInstanceArgs() {
        this.clone = Output.empty();
        this.databaseVersion = Output.empty();
        this.deletionProtection = Output.empty();
        this.encryptionKeyName = Output.empty();
        this.masterInstanceName = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.replicaConfiguration = Output.empty();
        this.restoreBackupContext = Output.empty();
        this.rootPassword = Output.empty();
        this.settings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DatabaseInstanceCloneArgs> clone;
        private Output<String> databaseVersion;
        private @Nullable Output<Boolean> deletionProtection;
        private @Nullable Output<String> encryptionKeyName;
        private @Nullable Output<String> masterInstanceName;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<DatabaseInstanceReplicaConfigurationArgs> replicaConfiguration;
        private @Nullable Output<DatabaseInstanceRestoreBackupContextArgs> restoreBackupContext;
        private @Nullable Output<String> rootPassword;
        private @Nullable Output<DatabaseInstanceSettingsArgs> settings;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clone = defaults.clone;
    	      this.databaseVersion = defaults.databaseVersion;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.encryptionKeyName = defaults.encryptionKeyName;
    	      this.masterInstanceName = defaults.masterInstanceName;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.replicaConfiguration = defaults.replicaConfiguration;
    	      this.restoreBackupContext = defaults.restoreBackupContext;
    	      this.rootPassword = defaults.rootPassword;
    	      this.settings = defaults.settings;
        }

        public Builder clone(@Nullable Output<DatabaseInstanceCloneArgs> clone) {
            this.clone = clone;
            return this;
        }

        public Builder clone(@Nullable DatabaseInstanceCloneArgs clone) {
            this.clone = Output.ofNullable(clone);
            return this;
        }

        public Builder databaseVersion(Output<String> databaseVersion) {
            this.databaseVersion = Objects.requireNonNull(databaseVersion);
            return this;
        }

        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = Output.of(Objects.requireNonNull(databaseVersion));
            return this;
        }

        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Output.ofNullable(deletionProtection);
            return this;
        }

        public Builder encryptionKeyName(@Nullable Output<String> encryptionKeyName) {
            this.encryptionKeyName = encryptionKeyName;
            return this;
        }

        public Builder encryptionKeyName(@Nullable String encryptionKeyName) {
            this.encryptionKeyName = Output.ofNullable(encryptionKeyName);
            return this;
        }

        public Builder masterInstanceName(@Nullable Output<String> masterInstanceName) {
            this.masterInstanceName = masterInstanceName;
            return this;
        }

        public Builder masterInstanceName(@Nullable String masterInstanceName) {
            this.masterInstanceName = Output.ofNullable(masterInstanceName);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }

        public Builder replicaConfiguration(@Nullable Output<DatabaseInstanceReplicaConfigurationArgs> replicaConfiguration) {
            this.replicaConfiguration = replicaConfiguration;
            return this;
        }

        public Builder replicaConfiguration(@Nullable DatabaseInstanceReplicaConfigurationArgs replicaConfiguration) {
            this.replicaConfiguration = Output.ofNullable(replicaConfiguration);
            return this;
        }

        public Builder restoreBackupContext(@Nullable Output<DatabaseInstanceRestoreBackupContextArgs> restoreBackupContext) {
            this.restoreBackupContext = restoreBackupContext;
            return this;
        }

        public Builder restoreBackupContext(@Nullable DatabaseInstanceRestoreBackupContextArgs restoreBackupContext) {
            this.restoreBackupContext = Output.ofNullable(restoreBackupContext);
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

        public Builder settings(@Nullable Output<DatabaseInstanceSettingsArgs> settings) {
            this.settings = settings;
            return this;
        }

        public Builder settings(@Nullable DatabaseInstanceSettingsArgs settings) {
            this.settings = Output.ofNullable(settings);
            return this;
        }
        public DatabaseInstanceArgs build() {
            return new DatabaseInstanceArgs(clone, databaseVersion, deletionProtection, encryptionKeyName, masterInstanceName, name, project, region, replicaConfiguration, restoreBackupContext, rootPassword, settings);
        }
    }
}
