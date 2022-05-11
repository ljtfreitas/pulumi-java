// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNetworkGatewayCustomRoute {
    /**
     * @return A list of address blocks reserved for this virtual network in CIDR notation.
     * 
     */
    private final @Nullable List<String> addressPrefixes;

    @CustomType.Constructor
    private VirtualNetworkGatewayCustomRoute(@CustomType.Parameter("addressPrefixes") @Nullable List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
    }

    /**
     * @return A list of address blocks reserved for this virtual network in CIDR notation.
     * 
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes == null ? List.of() : this.addressPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkGatewayCustomRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addressPrefixes;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkGatewayCustomRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefixes = defaults.addressPrefixes;
        }

        public Builder addressPrefixes(@Nullable List<String> addressPrefixes) {
            this.addressPrefixes = addressPrefixes;
            return this;
        }
        public Builder addressPrefixes(String... addressPrefixes) {
            return addressPrefixes(List.of(addressPrefixes));
        }        public VirtualNetworkGatewayCustomRoute build() {
            return new VirtualNetworkGatewayCustomRoute(addressPrefixes);
        }
    }
}
