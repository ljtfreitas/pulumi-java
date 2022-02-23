// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetArgs Empty = new SubnetArgs();

    /**
     * Specify true to indicate
     * that network interfaces created in the specified subnet should be
     * assigned an IPv6 address. Default is `false`
     * 
     */
    @InputImport(name="assignIpv6AddressOnCreation")
    private final @Nullable Input<Boolean> assignIpv6AddressOnCreation;

    public Input<Boolean> getAssignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation == null ? Input.empty() : this.assignIpv6AddressOnCreation;
    }

    /**
     * AZ for the subnet.
     * 
     */
    @InputImport(name="availabilityZone")
    private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    /**
     * AZ ID of the subnet. This argument is not supported in all regions or partitions. If necessary, use `availability_zone` instead.
     * 
     */
    @InputImport(name="availabilityZoneId")
    private final @Nullable Input<String> availabilityZoneId;

    public Input<String> getAvailabilityZoneId() {
        return this.availabilityZoneId == null ? Input.empty() : this.availabilityZoneId;
    }

    /**
     * The IPv4 CIDR block for the subnet.
     * 
     */
    @InputImport(name="cidrBlock")
    private final @Nullable Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock == null ? Input.empty() : this.cidrBlock;
    }

    /**
     * The customer owned IPv4 address pool. Typically used with the `map_customer_owned_ip_on_launch` argument. The `outpost_arn` argument must be specified when configured.
     * 
     */
    @InputImport(name="customerOwnedIpv4Pool")
    private final @Nullable Input<String> customerOwnedIpv4Pool;

    public Input<String> getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool == null ? Input.empty() : this.customerOwnedIpv4Pool;
    }

    /**
     * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return synthetic IPv6 addresses for IPv4-only destinations. Default: `false`.
     * 
     */
    @InputImport(name="enableDns64")
    private final @Nullable Input<Boolean> enableDns64;

    public Input<Boolean> getEnableDns64() {
        return this.enableDns64 == null ? Input.empty() : this.enableDns64;
    }

    /**
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records. Default: `false`.
     * 
     */
    @InputImport(name="enableResourceNameDnsARecordOnLaunch")
    private final @Nullable Input<Boolean> enableResourceNameDnsARecordOnLaunch;

    public Input<Boolean> getEnableResourceNameDnsARecordOnLaunch() {
        return this.enableResourceNameDnsARecordOnLaunch == null ? Input.empty() : this.enableResourceNameDnsARecordOnLaunch;
    }

    /**
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records. Default: `false`.
     * 
     */
    @InputImport(name="enableResourceNameDnsAaaaRecordOnLaunch")
    private final @Nullable Input<Boolean> enableResourceNameDnsAaaaRecordOnLaunch;

    public Input<Boolean> getEnableResourceNameDnsAaaaRecordOnLaunch() {
        return this.enableResourceNameDnsAaaaRecordOnLaunch == null ? Input.empty() : this.enableResourceNameDnsAaaaRecordOnLaunch;
    }

    /**
     * The IPv6 network range for the subnet,
     * in CIDR notation. The subnet size must use a /64 prefix length.
     * 
     */
    @InputImport(name="ipv6CidrBlock")
    private final @Nullable Input<String> ipv6CidrBlock;

    public Input<String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock == null ? Input.empty() : this.ipv6CidrBlock;
    }

    /**
     * Indicates whether to create an IPv6-only subnet. Default: `false`.
     * 
     */
    @InputImport(name="ipv6Native")
    private final @Nullable Input<Boolean> ipv6Native;

    public Input<Boolean> getIpv6Native() {
        return this.ipv6Native == null ? Input.empty() : this.ipv6Native;
    }

    /**
     * Specify `true` to indicate that network interfaces created in the subnet should be assigned a customer owned IP address. The `customer_owned_ipv4_pool` and `outpost_arn` arguments must be specified when set to `true`. Default is `false`.
     * 
     */
    @InputImport(name="mapCustomerOwnedIpOnLaunch")
    private final @Nullable Input<Boolean> mapCustomerOwnedIpOnLaunch;

    public Input<Boolean> getMapCustomerOwnedIpOnLaunch() {
        return this.mapCustomerOwnedIpOnLaunch == null ? Input.empty() : this.mapCustomerOwnedIpOnLaunch;
    }

    /**
     * Specify true to indicate
     * that instances launched into the subnet should be assigned
     * a public IP address. Default is `false`.
     * 
     */
    @InputImport(name="mapPublicIpOnLaunch")
    private final @Nullable Input<Boolean> mapPublicIpOnLaunch;

    public Input<Boolean> getMapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch == null ? Input.empty() : this.mapPublicIpOnLaunch;
    }

    /**
     * The Amazon Resource Name (ARN) of the Outpost.
     * 
     */
    @InputImport(name="outpostArn")
    private final @Nullable Input<String> outpostArn;

    public Input<String> getOutpostArn() {
        return this.outpostArn == null ? Input.empty() : this.outpostArn;
    }

    /**
     * The type of hostnames to assign to instances in the subnet at launch. For IPv4-only subnets, an instance DNS name must be based on the instance IPv4 address. For IPv6-only subnets, an instance DNS name must be based on the instance ID. For dual-stack subnets, you can specify whether DNS names use the instance IPv4 address or the instance ID. Valid values: `ip-name`, `resource-name`.
     * 
     */
    @InputImport(name="privateDnsHostnameTypeOnLaunch")
    private final @Nullable Input<String> privateDnsHostnameTypeOnLaunch;

    public Input<String> getPrivateDnsHostnameTypeOnLaunch() {
        return this.privateDnsHostnameTypeOnLaunch == null ? Input.empty() : this.privateDnsHostnameTypeOnLaunch;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The VPC ID.
     * 
     */
    @InputImport(name="vpcId", required=true)
    private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public SubnetArgs(
        @Nullable Input<Boolean> assignIpv6AddressOnCreation,
        @Nullable Input<String> availabilityZone,
        @Nullable Input<String> availabilityZoneId,
        @Nullable Input<String> cidrBlock,
        @Nullable Input<String> customerOwnedIpv4Pool,
        @Nullable Input<Boolean> enableDns64,
        @Nullable Input<Boolean> enableResourceNameDnsARecordOnLaunch,
        @Nullable Input<Boolean> enableResourceNameDnsAaaaRecordOnLaunch,
        @Nullable Input<String> ipv6CidrBlock,
        @Nullable Input<Boolean> ipv6Native,
        @Nullable Input<Boolean> mapCustomerOwnedIpOnLaunch,
        @Nullable Input<Boolean> mapPublicIpOnLaunch,
        @Nullable Input<String> outpostArn,
        @Nullable Input<String> privateDnsHostnameTypeOnLaunch,
        @Nullable Input<Map<String,String>> tags,
        Input<String> vpcId) {
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
        this.availabilityZone = availabilityZone;
        this.availabilityZoneId = availabilityZoneId;
        this.cidrBlock = cidrBlock;
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
        this.enableDns64 = enableDns64;
        this.enableResourceNameDnsARecordOnLaunch = enableResourceNameDnsARecordOnLaunch;
        this.enableResourceNameDnsAaaaRecordOnLaunch = enableResourceNameDnsAaaaRecordOnLaunch;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.ipv6Native = ipv6Native;
        this.mapCustomerOwnedIpOnLaunch = mapCustomerOwnedIpOnLaunch;
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
        this.outpostArn = outpostArn;
        this.privateDnsHostnameTypeOnLaunch = privateDnsHostnameTypeOnLaunch;
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private SubnetArgs() {
        this.assignIpv6AddressOnCreation = Input.empty();
        this.availabilityZone = Input.empty();
        this.availabilityZoneId = Input.empty();
        this.cidrBlock = Input.empty();
        this.customerOwnedIpv4Pool = Input.empty();
        this.enableDns64 = Input.empty();
        this.enableResourceNameDnsARecordOnLaunch = Input.empty();
        this.enableResourceNameDnsAaaaRecordOnLaunch = Input.empty();
        this.ipv6CidrBlock = Input.empty();
        this.ipv6Native = Input.empty();
        this.mapCustomerOwnedIpOnLaunch = Input.empty();
        this.mapPublicIpOnLaunch = Input.empty();
        this.outpostArn = Input.empty();
        this.privateDnsHostnameTypeOnLaunch = Input.empty();
        this.tags = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> assignIpv6AddressOnCreation;
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<String> availabilityZoneId;
        private @Nullable Input<String> cidrBlock;
        private @Nullable Input<String> customerOwnedIpv4Pool;
        private @Nullable Input<Boolean> enableDns64;
        private @Nullable Input<Boolean> enableResourceNameDnsARecordOnLaunch;
        private @Nullable Input<Boolean> enableResourceNameDnsAaaaRecordOnLaunch;
        private @Nullable Input<String> ipv6CidrBlock;
        private @Nullable Input<Boolean> ipv6Native;
        private @Nullable Input<Boolean> mapCustomerOwnedIpOnLaunch;
        private @Nullable Input<Boolean> mapPublicIpOnLaunch;
        private @Nullable Input<String> outpostArn;
        private @Nullable Input<String> privateDnsHostnameTypeOnLaunch;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignIpv6AddressOnCreation = defaults.assignIpv6AddressOnCreation;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.availabilityZoneId = defaults.availabilityZoneId;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.customerOwnedIpv4Pool = defaults.customerOwnedIpv4Pool;
    	      this.enableDns64 = defaults.enableDns64;
    	      this.enableResourceNameDnsARecordOnLaunch = defaults.enableResourceNameDnsARecordOnLaunch;
    	      this.enableResourceNameDnsAaaaRecordOnLaunch = defaults.enableResourceNameDnsAaaaRecordOnLaunch;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.ipv6Native = defaults.ipv6Native;
    	      this.mapCustomerOwnedIpOnLaunch = defaults.mapCustomerOwnedIpOnLaunch;
    	      this.mapPublicIpOnLaunch = defaults.mapPublicIpOnLaunch;
    	      this.outpostArn = defaults.outpostArn;
    	      this.privateDnsHostnameTypeOnLaunch = defaults.privateDnsHostnameTypeOnLaunch;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setAssignIpv6AddressOnCreation(@Nullable Input<Boolean> assignIpv6AddressOnCreation) {
            this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
            return this;
        }

        public Builder setAssignIpv6AddressOnCreation(@Nullable Boolean assignIpv6AddressOnCreation) {
            this.assignIpv6AddressOnCreation = Input.ofNullable(assignIpv6AddressOnCreation);
            return this;
        }

        public Builder setAvailabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder setAvailabilityZoneId(@Nullable Input<String> availabilityZoneId) {
            this.availabilityZoneId = availabilityZoneId;
            return this;
        }

        public Builder setAvailabilityZoneId(@Nullable String availabilityZoneId) {
            this.availabilityZoneId = Input.ofNullable(availabilityZoneId);
            return this;
        }

        public Builder setCidrBlock(@Nullable Input<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        public Builder setCidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Input.ofNullable(cidrBlock);
            return this;
        }

        public Builder setCustomerOwnedIpv4Pool(@Nullable Input<String> customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
            return this;
        }

        public Builder setCustomerOwnedIpv4Pool(@Nullable String customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = Input.ofNullable(customerOwnedIpv4Pool);
            return this;
        }

        public Builder setEnableDns64(@Nullable Input<Boolean> enableDns64) {
            this.enableDns64 = enableDns64;
            return this;
        }

        public Builder setEnableDns64(@Nullable Boolean enableDns64) {
            this.enableDns64 = Input.ofNullable(enableDns64);
            return this;
        }

        public Builder setEnableResourceNameDnsARecordOnLaunch(@Nullable Input<Boolean> enableResourceNameDnsARecordOnLaunch) {
            this.enableResourceNameDnsARecordOnLaunch = enableResourceNameDnsARecordOnLaunch;
            return this;
        }

        public Builder setEnableResourceNameDnsARecordOnLaunch(@Nullable Boolean enableResourceNameDnsARecordOnLaunch) {
            this.enableResourceNameDnsARecordOnLaunch = Input.ofNullable(enableResourceNameDnsARecordOnLaunch);
            return this;
        }

        public Builder setEnableResourceNameDnsAaaaRecordOnLaunch(@Nullable Input<Boolean> enableResourceNameDnsAaaaRecordOnLaunch) {
            this.enableResourceNameDnsAaaaRecordOnLaunch = enableResourceNameDnsAaaaRecordOnLaunch;
            return this;
        }

        public Builder setEnableResourceNameDnsAaaaRecordOnLaunch(@Nullable Boolean enableResourceNameDnsAaaaRecordOnLaunch) {
            this.enableResourceNameDnsAaaaRecordOnLaunch = Input.ofNullable(enableResourceNameDnsAaaaRecordOnLaunch);
            return this;
        }

        public Builder setIpv6CidrBlock(@Nullable Input<String> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        public Builder setIpv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = Input.ofNullable(ipv6CidrBlock);
            return this;
        }

        public Builder setIpv6Native(@Nullable Input<Boolean> ipv6Native) {
            this.ipv6Native = ipv6Native;
            return this;
        }

        public Builder setIpv6Native(@Nullable Boolean ipv6Native) {
            this.ipv6Native = Input.ofNullable(ipv6Native);
            return this;
        }

        public Builder setMapCustomerOwnedIpOnLaunch(@Nullable Input<Boolean> mapCustomerOwnedIpOnLaunch) {
            this.mapCustomerOwnedIpOnLaunch = mapCustomerOwnedIpOnLaunch;
            return this;
        }

        public Builder setMapCustomerOwnedIpOnLaunch(@Nullable Boolean mapCustomerOwnedIpOnLaunch) {
            this.mapCustomerOwnedIpOnLaunch = Input.ofNullable(mapCustomerOwnedIpOnLaunch);
            return this;
        }

        public Builder setMapPublicIpOnLaunch(@Nullable Input<Boolean> mapPublicIpOnLaunch) {
            this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
            return this;
        }

        public Builder setMapPublicIpOnLaunch(@Nullable Boolean mapPublicIpOnLaunch) {
            this.mapPublicIpOnLaunch = Input.ofNullable(mapPublicIpOnLaunch);
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

        public Builder setPrivateDnsHostnameTypeOnLaunch(@Nullable Input<String> privateDnsHostnameTypeOnLaunch) {
            this.privateDnsHostnameTypeOnLaunch = privateDnsHostnameTypeOnLaunch;
            return this;
        }

        public Builder setPrivateDnsHostnameTypeOnLaunch(@Nullable String privateDnsHostnameTypeOnLaunch) {
            this.privateDnsHostnameTypeOnLaunch = Input.ofNullable(privateDnsHostnameTypeOnLaunch);
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

        public Builder setVpcId(Input<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Input.of(Objects.requireNonNull(vpcId));
            return this;
        }
        public SubnetArgs build() {
            return new SubnetArgs(assignIpv6AddressOnCreation, availabilityZone, availabilityZoneId, cidrBlock, customerOwnedIpv4Pool, enableDns64, enableResourceNameDnsARecordOnLaunch, enableResourceNameDnsAaaaRecordOnLaunch, ipv6CidrBlock, ipv6Native, mapCustomerOwnedIpOnLaunch, mapPublicIpOnLaunch, outpostArn, privateDnsHostnameTypeOnLaunch, tags, vpcId);
        }
    }
}
