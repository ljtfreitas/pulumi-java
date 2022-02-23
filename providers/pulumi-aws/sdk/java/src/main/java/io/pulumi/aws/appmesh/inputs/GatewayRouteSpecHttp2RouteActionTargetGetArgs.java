// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionTargetVirtualServiceGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class GatewayRouteSpecHttp2RouteActionTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttp2RouteActionTargetGetArgs Empty = new GatewayRouteSpecHttp2RouteActionTargetGetArgs();

    /**
     * The virtual service gateway route target.
     * 
     */
    @InputImport(name="virtualService", required=true)
    private final Input<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceGetArgs> virtualService;

    public Input<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceGetArgs> getVirtualService() {
        return this.virtualService;
    }

    public GatewayRouteSpecHttp2RouteActionTargetGetArgs(Input<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceGetArgs> virtualService) {
        this.virtualService = Objects.requireNonNull(virtualService, "expected parameter 'virtualService' to be non-null");
    }

    private GatewayRouteSpecHttp2RouteActionTargetGetArgs() {
        this.virtualService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttp2RouteActionTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceGetArgs> virtualService;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttp2RouteActionTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualService = defaults.virtualService;
        }

        public Builder setVirtualService(Input<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceGetArgs> virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }

        public Builder setVirtualService(GatewayRouteSpecHttp2RouteActionTargetVirtualServiceGetArgs virtualService) {
            this.virtualService = Input.of(Objects.requireNonNull(virtualService));
            return this;
        }
        public GatewayRouteSpecHttp2RouteActionTargetGetArgs build() {
            return new GatewayRouteSpecHttp2RouteActionTargetGetArgs(virtualService);
        }
    }
}
