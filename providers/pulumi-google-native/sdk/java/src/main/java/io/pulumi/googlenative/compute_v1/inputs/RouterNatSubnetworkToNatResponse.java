// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Defines the IP ranges that want to use NAT for a subnetwork.
 * 
 */
public final class RouterNatSubnetworkToNatResponse extends io.pulumi.resources.InvokeArgs {

    public static final RouterNatSubnetworkToNatResponse Empty = new RouterNatSubnetworkToNatResponse();

    /**
     * URL for the subnetwork resource that will use NAT.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * A list of the secondary ranges of the Subnetwork that are allowed to use NAT. This can be populated only if "LIST_OF_SECONDARY_IP_RANGES" is one of the values in source_ip_ranges_to_nat.
     * 
     */
    @Import(name="secondaryIpRangeNames", required=true)
      private final List<String> secondaryIpRangeNames;

    public List<String> getSecondaryIpRangeNames() {
        return this.secondaryIpRangeNames;
    }

    /**
     * Specify the options for NAT ranges in the Subnetwork. All options of a single value are valid except NAT_IP_RANGE_OPTION_UNSPECIFIED. The only valid option with multiple values is: ["PRIMARY_IP_RANGE", "LIST_OF_SECONDARY_IP_RANGES"] Default: [ALL_IP_RANGES]
     * 
     */
    @Import(name="sourceIpRangesToNat", required=true)
      private final List<String> sourceIpRangesToNat;

    public List<String> getSourceIpRangesToNat() {
        return this.sourceIpRangesToNat;
    }

    public RouterNatSubnetworkToNatResponse(
        String name,
        List<String> secondaryIpRangeNames,
        List<String> sourceIpRangesToNat) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.secondaryIpRangeNames = Objects.requireNonNull(secondaryIpRangeNames, "expected parameter 'secondaryIpRangeNames' to be non-null");
        this.sourceIpRangesToNat = Objects.requireNonNull(sourceIpRangesToNat, "expected parameter 'sourceIpRangesToNat' to be non-null");
    }

    private RouterNatSubnetworkToNatResponse() {
        this.name = null;
        this.secondaryIpRangeNames = List.of();
        this.sourceIpRangesToNat = List.of();
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

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder secondaryIpRangeNames(List<String> secondaryIpRangeNames) {
            this.secondaryIpRangeNames = Objects.requireNonNull(secondaryIpRangeNames);
            return this;
        }

        public Builder sourceIpRangesToNat(List<String> sourceIpRangesToNat) {
            this.sourceIpRangesToNat = Objects.requireNonNull(sourceIpRangesToNat);
            return this;
        }
        public RouterNatSubnetworkToNatResponse build() {
            return new RouterNatSubnetworkToNatResponse(name, secondaryIpRangeNames, sourceIpRangesToNat);
        }
    }
}
