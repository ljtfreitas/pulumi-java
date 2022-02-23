// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListRegistryBuildSourceUploadUrlArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListRegistryBuildSourceUploadUrlArgs Empty = new ListRegistryBuildSourceUploadUrlArgs();

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

    public ListRegistryBuildSourceUploadUrlArgs(
        String registryName,
        String resourceGroupName) {
        this.registryName = Objects.requireNonNull(registryName, "expected parameter 'registryName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListRegistryBuildSourceUploadUrlArgs() {
        this.registryName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListRegistryBuildSourceUploadUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String registryName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListRegistryBuildSourceUploadUrlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryName = defaults.registryName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setRegistryName(String registryName) {
            this.registryName = Objects.requireNonNull(registryName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public ListRegistryBuildSourceUploadUrlArgs build() {
            return new ListRegistryBuildSourceUploadUrlArgs(registryName, resourceGroupName);
        }
    }
}
