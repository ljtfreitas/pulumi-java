// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.EndpointPropertiesResponseCustomHeaders;
import io.pulumi.azurenative.network.inputs.EndpointPropertiesResponseSubnets;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class representing a Traffic Manager endpoint.
 * 
 */
public final class EndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final EndpointResponse Empty = new EndpointResponse();

    /**
     * List of custom headers.
     * 
     */
    @InputImport(name="customHeaders")
    private final @Nullable List<EndpointPropertiesResponseCustomHeaders> customHeaders;

    public List<EndpointPropertiesResponseCustomHeaders> getCustomHeaders() {
        return this.customHeaders == null ? List.of() : this.customHeaders;
    }

    /**
     * Specifies the location of the external or nested endpoints when using the 'Performance' traffic routing method.
     * 
     */
    @InputImport(name="endpointLocation")
    private final @Nullable String endpointLocation;

    public Optional<String> getEndpointLocation() {
        return this.endpointLocation == null ? Optional.empty() : Optional.ofNullable(this.endpointLocation);
    }

    /**
     * The monitoring status of the endpoint.
     * 
     */
    @InputImport(name="endpointMonitorStatus")
    private final @Nullable String endpointMonitorStatus;

    public Optional<String> getEndpointMonitorStatus() {
        return this.endpointMonitorStatus == null ? Optional.empty() : Optional.ofNullable(this.endpointMonitorStatus);
    }

    /**
     * The status of the endpoint. If the endpoint is Enabled, it is probed for endpoint health and is included in the traffic routing method.
     * 
     */
    @InputImport(name="endpointStatus")
    private final @Nullable String endpointStatus;

    public Optional<String> getEndpointStatus() {
        return this.endpointStatus == null ? Optional.empty() : Optional.ofNullable(this.endpointStatus);
    }

    /**
     * The list of countries/regions mapped to this endpoint when using the 'Geographic' traffic routing method. Please consult Traffic Manager Geographic documentation for a full list of accepted values.
     * 
     */
    @InputImport(name="geoMapping")
    private final @Nullable List<String> geoMapping;

    public List<String> getGeoMapping() {
        return this.geoMapping == null ? List.of() : this.geoMapping;
    }

    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/trafficManagerProfiles/{resourceName}
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The minimum number of endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    @InputImport(name="minChildEndpoints")
    private final @Nullable Double minChildEndpoints;

    public Optional<Double> getMinChildEndpoints() {
        return this.minChildEndpoints == null ? Optional.empty() : Optional.ofNullable(this.minChildEndpoints);
    }

    /**
     * The minimum number of IPv4 (DNS record type A) endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    @InputImport(name="minChildEndpointsIPv4")
    private final @Nullable Double minChildEndpointsIPv4;

    public Optional<Double> getMinChildEndpointsIPv4() {
        return this.minChildEndpointsIPv4 == null ? Optional.empty() : Optional.ofNullable(this.minChildEndpointsIPv4);
    }

    /**
     * The minimum number of IPv6 (DNS record type AAAA) endpoints that must be available in the child profile in order for the parent profile to be considered available. Only applicable to endpoint of type 'NestedEndpoints'.
     * 
     */
    @InputImport(name="minChildEndpointsIPv6")
    private final @Nullable Double minChildEndpointsIPv6;

    public Optional<Double> getMinChildEndpointsIPv6() {
        return this.minChildEndpointsIPv6 == null ? Optional.empty() : Optional.ofNullable(this.minChildEndpointsIPv6);
    }

    /**
     * The name of the resource
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The priority of this endpoint when using the 'Priority' traffic routing method. Possible values are from 1 to 1000, lower values represent higher priority. This is an optional parameter.  If specified, it must be specified on all endpoints, and no two endpoints can share the same priority value.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Double priority;

    public Optional<Double> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * The list of subnets, IP addresses, and/or address ranges mapped to this endpoint when using the 'Subnet' traffic routing method. An empty list will match all ranges not covered by other endpoints.
     * 
     */
    @InputImport(name="subnets")
    private final @Nullable List<EndpointPropertiesResponseSubnets> subnets;

    public List<EndpointPropertiesResponseSubnets> getSubnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }

    /**
     * The fully-qualified DNS name or IP address of the endpoint. Traffic Manager returns this value in DNS responses to direct traffic to this endpoint.
     * 
     */
    @InputImport(name="target")
    private final @Nullable String target;

    public Optional<String> getTarget() {
        return this.target == null ? Optional.empty() : Optional.ofNullable(this.target);
    }

    /**
     * The Azure Resource URI of the of the endpoint. Not applicable to endpoints of type 'ExternalEndpoints'.
     * 
     */
    @InputImport(name="targetResourceId")
    private final @Nullable String targetResourceId;

    public Optional<String> getTargetResourceId() {
        return this.targetResourceId == null ? Optional.empty() : Optional.ofNullable(this.targetResourceId);
    }

    /**
     * The type of the resource. Ex- Microsoft.Network/trafficManagerProfiles.
     * 
     */
    @InputImport(name="type")
    private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * The weight of this endpoint when using the 'Weighted' traffic routing method. Possible values are from 1 to 1000.
     * 
     */
    @InputImport(name="weight")
    private final @Nullable Double weight;

    public Optional<Double> getWeight() {
        return this.weight == null ? Optional.empty() : Optional.ofNullable(this.weight);
    }

    public EndpointResponse(
        @Nullable List<EndpointPropertiesResponseCustomHeaders> customHeaders,
        @Nullable String endpointLocation,
        @Nullable String endpointMonitorStatus,
        @Nullable String endpointStatus,
        @Nullable List<String> geoMapping,
        @Nullable String id,
        @Nullable Double minChildEndpoints,
        @Nullable Double minChildEndpointsIPv4,
        @Nullable Double minChildEndpointsIPv6,
        @Nullable String name,
        @Nullable Double priority,
        @Nullable List<EndpointPropertiesResponseSubnets> subnets,
        @Nullable String target,
        @Nullable String targetResourceId,
        @Nullable String type,
        @Nullable Double weight) {
        this.customHeaders = customHeaders;
        this.endpointLocation = endpointLocation;
        this.endpointMonitorStatus = endpointMonitorStatus;
        this.endpointStatus = endpointStatus;
        this.geoMapping = geoMapping;
        this.id = id;
        this.minChildEndpoints = minChildEndpoints;
        this.minChildEndpointsIPv4 = minChildEndpointsIPv4;
        this.minChildEndpointsIPv6 = minChildEndpointsIPv6;
        this.name = name;
        this.priority = priority;
        this.subnets = subnets;
        this.target = target;
        this.targetResourceId = targetResourceId;
        this.type = type;
        this.weight = weight;
    }

    private EndpointResponse() {
        this.customHeaders = List.of();
        this.endpointLocation = null;
        this.endpointMonitorStatus = null;
        this.endpointStatus = null;
        this.geoMapping = List.of();
        this.id = null;
        this.minChildEndpoints = null;
        this.minChildEndpointsIPv4 = null;
        this.minChildEndpointsIPv6 = null;
        this.name = null;
        this.priority = null;
        this.subnets = List.of();
        this.target = null;
        this.targetResourceId = null;
        this.type = null;
        this.weight = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EndpointPropertiesResponseCustomHeaders> customHeaders;
        private @Nullable String endpointLocation;
        private @Nullable String endpointMonitorStatus;
        private @Nullable String endpointStatus;
        private @Nullable List<String> geoMapping;
        private @Nullable String id;
        private @Nullable Double minChildEndpoints;
        private @Nullable Double minChildEndpointsIPv4;
        private @Nullable Double minChildEndpointsIPv6;
        private @Nullable String name;
        private @Nullable Double priority;
        private @Nullable List<EndpointPropertiesResponseSubnets> subnets;
        private @Nullable String target;
        private @Nullable String targetResourceId;
        private @Nullable String type;
        private @Nullable Double weight;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customHeaders = defaults.customHeaders;
    	      this.endpointLocation = defaults.endpointLocation;
    	      this.endpointMonitorStatus = defaults.endpointMonitorStatus;
    	      this.endpointStatus = defaults.endpointStatus;
    	      this.geoMapping = defaults.geoMapping;
    	      this.id = defaults.id;
    	      this.minChildEndpoints = defaults.minChildEndpoints;
    	      this.minChildEndpointsIPv4 = defaults.minChildEndpointsIPv4;
    	      this.minChildEndpointsIPv6 = defaults.minChildEndpointsIPv6;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.subnets = defaults.subnets;
    	      this.target = defaults.target;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.type = defaults.type;
    	      this.weight = defaults.weight;
        }

        public Builder setCustomHeaders(@Nullable List<EndpointPropertiesResponseCustomHeaders> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }

        public Builder setEndpointLocation(@Nullable String endpointLocation) {
            this.endpointLocation = endpointLocation;
            return this;
        }

        public Builder setEndpointMonitorStatus(@Nullable String endpointMonitorStatus) {
            this.endpointMonitorStatus = endpointMonitorStatus;
            return this;
        }

        public Builder setEndpointStatus(@Nullable String endpointStatus) {
            this.endpointStatus = endpointStatus;
            return this;
        }

        public Builder setGeoMapping(@Nullable List<String> geoMapping) {
            this.geoMapping = geoMapping;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setMinChildEndpoints(@Nullable Double minChildEndpoints) {
            this.minChildEndpoints = minChildEndpoints;
            return this;
        }

        public Builder setMinChildEndpointsIPv4(@Nullable Double minChildEndpointsIPv4) {
            this.minChildEndpointsIPv4 = minChildEndpointsIPv4;
            return this;
        }

        public Builder setMinChildEndpointsIPv6(@Nullable Double minChildEndpointsIPv6) {
            this.minChildEndpointsIPv6 = minChildEndpointsIPv6;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(@Nullable Double priority) {
            this.priority = priority;
            return this;
        }

        public Builder setSubnets(@Nullable List<EndpointPropertiesResponseSubnets> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }

        public Builder setTargetResourceId(@Nullable String targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setWeight(@Nullable Double weight) {
            this.weight = weight;
            return this;
        }

        public EndpointResponse build() {
            return new EndpointResponse(customHeaders, endpointLocation, endpointMonitorStatus, endpointStatus, geoMapping, id, minChildEndpoints, minChildEndpointsIPv4, minChildEndpointsIPv6, name, priority, subnets, target, targetResourceId, type, weight);
        }
    }
}
