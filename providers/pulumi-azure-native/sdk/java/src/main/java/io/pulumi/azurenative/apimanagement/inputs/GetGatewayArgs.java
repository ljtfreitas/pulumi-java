// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGatewayArgs Empty = new GetGatewayArgs();

    @InputImport(name="gatewayId", required=true)
    private final String gatewayId;

    public String getGatewayId() {
        return this.gatewayId;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetGatewayArgs(
        String gatewayId,
        String resourceGroupName,
        String serviceName) {
        this.gatewayId = Objects.requireNonNull(gatewayId, "expected parameter 'gatewayId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetGatewayArgs() {
        this.gatewayId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewayId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayId = defaults.gatewayId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setGatewayId(String gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public GetGatewayArgs build() {
            return new GetGatewayArgs(gatewayId, resourceGroupName, serviceName);
        }
    }
}