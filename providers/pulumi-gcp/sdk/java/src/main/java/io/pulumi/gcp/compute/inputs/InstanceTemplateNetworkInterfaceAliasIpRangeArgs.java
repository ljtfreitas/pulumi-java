// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceTemplateNetworkInterfaceAliasIpRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateNetworkInterfaceAliasIpRangeArgs Empty = new InstanceTemplateNetworkInterfaceAliasIpRangeArgs();

    /**
     * The IP CIDR range represented by this alias IP range. This IP CIDR range
     * must belong to the specified subnetwork and cannot contain IP addresses reserved by
     * system or used by other network interfaces. At the time of writing only a
     * netmask (e.g. /24) may be supplied, with a CIDR format resulting in an API
     * error.
     * 
     */
    @InputImport(name="ipCidrRange", required=true)
        private final Input<String> ipCidrRange;

    public Input<String> getIpCidrRange() {
        return this.ipCidrRange;
    }

    /**
     * The subnetwork secondary range name specifying
     * the secondary range from which to allocate the IP CIDR range for this alias IP
     * range. If left unspecified, the primary range of the subnetwork will be used.
     * 
     */
    @InputImport(name="subnetworkRangeName")
        private final @Nullable Input<String> subnetworkRangeName;

    public Input<String> getSubnetworkRangeName() {
        return this.subnetworkRangeName == null ? Input.empty() : this.subnetworkRangeName;
    }

    public InstanceTemplateNetworkInterfaceAliasIpRangeArgs(
        Input<String> ipCidrRange,
        @Nullable Input<String> subnetworkRangeName) {
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange, "expected parameter 'ipCidrRange' to be non-null");
        this.subnetworkRangeName = subnetworkRangeName;
    }

    private InstanceTemplateNetworkInterfaceAliasIpRangeArgs() {
        this.ipCidrRange = Input.empty();
        this.subnetworkRangeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateNetworkInterfaceAliasIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ipCidrRange;
        private @Nullable Input<String> subnetworkRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateNetworkInterfaceAliasIpRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.subnetworkRangeName = defaults.subnetworkRangeName;
        }

        public Builder setIpCidrRange(Input<String> ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder setIpCidrRange(String ipCidrRange) {
            this.ipCidrRange = Input.of(Objects.requireNonNull(ipCidrRange));
            return this;
        }

        public Builder setSubnetworkRangeName(@Nullable Input<String> subnetworkRangeName) {
            this.subnetworkRangeName = subnetworkRangeName;
            return this;
        }

        public Builder setSubnetworkRangeName(@Nullable String subnetworkRangeName) {
            this.subnetworkRangeName = Input.ofNullable(subnetworkRangeName);
            return this;
        }
        public InstanceTemplateNetworkInterfaceAliasIpRangeArgs build() {
            return new InstanceTemplateNetworkInterfaceAliasIpRangeArgs(ipCidrRange, subnetworkRangeName);
        }
    }
}
