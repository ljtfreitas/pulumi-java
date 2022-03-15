// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceArgs Empty = new GetServiceArgs();

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service resource.
     * 
     */
    @Import(name="serviceName", required=true)
      private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * The name of the service topology .
     * 
     */
    @Import(name="serviceTopologyName", required=true)
      private final String serviceTopologyName;

    public String getServiceTopologyName() {
        return this.serviceTopologyName;
    }

    public GetServiceArgs(
        String resourceGroupName,
        String serviceName,
        String serviceTopologyName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.serviceTopologyName = Objects.requireNonNull(serviceTopologyName, "expected parameter 'serviceTopologyName' to be non-null");
    }

    private GetServiceArgs() {
        this.resourceGroupName = null;
        this.serviceName = null;
        this.serviceTopologyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String serviceName;
        private String serviceTopologyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceTopologyName = defaults.serviceTopologyName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder serviceTopologyName(String serviceTopologyName) {
            this.serviceTopologyName = Objects.requireNonNull(serviceTopologyName);
            return this;
        }
        public GetServiceArgs build() {
            return new GetServiceArgs(resourceGroupName, serviceName, serviceTopologyName);
        }
    }
}
