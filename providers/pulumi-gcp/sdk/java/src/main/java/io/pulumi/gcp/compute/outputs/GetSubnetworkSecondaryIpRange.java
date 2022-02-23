// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSubnetworkSecondaryIpRange {
    /**
     * The range of IP addresses belonging to this subnetwork
     * secondary range.
     * 
     */
    private final String ipCidrRange;
    /**
     * The name associated with this subnetwork secondary range, used
     * when adding an alias IP range to a VM instance.
     * 
     */
    private final String rangeName;

    @OutputCustomType.Constructor({"ipCidrRange","rangeName"})
    private GetSubnetworkSecondaryIpRange(
        String ipCidrRange,
        String rangeName) {
        this.ipCidrRange = Objects.requireNonNull(ipCidrRange);
        this.rangeName = Objects.requireNonNull(rangeName);
    }

    /**
     * The range of IP addresses belonging to this subnetwork
     * secondary range.
     * 
     */
    public String getIpCidrRange() {
        return this.ipCidrRange;
    }
    /**
     * The name associated with this subnetwork secondary range, used
     * when adding an alias IP range to a VM instance.
     * 
     */
    public String getRangeName() {
        return this.rangeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetworkSecondaryIpRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipCidrRange;
        private String rangeName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetworkSecondaryIpRange defaults) {
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
        public GetSubnetworkSecondaryIpRange build() {
            return new GetSubnetworkSecondaryIpRange(ipCidrRange, rangeName);
        }
    }
}
