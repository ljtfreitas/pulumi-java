// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RouterNatSubnetworkToNatResponse {
    /**
     * URL for the subnetwork resource that will use NAT.
     * 
     */
    private final String name;
    /**
     * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in source_ip_ranges_to_nat.
     * 
     */
    private final List<String> secondaryIpRangeNames;
    /**
     * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
     * 
     */
    private final List<String> sourceIpRangesToNat;

    @OutputCustomType.Constructor({"name","secondaryIpRangeNames","sourceIpRangesToNat"})
    private RouterNatSubnetworkToNatResponse(
        String name,
        List<String> secondaryIpRangeNames,
        List<String> sourceIpRangesToNat) {
        this.name = Objects.requireNonNull(name);
        this.secondaryIpRangeNames = Objects.requireNonNull(secondaryIpRangeNames);
        this.sourceIpRangesToNat = Objects.requireNonNull(sourceIpRangesToNat);
    }

    /**
     * URL for the subnetwork resource that will use NAT.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in source_ip_ranges_to_nat.
     * 
     */
    public List<String> getSecondaryIpRangeNames() {
        return this.secondaryIpRangeNames;
    }
    /**
     * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
     * 
     */
    public List<String> getSourceIpRangesToNat() {
        return this.sourceIpRangesToNat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterNatSubnetworkToNatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> secondaryIpRangeNames;
        private List<String> sourceIpRangesToNat;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterNatSubnetworkToNatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.secondaryIpRangeNames = defaults.secondaryIpRangeNames;
    	      this.sourceIpRangesToNat = defaults.sourceIpRangesToNat;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSecondaryIpRangeNames(List<String> secondaryIpRangeNames) {
            this.secondaryIpRangeNames = Objects.requireNonNull(secondaryIpRangeNames);
            return this;
        }

        public Builder setSourceIpRangesToNat(List<String> sourceIpRangesToNat) {
            this.sourceIpRangesToNat = Objects.requireNonNull(sourceIpRangesToNat);
            return this;
        }
        public RouterNatSubnetworkToNatResponse build() {
            return new RouterNatSubnetworkToNatResponse(name, secondaryIpRangeNames, sourceIpRangesToNat);
        }
    }
}
