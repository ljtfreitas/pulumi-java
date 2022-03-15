// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.azurenative.network.inputs.VirtualHubRouteTableArgs;
import io.pulumi.azurenative.network.inputs.VirtualHubRouteTableV2Args;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualHubArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualHubArgs Empty = new VirtualHubArgs();

    /**
     * Address-prefix for this VirtualHub.
     * 
     */
    @Import(name="addressPrefix")
      private final @Nullable Output<String> addressPrefix;

    public Output<String> getAddressPrefix() {
        return this.addressPrefix == null ? Output.empty() : this.addressPrefix;
    }

    /**
     * Flag to control transit for VirtualRouter hub.
     * 
     */
    @Import(name="allowBranchToBranchTraffic")
      private final @Nullable Output<Boolean> allowBranchToBranchTraffic;

    public Output<Boolean> getAllowBranchToBranchTraffic() {
        return this.allowBranchToBranchTraffic == null ? Output.empty() : this.allowBranchToBranchTraffic;
    }

    /**
     * The azureFirewall associated with this VirtualHub.
     * 
     */
    @Import(name="azureFirewall")
      private final @Nullable Output<SubResourceArgs> azureFirewall;

    public Output<SubResourceArgs> getAzureFirewall() {
        return this.azureFirewall == null ? Output.empty() : this.azureFirewall;
    }

    /**
     * The expressRouteGateway associated with this VirtualHub.
     * 
     */
    @Import(name="expressRouteGateway")
      private final @Nullable Output<SubResourceArgs> expressRouteGateway;

    public Output<SubResourceArgs> getExpressRouteGateway() {
        return this.expressRouteGateway == null ? Output.empty() : this.expressRouteGateway;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The P2SVpnGateway associated with this VirtualHub.
     * 
     */
    @Import(name="p2SVpnGateway")
      private final @Nullable Output<SubResourceArgs> p2SVpnGateway;

    public Output<SubResourceArgs> getP2SVpnGateway() {
        return this.p2SVpnGateway == null ? Output.empty() : this.p2SVpnGateway;
    }

    /**
     * The resource group name of the VirtualHub.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The routeTable associated with this virtual hub.
     * 
     */
    @Import(name="routeTable")
      private final @Nullable Output<VirtualHubRouteTableArgs> routeTable;

    public Output<VirtualHubRouteTableArgs> getRouteTable() {
        return this.routeTable == null ? Output.empty() : this.routeTable;
    }

    /**
     * The securityPartnerProvider associated with this VirtualHub.
     * 
     */
    @Import(name="securityPartnerProvider")
      private final @Nullable Output<SubResourceArgs> securityPartnerProvider;

    public Output<SubResourceArgs> getSecurityPartnerProvider() {
        return this.securityPartnerProvider == null ? Output.empty() : this.securityPartnerProvider;
    }

    /**
     * The Security Provider name.
     * 
     */
    @Import(name="securityProviderName")
      private final @Nullable Output<String> securityProviderName;

    public Output<String> getSecurityProviderName() {
        return this.securityProviderName == null ? Output.empty() : this.securityProviderName;
    }

    /**
     * The sku of this VirtualHub.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<String> sku;

    public Output<String> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The name of the VirtualHub.
     * 
     */
    @Import(name="virtualHubName")
      private final @Nullable Output<String> virtualHubName;

    public Output<String> getVirtualHubName() {
        return this.virtualHubName == null ? Output.empty() : this.virtualHubName;
    }

    /**
     * List of all virtual hub route table v2s associated with this VirtualHub.
     * 
     */
    @Import(name="virtualHubRouteTableV2s")
      private final @Nullable Output<List<VirtualHubRouteTableV2Args>> virtualHubRouteTableV2s;

    public Output<List<VirtualHubRouteTableV2Args>> getVirtualHubRouteTableV2s() {
        return this.virtualHubRouteTableV2s == null ? Output.empty() : this.virtualHubRouteTableV2s;
    }

    /**
     * VirtualRouter ASN.
     * 
     */
    @Import(name="virtualRouterAsn")
      private final @Nullable Output<Double> virtualRouterAsn;

    public Output<Double> getVirtualRouterAsn() {
        return this.virtualRouterAsn == null ? Output.empty() : this.virtualRouterAsn;
    }

    /**
     * VirtualRouter IPs.
     * 
     */
    @Import(name="virtualRouterIps")
      private final @Nullable Output<List<String>> virtualRouterIps;

    public Output<List<String>> getVirtualRouterIps() {
        return this.virtualRouterIps == null ? Output.empty() : this.virtualRouterIps;
    }

    /**
     * The VirtualWAN to which the VirtualHub belongs.
     * 
     */
    @Import(name="virtualWan")
      private final @Nullable Output<SubResourceArgs> virtualWan;

    public Output<SubResourceArgs> getVirtualWan() {
        return this.virtualWan == null ? Output.empty() : this.virtualWan;
    }

    /**
     * The VpnGateway associated with this VirtualHub.
     * 
     */
    @Import(name="vpnGateway")
      private final @Nullable Output<SubResourceArgs> vpnGateway;

    public Output<SubResourceArgs> getVpnGateway() {
        return this.vpnGateway == null ? Output.empty() : this.vpnGateway;
    }

    public VirtualHubArgs(
        @Nullable Output<String> addressPrefix,
        @Nullable Output<Boolean> allowBranchToBranchTraffic,
        @Nullable Output<SubResourceArgs> azureFirewall,
        @Nullable Output<SubResourceArgs> expressRouteGateway,
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        @Nullable Output<SubResourceArgs> p2SVpnGateway,
        Output<String> resourceGroupName,
        @Nullable Output<VirtualHubRouteTableArgs> routeTable,
        @Nullable Output<SubResourceArgs> securityPartnerProvider,
        @Nullable Output<String> securityProviderName,
        @Nullable Output<String> sku,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> virtualHubName,
        @Nullable Output<List<VirtualHubRouteTableV2Args>> virtualHubRouteTableV2s,
        @Nullable Output<Double> virtualRouterAsn,
        @Nullable Output<List<String>> virtualRouterIps,
        @Nullable Output<SubResourceArgs> virtualWan,
        @Nullable Output<SubResourceArgs> vpnGateway) {
        this.addressPrefix = addressPrefix;
        this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
        this.azureFirewall = azureFirewall;
        this.expressRouteGateway = expressRouteGateway;
        this.id = id;
        this.location = location;
        this.p2SVpnGateway = p2SVpnGateway;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routeTable = routeTable;
        this.securityPartnerProvider = securityPartnerProvider;
        this.securityProviderName = securityProviderName;
        this.sku = sku;
        this.tags = tags;
        this.virtualHubName = virtualHubName;
        this.virtualHubRouteTableV2s = virtualHubRouteTableV2s;
        this.virtualRouterAsn = virtualRouterAsn;
        this.virtualRouterIps = virtualRouterIps;
        this.virtualWan = virtualWan;
        this.vpnGateway = vpnGateway;
    }

    private VirtualHubArgs() {
        this.addressPrefix = Output.empty();
        this.allowBranchToBranchTraffic = Output.empty();
        this.azureFirewall = Output.empty();
        this.expressRouteGateway = Output.empty();
        this.id = Output.empty();
        this.location = Output.empty();
        this.p2SVpnGateway = Output.empty();
        this.resourceGroupName = Output.empty();
        this.routeTable = Output.empty();
        this.securityPartnerProvider = Output.empty();
        this.securityProviderName = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
        this.virtualHubName = Output.empty();
        this.virtualHubRouteTableV2s = Output.empty();
        this.virtualRouterAsn = Output.empty();
        this.virtualRouterIps = Output.empty();
        this.virtualWan = Output.empty();
        this.vpnGateway = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> addressPrefix;
        private @Nullable Output<Boolean> allowBranchToBranchTraffic;
        private @Nullable Output<SubResourceArgs> azureFirewall;
        private @Nullable Output<SubResourceArgs> expressRouteGateway;
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private @Nullable Output<SubResourceArgs> p2SVpnGateway;
        private Output<String> resourceGroupName;
        private @Nullable Output<VirtualHubRouteTableArgs> routeTable;
        private @Nullable Output<SubResourceArgs> securityPartnerProvider;
        private @Nullable Output<String> securityProviderName;
        private @Nullable Output<String> sku;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> virtualHubName;
        private @Nullable Output<List<VirtualHubRouteTableV2Args>> virtualHubRouteTableV2s;
        private @Nullable Output<Double> virtualRouterAsn;
        private @Nullable Output<List<String>> virtualRouterIps;
        private @Nullable Output<SubResourceArgs> virtualWan;
        private @Nullable Output<SubResourceArgs> vpnGateway;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
    	      this.allowBranchToBranchTraffic = defaults.allowBranchToBranchTraffic;
    	      this.azureFirewall = defaults.azureFirewall;
    	      this.expressRouteGateway = defaults.expressRouteGateway;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.p2SVpnGateway = defaults.p2SVpnGateway;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routeTable = defaults.routeTable;
    	      this.securityPartnerProvider = defaults.securityPartnerProvider;
    	      this.securityProviderName = defaults.securityProviderName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.virtualHubName = defaults.virtualHubName;
    	      this.virtualHubRouteTableV2s = defaults.virtualHubRouteTableV2s;
    	      this.virtualRouterAsn = defaults.virtualRouterAsn;
    	      this.virtualRouterIps = defaults.virtualRouterIps;
    	      this.virtualWan = defaults.virtualWan;
    	      this.vpnGateway = defaults.vpnGateway;
        }

        public Builder addressPrefix(@Nullable Output<String> addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder addressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = Output.ofNullable(addressPrefix);
            return this;
        }

        public Builder allowBranchToBranchTraffic(@Nullable Output<Boolean> allowBranchToBranchTraffic) {
            this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
            return this;
        }

        public Builder allowBranchToBranchTraffic(@Nullable Boolean allowBranchToBranchTraffic) {
            this.allowBranchToBranchTraffic = Output.ofNullable(allowBranchToBranchTraffic);
            return this;
        }

        public Builder azureFirewall(@Nullable Output<SubResourceArgs> azureFirewall) {
            this.azureFirewall = azureFirewall;
            return this;
        }

        public Builder azureFirewall(@Nullable SubResourceArgs azureFirewall) {
            this.azureFirewall = Output.ofNullable(azureFirewall);
            return this;
        }

        public Builder expressRouteGateway(@Nullable Output<SubResourceArgs> expressRouteGateway) {
            this.expressRouteGateway = expressRouteGateway;
            return this;
        }

        public Builder expressRouteGateway(@Nullable SubResourceArgs expressRouteGateway) {
            this.expressRouteGateway = Output.ofNullable(expressRouteGateway);
            return this;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder p2SVpnGateway(@Nullable Output<SubResourceArgs> p2SVpnGateway) {
            this.p2SVpnGateway = p2SVpnGateway;
            return this;
        }

        public Builder p2SVpnGateway(@Nullable SubResourceArgs p2SVpnGateway) {
            this.p2SVpnGateway = Output.ofNullable(p2SVpnGateway);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder routeTable(@Nullable Output<VirtualHubRouteTableArgs> routeTable) {
            this.routeTable = routeTable;
            return this;
        }

        public Builder routeTable(@Nullable VirtualHubRouteTableArgs routeTable) {
            this.routeTable = Output.ofNullable(routeTable);
            return this;
        }

        public Builder securityPartnerProvider(@Nullable Output<SubResourceArgs> securityPartnerProvider) {
            this.securityPartnerProvider = securityPartnerProvider;
            return this;
        }

        public Builder securityPartnerProvider(@Nullable SubResourceArgs securityPartnerProvider) {
            this.securityPartnerProvider = Output.ofNullable(securityPartnerProvider);
            return this;
        }

        public Builder securityProviderName(@Nullable Output<String> securityProviderName) {
            this.securityProviderName = securityProviderName;
            return this;
        }

        public Builder securityProviderName(@Nullable String securityProviderName) {
            this.securityProviderName = Output.ofNullable(securityProviderName);
            return this;
        }

        public Builder sku(@Nullable Output<String> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable String sku) {
            this.sku = Output.ofNullable(sku);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder virtualHubName(@Nullable Output<String> virtualHubName) {
            this.virtualHubName = virtualHubName;
            return this;
        }

        public Builder virtualHubName(@Nullable String virtualHubName) {
            this.virtualHubName = Output.ofNullable(virtualHubName);
            return this;
        }

        public Builder virtualHubRouteTableV2s(@Nullable Output<List<VirtualHubRouteTableV2Args>> virtualHubRouteTableV2s) {
            this.virtualHubRouteTableV2s = virtualHubRouteTableV2s;
            return this;
        }

        public Builder virtualHubRouteTableV2s(@Nullable List<VirtualHubRouteTableV2Args> virtualHubRouteTableV2s) {
            this.virtualHubRouteTableV2s = Output.ofNullable(virtualHubRouteTableV2s);
            return this;
        }

        public Builder virtualRouterAsn(@Nullable Output<Double> virtualRouterAsn) {
            this.virtualRouterAsn = virtualRouterAsn;
            return this;
        }

        public Builder virtualRouterAsn(@Nullable Double virtualRouterAsn) {
            this.virtualRouterAsn = Output.ofNullable(virtualRouterAsn);
            return this;
        }

        public Builder virtualRouterIps(@Nullable Output<List<String>> virtualRouterIps) {
            this.virtualRouterIps = virtualRouterIps;
            return this;
        }

        public Builder virtualRouterIps(@Nullable List<String> virtualRouterIps) {
            this.virtualRouterIps = Output.ofNullable(virtualRouterIps);
            return this;
        }

        public Builder virtualWan(@Nullable Output<SubResourceArgs> virtualWan) {
            this.virtualWan = virtualWan;
            return this;
        }

        public Builder virtualWan(@Nullable SubResourceArgs virtualWan) {
            this.virtualWan = Output.ofNullable(virtualWan);
            return this;
        }

        public Builder vpnGateway(@Nullable Output<SubResourceArgs> vpnGateway) {
            this.vpnGateway = vpnGateway;
            return this;
        }

        public Builder vpnGateway(@Nullable SubResourceArgs vpnGateway) {
            this.vpnGateway = Output.ofNullable(vpnGateway);
            return this;
        }
        public VirtualHubArgs build() {
            return new VirtualHubArgs(addressPrefix, allowBranchToBranchTraffic, azureFirewall, expressRouteGateway, id, location, p2SVpnGateway, resourceGroupName, routeTable, securityPartnerProvider, securityProviderName, sku, tags, virtualHubName, virtualHubRouteTableV2s, virtualRouterAsn, virtualRouterIps, virtualWan, vpnGateway);
        }
    }
}
