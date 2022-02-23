// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.NetworkInterfaceAttachmentGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInterfaceState extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceState Empty = new NetworkInterfaceState();

    /**
     * ARN of the network interface.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Configuration block to define the attachment of the ENI. See below.
     * 
     */
    @InputImport(name="attachments")
    private final @Nullable Input<List<NetworkInterfaceAttachmentGetArgs>> attachments;

    public Input<List<NetworkInterfaceAttachmentGetArgs>> getAttachments() {
        return this.attachments == null ? Input.empty() : this.attachments;
    }

    /**
     * Description for the network interface.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Type of network interface to create. Set to `efa` for Elastic Fabric Adapter. Changing `interface_type` will cause the resource to be destroyed and re-created.
     * 
     */
    @InputImport(name="interfaceType")
    private final @Nullable Input<String> interfaceType;

    public Input<String> getInterfaceType() {
        return this.interfaceType == null ? Input.empty() : this.interfaceType;
    }

    /**
     * Number of IPv4 prefixes that AWS automatically assigns to the network interface.
     * 
     */
    @InputImport(name="ipv4PrefixCount")
    private final @Nullable Input<Integer> ipv4PrefixCount;

    public Input<Integer> getIpv4PrefixCount() {
        return this.ipv4PrefixCount == null ? Input.empty() : this.ipv4PrefixCount;
    }

    /**
     * One or more IPv4 prefixes assigned to the network interface.
     * 
     */
    @InputImport(name="ipv4Prefixes")
    private final @Nullable Input<List<String>> ipv4Prefixes;

    public Input<List<String>> getIpv4Prefixes() {
        return this.ipv4Prefixes == null ? Input.empty() : this.ipv4Prefixes;
    }

    /**
     * Number of IPv6 addresses to assign to a network interface. You can't use this option if specifying specific `ipv6_addresses`. If your subnet has the AssignIpv6AddressOnCreation attribute set to `true`, you can specify `0` to override this setting.
     * 
     */
    @InputImport(name="ipv6AddressCount")
    private final @Nullable Input<Integer> ipv6AddressCount;

    public Input<Integer> getIpv6AddressCount() {
        return this.ipv6AddressCount == null ? Input.empty() : this.ipv6AddressCount;
    }

    @InputImport(name="ipv6AddressListEnabled")
    private final @Nullable Input<Boolean> ipv6AddressListEnabled;

    public Input<Boolean> getIpv6AddressListEnabled() {
        return this.ipv6AddressListEnabled == null ? Input.empty() : this.ipv6AddressListEnabled;
    }

    /**
     * List of private IPs to assign to the ENI in sequential order.
     * 
     */
    @InputImport(name="ipv6AddressLists")
    private final @Nullable Input<List<String>> ipv6AddressLists;

    public Input<List<String>> getIpv6AddressLists() {
        return this.ipv6AddressLists == null ? Input.empty() : this.ipv6AddressLists;
    }

    /**
     * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. Addresses are assigned without regard to order. You can't use this option if you're specifying `ipv6_address_count`.
     * 
     */
    @InputImport(name="ipv6Addresses")
    private final @Nullable Input<List<String>> ipv6Addresses;

    public Input<List<String>> getIpv6Addresses() {
        return this.ipv6Addresses == null ? Input.empty() : this.ipv6Addresses;
    }

    /**
     * Number of IPv6 prefixes that AWS automatically assigns to the network interface.
     * 
     */
    @InputImport(name="ipv6PrefixCount")
    private final @Nullable Input<Integer> ipv6PrefixCount;

    public Input<Integer> getIpv6PrefixCount() {
        return this.ipv6PrefixCount == null ? Input.empty() : this.ipv6PrefixCount;
    }

    /**
     * One or more IPv6 prefixes assigned to the network interface.
     * 
     */
    @InputImport(name="ipv6Prefixes")
    private final @Nullable Input<List<String>> ipv6Prefixes;

    public Input<List<String>> getIpv6Prefixes() {
        return this.ipv6Prefixes == null ? Input.empty() : this.ipv6Prefixes;
    }

    /**
     * MAC address of the network interface.
     * 
     */
    @InputImport(name="macAddress")
    private final @Nullable Input<String> macAddress;

    public Input<String> getMacAddress() {
        return this.macAddress == null ? Input.empty() : this.macAddress;
    }

    @InputImport(name="outpostArn")
    private final @Nullable Input<String> outpostArn;

    public Input<String> getOutpostArn() {
        return this.outpostArn == null ? Input.empty() : this.outpostArn;
    }

    /**
     * AWS account ID of the owner of the network interface.
     * 
     */
    @InputImport(name="ownerId")
    private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    /**
     * Private DNS name of the network interface (IPv4).
     * 
     */
    @InputImport(name="privateDnsName")
    private final @Nullable Input<String> privateDnsName;

    public Input<String> getPrivateDnsName() {
        return this.privateDnsName == null ? Input.empty() : this.privateDnsName;
    }

    @InputImport(name="privateIp")
    private final @Nullable Input<String> privateIp;

    public Input<String> getPrivateIp() {
        return this.privateIp == null ? Input.empty() : this.privateIp;
    }

    @InputImport(name="privateIpListEnabled")
    private final @Nullable Input<Boolean> privateIpListEnabled;

    public Input<Boolean> getPrivateIpListEnabled() {
        return this.privateIpListEnabled == null ? Input.empty() : this.privateIpListEnabled;
    }

    /**
     * List of private IPs to assign to the ENI in sequential order. Requires setting `private_ip_list_enable` to `true`.
     * 
     */
    @InputImport(name="privateIpLists")
    private final @Nullable Input<List<String>> privateIpLists;

    public Input<List<String>> getPrivateIpLists() {
        return this.privateIpLists == null ? Input.empty() : this.privateIpLists;
    }

    /**
     * List of private IPs to assign to the ENI without regard to order.
     * 
     */
    @InputImport(name="privateIps")
    private final @Nullable Input<List<String>> privateIps;

    public Input<List<String>> getPrivateIps() {
        return this.privateIps == null ? Input.empty() : this.privateIps;
    }

    /**
     * Number of secondary private IPs to assign to the ENI. The total number of private IPs will be 1 + `private_ips_count`, as a primary private IP will be assiged to an ENI by default.
     * 
     */
    @InputImport(name="privateIpsCount")
    private final @Nullable Input<Integer> privateIpsCount;

    public Input<Integer> getPrivateIpsCount() {
        return this.privateIpsCount == null ? Input.empty() : this.privateIpsCount;
    }

    /**
     * List of security group IDs to assign to the ENI.
     * 
     */
    @InputImport(name="securityGroups")
    private final @Nullable Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Input.empty() : this.securityGroups;
    }

    /**
     * Whether to enable source destination checking for the ENI. Default true.
     * 
     */
    @InputImport(name="sourceDestCheck")
    private final @Nullable Input<Boolean> sourceDestCheck;

    public Input<Boolean> getSourceDestCheck() {
        return this.sourceDestCheck == null ? Input.empty() : this.sourceDestCheck;
    }

    /**
     * Subnet ID to create the ENI in.
     * 
     */
    @InputImport(name="subnetId")
    private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    /**
     * Map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public NetworkInterfaceState(
        @Nullable Input<String> arn,
        @Nullable Input<List<NetworkInterfaceAttachmentGetArgs>> attachments,
        @Nullable Input<String> description,
        @Nullable Input<String> interfaceType,
        @Nullable Input<Integer> ipv4PrefixCount,
        @Nullable Input<List<String>> ipv4Prefixes,
        @Nullable Input<Integer> ipv6AddressCount,
        @Nullable Input<Boolean> ipv6AddressListEnabled,
        @Nullable Input<List<String>> ipv6AddressLists,
        @Nullable Input<List<String>> ipv6Addresses,
        @Nullable Input<Integer> ipv6PrefixCount,
        @Nullable Input<List<String>> ipv6Prefixes,
        @Nullable Input<String> macAddress,
        @Nullable Input<String> outpostArn,
        @Nullable Input<String> ownerId,
        @Nullable Input<String> privateDnsName,
        @Nullable Input<String> privateIp,
        @Nullable Input<Boolean> privateIpListEnabled,
        @Nullable Input<List<String>> privateIpLists,
        @Nullable Input<List<String>> privateIps,
        @Nullable Input<Integer> privateIpsCount,
        @Nullable Input<List<String>> securityGroups,
        @Nullable Input<Boolean> sourceDestCheck,
        @Nullable Input<String> subnetId,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
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
        this.macAddress = macAddress;
        this.outpostArn = outpostArn;
        this.ownerId = ownerId;
        this.privateDnsName = privateDnsName;
        this.privateIp = privateIp;
        this.privateIpListEnabled = privateIpListEnabled;
        this.privateIpLists = privateIpLists;
        this.privateIps = privateIps;
        this.privateIpsCount = privateIpsCount;
        this.securityGroups = securityGroups;
        this.sourceDestCheck = sourceDestCheck;
        this.subnetId = subnetId;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private NetworkInterfaceState() {
        this.arn = Input.empty();
        this.attachments = Input.empty();
        this.description = Input.empty();
        this.interfaceType = Input.empty();
        this.ipv4PrefixCount = Input.empty();
        this.ipv4Prefixes = Input.empty();
        this.ipv6AddressCount = Input.empty();
        this.ipv6AddressListEnabled = Input.empty();
        this.ipv6AddressLists = Input.empty();
        this.ipv6Addresses = Input.empty();
        this.ipv6PrefixCount = Input.empty();
        this.ipv6Prefixes = Input.empty();
        this.macAddress = Input.empty();
        this.outpostArn = Input.empty();
        this.ownerId = Input.empty();
        this.privateDnsName = Input.empty();
        this.privateIp = Input.empty();
        this.privateIpListEnabled = Input.empty();
        this.privateIpLists = Input.empty();
        this.privateIps = Input.empty();
        this.privateIpsCount = Input.empty();
        this.securityGroups = Input.empty();
        this.sourceDestCheck = Input.empty();
        this.subnetId = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<List<NetworkInterfaceAttachmentGetArgs>> attachments;
        private @Nullable Input<String> description;
        private @Nullable Input<String> interfaceType;
        private @Nullable Input<Integer> ipv4PrefixCount;
        private @Nullable Input<List<String>> ipv4Prefixes;
        private @Nullable Input<Integer> ipv6AddressCount;
        private @Nullable Input<Boolean> ipv6AddressListEnabled;
        private @Nullable Input<List<String>> ipv6AddressLists;
        private @Nullable Input<List<String>> ipv6Addresses;
        private @Nullable Input<Integer> ipv6PrefixCount;
        private @Nullable Input<List<String>> ipv6Prefixes;
        private @Nullable Input<String> macAddress;
        private @Nullable Input<String> outpostArn;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<String> privateDnsName;
        private @Nullable Input<String> privateIp;
        private @Nullable Input<Boolean> privateIpListEnabled;
        private @Nullable Input<List<String>> privateIpLists;
        private @Nullable Input<List<String>> privateIps;
        private @Nullable Input<Integer> privateIpsCount;
        private @Nullable Input<List<String>> securityGroups;
        private @Nullable Input<Boolean> sourceDestCheck;
        private @Nullable Input<String> subnetId;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
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
    	      this.macAddress = defaults.macAddress;
    	      this.outpostArn = defaults.outpostArn;
    	      this.ownerId = defaults.ownerId;
    	      this.privateDnsName = defaults.privateDnsName;
    	      this.privateIp = defaults.privateIp;
    	      this.privateIpListEnabled = defaults.privateIpListEnabled;
    	      this.privateIpLists = defaults.privateIpLists;
    	      this.privateIps = defaults.privateIps;
    	      this.privateIpsCount = defaults.privateIpsCount;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sourceDestCheck = defaults.sourceDestCheck;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAttachments(@Nullable Input<List<NetworkInterfaceAttachmentGetArgs>> attachments) {
            this.attachments = attachments;
            return this;
        }

        public Builder setAttachments(@Nullable List<NetworkInterfaceAttachmentGetArgs> attachments) {
            this.attachments = Input.ofNullable(attachments);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setInterfaceType(@Nullable Input<String> interfaceType) {
            this.interfaceType = interfaceType;
            return this;
        }

        public Builder setInterfaceType(@Nullable String interfaceType) {
            this.interfaceType = Input.ofNullable(interfaceType);
            return this;
        }

        public Builder setIpv4PrefixCount(@Nullable Input<Integer> ipv4PrefixCount) {
            this.ipv4PrefixCount = ipv4PrefixCount;
            return this;
        }

        public Builder setIpv4PrefixCount(@Nullable Integer ipv4PrefixCount) {
            this.ipv4PrefixCount = Input.ofNullable(ipv4PrefixCount);
            return this;
        }

        public Builder setIpv4Prefixes(@Nullable Input<List<String>> ipv4Prefixes) {
            this.ipv4Prefixes = ipv4Prefixes;
            return this;
        }

        public Builder setIpv4Prefixes(@Nullable List<String> ipv4Prefixes) {
            this.ipv4Prefixes = Input.ofNullable(ipv4Prefixes);
            return this;
        }

        public Builder setIpv6AddressCount(@Nullable Input<Integer> ipv6AddressCount) {
            this.ipv6AddressCount = ipv6AddressCount;
            return this;
        }

        public Builder setIpv6AddressCount(@Nullable Integer ipv6AddressCount) {
            this.ipv6AddressCount = Input.ofNullable(ipv6AddressCount);
            return this;
        }

        public Builder setIpv6AddressListEnabled(@Nullable Input<Boolean> ipv6AddressListEnabled) {
            this.ipv6AddressListEnabled = ipv6AddressListEnabled;
            return this;
        }

        public Builder setIpv6AddressListEnabled(@Nullable Boolean ipv6AddressListEnabled) {
            this.ipv6AddressListEnabled = Input.ofNullable(ipv6AddressListEnabled);
            return this;
        }

        public Builder setIpv6AddressLists(@Nullable Input<List<String>> ipv6AddressLists) {
            this.ipv6AddressLists = ipv6AddressLists;
            return this;
        }

        public Builder setIpv6AddressLists(@Nullable List<String> ipv6AddressLists) {
            this.ipv6AddressLists = Input.ofNullable(ipv6AddressLists);
            return this;
        }

        public Builder setIpv6Addresses(@Nullable Input<List<String>> ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }

        public Builder setIpv6Addresses(@Nullable List<String> ipv6Addresses) {
            this.ipv6Addresses = Input.ofNullable(ipv6Addresses);
            return this;
        }

        public Builder setIpv6PrefixCount(@Nullable Input<Integer> ipv6PrefixCount) {
            this.ipv6PrefixCount = ipv6PrefixCount;
            return this;
        }

        public Builder setIpv6PrefixCount(@Nullable Integer ipv6PrefixCount) {
            this.ipv6PrefixCount = Input.ofNullable(ipv6PrefixCount);
            return this;
        }

        public Builder setIpv6Prefixes(@Nullable Input<List<String>> ipv6Prefixes) {
            this.ipv6Prefixes = ipv6Prefixes;
            return this;
        }

        public Builder setIpv6Prefixes(@Nullable List<String> ipv6Prefixes) {
            this.ipv6Prefixes = Input.ofNullable(ipv6Prefixes);
            return this;
        }

        public Builder setMacAddress(@Nullable Input<String> macAddress) {
            this.macAddress = macAddress;
            return this;
        }

        public Builder setMacAddress(@Nullable String macAddress) {
            this.macAddress = Input.ofNullable(macAddress);
            return this;
        }

        public Builder setOutpostArn(@Nullable Input<String> outpostArn) {
            this.outpostArn = outpostArn;
            return this;
        }

        public Builder setOutpostArn(@Nullable String outpostArn) {
            this.outpostArn = Input.ofNullable(outpostArn);
            return this;
        }

        public Builder setOwnerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }

        public Builder setPrivateDnsName(@Nullable Input<String> privateDnsName) {
            this.privateDnsName = privateDnsName;
            return this;
        }

        public Builder setPrivateDnsName(@Nullable String privateDnsName) {
            this.privateDnsName = Input.ofNullable(privateDnsName);
            return this;
        }

        public Builder setPrivateIp(@Nullable Input<String> privateIp) {
            this.privateIp = privateIp;
            return this;
        }

        public Builder setPrivateIp(@Nullable String privateIp) {
            this.privateIp = Input.ofNullable(privateIp);
            return this;
        }

        public Builder setPrivateIpListEnabled(@Nullable Input<Boolean> privateIpListEnabled) {
            this.privateIpListEnabled = privateIpListEnabled;
            return this;
        }

        public Builder setPrivateIpListEnabled(@Nullable Boolean privateIpListEnabled) {
            this.privateIpListEnabled = Input.ofNullable(privateIpListEnabled);
            return this;
        }

        public Builder setPrivateIpLists(@Nullable Input<List<String>> privateIpLists) {
            this.privateIpLists = privateIpLists;
            return this;
        }

        public Builder setPrivateIpLists(@Nullable List<String> privateIpLists) {
            this.privateIpLists = Input.ofNullable(privateIpLists);
            return this;
        }

        public Builder setPrivateIps(@Nullable Input<List<String>> privateIps) {
            this.privateIps = privateIps;
            return this;
        }

        public Builder setPrivateIps(@Nullable List<String> privateIps) {
            this.privateIps = Input.ofNullable(privateIps);
            return this;
        }

        public Builder setPrivateIpsCount(@Nullable Input<Integer> privateIpsCount) {
            this.privateIpsCount = privateIpsCount;
            return this;
        }

        public Builder setPrivateIpsCount(@Nullable Integer privateIpsCount) {
            this.privateIpsCount = Input.ofNullable(privateIpsCount);
            return this;
        }

        public Builder setSecurityGroups(@Nullable Input<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Input.ofNullable(securityGroups);
            return this;
        }

        public Builder setSourceDestCheck(@Nullable Input<Boolean> sourceDestCheck) {
            this.sourceDestCheck = sourceDestCheck;
            return this;
        }

        public Builder setSourceDestCheck(@Nullable Boolean sourceDestCheck) {
            this.sourceDestCheck = Input.ofNullable(sourceDestCheck);
            return this;
        }

        public Builder setSubnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public NetworkInterfaceState build() {
            return new NetworkInterfaceState(arn, attachments, description, interfaceType, ipv4PrefixCount, ipv4Prefixes, ipv6AddressCount, ipv6AddressListEnabled, ipv6AddressLists, ipv6Addresses, ipv6PrefixCount, ipv6Prefixes, macAddress, outpostArn, ownerId, privateDnsName, privateIp, privateIpListEnabled, privateIpLists, privateIps, privateIpsCount, securityGroups, sourceDestCheck, subnetId, tags, tagsAll);
        }
    }
}