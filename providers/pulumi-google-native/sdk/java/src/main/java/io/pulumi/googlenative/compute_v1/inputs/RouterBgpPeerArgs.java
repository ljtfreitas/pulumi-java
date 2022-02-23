// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_v1.enums.RouterBgpPeerAdvertiseMode;
import io.pulumi.googlenative.compute_v1.enums.RouterBgpPeerAdvertisedGroupsItem;
import io.pulumi.googlenative.compute_v1.enums.RouterBgpPeerEnable;
import io.pulumi.googlenative.compute_v1.inputs.RouterAdvertisedIpRangeArgs;
import io.pulumi.googlenative.compute_v1.inputs.RouterBgpPeerBfdArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterBgpPeerArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterBgpPeerArgs Empty = new RouterBgpPeerArgs();

    /**
     * User-specified flag to indicate which mode to use for advertisement.
     * 
     */
    @InputImport(name="advertiseMode")
      private final @Nullable Input<RouterBgpPeerAdvertiseMode> advertiseMode;

    public Input<RouterBgpPeerAdvertiseMode> getAdvertiseMode() {
        return this.advertiseMode == null ? Input.empty() : this.advertiseMode;
    }

    /**
     * User-specified list of prefix groups to advertise in custom mode, which can take one of the following options: - ALL_SUBNETS: Advertises all available subnets, including peer VPC subnets. - ALL_VPC_SUBNETS: Advertises the router's own VPC subnets. Note that this field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These groups are advertised in addition to any specified prefixes. Leave this field blank to advertise no custom groups.
     * 
     */
    @InputImport(name="advertisedGroups")
      private final @Nullable Input<List<RouterBgpPeerAdvertisedGroupsItem>> advertisedGroups;

    public Input<List<RouterBgpPeerAdvertisedGroupsItem>> getAdvertisedGroups() {
        return this.advertisedGroups == null ? Input.empty() : this.advertisedGroups;
    }

    /**
     * User-specified list of individual IP ranges to advertise in custom mode. This field can only be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the "bgp" message). These IP ranges are advertised in addition to any specified groups. Leave this field blank to advertise no custom IP ranges.
     * 
     */
    @InputImport(name="advertisedIpRanges")
      private final @Nullable Input<List<RouterAdvertisedIpRangeArgs>> advertisedIpRanges;

    public Input<List<RouterAdvertisedIpRangeArgs>> getAdvertisedIpRanges() {
        return this.advertisedIpRanges == null ? Input.empty() : this.advertisedIpRanges;
    }

    /**
     * The priority of routes advertised to this BGP peer. Where there is more than one matching route of maximum length, the routes with the lowest priority value win.
     * 
     */
    @InputImport(name="advertisedRoutePriority")
      private final @Nullable Input<Integer> advertisedRoutePriority;

    public Input<Integer> getAdvertisedRoutePriority() {
        return this.advertisedRoutePriority == null ? Input.empty() : this.advertisedRoutePriority;
    }

    /**
     * BFD configuration for the BGP peering.
     * 
     */
    @InputImport(name="bfd")
      private final @Nullable Input<RouterBgpPeerBfdArgs> bfd;

    public Input<RouterBgpPeerBfdArgs> getBfd() {
        return this.bfd == null ? Input.empty() : this.bfd;
    }

    /**
     * The status of the BGP peer connection. If set to FALSE, any active session with the peer is terminated and all associated routing information is removed. If set to TRUE, the peer connection can be established with routing information. The default is TRUE.
     * 
     */
    @InputImport(name="enable")
      private final @Nullable Input<RouterBgpPeerEnable> enable;

    public Input<RouterBgpPeerEnable> getEnable() {
        return this.enable == null ? Input.empty() : this.enable;
    }

    /**
     * Enable IPv6 traffic over BGP Peer. If not specified, it is disabled by default.
     * 
     */
    @InputImport(name="enableIpv6")
      private final @Nullable Input<Boolean> enableIpv6;

    public Input<Boolean> getEnableIpv6() {
        return this.enableIpv6 == null ? Input.empty() : this.enableIpv6;
    }

    /**
     * Name of the interface the BGP peer is associated with.
     * 
     */
    @InputImport(name="interfaceName")
      private final @Nullable Input<String> interfaceName;

    public Input<String> getInterfaceName() {
        return this.interfaceName == null ? Input.empty() : this.interfaceName;
    }

    /**
     * IP address of the interface inside Google Cloud Platform. Only IPv4 is supported.
     * 
     */
    @InputImport(name="ipAddress")
      private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * IPv6 address of the interface inside Google Cloud Platform.
     * 
     */
    @InputImport(name="ipv6NexthopAddress")
      private final @Nullable Input<String> ipv6NexthopAddress;

    public Input<String> getIpv6NexthopAddress() {
        return this.ipv6NexthopAddress == null ? Input.empty() : this.ipv6NexthopAddress;
    }

    /**
     * Name of this BGP peer. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value.
     * 
     */
    @InputImport(name="peerAsn")
      private final @Nullable Input<Integer> peerAsn;

    public Input<Integer> getPeerAsn() {
        return this.peerAsn == null ? Input.empty() : this.peerAsn;
    }

    /**
     * IP address of the BGP interface outside Google Cloud Platform. Only IPv4 is supported.
     * 
     */
    @InputImport(name="peerIpAddress")
      private final @Nullable Input<String> peerIpAddress;

    public Input<String> getPeerIpAddress() {
        return this.peerIpAddress == null ? Input.empty() : this.peerIpAddress;
    }

    /**
     * IPv6 address of the BGP interface outside Google Cloud Platform.
     * 
     */
    @InputImport(name="peerIpv6NexthopAddress")
      private final @Nullable Input<String> peerIpv6NexthopAddress;

    public Input<String> getPeerIpv6NexthopAddress() {
        return this.peerIpv6NexthopAddress == null ? Input.empty() : this.peerIpv6NexthopAddress;
    }

    /**
     * URI of the VM instance that is used as third-party router appliances such as Next Gen Firewalls, Virtual Routers, or Router Appliances. The VM instance must be located in zones contained in the same region as this Cloud Router. The VM instance is the peer side of the BGP session.
     * 
     */
    @InputImport(name="routerApplianceInstance")
      private final @Nullable Input<String> routerApplianceInstance;

    public Input<String> getRouterApplianceInstance() {
        return this.routerApplianceInstance == null ? Input.empty() : this.routerApplianceInstance;
    }

    public RouterBgpPeerArgs(
        @Nullable Input<RouterBgpPeerAdvertiseMode> advertiseMode,
        @Nullable Input<List<RouterBgpPeerAdvertisedGroupsItem>> advertisedGroups,
        @Nullable Input<List<RouterAdvertisedIpRangeArgs>> advertisedIpRanges,
        @Nullable Input<Integer> advertisedRoutePriority,
        @Nullable Input<RouterBgpPeerBfdArgs> bfd,
        @Nullable Input<RouterBgpPeerEnable> enable,
        @Nullable Input<Boolean> enableIpv6,
        @Nullable Input<String> interfaceName,
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> ipv6NexthopAddress,
        @Nullable Input<String> name,
        @Nullable Input<Integer> peerAsn,
        @Nullable Input<String> peerIpAddress,
        @Nullable Input<String> peerIpv6NexthopAddress,
        @Nullable Input<String> routerApplianceInstance) {
        this.advertiseMode = advertiseMode;
        this.advertisedGroups = advertisedGroups;
        this.advertisedIpRanges = advertisedIpRanges;
        this.advertisedRoutePriority = advertisedRoutePriority;
        this.bfd = bfd;
        this.enable = enable;
        this.enableIpv6 = enableIpv6;
        this.interfaceName = interfaceName;
        this.ipAddress = ipAddress;
        this.ipv6NexthopAddress = ipv6NexthopAddress;
        this.name = name;
        this.peerAsn = peerAsn;
        this.peerIpAddress = peerIpAddress;
        this.peerIpv6NexthopAddress = peerIpv6NexthopAddress;
        this.routerApplianceInstance = routerApplianceInstance;
    }

    private RouterBgpPeerArgs() {
        this.advertiseMode = Input.empty();
        this.advertisedGroups = Input.empty();
        this.advertisedIpRanges = Input.empty();
        this.advertisedRoutePriority = Input.empty();
        this.bfd = Input.empty();
        this.enable = Input.empty();
        this.enableIpv6 = Input.empty();
        this.interfaceName = Input.empty();
        this.ipAddress = Input.empty();
        this.ipv6NexthopAddress = Input.empty();
        this.name = Input.empty();
        this.peerAsn = Input.empty();
        this.peerIpAddress = Input.empty();
        this.peerIpv6NexthopAddress = Input.empty();
        this.routerApplianceInstance = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterBgpPeerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RouterBgpPeerAdvertiseMode> advertiseMode;
        private @Nullable Input<List<RouterBgpPeerAdvertisedGroupsItem>> advertisedGroups;
        private @Nullable Input<List<RouterAdvertisedIpRangeArgs>> advertisedIpRanges;
        private @Nullable Input<Integer> advertisedRoutePriority;
        private @Nullable Input<RouterBgpPeerBfdArgs> bfd;
        private @Nullable Input<RouterBgpPeerEnable> enable;
        private @Nullable Input<Boolean> enableIpv6;
        private @Nullable Input<String> interfaceName;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> ipv6NexthopAddress;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> peerAsn;
        private @Nullable Input<String> peerIpAddress;
        private @Nullable Input<String> peerIpv6NexthopAddress;
        private @Nullable Input<String> routerApplianceInstance;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterBgpPeerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseMode = defaults.advertiseMode;
    	      this.advertisedGroups = defaults.advertisedGroups;
    	      this.advertisedIpRanges = defaults.advertisedIpRanges;
    	      this.advertisedRoutePriority = defaults.advertisedRoutePriority;
    	      this.bfd = defaults.bfd;
    	      this.enable = defaults.enable;
    	      this.enableIpv6 = defaults.enableIpv6;
    	      this.interfaceName = defaults.interfaceName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipv6NexthopAddress = defaults.ipv6NexthopAddress;
    	      this.name = defaults.name;
    	      this.peerAsn = defaults.peerAsn;
    	      this.peerIpAddress = defaults.peerIpAddress;
    	      this.peerIpv6NexthopAddress = defaults.peerIpv6NexthopAddress;
    	      this.routerApplianceInstance = defaults.routerApplianceInstance;
        }

        public Builder setAdvertiseMode(@Nullable Input<RouterBgpPeerAdvertiseMode> advertiseMode) {
            this.advertiseMode = advertiseMode;
            return this;
        }

        public Builder setAdvertiseMode(@Nullable RouterBgpPeerAdvertiseMode advertiseMode) {
            this.advertiseMode = Input.ofNullable(advertiseMode);
            return this;
        }

        public Builder setAdvertisedGroups(@Nullable Input<List<RouterBgpPeerAdvertisedGroupsItem>> advertisedGroups) {
            this.advertisedGroups = advertisedGroups;
            return this;
        }

        public Builder setAdvertisedGroups(@Nullable List<RouterBgpPeerAdvertisedGroupsItem> advertisedGroups) {
            this.advertisedGroups = Input.ofNullable(advertisedGroups);
            return this;
        }

        public Builder setAdvertisedIpRanges(@Nullable Input<List<RouterAdvertisedIpRangeArgs>> advertisedIpRanges) {
            this.advertisedIpRanges = advertisedIpRanges;
            return this;
        }

        public Builder setAdvertisedIpRanges(@Nullable List<RouterAdvertisedIpRangeArgs> advertisedIpRanges) {
            this.advertisedIpRanges = Input.ofNullable(advertisedIpRanges);
            return this;
        }

        public Builder setAdvertisedRoutePriority(@Nullable Input<Integer> advertisedRoutePriority) {
            this.advertisedRoutePriority = advertisedRoutePriority;
            return this;
        }

        public Builder setAdvertisedRoutePriority(@Nullable Integer advertisedRoutePriority) {
            this.advertisedRoutePriority = Input.ofNullable(advertisedRoutePriority);
            return this;
        }

        public Builder setBfd(@Nullable Input<RouterBgpPeerBfdArgs> bfd) {
            this.bfd = bfd;
            return this;
        }

        public Builder setBfd(@Nullable RouterBgpPeerBfdArgs bfd) {
            this.bfd = Input.ofNullable(bfd);
            return this;
        }

        public Builder setEnable(@Nullable Input<RouterBgpPeerEnable> enable) {
            this.enable = enable;
            return this;
        }

        public Builder setEnable(@Nullable RouterBgpPeerEnable enable) {
            this.enable = Input.ofNullable(enable);
            return this;
        }

        public Builder setEnableIpv6(@Nullable Input<Boolean> enableIpv6) {
            this.enableIpv6 = enableIpv6;
            return this;
        }

        public Builder setEnableIpv6(@Nullable Boolean enableIpv6) {
            this.enableIpv6 = Input.ofNullable(enableIpv6);
            return this;
        }

        public Builder setInterfaceName(@Nullable Input<String> interfaceName) {
            this.interfaceName = interfaceName;
            return this;
        }

        public Builder setInterfaceName(@Nullable String interfaceName) {
            this.interfaceName = Input.ofNullable(interfaceName);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setIpv6NexthopAddress(@Nullable Input<String> ipv6NexthopAddress) {
            this.ipv6NexthopAddress = ipv6NexthopAddress;
            return this;
        }

        public Builder setIpv6NexthopAddress(@Nullable String ipv6NexthopAddress) {
            this.ipv6NexthopAddress = Input.ofNullable(ipv6NexthopAddress);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPeerAsn(@Nullable Input<Integer> peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }

        public Builder setPeerAsn(@Nullable Integer peerAsn) {
            this.peerAsn = Input.ofNullable(peerAsn);
            return this;
        }

        public Builder setPeerIpAddress(@Nullable Input<String> peerIpAddress) {
            this.peerIpAddress = peerIpAddress;
            return this;
        }

        public Builder setPeerIpAddress(@Nullable String peerIpAddress) {
            this.peerIpAddress = Input.ofNullable(peerIpAddress);
            return this;
        }

        public Builder setPeerIpv6NexthopAddress(@Nullable Input<String> peerIpv6NexthopAddress) {
            this.peerIpv6NexthopAddress = peerIpv6NexthopAddress;
            return this;
        }

        public Builder setPeerIpv6NexthopAddress(@Nullable String peerIpv6NexthopAddress) {
            this.peerIpv6NexthopAddress = Input.ofNullable(peerIpv6NexthopAddress);
            return this;
        }

        public Builder setRouterApplianceInstance(@Nullable Input<String> routerApplianceInstance) {
            this.routerApplianceInstance = routerApplianceInstance;
            return this;
        }

        public Builder setRouterApplianceInstance(@Nullable String routerApplianceInstance) {
            this.routerApplianceInstance = Input.ofNullable(routerApplianceInstance);
            return this;
        }
        public RouterBgpPeerArgs build() {
            return new RouterBgpPeerArgs(advertiseMode, advertisedGroups, advertisedIpRanges, advertisedRoutePriority, bfd, enable, enableIpv6, interfaceName, ipAddress, ipv6NexthopAddress, name, peerAsn, peerIpAddress, peerIpv6NexthopAddress, routerApplianceInstance);
        }
    }
}
