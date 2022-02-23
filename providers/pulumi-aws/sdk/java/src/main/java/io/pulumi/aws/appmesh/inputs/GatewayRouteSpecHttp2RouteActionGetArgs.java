// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionTargetGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class GatewayRouteSpecHttp2RouteActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttp2RouteActionGetArgs Empty = new GatewayRouteSpecHttp2RouteActionGetArgs();

    /**
     * The target that traffic is routed to when a request matches the gateway route.
     * 
     */
    @InputImport(name="target", required=true)
    private final Input<GatewayRouteSpecHttp2RouteActionTargetGetArgs> target;

    public Input<GatewayRouteSpecHttp2RouteActionTargetGetArgs> getTarget() {
        return this.target;
    }

    public GatewayRouteSpecHttp2RouteActionGetArgs(Input<GatewayRouteSpecHttp2RouteActionTargetGetArgs> target) {
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private GatewayRouteSpecHttp2RouteActionGetArgs() {
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttp2RouteActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GatewayRouteSpecHttp2RouteActionTargetGetArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttp2RouteActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        public Builder setTarget(Input<GatewayRouteSpecHttp2RouteActionTargetGetArgs> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setTarget(GatewayRouteSpecHttp2RouteActionTargetGetArgs target) {
            this.target = Input.of(Objects.requireNonNull(target));
            return this;
        }
        public GatewayRouteSpecHttp2RouteActionGetArgs build() {
            return new GatewayRouteSpecHttp2RouteActionGetArgs(target);
        }
    }
}
