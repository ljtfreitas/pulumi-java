// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GatewayRouteSpecGrpcRouteMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecGrpcRouteMatchGetArgs Empty = new GatewayRouteSpecGrpcRouteMatchGetArgs();

    /**
     * The fully qualified domain name for the service to match from the request.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    public GatewayRouteSpecGrpcRouteMatchGetArgs(Input<String> serviceName) {
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GatewayRouteSpecGrpcRouteMatchGetArgs() {
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecGrpcRouteMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecGrpcRouteMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public GatewayRouteSpecGrpcRouteMatchGetArgs build() {
            return new GatewayRouteSpecGrpcRouteMatchGetArgs(serviceName);
        }
    }
}
