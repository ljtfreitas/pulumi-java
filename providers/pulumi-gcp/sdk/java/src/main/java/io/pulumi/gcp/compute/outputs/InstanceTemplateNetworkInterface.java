// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.InstanceTemplateNetworkInterfaceAccessConfig;
import io.pulumi.gcp.compute.outputs.InstanceTemplateNetworkInterfaceAliasIpRange;
import io.pulumi.gcp.compute.outputs.InstanceTemplateNetworkInterfaceIpv6AccessConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceTemplateNetworkInterface {
    /**
     * Access configurations, i.e. IPs via which this
     * instance can be accessed via the Internet. Omit to ensure that the instance
     * is not accessible from the Internet (this means that ssh provisioners will
     * not work unless you can send traffic to the instance's
     * network (e.g. via tunnel or because it is running on another cloud instance
     * on that network). This block can be repeated multiple times. Structure documented below.
     * 
     */
    private final @Nullable List<InstanceTemplateNetworkInterfaceAccessConfig> accessConfigs;
    /**
     * An
     * array of alias IP ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * 
     */
    private final @Nullable List<InstanceTemplateNetworkInterfaceAliasIpRange> aliasIpRanges;
    /**
     * An array of IPv6 access configurations for this interface.
     * Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig
     * specified, then this instance will have no external IPv6 Internet access. Structure documented below.
     * 
     */
    private final @Nullable List<InstanceTemplateNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs;
    private final @Nullable String ipv6AccessType;
    /**
     * The name of the instance template. If you leave
     * this blank, the provider will auto-generate a unique name.
     * 
     */
    private final @Nullable String name;
    /**
     * The name or self_link of the network to attach this interface to.
     * Use `network` attribute for Legacy or Auto subnetted networks and
     * `subnetwork` for custom subnetted networks.
     * 
     */
    private final @Nullable String network;
    /**
     * The private IP address to assign to the instance. If
     * empty, the address will be automatically assigned.
     * 
     */
    private final @Nullable String networkIp;
    /**
     * The type of vNIC to be used on this interface. Possible values: GVNIC, VIRTIO_NET.
     * 
     */
    private final @Nullable String nicType;
    /**
     * The networking queue count that's specified by users for the network interface. Both Rx and Tx queues will be set to this number. It will be empty if not specified.
     * 
     */
    private final @Nullable Integer queueCount;
    /**
     * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. Values are IPV4_IPV6 or IPV4_ONLY. If not specified, IPV4_ONLY will be used.
     * 
     */
    private final @Nullable String stackType;
    /**
     * the name of the subnetwork to attach this interface
     * to. The subnetwork must exist in the same `region` this instance will be
     * created in. Either `network` or `subnetwork` must be provided.
     * 
     */
    private final @Nullable String subnetwork;
    /**
     * The ID of the project in which the subnetwork belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    private final @Nullable String subnetworkProject;

    @CustomType.Constructor
    private InstanceTemplateNetworkInterface(
        @CustomType.Parameter("accessConfigs") @Nullable List<InstanceTemplateNetworkInterfaceAccessConfig> accessConfigs,
        @CustomType.Parameter("aliasIpRanges") @Nullable List<InstanceTemplateNetworkInterfaceAliasIpRange> aliasIpRanges,
        @CustomType.Parameter("ipv6AccessConfigs") @Nullable List<InstanceTemplateNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs,
        @CustomType.Parameter("ipv6AccessType") @Nullable String ipv6AccessType,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("network") @Nullable String network,
        @CustomType.Parameter("networkIp") @Nullable String networkIp,
        @CustomType.Parameter("nicType") @Nullable String nicType,
        @CustomType.Parameter("queueCount") @Nullable Integer queueCount,
        @CustomType.Parameter("stackType") @Nullable String stackType,
        @CustomType.Parameter("subnetwork") @Nullable String subnetwork,
        @CustomType.Parameter("subnetworkProject") @Nullable String subnetworkProject) {
        this.accessConfigs = accessConfigs;
        this.aliasIpRanges = aliasIpRanges;
        this.ipv6AccessConfigs = ipv6AccessConfigs;
        this.ipv6AccessType = ipv6AccessType;
        this.name = name;
        this.network = network;
        this.networkIp = networkIp;
        this.nicType = nicType;
        this.queueCount = queueCount;
        this.stackType = stackType;
        this.subnetwork = subnetwork;
        this.subnetworkProject = subnetworkProject;
    }

    /**
     * Access configurations, i.e. IPs via which this
     * instance can be accessed via the Internet. Omit to ensure that the instance
     * is not accessible from the Internet (this means that ssh provisioners will
     * not work unless you can send traffic to the instance's
     * network (e.g. via tunnel or because it is running on another cloud instance
     * on that network). This block can be repeated multiple times. Structure documented below.
     * 
    */
    public List<InstanceTemplateNetworkInterfaceAccessConfig> getAccessConfigs() {
        return this.accessConfigs == null ? List.of() : this.accessConfigs;
    }
    /**
     * An
     * array of alias IP ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * 
    */
    public List<InstanceTemplateNetworkInterfaceAliasIpRange> getAliasIpRanges() {
        return this.aliasIpRanges == null ? List.of() : this.aliasIpRanges;
    }
    /**
     * An array of IPv6 access configurations for this interface.
     * Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig
     * specified, then this instance will have no external IPv6 Internet access. Structure documented below.
     * 
    */
    public List<InstanceTemplateNetworkInterfaceIpv6AccessConfig> getIpv6AccessConfigs() {
        return this.ipv6AccessConfigs == null ? List.of() : this.ipv6AccessConfigs;
    }
    public Optional<String> getIpv6AccessType() {
        return Optional.ofNullable(this.ipv6AccessType);
    }
    /**
     * The name of the instance template. If you leave
     * this blank, the provider will auto-generate a unique name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The name or self_link of the network to attach this interface to.
     * Use `network` attribute for Legacy or Auto subnetted networks and
     * `subnetwork` for custom subnetted networks.
     * 
    */
    public Optional<String> getNetwork() {
        return Optional.ofNullable(this.network);
    }
    /**
     * The private IP address to assign to the instance. If
     * empty, the address will be automatically assigned.
     * 
    */
    public Optional<String> getNetworkIp() {
        return Optional.ofNullable(this.networkIp);
    }
    /**
     * The type of vNIC to be used on this interface. Possible values: GVNIC, VIRTIO_NET.
     * 
    */
    public Optional<String> getNicType() {
        return Optional.ofNullable(this.nicType);
    }
    /**
     * The networking queue count that's specified by users for the network interface. Both Rx and Tx queues will be set to this number. It will be empty if not specified.
     * 
    */
    public Optional<Integer> getQueueCount() {
        return Optional.ofNullable(this.queueCount);
    }
    /**
     * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. Values are IPV4_IPV6 or IPV4_ONLY. If not specified, IPV4_ONLY will be used.
     * 
    */
    public Optional<String> getStackType() {
        return Optional.ofNullable(this.stackType);
    }
    /**
     * the name of the subnetwork to attach this interface
     * to. The subnetwork must exist in the same `region` this instance will be
     * created in. Either `network` or `subnetwork` must be provided.
     * 
    */
    public Optional<String> getSubnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }
    /**
     * The ID of the project in which the subnetwork belongs.
     * If it is not provided, the provider project is used.
     * 
    */
    public Optional<String> getSubnetworkProject() {
        return Optional.ofNullable(this.subnetworkProject);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateNetworkInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<InstanceTemplateNetworkInterfaceAccessConfig> accessConfigs;
        private @Nullable List<InstanceTemplateNetworkInterfaceAliasIpRange> aliasIpRanges;
        private @Nullable List<InstanceTemplateNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs;
        private @Nullable String ipv6AccessType;
        private @Nullable String name;
        private @Nullable String network;
        private @Nullable String networkIp;
        private @Nullable String nicType;
        private @Nullable Integer queueCount;
        private @Nullable String stackType;
        private @Nullable String subnetwork;
        private @Nullable String subnetworkProject;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfigs = defaults.accessConfigs;
    	      this.aliasIpRanges = defaults.aliasIpRanges;
    	      this.ipv6AccessConfigs = defaults.ipv6AccessConfigs;
    	      this.ipv6AccessType = defaults.ipv6AccessType;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkIp = defaults.networkIp;
    	      this.nicType = defaults.nicType;
    	      this.queueCount = defaults.queueCount;
    	      this.stackType = defaults.stackType;
    	      this.subnetwork = defaults.subnetwork;
    	      this.subnetworkProject = defaults.subnetworkProject;
        }

        public Builder accessConfigs(@Nullable List<InstanceTemplateNetworkInterfaceAccessConfig> accessConfigs) {
            this.accessConfigs = accessConfigs;
            return this;
        }

        public Builder aliasIpRanges(@Nullable List<InstanceTemplateNetworkInterfaceAliasIpRange> aliasIpRanges) {
            this.aliasIpRanges = aliasIpRanges;
            return this;
        }

        public Builder ipv6AccessConfigs(@Nullable List<InstanceTemplateNetworkInterfaceIpv6AccessConfig> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = ipv6AccessConfigs;
            return this;
        }

        public Builder ipv6AccessType(@Nullable String ipv6AccessType) {
            this.ipv6AccessType = ipv6AccessType;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = network;
            return this;
        }

        public Builder networkIp(@Nullable String networkIp) {
            this.networkIp = networkIp;
            return this;
        }

        public Builder nicType(@Nullable String nicType) {
            this.nicType = nicType;
            return this;
        }

        public Builder queueCount(@Nullable Integer queueCount) {
            this.queueCount = queueCount;
            return this;
        }

        public Builder stackType(@Nullable String stackType) {
            this.stackType = stackType;
            return this;
        }

        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder subnetworkProject(@Nullable String subnetworkProject) {
            this.subnetworkProject = subnetworkProject;
            return this;
        }
        public InstanceTemplateNetworkInterface build() {
            return new InstanceTemplateNetworkInterface(accessConfigs, aliasIpRanges, ipv6AccessConfigs, ipv6AccessType, name, network, networkIp, nicType, queueCount, stackType, subnetwork, subnetworkProject);
        }
    }
}
