// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * InMageRcm mobility agent details.
 * 
 */
public final class InMageRcmMobilityAgentDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final InMageRcmMobilityAgentDetailsResponse Empty = new InMageRcmMobilityAgentDetailsResponse();

    /**
     * The agent version expiry date.
     * 
     */
    @InputImport(name="agentVersionExpiryDate", required=true)
    private final String agentVersionExpiryDate;

    public String getAgentVersionExpiryDate() {
        return this.agentVersionExpiryDate;
    }

    /**
     * The driver version.
     * 
     */
    @InputImport(name="driverVersion", required=true)
    private final String driverVersion;

    public String getDriverVersion() {
        return this.driverVersion;
    }

    /**
     * The driver version expiry date.
     * 
     */
    @InputImport(name="driverVersionExpiryDate", required=true)
    private final String driverVersionExpiryDate;

    public String getDriverVersionExpiryDate() {
        return this.driverVersionExpiryDate;
    }

    /**
     * A value indicating whether agent is upgradeable or not.
     * 
     */
    @InputImport(name="isUpgradeable", required=true)
    private final String isUpgradeable;

    public String getIsUpgradeable() {
        return this.isUpgradeable;
    }

    /**
     * The time of the last heartbeat received from the agent.
     * 
     */
    @InputImport(name="lastHeartbeatUtc", required=true)
    private final String lastHeartbeatUtc;

    public String getLastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }

    /**
     * The latest upgradeable version available without reboot.
     * 
     */
    @InputImport(name="latestUpgradableVersionWithoutReboot", required=true)
    private final String latestUpgradableVersionWithoutReboot;

    public String getLatestUpgradableVersionWithoutReboot() {
        return this.latestUpgradableVersionWithoutReboot;
    }

    /**
     * The latest agent version available.
     * 
     */
    @InputImport(name="latestVersion", required=true)
    private final String latestVersion;

    public String getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * The whether update is possible or not.
     * 
     */
    @InputImport(name="reasonsBlockingUpgrade", required=true)
    private final List<String> reasonsBlockingUpgrade;

    public List<String> getReasonsBlockingUpgrade() {
        return this.reasonsBlockingUpgrade;
    }

    /**
     * The agent version.
     * 
     */
    @InputImport(name="version", required=true)
    private final String version;

    public String getVersion() {
        return this.version;
    }

    public InMageRcmMobilityAgentDetailsResponse(
        String agentVersionExpiryDate,
        String driverVersion,
        String driverVersionExpiryDate,
        String isUpgradeable,
        String lastHeartbeatUtc,
        String latestUpgradableVersionWithoutReboot,
        String latestVersion,
        List<String> reasonsBlockingUpgrade,
        String version) {
        this.agentVersionExpiryDate = Objects.requireNonNull(agentVersionExpiryDate, "expected parameter 'agentVersionExpiryDate' to be non-null");
        this.driverVersion = Objects.requireNonNull(driverVersion, "expected parameter 'driverVersion' to be non-null");
        this.driverVersionExpiryDate = Objects.requireNonNull(driverVersionExpiryDate, "expected parameter 'driverVersionExpiryDate' to be non-null");
        this.isUpgradeable = Objects.requireNonNull(isUpgradeable, "expected parameter 'isUpgradeable' to be non-null");
        this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc, "expected parameter 'lastHeartbeatUtc' to be non-null");
        this.latestUpgradableVersionWithoutReboot = Objects.requireNonNull(latestUpgradableVersionWithoutReboot, "expected parameter 'latestUpgradableVersionWithoutReboot' to be non-null");
        this.latestVersion = Objects.requireNonNull(latestVersion, "expected parameter 'latestVersion' to be non-null");
        this.reasonsBlockingUpgrade = Objects.requireNonNull(reasonsBlockingUpgrade, "expected parameter 'reasonsBlockingUpgrade' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private InMageRcmMobilityAgentDetailsResponse() {
        this.agentVersionExpiryDate = null;
        this.driverVersion = null;
        this.driverVersionExpiryDate = null;
        this.isUpgradeable = null;
        this.lastHeartbeatUtc = null;
        this.latestUpgradableVersionWithoutReboot = null;
        this.latestVersion = null;
        this.reasonsBlockingUpgrade = List.of();
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmMobilityAgentDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agentVersionExpiryDate;
        private String driverVersion;
        private String driverVersionExpiryDate;
        private String isUpgradeable;
        private String lastHeartbeatUtc;
        private String latestUpgradableVersionWithoutReboot;
        private String latestVersion;
        private List<String> reasonsBlockingUpgrade;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmMobilityAgentDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersionExpiryDate = defaults.agentVersionExpiryDate;
    	      this.driverVersion = defaults.driverVersion;
    	      this.driverVersionExpiryDate = defaults.driverVersionExpiryDate;
    	      this.isUpgradeable = defaults.isUpgradeable;
    	      this.lastHeartbeatUtc = defaults.lastHeartbeatUtc;
    	      this.latestUpgradableVersionWithoutReboot = defaults.latestUpgradableVersionWithoutReboot;
    	      this.latestVersion = defaults.latestVersion;
    	      this.reasonsBlockingUpgrade = defaults.reasonsBlockingUpgrade;
    	      this.version = defaults.version;
        }

        public Builder setAgentVersionExpiryDate(String agentVersionExpiryDate) {
            this.agentVersionExpiryDate = Objects.requireNonNull(agentVersionExpiryDate);
            return this;
        }

        public Builder setDriverVersion(String driverVersion) {
            this.driverVersion = Objects.requireNonNull(driverVersion);
            return this;
        }

        public Builder setDriverVersionExpiryDate(String driverVersionExpiryDate) {
            this.driverVersionExpiryDate = Objects.requireNonNull(driverVersionExpiryDate);
            return this;
        }

        public Builder setIsUpgradeable(String isUpgradeable) {
            this.isUpgradeable = Objects.requireNonNull(isUpgradeable);
            return this;
        }

        public Builder setLastHeartbeatUtc(String lastHeartbeatUtc) {
            this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc);
            return this;
        }

        public Builder setLatestUpgradableVersionWithoutReboot(String latestUpgradableVersionWithoutReboot) {
            this.latestUpgradableVersionWithoutReboot = Objects.requireNonNull(latestUpgradableVersionWithoutReboot);
            return this;
        }

        public Builder setLatestVersion(String latestVersion) {
            this.latestVersion = Objects.requireNonNull(latestVersion);
            return this;
        }

        public Builder setReasonsBlockingUpgrade(List<String> reasonsBlockingUpgrade) {
            this.reasonsBlockingUpgrade = Objects.requireNonNull(reasonsBlockingUpgrade);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public InMageRcmMobilityAgentDetailsResponse build() {
            return new InMageRcmMobilityAgentDetailsResponse(agentVersionExpiryDate, driverVersion, driverVersionExpiryDate, isUpgradeable, lastHeartbeatUtc, latestUpgradableVersionWithoutReboot, latestVersion, reasonsBlockingUpgrade, version);
        }
    }
}
