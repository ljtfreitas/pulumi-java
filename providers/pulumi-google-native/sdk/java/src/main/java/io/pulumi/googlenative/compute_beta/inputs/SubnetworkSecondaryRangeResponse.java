// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a secondary IP range of a subnetwork.
 * 
 */
public final class SubnetworkSecondaryRangeResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubnetworkSecondaryRangeResponse Empty = new SubnetworkSecondaryRangeResponse();

    /**
     * The range of IP addresses belonging to this subnetwork secondary range. Provide this property when you create the subnetwork. Ranges must be unique and non-overlapping with all primary and secondary IP ranges within a network. Only IPv4 is supported. The range can be any range listed in the Valid ranges list.
     * 
     */
    @InputImport(name="ipCidrRange", required=true)
      private final String ipCidrRange;

    public String getIpCidrRange() {
        return this.ipCidrRange;
    }

    /**
     * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
     * 
     */
    @InputImport(name="rangeName", required=true)
      private final String rangeName;

    public String getRangeName() {
        return this.rangeName;
    }

    public SubnetworkSecondaryRangeResponse(
        String ipCidrRange,
        String rangeName) {
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange, "expected parameter 'ipCidrRange' to be non-null");
        this.rangeName = Objects.requireNonNull(rangeName, "expected parameter 'rangeName' to be non-null");
    }

    private SubnetworkSecondaryRangeResponse() {
        this.ipCidrRange = null;
        this.rangeName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetworkSecondaryRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipCidrRange;
        private String rangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetworkSecondaryRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipCidrRange = defaults.ipCidrRange;
    	      this.rangeName = defaults.rangeName;
        }

        public Builder setIpCidrRange(String ipCidrRange) {
            this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
            return this;
        }

        public Builder setRangeName(String rangeName) {
            this.rangeName = Objects.requireNonNull(rangeName);
            return this;
        }
        public SubnetworkSecondaryRangeResponse build() {
            return new SubnetworkSecondaryRangeResponse(ipCidrRange, rangeName);
        }
    }
}
