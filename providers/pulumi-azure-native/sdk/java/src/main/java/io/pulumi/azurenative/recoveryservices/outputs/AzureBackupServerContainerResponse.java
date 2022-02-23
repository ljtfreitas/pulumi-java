// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.DPMContainerExtendedInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureBackupServerContainerResponse {
    /**
     * Type of backup management for the container.
     * 
     */
    private final @Nullable String backupManagementType;
    /**
     * Specifies whether the container is re-registrable.
     * 
     */
    private final @Nullable Boolean canReRegister;
    /**
     * ID of container.
     * 
     */
    private final @Nullable String containerId;
    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'AzureBackupServerContainer'.
     * 
     */
    private final String containerType;
    /**
     * Backup engine Agent version
     * 
     */
    private final @Nullable String dpmAgentVersion;
    /**
     * List of BackupEngines protecting the container
     * 
     */
    private final @Nullable List<String> dpmServers;
    /**
     * Extended Info of the container.
     * 
     */
    private final @Nullable DPMContainerExtendedInfoResponse extendedInfo;
    /**
     * Friendly name of the container.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * Status of health of the container.
     * 
     */
    private final @Nullable String healthStatus;
    /**
     * Number of protected items in the BackupEngine
     * 
     */
    private final @Nullable Double protectedItemCount;
    /**
     * Protection status of the container.
     * 
     */
    private final @Nullable String protectionStatus;
    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    private final @Nullable String registrationStatus;
    /**
     * To check if upgrade available
     * 
     */
    private final @Nullable Boolean upgradeAvailable;

    @OutputCustomType.Constructor({"backupManagementType","canReRegister","containerId","containerType","dpmAgentVersion","dpmServers","extendedInfo","friendlyName","healthStatus","protectedItemCount","protectionStatus","registrationStatus","upgradeAvailable"})
    private AzureBackupServerContainerResponse(
        @Nullable String backupManagementType,
        @Nullable Boolean canReRegister,
        @Nullable String containerId,
        String containerType,
        @Nullable String dpmAgentVersion,
        @Nullable List<String> dpmServers,
        @Nullable DPMContainerExtendedInfoResponse extendedInfo,
        @Nullable String friendlyName,
        @Nullable String healthStatus,
        @Nullable Double protectedItemCount,
        @Nullable String protectionStatus,
        @Nullable String registrationStatus,
        @Nullable Boolean upgradeAvailable) {
        this.backupManagementType = backupManagementType;
        this.canReRegister = canReRegister;
        this.containerId = containerId;
        this.containerType = Objects.requireNonNull(containerType);
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

    /**
     * Type of backup management for the container.
     * 
     */
    public Optional<String> getBackupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    /**
     * Specifies whether the container is re-registrable.
     * 
     */
    public Optional<Boolean> getCanReRegister() {
        return Optional.ofNullable(this.canReRegister);
    }
    /**
     * ID of container.
     * 
     */
    public Optional<String> getContainerId() {
        return Optional.ofNullable(this.containerId);
    }
    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'AzureBackupServerContainer'.
     * 
     */
    public String getContainerType() {
        return this.containerType;
    }
    /**
     * Backup engine Agent version
     * 
     */
    public Optional<String> getDpmAgentVersion() {
        return Optional.ofNullable(this.dpmAgentVersion);
    }
    /**
     * List of BackupEngines protecting the container
     * 
     */
    public List<String> getDpmServers() {
        return this.dpmServers == null ? List.of() : this.dpmServers;
    }
    /**
     * Extended Info of the container.
     * 
     */
    public Optional<DPMContainerExtendedInfoResponse> getExtendedInfo() {
        return Optional.ofNullable(this.extendedInfo);
    }
    /**
     * Friendly name of the container.
     * 
     */
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * Status of health of the container.
     * 
     */
    public Optional<String> getHealthStatus() {
        return Optional.ofNullable(this.healthStatus);
    }
    /**
     * Number of protected items in the BackupEngine
     * 
     */
    public Optional<Double> getProtectedItemCount() {
        return Optional.ofNullable(this.protectedItemCount);
    }
    /**
     * Protection status of the container.
     * 
     */
    public Optional<String> getProtectionStatus() {
        return Optional.ofNullable(this.protectionStatus);
    }
    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    public Optional<String> getRegistrationStatus() {
        return Optional.ofNullable(this.registrationStatus);
    }
    /**
     * To check if upgrade available
     * 
     */
    public Optional<Boolean> getUpgradeAvailable() {
        return Optional.ofNullable(this.upgradeAvailable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBackupServerContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private @Nullable Boolean canReRegister;
        private @Nullable String containerId;
        private String containerType;
        private @Nullable String dpmAgentVersion;
        private @Nullable List<String> dpmServers;
        private @Nullable DPMContainerExtendedInfoResponse extendedInfo;
        private @Nullable String friendlyName;
        private @Nullable String healthStatus;
        private @Nullable Double protectedItemCount;
        private @Nullable String protectionStatus;
        private @Nullable String registrationStatus;
        private @Nullable Boolean upgradeAvailable;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBackupServerContainerResponse defaults) {
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

        public Builder setBackupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setCanReRegister(@Nullable Boolean canReRegister) {
            this.canReRegister = canReRegister;
            return this;
        }

        public Builder setContainerId(@Nullable String containerId) {
            this.containerId = containerId;
            return this;
        }

        public Builder setContainerType(String containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }

        public Builder setDpmAgentVersion(@Nullable String dpmAgentVersion) {
            this.dpmAgentVersion = dpmAgentVersion;
            return this;
        }

        public Builder setDpmServers(@Nullable List<String> dpmServers) {
            this.dpmServers = dpmServers;
            return this;
        }

        public Builder setExtendedInfo(@Nullable DPMContainerExtendedInfoResponse extendedInfo) {
            this.extendedInfo = extendedInfo;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setHealthStatus(@Nullable String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder setProtectedItemCount(@Nullable Double protectedItemCount) {
            this.protectedItemCount = protectedItemCount;
            return this;
        }

        public Builder setProtectionStatus(@Nullable String protectionStatus) {
            this.protectionStatus = protectionStatus;
            return this;
        }

        public Builder setRegistrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }

        public Builder setUpgradeAvailable(@Nullable Boolean upgradeAvailable) {
            this.upgradeAvailable = upgradeAvailable;
            return this;
        }
        public AzureBackupServerContainerResponse build() {
            return new AzureBackupServerContainerResponse(backupManagementType, canReRegister, containerId, containerType, dpmAgentVersion, dpmServers, extendedInfo, friendlyName, healthStatus, protectedItemCount, protectionStatus, registrationStatus, upgradeAvailable);
        }
    }
}
