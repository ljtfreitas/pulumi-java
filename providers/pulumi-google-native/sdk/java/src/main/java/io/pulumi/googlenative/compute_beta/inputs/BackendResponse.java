// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Message containing information of one individual backend.
 * 
 */
public final class BackendResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendResponse Empty = new BackendResponse();

    /**
     * Specifies how to determine whether the backend of a load balancer can handle additional traffic or is fully loaded. For usage guidelines, see Connection balancing mode. Backends must use compatible balancing modes. For more information, see Supported balancing modes and target capacity settings and Restrictions and guidance for instance groups. Note: Currently, if you use the API to configure incompatible balancing modes, the configuration might be accepted even though it has no impact and is ignored. Specifically, Backend.maxUtilization is ignored when Backend.balancingMode is RATE. In the future, this incompatible combination will be rejected.
     * 
     */
    @InputImport(name="balancingMode", required=true)
      private final String balancingMode;

    public String getBalancingMode() {
        return this.balancingMode;
    }

    /**
     * A multiplier applied to the backend's target capacity of its balancing mode. The default value is 1, which means the group serves up to 100% of its configured capacity (depending on balancingMode). A setting of 0 means the group is completely drained, offering 0% of its available capacity. The valid ranges are 0.0 and [0.1,1.0]. You cannot configure a setting larger than 0 and smaller than 0.1. You cannot configure a setting of 0 when there is only one backend attached to the backend service.
     * 
     */
    @InputImport(name="capacityScaler", required=true)
      private final Double capacityScaler;

    public Double getCapacityScaler() {
        return this.capacityScaler;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * This field designates whether this is a failover backend. More than one failover backend can be configured for a given BackendService.
     * 
     */
    @InputImport(name="failover", required=true)
      private final Boolean failover;

    public Boolean getFailover() {
        return this.failover;
    }

    /**
     * The fully-qualified URL of an instance group or network endpoint group (NEG) resource. To determine what types of backends a load balancer supports, see the [Backend services overview](https://cloud.google.com/load-balancing/docs/backend-service#backends). You must use the *fully-qualified* URL (starting with https://www.googleapis.com/) to specify the instance group or NEG. Partial URLs are not supported.
     * 
     */
    @InputImport(name="group", required=true)
      private final String group;

    public String getGroup() {
        return this.group;
    }

    /**
     * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is RATE.
     * 
     */
    @InputImport(name="maxConnections", required=true)
      private final Integer maxConnections;

    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    /**
     * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is RATE.
     * 
     */
    @InputImport(name="maxConnectionsPerEndpoint", required=true)
      private final Integer maxConnectionsPerEndpoint;

    public Integer getMaxConnectionsPerEndpoint() {
        return this.maxConnectionsPerEndpoint;
    }

    /**
     * Defines a target maximum number of simultaneous connections. For usage guidelines, see Connection balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is RATE.
     * 
     */
    @InputImport(name="maxConnectionsPerInstance", required=true)
      private final Integer maxConnectionsPerInstance;

    public Integer getMaxConnectionsPerInstance() {
        return this.maxConnectionsPerInstance;
    }

    /**
     * Defines a maximum number of HTTP requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is CONNECTION.
     * 
     */
    @InputImport(name="maxRate", required=true)
      private final Integer maxRate;

    public Integer getMaxRate() {
        return this.maxRate;
    }

    /**
     * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is CONNECTION.
     * 
     */
    @InputImport(name="maxRatePerEndpoint", required=true)
      private final Double maxRatePerEndpoint;

    public Double getMaxRatePerEndpoint() {
        return this.maxRatePerEndpoint;
    }

    /**
     * Defines a maximum target for requests per second (RPS). For usage guidelines, see Rate balancing mode and Utilization balancing mode. Not available if the backend's balancingMode is CONNECTION.
     * 
     */
    @InputImport(name="maxRatePerInstance", required=true)
      private final Double maxRatePerInstance;

    public Double getMaxRatePerInstance() {
        return this.maxRatePerInstance;
    }

    /**
     * Optional parameter to define a target capacity for the UTILIZATIONbalancing mode. The valid range is [0.0, 1.0]. For usage guidelines, see Utilization balancing mode.
     * 
     */
    @InputImport(name="maxUtilization", required=true)
      private final Double maxUtilization;

    public Double getMaxUtilization() {
        return this.maxUtilization;
    }

    public BackendResponse(
        String balancingMode,
        Double capacityScaler,
        String description,
        Boolean failover,
        String group,
        Integer maxConnections,
        Integer maxConnectionsPerEndpoint,
        Integer maxConnectionsPerInstance,
        Integer maxRate,
        Double maxRatePerEndpoint,
        Double maxRatePerInstance,
        Double maxUtilization) {
        this.balancingMode = Objects.requireNonNull(balancingMode, "expected parameter 'balancingMode' to be non-null");
        this.capacityScaler = Objects.requireNonNull(capacityScaler, "expected parameter 'capacityScaler' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.failover = Objects.requireNonNull(failover, "expected parameter 'failover' to be non-null");
        this.group = Objects.requireNonNull(group, "expected parameter 'group' to be non-null");
        this.maxConnections = Objects.requireNonNull(maxConnections, "expected parameter 'maxConnections' to be non-null");
        this.maxConnectionsPerEndpoint = Objects.requireNonNull(maxConnectionsPerEndpoint, "expected parameter 'maxConnectionsPerEndpoint' to be non-null");
        this.maxConnectionsPerInstance = Objects.requireNonNull(maxConnectionsPerInstance, "expected parameter 'maxConnectionsPerInstance' to be non-null");
        this.maxRate = Objects.requireNonNull(maxRate, "expected parameter 'maxRate' to be non-null");
        this.maxRatePerEndpoint = Objects.requireNonNull(maxRatePerEndpoint, "expected parameter 'maxRatePerEndpoint' to be non-null");
        this.maxRatePerInstance = Objects.requireNonNull(maxRatePerInstance, "expected parameter 'maxRatePerInstance' to be non-null");
        this.maxUtilization = Objects.requireNonNull(maxUtilization, "expected parameter 'maxUtilization' to be non-null");
    }

    private BackendResponse() {
        this.balancingMode = null;
        this.capacityScaler = null;
        this.description = null;
        this.failover = null;
        this.group = null;
        this.maxConnections = null;
        this.maxConnectionsPerEndpoint = null;
        this.maxConnectionsPerInstance = null;
        this.maxRate = null;
        this.maxRatePerEndpoint = null;
        this.maxRatePerInstance = null;
        this.maxUtilization = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String balancingMode;
        private Double capacityScaler;
        private String description;
        private Boolean failover;
        private String group;
        private Integer maxConnections;
        private Integer maxConnectionsPerEndpoint;
        private Integer maxConnectionsPerInstance;
        private Integer maxRate;
        private Double maxRatePerEndpoint;
        private Double maxRatePerInstance;
        private Double maxUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.balancingMode = defaults.balancingMode;
    	      this.capacityScaler = defaults.capacityScaler;
    	      this.description = defaults.description;
    	      this.failover = defaults.failover;
    	      this.group = defaults.group;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxConnectionsPerEndpoint = defaults.maxConnectionsPerEndpoint;
    	      this.maxConnectionsPerInstance = defaults.maxConnectionsPerInstance;
    	      this.maxRate = defaults.maxRate;
    	      this.maxRatePerEndpoint = defaults.maxRatePerEndpoint;
    	      this.maxRatePerInstance = defaults.maxRatePerInstance;
    	      this.maxUtilization = defaults.maxUtilization;
        }

        public Builder setBalancingMode(String balancingMode) {
            this.balancingMode = Objects.requireNonNull(balancingMode);
            return this;
        }

        public Builder setCapacityScaler(Double capacityScaler) {
            this.capacityScaler = Objects.requireNonNull(capacityScaler);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFailover(Boolean failover) {
            this.failover = Objects.requireNonNull(failover);
            return this;
        }

        public Builder setGroup(String group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }

        public Builder setMaxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }

        public Builder setMaxConnectionsPerEndpoint(Integer maxConnectionsPerEndpoint) {
            this.maxConnectionsPerEndpoint = Objects.requireNonNull(maxConnectionsPerEndpoint);
            return this;
        }

        public Builder setMaxConnectionsPerInstance(Integer maxConnectionsPerInstance) {
            this.maxConnectionsPerInstance = Objects.requireNonNull(maxConnectionsPerInstance);
            return this;
        }

        public Builder setMaxRate(Integer maxRate) {
            this.maxRate = Objects.requireNonNull(maxRate);
            return this;
        }

        public Builder setMaxRatePerEndpoint(Double maxRatePerEndpoint) {
            this.maxRatePerEndpoint = Objects.requireNonNull(maxRatePerEndpoint);
            return this;
        }

        public Builder setMaxRatePerInstance(Double maxRatePerInstance) {
            this.maxRatePerInstance = Objects.requireNonNull(maxRatePerInstance);
            return this;
        }

        public Builder setMaxUtilization(Double maxUtilization) {
            this.maxUtilization = Objects.requireNonNull(maxUtilization);
            return this;
        }
        public BackendResponse build() {
            return new BackendResponse(balancingMode, capacityScaler, description, failover, group, maxConnections, maxConnectionsPerEndpoint, maxConnectionsPerInstance, maxRate, maxRatePerEndpoint, maxRatePerInstance, maxUtilization);
        }
    }
}
