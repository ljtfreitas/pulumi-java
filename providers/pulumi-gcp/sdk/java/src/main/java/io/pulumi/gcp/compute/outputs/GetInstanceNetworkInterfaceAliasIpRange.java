// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceNetworkInterfaceAliasIpRange {
    /**
     * The IP CIDR range represented by this alias IP range.
     * 
     */
    private final String ipCidrRange;
    /**
     * The subnetwork secondary range name specifying
     * the secondary range from which to allocate the IP CIDR range for this alias IP
     * range.
     * 
     */
    private final String subnetworkRangeName;

    @OutputCustomType.Constructor({"ipCidrRange","subnetworkRangeName"})
    private GetInstanceNetworkInterfaceAliasIpRange(
        String ipCidrRange,
        String subnetworkRangeName) {
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
        this.subnetworkRangeName = Objects.requireNonNull(subnetworkRangeName);
    }

    /**
     * The IP CIDR range represented by this alias IP range.
     * 
     */
    public String getIpCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * The subnetwork secondary range name specifying
     * the secondary range from which to allocate the IP CIDR range for this alias IP
     * range.
     * 
     */
    public String getSubnetworkRangeName() {
        return this.subnetworkRangeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceNetworkInterfaceAliasIpRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipCidrRange;
        private String subnetworkRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceNetworkInterfaceAliasIpRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.subnetworkRangeName = defaults.subnetworkRangeName;
        }

        public Builder setIpCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder setSubnetworkRangeName(String subnetworkRangeName) {
            this.subnetworkRangeName = Objects.requireNonNull(subnetworkRangeName);
            return this;
        }
        public GetInstanceNetworkInterfaceAliasIpRange build() {
            return new GetInstanceNetworkInterfaceAliasIpRange(ipCidrRange, subnetworkRangeName);
        }
    }
}
