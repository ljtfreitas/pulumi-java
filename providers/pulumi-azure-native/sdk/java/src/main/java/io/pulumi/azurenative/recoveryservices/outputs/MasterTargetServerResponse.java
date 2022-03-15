// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.DataStoreResponse;
import io.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import io.pulumi.azurenative.recoveryservices.outputs.RetentionVolumeResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VersionDetailsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MasterTargetServerResponse {
    /**
     * Agent expiry date.
     * 
     */
    private final @Nullable String agentExpiryDate;
    /**
     * The version of the scout component on the server.
     * 
     */
    private final @Nullable String agentVersion;
    /**
     * Agent version details.
     * 
     */
    private final @Nullable VersionDetailsResponse agentVersionDetails;
    /**
     * The list of data stores in the fabric.
     * 
     */
    private final @Nullable List<DataStoreResponse> dataStores;
    /**
     * Disk count of the master target.
     * 
     */
    private final @Nullable Integer diskCount;
    /**
     * Health errors.
     * 
     */
    private final @Nullable List<HealthErrorResponse> healthErrors;
    /**
     * The server Id.
     * 
     */
    private final @Nullable String id;
    /**
     * The IP address of the server.
     * 
     */
    private final @Nullable String ipAddress;
    /**
     * The last heartbeat received from the server.
     * 
     */
    private final @Nullable String lastHeartbeat;
    /**
     * MARS agent expiry date.
     * 
     */
    private final @Nullable String marsAgentExpiryDate;
    /**
     * MARS agent version.
     * 
     */
    private final @Nullable String marsAgentVersion;
    /**
     * Mars agent version details.
     * 
     */
    private final @Nullable VersionDetailsResponse marsAgentVersionDetails;
    /**
     * The server name.
     * 
     */
    private final @Nullable String name;
    /**
     * The OS type of the server.
     * 
     */
    private final @Nullable String osType;
    /**
     * OS Version of the master target.
     * 
     */
    private final @Nullable String osVersion;
    /**
     * The retention volumes of Master target Server.
     * 
     */
    private final @Nullable List<RetentionVolumeResponse> retentionVolumes;
    /**
     * Validation errors.
     * 
     */
    private final @Nullable List<HealthErrorResponse> validationErrors;
    /**
     * Version status
     * 
     */
    private final @Nullable String versionStatus;

    @CustomType.Constructor
    private MasterTargetServerResponse(
        @CustomType.Parameter("agentExpiryDate") @Nullable String agentExpiryDate,
        @CustomType.Parameter("agentVersion") @Nullable String agentVersion,
        @CustomType.Parameter("agentVersionDetails") @Nullable VersionDetailsResponse agentVersionDetails,
        @CustomType.Parameter("dataStores") @Nullable List<DataStoreResponse> dataStores,
        @CustomType.Parameter("diskCount") @Nullable Integer diskCount,
        @CustomType.Parameter("healthErrors") @Nullable List<HealthErrorResponse> healthErrors,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ipAddress") @Nullable String ipAddress,
        @CustomType.Parameter("lastHeartbeat") @Nullable String lastHeartbeat,
        @CustomType.Parameter("marsAgentExpiryDate") @Nullable String marsAgentExpiryDate,
        @CustomType.Parameter("marsAgentVersion") @Nullable String marsAgentVersion,
        @CustomType.Parameter("marsAgentVersionDetails") @Nullable VersionDetailsResponse marsAgentVersionDetails,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("osType") @Nullable String osType,
        @CustomType.Parameter("osVersion") @Nullable String osVersion,
        @CustomType.Parameter("retentionVolumes") @Nullable List<RetentionVolumeResponse> retentionVolumes,
        @CustomType.Parameter("validationErrors") @Nullable List<HealthErrorResponse> validationErrors,
        @CustomType.Parameter("versionStatus") @Nullable String versionStatus) {
        this.agentExpiryDate = agentExpiryDate;
        this.agentVersion = agentVersion;
        this.agentVersionDetails = agentVersionDetails;
        this.dataStores = dataStores;
        this.diskCount = diskCount;
        this.healthErrors = healthErrors;
        this.id = id;
        this.ipAddress = ipAddress;
        this.lastHeartbeat = lastHeartbeat;
        this.marsAgentExpiryDate = marsAgentExpiryDate;
        this.marsAgentVersion = marsAgentVersion;
        this.marsAgentVersionDetails = marsAgentVersionDetails;
        this.name = name;
        this.osType = osType;
        this.osVersion = osVersion;
        this.retentionVolumes = retentionVolumes;
        this.validationErrors = validationErrors;
        this.versionStatus = versionStatus;
    }

    /**
     * Agent expiry date.
     * 
    */
    public Optional<String> getAgentExpiryDate() {
        return Optional.ofNullable(this.agentExpiryDate);
    }
    /**
     * The version of the scout component on the server.
     * 
    */
    public Optional<String> getAgentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }
    /**
     * Agent version details.
     * 
    */
    public Optional<VersionDetailsResponse> getAgentVersionDetails() {
        return Optional.ofNullable(this.agentVersionDetails);
    }
    /**
     * The list of data stores in the fabric.
     * 
    */
    public List<DataStoreResponse> getDataStores() {
        return this.dataStores == null ? List.of() : this.dataStores;
    }
    /**
     * Disk count of the master target.
     * 
    */
    public Optional<Integer> getDiskCount() {
        return Optional.ofNullable(this.diskCount);
    }
    /**
     * Health errors.
     * 
    */
    public List<HealthErrorResponse> getHealthErrors() {
        return this.healthErrors == null ? List.of() : this.healthErrors;
    }
    /**
     * The server Id.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The IP address of the server.
     * 
    */
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }
    /**
     * The last heartbeat received from the server.
     * 
    */
    public Optional<String> getLastHeartbeat() {
        return Optional.ofNullable(this.lastHeartbeat);
    }
    /**
     * MARS agent expiry date.
     * 
    */
    public Optional<String> getMarsAgentExpiryDate() {
        return Optional.ofNullable(this.marsAgentExpiryDate);
    }
    /**
     * MARS agent version.
     * 
    */
    public Optional<String> getMarsAgentVersion() {
        return Optional.ofNullable(this.marsAgentVersion);
    }
    /**
     * Mars agent version details.
     * 
    */
    public Optional<VersionDetailsResponse> getMarsAgentVersionDetails() {
        return Optional.ofNullable(this.marsAgentVersionDetails);
    }
    /**
     * The server name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The OS type of the server.
     * 
    */
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    /**
     * OS Version of the master target.
     * 
    */
    public Optional<String> getOsVersion() {
        return Optional.ofNullable(this.osVersion);
    }
    /**
     * The retention volumes of Master target Server.
     * 
    */
    public List<RetentionVolumeResponse> getRetentionVolumes() {
        return this.retentionVolumes == null ? List.of() : this.retentionVolumes;
    }
    /**
     * Validation errors.
     * 
    */
    public List<HealthErrorResponse> getValidationErrors() {
        return this.validationErrors == null ? List.of() : this.validationErrors;
    }
    /**
     * Version status
     * 
    */
    public Optional<String> getVersionStatus() {
        return Optional.ofNullable(this.versionStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MasterTargetServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentExpiryDate;
        private @Nullable String agentVersion;
        private @Nullable VersionDetailsResponse agentVersionDetails;
        private @Nullable List<DataStoreResponse> dataStores;
        private @Nullable Integer diskCount;
        private @Nullable List<HealthErrorResponse> healthErrors;
        private @Nullable String id;
        private @Nullable String ipAddress;
        private @Nullable String lastHeartbeat;
        private @Nullable String marsAgentExpiryDate;
        private @Nullable String marsAgentVersion;
        private @Nullable VersionDetailsResponse marsAgentVersionDetails;
        private @Nullable String name;
        private @Nullable String osType;
        private @Nullable String osVersion;
        private @Nullable List<RetentionVolumeResponse> retentionVolumes;
        private @Nullable List<HealthErrorResponse> validationErrors;
        private @Nullable String versionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(MasterTargetServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentExpiryDate = defaults.agentExpiryDate;
    	      this.agentVersion = defaults.agentVersion;
    	      this.agentVersionDetails = defaults.agentVersionDetails;
    	      this.dataStores = defaults.dataStores;
    	      this.diskCount = defaults.diskCount;
    	      this.healthErrors = defaults.healthErrors;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.lastHeartbeat = defaults.lastHeartbeat;
    	      this.marsAgentExpiryDate = defaults.marsAgentExpiryDate;
    	      this.marsAgentVersion = defaults.marsAgentVersion;
    	      this.marsAgentVersionDetails = defaults.marsAgentVersionDetails;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.osVersion = defaults.osVersion;
    	      this.retentionVolumes = defaults.retentionVolumes;
    	      this.validationErrors = defaults.validationErrors;
    	      this.versionStatus = defaults.versionStatus;
        }

        public Builder agentExpiryDate(@Nullable String agentExpiryDate) {
            this.agentExpiryDate = agentExpiryDate;
            return this;
        }

        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        public Builder agentVersionDetails(@Nullable VersionDetailsResponse agentVersionDetails) {
            this.agentVersionDetails = agentVersionDetails;
            return this;
        }

        public Builder dataStores(@Nullable List<DataStoreResponse> dataStores) {
            this.dataStores = dataStores;
            return this;
        }

        public Builder diskCount(@Nullable Integer diskCount) {
            this.diskCount = diskCount;
            return this;
        }

        public Builder healthErrors(@Nullable List<HealthErrorResponse> healthErrors) {
            this.healthErrors = healthErrors;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder lastHeartbeat(@Nullable String lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }

        public Builder marsAgentExpiryDate(@Nullable String marsAgentExpiryDate) {
            this.marsAgentExpiryDate = marsAgentExpiryDate;
            return this;
        }

        public Builder marsAgentVersion(@Nullable String marsAgentVersion) {
            this.marsAgentVersion = marsAgentVersion;
            return this;
        }

        public Builder marsAgentVersionDetails(@Nullable VersionDetailsResponse marsAgentVersionDetails) {
            this.marsAgentVersionDetails = marsAgentVersionDetails;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder osVersion(@Nullable String osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        public Builder retentionVolumes(@Nullable List<RetentionVolumeResponse> retentionVolumes) {
            this.retentionVolumes = retentionVolumes;
            return this;
        }

        public Builder validationErrors(@Nullable List<HealthErrorResponse> validationErrors) {
            this.validationErrors = validationErrors;
            return this;
        }

        public Builder versionStatus(@Nullable String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public MasterTargetServerResponse build() {
            return new MasterTargetServerResponse(agentExpiryDate, agentVersion, agentVersionDetails, dataStores, diskCount, healthErrors, id, ipAddress, lastHeartbeat, marsAgentExpiryDate, marsAgentVersion, marsAgentVersionDetails, name, osType, osVersion, retentionVolumes, validationErrors, versionStatus);
        }
    }
}
