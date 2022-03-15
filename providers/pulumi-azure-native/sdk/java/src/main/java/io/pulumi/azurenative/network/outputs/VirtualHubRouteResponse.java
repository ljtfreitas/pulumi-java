// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualHubRouteResponse {
    /**
     * List of all addressPrefixes.
     * 
     */
    private final @Nullable List<String> addressPrefixes;
    /**
     * NextHop ip address.
     * 
     */
    private final @Nullable String nextHopIpAddress;

    @CustomType.Constructor
    private VirtualHubRouteResponse(
        @CustomType.Parameter("addressPrefixes") @Nullable List<String> addressPrefixes,
        @CustomType.Parameter("nextHopIpAddress") @Nullable String nextHopIpAddress) {
        this.addressPrefixes = addressPrefixes;
        this.nextHopIpAddress = nextHopIpAddress;
    }

    /**
     * List of all addressPrefixes.
     * 
    */
    public List<String> getAddressPrefixes() {
        return this.addressPrefixes == null ? List.of() : this.addressPrefixes;
    }
    /**
     * NextHop ip address.
     * 
    */
    public Optional<String> getNextHopIpAddress() {
        return Optional.ofNullable(this.nextHopIpAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addressPrefixes;
        private @Nullable String nextHopIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefixes = defaults.addressPrefixes;
    	      this.nextHopIpAddress = defaults.nextHopIpAddress;
        }

        public Builder addressPrefixes(@Nullable List<String> addressPrefixes) {
            this.addressPrefixes = addressPrefixes;
            return this;
        }

        public Builder nextHopIpAddress(@Nullable String nextHopIpAddress) {
            this.nextHopIpAddress = nextHopIpAddress;
            return this;
        }
        public VirtualHubRouteResponse build() {
            return new VirtualHubRouteResponse(addressPrefixes, nextHopIpAddress);
        }
    }
}
