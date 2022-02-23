// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ExpressRouteLinkResponse;
import io.pulumi.azurenative.network.outputs.ManagedServiceIdentityResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetExpressRoutePortResult {
    /**
     * Date of the physical port allocation to be used in Letter of Authorization.
     * 
     */
    private final String allocationDate;
    /**
     * Bandwidth of procured ports in Gbps.
     * 
     */
    private final @Nullable Integer bandwidthInGbps;
    /**
     * Reference the ExpressRoute circuit(s) that are provisioned on this ExpressRoutePort resource.
     * 
     */
    private final List<SubResourceResponse> circuits;
    /**
     * Encapsulation method on physical ports.
     * 
     */
    private final @Nullable String encapsulation;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Ether type of the physical port.
     * 
     */
    private final String etherType;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The identity of ExpressRoutePort, if configured.
     * 
     */
    private final @Nullable ManagedServiceIdentityResponse identity;
    /**
     * The set of physical links of the ExpressRoutePort resource.
     * 
     */
    private final @Nullable List<ExpressRouteLinkResponse> links;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Maximum transmission unit of the physical port pair(s).
     * 
     */
    private final String mtu;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The name of the peering location that the ExpressRoutePort is mapped to physically.
     * 
     */
    private final @Nullable String peeringLocation;
    /**
     * Aggregate Gbps of associated circuit bandwidths.
     * 
     */
    private final Double provisionedBandwidthInGbps;
    /**
     * The provisioning state of the express route port resource.
     * 
     */
    private final String provisioningState;
    /**
     * The resource GUID property of the express route port resource.
     * 
     */
    private final String resourceGuid;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"allocationDate","bandwidthInGbps","circuits","encapsulation","etag","etherType","id","identity","links","location","mtu","name","peeringLocation","provisionedBandwidthInGbps","provisioningState","resourceGuid","tags","type"})
    private GetExpressRoutePortResult(
        String allocationDate,
        @Nullable Integer bandwidthInGbps,
        List<SubResourceResponse> circuits,
        @Nullable String encapsulation,
        String etag,
        String etherType,
        @Nullable String id,
        @Nullable ManagedServiceIdentityResponse identity,
        @Nullable List<ExpressRouteLinkResponse> links,
        @Nullable String location,
        String mtu,
        String name,
        @Nullable String peeringLocation,
        Double provisionedBandwidthInGbps,
        String provisioningState,
        String resourceGuid,
        @Nullable Map<String,String> tags,
        String type) {
        this.allocationDate = Objects.requireNonNull(allocationDate);
        this.bandwidthInGbps = bandwidthInGbps;
        this.circuits = Objects.requireNonNull(circuits);
        this.encapsulation = encapsulation;
        this.etag = Objects.requireNonNull(etag);
        this.etherType = Objects.requireNonNull(etherType);
        this.id = id;
        this.identity = identity;
        this.links = links;
        this.location = location;
        this.mtu = Objects.requireNonNull(mtu);
        this.name = Objects.requireNonNull(name);
        this.peeringLocation = peeringLocation;
        this.provisionedBandwidthInGbps = Objects.requireNonNull(provisionedBandwidthInGbps);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.resourceGuid = Objects.requireNonNull(resourceGuid);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Date of the physical port allocation to be used in Letter of Authorization.
     * 
     */
    public String getAllocationDate() {
        return this.allocationDate;
    }
    /**
     * Bandwidth of procured ports in Gbps.
     * 
     */
    public Optional<Integer> getBandwidthInGbps() {
        return Optional.ofNullable(this.bandwidthInGbps);
    }
    /**
     * Reference the ExpressRoute circuit(s) that are provisioned on this ExpressRoutePort resource.
     * 
     */
    public List<SubResourceResponse> getCircuits() {
        return this.circuits;
    }
    /**
     * Encapsulation method on physical ports.
     * 
     */
    public Optional<String> getEncapsulation() {
        return Optional.ofNullable(this.encapsulation);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Ether type of the physical port.
     * 
     */
    public String getEtherType() {
        return this.etherType;
    }
    /**
     * Resource ID.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The identity of ExpressRoutePort, if configured.
     * 
     */
    public Optional<ManagedServiceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The set of physical links of the ExpressRoutePort resource.
     * 
     */
    public List<ExpressRouteLinkResponse> getLinks() {
        return this.links == null ? List.of() : this.links;
    }
    /**
     * Resource location.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Maximum transmission unit of the physical port pair(s).
     * 
     */
    public String getMtu() {
        return this.mtu;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The name of the peering location that the ExpressRoutePort is mapped to physically.
     * 
     */
    public Optional<String> getPeeringLocation() {
        return Optional.ofNullable(this.peeringLocation);
    }
    /**
     * Aggregate Gbps of associated circuit bandwidths.
     * 
     */
    public Double getProvisionedBandwidthInGbps() {
        return this.provisionedBandwidthInGbps;
    }
    /**
     * The provisioning state of the express route port resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource GUID property of the express route port resource.
     * 
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExpressRoutePortResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationDate;
        private @Nullable Integer bandwidthInGbps;
        private List<SubResourceResponse> circuits;
        private @Nullable String encapsulation;
        private String etag;
        private String etherType;
        private @Nullable String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private @Nullable List<ExpressRouteLinkResponse> links;
        private @Nullable String location;
        private String mtu;
        private String name;
        private @Nullable String peeringLocation;
        private Double provisionedBandwidthInGbps;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExpressRoutePortResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationDate = defaults.allocationDate;
    	      this.bandwidthInGbps = defaults.bandwidthInGbps;
    	      this.circuits = defaults.circuits;
    	      this.encapsulation = defaults.encapsulation;
    	      this.etag = defaults.etag;
    	      this.etherType = defaults.etherType;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.links = defaults.links;
    	      this.location = defaults.location;
    	      this.mtu = defaults.mtu;
    	      this.name = defaults.name;
    	      this.peeringLocation = defaults.peeringLocation;
    	      this.provisionedBandwidthInGbps = defaults.provisionedBandwidthInGbps;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAllocationDate(String allocationDate) {
            this.allocationDate = Objects.requireNonNull(allocationDate);
            return this;
        }

        public Builder setBandwidthInGbps(@Nullable Integer bandwidthInGbps) {
            this.bandwidthInGbps = bandwidthInGbps;
            return this;
        }

        public Builder setCircuits(List<SubResourceResponse> circuits) {
            this.circuits = Objects.requireNonNull(circuits);
            return this;
        }

        public Builder setEncapsulation(@Nullable String encapsulation) {
            this.encapsulation = encapsulation;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setEtherType(String etherType) {
            this.etherType = Objects.requireNonNull(etherType);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLinks(@Nullable List<ExpressRouteLinkResponse> links) {
            this.links = links;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setMtu(String mtu) {
            this.mtu = Objects.requireNonNull(mtu);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPeeringLocation(@Nullable String peeringLocation) {
            this.peeringLocation = peeringLocation;
            return this;
        }

        public Builder setProvisionedBandwidthInGbps(Double provisionedBandwidthInGbps) {
            this.provisionedBandwidthInGbps = Objects.requireNonNull(provisionedBandwidthInGbps);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setResourceGuid(String resourceGuid) {
            this.resourceGuid = Objects.requireNonNull(resourceGuid);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetExpressRoutePortResult build() {
            return new GetExpressRoutePortResult(allocationDate, bandwidthInGbps, circuits, encapsulation, etag, etherType, id, identity, links, location, mtu, name, peeringLocation, provisionedBandwidthInGbps, provisioningState, resourceGuid, tags, type);
        }
    }
}
