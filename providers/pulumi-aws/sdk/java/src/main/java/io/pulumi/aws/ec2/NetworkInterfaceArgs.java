// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.NetworkInterfaceAttachmentArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceArgs Empty = new NetworkInterfaceArgs();

    /**
     * Configuration block to define the attachment of the ENI. See below.
     * 
     */
    @Import(name="attachments")
      private final @Nullable Output<List<NetworkInterfaceAttachmentArgs>> attachments;

    public Output<List<NetworkInterfaceAttachmentArgs>> getAttachments() {
        return this.attachments == null ? Output.empty() : this.attachments;
    }

    /**
     * Description for the network interface.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Type of network interface to create. Set to `efa` for Elastic Fabric Adapter. Changing `interface_type` will cause the resource to be destroyed and re-created.
     * 
     */
    @Import(name="interfaceType")
      private final @Nullable Output<String> interfaceType;

    public Output<String> getInterfaceType() {
        return this.interfaceType == null ? Output.empty() : this.interfaceType;
    }

    /**
     * Number of IPv4 prefixes that AWS automatically assigns to the network interface.
     * 
     */
    @Import(name="ipv4PrefixCount")
      private final @Nullable Output<Integer> ipv4PrefixCount;

    public Output<Integer> getIpv4PrefixCount() {
        return this.ipv4PrefixCount == null ? Output.empty() : this.ipv4PrefixCount;
    }

    /**
     * One or more IPv4 prefixes assigned to the network interface.
     * 
     */
    @Import(name="ipv4Prefixes")
      private final @Nullable Output<List<String>> ipv4Prefixes;

    public Output<List<String>> getIpv4Prefixes() {
        return this.ipv4Prefixes == null ? Output.empty() : this.ipv4Prefixes;
    }

    /**
     * Number of IPv6 addresses to assign to a network interface. You can't use this option if specifying specific `ipv6_addresses`. If your subnet has the AssignIpv6AddressOnCreation attribute set to `true`, you can specify `0` to override this setting.
     * 
     */
    @Import(name="ipv6AddressCount")
      private final @Nullable Output<Integer> ipv6AddressCount;

    public Output<Integer> getIpv6AddressCount() {
        return this.ipv6AddressCount == null ? Output.empty() : this.ipv6AddressCount;
    }

    @Import(name="ipv6AddressListEnabled")
      private final @Nullable Output<Boolean> ipv6AddressListEnabled;

    public Output<Boolean> getIpv6AddressListEnabled() {
        return this.ipv6AddressListEnabled == null ? Output.empty() : this.ipv6AddressListEnabled;
    }

    /**
     * List of private IPs to assign to the ENI in sequential order.
     * 
     */
    @Import(name="ipv6AddressLists")
      private final @Nullable Output<List<String>> ipv6AddressLists;

    public Output<List<String>> getIpv6AddressLists() {
        return this.ipv6AddressLists == null ? Output.empty() : this.ipv6AddressLists;
    }

    /**
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. Addresses are assigned without regard to order. You can't use this option if you're specifying `ipv6_address_count`.
     * 
     */
    @Import(name="ipv6Addresses")
      private final @Nullable Output<List<String>> ipv6Addresses;

    public Output<List<String>> getIpv6Addresses() {
        return this.ipv6Addresses == null ? Output.empty() : this.ipv6Addresses;
    }

    /**
     * Number of IPv6 prefixes that AWS automatically assigns to the network interface.
     * 
     */
    @Import(name="ipv6PrefixCount")
      private final @Nullable Output<Integer> ipv6PrefixCount;

    public Output<Integer> getIpv6PrefixCount() {
        return this.ipv6PrefixCount == null ? Output.empty() : this.ipv6PrefixCount;
    }

    /**
     * One or more IPv6 prefixes assigned to the network interface.
     * 
     */
    @Import(name="ipv6Prefixes")
      private final @Nullable Output<List<String>> ipv6Prefixes;

    public Output<List<String>> getIpv6Prefixes() {
        return this.ipv6Prefixes == null ? Output.empty() : this.ipv6Prefixes;
    }

    @Import(name="privateIp")
      private final @Nullable Output<String> privateIp;

    public Output<String> getPrivateIp() {
        return this.privateIp == null ? Output.empty() : this.privateIp;
    }

    @Import(name="privateIpListEnabled")
      private final @Nullable Output<Boolean> privateIpListEnabled;

    public Output<Boolean> getPrivateIpListEnabled() {
        return this.privateIpListEnabled == null ? Output.empty() : this.privateIpListEnabled;
    }

    /**
     * List of private IPs to assign to the ENI in sequential order. Requires setting `private_ip_list_enable` to `true`.
     * 
     */
    @Import(name="privateIpLists")
      private final @Nullable Output<List<String>> privateIpLists;

    public Output<List<String>> getPrivateIpLists() {
        return this.privateIpLists == null ? Output.empty() : this.privateIpLists;
    }

    /**
     * List of private IPs to assign to the ENI without regard to order.
     * 
     */
    @Import(name="privateIps")
      private final @Nullable Output<List<String>> privateIps;

    public Output<List<String>> getPrivateIps() {
        return this.privateIps == null ? Output.empty() : this.privateIps;
    }

    /**
     * Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + `private_ips_count`, as a primary private IP will be assiged to an ENI by default.
     * 
     */
    @Import(name="privateIpsCount")
      private final @Nullable Output<Integer> privateIpsCount;

    public Output<Integer> getPrivateIpsCount() {
        return this.privateIpsCount == null ? Output.empty() : this.privateIpsCount;
    }

    /**
     * List of security group IDs to assign to the ENI.
     * 
     */
    @Import(name="securityGroups")
      private final @Nullable Output<List<String>> securityGroups;

    public Output<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Output.empty() : this.securityGroups;
    }

    /**
     * Whether to enable source destination checking for the ENI. Default true.
     * 
     */
    @Import(name="sourceDestCheck")
      private final @Nullable Output<Boolean> sourceDestCheck;

    public Output<Boolean> getSourceDestCheck() {
        return this.sourceDestCheck == null ? Output.empty() : this.sourceDestCheck;
    }

    /**
     * Subnet ID to create the ENI in.
     * 
     */
    @Import(name="subnetId", required=true)
      private final Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId;
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public NetworkInterfaceArgs(
        @Nullable Output<List<NetworkInterfaceAttachmentArgs>> attachments,
        @Nullable Output<String> description,
        @Nullable Output<String> interfaceType,
        @Nullable Output<Integer> ipv4PrefixCount,
        @Nullable Output<List<String>> ipv4Prefixes,
        @Nullable Output<Integer> ipv6AddressCount,
        @Nullable Output<Boolean> ipv6AddressListEnabled,
        @Nullable Output<List<String>> ipv6AddressLists,
        @Nullable Output<List<String>> ipv6Addresses,
        @Nullable Output<Integer> ipv6PrefixCount,
        @Nullable Output<List<String>> ipv6Prefixes,
        @Nullable Output<String> privateIp,
        @Nullable Output<Boolean> privateIpListEnabled,
        @Nullable Output<List<String>> privateIpLists,
        @Nullable Output<List<String>> privateIps,
        @Nullable Output<Integer> privateIpsCount,
        @Nullable Output<List<String>> securityGroups,
        @Nullable Output<Boolean> sourceDestCheck,
        Output<String> subnetId,
        @Nullable Output<Map<String,String>> tags) {
        this.attachments = attachments;
        this.description = description;
        this.interfaceType = interfaceType;
        this.ipv4PrefixCount = ipv4PrefixCount;
        this.ipv4Prefixes = ipv4Prefixes;
        this.ipv6AddressCount = ipv6AddressCount;
        this.ipv6AddressListEnabled = ipv6AddressListEnabled;
        this.ipv6AddressLists = ipv6AddressLists;
        this.ipv6Addresses = ipv6Addresses;
        this.ipv6PrefixCount = ipv6PrefixCount;
        this.ipv6Prefixes = ipv6Prefixes;
        this.privateIp = privateIp;
        this.privateIpListEnabled = privateIpListEnabled;
        this.privateIpLists = privateIpLists;
        this.privateIps = privateIps;
        this.privateIpsCount = privateIpsCount;
        this.securityGroups = securityGroups;
        this.sourceDestCheck = sourceDestCheck;
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
        this.tags = tags;
    }

    private NetworkInterfaceArgs() {
        this.attachments = Output.empty();
        this.description = Output.empty();
        this.interfaceType = Output.empty();
        this.ipv4PrefixCount = Output.empty();
        this.ipv4Prefixes = Output.empty();
        this.ipv6AddressCount = Output.empty();
        this.ipv6AddressListEnabled = Output.empty();
        this.ipv6AddressLists = Output.empty();
        this.ipv6Addresses = Output.empty();
        this.ipv6PrefixCount = Output.empty();
        this.ipv6Prefixes = Output.empty();
        this.privateIp = Output.empty();
        this.privateIpListEnabled = Output.empty();
        this.privateIpLists = Output.empty();
        this.privateIps = Output.empty();
        this.privateIpsCount = Output.empty();
        this.securityGroups = Output.empty();
        this.sourceDestCheck = Output.empty();
        this.subnetId = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<NetworkInterfaceAttachmentArgs>> attachments;
        private @Nullable Output<String> description;
        private @Nullable Output<String> interfaceType;
        private @Nullable Output<Integer> ipv4PrefixCount;
        private @Nullable Output<List<String>> ipv4Prefixes;
        private @Nullable Output<Integer> ipv6AddressCount;
        private @Nullable Output<Boolean> ipv6AddressListEnabled;
        private @Nullable Output<List<String>> ipv6AddressLists;
        private @Nullable Output<List<String>> ipv6Addresses;
        private @Nullable Output<Integer> ipv6PrefixCount;
        private @Nullable Output<List<String>> ipv6Prefixes;
        private @Nullable Output<String> privateIp;
        private @Nullable Output<Boolean> privateIpListEnabled;
        private @Nullable Output<List<String>> privateIpLists;
        private @Nullable Output<List<String>> privateIps;
        private @Nullable Output<Integer> privateIpsCount;
        private @Nullable Output<List<String>> securityGroups;
        private @Nullable Output<Boolean> sourceDestCheck;
        private Output<String> subnetId;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachments = defaults.attachments;
    	      this.description = defaults.description;
    	      this.interfaceType = defaults.interfaceType;
    	      this.ipv4PrefixCount = defaults.ipv4PrefixCount;
    	      this.ipv4Prefixes = defaults.ipv4Prefixes;
    	      this.ipv6AddressCount = defaults.ipv6AddressCount;
    	      this.ipv6AddressListEnabled = defaults.ipv6AddressListEnabled;
    	      this.ipv6AddressLists = defaults.ipv6AddressLists;
    	      this.ipv6Addresses = defaults.ipv6Addresses;
    	      this.ipv6PrefixCount = defaults.ipv6PrefixCount;
    	      this.ipv6Prefixes = defaults.ipv6Prefixes;
    	      this.privateIp = defaults.privateIp;
    	      this.privateIpListEnabled = defaults.privateIpListEnabled;
    	      this.privateIpLists = defaults.privateIpLists;
    	      this.privateIps = defaults.privateIps;
    	      this.privateIpsCount = defaults.privateIpsCount;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sourceDestCheck = defaults.sourceDestCheck;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
        }

        public Builder attachments(@Nullable Output<List<NetworkInterfaceAttachmentArgs>> attachments) {
            this.attachments = attachments;
            return this;
        }

        public Builder attachments(@Nullable List<NetworkInterfaceAttachmentArgs> attachments) {
            this.attachments = Output.ofNullable(attachments);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder interfaceType(@Nullable Output<String> interfaceType) {
            this.interfaceType = interfaceType;
            return this;
        }

        public Builder interfaceType(@Nullable String interfaceType) {
            this.interfaceType = Output.ofNullable(interfaceType);
            return this;
        }

        public Builder ipv4PrefixCount(@Nullable Output<Integer> ipv4PrefixCount) {
            this.ipv4PrefixCount = ipv4PrefixCount;
            return this;
        }

        public Builder ipv4PrefixCount(@Nullable Integer ipv4PrefixCount) {
            this.ipv4PrefixCount = Output.ofNullable(ipv4PrefixCount);
            return this;
        }

        public Builder ipv4Prefixes(@Nullable Output<List<String>> ipv4Prefixes) {
            this.ipv4Prefixes = ipv4Prefixes;
            return this;
        }

        public Builder ipv4Prefixes(@Nullable List<String> ipv4Prefixes) {
            this.ipv4Prefixes = Output.ofNullable(ipv4Prefixes);
            return this;
        }

        public Builder ipv6AddressCount(@Nullable Output<Integer> ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        public Builder ipv6AddressCount(@Nullable Integer ipv6AddressCount) {
            this.ipv6AddressCount = Output.ofNullable(ipv6AddressCount);
            return this;
        }

        public Builder ipv6AddressListEnabled(@Nullable Output<Boolean> ipv6AddressListEnabled) {
            this.ipv6AddressListEnabled = ipv6AddressListEnabled;
            return this;
        }

        public Builder ipv6AddressListEnabled(@Nullable Boolean ipv6AddressListEnabled) {
            this.ipv6AddressListEnabled = Output.ofNullable(ipv6AddressListEnabled);
            return this;
        }

        public Builder ipv6AddressLists(@Nullable Output<List<String>> ipv6AddressLists) {
            this.ipv6AddressLists = ipv6AddressLists;
            return this;
        }

        public Builder ipv6AddressLists(@Nullable List<String> ipv6AddressLists) {
            this.ipv6AddressLists = Output.ofNullable(ipv6AddressLists);
            return this;
        }

        public Builder ipv6Addresses(@Nullable Output<List<String>> ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }

        public Builder ipv6Addresses(@Nullable List<String> ipv6Addresses) {
            this.ipv6Addresses = Output.ofNullable(ipv6Addresses);
            return this;
        }

        public Builder ipv6PrefixCount(@Nullable Output<Integer> ipv6PrefixCount) {
            this.ipv6PrefixCount = ipv6PrefixCount;
            return this;
        }

        public Builder ipv6PrefixCount(@Nullable Integer ipv6PrefixCount) {
            this.ipv6PrefixCount = Output.ofNullable(ipv6PrefixCount);
            return this;
        }

        public Builder ipv6Prefixes(@Nullable Output<List<String>> ipv6Prefixes) {
            this.ipv6Prefixes = ipv6Prefixes;
            return this;
        }

        public Builder ipv6Prefixes(@Nullable List<String> ipv6Prefixes) {
            this.ipv6Prefixes = Output.ofNullable(ipv6Prefixes);
            return this;
        }

        public Builder privateIp(@Nullable Output<String> privateIp) {
            this.privateIp = privateIp;
            return this;
        }

        public Builder privateIp(@Nullable String privateIp) {
            this.privateIp = Output.ofNullable(privateIp);
            return this;
        }

        public Builder privateIpListEnabled(@Nullable Output<Boolean> privateIpListEnabled) {
            this.privateIpListEnabled = privateIpListEnabled;
            return this;
        }

        public Builder privateIpListEnabled(@Nullable Boolean privateIpListEnabled) {
            this.privateIpListEnabled = Output.ofNullable(privateIpListEnabled);
            return this;
        }

        public Builder privateIpLists(@Nullable Output<List<String>> privateIpLists) {
            this.privateIpLists = privateIpLists;
            return this;
        }

        public Builder privateIpLists(@Nullable List<String> privateIpLists) {
            this.privateIpLists = Output.ofNullable(privateIpLists);
            return this;
        }

        public Builder privateIps(@Nullable Output<List<String>> privateIps) {
            this.privateIps = privateIps;
            return this;
        }

        public Builder privateIps(@Nullable List<String> privateIps) {
            this.privateIps = Output.ofNullable(privateIps);
            return this;
        }

        public Builder privateIpsCount(@Nullable Output<Integer> privateIpsCount) {
            this.privateIpsCount = privateIpsCount;
            return this;
        }

        public Builder privateIpsCount(@Nullable Integer privateIpsCount) {
            this.privateIpsCount = Output.ofNullable(privateIpsCount);
            return this;
        }

        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Output.ofNullable(securityGroups);
            return this;
        }

        public Builder sourceDestCheck(@Nullable Output<Boolean> sourceDestCheck) {
            this.sourceDestCheck = sourceDestCheck;
            return this;
        }

        public Builder sourceDestCheck(@Nullable Boolean sourceDestCheck) {
            this.sourceDestCheck = Output.ofNullable(sourceDestCheck);
            return this;
        }

        public Builder subnetId(Output<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder subnetId(String subnetId) {
            this.subnetId = Output.of(Objects.requireNonNull(subnetId));
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
        public NetworkInterfaceArgs build() {
            return new NetworkInterfaceArgs(attachments, description, interfaceType, ipv4PrefixCount, ipv4Prefixes, ipv6AddressCount, ipv6AddressListEnabled, ipv6AddressLists, ipv6Addresses, ipv6PrefixCount, ipv6Prefixes, privateIp, privateIpListEnabled, privateIpLists, privateIps, privateIpsCount, securityGroups, sourceDestCheck, subnetId, tags);
        }
    }
}
