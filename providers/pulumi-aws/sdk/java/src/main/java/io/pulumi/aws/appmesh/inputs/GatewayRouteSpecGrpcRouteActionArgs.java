// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionTargetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class GatewayRouteSpecGrpcRouteActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecGrpcRouteActionArgs Empty = new GatewayRouteSpecGrpcRouteActionArgs();

    /**
     * The target that traffic is routed to when a request matches the gateway route.
     * 
     */
    @InputImport(name="target", required=true)
    private final Input<GatewayRouteSpecGrpcRouteActionTargetArgs> target;

    public Input<GatewayRouteSpecGrpcRouteActionTargetArgs> getTarget() {
        return this.target;
    }

    public GatewayRouteSpecGrpcRouteActionArgs(Input<GatewayRouteSpecGrpcRouteActionTargetArgs> target) {
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private GatewayRouteSpecGrpcRouteActionArgs() {
        this.target = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecGrpcRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GatewayRouteSpecGrpcRouteActionTargetArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecGrpcRouteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        public Builder setTarget(Input<GatewayRouteSpecGrpcRouteActionTargetArgs> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder setTarget(GatewayRouteSpecGrpcRouteActionTargetArgs target) {
            this.target = Input.of(Objects.requireNonNull(target));
            return this;
        }
        public GatewayRouteSpecGrpcRouteActionArgs build() {
            return new GatewayRouteSpecGrpcRouteActionArgs(target);
        }
    }
}
