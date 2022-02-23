// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PublicVirtualInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicVirtualInterfaceArgs Empty = new PublicVirtualInterfaceArgs();

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
     * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
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
     * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    @InputImport(name="connectionId", required=true)
    private final Input<String> connectionId;

    public Input<String> getConnectionId() {
        return this.connectionId;
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
     * The name for the virtual interface.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of routes to be advertised to the AWS network in this region.
     * 
     */
    @InputImport(name="routeFilterPrefixes", required=true)
    private final Input<List<String>> routeFilterPrefixes;

    public Input<List<String>> getRouteFilterPrefixes() {
        return this.routeFilterPrefixes;
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
     * The VLAN ID.
     * 
     */
    @InputImport(name="vlan", required=true)
    private final Input<Integer> vlan;

    public Input<Integer> getVlan() {
        return this.vlan;
    }

    public PublicVirtualInterfaceArgs(
        Input<String> addressFamily,
        @Nullable Input<String> amazonAddress,
        Input<Integer> bgpAsn,
        @Nullable Input<String> bgpAuthKey,
        Input<String> connectionId,
        @Nullable Input<String> customerAddress,
        @Nullable Input<String> name,
        Input<List<String>> routeFilterPrefixes,
        @Nullable Input<Map<String,String>> tags,
        Input<Integer> vlan) {
        this.addressFamily = Objects.requireNonNull(addressFamily, "expected parameter 'addressFamily' to be non-null");
        this.amazonAddress = amazonAddress;
        this.bgpAsn = Objects.requireNonNull(bgpAsn, "expected parameter 'bgpAsn' to be non-null");
        this.bgpAuthKey = bgpAuthKey;
        this.connectionId = Objects.requireNonNull(connectionId, "expected parameter 'connectionId' to be non-null");
        this.customerAddress = customerAddress;
        this.name = name;
        this.routeFilterPrefixes = Objects.requireNonNull(routeFilterPrefixes, "expected parameter 'routeFilterPrefixes' to be non-null");
        this.tags = tags;
        this.vlan = Objects.requireNonNull(vlan, "expected parameter 'vlan' to be non-null");
    }

    private PublicVirtualInterfaceArgs() {
        this.addressFamily = Input.empty();
        this.amazonAddress = Input.empty();
        this.bgpAsn = Input.empty();
        this.bgpAuthKey = Input.empty();
        this.connectionId = Input.empty();
        this.customerAddress = Input.empty();
        this.name = Input.empty();
        this.routeFilterPrefixes = Input.empty();
        this.tags = Input.empty();
        this.vlan = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicVirtualInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> addressFamily;
        private @Nullable Input<String> amazonAddress;
        private Input<Integer> bgpAsn;
        private @Nullable Input<String> bgpAuthKey;
        private Input<String> connectionId;
        private @Nullable Input<String> customerAddress;
        private @Nullable Input<String> name;
        private Input<List<String>> routeFilterPrefixes;
        private @Nullable Input<Map<String,String>> tags;
        private Input<Integer> vlan;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicVirtualInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.amazonAddress = defaults.amazonAddress;
    	      this.bgpAsn = defaults.bgpAsn;
    	      this.bgpAuthKey = defaults.bgpAuthKey;
    	      this.connectionId = defaults.connectionId;
    	      this.customerAddress = defaults.customerAddress;
    	      this.name = defaults.name;
    	      this.routeFilterPrefixes = defaults.routeFilterPrefixes;
    	      this.tags = defaults.tags;
    	      this.vlan = defaults.vlan;
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

        public Builder setConnectionId(Input<String> connectionId) {
            this.connectionId = Objects.requireNonNull(connectionId);
            return this;
        }

        public Builder setConnectionId(String connectionId) {
            this.connectionId = Input.of(Objects.requireNonNull(connectionId));
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRouteFilterPrefixes(Input<List<String>> routeFilterPrefixes) {
            this.routeFilterPrefixes = Objects.requireNonNull(routeFilterPrefixes);
            return this;
        }

        public Builder setRouteFilterPrefixes(List<String> routeFilterPrefixes) {
            this.routeFilterPrefixes = Input.of(Objects.requireNonNull(routeFilterPrefixes));
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

        public Builder setVlan(Input<Integer> vlan) {
            this.vlan = Objects.requireNonNull(vlan);
            return this;
        }

        public Builder setVlan(Integer vlan) {
            this.vlan = Input.of(Objects.requireNonNull(vlan));
            return this;
        }
        public PublicVirtualInterfaceArgs build() {
            return new PublicVirtualInterfaceArgs(addressFamily, amazonAddress, bgpAsn, bgpAuthKey, connectionId, customerAddress, name, routeFilterPrefixes, tags, vlan);
        }
    }
}
