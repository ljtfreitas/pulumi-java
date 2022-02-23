// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetConnectedRegistryArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectedRegistryArgs Empty = new GetConnectedRegistryArgs();

    /**
     * The name of the connected registry.
     * 
     */
    @InputImport(name="connectedRegistryName", required=true)
        private final String connectedRegistryName;

    public String getConnectedRegistryName() {
        return this.connectedRegistryName;
    }

    /**
     * The name of the container registry.
     * 
     */
    @InputImport(name="registryName", required=true)
        private final String registryName;

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetConnectedRegistryArgs(
        String connectedRegistryName,
        String registryName,
        String resourceGroupName) {
        this.connectedRegistryName = Objects.requireNonNull(connectedRegistryName, "expected parameter 'connectedRegistryName' to be non-null");
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetConnectedRegistryArgs() {
        this.connectedRegistryName = null;
        this.registryName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectedRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectedRegistryName;
        private String registryName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectedRegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectedRegistryName = defaults.connectedRegistryName;
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setConnectedRegistryName(String connectedRegistryName) {
            this.connectedRegistryName = Objects.requireNonNull(connectedRegistryName);
            return this;
        }

        public Builder setRegistryName(String registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetConnectedRegistryArgs build() {
            return new GetConnectedRegistryArgs(connectedRegistryName, registryName, resourceGroupName);
        }
    }
}
