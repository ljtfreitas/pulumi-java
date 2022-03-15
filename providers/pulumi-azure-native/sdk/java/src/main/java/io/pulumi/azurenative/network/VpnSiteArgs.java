// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.AddressSpaceArgs;
import io.pulumi.azurenative.network.inputs.BgpSettingsArgs;
import io.pulumi.azurenative.network.inputs.DevicePropertiesArgs;
import io.pulumi.azurenative.network.inputs.O365PolicyPropertiesArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.azurenative.network.inputs.VpnSiteLinkArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnSiteArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpnSiteArgs Empty = new VpnSiteArgs();

    /**
     * The AddressSpace that contains an array of IP address ranges.
     * 
     */
    @Import(name="addressSpace")
      private final @Nullable Output<AddressSpaceArgs> addressSpace;

    public Output<AddressSpaceArgs> getAddressSpace() {
        return this.addressSpace == null ? Output.empty() : this.addressSpace;
    }

    /**
     * The set of bgp properties.
     * 
     */
    @Import(name="bgpProperties")
      private final @Nullable Output<BgpSettingsArgs> bgpProperties;

    public Output<BgpSettingsArgs> getBgpProperties() {
        return this.bgpProperties == null ? Output.empty() : this.bgpProperties;
    }

    /**
     * The device properties.
     * 
     */
    @Import(name="deviceProperties")
      private final @Nullable Output<DevicePropertiesArgs> deviceProperties;

    public Output<DevicePropertiesArgs> getDeviceProperties() {
        return this.deviceProperties == null ? Output.empty() : this.deviceProperties;
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
     * The ip-address for the vpn-site.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Output.empty() : this.ipAddress;
    }

    /**
     * IsSecuritySite flag.
     * 
     */
    @Import(name="isSecuritySite")
      private final @Nullable Output<Boolean> isSecuritySite;

    public Output<Boolean> getIsSecuritySite() {
        return this.isSecuritySite == null ? Output.empty() : this.isSecuritySite;
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
     * Office365 Policy.
     * 
     */
    @Import(name="o365Policy")
      private final @Nullable Output<O365PolicyPropertiesArgs> o365Policy;

    public Output<O365PolicyPropertiesArgs> getO365Policy() {
        return this.o365Policy == null ? Output.empty() : this.o365Policy;
    }

    /**
     * The resource group name of the VpnSite.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The key for vpn-site that can be used for connections.
     * 
     */
    @Import(name="siteKey")
      private final @Nullable Output<String> siteKey;

    public Output<String> getSiteKey() {
        return this.siteKey == null ? Output.empty() : this.siteKey;
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
     * The VirtualWAN to which the vpnSite belongs.
     * 
     */
    @Import(name="virtualWan")
      private final @Nullable Output<SubResourceArgs> virtualWan;

    public Output<SubResourceArgs> getVirtualWan() {
        return this.virtualWan == null ? Output.empty() : this.virtualWan;
    }

    /**
     * List of all vpn site links.
     * 
     */
    @Import(name="vpnSiteLinks")
      private final @Nullable Output<List<VpnSiteLinkArgs>> vpnSiteLinks;

    public Output<List<VpnSiteLinkArgs>> getVpnSiteLinks() {
        return this.vpnSiteLinks == null ? Output.empty() : this.vpnSiteLinks;
    }

    /**
     * The name of the VpnSite being created or updated.
     * 
     */
    @Import(name="vpnSiteName")
      private final @Nullable Output<String> vpnSiteName;

    public Output<String> getVpnSiteName() {
        return this.vpnSiteName == null ? Output.empty() : this.vpnSiteName;
    }

    public VpnSiteArgs(
        @Nullable Output<AddressSpaceArgs> addressSpace,
        @Nullable Output<BgpSettingsArgs> bgpProperties,
        @Nullable Output<DevicePropertiesArgs> deviceProperties,
        @Nullable Output<String> id,
        @Nullable Output<String> ipAddress,
        @Nullable Output<Boolean> isSecuritySite,
        @Nullable Output<String> location,
        @Nullable Output<O365PolicyPropertiesArgs> o365Policy,
        Output<String> resourceGroupName,
        @Nullable Output<String> siteKey,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<SubResourceArgs> virtualWan,
        @Nullable Output<List<VpnSiteLinkArgs>> vpnSiteLinks,
        @Nullable Output<String> vpnSiteName) {
        this.addressSpace = addressSpace;
        this.bgpProperties = bgpProperties;
        this.deviceProperties = deviceProperties;
        this.id = id;
        this.ipAddress = ipAddress;
        this.isSecuritySite = isSecuritySite;
        this.location = location;
        this.o365Policy = o365Policy;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.siteKey = siteKey;
        this.tags = tags;
        this.virtualWan = virtualWan;
        this.vpnSiteLinks = vpnSiteLinks;
        this.vpnSiteName = vpnSiteName;
    }

    private VpnSiteArgs() {
        this.addressSpace = Output.empty();
        this.bgpProperties = Output.empty();
        this.deviceProperties = Output.empty();
        this.id = Output.empty();
        this.ipAddress = Output.empty();
        this.isSecuritySite = Output.empty();
        this.location = Output.empty();
        this.o365Policy = Output.empty();
        this.resourceGroupName = Output.empty();
        this.siteKey = Output.empty();
        this.tags = Output.empty();
        this.virtualWan = Output.empty();
        this.vpnSiteLinks = Output.empty();
        this.vpnSiteName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AddressSpaceArgs> addressSpace;
        private @Nullable Output<BgpSettingsArgs> bgpProperties;
        private @Nullable Output<DevicePropertiesArgs> deviceProperties;
        private @Nullable Output<String> id;
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<Boolean> isSecuritySite;
        private @Nullable Output<String> location;
        private @Nullable Output<O365PolicyPropertiesArgs> o365Policy;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> siteKey;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<SubResourceArgs> virtualWan;
        private @Nullable Output<List<VpnSiteLinkArgs>> vpnSiteLinks;
        private @Nullable Output<String> vpnSiteName;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnSiteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressSpace = defaults.addressSpace;
    	      this.bgpProperties = defaults.bgpProperties;
    	      this.deviceProperties = defaults.deviceProperties;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.isSecuritySite = defaults.isSecuritySite;
    	      this.location = defaults.location;
    	      this.o365Policy = defaults.o365Policy;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.siteKey = defaults.siteKey;
    	      this.tags = defaults.tags;
    	      this.virtualWan = defaults.virtualWan;
    	      this.vpnSiteLinks = defaults.vpnSiteLinks;
    	      this.vpnSiteName = defaults.vpnSiteName;
        }

        public Builder addressSpace(@Nullable Output<AddressSpaceArgs> addressSpace) {
            this.addressSpace = addressSpace;
            return this;
        }

        public Builder addressSpace(@Nullable AddressSpaceArgs addressSpace) {
            this.addressSpace = Output.ofNullable(addressSpace);
            return this;
        }

        public Builder bgpProperties(@Nullable Output<BgpSettingsArgs> bgpProperties) {
            this.bgpProperties = bgpProperties;
            return this;
        }

        public Builder bgpProperties(@Nullable BgpSettingsArgs bgpProperties) {
            this.bgpProperties = Output.ofNullable(bgpProperties);
            return this;
        }

        public Builder deviceProperties(@Nullable Output<DevicePropertiesArgs> deviceProperties) {
            this.deviceProperties = deviceProperties;
            return this;
        }

        public Builder deviceProperties(@Nullable DevicePropertiesArgs deviceProperties) {
            this.deviceProperties = Output.ofNullable(deviceProperties);
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

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Output.ofNullable(ipAddress);
            return this;
        }

        public Builder isSecuritySite(@Nullable Output<Boolean> isSecuritySite) {
            this.isSecuritySite = isSecuritySite;
            return this;
        }

        public Builder isSecuritySite(@Nullable Boolean isSecuritySite) {
            this.isSecuritySite = Output.ofNullable(isSecuritySite);
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

        public Builder o365Policy(@Nullable Output<O365PolicyPropertiesArgs> o365Policy) {
            this.o365Policy = o365Policy;
            return this;
        }

        public Builder o365Policy(@Nullable O365PolicyPropertiesArgs o365Policy) {
            this.o365Policy = Output.ofNullable(o365Policy);
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

        public Builder siteKey(@Nullable Output<String> siteKey) {
            this.siteKey = siteKey;
            return this;
        }

        public Builder siteKey(@Nullable String siteKey) {
            this.siteKey = Output.ofNullable(siteKey);
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

        public Builder virtualWan(@Nullable Output<SubResourceArgs> virtualWan) {
            this.virtualWan = virtualWan;
            return this;
        }

        public Builder virtualWan(@Nullable SubResourceArgs virtualWan) {
            this.virtualWan = Output.ofNullable(virtualWan);
            return this;
        }

        public Builder vpnSiteLinks(@Nullable Output<List<VpnSiteLinkArgs>> vpnSiteLinks) {
            this.vpnSiteLinks = vpnSiteLinks;
            return this;
        }

        public Builder vpnSiteLinks(@Nullable List<VpnSiteLinkArgs> vpnSiteLinks) {
            this.vpnSiteLinks = Output.ofNullable(vpnSiteLinks);
            return this;
        }

        public Builder vpnSiteName(@Nullable Output<String> vpnSiteName) {
            this.vpnSiteName = vpnSiteName;
            return this;
        }

        public Builder vpnSiteName(@Nullable String vpnSiteName) {
            this.vpnSiteName = Output.ofNullable(vpnSiteName);
            return this;
        }
        public VpnSiteArgs build() {
            return new VpnSiteArgs(addressSpace, bgpProperties, deviceProperties, id, ipAddress, isSecuritySite, location, o365Policy, resourceGroupName, siteKey, tags, virtualWan, vpnSiteLinks, vpnSiteName);
        }
    }
}
