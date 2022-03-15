// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.azurenative.network.outputs.VirtualHubRouteTableResponse;
import io.pulumi.azurenative.network.outputs.VirtualHubRouteTableV2Response;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualHubResult {
    /**
     * Address-prefix for this VirtualHub.
     * 
     */
    private final @Nullable String addressPrefix;
    /**
     * Flag to control transit for VirtualRouter hub.
     * 
     */
    private final @Nullable Boolean allowBranchToBranchTraffic;
    /**
     * The azureFirewall associated with this VirtualHub.
     * 
     */
    private final @Nullable SubResourceResponse azureFirewall;
    /**
     * List of references to Bgp Connections.
     * 
     */
    private final List<SubResourceResponse> bgpConnections;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The expressRouteGateway associated with this VirtualHub.
     * 
     */
    private final @Nullable SubResourceResponse expressRouteGateway;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * List of references to IpConfigurations.
     * 
     */
    private final List<SubResourceResponse> ipConfigurations;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The P2SVpnGateway associated with this VirtualHub.
     * 
     */
    private final @Nullable SubResourceResponse p2SVpnGateway;
    /**
     * The provisioning state of the virtual hub resource.
     * 
     */
    private final String provisioningState;
    /**
     * The routeTable associated with this virtual hub.
     * 
     */
    private final @Nullable VirtualHubRouteTableResponse routeTable;
    /**
     * The routing state.
     * 
     */
    private final String routingState;
    /**
     * The securityPartnerProvider associated with this VirtualHub.
     * 
     */
    private final @Nullable SubResourceResponse securityPartnerProvider;
    /**
     * The Security Provider name.
     * 
     */
    private final @Nullable String securityProviderName;
    /**
     * The sku of this VirtualHub.
     * 
     */
    private final @Nullable String sku;
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
    /**
     * List of all virtual hub route table v2s associated with this VirtualHub.
     * 
     */
    private final @Nullable List<VirtualHubRouteTableV2Response> virtualHubRouteTableV2s;
    /**
     * VirtualRouter ASN.
     * 
     */
    private final @Nullable Double virtualRouterAsn;
    /**
     * VirtualRouter IPs.
     * 
     */
    private final @Nullable List<String> virtualRouterIps;
    /**
     * The VirtualWAN to which the VirtualHub belongs.
     * 
     */
    private final @Nullable SubResourceResponse virtualWan;
    /**
     * The VpnGateway associated with this VirtualHub.
     * 
     */
    private final @Nullable SubResourceResponse vpnGateway;

    @CustomType.Constructor
    private GetVirtualHubResult(
        @CustomType.Parameter("addressPrefix") @Nullable String addressPrefix,
        @CustomType.Parameter("allowBranchToBranchTraffic") @Nullable Boolean allowBranchToBranchTraffic,
        @CustomType.Parameter("azureFirewall") @Nullable SubResourceResponse azureFirewall,
        @CustomType.Parameter("bgpConnections") List<SubResourceResponse> bgpConnections,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("expressRouteGateway") @Nullable SubResourceResponse expressRouteGateway,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ipConfigurations") List<SubResourceResponse> ipConfigurations,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("p2SVpnGateway") @Nullable SubResourceResponse p2SVpnGateway,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("routeTable") @Nullable VirtualHubRouteTableResponse routeTable,
        @CustomType.Parameter("routingState") String routingState,
        @CustomType.Parameter("securityPartnerProvider") @Nullable SubResourceResponse securityPartnerProvider,
        @CustomType.Parameter("securityProviderName") @Nullable String securityProviderName,
        @CustomType.Parameter("sku") @Nullable String sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualHubRouteTableV2s") @Nullable List<VirtualHubRouteTableV2Response> virtualHubRouteTableV2s,
        @CustomType.Parameter("virtualRouterAsn") @Nullable Double virtualRouterAsn,
        @CustomType.Parameter("virtualRouterIps") @Nullable List<String> virtualRouterIps,
        @CustomType.Parameter("virtualWan") @Nullable SubResourceResponse virtualWan,
        @CustomType.Parameter("vpnGateway") @Nullable SubResourceResponse vpnGateway) {
        this.addressPrefix = addressPrefix;
        this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
        this.azureFirewall = azureFirewall;
        this.bgpConnections = bgpConnections;
        this.etag = etag;
        this.expressRouteGateway = expressRouteGateway;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.location = location;
        this.name = name;
        this.p2SVpnGateway = p2SVpnGateway;
        this.provisioningState = provisioningState;
        this.routeTable = routeTable;
        this.routingState = routingState;
        this.securityPartnerProvider = securityPartnerProvider;
        this.securityProviderName = securityProviderName;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.virtualHubRouteTableV2s = virtualHubRouteTableV2s;
        this.virtualRouterAsn = virtualRouterAsn;
        this.virtualRouterIps = virtualRouterIps;
        this.virtualWan = virtualWan;
        this.vpnGateway = vpnGateway;
    }

    /**
     * Address-prefix for this VirtualHub.
     * 
    */
    public Optional<String> getAddressPrefix() {
        return Optional.ofNullable(this.addressPrefix);
    }
    /**
     * Flag to control transit for VirtualRouter hub.
     * 
    */
    public Optional<Boolean> getAllowBranchToBranchTraffic() {
        return Optional.ofNullable(this.allowBranchToBranchTraffic);
    }
    /**
     * The azureFirewall associated with this VirtualHub.
     * 
    */
    public Optional<SubResourceResponse> getAzureFirewall() {
        return Optional.ofNullable(this.azureFirewall);
    }
    /**
     * List of references to Bgp Connections.
     * 
    */
    public List<SubResourceResponse> getBgpConnections() {
        return this.bgpConnections;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The expressRouteGateway associated with this VirtualHub.
     * 
    */
    public Optional<SubResourceResponse> getExpressRouteGateway() {
        return Optional.ofNullable(this.expressRouteGateway);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * List of references to IpConfigurations.
     * 
    */
    public List<SubResourceResponse> getIpConfigurations() {
        return this.ipConfigurations;
    }
    /**
     * Resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The P2SVpnGateway associated with this VirtualHub.
     * 
    */
    public Optional<SubResourceResponse> getP2SVpnGateway() {
        return Optional.ofNullable(this.p2SVpnGateway);
    }
    /**
     * The provisioning state of the virtual hub resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The routeTable associated with this virtual hub.
     * 
    */
    public Optional<VirtualHubRouteTableResponse> getRouteTable() {
        return Optional.ofNullable(this.routeTable);
    }
    /**
     * The routing state.
     * 
    */
    public String getRoutingState() {
        return this.routingState;
    }
    /**
     * The securityPartnerProvider associated with this VirtualHub.
     * 
    */
    public Optional<SubResourceResponse> getSecurityPartnerProvider() {
        return Optional.ofNullable(this.securityPartnerProvider);
    }
    /**
     * The Security Provider name.
     * 
    */
    public Optional<String> getSecurityProviderName() {
        return Optional.ofNullable(this.securityProviderName);
    }
    /**
     * The sku of this VirtualHub.
     * 
    */
    public Optional<String> getSku() {
        return Optional.ofNullable(this.sku);
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
    /**
     * List of all virtual hub route table v2s associated with this VirtualHub.
     * 
    */
    public List<VirtualHubRouteTableV2Response> getVirtualHubRouteTableV2s() {
        return this.virtualHubRouteTableV2s == null ? List.of() : this.virtualHubRouteTableV2s;
    }
    /**
     * VirtualRouter ASN.
     * 
    */
    public Optional<Double> getVirtualRouterAsn() {
        return Optional.ofNullable(this.virtualRouterAsn);
    }
    /**
     * VirtualRouter IPs.
     * 
    */
    public List<String> getVirtualRouterIps() {
        return this.virtualRouterIps == null ? List.of() : this.virtualRouterIps;
    }
    /**
     * The VirtualWAN to which the VirtualHub belongs.
     * 
    */
    public Optional<SubResourceResponse> getVirtualWan() {
        return Optional.ofNullable(this.virtualWan);
    }
    /**
     * The VpnGateway associated with this VirtualHub.
     * 
    */
    public Optional<SubResourceResponse> getVpnGateway() {
        return Optional.ofNullable(this.vpnGateway);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualHubResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String addressPrefix;
        private @Nullable Boolean allowBranchToBranchTraffic;
        private @Nullable SubResourceResponse azureFirewall;
        private List<SubResourceResponse> bgpConnections;
        private String etag;
        private @Nullable SubResourceResponse expressRouteGateway;
        private @Nullable String id;
        private List<SubResourceResponse> ipConfigurations;
        private String location;
        private String name;
        private @Nullable SubResourceResponse p2SVpnGateway;
        private String provisioningState;
        private @Nullable VirtualHubRouteTableResponse routeTable;
        private String routingState;
        private @Nullable SubResourceResponse securityPartnerProvider;
        private @Nullable String securityProviderName;
        private @Nullable String sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<VirtualHubRouteTableV2Response> virtualHubRouteTableV2s;
        private @Nullable Double virtualRouterAsn;
        private @Nullable List<String> virtualRouterIps;
        private @Nullable SubResourceResponse virtualWan;
        private @Nullable SubResourceResponse vpnGateway;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualHubResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.allowBranchToBranchTraffic = defaults.allowBranchToBranchTraffic;
    	      this.azureFirewall = defaults.azureFirewall;
    	      this.bgpConnections = defaults.bgpConnections;
    	      this.etag = defaults.etag;
    	      this.expressRouteGateway = defaults.expressRouteGateway;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.p2SVpnGateway = defaults.p2SVpnGateway;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routeTable = defaults.routeTable;
    	      this.routingState = defaults.routingState;
    	      this.securityPartnerProvider = defaults.securityPartnerProvider;
    	      this.securityProviderName = defaults.securityProviderName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualHubRouteTableV2s = defaults.virtualHubRouteTableV2s;
    	      this.virtualRouterAsn = defaults.virtualRouterAsn;
    	      this.virtualRouterIps = defaults.virtualRouterIps;
    	      this.virtualWan = defaults.virtualWan;
    	      this.vpnGateway = defaults.vpnGateway;
        }

        public Builder addressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder allowBranchToBranchTraffic(@Nullable Boolean allowBranchToBranchTraffic) {
            this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
            return this;
        }

        public Builder azureFirewall(@Nullable SubResourceResponse azureFirewall) {
            this.azureFirewall = azureFirewall;
            return this;
        }

        public Builder bgpConnections(List<SubResourceResponse> bgpConnections) {
            this.bgpConnections = Objects.requireNonNull(bgpConnections);
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder expressRouteGateway(@Nullable SubResourceResponse expressRouteGateway) {
            this.expressRouteGateway = expressRouteGateway;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder ipConfigurations(List<SubResourceResponse> ipConfigurations) {
            this.ipConfigurations = Objects.requireNonNull(ipConfigurations);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder p2SVpnGateway(@Nullable SubResourceResponse p2SVpnGateway) {
            this.p2SVpnGateway = p2SVpnGateway;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder routeTable(@Nullable VirtualHubRouteTableResponse routeTable) {
            this.routeTable = routeTable;
            return this;
        }

        public Builder routingState(String routingState) {
            this.routingState = Objects.requireNonNull(routingState);
            return this;
        }

        public Builder securityPartnerProvider(@Nullable SubResourceResponse securityPartnerProvider) {
            this.securityPartnerProvider = securityPartnerProvider;
            return this;
        }

        public Builder securityProviderName(@Nullable String securityProviderName) {
            this.securityProviderName = securityProviderName;
            return this;
        }

        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder virtualHubRouteTableV2s(@Nullable List<VirtualHubRouteTableV2Response> virtualHubRouteTableV2s) {
            this.virtualHubRouteTableV2s = virtualHubRouteTableV2s;
            return this;
        }

        public Builder virtualRouterAsn(@Nullable Double virtualRouterAsn) {
            this.virtualRouterAsn = virtualRouterAsn;
            return this;
        }

        public Builder virtualRouterIps(@Nullable List<String> virtualRouterIps) {
            this.virtualRouterIps = virtualRouterIps;
            return this;
        }

        public Builder virtualWan(@Nullable SubResourceResponse virtualWan) {
            this.virtualWan = virtualWan;
            return this;
        }

        public Builder vpnGateway(@Nullable SubResourceResponse vpnGateway) {
            this.vpnGateway = vpnGateway;
            return this;
        }
        public GetVirtualHubResult build() {
            return new GetVirtualHubResult(addressPrefix, allowBranchToBranchTraffic, azureFirewall, bgpConnections, etag, expressRouteGateway, id, ipConfigurations, location, name, p2SVpnGateway, provisioningState, routeTable, routingState, securityPartnerProvider, securityProviderName, sku, tags, type, virtualHubRouteTableV2s, virtualRouterAsn, virtualRouterIps, virtualWan, vpnGateway);
        }
    }
}
