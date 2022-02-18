// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RoutingPolicyResponse {
    /**
     * List of all destinations which this routing policy is applicable to (for example: Internet, PrivateTraffic).
     * 
     */
    private final List<String> destinations;
    /**
     * The unique name for the routing policy.
     * 
     */
    private final String name;
    /**
     * The next hop resource id on which this routing policy is applicable to.
     * 
     */
    private final String nextHop;

    @OutputCustomType.Constructor({"destinations","name","nextHop"})
    private RoutingPolicyResponse(
        List<String> destinations,
        String name,
        String nextHop) {
        this.destinations = Objects.requireNonNull(destinations);
        this.name = Objects.requireNonNull(name);
        this.nextHop = Objects.requireNonNull(nextHop);
    }

    /**
     * List of all destinations which this routing policy is applicable to (for example: Internet, PrivateTraffic).
     * 
     */
    public List<String> getDestinations() {
        return this.destinations;
    }
    /**
     * The unique name for the routing policy.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The next hop resource id on which this routing policy is applicable to.
     * 
     */
    public String getNextHop() {
        return this.nextHop;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> destinations;
        private String name;
        private String nextHop;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.name = defaults.name;
    	      this.nextHop = defaults.nextHop;
        }

        public Builder setDestinations(List<String> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNextHop(String nextHop) {
            this.nextHop = Objects.requireNonNull(nextHop);
            return this;
        }

        public RoutingPolicyResponse build() {
            return new RoutingPolicyResponse(destinations, name, nextHop);
        }
    }
}
