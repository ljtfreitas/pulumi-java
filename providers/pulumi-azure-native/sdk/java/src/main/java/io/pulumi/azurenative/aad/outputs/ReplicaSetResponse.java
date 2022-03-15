// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.outputs;

import io.pulumi.azurenative.aad.outputs.HealthAlertResponse;
import io.pulumi.azurenative.aad.outputs.HealthMonitorResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ReplicaSetResponse {
    /**
     * List of Domain Controller IP Address
     * 
     */
    private final List<String> domainControllerIpAddress;
    /**
     * External access ip address.
     * 
     */
    private final String externalAccessIpAddress;
    /**
     * List of Domain Health Alerts
     * 
     */
    private final List<HealthAlertResponse> healthAlerts;
    /**
     * Last domain evaluation run DateTime
     * 
     */
    private final String healthLastEvaluated;
    /**
     * List of Domain Health Monitors
     * 
     */
    private final List<HealthMonitorResponse> healthMonitors;
    /**
     * Virtual network location
     * 
     */
    private final @Nullable String location;
    /**
     * ReplicaSet Id
     * 
     */
    private final String replicaSetId;
    /**
     * Status of Domain Service instance
     * 
     */
    private final String serviceStatus;
    /**
     * The name of the virtual network that Domain Services will be deployed on. The id of the subnet that Domain Services will be deployed on. /virtualNetwork/vnetName/subnets/subnetName.
     * 
     */
    private final @Nullable String subnetId;
    /**
     * Virtual network site id
     * 
     */
    private final String vnetSiteId;

    @CustomType.Constructor
    private ReplicaSetResponse(
        @CustomType.Parameter("domainControllerIpAddress") List<String> domainControllerIpAddress,
        @CustomType.Parameter("externalAccessIpAddress") String externalAccessIpAddress,
        @CustomType.Parameter("healthAlerts") List<HealthAlertResponse> healthAlerts,
        @CustomType.Parameter("healthLastEvaluated") String healthLastEvaluated,
        @CustomType.Parameter("healthMonitors") List<HealthMonitorResponse> healthMonitors,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("replicaSetId") String replicaSetId,
        @CustomType.Parameter("serviceStatus") String serviceStatus,
        @CustomType.Parameter("subnetId") @Nullable String subnetId,
        @CustomType.Parameter("vnetSiteId") String vnetSiteId) {
        this.domainControllerIpAddress = domainControllerIpAddress;
        this.externalAccessIpAddress = externalAccessIpAddress;
        this.healthAlerts = healthAlerts;
        this.healthLastEvaluated = healthLastEvaluated;
        this.healthMonitors = healthMonitors;
        this.location = location;
        this.replicaSetId = replicaSetId;
        this.serviceStatus = serviceStatus;
        this.subnetId = subnetId;
        this.vnetSiteId = vnetSiteId;
    }

    /**
     * List of Domain Controller IP Address
     * 
    */
    public List<String> getDomainControllerIpAddress() {
        return this.domainControllerIpAddress;
    }
    /**
     * External access ip address.
     * 
    */
    public String getExternalAccessIpAddress() {
        return this.externalAccessIpAddress;
    }
    /**
     * List of Domain Health Alerts
     * 
    */
    public List<HealthAlertResponse> getHealthAlerts() {
        return this.healthAlerts;
    }
    /**
     * Last domain evaluation run DateTime
     * 
    */
    public String getHealthLastEvaluated() {
        return this.healthLastEvaluated;
    }
    /**
     * List of Domain Health Monitors
     * 
    */
    public List<HealthMonitorResponse> getHealthMonitors() {
        return this.healthMonitors;
    }
    /**
     * Virtual network location
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * ReplicaSet Id
     * 
    */
    public String getReplicaSetId() {
        return this.replicaSetId;
    }
    /**
     * Status of Domain Service instance
     * 
    */
    public String getServiceStatus() {
        return this.serviceStatus;
    }
    /**
     * The name of the virtual network that Domain Services will be deployed on. The id of the subnet that Domain Services will be deployed on. /virtualNetwork/vnetName/subnets/subnetName.
     * 
    */
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * Virtual network site id
     * 
    */
    public String getVnetSiteId() {
        return this.vnetSiteId;
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

        public Builder domainControllerIpAddress(List<String> domainControllerIpAddress) {
            this.domainControllerIpAddress = Objects.requireNonNull(domainControllerIpAddress);
            return this;
        }

        public Builder externalAccessIpAddress(String externalAccessIpAddress) {
            this.externalAccessIpAddress = Objects.requireNonNull(externalAccessIpAddress);
            return this;
        }

        public Builder healthAlerts(List<HealthAlertResponse> healthAlerts) {
            this.healthAlerts = Objects.requireNonNull(healthAlerts);
            return this;
        }

        public Builder healthLastEvaluated(String healthLastEvaluated) {
            this.healthLastEvaluated = Objects.requireNonNull(healthLastEvaluated);
            return this;
        }

        public Builder healthMonitors(List<HealthMonitorResponse> healthMonitors) {
            this.healthMonitors = Objects.requireNonNull(healthMonitors);
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder replicaSetId(String replicaSetId) {
            this.replicaSetId = Objects.requireNonNull(replicaSetId);
            return this;
        }

        public Builder serviceStatus(String serviceStatus) {
            this.serviceStatus = Objects.requireNonNull(serviceStatus);
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder vnetSiteId(String vnetSiteId) {
            this.vnetSiteId = Objects.requireNonNull(vnetSiteId);
            return this;
        }
        public ReplicaSetResponse build() {
            return new ReplicaSetResponse(domainControllerIpAddress, externalAccessIpAddress, healthAlerts, healthLastEvaluated, healthMonitors, location, replicaSetId, serviceStatus, subnetId, vnetSiteId);
        }
    }
}
