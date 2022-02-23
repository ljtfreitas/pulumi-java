// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostedPrivateVirtualInterfaceState extends io.pulumi.resources.ResourceArgs {

    public static final HostedPrivateVirtualInterfaceState Empty = new HostedPrivateVirtualInterfaceState();

    /**
     * The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    @InputImport(name="addressFamily")
    private final @Nullable Input<String> addressFamily;

    public Input<String> getAddressFamily() {
        return this.addressFamily == null ? Input.empty() : this.addressFamily;
    }

    /**
     * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    @InputImport(name="amazonAddress")
    private final @Nullable Input<String> amazonAddress;

    public Input<String> getAmazonAddress() {
        return this.amazonAddress == null ? Input.empty() : this.amazonAddress;
    }

    @InputImport(name="amazonSideAsn")
    private final @Nullable Input<String> amazonSideAsn;

    public Input<String> getAmazonSideAsn() {
        return this.amazonSideAsn == null ? Input.empty() : this.amazonSideAsn;
    }

    /**
     * The ARN of the virtual interface.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The Direct Connect endpoint on which the virtual interface terminates.
     * 
     */
    @InputImport(name="awsDevice")
    private final @Nullable Input<String> awsDevice;

    public Input<String> getAwsDevice() {
        return this.awsDevice == null ? Input.empty() : this.awsDevice;
    }

    /**
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    @InputImport(name="bgpAsn")
    private final @Nullable Input<Integer> bgpAsn;

    public Input<Integer> getBgpAsn() {
        return this.bgpAsn == null ? Input.empty() : this.bgpAsn;
    }

    /**
     * The authentication key for BGP configuration.
     * 
     */
    @InputImport(name="bgpAuthKey")
    private final @Nullable Input<String> bgpAuthKey;

    public Input<String> getBgpAuthKey() {
        return this.bgpAuthKey == null ? Input.empty() : this.bgpAuthKey;
    }

    /**
     * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    @InputImport(name="connectionId")
    private final @Nullable Input<String> connectionId;

    public Input<String> getConnectionId() {
        return this.connectionId == null ? Input.empty() : this.connectionId;
    }

    /**
     * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    @InputImport(name="customerAddress")
    private final @Nullable Input<String> customerAddress;

    public Input<String> getCustomerAddress() {
        return this.customerAddress == null ? Input.empty() : this.customerAddress;
    }

    /**
     * Indicates whether jumbo frames (9001 MTU) are supported.
     * 
     */
    @InputImport(name="jumboFrameCapable")
    private final @Nullable Input<Boolean> jumboFrameCapable;

    public Input<Boolean> getJumboFrameCapable() {
        return this.jumboFrameCapable == null ? Input.empty() : this.jumboFrameCapable;
    }

    /**
     * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
     * 
     */
    @InputImport(name="mtu")
    private final @Nullable Input<Integer> mtu;

    public Input<Integer> getMtu() {
        return this.mtu == null ? Input.empty() : this.mtu;
    }

    /**
     * The name for the virtual interface.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The AWS account that will own the new virtual interface.
     * 
     */
    @InputImport(name="ownerAccountId")
    private final @Nullable Input<String> ownerAccountId;

    public Input<String> getOwnerAccountId() {
        return this.ownerAccountId == null ? Input.empty() : this.ownerAccountId;
    }

    /**
     * The VLAN ID.
     * 
     */
    @InputImport(name="vlan")
    private final @Nullable Input<Integer> vlan;

    public Input<Integer> getVlan() {
        return this.vlan == null ? Input.empty() : this.vlan;
    }

    public HostedPrivateVirtualInterfaceState(
        @Nullable Input<String> addressFamily,
        @Nullable Input<String> amazonAddress,
        @Nullable Input<String> amazonSideAsn,
        @Nullable Input<String> arn,
        @Nullable Input<String> awsDevice,
        @Nullable Input<Integer> bgpAsn,
        @Nullable Input<String> bgpAuthKey,
        @Nullable Input<String> connectionId,
        @Nullable Input<String> customerAddress,
        @Nullable Input<Boolean> jumboFrameCapable,
        @Nullable Input<Integer> mtu,
        @Nullable Input<String> name,
        @Nullable Input<String> ownerAccountId,
        @Nullable Input<Integer> vlan) {
        this.addressFamily = addressFamily;
        this.amazonAddress = amazonAddress;
        this.amazonSideAsn = amazonSideAsn;
        this.arn = arn;
        this.awsDevice = awsDevice;
        this.bgpAsn = bgpAsn;
        this.bgpAuthKey = bgpAuthKey;
        this.connectionId = connectionId;
        this.customerAddress = customerAddress;
        this.jumboFrameCapable = jumboFrameCapable;
        this.mtu = mtu;
        this.name = name;
        this.ownerAccountId = ownerAccountId;
        this.vlan = vlan;
    }

    private HostedPrivateVirtualInterfaceState() {
        this.addressFamily = Input.empty();
        this.amazonAddress = Input.empty();
        this.amazonSideAsn = Input.empty();
        this.arn = Input.empty();
        this.awsDevice = Input.empty();
        this.bgpAsn = Input.empty();
        this.bgpAuthKey = Input.empty();
        this.connectionId = Input.empty();
        this.customerAddress = Input.empty();
        this.jumboFrameCapable = Input.empty();
        this.mtu = Input.empty();
        this.name = Input.empty();
        this.ownerAccountId = Input.empty();
        this.vlan = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostedPrivateVirtualInterfaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addressFamily;
        private @Nullable Input<String> amazonAddress;
        private @Nullable Input<String> amazonSideAsn;
        private @Nullable Input<String> arn;
        private @Nullable Input<String> awsDevice;
        private @Nullable Input<Integer> bgpAsn;
        private @Nullable Input<String> bgpAuthKey;
        private @Nullable Input<String> connectionId;
        private @Nullable Input<String> customerAddress;
        private @Nullable Input<Boolean> jumboFrameCapable;
        private @Nullable Input<Integer> mtu;
        private @Nullable Input<String> name;
        private @Nullable Input<String> ownerAccountId;
        private @Nullable Input<Integer> vlan;

        public Builder() {
    	      // Empty
        }

        public Builder(HostedPrivateVirtualInterfaceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.amazonAddress = defaults.amazonAddress;
    	      this.amazonSideAsn = defaults.amazonSideAsn;
    	      this.arn = defaults.arn;
    	      this.awsDevice = defaults.awsDevice;
    	      this.bgpAsn = defaults.bgpAsn;
    	      this.bgpAuthKey = defaults.bgpAuthKey;
    	      this.connectionId = defaults.connectionId;
    	      this.customerAddress = defaults.customerAddress;
    	      this.jumboFrameCapable = defaults.jumboFrameCapable;
    	      this.mtu = defaults.mtu;
    	      this.name = defaults.name;
    	      this.ownerAccountId = defaults.ownerAccountId;
    	      this.vlan = defaults.vlan;
        }

        public Builder setAddressFamily(@Nullable Input<String> addressFamily) {
            this.addressFamily = addressFamily;
            return this;
        }

        public Builder setAddressFamily(@Nullable String addressFamily) {
            this.addressFamily = Input.ofNullable(addressFamily);
            return this;
        }

        public Builder setAmazonAddress(@Nullable Input<String> amazonAddress) {
            this.amazonAddress = amazonAddress;
            return this;
        }

        public Builder setAmazonAddress(@Nullable String amazonAddress) {
            this.amazonAddress = Input.ofNullable(amazonAddress);
            return this;
        }

        public Builder setAmazonSideAsn(@Nullable Input<String> amazonSideAsn) {
            this.amazonSideAsn = amazonSideAsn;
            return this;
        }

        public Builder setAmazonSideAsn(@Nullable String amazonSideAsn) {
            this.amazonSideAsn = Input.ofNullable(amazonSideAsn);
            return this;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAwsDevice(@Nullable Input<String> awsDevice) {
            this.awsDevice = awsDevice;
            return this;
        }

        public Builder setAwsDevice(@Nullable String awsDevice) {
            this.awsDevice = Input.ofNullable(awsDevice);
            return this;
        }

        public Builder setBgpAsn(@Nullable Input<Integer> bgpAsn) {
            this.bgpAsn = bgpAsn;
            return this;
        }

        public Builder setBgpAsn(@Nullable Integer bgpAsn) {
            this.bgpAsn = Input.ofNullable(bgpAsn);
            return this;
        }

        public Builder setBgpAuthKey(@Nullable Input<String> bgpAuthKey) {
            this.bgpAuthKey = bgpAuthKey;
            return this;
        }

        public Builder setBgpAuthKey(@Nullable String bgpAuthKey) {
            this.bgpAuthKey = Input.ofNullable(bgpAuthKey);
            return this;
        }

        public Builder setConnectionId(@Nullable Input<String> connectionId) {
            this.connectionId = connectionId;
            return this;
        }

        public Builder setConnectionId(@Nullable String connectionId) {
            this.connectionId = Input.ofNullable(connectionId);
            return this;
        }

        public Builder setCustomerAddress(@Nullable Input<String> customerAddress) {
            this.customerAddress = customerAddress;
            return this;
        }

        public Builder setCustomerAddress(@Nullable String customerAddress) {
            this.customerAddress = Input.ofNullable(customerAddress);
            return this;
        }

        public Builder setJumboFrameCapable(@Nullable Input<Boolean> jumboFrameCapable) {
            this.jumboFrameCapable = jumboFrameCapable;
            return this;
        }

        public Builder setJumboFrameCapable(@Nullable Boolean jumboFrameCapable) {
            this.jumboFrameCapable = Input.ofNullable(jumboFrameCapable);
            return this;
        }

        public Builder setMtu(@Nullable Input<Integer> mtu) {
            this.mtu = mtu;
            return this;
        }

        public Builder setMtu(@Nullable Integer mtu) {
            this.mtu = Input.ofNullable(mtu);
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

        public Builder setOwnerAccountId(@Nullable Input<String> ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }

        public Builder setOwnerAccountId(@Nullable String ownerAccountId) {
            this.ownerAccountId = Input.ofNullable(ownerAccountId);
            return this;
        }

        public Builder setVlan(@Nullable Input<Integer> vlan) {
            this.vlan = vlan;
            return this;
        }

        public Builder setVlan(@Nullable Integer vlan) {
            this.vlan = Input.ofNullable(vlan);
            return this;
        }
        public HostedPrivateVirtualInterfaceState build() {
            return new HostedPrivateVirtualInterfaceState(addressFamily, amazonAddress, amazonSideAsn, arn, awsDevice, bgpAsn, bgpAuthKey, connectionId, customerAddress, jumboFrameCapable, mtu, name, ownerAccountId, vlan);
        }
    }
}
