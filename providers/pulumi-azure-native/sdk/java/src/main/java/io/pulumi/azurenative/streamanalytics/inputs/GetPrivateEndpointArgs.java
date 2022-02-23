// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointArgs Empty = new GetPrivateEndpointArgs();

    /**
     * The name of the cluster.
     * 
     */
    @InputImport(name="clusterName", required=true)
        private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * The name of the private endpoint.
     * 
     */
    @InputImport(name="privateEndpointName", required=true)
        private final String privateEndpointName;

    public String getPrivateEndpointName() {
        return this.privateEndpointName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPrivateEndpointArgs(
        String clusterName,
        String privateEndpointName,
        String resourceGroupName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.privateEndpointName = Objects.requireNonNull(privateEndpointName, "expected parameter 'privateEndpointName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPrivateEndpointArgs() {
        this.clusterName = null;
        this.privateEndpointName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String privateEndpointName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.privateEndpointName = defaults.privateEndpointName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setPrivateEndpointName(String privateEndpointName) {
            this.privateEndpointName = Objects.requireNonNull(privateEndpointName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetPrivateEndpointArgs build() {
            return new GetPrivateEndpointArgs(clusterName, privateEndpointName, resourceGroupName);
        }
    }
}
