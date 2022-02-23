// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.AddressSpaceResponse;
import io.pulumi.azurenative.network.inputs.BgpSettingsResponse;
import io.pulumi.azurenative.network.inputs.ExtendedLocationResponse;
import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.azurenative.network.inputs.VirtualNetworkGatewayIPConfigurationResponse;
import io.pulumi.azurenative.network.inputs.VirtualNetworkGatewaySkuResponse;
import io.pulumi.azurenative.network.inputs.VpnClientConfigurationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A common class for general resource information.
 * 
 */
public final class VirtualNetworkGatewayResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkGatewayResponse Empty = new VirtualNetworkGatewayResponse();

    /**
     * ActiveActive flag.
     * 
     */
    @InputImport(name="activeActive")
        private final @Nullable Boolean activeActive;

    public Optional<Boolean> getActiveActive() {
        return this.activeActive == null ? Optional.empty() : Optional.ofNullable(this.activeActive);
    }

    /**
     * Virtual network gateway's BGP speaker settings.
     * 
     */
    @InputImport(name="bgpSettings")
        private final @Nullable BgpSettingsResponse bgpSettings;

    public Optional<BgpSettingsResponse> getBgpSettings() {
        return this.bgpSettings == null ? Optional.empty() : Optional.ofNullable(this.bgpSettings);
    }

    /**
     * The reference to the address space resource which represents the custom routes address space specified by the customer for virtual network gateway and VpnClient.
     * 
     */
    @InputImport(name="customRoutes")
        private final @Nullable AddressSpaceResponse customRoutes;

    public Optional<AddressSpaceResponse> getCustomRoutes() {
        return this.customRoutes == null ? Optional.empty() : Optional.ofNullable(this.customRoutes);
    }

    /**
     * Whether BGP is enabled for this virtual network gateway or not.
     * 
     */
    @InputImport(name="enableBgp")
        private final @Nullable Boolean enableBgp;

    public Optional<Boolean> getEnableBgp() {
        return this.enableBgp == null ? Optional.empty() : Optional.ofNullable(this.enableBgp);
    }

    /**
     * Whether dns forwarding is enabled or not.
     * 
     */
    @InputImport(name="enableDnsForwarding")
        private final @Nullable Boolean enableDnsForwarding;

    public Optional<Boolean> getEnableDnsForwarding() {
        return this.enableDnsForwarding == null ? Optional.empty() : Optional.ofNullable(this.enableDnsForwarding);
    }

    /**
     * Whether private IP needs to be enabled on this gateway for connections or not.
     * 
     */
    @InputImport(name="enablePrivateIpAddress")
        private final @Nullable Boolean enablePrivateIpAddress;

    public Optional<Boolean> getEnablePrivateIpAddress() {
        return this.enablePrivateIpAddress == null ? Optional.empty() : Optional.ofNullable(this.enablePrivateIpAddress);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
        private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * The extended location of type local virtual network gateway.
     * 
     */
    @InputImport(name="extendedLocation")
        private final @Nullable ExtendedLocationResponse extendedLocation;

    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return this.extendedLocation == null ? Optional.empty() : Optional.ofNullable(this.extendedLocation);
    }

    /**
     * The reference to the LocalNetworkGateway resource which represents local network site having default routes. Assign Null value in case of removing existing default site setting.
     * 
     */
    @InputImport(name="gatewayDefaultSite")
        private final @Nullable SubResourceResponse gatewayDefaultSite;

    public Optional<SubResourceResponse> getGatewayDefaultSite() {
        return this.gatewayDefaultSite == null ? Optional.empty() : Optional.ofNullable(this.gatewayDefaultSite);
    }

    /**
     * The type of this virtual network gateway.
     * 
     */
    @InputImport(name="gatewayType")
        private final @Nullable String gatewayType;

    public Optional<String> getGatewayType() {
        return this.gatewayType == null ? Optional.empty() : Optional.ofNullable(this.gatewayType);
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
        private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The IP address allocated by the gateway to which dns requests can be sent.
     * 
     */
    @InputImport(name="inboundDnsForwardingEndpoint", required=true)
        private final String inboundDnsForwardingEndpoint;

    public String getInboundDnsForwardingEndpoint() {
        return this.inboundDnsForwardingEndpoint;
    }

    /**
     * IP configurations for virtual network gateway.
     * 
     */
    @InputImport(name="ipConfigurations")
        private final @Nullable List<VirtualNetworkGatewayIPConfigurationResponse> ipConfigurations;

    public List<VirtualNetworkGatewayIPConfigurationResponse> getIpConfigurations() {
        return this.ipConfigurations == null ? List.of() : this.ipConfigurations;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
        private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * Resource name.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The provisioning state of the virtual network gateway resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
        private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The resource GUID property of the virtual network gateway resource.
     * 
     */
    @InputImport(name="resourceGuid", required=true)
        private final String resourceGuid;

    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected for Virtual network gateway.
     * 
     */
    @InputImport(name="sku")
        private final @Nullable VirtualNetworkGatewaySkuResponse sku;

    public Optional<VirtualNetworkGatewaySkuResponse> getSku() {
        return this.sku == null ? Optional.empty() : Optional.ofNullable(this.sku);
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * Resource type.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Customer vnet resource id. VirtualNetworkGateway of type local gateway is associated with the customer vnet.
     * 
     */
    @InputImport(name="vNetExtendedLocationResourceId")
        private final @Nullable String vNetExtendedLocationResourceId;

    public Optional<String> getVNetExtendedLocationResourceId() {
        return this.vNetExtendedLocationResourceId == null ? Optional.empty() : Optional.ofNullable(this.vNetExtendedLocationResourceId);
    }

    /**
     * The reference to the VpnClientConfiguration resource which represents the P2S VpnClient configurations.
     * 
     */
    @InputImport(name="vpnClientConfiguration")
        private final @Nullable VpnClientConfigurationResponse vpnClientConfiguration;

    public Optional<VpnClientConfigurationResponse> getVpnClientConfiguration() {
        return this.vpnClientConfiguration == null ? Optional.empty() : Optional.ofNullable(this.vpnClientConfiguration);
    }

    /**
     * The generation for this VirtualNetworkGateway. Must be None if gatewayType is not VPN.
     * 
     */
    @InputImport(name="vpnGatewayGeneration")
        private final @Nullable String vpnGatewayGeneration;

    public Optional<String> getVpnGatewayGeneration() {
        return this.vpnGatewayGeneration == null ? Optional.empty() : Optional.ofNullable(this.vpnGatewayGeneration);
    }

    /**
     * The type of this virtual network gateway.
     * 
     */
    @InputImport(name="vpnType")
        private final @Nullable String vpnType;

    public Optional<String> getVpnType() {
        return this.vpnType == null ? Optional.empty() : Optional.ofNullable(this.vpnType);
    }

    public VirtualNetworkGatewayResponse(
        @Nullable Boolean activeActive,
        @Nullable BgpSettingsResponse bgpSettings,
        @Nullable AddressSpaceResponse customRoutes,
        @Nullable Boolean enableBgp,
        @Nullable Boolean enableDnsForwarding,
        @Nullable Boolean enablePrivateIpAddress,
        String etag,
        @Nullable ExtendedLocationResponse extendedLocation,
        @Nullable SubResourceResponse gatewayDefaultSite,
        @Nullable String gatewayType,
        @Nullable String id,
        String inboundDnsForwardingEndpoint,
        @Nullable List<VirtualNetworkGatewayIPConfigurationResponse> ipConfigurations,
        @Nullable String location,
        String name,
        String provisioningState,
        String resourceGuid,
        @Nullable VirtualNetworkGatewaySkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable String vNetExtendedLocationResourceId,
        @Nullable VpnClientConfigurationResponse vpnClientConfiguration,
        @Nullable String vpnGatewayGeneration,
        @Nullable String vpnType) {
        this.activeActive = activeActive;
        this.bgpSettings = bgpSettings;
        this.customRoutes = customRoutes;
        this.enableBgp = enableBgp;
        this.enableDnsForwarding = enableDnsForwarding;
        this.enablePrivateIpAddress = enablePrivateIpAddress;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.extendedLocation = extendedLocation;
        this.gatewayDefaultSite = gatewayDefaultSite;
        this.gatewayType = gatewayType;
        this.id = id;
        this.inboundDnsForwardingEndpoint = Objects.requireNonNull(inboundDnsForwardingEndpoint, "expected parameter 'inboundDnsForwardingEndpoint' to be non-null");
        this.ipConfigurations = ipConfigurations;
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.resourceGuid = Objects.requireNonNull(resourceGuid, "expected parameter 'resourceGuid' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.vNetExtendedLocationResourceId = vNetExtendedLocationResourceId;
        this.vpnClientConfiguration = vpnClientConfiguration;
        this.vpnGatewayGeneration = vpnGatewayGeneration;
        this.vpnType = vpnType;
    }

    private VirtualNetworkGatewayResponse() {
        this.activeActive = null;
        this.bgpSettings = null;
        this.customRoutes = null;
        this.enableBgp = null;
        this.enableDnsForwarding = null;
        this.enablePrivateIpAddress = null;
        this.etag = null;
        this.extendedLocation = null;
        this.gatewayDefaultSite = null;
        this.gatewayType = null;
        this.id = null;
        this.inboundDnsForwardingEndpoint = null;
        this.ipConfigurations = List.of();
        this.location = null;
        this.name = null;
        this.provisioningState = null;
        this.resourceGuid = null;
        this.sku = null;
        this.tags = Map.of();
        this.type = null;
        this.vNetExtendedLocationResourceId = null;
        this.vpnClientConfiguration = null;
        this.vpnGatewayGeneration = null;
        this.vpnType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkGatewayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean activeActive;
        private @Nullable BgpSettingsResponse bgpSettings;
        private @Nullable AddressSpaceResponse customRoutes;
        private @Nullable Boolean enableBgp;
        private @Nullable Boolean enableDnsForwarding;
        private @Nullable Boolean enablePrivateIpAddress;
        private String etag;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private @Nullable SubResourceResponse gatewayDefaultSite;
        private @Nullable String gatewayType;
        private @Nullable String id;
        private String inboundDnsForwardingEndpoint;
        private @Nullable List<VirtualNetworkGatewayIPConfigurationResponse> ipConfigurations;
        private @Nullable String location;
        private String name;
        private String provisioningState;
        private String resourceGuid;
        private @Nullable VirtualNetworkGatewaySkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable String vNetExtendedLocationResourceId;
        private @Nullable VpnClientConfigurationResponse vpnClientConfiguration;
        private @Nullable String vpnGatewayGeneration;
        private @Nullable String vpnType;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkGatewayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeActive = defaults.activeActive;
    	      this.bgpSettings = defaults.bgpSettings;
    	      this.customRoutes = defaults.customRoutes;
    	      this.enableBgp = defaults.enableBgp;
    	      this.enableDnsForwarding = defaults.enableDnsForwarding;
    	      this.enablePrivateIpAddress = defaults.enablePrivateIpAddress;
    	      this.etag = defaults.etag;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.gatewayDefaultSite = defaults.gatewayDefaultSite;
    	      this.gatewayType = defaults.gatewayType;
    	      this.id = defaults.id;
    	      this.inboundDnsForwardingEndpoint = defaults.inboundDnsForwardingEndpoint;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceGuid = defaults.resourceGuid;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vNetExtendedLocationResourceId = defaults.vNetExtendedLocationResourceId;
    	      this.vpnClientConfiguration = defaults.vpnClientConfiguration;
    	      this.vpnGatewayGeneration = defaults.vpnGatewayGeneration;
    	      this.vpnType = defaults.vpnType;
        }

        public Builder setActiveActive(@Nullable Boolean activeActive) {
            this.activeActive = activeActive;
            return this;
        }

        public Builder setBgpSettings(@Nullable BgpSettingsResponse bgpSettings) {
            this.bgpSettings = bgpSettings;
            return this;
        }

        public Builder setCustomRoutes(@Nullable AddressSpaceResponse customRoutes) {
            this.customRoutes = customRoutes;
            return this;
        }

        public Builder setEnableBgp(@Nullable Boolean enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }

        public Builder setEnableDnsForwarding(@Nullable Boolean enableDnsForwarding) {
            this.enableDnsForwarding = enableDnsForwarding;
            return this;
        }

        public Builder setEnablePrivateIpAddress(@Nullable Boolean enablePrivateIpAddress) {
            this.enablePrivateIpAddress = enablePrivateIpAddress;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setGatewayDefaultSite(@Nullable SubResourceResponse gatewayDefaultSite) {
            this.gatewayDefaultSite = gatewayDefaultSite;
            return this;
        }

        public Builder setGatewayType(@Nullable String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setInboundDnsForwardingEndpoint(String inboundDnsForwardingEndpoint) {
            this.inboundDnsForwardingEndpoint = Objects.requireNonNull(inboundDnsForwardingEndpoint);
            return this;
        }

        public Builder setIpConfigurations(@Nullable List<VirtualNetworkGatewayIPConfigurationResponse> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
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

        public Builder setSku(@Nullable VirtualNetworkGatewaySkuResponse sku) {
            this.sku = sku;
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

        public Builder setVNetExtendedLocationResourceId(@Nullable String vNetExtendedLocationResourceId) {
            this.vNetExtendedLocationResourceId = vNetExtendedLocationResourceId;
            return this;
        }

        public Builder setVpnClientConfiguration(@Nullable VpnClientConfigurationResponse vpnClientConfiguration) {
            this.vpnClientConfiguration = vpnClientConfiguration;
            return this;
        }

        public Builder setVpnGatewayGeneration(@Nullable String vpnGatewayGeneration) {
            this.vpnGatewayGeneration = vpnGatewayGeneration;
            return this;
        }

        public Builder setVpnType(@Nullable String vpnType) {
            this.vpnType = vpnType;
            return this;
        }
        public VirtualNetworkGatewayResponse build() {
            return new VirtualNetworkGatewayResponse(activeActive, bgpSettings, customRoutes, enableBgp, enableDnsForwarding, enablePrivateIpAddress, etag, extendedLocation, gatewayDefaultSite, gatewayType, id, inboundDnsForwardingEndpoint, ipConfigurations, location, name, provisioningState, resourceGuid, sku, tags, type, vNetExtendedLocationResourceId, vpnClientConfiguration, vpnGatewayGeneration, vpnType);
        }
    }
}
