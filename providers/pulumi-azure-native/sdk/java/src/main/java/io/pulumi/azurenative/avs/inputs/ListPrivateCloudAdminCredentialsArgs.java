// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListPrivateCloudAdminCredentialsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListPrivateCloudAdminCredentialsArgs Empty = new ListPrivateCloudAdminCredentialsArgs();

    /**
     * Name of the private cloud
     * 
     */
    @InputImport(name="privateCloudName", required=true)
    private final String privateCloudName;

    public String getPrivateCloudName() {
        return this.privateCloudName;
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

    public ListPrivateCloudAdminCredentialsArgs(
        String privateCloudName,
        String resourceGroupName) {
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListPrivateCloudAdminCredentialsArgs() {
        this.privateCloudName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListPrivateCloudAdminCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateCloudName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListPrivateCloudAdminCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setPrivateCloudName(String privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public ListPrivateCloudAdminCredentialsArgs build() {
            return new ListPrivateCloudAdminCredentialsArgs(privateCloudName, resourceGroupName);
        }
    }
}
