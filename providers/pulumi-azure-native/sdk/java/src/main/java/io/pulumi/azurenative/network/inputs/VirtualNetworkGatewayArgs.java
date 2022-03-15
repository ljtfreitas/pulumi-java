// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.VirtualNetworkGatewayType;
import io.pulumi.azurenative.network.enums.VpnGatewayGeneration;
import io.pulumi.azurenative.network.enums.VpnType;
import io.pulumi.azurenative.network.inputs.AddressSpaceArgs;
import io.pulumi.azurenative.network.inputs.BgpSettingsArgs;
import io.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.azurenative.network.inputs.VirtualNetworkGatewayIPConfigurationArgs;
import io.pulumi.azurenative.network.inputs.VirtualNetworkGatewaySkuArgs;
import io.pulumi.azurenative.network.inputs.VpnClientConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A common class for general resource information.
 * 
 */
public final class VirtualNetworkGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewayArgs Empty = new VirtualNetworkGatewayArgs();

    /**
     * ActiveActive flag.
     * 
     */
    @Import(name="activeActive")
      private final @Nullable Output<Boolean> activeActive;

    public Output<Boolean> getActiveActive() {
        return this.activeActive == null ? Output.empty() : this.activeActive;
    }

    /**
     * Virtual network gateway's BGP speaker settings.
     * 
     */
    @Import(name="bgpSettings")
      private final @Nullable Output<BgpSettingsArgs> bgpSettings;

    public Output<BgpSettingsArgs> getBgpSettings() {
        return this.bgpSettings == null ? Output.empty() : this.bgpSettings;
    }

    /**
     * The reference to the address space resource which represents the custom routes address space specified by the customer for virtual network gateway and VpnClient.
     * 
     */
    @Import(name="customRoutes")
      private final @Nullable Output<AddressSpaceArgs> customRoutes;

    public Output<AddressSpaceArgs> getCustomRoutes() {
        return this.customRoutes == null ? Output.empty() : this.customRoutes;
    }

    /**
     * Whether BGP is enabled for this virtual network gateway or not.
     * 
     */
    @Import(name="enableBgp")
      private final @Nullable Output<Boolean> enableBgp;

    public Output<Boolean> getEnableBgp() {
        return this.enableBgp == null ? Output.empty() : this.enableBgp;
    }

    /**
     * Whether dns forwarding is enabled or not.
     * 
     */
    @Import(name="enableDnsForwarding")
      private final @Nullable Output<Boolean> enableDnsForwarding;

    public Output<Boolean> getEnableDnsForwarding() {
        return this.enableDnsForwarding == null ? Output.empty() : this.enableDnsForwarding;
    }

    /**
     * Whether private IP needs to be enabled on this gateway for connections or not.
     * 
     */
    @Import(name="enablePrivateIpAddress")
      private final @Nullable Output<Boolean> enablePrivateIpAddress;

    public Output<Boolean> getEnablePrivateIpAddress() {
        return this.enablePrivateIpAddress == null ? Output.empty() : this.enablePrivateIpAddress;
    }

    /**
     * The extended location of type local virtual network gateway.
     * 
     */
    @Import(name="extendedLocation")
      private final @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Output<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Output.empty() : this.extendedLocation;
    }

    /**
     * The reference to the LocalNetworkGateway resource which represents local network site having default routes. Assign Null value in case of removing existing default site setting.
     * 
     */
    @Import(name="gatewayDefaultSite")
      private final @Nullable Output<SubResourceArgs> gatewayDefaultSite;

    public Output<SubResourceArgs> getGatewayDefaultSite() {
        return this.gatewayDefaultSite == null ? Output.empty() : this.gatewayDefaultSite;
    }

    /**
     * The type of this virtual network gateway.
     * 
     */
    @Import(name="gatewayType")
      private final @Nullable Output<Either<String,VirtualNetworkGatewayType>> gatewayType;

    public Output<Either<String,VirtualNetworkGatewayType>> getGatewayType() {
        return this.gatewayType == null ? Output.empty() : this.gatewayType;
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
     * IP configurations for virtual network gateway.
     * 
     */
    @Import(name="ipConfigurations")
      private final @Nullable Output<List<VirtualNetworkGatewayIPConfigurationArgs>> ipConfigurations;

    public Output<List<VirtualNetworkGatewayIPConfigurationArgs>> getIpConfigurations() {
        return this.ipConfigurations == null ? Output.empty() : this.ipConfigurations;
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
     * The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected for Virtual network gateway.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<VirtualNetworkGatewaySkuArgs> sku;

    public Output<VirtualNetworkGatewaySkuArgs> getSku() {
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
     * Customer vnet resource id. VirtualNetworkGateway of type local gateway is associated with the customer vnet.
     * 
     */
    @Import(name="vNetExtendedLocationResourceId")
      private final @Nullable Output<String> vNetExtendedLocationResourceId;

    public Output<String> getVNetExtendedLocationResourceId() {
        return this.vNetExtendedLocationResourceId == null ? Output.empty() : this.vNetExtendedLocationResourceId;
    }

    /**
     * The reference to the VpnClientConfiguration resource which represents the P2S VpnClient configurations.
     * 
     */
    @Import(name="vpnClientConfiguration")
      private final @Nullable Output<VpnClientConfigurationArgs> vpnClientConfiguration;

    public Output<VpnClientConfigurationArgs> getVpnClientConfiguration() {
        return this.vpnClientConfiguration == null ? Output.empty() : this.vpnClientConfiguration;
    }

    /**
     * The generation for this VirtualNetworkGateway. Must be None if gatewayType is not VPN.
     * 
     */
    @Import(name="vpnGatewayGeneration")
      private final @Nullable Output<Either<String,VpnGatewayGeneration>> vpnGatewayGeneration;

    public Output<Either<String,VpnGatewayGeneration>> getVpnGatewayGeneration() {
        return this.vpnGatewayGeneration == null ? Output.empty() : this.vpnGatewayGeneration;
    }

    /**
     * The type of this virtual network gateway.
     * 
     */
    @Import(name="vpnType")
      private final @Nullable Output<Either<String,VpnType>> vpnType;

    public Output<Either<String,VpnType>> getVpnType() {
        return this.vpnType == null ? Output.empty() : this.vpnType;
    }

    public VirtualNetworkGatewayArgs(
        @Nullable Output<Boolean> activeActive,
        @Nullable Output<BgpSettingsArgs> bgpSettings,
        @Nullable Output<AddressSpaceArgs> customRoutes,
        @Nullable Output<Boolean> enableBgp,
        @Nullable Output<Boolean> enableDnsForwarding,
        @Nullable Output<Boolean> enablePrivateIpAddress,
        @Nullable Output<ExtendedLocationArgs> extendedLocation,
        @Nullable Output<SubResourceArgs> gatewayDefaultSite,
        @Nullable Output<Either<String,VirtualNetworkGatewayType>> gatewayType,
        @Nullable Output<String> id,
        @Nullable Output<List<VirtualNetworkGatewayIPConfigurationArgs>> ipConfigurations,
        @Nullable Output<String> location,
        @Nullable Output<VirtualNetworkGatewaySkuArgs> sku,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> vNetExtendedLocationResourceId,
        @Nullable Output<VpnClientConfigurationArgs> vpnClientConfiguration,
        @Nullable Output<Either<String,VpnGatewayGeneration>> vpnGatewayGeneration,
        @Nullable Output<Either<String,VpnType>> vpnType) {
        this.activeActive = activeActive;
        this.bgpSettings = bgpSettings;
        this.customRoutes = customRoutes;
        this.enableBgp = enableBgp;
        this.enableDnsForwarding = enableDnsForwarding;
        this.enablePrivateIpAddress = enablePrivateIpAddress;
        this.extendedLocation = extendedLocation;
        this.gatewayDefaultSite = gatewayDefaultSite;
        this.gatewayType = gatewayType;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.location = location;
        this.sku = sku;
        this.tags = tags;
        this.vNetExtendedLocationResourceId = vNetExtendedLocationResourceId;
        this.vpnClientConfiguration = vpnClientConfiguration;
        this.vpnGatewayGeneration = vpnGatewayGeneration;
        this.vpnType = vpnType;
    }

    private VirtualNetworkGatewayArgs() {
        this.activeActive = Output.empty();
        this.bgpSettings = Output.empty();
        this.customRoutes = Output.empty();
        this.enableBgp = Output.empty();
        this.enableDnsForwarding = Output.empty();
        this.enablePrivateIpAddress = Output.empty();
        this.extendedLocation = Output.empty();
        this.gatewayDefaultSite = Output.empty();
        this.gatewayType = Output.empty();
        this.id = Output.empty();
        this.ipConfigurations = Output.empty();
        this.location = Output.empty();
        this.sku = Output.empty();
        this.tags = Output.empty();
        this.vNetExtendedLocationResourceId = Output.empty();
        this.vpnClientConfiguration = Output.empty();
        this.vpnGatewayGeneration = Output.empty();
        this.vpnType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> activeActive;
        private @Nullable Output<BgpSettingsArgs> bgpSettings;
        private @Nullable Output<AddressSpaceArgs> customRoutes;
        private @Nullable Output<Boolean> enableBgp;
        private @Nullable Output<Boolean> enableDnsForwarding;
        private @Nullable Output<Boolean> enablePrivateIpAddress;
        private @Nullable Output<ExtendedLocationArgs> extendedLocation;
        private @Nullable Output<SubResourceArgs> gatewayDefaultSite;
        private @Nullable Output<Either<String,VirtualNetworkGatewayType>> gatewayType;
        private @Nullable Output<String> id;
        private @Nullable Output<List<VirtualNetworkGatewayIPConfigurationArgs>> ipConfigurations;
        private @Nullable Output<String> location;
        private @Nullable Output<VirtualNetworkGatewaySkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> vNetExtendedLocationResourceId;
        private @Nullable Output<VpnClientConfigurationArgs> vpnClientConfiguration;
        private @Nullable Output<Either<String,VpnGatewayGeneration>> vpnGatewayGeneration;
        private @Nullable Output<Either<String,VpnType>> vpnType;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeActive = defaults.activeActive;
    	      this.bgpSettings = defaults.bgpSettings;
    	      this.customRoutes = defaults.customRoutes;
    	      this.enableBgp = defaults.enableBgp;
    	      this.enableDnsForwarding = defaults.enableDnsForwarding;
    	      this.enablePrivateIpAddress = defaults.enablePrivateIpAddress;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.gatewayDefaultSite = defaults.gatewayDefaultSite;
    	      this.gatewayType = defaults.gatewayType;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.location = defaults.location;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.vNetExtendedLocationResourceId = defaults.vNetExtendedLocationResourceId;
    	      this.vpnClientConfiguration = defaults.vpnClientConfiguration;
    	      this.vpnGatewayGeneration = defaults.vpnGatewayGeneration;
    	      this.vpnType = defaults.vpnType;
        }

        public Builder activeActive(@Nullable Output<Boolean> activeActive) {
            this.activeActive = activeActive;
            return this;
        }

        public Builder activeActive(@Nullable Boolean activeActive) {
            this.activeActive = Output.ofNullable(activeActive);
            return this;
        }

        public Builder bgpSettings(@Nullable Output<BgpSettingsArgs> bgpSettings) {
            this.bgpSettings = bgpSettings;
            return this;
        }

        public Builder bgpSettings(@Nullable BgpSettingsArgs bgpSettings) {
            this.bgpSettings = Output.ofNullable(bgpSettings);
            return this;
        }

        public Builder customRoutes(@Nullable Output<AddressSpaceArgs> customRoutes) {
            this.customRoutes = customRoutes;
            return this;
        }

        public Builder customRoutes(@Nullable AddressSpaceArgs customRoutes) {
            this.customRoutes = Output.ofNullable(customRoutes);
            return this;
        }

        public Builder enableBgp(@Nullable Output<Boolean> enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }

        public Builder enableBgp(@Nullable Boolean enableBgp) {
            this.enableBgp = Output.ofNullable(enableBgp);
            return this;
        }

        public Builder enableDnsForwarding(@Nullable Output<Boolean> enableDnsForwarding) {
            this.enableDnsForwarding = enableDnsForwarding;
            return this;
        }

        public Builder enableDnsForwarding(@Nullable Boolean enableDnsForwarding) {
            this.enableDnsForwarding = Output.ofNullable(enableDnsForwarding);
            return this;
        }

        public Builder enablePrivateIpAddress(@Nullable Output<Boolean> enablePrivateIpAddress) {
            this.enablePrivateIpAddress = enablePrivateIpAddress;
            return this;
        }

        public Builder enablePrivateIpAddress(@Nullable Boolean enablePrivateIpAddress) {
            this.enablePrivateIpAddress = Output.ofNullable(enablePrivateIpAddress);
            return this;
        }

        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder extendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Output.ofNullable(extendedLocation);
            return this;
        }

        public Builder gatewayDefaultSite(@Nullable Output<SubResourceArgs> gatewayDefaultSite) {
            this.gatewayDefaultSite = gatewayDefaultSite;
            return this;
        }

        public Builder gatewayDefaultSite(@Nullable SubResourceArgs gatewayDefaultSite) {
            this.gatewayDefaultSite = Output.ofNullable(gatewayDefaultSite);
            return this;
        }

        public Builder gatewayType(@Nullable Output<Either<String,VirtualNetworkGatewayType>> gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }

        public Builder gatewayType(@Nullable Either<String,VirtualNetworkGatewayType> gatewayType) {
            this.gatewayType = Output.ofNullable(gatewayType);
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

        public Builder ipConfigurations(@Nullable Output<List<VirtualNetworkGatewayIPConfigurationArgs>> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder ipConfigurations(@Nullable List<VirtualNetworkGatewayIPConfigurationArgs> ipConfigurations) {
            this.ipConfigurations = Output.ofNullable(ipConfigurations);
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

        public Builder sku(@Nullable Output<VirtualNetworkGatewaySkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable VirtualNetworkGatewaySkuArgs sku) {
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

        public Builder vNetExtendedLocationResourceId(@Nullable Output<String> vNetExtendedLocationResourceId) {
            this.vNetExtendedLocationResourceId = vNetExtendedLocationResourceId;
            return this;
        }

        public Builder vNetExtendedLocationResourceId(@Nullable String vNetExtendedLocationResourceId) {
            this.vNetExtendedLocationResourceId = Output.ofNullable(vNetExtendedLocationResourceId);
            return this;
        }

        public Builder vpnClientConfiguration(@Nullable Output<VpnClientConfigurationArgs> vpnClientConfiguration) {
            this.vpnClientConfiguration = vpnClientConfiguration;
            return this;
        }

        public Builder vpnClientConfiguration(@Nullable VpnClientConfigurationArgs vpnClientConfiguration) {
            this.vpnClientConfiguration = Output.ofNullable(vpnClientConfiguration);
            return this;
        }

        public Builder vpnGatewayGeneration(@Nullable Output<Either<String,VpnGatewayGeneration>> vpnGatewayGeneration) {
            this.vpnGatewayGeneration = vpnGatewayGeneration;
            return this;
        }

        public Builder vpnGatewayGeneration(@Nullable Either<String,VpnGatewayGeneration> vpnGatewayGeneration) {
            this.vpnGatewayGeneration = Output.ofNullable(vpnGatewayGeneration);
            return this;
        }

        public Builder vpnType(@Nullable Output<Either<String,VpnType>> vpnType) {
            this.vpnType = vpnType;
            return this;
        }

        public Builder vpnType(@Nullable Either<String,VpnType> vpnType) {
            this.vpnType = Output.ofNullable(vpnType);
            return this;
        }
        public VirtualNetworkGatewayArgs build() {
            return new VirtualNetworkGatewayArgs(activeActive, bgpSettings, customRoutes, enableBgp, enableDnsForwarding, enablePrivateIpAddress, extendedLocation, gatewayDefaultSite, gatewayType, id, ipConfigurations, location, sku, tags, vNetExtendedLocationResourceId, vpnClientConfiguration, vpnGatewayGeneration, vpnType);
        }
    }
}
