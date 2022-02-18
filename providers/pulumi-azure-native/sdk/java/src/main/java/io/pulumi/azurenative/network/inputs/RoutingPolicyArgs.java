// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The routing policy object used in a RoutingIntent resource.
 * 
 */
public final class RoutingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoutingPolicyArgs Empty = new RoutingPolicyArgs();

    /**
     * List of all destinations which this routing policy is applicable to (for example: Internet, PrivateTraffic).
     * 
     */
    @InputImport(name="destinations", required=true)
    private final Input<List<String>> destinations;

    public Input<List<String>> getDestinations() {
        return this.destinations;
    }

    /**
     * The unique name for the routing policy.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The next hop resource id on which this routing policy is applicable to.
     * 
     */
    @InputImport(name="nextHop", required=true)
    private final Input<String> nextHop;

    public Input<String> getNextHop() {
        return this.nextHop;
    }

    public RoutingPolicyArgs(
        Input<List<String>> destinations,
        Input<String> name,
        Input<String> nextHop) {
        this.destinations = Objects.requireNonNull(destinations, "expected parameter 'destinations' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.nextHop = Objects.requireNonNull(nextHop, "expected parameter 'nextHop' to be non-null");
    }

    private RoutingPolicyArgs() {
        this.destinations = Input.empty();
        this.name = Input.empty();
        this.nextHop = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> destinations;
        private Input<String> name;
        private Input<String> nextHop;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.name = defaults.name;
    	      this.nextHop = defaults.nextHop;
        }

        public Builder setDestinations(Input<List<String>> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }

        public Builder setDestinations(List<String> destinations) {
            this.destinations = Input.of(Objects.requireNonNull(destinations));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setNextHop(Input<String> nextHop) {
            this.nextHop = Objects.requireNonNull(nextHop);
            return this;
        }

        public Builder setNextHop(String nextHop) {
            this.nextHop = Input.of(Objects.requireNonNull(nextHop));
            return this;
        }

        public RoutingPolicyArgs build() {
            return new RoutingPolicyArgs(destinations, name, nextHop);
        }
    }
}
