// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayRouteConfigArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGatewayRouteConfigArgs Empty = new GetGatewayRouteConfigArgs();

    /**
     * The name of Spring Cloud Gateway.
     * 
     */
    @Import(name="gatewayName", required=true)
      private final String gatewayName;

    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Spring Cloud Gateway route config.
     * 
     */
    @Import(name="routeConfigName", required=true)
      private final String routeConfigName;

    public String getRouteConfigName() {
        return this.routeConfigName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetGatewayRouteConfigArgs(
        String gatewayName,
        String resourceGroupName,
        String routeConfigName,
        String serviceName) {
        this.gatewayName = Objects.requireNonNull(gatewayName, "expected parameter 'gatewayName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routeConfigName = Objects.requireNonNull(routeConfigName, "expected parameter 'routeConfigName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetGatewayRouteConfigArgs() {
        this.gatewayName = null;
        this.resourceGroupName = null;
        this.routeConfigName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayRouteConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewayName;
        private String resourceGroupName;
        private String routeConfigName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayRouteConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayName = defaults.gatewayName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routeConfigName = defaults.routeConfigName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder gatewayName(String gatewayName) {
            this.gatewayName = Objects.requireNonNull(gatewayName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder routeConfigName(String routeConfigName) {
            this.routeConfigName = Objects.requireNonNull(routeConfigName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public GetGatewayRouteConfigArgs build() {
            return new GetGatewayRouteConfigArgs(gatewayName, resourceGroupName, routeConfigName, serviceName);
        }
    }
}
