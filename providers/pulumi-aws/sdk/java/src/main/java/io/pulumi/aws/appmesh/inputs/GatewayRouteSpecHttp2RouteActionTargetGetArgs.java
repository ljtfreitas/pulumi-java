// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttp2RouteActionTargetVirtualServiceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class GatewayRouteSpecHttp2RouteActionTargetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttp2RouteActionTargetGetArgs Empty = new GatewayRouteSpecHttp2RouteActionTargetGetArgs();

    /**
     * The virtual service gateway route target.
     * 
     */
    @Import(name="virtualService", required=true)
      private final Output<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceGetArgs> virtualService;

    public Output<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceGetArgs> getVirtualService() {
        return this.virtualService;
    }

    public GatewayRouteSpecHttp2RouteActionTargetGetArgs(Output<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceGetArgs> virtualService) {
        this.virtualService = Objects.requireNonNull(virtualService, "expected parameter 'virtualService' to be non-null");
    }

    private GatewayRouteSpecHttp2RouteActionTargetGetArgs() {
        this.virtualService = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttp2RouteActionTargetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceGetArgs> virtualService;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttp2RouteActionTargetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualService = defaults.virtualService;
        }

        public Builder virtualService(Output<GatewayRouteSpecHttp2RouteActionTargetVirtualServiceGetArgs> virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }

        public Builder virtualService(GatewayRouteSpecHttp2RouteActionTargetVirtualServiceGetArgs virtualService) {
            this.virtualService = Output.of(Objects.requireNonNull(virtualService));
            return this;
        }
        public GatewayRouteSpecHttp2RouteActionTargetGetArgs build() {
            return new GatewayRouteSpecHttp2RouteActionTargetGetArgs(virtualService);
        }
    }
}
