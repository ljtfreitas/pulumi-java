// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BgpPeerArgs extends io.pulumi.resources.ResourceArgs {

    public static final BgpPeerArgs Empty = new BgpPeerArgs();

    /**
     * The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    @InputImport(name="addressFamily", required=true)
    private final Input<String> addressFamily;

    public Input<String> getAddressFamily() {
        return this.addressFamily;
    }

    /**
     * The IPv4 CIDR address to use to send traffic to Amazon.
     * Required for IPv4 BGP peers on public virtual interfaces.
     * 
     */
    @InputImport(name="amazonAddress")
    private final @Nullable Input<String> amazonAddress;

    public Input<String> getAmazonAddress() {
        return this.amazonAddress == null ? Input.empty() : this.amazonAddress;
    }

    /**
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    @InputImport(name="bgpAsn", required=true)
    private final Input<Integer> bgpAsn;

    public Input<Integer> getBgpAsn() {
        return this.bgpAsn;
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
     * The IPv4 CIDR destination address to which Amazon should send traffic.
     * Required for IPv4 BGP peers on public virtual interfaces.
     * 
     */
    @InputImport(name="customerAddress")
    private final @Nullable Input<String> customerAddress;

    public Input<String> getCustomerAddress() {
        return this.customerAddress == null ? Input.empty() : this.customerAddress;
    }

    /**
     * The ID of the Direct Connect virtual interface on which to create the BGP peer.
     * 
     */
    @InputImport(name="virtualInterfaceId", required=true)
    private final Input<String> virtualInterfaceId;

    public Input<String> getVirtualInterfaceId() {
        return this.virtualInterfaceId;
    }

    public BgpPeerArgs(
        Input<String> addressFamily,
        @Nullable Input<String> amazonAddress,
        Input<Integer> bgpAsn,
        @Nullable Input<String> bgpAuthKey,
        @Nullable Input<String> customerAddress,
        Input<String> virtualInterfaceId) {
        this.addressFamily = Objects.requireNonNull(addressFamily, "expected parameter 'addressFamily' to be non-null");
        this.amazonAddress = amazonAddress;
        this.bgpAsn = Objects.requireNonNull(bgpAsn, "expected parameter 'bgpAsn' to be non-null");
        this.bgpAuthKey = bgpAuthKey;
        this.customerAddress = customerAddress;
        this.virtualInterfaceId = Objects.requireNonNull(virtualInterfaceId, "expected parameter 'virtualInterfaceId' to be non-null");
    }

    private BgpPeerArgs() {
        this.addressFamily = Input.empty();
        this.amazonAddress = Input.empty();
        this.bgpAsn = Input.empty();
        this.bgpAuthKey = Input.empty();
        this.customerAddress = Input.empty();
        this.virtualInterfaceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BgpPeerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> addressFamily;
        private @Nullable Input<String> amazonAddress;
        private Input<Integer> bgpAsn;
        private @Nullable Input<String> bgpAuthKey;
        private @Nullable Input<String> customerAddress;
        private Input<String> virtualInterfaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(BgpPeerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.amazonAddress = defaults.amazonAddress;
    	      this.bgpAsn = defaults.bgpAsn;
    	      this.bgpAuthKey = defaults.bgpAuthKey;
    	      this.customerAddress = defaults.customerAddress;
    	      this.virtualInterfaceId = defaults.virtualInterfaceId;
        }

        public Builder setAddressFamily(Input<String> addressFamily) {
            this.addressFamily = Objects.requireNonNull(addressFamily);
            return this;
        }

        public Builder setAddressFamily(String addressFamily) {
            this.addressFamily = Input.of(Objects.requireNonNull(addressFamily));
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

        public Builder setBgpAsn(Input<Integer> bgpAsn) {
            this.bgpAsn = Objects.requireNonNull(bgpAsn);
            return this;
        }

        public Builder setBgpAsn(Integer bgpAsn) {
            this.bgpAsn = Input.of(Objects.requireNonNull(bgpAsn));
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

        public Builder setCustomerAddress(@Nullable Input<String> customerAddress) {
            this.customerAddress = customerAddress;
            return this;
        }

        public Builder setCustomerAddress(@Nullable String customerAddress) {
            this.customerAddress = Input.ofNullable(customerAddress);
            return this;
        }

        public Builder setVirtualInterfaceId(Input<String> virtualInterfaceId) {
            this.virtualInterfaceId = Objects.requireNonNull(virtualInterfaceId);
            return this;
        }

        public Builder setVirtualInterfaceId(String virtualInterfaceId) {
            this.virtualInterfaceId = Input.of(Objects.requireNonNull(virtualInterfaceId));
            return this;
        }
        public BgpPeerArgs build() {
            return new BgpPeerArgs(addressFamily, amazonAddress, bgpAsn, bgpAuthKey, customerAddress, virtualInterfaceId);
        }
    }
}