// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IaaS VM workload-specific container.
 * 
 */
public final class IaaSVMContainerResponse extends io.pulumi.resources.InvokeArgs {

    public static final IaaSVMContainerResponse Empty = new IaaSVMContainerResponse();

    /**
     * Type of backup management for the container.
     * 
     */
    @InputImport(name="backupManagementType")
    private final @Nullable String backupManagementType;

    public Optional<String> getBackupManagementType() {
        return this.backupManagementType == null ? Optional.empty() : Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'IaaSVMContainer'.
     * 
     */
    @InputImport(name="containerType", required=true)
    private final String containerType;

    public String getContainerType() {
        return this.containerType;
    }

    /**
     * Friendly name of the container.
     * 
     */
    @InputImport(name="friendlyName")
    private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * Status of health of the container.
     * 
     */
    @InputImport(name="healthStatus")
    private final @Nullable String healthStatus;

    public Optional<String> getHealthStatus() {
        return this.healthStatus == null ? Optional.empty() : Optional.ofNullable(this.healthStatus);
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @InputImport(name="registrationStatus")
    private final @Nullable String registrationStatus;

    public Optional<String> getRegistrationStatus() {
        return this.registrationStatus == null ? Optional.empty() : Optional.ofNullable(this.registrationStatus);
    }

    /**
     * Resource group name of Recovery Services Vault.
     * 
     */
    @InputImport(name="resourceGroup")
    private final @Nullable String resourceGroup;

    public Optional<String> getResourceGroup() {
        return this.resourceGroup == null ? Optional.empty() : Optional.ofNullable(this.resourceGroup);
    }

    /**
     * Fully qualified ARM url of the virtual machine represented by this Azure IaaS VM container.
     * 
     */
    @InputImport(name="virtualMachineId")
    private final @Nullable String virtualMachineId;

    public Optional<String> getVirtualMachineId() {
        return this.virtualMachineId == null ? Optional.empty() : Optional.ofNullable(this.virtualMachineId);
    }

    /**
     * Specifies whether the container represents a Classic or an Azure Resource Manager VM.
     * 
     */
    @InputImport(name="virtualMachineVersion")
    private final @Nullable String virtualMachineVersion;

    public Optional<String> getVirtualMachineVersion() {
        return this.virtualMachineVersion == null ? Optional.empty() : Optional.ofNullable(this.virtualMachineVersion);
    }

    public IaaSVMContainerResponse(
        @Nullable String backupManagementType,
        String containerType,
        @Nullable String friendlyName,
        @Nullable String healthStatus,
        @Nullable String registrationStatus,
        @Nullable String resourceGroup,
        @Nullable String virtualMachineId,
        @Nullable String virtualMachineVersion) {
        this.backupManagementType = backupManagementType;
        this.containerType = Objects.requireNonNull(containerType, "expected parameter 'containerType' to be non-null");
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.registrationStatus = registrationStatus;
        this.resourceGroup = resourceGroup;
        this.virtualMachineId = virtualMachineId;
        this.virtualMachineVersion = virtualMachineVersion;
    }

    private IaaSVMContainerResponse() {
        this.backupManagementType = null;
        this.containerType = null;
        this.friendlyName = null;
        this.healthStatus = null;
        this.registrationStatus = null;
        this.resourceGroup = null;
        this.virtualMachineId = null;
        this.virtualMachineVersion = null;
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

        public Builder setBackupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setContainerType(String containerType) {
            this.containerType = Objects.requireNonNull(containerType);
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

        public Builder setRegistrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setVirtualMachineId(@Nullable String virtualMachineId) {
            this.virtualMachineId = virtualMachineId;
            return this;
        }

        public Builder setVirtualMachineVersion(@Nullable String virtualMachineVersion) {
            this.virtualMachineVersion = virtualMachineVersion;
            return this;
        }

        public IaaSVMContainerResponse build() {
            return new IaaSVMContainerResponse(backupManagementType, containerType, friendlyName, healthStatus, registrationStatus, resourceGroup, virtualMachineId, virtualMachineVersion);
        }
    }
}
