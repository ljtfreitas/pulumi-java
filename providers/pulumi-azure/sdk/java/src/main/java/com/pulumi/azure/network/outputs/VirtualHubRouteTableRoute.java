// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualHubRouteTableRoute {
    /**
     * @return A list of destination addresses for this route.
     * 
     */
    private final List<String> destinations;
    /**
     * @return The type of destinations. Possible values are `CIDR`, `ResourceId` and `Service`.
     * 
     */
    private final String destinationsType;
    /**
     * @return The name which should be used for this route.
     * 
     */
    private final String name;
    /**
     * @return The next hop&#39;s resource ID.
     * 
     */
    private final String nextHop;
    /**
     * @return The type of next hop. Currently the only possible value is `ResourceId`. Defaults to `ResourceId`.
     * 
     */
    private final @Nullable String nextHopType;

    @CustomType.Constructor
    private VirtualHubRouteTableRoute(
        @CustomType.Parameter("destinations") List<String> destinations,
        @CustomType.Parameter("destinationsType") String destinationsType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nextHop") String nextHop,
        @CustomType.Parameter("nextHopType") @Nullable String nextHopType) {
        this.destinations = destinations;
        this.destinationsType = destinationsType;
        this.name = name;
        this.nextHop = nextHop;
        this.nextHopType = nextHopType;
    }

    /**
     * @return A list of destination addresses for this route.
     * 
     */
    public List<String> destinations() {
        return this.destinations;
    }
    /**
     * @return The type of destinations. Possible values are `CIDR`, `ResourceId` and `Service`.
     * 
     */
    public String destinationsType() {
        return this.destinationsType;
    }
    /**
     * @return The name which should be used for this route.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The next hop&#39;s resource ID.
     * 
     */
    public String nextHop() {
        return this.nextHop;
    }
    /**
     * @return The type of next hop. Currently the only possible value is `ResourceId`. Defaults to `ResourceId`.
     * 
     */
    public Optional<String> nextHopType() {
        return Optional.ofNullable(this.nextHopType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualHubRouteTableRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> destinations;
        private String destinationsType;
        private String name;
        private String nextHop;
        private @Nullable String nextHopType;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualHubRouteTableRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.destinationsType = defaults.destinationsType;
    	      this.name = defaults.name;
    	      this.nextHop = defaults.nextHop;
    	      this.nextHopType = defaults.nextHopType;
        }

        public Builder destinations(List<String> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }
        public Builder destinations(String... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder destinationsType(String destinationsType) {
            this.destinationsType = Objects.requireNonNull(destinationsType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nextHop(String nextHop) {
            this.nextHop = Objects.requireNonNull(nextHop);
            return this;
        }
        public Builder nextHopType(@Nullable String nextHopType) {
            this.nextHopType = nextHopType;
            return this;
        }        public VirtualHubRouteTableRoute build() {
            return new VirtualHubRouteTableRoute(destinations, destinationsType, name, nextHop, nextHopType);
        }
    }
}
