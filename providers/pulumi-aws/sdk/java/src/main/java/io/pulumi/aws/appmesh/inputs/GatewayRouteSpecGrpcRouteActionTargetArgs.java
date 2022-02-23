// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class GatewayRouteSpecGrpcRouteActionTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecGrpcRouteActionTargetArgs Empty = new GatewayRouteSpecGrpcRouteActionTargetArgs();

    /**
     * The virtual service gateway route target.
     * 
     */
    @InputImport(name="virtualService", required=true)
    private final Input<GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs> virtualService;

    public Input<GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs> getVirtualService() {
        return this.virtualService;
    }

    public GatewayRouteSpecGrpcRouteActionTargetArgs(Input<GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs> virtualService) {
        this.virtualService = Objects.requireNonNull(virtualService, "expected parameter 'virtualService' to be non-null");
    }

    private GatewayRouteSpecGrpcRouteActionTargetArgs() {
        this.virtualService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecGrpcRouteActionTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs> virtualService;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecGrpcRouteActionTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualService = defaults.virtualService;
        }

        public Builder setVirtualService(Input<GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs> virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }

        public Builder setVirtualService(GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs virtualService) {
            this.virtualService = Input.of(Objects.requireNonNull(virtualService));
            return this;
        }
        public GatewayRouteSpecGrpcRouteActionTargetArgs build() {
            return new GatewayRouteSpecGrpcRouteActionTargetArgs(virtualService);
        }
    }
}