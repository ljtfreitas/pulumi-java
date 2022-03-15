// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx;

import io.pulumi.aws.fsx.inputs.OntapFileSystemDiskIopsConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OntapFileSystemArgs extends io.pulumi.resources.ResourceArgs {

    public static final OntapFileSystemArgs Empty = new OntapFileSystemArgs();

    /**
     * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
     * 
     */
    @Import(name="automaticBackupRetentionDays")
      private final @Nullable Output<Integer> automaticBackupRetentionDays;

    public Output<Integer> getAutomaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays == null ? Output.empty() : this.automaticBackupRetentionDays;
    }

    /**
     * A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    @Import(name="dailyAutomaticBackupStartTime")
      private final @Nullable Output<String> dailyAutomaticBackupStartTime;

    public Output<String> getDailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime == null ? Output.empty() : this.dailyAutomaticBackupStartTime;
    }

    /**
     * - The filesystem deployment type. Only `MULTI_AZ_1` is supported.
     * 
     */
    @Import(name="deploymentType", required=true)
      private final Output<String> deploymentType;

    public Output<String> getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system. See Disk Iops Configuration Below.
     * 
     */
    @Import(name="diskIopsConfiguration")
      private final @Nullable Output<OntapFileSystemDiskIopsConfigurationArgs> diskIopsConfiguration;

    public Output<OntapFileSystemDiskIopsConfigurationArgs> getDiskIopsConfiguration() {
        return this.diskIopsConfiguration == null ? Output.empty() : this.diskIopsConfiguration;
    }

    /**
     * Specifies the IP address range in which the endpoints to access your file system will be created. By default, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * 
     */
    @Import(name="endpointIpAddressRange")
      private final @Nullable Output<String> endpointIpAddressRange;

    public Output<String> getEndpointIpAddressRange() {
        return this.endpointIpAddressRange == null ? Output.empty() : this.endpointIpAddressRange;
    }

    /**
     * The ONTAP administrative password for the fsxadmin user that you can use to administer your file system using the ONTAP CLI and REST API.
     * 
     */
    @Import(name="fsxAdminPassword")
      private final @Nullable Output<String> fsxAdminPassword;

    public Output<String> getFsxAdminPassword() {
        return this.fsxAdminPassword == null ? Output.empty() : this.fsxAdminPassword;
    }

    /**
     * ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> getKmsKeyId() {
        return this.kmsKeyId == null ? Output.empty() : this.kmsKeyId;
    }

    /**
     * The ID for a subnet. A subnet is a range of IP addresses in your virtual private cloud (VPC).
     * 
     */
    @Import(name="preferredSubnetId", required=true)
      private final Output<String> preferredSubnetId;

    public Output<String> getPreferredSubnetId() {
        return this.preferredSubnetId;
    }

    /**
     * Specifies the VPC route tables in which your file system's endpoints will be created. You should specify all VPC route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your VPC's default route table.
     * 
     */
    @Import(name="routeTableIds")
      private final @Nullable Output<List<String>> routeTableIds;

    public Output<List<String>> getRouteTableIds() {
        return this.routeTableIds == null ? Output.empty() : this.routeTableIds;
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
     * The storage capacity (GiB) of the file system. Valid values between `1024` and `196608`.
     * 
     */
    @Import(name="storageCapacity")
      private final @Nullable Output<Integer> storageCapacity;

    public Output<Integer> getStorageCapacity() {
        return this.storageCapacity == null ? Output.empty() : this.storageCapacity;
    }

    /**
     * - The filesystem storage type. defaults to `SSD`.
     * 
     */
    @Import(name="storageType")
      private final @Nullable Output<String> storageType;

    public Output<String> getStorageType() {
        return this.storageType == null ? Output.empty() : this.storageType;
    }

    /**
     * A list of IDs for the subnets that the file system will be accessible from. Exactly 2 subnets need to be provided.
     * 
     */
    @Import(name="subnetIds", required=true)
      private final Output<List<String>> subnetIds;

    public Output<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

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

    public OntapFileSystemArgs(
        @Nullable Output<Integer> automaticBackupRetentionDays,
        @Nullable Output<String> dailyAutomaticBackupStartTime,
        Output<String> deploymentType,
        @Nullable Output<OntapFileSystemDiskIopsConfigurationArgs> diskIopsConfiguration,
        @Nullable Output<String> endpointIpAddressRange,
        @Nullable Output<String> fsxAdminPassword,
        @Nullable Output<String> kmsKeyId,
        Output<String> preferredSubnetId,
        @Nullable Output<List<String>> routeTableIds,
        @Nullable Output<List<String>> securityGroupIds,
        @Nullable Output<Integer> storageCapacity,
        @Nullable Output<String> storageType,
        Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags,
        Output<Integer> throughputCapacity,
        @Nullable Output<String> weeklyMaintenanceStartTime) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
        this.deploymentType = Objects.requireNonNull(deploymentType, "expected parameter 'deploymentType' to be non-null");
        this.diskIopsConfiguration = diskIopsConfiguration;
        this.endpointIpAddressRange = endpointIpAddressRange;
        this.fsxAdminPassword = fsxAdminPassword;
        this.kmsKeyId = kmsKeyId;
        this.preferredSubnetId = Objects.requireNonNull(preferredSubnetId, "expected parameter 'preferredSubnetId' to be non-null");
        this.routeTableIds = routeTableIds;
        this.securityGroupIds = securityGroupIds;
        this.storageCapacity = storageCapacity;
        this.storageType = storageType;
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
        this.throughputCapacity = Objects.requireNonNull(throughputCapacity, "expected parameter 'throughputCapacity' to be non-null");
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    private OntapFileSystemArgs() {
        this.automaticBackupRetentionDays = Output.empty();
        this.dailyAutomaticBackupStartTime = Output.empty();
        this.deploymentType = Output.empty();
        this.diskIopsConfiguration = Output.empty();
        this.endpointIpAddressRange = Output.empty();
        this.fsxAdminPassword = Output.empty();
        this.kmsKeyId = Output.empty();
        this.preferredSubnetId = Output.empty();
        this.routeTableIds = Output.empty();
        this.securityGroupIds = Output.empty();
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

    public static Builder builder(OntapFileSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> automaticBackupRetentionDays;
        private @Nullable Output<String> dailyAutomaticBackupStartTime;
        private Output<String> deploymentType;
        private @Nullable Output<OntapFileSystemDiskIopsConfigurationArgs> diskIopsConfiguration;
        private @Nullable Output<String> endpointIpAddressRange;
        private @Nullable Output<String> fsxAdminPassword;
        private @Nullable Output<String> kmsKeyId;
        private Output<String> preferredSubnetId;
        private @Nullable Output<List<String>> routeTableIds;
        private @Nullable Output<List<String>> securityGroupIds;
        private @Nullable Output<Integer> storageCapacity;
        private @Nullable Output<String> storageType;
        private Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;
        private Output<Integer> throughputCapacity;
        private @Nullable Output<String> weeklyMaintenanceStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapFileSystemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticBackupRetentionDays = defaults.automaticBackupRetentionDays;
    	      this.dailyAutomaticBackupStartTime = defaults.dailyAutomaticBackupStartTime;
    	      this.deploymentType = defaults.deploymentType;
    	      this.diskIopsConfiguration = defaults.diskIopsConfiguration;
    	      this.endpointIpAddressRange = defaults.endpointIpAddressRange;
    	      this.fsxAdminPassword = defaults.fsxAdminPassword;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.preferredSubnetId = defaults.preferredSubnetId;
    	      this.routeTableIds = defaults.routeTableIds;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.storageCapacity = defaults.storageCapacity;
    	      this.storageType = defaults.storageType;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.throughputCapacity = defaults.throughputCapacity;
    	      this.weeklyMaintenanceStartTime = defaults.weeklyMaintenanceStartTime;
        }

        public Builder automaticBackupRetentionDays(@Nullable Output<Integer> automaticBackupRetentionDays) {
            this.automaticBackupRetentionDays = automaticBackupRetentionDays;
            return this;
        }

        public Builder automaticBackupRetentionDays(@Nullable Integer automaticBackupRetentionDays) {
            this.automaticBackupRetentionDays = Output.ofNullable(automaticBackupRetentionDays);
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

        public Builder deploymentType(Output<String> deploymentType) {
            this.deploymentType = Objects.requireNonNull(deploymentType);
            return this;
        }

        public Builder deploymentType(String deploymentType) {
            this.deploymentType = Output.of(Objects.requireNonNull(deploymentType));
            return this;
        }

        public Builder diskIopsConfiguration(@Nullable Output<OntapFileSystemDiskIopsConfigurationArgs> diskIopsConfiguration) {
            this.diskIopsConfiguration = diskIopsConfiguration;
            return this;
        }

        public Builder diskIopsConfiguration(@Nullable OntapFileSystemDiskIopsConfigurationArgs diskIopsConfiguration) {
            this.diskIopsConfiguration = Output.ofNullable(diskIopsConfiguration);
            return this;
        }

        public Builder endpointIpAddressRange(@Nullable Output<String> endpointIpAddressRange) {
            this.endpointIpAddressRange = endpointIpAddressRange;
            return this;
        }

        public Builder endpointIpAddressRange(@Nullable String endpointIpAddressRange) {
            this.endpointIpAddressRange = Output.ofNullable(endpointIpAddressRange);
            return this;
        }

        public Builder fsxAdminPassword(@Nullable Output<String> fsxAdminPassword) {
            this.fsxAdminPassword = fsxAdminPassword;
            return this;
        }

        public Builder fsxAdminPassword(@Nullable String fsxAdminPassword) {
            this.fsxAdminPassword = Output.ofNullable(fsxAdminPassword);
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

        public Builder preferredSubnetId(Output<String> preferredSubnetId) {
            this.preferredSubnetId = Objects.requireNonNull(preferredSubnetId);
            return this;
        }

        public Builder preferredSubnetId(String preferredSubnetId) {
            this.preferredSubnetId = Output.of(Objects.requireNonNull(preferredSubnetId));
            return this;
        }

        public Builder routeTableIds(@Nullable Output<List<String>> routeTableIds) {
            this.routeTableIds = routeTableIds;
            return this;
        }

        public Builder routeTableIds(@Nullable List<String> routeTableIds) {
            this.routeTableIds = Output.ofNullable(routeTableIds);
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
        public OntapFileSystemArgs build() {
            return new OntapFileSystemArgs(automaticBackupRetentionDays, dailyAutomaticBackupStartTime, deploymentType, diskIopsConfiguration, endpointIpAddressRange, fsxAdminPassword, kmsKeyId, preferredSubnetId, routeTableIds, securityGroupIds, storageCapacity, storageType, subnetIds, tags, throughputCapacity, weeklyMaintenanceStartTime);
        }
    }
}
