// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkloadNetworkSegmentSubnetResponse {
    /**
     * DHCP Range assigned for subnet.
     * 
     */
    private final @Nullable List<String> dhcpRanges;
    /**
     * Gateway address.
     * 
     */
    private final @Nullable String gatewayAddress;

    @OutputCustomType.Constructor({"dhcpRanges","gatewayAddress"})
    private WorkloadNetworkSegmentSubnetResponse(
        @Nullable List<String> dhcpRanges,
        @Nullable String gatewayAddress) {
        this.dhcpRanges = dhcpRanges;
        this.gatewayAddress = gatewayAddress;
    }

    /**
     * DHCP Range assigned for subnet.
     * 
     */
    public List<String> getDhcpRanges() {
        return this.dhcpRanges == null ? List.of() : this.dhcpRanges;
    }
    /**
     * Gateway address.
     * 
     */
    public Optional<String> getGatewayAddress() {
        return Optional.ofNullable(this.gatewayAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadNetworkSegmentSubnetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dhcpRanges;
        private @Nullable String gatewayAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkloadNetworkSegmentSubnetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dhcpRanges = defaults.dhcpRanges;
    	      this.gatewayAddress = defaults.gatewayAddress;
        }

        public Builder setDhcpRanges(@Nullable List<String> dhcpRanges) {
            this.dhcpRanges = dhcpRanges;
            return this;
        }

        public Builder setGatewayAddress(@Nullable String gatewayAddress) {
            this.gatewayAddress = gatewayAddress;
            return this;
        }
        public WorkloadNetworkSegmentSubnetResponse build() {
            return new WorkloadNetworkSegmentSubnetResponse(dhcpRanges, gatewayAddress);
        }
    }
}
