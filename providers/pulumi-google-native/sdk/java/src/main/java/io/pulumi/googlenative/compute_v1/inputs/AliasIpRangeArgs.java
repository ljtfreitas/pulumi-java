// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An alias IP range attached to an instance's network interface.
 * 
 */
public final class AliasIpRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AliasIpRangeArgs Empty = new AliasIpRangeArgs();

    /**
     * The IP alias ranges to allocate for this interface. This IP CIDR range must belong to the specified subnetwork and cannot contain IP addresses reserved by system or used by other network interfaces. This range may be a single IP address (such as 10.2.3.4), a netmask (such as /24) or a CIDR-formatted string (such as 10.1.2.0/24).
     * 
     */
    @InputImport(name="ipCidrRange")
      private final @Nullable Input<String> ipCidrRange;

    public Input<String> getIpCidrRange() {
        return this.ipCidrRange == null ? Input.empty() : this.ipCidrRange;
    }

    /**
     * The name of a subnetwork secondary IP range from which to allocate an IP alias range. If not specified, the primary range of the subnetwork is used.
     * 
     */
    @InputImport(name="subnetworkRangeName")
      private final @Nullable Input<String> subnetworkRangeName;

    public Input<String> getSubnetworkRangeName() {
        return this.subnetworkRangeName == null ? Input.empty() : this.subnetworkRangeName;
    }

    public AliasIpRangeArgs(
        @Nullable Input<String> ipCidrRange,
        @Nullable Input<String> subnetworkRangeName) {
        this.ipCidrRange = ipCidrRange;
        this.subnetworkRangeName = subnetworkRangeName;
    }

    private AliasIpRangeArgs() {
        this.ipCidrRange = Input.empty();
        this.subnetworkRangeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ipCidrRange;
        private @Nullable Input<String> subnetworkRangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasIpRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.subnetworkRangeName = defaults.subnetworkRangeName;
        }

        public Builder setIpCidrRange(@Nullable Input<String> ipCidrRange) {
            this.ipCidrRange = ipCidrRange;
            return this;
        }

        public Builder setIpCidrRange(@Nullable String ipCidrRange) {
            this.ipCidrRange = Input.ofNullable(ipCidrRange);
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
        public AliasIpRangeArgs build() {
            return new AliasIpRangeArgs(ipCidrRange, subnetworkRangeName);
        }
    }
}
