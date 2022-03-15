// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IaaSVMContainerResponse {
    /**
     * Type of backup management for the container.
     * 
     */
    private final @Nullable String backupManagementType;
    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'IaaSVMContainer'.
     * 
     */
    private final String containerType;
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
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    private final @Nullable String registrationStatus;
    /**
     * Resource group name of Recovery Services Vault.
     * 
     */
    private final @Nullable String resourceGroup;
    /**
     * Fully qualified ARM url of the virtual machine represented by this Azure IaaS VM container.
     * 
     */
    private final @Nullable String virtualMachineId;
    /**
     * Specifies whether the container represents a Classic or an Azure Resource Manager VM.
     * 
     */
    private final @Nullable String virtualMachineVersion;

    @CustomType.Constructor
    private IaaSVMContainerResponse(
        @CustomType.Parameter("backupManagementType") @Nullable String backupManagementType,
        @CustomType.Parameter("containerType") String containerType,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("healthStatus") @Nullable String healthStatus,
        @CustomType.Parameter("registrationStatus") @Nullable String registrationStatus,
        @CustomType.Parameter("resourceGroup") @Nullable String resourceGroup,
        @CustomType.Parameter("virtualMachineId") @Nullable String virtualMachineId,
        @CustomType.Parameter("virtualMachineVersion") @Nullable String virtualMachineVersion) {
        this.backupManagementType = backupManagementType;
        this.containerType = containerType;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.registrationStatus = registrationStatus;
        this.resourceGroup = resourceGroup;
        this.virtualMachineId = virtualMachineId;
        this.virtualMachineVersion = virtualMachineVersion;
    }

    /**
     * Type of backup management for the container.
     * 
    */
    public Optional<String> getBackupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'IaaSVMContainer'.
     * 
    */
    public String getContainerType() {
        return this.containerType;
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
     * Status of registration of the container with the Recovery Services Vault.
     * 
    */
    public Optional<String> getRegistrationStatus() {
        return Optional.ofNullable(this.registrationStatus);
    }
    /**
     * Resource group name of Recovery Services Vault.
     * 
    */
    public Optional<String> getResourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }
    /**
     * Fully qualified ARM url of the virtual machine represented by this Azure IaaS VM container.
     * 
    */
    public Optional<String> getVirtualMachineId() {
        return Optional.ofNullable(this.virtualMachineId);
    }
    /**
     * Specifies whether the container represents a Classic or an Azure Resource Manager VM.
     * 
    */
    public Optional<String> getVirtualMachineVersion() {
        return Optional.ofNullable(this.virtualMachineVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IaaSVMContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private String containerType;
        private @Nullable String friendlyName;
        private @Nullable String healthStatus;
        private @Nullable String registrationStatus;
        private @Nullable String resourceGroup;
        private @Nullable String virtualMachineId;
        private @Nullable String virtualMachineVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(IaaSVMContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.containerType = defaults.containerType;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.registrationStatus = defaults.registrationStatus;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.virtualMachineId = defaults.virtualMachineId;
    	      this.virtualMachineVersion = defaults.virtualMachineVersion;
        }

        public Builder backupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder containerType(String containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder healthStatus(@Nullable String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder registrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }

        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder virtualMachineId(@Nullable String virtualMachineId) {
            this.virtualMachineId = virtualMachineId;
            return this;
        }

        public Builder virtualMachineVersion(@Nullable String virtualMachineVersion) {
            this.virtualMachineVersion = virtualMachineVersion;
            return this;
        }
        public IaaSVMContainerResponse build() {
            return new IaaSVMContainerResponse(backupManagementType, containerType, friendlyName, healthStatus, registrationStatus, resourceGroup, virtualMachineId, virtualMachineVersion);
        }
    }
}
