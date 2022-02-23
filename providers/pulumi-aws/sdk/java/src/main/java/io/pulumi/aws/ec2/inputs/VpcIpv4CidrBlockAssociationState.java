// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcIpv4CidrBlockAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final VpcIpv4CidrBlockAssociationState Empty = new VpcIpv4CidrBlockAssociationState();

    /**
     * The IPv4 CIDR block for the VPC. CIDR can be explicitly set or it can be derived from IPAM using `ipv4_netmask_length`.
     * 
     */
    @InputImport(name="cidrBlock")
    private final @Nullable Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock == null ? Input.empty() : this.cidrBlock;
    }

    /**
     * The ID of an IPv4 IPAM pool you want to use for allocating this VPC's CIDR. IPAM is a VPC feature that you can use to automate your IP address management workflows including assigning, tracking, troubleshooting, and auditing IP addresses across AWS Regions and accounts. Using IPAM you can monitor IP address usage throughout your AWS Organization.
     * 
     */
    @InputImport(name="ipv4IpamPoolId")
    private final @Nullable Input<String> ipv4IpamPoolId;

    public Input<String> getIpv4IpamPoolId() {
        return this.ipv4IpamPoolId == null ? Input.empty() : this.ipv4IpamPoolId;
    }

    /**
     * The netmask length of the IPv4 CIDR you want to allocate to this VPC. Requires specifying a `ipv4_ipam_pool_id`.
     * 
     */
    @InputImport(name="ipv4NetmaskLength")
    private final @Nullable Input<Integer> ipv4NetmaskLength;

    public Input<Integer> getIpv4NetmaskLength() {
        return this.ipv4NetmaskLength == null ? Input.empty() : this.ipv4NetmaskLength;
    }

    /**
     * The ID of the VPC to make the association with.
     * 
     */
    @InputImport(name="vpcId")
    private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public VpcIpv4CidrBlockAssociationState(
        @Nullable Input<String> cidrBlock,
        @Nullable Input<String> ipv4IpamPoolId,
        @Nullable Input<Integer> ipv4NetmaskLength,
        @Nullable Input<String> vpcId) {
        this.cidrBlock = cidrBlock;
        this.ipv4IpamPoolId = ipv4IpamPoolId;
        this.ipv4NetmaskLength = ipv4NetmaskLength;
        this.vpcId = vpcId;
    }

    private VpcIpv4CidrBlockAssociationState() {
        this.cidrBlock = Input.empty();
        this.ipv4IpamPoolId = Input.empty();
        this.ipv4NetmaskLength = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpv4CidrBlockAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cidrBlock;
        private @Nullable Input<String> ipv4IpamPoolId;
        private @Nullable Input<Integer> ipv4NetmaskLength;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpv4CidrBlockAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.ipv4IpamPoolId = defaults.ipv4IpamPoolId;
    	      this.ipv4NetmaskLength = defaults.ipv4NetmaskLength;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setCidrBlock(@Nullable Input<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        public Builder setCidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Input.ofNullable(cidrBlock);
            return this;
        }

        public Builder setIpv4IpamPoolId(@Nullable Input<String> ipv4IpamPoolId) {
            this.ipv4IpamPoolId = ipv4IpamPoolId;
            return this;
        }

        public Builder setIpv4IpamPoolId(@Nullable String ipv4IpamPoolId) {
            this.ipv4IpamPoolId = Input.ofNullable(ipv4IpamPoolId);
            return this;
        }

        public Builder setIpv4NetmaskLength(@Nullable Input<Integer> ipv4NetmaskLength) {
            this.ipv4NetmaskLength = ipv4NetmaskLength;
            return this;
        }

        public Builder setIpv4NetmaskLength(@Nullable Integer ipv4NetmaskLength) {
            this.ipv4NetmaskLength = Input.ofNullable(ipv4NetmaskLength);
            return this;
        }

        public Builder setVpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }
        public VpcIpv4CidrBlockAssociationState build() {
            return new VpcIpv4CidrBlockAssociationState(cidrBlock, ipv4IpamPoolId, ipv4NetmaskLength, vpcId);
        }
    }
}
