// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbi.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionArgs Empty = new GetPrivateEndpointConnectionArgs();

    /**
     * The name of the Azure resource.
     * 
     */
    @Import(name="azureResourceName", required=true)
      private final String azureResourceName;

    public String getAzureResourceName() {
        return this.azureResourceName;
    }

    /**
     * The name of the private endpoint.
     * 
     */
    @Import(name="privateEndpointName", required=true)
      private final String privateEndpointName;

    public String getPrivateEndpointName() {
        return this.privateEndpointName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPrivateEndpointConnectionArgs(
        String azureResourceName,
        String privateEndpointName,
        String resourceGroupName) {
        this.azureResourceName = Objects.requireNonNull(azureResourceName, "expected parameter 'azureResourceName' to be non-null");
        this.privateEndpointName = Objects.requireNonNull(privateEndpointName, "expected parameter 'privateEndpointName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPrivateEndpointConnectionArgs() {
        this.azureResourceName = null;
        this.privateEndpointName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String azureResourceName;
        private String privateEndpointName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureResourceName = defaults.azureResourceName;
    	      this.privateEndpointName = defaults.privateEndpointName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder azureResourceName(String azureResourceName) {
            this.azureResourceName = Objects.requireNonNull(azureResourceName);
            return this;
        }

        public Builder privateEndpointName(String privateEndpointName) {
            this.privateEndpointName = Objects.requireNonNull(privateEndpointName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetPrivateEndpointConnectionArgs build() {
            return new GetPrivateEndpointConnectionArgs(azureResourceName, privateEndpointName, resourceGroupName);
        }
    }
}
