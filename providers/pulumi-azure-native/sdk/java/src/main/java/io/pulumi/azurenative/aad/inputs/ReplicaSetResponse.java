// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.inputs;

import io.pulumi.azurenative.aad.inputs.HealthAlertResponse;
import io.pulumi.azurenative.aad.inputs.HealthMonitorResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Replica Set Definition
 * 
 */
public final class ReplicaSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReplicaSetResponse Empty = new ReplicaSetResponse();

    /**
     * List of Domain Controller IP Address
     * 
     */
    @InputImport(name="domainControllerIpAddress", required=true)
    private final List<String> domainControllerIpAddress;

    public List<String> getDomainControllerIpAddress() {
        return this.domainControllerIpAddress;
    }

    /**
     * External access ip address.
     * 
     */
    @InputImport(name="externalAccessIpAddress", required=true)
    private final String externalAccessIpAddress;

    public String getExternalAccessIpAddress() {
        return this.externalAccessIpAddress;
    }

    /**
     * List of Domain Health Alerts
     * 
     */
    @InputImport(name="healthAlerts", required=true)
    private final List<HealthAlertResponse> healthAlerts;

    public List<HealthAlertResponse> getHealthAlerts() {
        return this.healthAlerts;
    }

    /**
     * Last domain evaluation run DateTime
     * 
     */
    @InputImport(name="healthLastEvaluated", required=true)
    private final String healthLastEvaluated;

    public String getHealthLastEvaluated() {
        return this.healthLastEvaluated;
    }

    /**
     * List of Domain Health Monitors
     * 
     */
    @InputImport(name="healthMonitors", required=true)
    private final List<HealthMonitorResponse> healthMonitors;

    public List<HealthMonitorResponse> getHealthMonitors() {
        return this.healthMonitors;
    }

    /**
     * Virtual network location
     * 
     */
    @InputImport(name="location")
    private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * ReplicaSet Id
     * 
     */
    @InputImport(name="replicaSetId", required=true)
    private final String replicaSetId;

    public String getReplicaSetId() {
        return this.replicaSetId;
    }

    /**
     * Status of Domain Service instance
     * 
     */
    @InputImport(name="serviceStatus", required=true)
    private final String serviceStatus;

    public String getServiceStatus() {
        return this.serviceStatus;
    }

    /**
     * The name of the virtual network that Domain Services will be deployed on. The id of the subnet that Domain Services will be deployed on. /virtualNetwork/vnetName/subnets/subnetName.
     * 
     */
    @InputImport(name="subnetId")
    private final @Nullable String subnetId;

    public Optional<String> getSubnetId() {
        return this.subnetId == null ? Optional.empty() : Optional.ofNullable(this.subnetId);
    }

    /**
     * Virtual network site id
     * 
     */
    @InputImport(name="vnetSiteId", required=true)
    private final String vnetSiteId;

    public String getVnetSiteId() {
        return this.vnetSiteId;
    }

    public ReplicaSetResponse(
        List<String> domainControllerIpAddress,
        String externalAccessIpAddress,
        List<HealthAlertResponse> healthAlerts,
        String healthLastEvaluated,
        List<HealthMonitorResponse> healthMonitors,
        @Nullable String location,
        String replicaSetId,
        String serviceStatus,
        @Nullable String subnetId,
        String vnetSiteId) {
        this.domainControllerIpAddress = Objects.requireNonNull(domainControllerIpAddress, "expected parameter 'domainControllerIpAddress' to be non-null");
        this.externalAccessIpAddress = Objects.requireNonNull(externalAccessIpAddress, "expected parameter 'externalAccessIpAddress' to be non-null");
        this.healthAlerts = Objects.requireNonNull(healthAlerts, "expected parameter 'healthAlerts' to be non-null");
        this.healthLastEvaluated = Objects.requireNonNull(healthLastEvaluated, "expected parameter 'healthLastEvaluated' to be non-null");
        this.healthMonitors = Objects.requireNonNull(healthMonitors, "expected parameter 'healthMonitors' to be non-null");
        this.location = location;
        this.replicaSetId = Objects.requireNonNull(replicaSetId, "expected parameter 'replicaSetId' to be non-null");
        this.serviceStatus = Objects.requireNonNull(serviceStatus, "expected parameter 'serviceStatus' to be non-null");
        this.subnetId = subnetId;
        this.vnetSiteId = Objects.requireNonNull(vnetSiteId, "expected parameter 'vnetSiteId' to be non-null");
    }

    private ReplicaSetResponse() {
        this.domainControllerIpAddress = List.of();
        this.externalAccessIpAddress = null;
        this.healthAlerts = List.of();
        this.healthLastEvaluated = null;
        this.healthMonitors = List.of();
        this.location = null;
        this.replicaSetId = null;
        this.serviceStatus = null;
        this.subnetId = null;
        this.vnetSiteId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> domainControllerIpAddress;
        private String externalAccessIpAddress;
        private List<HealthAlertResponse> healthAlerts;
        private String healthLastEvaluated;
        private List<HealthMonitorResponse> healthMonitors;
        private @Nullable String location;
        private String replicaSetId;
        private String serviceStatus;
        private @Nullable String subnetId;
        private String vnetSiteId;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainControllerIpAddress = defaults.domainControllerIpAddress;
    	      this.externalAccessIpAddress = defaults.externalAccessIpAddress;
    	      this.healthAlerts = defaults.healthAlerts;
    	      this.healthLastEvaluated = defaults.healthLastEvaluated;
    	      this.healthMonitors = defaults.healthMonitors;
    	      this.location = defaults.location;
    	      this.replicaSetId = defaults.replicaSetId;
    	      this.serviceStatus = defaults.serviceStatus;
    	      this.subnetId = defaults.subnetId;
    	      this.vnetSiteId = defaults.vnetSiteId;
        }

        public Builder setDomainControllerIpAddress(List<String> domainControllerIpAddress) {
            this.domainControllerIpAddress = Objects.requireNonNull(domainControllerIpAddress);
            return this;
        }

        public Builder setExternalAccessIpAddress(String externalAccessIpAddress) {
            this.externalAccessIpAddress = Objects.requireNonNull(externalAccessIpAddress);
            return this;
        }

        public Builder setHealthAlerts(List<HealthAlertResponse> healthAlerts) {
            this.healthAlerts = Objects.requireNonNull(healthAlerts);
            return this;
        }

        public Builder setHealthLastEvaluated(String healthLastEvaluated) {
            this.healthLastEvaluated = Objects.requireNonNull(healthLastEvaluated);
            return this;
        }

        public Builder setHealthMonitors(List<HealthMonitorResponse> healthMonitors) {
            this.healthMonitors = Objects.requireNonNull(healthMonitors);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setReplicaSetId(String replicaSetId) {
            this.replicaSetId = Objects.requireNonNull(replicaSetId);
            return this;
        }

        public Builder setServiceStatus(String serviceStatus) {
            this.serviceStatus = Objects.requireNonNull(serviceStatus);
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setVnetSiteId(String vnetSiteId) {
            this.vnetSiteId = Objects.requireNonNull(vnetSiteId);
            return this;
        }

        public ReplicaSetResponse build() {
            return new ReplicaSetResponse(domainControllerIpAddress, externalAccessIpAddress, healthAlerts, healthLastEvaluated, healthMonitors, location, replicaSetId, serviceStatus, subnetId, vnetSiteId);
        }
    }
}
