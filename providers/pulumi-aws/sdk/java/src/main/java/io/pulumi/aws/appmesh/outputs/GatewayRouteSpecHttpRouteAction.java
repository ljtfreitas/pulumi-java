// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttpRouteActionTarget;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GatewayRouteSpecHttpRouteAction {
    /**
     * The target that traffic is routed to when a request matches the gateway route.
     * 
     */
    private final GatewayRouteSpecHttpRouteActionTarget target;

    @OutputCustomType.Constructor({"target"})
    private GatewayRouteSpecHttpRouteAction(GatewayRouteSpecHttpRouteActionTarget target) {
        this.target = Objects.requireNonNull(target);
    }

    /**
     * The target that traffic is routed to when a request matches the gateway route.
     * 
     */
    public GatewayRouteSpecHttpRouteActionTarget getTarget() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttpRouteAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecHttpRouteActionTarget target;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttpRouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        public Builder setTarget(GatewayRouteSpecHttpRouteActionTarget target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public GatewayRouteSpecHttpRouteAction build() {
            return new GatewayRouteSpecHttpRouteAction(target);
        }
    }
}
