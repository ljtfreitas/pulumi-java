// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ExpressRoute circuit peering identifier.
 * 
 */
public final class ExpressRouteCircuitPeeringIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExpressRouteCircuitPeeringIdArgs Empty = new ExpressRouteCircuitPeeringIdArgs();

    /**
     * The ID of the ExpressRoute circuit peering.
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    public ExpressRouteCircuitPeeringIdArgs(@Nullable Input<String> id) {
        this.id = id;
    }

    private ExpressRouteCircuitPeeringIdArgs() {
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitPeeringIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitPeeringIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }
        public ExpressRouteCircuitPeeringIdArgs build() {
            return new ExpressRouteCircuitPeeringIdArgs(id);
        }
    }
}
