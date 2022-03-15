// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.azurenative.recoveryservices.inputs.DPMContainerExtendedInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AzureBackupServer (DPMVenus) workload-specific protection container.
 * 
 */
public final class AzureBackupServerContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureBackupServerContainerArgs Empty = new AzureBackupServerContainerArgs();

    /**
     * Type of backup management for the container.
     * 
     */
    @Import(name="backupManagementType")
      private final @Nullable Output<Either<String,BackupManagementType>> backupManagementType;

    public Output<Either<String,BackupManagementType>> getBackupManagementType() {
        return this.backupManagementType == null ? Output.empty() : this.backupManagementType;
    }

    /**
     * Specifies whether the container is re-registrable.
     * 
     */
    @Import(name="canReRegister")
      private final @Nullable Output<Boolean> canReRegister;

    public Output<Boolean> getCanReRegister() {
        return this.canReRegister == null ? Output.empty() : this.canReRegister;
    }

    /**
     * ID of container.
     * 
     */
    @Import(name="containerId")
      private final @Nullable Output<String> containerId;

    public Output<String> getContainerId() {
        return this.containerId == null ? Output.empty() : this.containerId;
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'AzureBackupServerContainer'.
     * 
     */
    @Import(name="containerType", required=true)
      private final Output<String> containerType;

    public Output<String> getContainerType() {
        return this.containerType;
    }

    /**
     * Backup engine Agent version
     * 
     */
    @Import(name="dpmAgentVersion")
      private final @Nullable Output<String> dpmAgentVersion;

    public Output<String> getDpmAgentVersion() {
        return this.dpmAgentVersion == null ? Output.empty() : this.dpmAgentVersion;
    }

    /**
     * List of BackupEngines protecting the container
     * 
     */
    @Import(name="dpmServers")
      private final @Nullable Output<List<String>> dpmServers;

    public Output<List<String>> getDpmServers() {
        return this.dpmServers == null ? Output.empty() : this.dpmServers;
    }

    /**
     * Extended Info of the container.
     * 
     */
    @Import(name="extendedInfo")
      private final @Nullable Output<DPMContainerExtendedInfoArgs> extendedInfo;

    public Output<DPMContainerExtendedInfoArgs> getExtendedInfo() {
        return this.extendedInfo == null ? Output.empty() : this.extendedInfo;
    }

    /**
     * Friendly name of the container.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> getFriendlyName() {
        return this.friendlyName == null ? Output.empty() : this.friendlyName;
    }

    /**
     * Status of health of the container.
     * 
     */
    @Import(name="healthStatus")
      private final @Nullable Output<String> healthStatus;

    public Output<String> getHealthStatus() {
        return this.healthStatus == null ? Output.empty() : this.healthStatus;
    }

    /**
     * Number of protected items in the BackupEngine
     * 
     */
    @Import(name="protectedItemCount")
      private final @Nullable Output<Double> protectedItemCount;

    public Output<Double> getProtectedItemCount() {
        return this.protectedItemCount == null ? Output.empty() : this.protectedItemCount;
    }

    /**
     * Protection status of the container.
     * 
     */
    @Import(name="protectionStatus")
      private final @Nullable Output<String> protectionStatus;

    public Output<String> getProtectionStatus() {
        return this.protectionStatus == null ? Output.empty() : this.protectionStatus;
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @Import(name="registrationStatus")
      private final @Nullable Output<String> registrationStatus;

    public Output<String> getRegistrationStatus() {
        return this.registrationStatus == null ? Output.empty() : this.registrationStatus;
    }

    /**
     * To check if upgrade available
     * 
     */
    @Import(name="upgradeAvailable")
      private final @Nullable Output<Boolean> upgradeAvailable;

    public Output<Boolean> getUpgradeAvailable() {
        return this.upgradeAvailable == null ? Output.empty() : this.upgradeAvailable;
    }

    public AzureBackupServerContainerArgs(
        @Nullable Output<Either<String,BackupManagementType>> backupManagementType,
        @Nullable Output<Boolean> canReRegister,
        @Nullable Output<String> containerId,
        Output<String> containerType,
        @Nullable Output<String> dpmAgentVersion,
        @Nullable Output<List<String>> dpmServers,
        @Nullable Output<DPMContainerExtendedInfoArgs> extendedInfo,
        @Nullable Output<String> friendlyName,
        @Nullable Output<String> healthStatus,
        @Nullable Output<Double> protectedItemCount,
        @Nullable Output<String> protectionStatus,
        @Nullable Output<String> registrationStatus,
        @Nullable Output<Boolean> upgradeAvailable) {
        this.backupManagementType = backupManagementType;
        this.canReRegister = canReRegister;
        this.containerId = containerId;
        this.containerType = Objects.requireNonNull(containerType, "expected parameter 'containerType' to be non-null");
        this.dpmAgentVersion = dpmAgentVersion;
        this.dpmServers = dpmServers;
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.protectedItemCount = protectedItemCount;
        this.protectionStatus = protectionStatus;
        this.registrationStatus = registrationStatus;
        this.upgradeAvailable = upgradeAvailable;
    }

    private AzureBackupServerContainerArgs() {
        this.backupManagementType = Output.empty();
        this.canReRegister = Output.empty();
        this.containerId = Output.empty();
        this.containerType = Output.empty();
        this.dpmAgentVersion = Output.empty();
        this.dpmServers = Output.empty();
        this.extendedInfo = Output.empty();
        this.friendlyName = Output.empty();
        this.healthStatus = Output.empty();
        this.protectedItemCount = Output.empty();
        this.protectionStatus = Output.empty();
        this.registrationStatus = Output.empty();
        this.upgradeAvailable = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBackupServerContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,BackupManagementType>> backupManagementType;
        private @Nullable Output<Boolean> canReRegister;
        private @Nullable Output<String> containerId;
        private Output<String> containerType;
        private @Nullable Output<String> dpmAgentVersion;
        private @Nullable Output<List<String>> dpmServers;
        private @Nullable Output<DPMContainerExtendedInfoArgs> extendedInfo;
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<String> healthStatus;
        private @Nullable Output<Double> protectedItemCount;
        private @Nullable Output<String> protectionStatus;
        private @Nullable Output<String> registrationStatus;
        private @Nullable Output<Boolean> upgradeAvailable;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBackupServerContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.canReRegister = defaults.canReRegister;
    	      this.containerId = defaults.containerId;
    	      this.containerType = defaults.containerType;
    	      this.dpmAgentVersion = defaults.dpmAgentVersion;
    	      this.dpmServers = defaults.dpmServers;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.protectedItemCount = defaults.protectedItemCount;
    	      this.protectionStatus = defaults.protectionStatus;
    	      this.registrationStatus = defaults.registrationStatus;
    	      this.upgradeAvailable = defaults.upgradeAvailable;
        }

        public Builder backupManagementType(@Nullable Output<Either<String,BackupManagementType>> backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder backupManagementType(@Nullable Either<String,BackupManagementType> backupManagementType) {
            this.backupManagementType = Output.ofNullable(backupManagementType);
            return this;
        }

        public Builder canReRegister(@Nullable Output<Boolean> canReRegister) {
            this.canReRegister = canReRegister;
            return this;
        }

        public Builder canReRegister(@Nullable Boolean canReRegister) {
            this.canReRegister = Output.ofNullable(canReRegister);
            return this;
        }

        public Builder containerId(@Nullable Output<String> containerId) {
            this.containerId = containerId;
            return this;
        }

        public Builder containerId(@Nullable String containerId) {
            this.containerId = Output.ofNullable(containerId);
            return this;
        }

        public Builder containerType(Output<String> containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }

        public Builder containerType(String containerType) {
            this.containerType = Output.of(Objects.requireNonNull(containerType));
            return this;
        }

        public Builder dpmAgentVersion(@Nullable Output<String> dpmAgentVersion) {
            this.dpmAgentVersion = dpmAgentVersion;
            return this;
        }

        public Builder dpmAgentVersion(@Nullable String dpmAgentVersion) {
            this.dpmAgentVersion = Output.ofNullable(dpmAgentVersion);
            return this;
        }

        public Builder dpmServers(@Nullable Output<List<String>> dpmServers) {
            this.dpmServers = dpmServers;
            return this;
        }

        public Builder dpmServers(@Nullable List<String> dpmServers) {
            this.dpmServers = Output.ofNullable(dpmServers);
            return this;
        }

        public Builder extendedInfo(@Nullable Output<DPMContainerExtendedInfoArgs> extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder extendedInfo(@Nullable DPMContainerExtendedInfoArgs extendedInfo) {
            this.extendedInfo = Output.ofNullable(extendedInfo);
            return this;
        }

        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Output.ofNullable(friendlyName);
            return this;
        }

        public Builder healthStatus(@Nullable Output<String> healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder healthStatus(@Nullable String healthStatus) {
            this.healthStatus = Output.ofNullable(healthStatus);
            return this;
        }

        public Builder protectedItemCount(@Nullable Output<Double> protectedItemCount) {
            this.protectedItemCount = protectedItemCount;
            return this;
        }

        public Builder protectedItemCount(@Nullable Double protectedItemCount) {
            this.protectedItemCount = Output.ofNullable(protectedItemCount);
            return this;
        }

        public Builder protectionStatus(@Nullable Output<String> protectionStatus) {
            this.protectionStatus = protectionStatus;
            return this;
        }

        public Builder protectionStatus(@Nullable String protectionStatus) {
            this.protectionStatus = Output.ofNullable(protectionStatus);
            return this;
        }

        public Builder registrationStatus(@Nullable Output<String> registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }

        public Builder registrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = Output.ofNullable(registrationStatus);
            return this;
        }

        public Builder upgradeAvailable(@Nullable Output<Boolean> upgradeAvailable) {
            this.upgradeAvailable = upgradeAvailable;
            return this;
        }

        public Builder upgradeAvailable(@Nullable Boolean upgradeAvailable) {
            this.upgradeAvailable = Output.ofNullable(upgradeAvailable);
            return this;
        }
        public AzureBackupServerContainerArgs build() {
            return new AzureBackupServerContainerArgs(backupManagementType, canReRegister, containerId, containerType, dpmAgentVersion, dpmServers, extendedInfo, friendlyName, healthStatus, protectedItemCount, protectionStatus, registrationStatus, upgradeAvailable);
        }
    }
}
