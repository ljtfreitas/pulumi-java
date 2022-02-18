// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.BackupManagementType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IaaS VM workload-specific backup item representing an Azure Resource Manager virtual machine.
 * 
 */
public final class AzureIaaSComputeVMContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureIaaSComputeVMContainerArgs Empty = new AzureIaaSComputeVMContainerArgs();

    /**
     * Type of backup management for the container.
     * 
     */
    @InputImport(name="backupManagementType")
    private final @Nullable Input<Either<String,BackupManagementType>> backupManagementType;

    public Input<Either<String,BackupManagementType>> getBackupManagementType() {
        return this.backupManagementType == null ? Input.empty() : this.backupManagementType;
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'Microsoft.Compute/virtualMachines'.
     * 
     */
    @InputImport(name="containerType", required=true)
    private final Input<String> containerType;

    public Input<String> getContainerType() {
        return this.containerType;
    }

    /**
     * Friendly name of the container.
     * 
     */
    @InputImport(name="friendlyName")
    private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * Status of health of the container.
     * 
     */
    @InputImport(name="healthStatus")
    private final @Nullable Input<String> healthStatus;

    public Input<String> getHealthStatus() {
        return this.healthStatus == null ? Input.empty() : this.healthStatus;
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @InputImport(name="registrationStatus")
    private final @Nullable Input<String> registrationStatus;

    public Input<String> getRegistrationStatus() {
        return this.registrationStatus == null ? Input.empty() : this.registrationStatus;
    }

    /**
     * Resource group name of Recovery Services Vault.
     * 
     */
    @InputImport(name="resourceGroup")
    private final @Nullable Input<String> resourceGroup;

    public Input<String> getResourceGroup() {
        return this.resourceGroup == null ? Input.empty() : this.resourceGroup;
    }

    /**
     * Fully qualified ARM url of the virtual machine represented by this Azure IaaS VM container.
     * 
     */
    @InputImport(name="virtualMachineId")
    private final @Nullable Input<String> virtualMachineId;

    public Input<String> getVirtualMachineId() {
        return this.virtualMachineId == null ? Input.empty() : this.virtualMachineId;
    }

    /**
     * Specifies whether the container represents a Classic or an Azure Resource Manager VM.
     * 
     */
    @InputImport(name="virtualMachineVersion")
    private final @Nullable Input<String> virtualMachineVersion;

    public Input<String> getVirtualMachineVersion() {
        return this.virtualMachineVersion == null ? Input.empty() : this.virtualMachineVersion;
    }

    public AzureIaaSComputeVMContainerArgs(
        @Nullable Input<Either<String,BackupManagementType>> backupManagementType,
        Input<String> containerType,
        @Nullable Input<String> friendlyName,
        @Nullable Input<String> healthStatus,
        @Nullable Input<String> registrationStatus,
        @Nullable Input<String> resourceGroup,
        @Nullable Input<String> virtualMachineId,
        @Nullable Input<String> virtualMachineVersion) {
        this.backupManagementType = backupManagementType;
        this.containerType = Objects.requireNonNull(containerType, "expected parameter 'containerType' to be non-null");
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.registrationStatus = registrationStatus;
        this.resourceGroup = resourceGroup;
        this.virtualMachineId = virtualMachineId;
        this.virtualMachineVersion = virtualMachineVersion;
    }

    private AzureIaaSComputeVMContainerArgs() {
        this.backupManagementType = Input.empty();
        this.containerType = Input.empty();
        this.friendlyName = Input.empty();
        this.healthStatus = Input.empty();
        this.registrationStatus = Input.empty();
        this.resourceGroup = Input.empty();
        this.virtualMachineId = Input.empty();
        this.virtualMachineVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureIaaSComputeVMContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,BackupManagementType>> backupManagementType;
        private Input<String> containerType;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<String> healthStatus;
        private @Nullable Input<String> registrationStatus;
        private @Nullable Input<String> resourceGroup;
        private @Nullable Input<String> virtualMachineId;
        private @Nullable Input<String> virtualMachineVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureIaaSComputeVMContainerArgs defaults) {
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

        public Builder setBackupManagementType(@Nullable Input<Either<String,BackupManagementType>> backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setBackupManagementType(@Nullable Either<String,BackupManagementType> backupManagementType) {
            this.backupManagementType = Input.ofNullable(backupManagementType);
            return this;
        }

        public Builder setContainerType(Input<String> containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }

        public Builder setContainerType(String containerType) {
            this.containerType = Input.of(Objects.requireNonNull(containerType));
            return this;
        }

        public Builder setFriendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder setHealthStatus(@Nullable Input<String> healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder setHealthStatus(@Nullable String healthStatus) {
            this.healthStatus = Input.ofNullable(healthStatus);
            return this;
        }

        public Builder setRegistrationStatus(@Nullable Input<String> registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }

        public Builder setRegistrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = Input.ofNullable(registrationStatus);
            return this;
        }

        public Builder setResourceGroup(@Nullable Input<String> resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder setResourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = Input.ofNullable(resourceGroup);
            return this;
        }

        public Builder setVirtualMachineId(@Nullable Input<String> virtualMachineId) {
            this.virtualMachineId = virtualMachineId;
            return this;
        }

        public Builder setVirtualMachineId(@Nullable String virtualMachineId) {
            this.virtualMachineId = Input.ofNullable(virtualMachineId);
            return this;
        }

        public Builder setVirtualMachineVersion(@Nullable Input<String> virtualMachineVersion) {
            this.virtualMachineVersion = virtualMachineVersion;
            return this;
        }

        public Builder setVirtualMachineVersion(@Nullable String virtualMachineVersion) {
            this.virtualMachineVersion = Input.ofNullable(virtualMachineVersion);
            return this;
        }

        public AzureIaaSComputeVMContainerArgs build() {
            return new AzureIaaSComputeVMContainerArgs(backupManagementType, containerType, friendlyName, healthStatus, registrationStatus, resourceGroup, virtualMachineId, virtualMachineVersion);
        }
    }
}
