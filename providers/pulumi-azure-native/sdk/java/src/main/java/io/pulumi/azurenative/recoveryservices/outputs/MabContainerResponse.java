// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.MABContainerHealthDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.MabContainerExtendedInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MabContainerResponse {
    /**
     * Agent version of this container.
     * 
     */
    private final @Nullable String agentVersion;
    /**
     * Type of backup management for the container.
     * 
     */
    private final @Nullable String backupManagementType;
    /**
     * Can the container be registered one more time.
     * 
     */
    private final @Nullable Boolean canReRegister;
    /**
     * Health state of mab container.
     * 
     */
    private final @Nullable String containerHealthState;
    /**
     * ContainerID represents the container.
     * 
     */
    private final @Nullable Double containerId;
    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'Windows'.
     * 
     */
    private final String containerType;
    /**
     * Additional information for this container
     * 
     */
    private final @Nullable MabContainerExtendedInfoResponse extendedInfo;
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
     * Health details on this mab container.
     * 
     */
    private final @Nullable List<MABContainerHealthDetailsResponse> mabContainerHealthDetails;
    /**
     * Number of items backed up in this container.
     * 
     */
    private final @Nullable Double protectedItemCount;
    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    private final @Nullable String registrationStatus;

    @CustomType.Constructor
    private MabContainerResponse(
        @CustomType.Parameter("agentVersion") @Nullable String agentVersion,
        @CustomType.Parameter("backupManagementType") @Nullable String backupManagementType,
        @CustomType.Parameter("canReRegister") @Nullable Boolean canReRegister,
        @CustomType.Parameter("containerHealthState") @Nullable String containerHealthState,
        @CustomType.Parameter("containerId") @Nullable Double containerId,
        @CustomType.Parameter("containerType") String containerType,
        @CustomType.Parameter("extendedInfo") @Nullable MabContainerExtendedInfoResponse extendedInfo,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("healthStatus") @Nullable String healthStatus,
        @CustomType.Parameter("mabContainerHealthDetails") @Nullable List<MABContainerHealthDetailsResponse> mabContainerHealthDetails,
        @CustomType.Parameter("protectedItemCount") @Nullable Double protectedItemCount,
        @CustomType.Parameter("registrationStatus") @Nullable String registrationStatus) {
        this.agentVersion = agentVersion;
        this.backupManagementType = backupManagementType;
        this.canReRegister = canReRegister;
        this.containerHealthState = containerHealthState;
        this.containerId = containerId;
        this.containerType = containerType;
        this.extendedInfo = extendedInfo;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.mabContainerHealthDetails = mabContainerHealthDetails;
        this.protectedItemCount = protectedItemCount;
        this.registrationStatus = registrationStatus;
    }

    /**
     * Agent version of this container.
     * 
    */
    public Optional<String> getAgentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }
    /**
     * Type of backup management for the container.
     * 
    */
    public Optional<String> getBackupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    /**
     * Can the container be registered one more time.
     * 
    */
    public Optional<Boolean> getCanReRegister() {
        return Optional.ofNullable(this.canReRegister);
    }
    /**
     * Health state of mab container.
     * 
    */
    public Optional<String> getContainerHealthState() {
        return Optional.ofNullable(this.containerHealthState);
    }
    /**
     * ContainerID represents the container.
     * 
    */
    public Optional<Double> getContainerId() {
        return Optional.ofNullable(this.containerId);
    }
    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'Windows'.
     * 
    */
    public String getContainerType() {
        return this.containerType;
    }
    /**
     * Additional information for this container
     * 
    */
    public Optional<MabContainerExtendedInfoResponse> getExtendedInfo() {
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
     * Health details on this mab container.
     * 
    */
    public List<MABContainerHealthDetailsResponse> getMabContainerHealthDetails() {
        return this.mabContainerHealthDetails == null ? List.of() : this.mabContainerHealthDetails;
    }
    /**
     * Number of items backed up in this container.
     * 
    */
    public Optional<Double> getProtectedItemCount() {
        return Optional.ofNullable(this.protectedItemCount);
    }
    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
    */
    public Optional<String> getRegistrationStatus() {
        return Optional.ofNullable(this.registrationStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MabContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentVersion;
        private @Nullable String backupManagementType;
        private @Nullable Boolean canReRegister;
        private @Nullable String containerHealthState;
        private @Nullable Double containerId;
        private String containerType;
        private @Nullable MabContainerExtendedInfoResponse extendedInfo;
        private @Nullable String friendlyName;
        private @Nullable String healthStatus;
        private @Nullable List<MABContainerHealthDetailsResponse> mabContainerHealthDetails;
        private @Nullable Double protectedItemCount;
        private @Nullable String registrationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(MabContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.canReRegister = defaults.canReRegister;
    	      this.containerHealthState = defaults.containerHealthState;
    	      this.containerId = defaults.containerId;
    	      this.containerType = defaults.containerType;
    	      this.extendedInfo = defaults.extendedInfo;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.mabContainerHealthDetails = defaults.mabContainerHealthDetails;
    	      this.protectedItemCount = defaults.protectedItemCount;
    	      this.registrationStatus = defaults.registrationStatus;
        }

        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        public Builder backupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder canReRegister(@Nullable Boolean canReRegister) {
            this.canReRegister = canReRegister;
            return this;
        }

        public Builder containerHealthState(@Nullable String containerHealthState) {
            this.containerHealthState = containerHealthState;
            return this;
        }

        public Builder containerId(@Nullable Double containerId) {
            this.containerId = containerId;
            return this;
        }

        public Builder containerType(String containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }

        public Builder extendedInfo(@Nullable MabContainerExtendedInfoResponse extendedInfo) {
            this.extendedInfo = extendedInfo;
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

        public Builder mabContainerHealthDetails(@Nullable List<MABContainerHealthDetailsResponse> mabContainerHealthDetails) {
            this.mabContainerHealthDetails = mabContainerHealthDetails;
            return this;
        }

        public Builder protectedItemCount(@Nullable Double protectedItemCount) {
            this.protectedItemCount = protectedItemCount;
            return this;
        }

        public Builder registrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }
        public MabContainerResponse build() {
            return new MabContainerResponse(agentVersion, backupManagementType, canReRegister, containerHealthState, containerId, containerType, extendedInfo, friendlyName, healthStatus, mabContainerHealthDetails, protectedItemCount, registrationStatus);
        }
    }
}
