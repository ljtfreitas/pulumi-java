// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceAccessConfigGetArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceIpv6AccessConfigGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceTemplateNetworkInterfaceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateNetworkInterfaceGetArgs Empty = new InstanceTemplateNetworkInterfaceGetArgs();

    /**
     * Access configurations, i.e. IPs via which this
     * instance can be accessed via the Internet. Omit to ensure that the instance
     * is not accessible from the Internet (this means that ssh provisioners will
     * not work unless you can send traffic to the instance's
     * network (e.g. via tunnel or because it is running on another cloud instance
     * on that network). This block can be repeated multiple times. Structure documented below.
     * 
     */
    @Import(name="accessConfigs")
      private final @Nullable Output<List<InstanceTemplateNetworkInterfaceAccessConfigGetArgs>> accessConfigs;

    public Output<List<InstanceTemplateNetworkInterfaceAccessConfigGetArgs>> accessConfigs() {
        return this.accessConfigs == null ? Codegen.empty() : this.accessConfigs;
    }

    /**
     * An
     * array of alias IP ranges for this network interface. Can only be specified for network
     * interfaces on subnet-mode networks. Structure documented below.
     * 
     */
    @Import(name="aliasIpRanges")
      private final @Nullable Output<List<InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs>> aliasIpRanges;

    public Output<List<InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs>> aliasIpRanges() {
        return this.aliasIpRanges == null ? Codegen.empty() : this.aliasIpRanges;
    }

    /**
     * An array of IPv6 access configurations for this interface.
     * Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig
     * specified, then this instance will have no external IPv6 Internet access. Structure documented below.
     * 
     */
    @Import(name="ipv6AccessConfigs")
      private final @Nullable Output<List<InstanceTemplateNetworkInterfaceIpv6AccessConfigGetArgs>> ipv6AccessConfigs;

    public Output<List<InstanceTemplateNetworkInterfaceIpv6AccessConfigGetArgs>> ipv6AccessConfigs() {
        return this.ipv6AccessConfigs == null ? Codegen.empty() : this.ipv6AccessConfigs;
    }

    @Import(name="ipv6AccessType")
      private final @Nullable Output<String> ipv6AccessType;

    public Output<String> ipv6AccessType() {
        return this.ipv6AccessType == null ? Codegen.empty() : this.ipv6AccessType;
    }

    /**
     * The name of the instance template. If you leave
     * this blank, the provider will auto-generate a unique name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The name or self_link of the network to attach this interface to.
     * Use `network` attribute for Legacy or Auto subnetted networks and
     * `subnetwork` for custom subnetted networks.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * The private IP address to assign to the instance. If
     * empty, the address will be automatically assigned.
     * 
     */
    @Import(name="networkIp")
      private final @Nullable Output<String> networkIp;

    public Output<String> networkIp() {
        return this.networkIp == null ? Codegen.empty() : this.networkIp;
    }

    /**
     * The type of vNIC to be used on this interface. Possible values: GVNIC, VIRTIO_NET.
     * 
     */
    @Import(name="nicType")
      private final @Nullable Output<String> nicType;

    public Output<String> nicType() {
        return this.nicType == null ? Codegen.empty() : this.nicType;
    }

    /**
     * The networking queue count that's specified by users for the network interface. Both Rx and Tx queues will be set to this number. It will be empty if not specified.
     * 
     */
    @Import(name="queueCount")
      private final @Nullable Output<Integer> queueCount;

    public Output<Integer> queueCount() {
        return this.queueCount == null ? Codegen.empty() : this.queueCount;
    }

    /**
     * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. Values are IPV4_IPV6 or IPV4_ONLY. If not specified, IPV4_ONLY will be used.
     * 
     */
    @Import(name="stackType")
      private final @Nullable Output<String> stackType;

    public Output<String> stackType() {
        return this.stackType == null ? Codegen.empty() : this.stackType;
    }

    /**
     * the name of the subnetwork to attach this interface
     * to. The subnetwork must exist in the same `region` this instance will be
     * created in. Either `network` or `subnetwork` must be provided.
     * 
     */
    @Import(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> subnetwork() {
        return this.subnetwork == null ? Codegen.empty() : this.subnetwork;
    }

    /**
     * The ID of the project in which the subnetwork belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="subnetworkProject")
      private final @Nullable Output<String> subnetworkProject;

    public Output<String> subnetworkProject() {
        return this.subnetworkProject == null ? Codegen.empty() : this.subnetworkProject;
    }

    public InstanceTemplateNetworkInterfaceGetArgs(
        @Nullable Output<List<InstanceTemplateNetworkInterfaceAccessConfigGetArgs>> accessConfigs,
        @Nullable Output<List<InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs>> aliasIpRanges,
        @Nullable Output<List<InstanceTemplateNetworkInterfaceIpv6AccessConfigGetArgs>> ipv6AccessConfigs,
        @Nullable Output<String> ipv6AccessType,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<String> networkIp,
        @Nullable Output<String> nicType,
        @Nullable Output<Integer> queueCount,
        @Nullable Output<String> stackType,
        @Nullable Output<String> subnetwork,
        @Nullable Output<String> subnetworkProject) {
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

    private InstanceTemplateNetworkInterfaceGetArgs() {
        this.accessConfigs = Codegen.empty();
        this.aliasIpRanges = Codegen.empty();
        this.ipv6AccessConfigs = Codegen.empty();
        this.ipv6AccessType = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.networkIp = Codegen.empty();
        this.nicType = Codegen.empty();
        this.queueCount = Codegen.empty();
        this.stackType = Codegen.empty();
        this.subnetwork = Codegen.empty();
        this.subnetworkProject = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateNetworkInterfaceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<InstanceTemplateNetworkInterfaceAccessConfigGetArgs>> accessConfigs;
        private @Nullable Output<List<InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs>> aliasIpRanges;
        private @Nullable Output<List<InstanceTemplateNetworkInterfaceIpv6AccessConfigGetArgs>> ipv6AccessConfigs;
        private @Nullable Output<String> ipv6AccessType;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<String> networkIp;
        private @Nullable Output<String> nicType;
        private @Nullable Output<Integer> queueCount;
        private @Nullable Output<String> stackType;
        private @Nullable Output<String> subnetwork;
        private @Nullable Output<String> subnetworkProject;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateNetworkInterfaceGetArgs defaults) {
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

        public Builder accessConfigs(@Nullable Output<List<InstanceTemplateNetworkInterfaceAccessConfigGetArgs>> accessConfigs) {
            this.accessConfigs = accessConfigs;
            return this;
        }
        public Builder accessConfigs(@Nullable List<InstanceTemplateNetworkInterfaceAccessConfigGetArgs> accessConfigs) {
            this.accessConfigs = Codegen.ofNullable(accessConfigs);
            return this;
        }
        public Builder accessConfigs(InstanceTemplateNetworkInterfaceAccessConfigGetArgs... accessConfigs) {
            return accessConfigs(List.of(accessConfigs));
        }
        public Builder aliasIpRanges(@Nullable Output<List<InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs>> aliasIpRanges) {
            this.aliasIpRanges = aliasIpRanges;
            return this;
        }
        public Builder aliasIpRanges(@Nullable List<InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs> aliasIpRanges) {
            this.aliasIpRanges = Codegen.ofNullable(aliasIpRanges);
            return this;
        }
        public Builder aliasIpRanges(InstanceTemplateNetworkInterfaceAliasIpRangeGetArgs... aliasIpRanges) {
            return aliasIpRanges(List.of(aliasIpRanges));
        }
        public Builder ipv6AccessConfigs(@Nullable Output<List<InstanceTemplateNetworkInterfaceIpv6AccessConfigGetArgs>> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = ipv6AccessConfigs;
            return this;
        }
        public Builder ipv6AccessConfigs(@Nullable List<InstanceTemplateNetworkInterfaceIpv6AccessConfigGetArgs> ipv6AccessConfigs) {
            this.ipv6AccessConfigs = Codegen.ofNullable(ipv6AccessConfigs);
            return this;
        }
        public Builder ipv6AccessConfigs(InstanceTemplateNetworkInterfaceIpv6AccessConfigGetArgs... ipv6AccessConfigs) {
            return ipv6AccessConfigs(List.of(ipv6AccessConfigs));
        }
        public Builder ipv6AccessType(@Nullable Output<String> ipv6AccessType) {
            this.ipv6AccessType = ipv6AccessType;
            return this;
        }
        public Builder ipv6AccessType(@Nullable String ipv6AccessType) {
            this.ipv6AccessType = Codegen.ofNullable(ipv6AccessType);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder networkIp(@Nullable Output<String> networkIp) {
            this.networkIp = networkIp;
            return this;
        }
        public Builder networkIp(@Nullable String networkIp) {
            this.networkIp = Codegen.ofNullable(networkIp);
            return this;
        }
        public Builder nicType(@Nullable Output<String> nicType) {
            this.nicType = nicType;
            return this;
        }
        public Builder nicType(@Nullable String nicType) {
            this.nicType = Codegen.ofNullable(nicType);
            return this;
        }
        public Builder queueCount(@Nullable Output<Integer> queueCount) {
            this.queueCount = queueCount;
            return this;
        }
        public Builder queueCount(@Nullable Integer queueCount) {
            this.queueCount = Codegen.ofNullable(queueCount);
            return this;
        }
        public Builder stackType(@Nullable Output<String> stackType) {
            this.stackType = stackType;
            return this;
        }
        public Builder stackType(@Nullable String stackType) {
            this.stackType = Codegen.ofNullable(stackType);
            return this;
        }
        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Codegen.ofNullable(subnetwork);
            return this;
        }
        public Builder subnetworkProject(@Nullable Output<String> subnetworkProject) {
            this.subnetworkProject = subnetworkProject;
            return this;
        }
        public Builder subnetworkProject(@Nullable String subnetworkProject) {
            this.subnetworkProject = Codegen.ofNullable(subnetworkProject);
            return this;
        }        public InstanceTemplateNetworkInterfaceGetArgs build() {
            return new InstanceTemplateNetworkInterfaceGetArgs(accessConfigs, aliasIpRanges, ipv6AccessConfigs, ipv6AccessType, name, network, networkIp, nicType, queueCount, stackType, subnetwork, subnetworkProject);
        }
    }
}
