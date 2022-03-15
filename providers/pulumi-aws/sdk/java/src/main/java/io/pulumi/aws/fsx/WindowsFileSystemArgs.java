// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx;

import io.pulumi.aws.fsx.inputs.WindowsFileSystemAuditLogConfigurationArgs;
import io.pulumi.aws.fsx.inputs.WindowsFileSystemSelfManagedActiveDirectoryArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WindowsFileSystemArgs extends io.pulumi.resources.ResourceArgs {

    public static final WindowsFileSystemArgs Empty = new WindowsFileSystemArgs();

    /**
     * The ID for an existing Microsoft Active Directory instance that the file system should join when it's created. Cannot be specified with `self_managed_active_directory`.
     * 
     */
    @Import(name="activeDirectoryId")
      private final @Nullable Output<String> activeDirectoryId;

    public Output<String> getActiveDirectoryId() {
        return this.activeDirectoryId == null ? Output.empty() : this.activeDirectoryId;
    }

    /**
     * An array DNS alias names that you want to associate with the Amazon FSx file system.  For more information, see [Working with DNS Aliases](https://docs.aws.amazon.com/fsx/latest/WindowsGuide/managing-dns-aliases.html)
     * 
     */
    @Import(name="aliases")
      private final @Nullable Output<List<String>> aliases;

    public Output<List<String>> getAliases() {
        return this.aliases == null ? Output.empty() : this.aliases;
    }

    /**
     * The configuration that Amazon FSx for Windows File Server uses to audit and log user accesses of files, folders, and file shares on the Amazon FSx for Windows File Server file system. See below.
     * 
     */
    @Import(name="auditLogConfiguration")
      private final @Nullable Output<WindowsFileSystemAuditLogConfigurationArgs> auditLogConfiguration;

    public Output<WindowsFileSystemAuditLogConfigurationArgs> getAuditLogConfiguration() {
        return this.auditLogConfiguration == null ? Output.empty() : this.auditLogConfiguration;
    }

    /**
     * The number of days to retain automatic backups. Minimum of `0` and maximum of `90`. Defaults to `7`. Set to `0` to disable.
     * 
     */
    @Import(name="automaticBackupRetentionDays")
      private final @Nullable Output<Integer> automaticBackupRetentionDays;

    public Output<Integer> getAutomaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays == null ? Output.empty() : this.automaticBackupRetentionDays;
    }

    /**
     * The ID of the source backup to create the filesystem from.
     * 
     */
    @Import(name="backupId")
      private final @Nullable Output<String> backupId;

    public Output<String> getBackupId() {
        return this.backupId == null ? Output.empty() : this.backupId;
    }

    /**
     * A boolean flag indicating whether tags on the file system should be copied to backups. Defaults to `false`.
     * 
     */
    @Import(name="copyTagsToBackups")
      private final @Nullable Output<Boolean> copyTagsToBackups;

    public Output<Boolean> getCopyTagsToBackups() {
        return this.copyTagsToBackups == null ? Output.empty() : this.copyTagsToBackups;
    }

    /**
     * The preferred time (in `HH:MM` format) to take daily automatic backups, in the UTC time zone.
     * 
     */
    @Import(name="dailyAutomaticBackupStartTime")
      private final @Nullable Output<String> dailyAutomaticBackupStartTime;

    public Output<String> getDailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime == null ? Output.empty() : this.dailyAutomaticBackupStartTime;
    }

    /**
     * Specifies the file system deployment type, valid values are `MULTI_AZ_1`, `SINGLE_AZ_1` and `SINGLE_AZ_2`. Default value is `SINGLE_AZ_1`.
     * 
     */
    @Import(name="deploymentType")
      private final @Nullable Output<String> deploymentType;

    public Output<String> getDeploymentType() {
        return this.deploymentType == null ? Output.empty() : this.deploymentType;
    }

    /**
     * ARN for the KMS Key to encrypt the file system at rest. Defaults to an AWS managed KMS Key.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * Specifies the subnet in which you want the preferred file server to be located. Required for when deployment type is `MULTI_AZ_1`.
     * 
     */
    @Import(name="preferredSubnetId")
      private final @Nullable Output<String> preferredSubnetId;

    public Output<String> getPreferredSubnetId() {
        return this.preferredSubnetId == null ? Output.empty() : this.preferredSubnetId;
    }

    /**
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    @Import(name="securityGroupIds")
      private final @Nullable Output<List<String>> securityGroupIds;

    public Output<List<String>> getSecurityGroupIds() {
        return this.securityGroupIds == null ? Output.empty() : this.securityGroupIds;
    }

    /**
     * Configuration block that Amazon FSx uses to join the Windows File Server instance to your self-managed (including on-premises) Microsoft Active Directory (AD) directory. Cannot be specified with `active_directory_id`. Detailed below.
     * 
     */
    @Import(name="selfManagedActiveDirectory")
      private final @Nullable Output<WindowsFileSystemSelfManagedActiveDirectoryArgs> selfManagedActiveDirectory;

    public Output<WindowsFileSystemSelfManagedActiveDirectoryArgs> getSelfManagedActiveDirectory() {
        return this.selfManagedActiveDirectory == null ? Output.empty() : this.selfManagedActiveDirectory;
    }

    /**
     * When enabled, will skip the default final backup taken when the file system is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
     * 
     */
    @Import(name="skipFinalBackup")
      private final @Nullable Output<Boolean> skipFinalBackup;

    public Output<Boolean> getSkipFinalBackup() {
        return this.skipFinalBackup == null ? Output.empty() : this.skipFinalBackup;
    }

    /**
     * Storage capacity (GiB) of the file system. Minimum of 32 and maximum of 65536. If the storage type is set to `HDD` the minimum value is 2000. Required when not creating filesystem for a backup.
     * 
     */
    @Import(name="storageCapacity")
      private final @Nullable Output<Integer> storageCapacity;

    public Output<Integer> getStorageCapacity() {
        return this.storageCapacity == null ? Output.empty() : this.storageCapacity;
    }

    /**
     * Specifies the storage type, Valid values are `SSD` and `HDD`. `HDD` is supported on `SINGLE_AZ_2` and `MULTI_AZ_1` Windows file system deployment types. Default value is `SSD`.
     * 
     */
    @Import(name="storageType")
      private final @Nullable Output<String> storageType;

    public Output<String> getStorageType() {
        return this.storageType == null ? Output.empty() : this.storageType;
    }

    /**
     * A list of IDs for the subnets that the file system will be accessible from. To specify more than a single subnet set `deployment_type` to `MULTI_AZ_1`.
     * 
     */
    @Import(name="subnetIds", required=true)
      private final Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * A map of tags to assign to the file system. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Throughput (megabytes per second) of the file system in power of 2 increments. Minimum of `8` and maximum of `2048`.
     * 
     */
    @Import(name="throughputCapacity", required=true)
      private final Output<Integer> throughputCapacity;

    public Output<Integer> getThroughputCapacity() {
        return this.throughputCapacity;
    }

    /**
     * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    @Import(name="weeklyMaintenanceStartTime")
      private final @Nullable Output<String> weeklyMaintenanceStartTime;

    public Output<String> getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime == null ? Output.empty() : this.weeklyMaintenanceStartTime;
    }

    public WindowsFileSystemArgs(
        @Nullable Output<String> activeDirectoryId,
        @Nullable Output<List<String>> aliases,
        @Nullable Output<WindowsFileSystemAuditLogConfigurationArgs> auditLogConfiguration,
        @Nullable Output<Integer> automaticBackupRetentionDays,
        @Nullable Output<String> backupId,
        @Nullable Output<Boolean> copyTagsToBackups,
        @Nullable Output<String> dailyAutomaticBackupStartTime,
        @Nullable Output<String> deploymentType,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> preferredSubnetId,
        @Nullable Output<List<String>> securityGroupIds,
        @Nullable Output<WindowsFileSystemSelfManagedActiveDirectoryArgs> selfManagedActiveDirectory,
        @Nullable Output<Boolean> skipFinalBackup,
        @Nullable Output<Integer> storageCapacity,
        @Nullable Output<String> storageType,
        Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags,
        Output<Integer> throughputCapacity,
        @Nullable Output<String> weeklyMaintenanceStartTime) {
        this.activeDirectoryId = activeDirectoryId;
        this.aliases = aliases;
        this.auditLogConfiguration = auditLogConfiguration;
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
        this.backupId = backupId;
        this.copyTagsToBackups = copyTagsToBackups;
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
        this.deploymentType = deploymentType;
        this.kmsKeyId = kmsKeyId;
        this.preferredSubnetId = preferredSubnetId;
        this.securityGroupIds = securityGroupIds;
        this.selfManagedActiveDirectory = selfManagedActiveDirectory;
        this.skipFinalBackup = skipFinalBackup;
        this.storageCapacity = storageCapacity;
        this.storageType = storageType;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
        this.throughputCapacity = Objects.requireNonNull(throughputCapacity, "expected parameter 'throughputCapacity' to be non-null");
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    private WindowsFileSystemArgs() {
        this.activeDirectoryId = Output.empty();
        this.aliases = Output.empty();
        this.auditLogConfiguration = Output.empty();
        this.automaticBackupRetentionDays = Output.empty();
        this.backupId = Output.empty();
        this.copyTagsToBackups = Output.empty();
        this.dailyAutomaticBackupStartTime = Output.empty();
        this.deploymentType = Output.empty();
        this.kmsKeyId = Output.empty();
        this.preferredSubnetId = Output.empty();
        this.securityGroupIds = Output.empty();
        this.selfManagedActiveDirectory = Output.empty();
        this.skipFinalBackup = Output.empty();
        this.storageCapacity = Output.empty();
        this.storageType = Output.empty();
        this.subnetIds = Output.empty();
        this.tags = Output.empty();
        this.throughputCapacity = Output.empty();
        this.weeklyMaintenanceStartTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsFileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> activeDirectoryId;
        private @Nullable Output<List<String>> aliases;
        private @Nullable Output<WindowsFileSystemAuditLogConfigurationArgs> auditLogConfiguration;
        private @Nullable Output<Integer> automaticBackupRetentionDays;
        private @Nullable Output<String> backupId;
        private @Nullable Output<Boolean> copyTagsToBackups;
        private @Nullable Output<String> dailyAutomaticBackupStartTime;
        private @Nullable Output<String> deploymentType;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> preferredSubnetId;
        private @Nullable Output<List<String>> securityGroupIds;
        private @Nullable Output<WindowsFileSystemSelfManagedActiveDirectoryArgs> selfManagedActiveDirectory;
        private @Nullable Output<Boolean> skipFinalBackup;
        private @Nullable Output<Integer> storageCapacity;
        private @Nullable Output<String> storageType;
        private Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;
        private Output<Integer> throughputCapacity;
        private @Nullable Output<String> weeklyMaintenanceStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsFileSystemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryId = defaults.activeDirectoryId;
    	      this.aliases = defaults.aliases;
    	      this.auditLogConfiguration = defaults.auditLogConfiguration;
    	      this.automaticBackupRetentionDays = defaults.automaticBackupRetentionDays;
    	      this.backupId = defaults.backupId;
    	      this.copyTagsToBackups = defaults.copyTagsToBackups;
    	      this.dailyAutomaticBackupStartTime = defaults.dailyAutomaticBackupStartTime;
    	      this.deploymentType = defaults.deploymentType;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.preferredSubnetId = defaults.preferredSubnetId;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.selfManagedActiveDirectory = defaults.selfManagedActiveDirectory;
    	      this.skipFinalBackup = defaults.skipFinalBackup;
    	      this.storageCapacity = defaults.storageCapacity;
    	      this.storageType = defaults.storageType;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.throughputCapacity = defaults.throughputCapacity;
    	      this.weeklyMaintenanceStartTime = defaults.weeklyMaintenanceStartTime;
        }

        public Builder activeDirectoryId(@Nullable Output<String> activeDirectoryId) {
            this.activeDirectoryId = activeDirectoryId;
            return this;
        }

        public Builder activeDirectoryId(@Nullable String activeDirectoryId) {
            this.activeDirectoryId = Output.ofNullable(activeDirectoryId);
            return this;
        }

        public Builder aliases(@Nullable Output<List<String>> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder aliases(@Nullable List<String> aliases) {
            this.aliases = Output.ofNullable(aliases);
            return this;
        }

        public Builder auditLogConfiguration(@Nullable Output<WindowsFileSystemAuditLogConfigurationArgs> auditLogConfiguration) {
            this.auditLogConfiguration = auditLogConfiguration;
            return this;
        }

        public Builder auditLogConfiguration(@Nullable WindowsFileSystemAuditLogConfigurationArgs auditLogConfiguration) {
            this.auditLogConfiguration = Output.ofNullable(auditLogConfiguration);
            return this;
        }

        public Builder automaticBackupRetentionDays(@Nullable Output<Integer> automaticBackupRetentionDays) {
            this.automaticBackupRetentionDays = automaticBackupRetentionDays;
            return this;
        }

        public Builder automaticBackupRetentionDays(@Nullable Integer automaticBackupRetentionDays) {
            this.automaticBackupRetentionDays = Output.ofNullable(automaticBackupRetentionDays);
            return this;
        }

        public Builder backupId(@Nullable Output<String> backupId) {
            this.backupId = backupId;
            return this;
        }

        public Builder backupId(@Nullable String backupId) {
            this.backupId = Output.ofNullable(backupId);
            return this;
        }

        public Builder copyTagsToBackups(@Nullable Output<Boolean> copyTagsToBackups) {
            this.copyTagsToBackups = copyTagsToBackups;
            return this;
        }

        public Builder copyTagsToBackups(@Nullable Boolean copyTagsToBackups) {
            this.copyTagsToBackups = Output.ofNullable(copyTagsToBackups);
            return this;
        }

        public Builder dailyAutomaticBackupStartTime(@Nullable Output<String> dailyAutomaticBackupStartTime) {
            this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
            return this;
        }

        public Builder dailyAutomaticBackupStartTime(@Nullable String dailyAutomaticBackupStartTime) {
            this.dailyAutomaticBackupStartTime = Output.ofNullable(dailyAutomaticBackupStartTime);
            return this;
        }

        public Builder deploymentType(@Nullable Output<String> deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }

        public Builder deploymentType(@Nullable String deploymentType) {
            this.deploymentType = Output.ofNullable(deploymentType);
            return this;
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Output.ofNullable(kmsKeyId);
            return this;
        }

        public Builder preferredSubnetId(@Nullable Output<String> preferredSubnetId) {
            this.preferredSubnetId = preferredSubnetId;
            return this;
        }

        public Builder preferredSubnetId(@Nullable String preferredSubnetId) {
            this.preferredSubnetId = Output.ofNullable(preferredSubnetId);
            return this;
        }

        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = Output.ofNullable(securityGroupIds);
            return this;
        }

        public Builder selfManagedActiveDirectory(@Nullable Output<WindowsFileSystemSelfManagedActiveDirectoryArgs> selfManagedActiveDirectory) {
            this.selfManagedActiveDirectory = selfManagedActiveDirectory;
            return this;
        }

        public Builder selfManagedActiveDirectory(@Nullable WindowsFileSystemSelfManagedActiveDirectoryArgs selfManagedActiveDirectory) {
            this.selfManagedActiveDirectory = Output.ofNullable(selfManagedActiveDirectory);
            return this;
        }

        public Builder skipFinalBackup(@Nullable Output<Boolean> skipFinalBackup) {
            this.skipFinalBackup = skipFinalBackup;
            return this;
        }

        public Builder skipFinalBackup(@Nullable Boolean skipFinalBackup) {
            this.skipFinalBackup = Output.ofNullable(skipFinalBackup);
            return this;
        }

        public Builder storageCapacity(@Nullable Output<Integer> storageCapacity) {
            this.storageCapacity = storageCapacity;
            return this;
        }

        public Builder storageCapacity(@Nullable Integer storageCapacity) {
            this.storageCapacity = Output.ofNullable(storageCapacity);
            return this;
        }

        public Builder storageType(@Nullable Output<String> storageType) {
            this.storageType = storageType;
            return this;
        }

        public Builder storageType(@Nullable String storageType) {
            this.storageType = Output.ofNullable(storageType);
            return this;
        }

        public Builder subnetIds(Output<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Output.of(Objects.requireNonNull(subnetIds));
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder throughputCapacity(Output<Integer> throughputCapacity) {
            this.throughputCapacity = Objects.requireNonNull(throughputCapacity);
            return this;
        }

        public Builder throughputCapacity(Integer throughputCapacity) {
            this.throughputCapacity = Output.of(Objects.requireNonNull(throughputCapacity));
            return this;
        }

        public Builder weeklyMaintenanceStartTime(@Nullable Output<String> weeklyMaintenanceStartTime) {
            this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
            return this;
        }

        public Builder weeklyMaintenanceStartTime(@Nullable String weeklyMaintenanceStartTime) {
            this.weeklyMaintenanceStartTime = Output.ofNullable(weeklyMaintenanceStartTime);
            return this;
        }
        public WindowsFileSystemArgs build() {
            return new WindowsFileSystemArgs(activeDirectoryId, aliases, auditLogConfiguration, automaticBackupRetentionDays, backupId, copyTagsToBackups, dailyAutomaticBackupStartTime, deploymentType, kmsKeyId, preferredSubnetId, securityGroupIds, selfManagedActiveDirectory, skipFinalBackup, storageCapacity, storageType, subnetIds, tags, throughputCapacity, weeklyMaintenanceStartTime);
        }
    }
}
