// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.GatewayDestinationArgs;
import io.pulumi.azurenative.servicefabricmesh.inputs.HttpRouteMatchRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the hostname properties for http routing.
 * 
 */
public final class HttpRouteConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpRouteConfigArgs Empty = new HttpRouteConfigArgs();

    /**
     * Describes destination endpoint for routing traffic.
     * 
     */
    @InputImport(name="destination", required=true)
        private final Input<GatewayDestinationArgs> destination;

    public Input<GatewayDestinationArgs> getDestination() {
        return this.destination;
    }

    /**
     * Describes a rule for http route matching.
     * 
     */
    @InputImport(name="match", required=true)
        private final Input<HttpRouteMatchRuleArgs> match;

    public Input<HttpRouteMatchRuleArgs> getMatch() {
        return this.match;
    }

    /**
     * http route name.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public HttpRouteConfigArgs(
        Input<GatewayDestinationArgs> destination,
        Input<HttpRouteMatchRuleArgs> match,
        Input<String> name) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.match = Objects.requireNonNull(match, "expected parameter 'match' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private HttpRouteConfigArgs() {
        this.destination = Input.empty();
        this.match = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GatewayDestinationArgs> destination;
        private Input<HttpRouteMatchRuleArgs> match;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.match = defaults.match;
    	      this.name = defaults.name;
        }

        public Builder setDestination(Input<GatewayDestinationArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestination(GatewayDestinationArgs destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
            return this;
        }

        public Builder setMatch(Input<HttpRouteMatchRuleArgs> match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }

        public Builder setMatch(HttpRouteMatchRuleArgs match) {
            this.match = Input.of(Objects.requireNonNull(match));
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
        public HttpRouteConfigArgs build() {
            return new HttpRouteConfigArgs(destination, match, name);
        }
    }
}
