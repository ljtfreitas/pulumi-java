// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.HealthErrorResponse;
import io.pulumi.azurenative.recoveryservices.inputs.MobilityServiceUpdateResponse;
import io.pulumi.azurenative.recoveryservices.inputs.VersionDetailsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the Process Server.
 * 
 */
public final class ProcessServerResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProcessServerResponse Empty = new ProcessServerResponse();

    /**
     * Agent expiry date.
     * 
     */
    @Import(name="agentExpiryDate")
      private final @Nullable String agentExpiryDate;

    public Optional<String> getAgentExpiryDate() {
        return this.agentExpiryDate == null ? Optional.empty() : Optional.ofNullable(this.agentExpiryDate);
    }

    /**
     * The version of the scout component on the server.
     * 
     */
    @Import(name="agentVersion")
      private final @Nullable String agentVersion;

    public Optional<String> getAgentVersion() {
        return this.agentVersion == null ? Optional.empty() : Optional.ofNullable(this.agentVersion);
    }

    /**
     * The agent version details.
     * 
     */
    @Import(name="agentVersionDetails")
      private final @Nullable VersionDetailsResponse agentVersionDetails;

    public Optional<VersionDetailsResponse> getAgentVersionDetails() {
        return this.agentVersionDetails == null ? Optional.empty() : Optional.ofNullable(this.agentVersionDetails);
    }

    /**
     * The available memory.
     * 
     */
    @Import(name="availableMemoryInBytes")
      private final @Nullable Double availableMemoryInBytes;

    public Optional<Double> getAvailableMemoryInBytes() {
        return this.availableMemoryInBytes == null ? Optional.empty() : Optional.ofNullable(this.availableMemoryInBytes);
    }

    /**
     * The available space.
     * 
     */
    @Import(name="availableSpaceInBytes")
      private final @Nullable Double availableSpaceInBytes;

    public Optional<Double> getAvailableSpaceInBytes() {
        return this.availableSpaceInBytes == null ? Optional.empty() : Optional.ofNullable(this.availableSpaceInBytes);
    }

    /**
     * The percentage of the CPU load.
     * 
     */
    @Import(name="cpuLoad")
      private final @Nullable String cpuLoad;

    public Optional<String> getCpuLoad() {
        return this.cpuLoad == null ? Optional.empty() : Optional.ofNullable(this.cpuLoad);
    }

    /**
     * The CPU load status.
     * 
     */
    @Import(name="cpuLoadStatus")
      private final @Nullable String cpuLoadStatus;

    public Optional<String> getCpuLoadStatus() {
        return this.cpuLoadStatus == null ? Optional.empty() : Optional.ofNullable(this.cpuLoadStatus);
    }

    /**
     * The Process Server's friendly name.
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * The health of Process Server.
     * 
     */
    @Import(name="health", required=true)
      private final String health;

    public String getHealth() {
        return this.health;
    }

    /**
     * Health errors.
     * 
     */
    @Import(name="healthErrors")
      private final @Nullable List<HealthErrorResponse> healthErrors;

    public List<HealthErrorResponse> getHealthErrors() {
        return this.healthErrors == null ? List.of() : this.healthErrors;
    }

    /**
     * The agent generated Id.
     * 
     */
    @Import(name="hostId")
      private final @Nullable String hostId;

    public Optional<String> getHostId() {
        return this.hostId == null ? Optional.empty() : Optional.ofNullable(this.hostId);
    }

    /**
     * The Process Server Id.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The IP address of the server.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable String ipAddress;

    public Optional<String> getIpAddress() {
        return this.ipAddress == null ? Optional.empty() : Optional.ofNullable(this.ipAddress);
    }

    /**
     * The last heartbeat received from the server.
     * 
     */
    @Import(name="lastHeartbeat")
      private final @Nullable String lastHeartbeat;

    public Optional<String> getLastHeartbeat() {
        return this.lastHeartbeat == null ? Optional.empty() : Optional.ofNullable(this.lastHeartbeat);
    }

    /**
     * The servers configured with this PS.
     * 
     */
    @Import(name="machineCount")
      private final @Nullable String machineCount;

    public Optional<String> getMachineCount() {
        return this.machineCount == null ? Optional.empty() : Optional.ofNullable(this.machineCount);
    }

    /**
     * The MARS communication status.
     * 
     */
    @Import(name="marsCommunicationStatus", required=true)
      private final String marsCommunicationStatus;

    public String getMarsCommunicationStatus() {
        return this.marsCommunicationStatus;
    }

    /**
     * The MARS registration status.
     * 
     */
    @Import(name="marsRegistrationStatus", required=true)
      private final String marsRegistrationStatus;

    public String getMarsRegistrationStatus() {
        return this.marsRegistrationStatus;
    }

    /**
     * The memory usage status.
     * 
     */
    @Import(name="memoryUsageStatus")
      private final @Nullable String memoryUsageStatus;

    public Optional<String> getMemoryUsageStatus() {
        return this.memoryUsageStatus == null ? Optional.empty() : Optional.ofNullable(this.memoryUsageStatus);
    }

    /**
     * The list of the mobility service updates available on the Process Server.
     * 
     */
    @Import(name="mobilityServiceUpdates")
      private final @Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates;

    public List<MobilityServiceUpdateResponse> getMobilityServiceUpdates() {
        return this.mobilityServiceUpdates == null ? List.of() : this.mobilityServiceUpdates;
    }

    /**
     * The OS type of the server.
     * 
     */
    @Import(name="osType")
      private final @Nullable String osType;

    public Optional<String> getOsType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * OS Version of the process server. Note: This will get populated if user has CS version greater than 9.12.0.0.
     * 
     */
    @Import(name="osVersion")
      private final @Nullable String osVersion;

    public Optional<String> getOsVersion() {
        return this.osVersion == null ? Optional.empty() : Optional.ofNullable(this.osVersion);
    }

    /**
     * The PS service status.
     * 
     */
    @Import(name="psServiceStatus")
      private final @Nullable String psServiceStatus;

    public Optional<String> getPsServiceStatus() {
        return this.psServiceStatus == null ? Optional.empty() : Optional.ofNullable(this.psServiceStatus);
    }

    /**
     * The process server stats refresh time.
     * 
     */
    @Import(name="psStatsRefreshTime", required=true)
      private final String psStatsRefreshTime;

    public String getPsStatsRefreshTime() {
        return this.psStatsRefreshTime;
    }

    /**
     * The number of replication pairs configured in this PS.
     * 
     */
    @Import(name="replicationPairCount")
      private final @Nullable String replicationPairCount;

    public Optional<String> getReplicationPairCount() {
        return this.replicationPairCount == null ? Optional.empty() : Optional.ofNullable(this.replicationPairCount);
    }

    /**
     * The space usage status.
     * 
     */
    @Import(name="spaceUsageStatus")
      private final @Nullable String spaceUsageStatus;

    public Optional<String> getSpaceUsageStatus() {
        return this.spaceUsageStatus == null ? Optional.empty() : Optional.ofNullable(this.spaceUsageStatus);
    }

    /**
     * The PS SSL cert expiry date.
     * 
     */
    @Import(name="sslCertExpiryDate")
      private final @Nullable String sslCertExpiryDate;

    public Optional<String> getSslCertExpiryDate() {
        return this.sslCertExpiryDate == null ? Optional.empty() : Optional.ofNullable(this.sslCertExpiryDate);
    }

    /**
     * CS SSL cert expiry date.
     * 
     */
    @Import(name="sslCertExpiryRemainingDays")
      private final @Nullable Integer sslCertExpiryRemainingDays;

    public Optional<Integer> getSslCertExpiryRemainingDays() {
        return this.sslCertExpiryRemainingDays == null ? Optional.empty() : Optional.ofNullable(this.sslCertExpiryRemainingDays);
    }

    /**
     * The percentage of the system load.
     * 
     */
    @Import(name="systemLoad")
      private final @Nullable String systemLoad;

    public Optional<String> getSystemLoad() {
        return this.systemLoad == null ? Optional.empty() : Optional.ofNullable(this.systemLoad);
    }

    /**
     * The system load status.
     * 
     */
    @Import(name="systemLoadStatus")
      private final @Nullable String systemLoadStatus;

    public Optional<String> getSystemLoadStatus() {
        return this.systemLoadStatus == null ? Optional.empty() : Optional.ofNullable(this.systemLoadStatus);
    }

    /**
     * The throughput in bytes.
     * 
     */
    @Import(name="throughputInBytes", required=true)
      private final Double throughputInBytes;

    public Double getThroughputInBytes() {
        return this.throughputInBytes;
    }

    /**
     * The throughput in MBps.
     * 
     */
    @Import(name="throughputInMBps", required=true)
      private final Double throughputInMBps;

    public Double getThroughputInMBps() {
        return this.throughputInMBps;
    }

    /**
     * The throughput status.
     * 
     */
    @Import(name="throughputStatus", required=true)
      private final String throughputStatus;

    public String getThroughputStatus() {
        return this.throughputStatus;
    }

    /**
     * The uploading pending data in bytes.
     * 
     */
    @Import(name="throughputUploadPendingDataInBytes", required=true)
      private final Double throughputUploadPendingDataInBytes;

    public Double getThroughputUploadPendingDataInBytes() {
        return this.throughputUploadPendingDataInBytes;
    }

    /**
     * The total memory.
     * 
     */
    @Import(name="totalMemoryInBytes")
      private final @Nullable Double totalMemoryInBytes;

    public Optional<Double> getTotalMemoryInBytes() {
        return this.totalMemoryInBytes == null ? Optional.empty() : Optional.ofNullable(this.totalMemoryInBytes);
    }

    /**
     * The total space.
     * 
     */
    @Import(name="totalSpaceInBytes")
      private final @Nullable Double totalSpaceInBytes;

    public Optional<Double> getTotalSpaceInBytes() {
        return this.totalSpaceInBytes == null ? Optional.empty() : Optional.ofNullable(this.totalSpaceInBytes);
    }

    /**
     * Version status
     * 
     */
    @Import(name="versionStatus")
      private final @Nullable String versionStatus;

    public Optional<String> getVersionStatus() {
        return this.versionStatus == null ? Optional.empty() : Optional.ofNullable(this.versionStatus);
    }

    public ProcessServerResponse(
        @Nullable String agentExpiryDate,
        @Nullable String agentVersion,
        @Nullable VersionDetailsResponse agentVersionDetails,
        @Nullable Double availableMemoryInBytes,
        @Nullable Double availableSpaceInBytes,
        @Nullable String cpuLoad,
        @Nullable String cpuLoadStatus,
        @Nullable String friendlyName,
        String health,
        @Nullable List<HealthErrorResponse> healthErrors,
        @Nullable String hostId,
        @Nullable String id,
        @Nullable String ipAddress,
        @Nullable String lastHeartbeat,
        @Nullable String machineCount,
        String marsCommunicationStatus,
        String marsRegistrationStatus,
        @Nullable String memoryUsageStatus,
        @Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates,
        @Nullable String osType,
        @Nullable String osVersion,
        @Nullable String psServiceStatus,
        String psStatsRefreshTime,
        @Nullable String replicationPairCount,
        @Nullable String spaceUsageStatus,
        @Nullable String sslCertExpiryDate,
        @Nullable Integer sslCertExpiryRemainingDays,
        @Nullable String systemLoad,
        @Nullable String systemLoadStatus,
        Double throughputInBytes,
        Double throughputInMBps,
        String throughputStatus,
        Double throughputUploadPendingDataInBytes,
        @Nullable Double totalMemoryInBytes,
        @Nullable Double totalSpaceInBytes,
        @Nullable String versionStatus) {
        this.agentExpiryDate = agentExpiryDate;
        this.agentVersion = agentVersion;
        this.agentVersionDetails = agentVersionDetails;
        this.availableMemoryInBytes = availableMemoryInBytes;
        this.availableSpaceInBytes = availableSpaceInBytes;
        this.cpuLoad = cpuLoad;
        this.cpuLoadStatus = cpuLoadStatus;
        this.friendlyName = friendlyName;
        this.health = Objects.requireNonNull(health, "expected parameter 'health' to be non-null");
        this.healthErrors = healthErrors;
        this.hostId = hostId;
        this.id = id;
        this.ipAddress = ipAddress;
        this.lastHeartbeat = lastHeartbeat;
        this.machineCount = machineCount;
        this.marsCommunicationStatus = Objects.requireNonNull(marsCommunicationStatus, "expected parameter 'marsCommunicationStatus' to be non-null");
        this.marsRegistrationStatus = Objects.requireNonNull(marsRegistrationStatus, "expected parameter 'marsRegistrationStatus' to be non-null");
        this.memoryUsageStatus = memoryUsageStatus;
        this.mobilityServiceUpdates = mobilityServiceUpdates;
        this.osType = osType;
        this.osVersion = osVersion;
        this.psServiceStatus = psServiceStatus;
        this.psStatsRefreshTime = Objects.requireNonNull(psStatsRefreshTime, "expected parameter 'psStatsRefreshTime' to be non-null");
        this.replicationPairCount = replicationPairCount;
        this.spaceUsageStatus = spaceUsageStatus;
        this.sslCertExpiryDate = sslCertExpiryDate;
        this.sslCertExpiryRemainingDays = sslCertExpiryRemainingDays;
        this.systemLoad = systemLoad;
        this.systemLoadStatus = systemLoadStatus;
        this.throughputInBytes = Objects.requireNonNull(throughputInBytes, "expected parameter 'throughputInBytes' to be non-null");
        this.throughputInMBps = Objects.requireNonNull(throughputInMBps, "expected parameter 'throughputInMBps' to be non-null");
        this.throughputStatus = Objects.requireNonNull(throughputStatus, "expected parameter 'throughputStatus' to be non-null");
        this.throughputUploadPendingDataInBytes = Objects.requireNonNull(throughputUploadPendingDataInBytes, "expected parameter 'throughputUploadPendingDataInBytes' to be non-null");
        this.totalMemoryInBytes = totalMemoryInBytes;
        this.totalSpaceInBytes = totalSpaceInBytes;
        this.versionStatus = versionStatus;
    }

    private ProcessServerResponse() {
        this.agentExpiryDate = null;
        this.agentVersion = null;
        this.agentVersionDetails = null;
        this.availableMemoryInBytes = null;
        this.availableSpaceInBytes = null;
        this.cpuLoad = null;
        this.cpuLoadStatus = null;
        this.friendlyName = null;
        this.health = null;
        this.healthErrors = List.of();
        this.hostId = null;
        this.id = null;
        this.ipAddress = null;
        this.lastHeartbeat = null;
        this.machineCount = null;
        this.marsCommunicationStatus = null;
        this.marsRegistrationStatus = null;
        this.memoryUsageStatus = null;
        this.mobilityServiceUpdates = List.of();
        this.osType = null;
        this.osVersion = null;
        this.psServiceStatus = null;
        this.psStatsRefreshTime = null;
        this.replicationPairCount = null;
        this.spaceUsageStatus = null;
        this.sslCertExpiryDate = null;
        this.sslCertExpiryRemainingDays = null;
        this.systemLoad = null;
        this.systemLoadStatus = null;
        this.throughputInBytes = null;
        this.throughputInMBps = null;
        this.throughputStatus = null;
        this.throughputUploadPendingDataInBytes = null;
        this.totalMemoryInBytes = null;
        this.totalSpaceInBytes = null;
        this.versionStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProcessServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentExpiryDate;
        private @Nullable String agentVersion;
        private @Nullable VersionDetailsResponse agentVersionDetails;
        private @Nullable Double availableMemoryInBytes;
        private @Nullable Double availableSpaceInBytes;
        private @Nullable String cpuLoad;
        private @Nullable String cpuLoadStatus;
        private @Nullable String friendlyName;
        private String health;
        private @Nullable List<HealthErrorResponse> healthErrors;
        private @Nullable String hostId;
        private @Nullable String id;
        private @Nullable String ipAddress;
        private @Nullable String lastHeartbeat;
        private @Nullable String machineCount;
        private String marsCommunicationStatus;
        private String marsRegistrationStatus;
        private @Nullable String memoryUsageStatus;
        private @Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates;
        private @Nullable String osType;
        private @Nullable String osVersion;
        private @Nullable String psServiceStatus;
        private String psStatsRefreshTime;
        private @Nullable String replicationPairCount;
        private @Nullable String spaceUsageStatus;
        private @Nullable String sslCertExpiryDate;
        private @Nullable Integer sslCertExpiryRemainingDays;
        private @Nullable String systemLoad;
        private @Nullable String systemLoadStatus;
        private Double throughputInBytes;
        private Double throughputInMBps;
        private String throughputStatus;
        private Double throughputUploadPendingDataInBytes;
        private @Nullable Double totalMemoryInBytes;
        private @Nullable Double totalSpaceInBytes;
        private @Nullable String versionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(ProcessServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentExpiryDate = defaults.agentExpiryDate;
    	      this.agentVersion = defaults.agentVersion;
    	      this.agentVersionDetails = defaults.agentVersionDetails;
    	      this.availableMemoryInBytes = defaults.availableMemoryInBytes;
    	      this.availableSpaceInBytes = defaults.availableSpaceInBytes;
    	      this.cpuLoad = defaults.cpuLoad;
    	      this.cpuLoadStatus = defaults.cpuLoadStatus;
    	      this.friendlyName = defaults.friendlyName;
    	      this.health = defaults.health;
    	      this.healthErrors = defaults.healthErrors;
    	      this.hostId = defaults.hostId;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.lastHeartbeat = defaults.lastHeartbeat;
    	      this.machineCount = defaults.machineCount;
    	      this.marsCommunicationStatus = defaults.marsCommunicationStatus;
    	      this.marsRegistrationStatus = defaults.marsRegistrationStatus;
    	      this.memoryUsageStatus = defaults.memoryUsageStatus;
    	      this.mobilityServiceUpdates = defaults.mobilityServiceUpdates;
    	      this.osType = defaults.osType;
    	      this.osVersion = defaults.osVersion;
    	      this.psServiceStatus = defaults.psServiceStatus;
    	      this.psStatsRefreshTime = defaults.psStatsRefreshTime;
    	      this.replicationPairCount = defaults.replicationPairCount;
    	      this.spaceUsageStatus = defaults.spaceUsageStatus;
    	      this.sslCertExpiryDate = defaults.sslCertExpiryDate;
    	      this.sslCertExpiryRemainingDays = defaults.sslCertExpiryRemainingDays;
    	      this.systemLoad = defaults.systemLoad;
    	      this.systemLoadStatus = defaults.systemLoadStatus;
    	      this.throughputInBytes = defaults.throughputInBytes;
    	      this.throughputInMBps = defaults.throughputInMBps;
    	      this.throughputStatus = defaults.throughputStatus;
    	      this.throughputUploadPendingDataInBytes = defaults.throughputUploadPendingDataInBytes;
    	      this.totalMemoryInBytes = defaults.totalMemoryInBytes;
    	      this.totalSpaceInBytes = defaults.totalSpaceInBytes;
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

        public Builder availableMemoryInBytes(@Nullable Double availableMemoryInBytes) {
            this.availableMemoryInBytes = availableMemoryInBytes;
            return this;
        }

        public Builder availableSpaceInBytes(@Nullable Double availableSpaceInBytes) {
            this.availableSpaceInBytes = availableSpaceInBytes;
            return this;
        }

        public Builder cpuLoad(@Nullable String cpuLoad) {
            this.cpuLoad = cpuLoad;
            return this;
        }

        public Builder cpuLoadStatus(@Nullable String cpuLoadStatus) {
            this.cpuLoadStatus = cpuLoadStatus;
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder health(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }

        public Builder healthErrors(@Nullable List<HealthErrorResponse> healthErrors) {
            this.healthErrors = healthErrors;
            return this;
        }

        public Builder hostId(@Nullable String hostId) {
            this.hostId = hostId;
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

        public Builder machineCount(@Nullable String machineCount) {
            this.machineCount = machineCount;
            return this;
        }

        public Builder marsCommunicationStatus(String marsCommunicationStatus) {
            this.marsCommunicationStatus = Objects.requireNonNull(marsCommunicationStatus);
            return this;
        }

        public Builder marsRegistrationStatus(String marsRegistrationStatus) {
            this.marsRegistrationStatus = Objects.requireNonNull(marsRegistrationStatus);
            return this;
        }

        public Builder memoryUsageStatus(@Nullable String memoryUsageStatus) {
            this.memoryUsageStatus = memoryUsageStatus;
            return this;
        }

        public Builder mobilityServiceUpdates(@Nullable List<MobilityServiceUpdateResponse> mobilityServiceUpdates) {
            this.mobilityServiceUpdates = mobilityServiceUpdates;
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

        public Builder psServiceStatus(@Nullable String psServiceStatus) {
            this.psServiceStatus = psServiceStatus;
            return this;
        }

        public Builder psStatsRefreshTime(String psStatsRefreshTime) {
            this.psStatsRefreshTime = Objects.requireNonNull(psStatsRefreshTime);
            return this;
        }

        public Builder replicationPairCount(@Nullable String replicationPairCount) {
            this.replicationPairCount = replicationPairCount;
            return this;
        }

        public Builder spaceUsageStatus(@Nullable String spaceUsageStatus) {
            this.spaceUsageStatus = spaceUsageStatus;
            return this;
        }

        public Builder sslCertExpiryDate(@Nullable String sslCertExpiryDate) {
            this.sslCertExpiryDate = sslCertExpiryDate;
            return this;
        }

        public Builder sslCertExpiryRemainingDays(@Nullable Integer sslCertExpiryRemainingDays) {
            this.sslCertExpiryRemainingDays = sslCertExpiryRemainingDays;
            return this;
        }

        public Builder systemLoad(@Nullable String systemLoad) {
            this.systemLoad = systemLoad;
            return this;
        }

        public Builder systemLoadStatus(@Nullable String systemLoadStatus) {
            this.systemLoadStatus = systemLoadStatus;
            return this;
        }

        public Builder throughputInBytes(Double throughputInBytes) {
            this.throughputInBytes = Objects.requireNonNull(throughputInBytes);
            return this;
        }

        public Builder throughputInMBps(Double throughputInMBps) {
            this.throughputInMBps = Objects.requireNonNull(throughputInMBps);
            return this;
        }

        public Builder throughputStatus(String throughputStatus) {
            this.throughputStatus = Objects.requireNonNull(throughputStatus);
            return this;
        }

        public Builder throughputUploadPendingDataInBytes(Double throughputUploadPendingDataInBytes) {
            this.throughputUploadPendingDataInBytes = Objects.requireNonNull(throughputUploadPendingDataInBytes);
            return this;
        }

        public Builder totalMemoryInBytes(@Nullable Double totalMemoryInBytes) {
            this.totalMemoryInBytes = totalMemoryInBytes;
            return this;
        }

        public Builder totalSpaceInBytes(@Nullable Double totalSpaceInBytes) {
            this.totalSpaceInBytes = totalSpaceInBytes;
            return this;
        }

        public Builder versionStatus(@Nullable String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }
        public ProcessServerResponse build() {
            return new ProcessServerResponse(agentExpiryDate, agentVersion, agentVersionDetails, availableMemoryInBytes, availableSpaceInBytes, cpuLoad, cpuLoadStatus, friendlyName, health, healthErrors, hostId, id, ipAddress, lastHeartbeat, machineCount, marsCommunicationStatus, marsRegistrationStatus, memoryUsageStatus, mobilityServiceUpdates, osType, osVersion, psServiceStatus, psStatsRefreshTime, replicationPairCount, spaceUsageStatus, sslCertExpiryDate, sslCertExpiryRemainingDays, systemLoad, systemLoadStatus, throughputInBytes, throughputInMBps, throughputStatus, throughputUploadPendingDataInBytes, totalMemoryInBytes, totalSpaceInBytes, versionStatus);
        }
    }
}
