// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * List of all Static Routes.
 * 
 */
public final class StaticRouteResponse extends io.pulumi.resources.InvokeArgs {

    public static final StaticRouteResponse Empty = new StaticRouteResponse();

    /**
     * List of all address prefixes.
     * 
     */
    @InputImport(name="addressPrefixes")
        private final @Nullable List<String> addressPrefixes;

    public List<String> getAddressPrefixes() {
        return this.addressPrefixes == null ? List.of() : this.addressPrefixes;
    }

    /**
     * The name of the StaticRoute that is unique within a VnetRoute.
     * 
     */
    @InputImport(name="name")
        private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The ip address of the next hop.
     * 
     */
    @InputImport(name="nextHopIpAddress")
        private final @Nullable String nextHopIpAddress;

    public Optional<String> getNextHopIpAddress() {
        return this.nextHopIpAddress == null ? Optional.empty() : Optional.ofNullable(this.nextHopIpAddress);
    }

    public StaticRouteResponse(
        @Nullable List<String> addressPrefixes,
        @Nullable String name,
        @Nullable String nextHopIpAddress) {
        this.addressPrefixes = addressPrefixes;
        this.name = name;
        this.nextHopIpAddress = nextHopIpAddress;
    }

    private StaticRouteResponse() {
        this.addressPrefixes = List.of();
        this.name = null;
        this.nextHopIpAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addressPrefixes;
        private @Nullable String name;
        private @Nullable String nextHopIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefixes = defaults.addressPrefixes;
    	      this.name = defaults.name;
    	      this.nextHopIpAddress = defaults.nextHopIpAddress;
        }

        public Builder setAddressPrefixes(@Nullable List<String> addressPrefixes) {
            this.addressPrefixes = addressPrefixes;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNextHopIpAddress(@Nullable String nextHopIpAddress) {
            this.nextHopIpAddress = nextHopIpAddress;
            return this;
        }
        public StaticRouteResponse build() {
            return new StaticRouteResponse(addressPrefixes, name, nextHopIpAddress);
        }
    }
}
