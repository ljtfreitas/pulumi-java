// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.MasterTargetServerResponse;
import io.pulumi.azurenative.recoveryservices.inputs.ProcessServerResponse;
import io.pulumi.azurenative.recoveryservices.inputs.RunAsAccountResponse;
import io.pulumi.azurenative.recoveryservices.inputs.VersionDetailsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Store the fabric details specific to the VMware fabric.
 * 
 */
public final class VMwareDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VMwareDetailsResponse Empty = new VMwareDetailsResponse();

    /**
     * The number of source and target servers configured to talk to this CS.
     * 
     */
    @InputImport(name="agentCount")
    private final @Nullable String agentCount;

    public Optional<String> getAgentCount() {
        return this.agentCount == null ? Optional.empty() : Optional.ofNullable(this.agentCount);
    }

    /**
     * Agent expiry date.
     * 
     */
    @InputImport(name="agentExpiryDate")
    private final @Nullable String agentExpiryDate;

    public Optional<String> getAgentExpiryDate() {
        return this.agentExpiryDate == null ? Optional.empty() : Optional.ofNullable(this.agentExpiryDate);
    }

    /**
     * The agent Version.
     * 
     */
    @InputImport(name="agentVersion")
    private final @Nullable String agentVersion;

    public Optional<String> getAgentVersion() {
        return this.agentVersion == null ? Optional.empty() : Optional.ofNullable(this.agentVersion);
    }

    /**
     * The agent version details.
     * 
     */
    @InputImport(name="agentVersionDetails")
    private final @Nullable VersionDetailsResponse agentVersionDetails;

    public Optional<VersionDetailsResponse> getAgentVersionDetails() {
        return this.agentVersionDetails == null ? Optional.empty() : Optional.ofNullable(this.agentVersionDetails);
    }

    /**
     * The available memory.
     * 
     */
    @InputImport(name="availableMemoryInBytes")
    private final @Nullable Double availableMemoryInBytes;

    public Optional<Double> getAvailableMemoryInBytes() {
        return this.availableMemoryInBytes == null ? Optional.empty() : Optional.ofNullable(this.availableMemoryInBytes);
    }

    /**
     * The available space.
     * 
     */
    @InputImport(name="availableSpaceInBytes")
    private final @Nullable Double availableSpaceInBytes;

    public Optional<Double> getAvailableSpaceInBytes() {
        return this.availableSpaceInBytes == null ? Optional.empty() : Optional.ofNullable(this.availableSpaceInBytes);
    }

    /**
     * The percentage of the CPU load.
     * 
     */
    @InputImport(name="cpuLoad")
    private final @Nullable String cpuLoad;

    public Optional<String> getCpuLoad() {
        return this.cpuLoad == null ? Optional.empty() : Optional.ofNullable(this.cpuLoad);
    }

    /**
     * The CPU load status.
     * 
     */
    @InputImport(name="cpuLoadStatus")
    private final @Nullable String cpuLoadStatus;

    public Optional<String> getCpuLoadStatus() {
        return this.cpuLoadStatus == null ? Optional.empty() : Optional.ofNullable(this.cpuLoadStatus);
    }

    /**
     * The CS service status.
     * 
     */
    @InputImport(name="csServiceStatus")
    private final @Nullable String csServiceStatus;

    public Optional<String> getCsServiceStatus() {
        return this.csServiceStatus == null ? Optional.empty() : Optional.ofNullable(this.csServiceStatus);
    }

    /**
     * The database server load.
     * 
     */
    @InputImport(name="databaseServerLoad")
    private final @Nullable String databaseServerLoad;

    public Optional<String> getDatabaseServerLoad() {
        return this.databaseServerLoad == null ? Optional.empty() : Optional.ofNullable(this.databaseServerLoad);
    }

    /**
     * The database server load status.
     * 
     */
    @InputImport(name="databaseServerLoadStatus")
    private final @Nullable String databaseServerLoadStatus;

    public Optional<String> getDatabaseServerLoadStatus() {
        return this.databaseServerLoadStatus == null ? Optional.empty() : Optional.ofNullable(this.databaseServerLoadStatus);
    }

    /**
     * The host name.
     * 
     */
    @InputImport(name="hostName")
    private final @Nullable String hostName;

    public Optional<String> getHostName() {
        return this.hostName == null ? Optional.empty() : Optional.ofNullable(this.hostName);
    }

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'VMware'.
     * 
     */
    @InputImport(name="instanceType", required=true)
    private final String instanceType;

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * The IP address.
     * 
     */
    @InputImport(name="ipAddress")
    private final @Nullable String ipAddress;

    public Optional<String> getIpAddress() {
        return this.ipAddress == null ? Optional.empty() : Optional.ofNullable(this.ipAddress);
    }

    /**
     * The last heartbeat received from CS server.
     * 
     */
    @InputImport(name="lastHeartbeat")
    private final @Nullable String lastHeartbeat;

    public Optional<String> getLastHeartbeat() {
        return this.lastHeartbeat == null ? Optional.empty() : Optional.ofNullable(this.lastHeartbeat);
    }

    /**
     * The list of Master Target servers associated with the fabric.
     * 
     */
    @InputImport(name="masterTargetServers")
    private final @Nullable List<MasterTargetServerResponse> masterTargetServers;

    public List<MasterTargetServerResponse> getMasterTargetServers() {
        return this.masterTargetServers == null ? List.of() : this.masterTargetServers;
    }

    /**
     * The memory usage status.
     * 
     */
    @InputImport(name="memoryUsageStatus")
    private final @Nullable String memoryUsageStatus;

    public Optional<String> getMemoryUsageStatus() {
        return this.memoryUsageStatus == null ? Optional.empty() : Optional.ofNullable(this.memoryUsageStatus);
    }

    /**
     * The number of process servers.
     * 
     */
    @InputImport(name="processServerCount")
    private final @Nullable String processServerCount;

    public Optional<String> getProcessServerCount() {
        return this.processServerCount == null ? Optional.empty() : Optional.ofNullable(this.processServerCount);
    }

    /**
     * The list of Process Servers associated with the fabric.
     * 
     */
    @InputImport(name="processServers")
    private final @Nullable List<ProcessServerResponse> processServers;

    public List<ProcessServerResponse> getProcessServers() {
        return this.processServers == null ? List.of() : this.processServers;
    }

    /**
     * The number of protected servers.
     * 
     */
    @InputImport(name="protectedServers")
    private final @Nullable String protectedServers;

    public Optional<String> getProtectedServers() {
        return this.protectedServers == null ? Optional.empty() : Optional.ofNullable(this.protectedServers);
    }

    /**
     * PS template version.
     * 
     */
    @InputImport(name="psTemplateVersion")
    private final @Nullable String psTemplateVersion;

    public Optional<String> getPsTemplateVersion() {
        return this.psTemplateVersion == null ? Optional.empty() : Optional.ofNullable(this.psTemplateVersion);
    }

    /**
     * The number of replication pairs configured in this CS.
     * 
     */
    @InputImport(name="replicationPairCount")
    private final @Nullable String replicationPairCount;

    public Optional<String> getReplicationPairCount() {
        return this.replicationPairCount == null ? Optional.empty() : Optional.ofNullable(this.replicationPairCount);
    }

    /**
     * The list of run as accounts created on the server.
     * 
     */
    @InputImport(name="runAsAccounts")
    private final @Nullable List<RunAsAccountResponse> runAsAccounts;

    public List<RunAsAccountResponse> getRunAsAccounts() {
        return this.runAsAccounts == null ? List.of() : this.runAsAccounts;
    }

    /**
     * The space usage status.
     * 
     */
    @InputImport(name="spaceUsageStatus")
    private final @Nullable String spaceUsageStatus;

    public Optional<String> getSpaceUsageStatus() {
        return this.spaceUsageStatus == null ? Optional.empty() : Optional.ofNullable(this.spaceUsageStatus);
    }

    /**
     * CS SSL cert expiry date.
     * 
     */
    @InputImport(name="sslCertExpiryDate")
    private final @Nullable String sslCertExpiryDate;

    public Optional<String> getSslCertExpiryDate() {
        return this.sslCertExpiryDate == null ? Optional.empty() : Optional.ofNullable(this.sslCertExpiryDate);
    }

    /**
     * CS SSL cert expiry date.
     * 
     */
    @InputImport(name="sslCertExpiryRemainingDays")
    private final @Nullable Integer sslCertExpiryRemainingDays;

    public Optional<Integer> getSslCertExpiryRemainingDays() {
        return this.sslCertExpiryRemainingDays == null ? Optional.empty() : Optional.ofNullable(this.sslCertExpiryRemainingDays);
    }

    /**
     * The percentage of the system load.
     * 
     */
    @InputImport(name="systemLoad")
    private final @Nullable String systemLoad;

    public Optional<String> getSystemLoad() {
        return this.systemLoad == null ? Optional.empty() : Optional.ofNullable(this.systemLoad);
    }

    /**
     * The system load status.
     * 
     */
    @InputImport(name="systemLoadStatus")
    private final @Nullable String systemLoadStatus;

    public Optional<String> getSystemLoadStatus() {
        return this.systemLoadStatus == null ? Optional.empty() : Optional.ofNullable(this.systemLoadStatus);
    }

    /**
     * The total memory.
     * 
     */
    @InputImport(name="totalMemoryInBytes")
    private final @Nullable Double totalMemoryInBytes;

    public Optional<Double> getTotalMemoryInBytes() {
        return this.totalMemoryInBytes == null ? Optional.empty() : Optional.ofNullable(this.totalMemoryInBytes);
    }

    /**
     * The total space.
     * 
     */
    @InputImport(name="totalSpaceInBytes")
    private final @Nullable Double totalSpaceInBytes;

    public Optional<Double> getTotalSpaceInBytes() {
        return this.totalSpaceInBytes == null ? Optional.empty() : Optional.ofNullable(this.totalSpaceInBytes);
    }

    /**
     * Version status
     * 
     */
    @InputImport(name="versionStatus")
    private final @Nullable String versionStatus;

    public Optional<String> getVersionStatus() {
        return this.versionStatus == null ? Optional.empty() : Optional.ofNullable(this.versionStatus);
    }

    /**
     * The web load.
     * 
     */
    @InputImport(name="webLoad")
    private final @Nullable String webLoad;

    public Optional<String> getWebLoad() {
        return this.webLoad == null ? Optional.empty() : Optional.ofNullable(this.webLoad);
    }

    /**
     * The web load status.
     * 
     */
    @InputImport(name="webLoadStatus")
    private final @Nullable String webLoadStatus;

    public Optional<String> getWebLoadStatus() {
        return this.webLoadStatus == null ? Optional.empty() : Optional.ofNullable(this.webLoadStatus);
    }

    public VMwareDetailsResponse(
        @Nullable String agentCount,
        @Nullable String agentExpiryDate,
        @Nullable String agentVersion,
        @Nullable VersionDetailsResponse agentVersionDetails,
        @Nullable Double availableMemoryInBytes,
        @Nullable Double availableSpaceInBytes,
        @Nullable String cpuLoad,
        @Nullable String cpuLoadStatus,
        @Nullable String csServiceStatus,
        @Nullable String databaseServerLoad,
        @Nullable String databaseServerLoadStatus,
        @Nullable String hostName,
        String instanceType,
        @Nullable String ipAddress,
        @Nullable String lastHeartbeat,
        @Nullable List<MasterTargetServerResponse> masterTargetServers,
        @Nullable String memoryUsageStatus,
        @Nullable String processServerCount,
        @Nullable List<ProcessServerResponse> processServers,
        @Nullable String protectedServers,
        @Nullable String psTemplateVersion,
        @Nullable String replicationPairCount,
        @Nullable List<RunAsAccountResponse> runAsAccounts,
        @Nullable String spaceUsageStatus,
        @Nullable String sslCertExpiryDate,
        @Nullable Integer sslCertExpiryRemainingDays,
        @Nullable String systemLoad,
        @Nullable String systemLoadStatus,
        @Nullable Double totalMemoryInBytes,
        @Nullable Double totalSpaceInBytes,
        @Nullable String versionStatus,
        @Nullable String webLoad,
        @Nullable String webLoadStatus) {
        this.agentCount = agentCount;
        this.agentExpiryDate = agentExpiryDate;
        this.agentVersion = agentVersion;
        this.agentVersionDetails = agentVersionDetails;
        this.availableMemoryInBytes = availableMemoryInBytes;
        this.availableSpaceInBytes = availableSpaceInBytes;
        this.cpuLoad = cpuLoad;
        this.cpuLoadStatus = cpuLoadStatus;
        this.csServiceStatus = csServiceStatus;
        this.databaseServerLoad = databaseServerLoad;
        this.databaseServerLoadStatus = databaseServerLoadStatus;
        this.hostName = hostName;
        this.instanceType = Objects.requireNonNull(instanceType, "expected parameter 'instanceType' to be non-null");
        this.ipAddress = ipAddress;
        this.lastHeartbeat = lastHeartbeat;
        this.masterTargetServers = masterTargetServers;
        this.memoryUsageStatus = memoryUsageStatus;
        this.processServerCount = processServerCount;
        this.processServers = processServers;
        this.protectedServers = protectedServers;
        this.psTemplateVersion = psTemplateVersion;
        this.replicationPairCount = replicationPairCount;
        this.runAsAccounts = runAsAccounts;
        this.spaceUsageStatus = spaceUsageStatus;
        this.sslCertExpiryDate = sslCertExpiryDate;
        this.sslCertExpiryRemainingDays = sslCertExpiryRemainingDays;
        this.systemLoad = systemLoad;
        this.systemLoadStatus = systemLoadStatus;
        this.totalMemoryInBytes = totalMemoryInBytes;
        this.totalSpaceInBytes = totalSpaceInBytes;
        this.versionStatus = versionStatus;
        this.webLoad = webLoad;
        this.webLoadStatus = webLoadStatus;
    }

    private VMwareDetailsResponse() {
        this.agentCount = null;
        this.agentExpiryDate = null;
        this.agentVersion = null;
        this.agentVersionDetails = null;
        this.availableMemoryInBytes = null;
        this.availableSpaceInBytes = null;
        this.cpuLoad = null;
        this.cpuLoadStatus = null;
        this.csServiceStatus = null;
        this.databaseServerLoad = null;
        this.databaseServerLoadStatus = null;
        this.hostName = null;
        this.instanceType = null;
        this.ipAddress = null;
        this.lastHeartbeat = null;
        this.masterTargetServers = List.of();
        this.memoryUsageStatus = null;
        this.processServerCount = null;
        this.processServers = List.of();
        this.protectedServers = null;
        this.psTemplateVersion = null;
        this.replicationPairCount = null;
        this.runAsAccounts = List.of();
        this.spaceUsageStatus = null;
        this.sslCertExpiryDate = null;
        this.sslCertExpiryRemainingDays = null;
        this.systemLoad = null;
        this.systemLoadStatus = null;
        this.totalMemoryInBytes = null;
        this.totalSpaceInBytes = null;
        this.versionStatus = null;
        this.webLoad = null;
        this.webLoadStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentCount;
        private @Nullable String agentExpiryDate;
        private @Nullable String agentVersion;
        private @Nullable VersionDetailsResponse agentVersionDetails;
        private @Nullable Double availableMemoryInBytes;
        private @Nullable Double availableSpaceInBytes;
        private @Nullable String cpuLoad;
        private @Nullable String cpuLoadStatus;
        private @Nullable String csServiceStatus;
        private @Nullable String databaseServerLoad;
        private @Nullable String databaseServerLoadStatus;
        private @Nullable String hostName;
        private String instanceType;
        private @Nullable String ipAddress;
        private @Nullable String lastHeartbeat;
        private @Nullable List<MasterTargetServerResponse> masterTargetServers;
        private @Nullable String memoryUsageStatus;
        private @Nullable String processServerCount;
        private @Nullable List<ProcessServerResponse> processServers;
        private @Nullable String protectedServers;
        private @Nullable String psTemplateVersion;
        private @Nullable String replicationPairCount;
        private @Nullable List<RunAsAccountResponse> runAsAccounts;
        private @Nullable String spaceUsageStatus;
        private @Nullable String sslCertExpiryDate;
        private @Nullable Integer sslCertExpiryRemainingDays;
        private @Nullable String systemLoad;
        private @Nullable String systemLoadStatus;
        private @Nullable Double totalMemoryInBytes;
        private @Nullable Double totalSpaceInBytes;
        private @Nullable String versionStatus;
        private @Nullable String webLoad;
        private @Nullable String webLoadStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentCount = defaults.agentCount;
    	      this.agentExpiryDate = defaults.agentExpiryDate;
    	      this.agentVersion = defaults.agentVersion;
    	      this.agentVersionDetails = defaults.agentVersionDetails;
    	      this.availableMemoryInBytes = defaults.availableMemoryInBytes;
    	      this.availableSpaceInBytes = defaults.availableSpaceInBytes;
    	      this.cpuLoad = defaults.cpuLoad;
    	      this.cpuLoadStatus = defaults.cpuLoadStatus;
    	      this.csServiceStatus = defaults.csServiceStatus;
    	      this.databaseServerLoad = defaults.databaseServerLoad;
    	      this.databaseServerLoadStatus = defaults.databaseServerLoadStatus;
    	      this.hostName = defaults.hostName;
    	      this.instanceType = defaults.instanceType;
    	      this.ipAddress = defaults.ipAddress;
    	      this.lastHeartbeat = defaults.lastHeartbeat;
    	      this.masterTargetServers = defaults.masterTargetServers;
    	      this.memoryUsageStatus = defaults.memoryUsageStatus;
    	      this.processServerCount = defaults.processServerCount;
    	      this.processServers = defaults.processServers;
    	      this.protectedServers = defaults.protectedServers;
    	      this.psTemplateVersion = defaults.psTemplateVersion;
    	      this.replicationPairCount = defaults.replicationPairCount;
    	      this.runAsAccounts = defaults.runAsAccounts;
    	      this.spaceUsageStatus = defaults.spaceUsageStatus;
    	      this.sslCertExpiryDate = defaults.sslCertExpiryDate;
    	      this.sslCertExpiryRemainingDays = defaults.sslCertExpiryRemainingDays;
    	      this.systemLoad = defaults.systemLoad;
    	      this.systemLoadStatus = defaults.systemLoadStatus;
    	      this.totalMemoryInBytes = defaults.totalMemoryInBytes;
    	      this.totalSpaceInBytes = defaults.totalSpaceInBytes;
    	      this.versionStatus = defaults.versionStatus;
    	      this.webLoad = defaults.webLoad;
    	      this.webLoadStatus = defaults.webLoadStatus;
        }

        public Builder setAgentCount(@Nullable String agentCount) {
            this.agentCount = agentCount;
            return this;
        }

        public Builder setAgentExpiryDate(@Nullable String agentExpiryDate) {
            this.agentExpiryDate = agentExpiryDate;
            return this;
        }

        public Builder setAgentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        public Builder setAgentVersionDetails(@Nullable VersionDetailsResponse agentVersionDetails) {
            this.agentVersionDetails = agentVersionDetails;
            return this;
        }

        public Builder setAvailableMemoryInBytes(@Nullable Double availableMemoryInBytes) {
            this.availableMemoryInBytes = availableMemoryInBytes;
            return this;
        }

        public Builder setAvailableSpaceInBytes(@Nullable Double availableSpaceInBytes) {
            this.availableSpaceInBytes = availableSpaceInBytes;
            return this;
        }

        public Builder setCpuLoad(@Nullable String cpuLoad) {
            this.cpuLoad = cpuLoad;
            return this;
        }

        public Builder setCpuLoadStatus(@Nullable String cpuLoadStatus) {
            this.cpuLoadStatus = cpuLoadStatus;
            return this;
        }

        public Builder setCsServiceStatus(@Nullable String csServiceStatus) {
            this.csServiceStatus = csServiceStatus;
            return this;
        }

        public Builder setDatabaseServerLoad(@Nullable String databaseServerLoad) {
            this.databaseServerLoad = databaseServerLoad;
            return this;
        }

        public Builder setDatabaseServerLoadStatus(@Nullable String databaseServerLoadStatus) {
            this.databaseServerLoadStatus = databaseServerLoadStatus;
            return this;
        }

        public Builder setHostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setLastHeartbeat(@Nullable String lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }

        public Builder setMasterTargetServers(@Nullable List<MasterTargetServerResponse> masterTargetServers) {
            this.masterTargetServers = masterTargetServers;
            return this;
        }

        public Builder setMemoryUsageStatus(@Nullable String memoryUsageStatus) {
            this.memoryUsageStatus = memoryUsageStatus;
            return this;
        }

        public Builder setProcessServerCount(@Nullable String processServerCount) {
            this.processServerCount = processServerCount;
            return this;
        }

        public Builder setProcessServers(@Nullable List<ProcessServerResponse> processServers) {
            this.processServers = processServers;
            return this;
        }

        public Builder setProtectedServers(@Nullable String protectedServers) {
            this.protectedServers = protectedServers;
            return this;
        }

        public Builder setPsTemplateVersion(@Nullable String psTemplateVersion) {
            this.psTemplateVersion = psTemplateVersion;
            return this;
        }

        public Builder setReplicationPairCount(@Nullable String replicationPairCount) {
            this.replicationPairCount = replicationPairCount;
            return this;
        }

        public Builder setRunAsAccounts(@Nullable List<RunAsAccountResponse> runAsAccounts) {
            this.runAsAccounts = runAsAccounts;
            return this;
        }

        public Builder setSpaceUsageStatus(@Nullable String spaceUsageStatus) {
            this.spaceUsageStatus = spaceUsageStatus;
            return this;
        }

        public Builder setSslCertExpiryDate(@Nullable String sslCertExpiryDate) {
            this.sslCertExpiryDate = sslCertExpiryDate;
            return this;
        }

        public Builder setSslCertExpiryRemainingDays(@Nullable Integer sslCertExpiryRemainingDays) {
            this.sslCertExpiryRemainingDays = sslCertExpiryRemainingDays;
            return this;
        }

        public Builder setSystemLoad(@Nullable String systemLoad) {
            this.systemLoad = systemLoad;
            return this;
        }

        public Builder setSystemLoadStatus(@Nullable String systemLoadStatus) {
            this.systemLoadStatus = systemLoadStatus;
            return this;
        }

        public Builder setTotalMemoryInBytes(@Nullable Double totalMemoryInBytes) {
            this.totalMemoryInBytes = totalMemoryInBytes;
            return this;
        }

        public Builder setTotalSpaceInBytes(@Nullable Double totalSpaceInBytes) {
            this.totalSpaceInBytes = totalSpaceInBytes;
            return this;
        }

        public Builder setVersionStatus(@Nullable String versionStatus) {
            this.versionStatus = versionStatus;
            return this;
        }

        public Builder setWebLoad(@Nullable String webLoad) {
            this.webLoad = webLoad;
            return this;
        }

        public Builder setWebLoadStatus(@Nullable String webLoadStatus) {
            this.webLoadStatus = webLoadStatus;
            return this;
        }

        public VMwareDetailsResponse build() {
            return new VMwareDetailsResponse(agentCount, agentExpiryDate, agentVersion, agentVersionDetails, availableMemoryInBytes, availableSpaceInBytes, cpuLoad, cpuLoadStatus, csServiceStatus, databaseServerLoad, databaseServerLoadStatus, hostName, instanceType, ipAddress, lastHeartbeat, masterTargetServers, memoryUsageStatus, processServerCount, processServers, protectedServers, psTemplateVersion, replicationPairCount, runAsAccounts, spaceUsageStatus, sslCertExpiryDate, sslCertExpiryRemainingDays, systemLoad, systemLoadStatus, totalMemoryInBytes, totalSpaceInBytes, versionStatus, webLoad, webLoadStatus);
        }
    }
}
