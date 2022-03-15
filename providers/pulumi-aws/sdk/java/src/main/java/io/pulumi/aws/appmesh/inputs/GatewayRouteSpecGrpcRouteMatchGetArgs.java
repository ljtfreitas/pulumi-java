// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GatewayRouteSpecGrpcRouteMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecGrpcRouteMatchGetArgs Empty = new GatewayRouteSpecGrpcRouteMatchGetArgs();

    /**
     * The fully qualified domain name for the service to match from the request.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    public GatewayRouteSpecGrpcRouteMatchGetArgs(Output<String> serviceName) {
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GatewayRouteSpecGrpcRouteMatchGetArgs() {
        this.serviceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecGrpcRouteMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecGrpcRouteMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceName = defaults.serviceName;
        }

        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public GatewayRouteSpecGrpcRouteMatchGetArgs build() {
            return new GatewayRouteSpecGrpcRouteMatchGetArgs(serviceName);
        }
    }
}
