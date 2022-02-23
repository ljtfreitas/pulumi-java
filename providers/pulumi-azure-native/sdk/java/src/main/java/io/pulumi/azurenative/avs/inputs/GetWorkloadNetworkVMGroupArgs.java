// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWorkloadNetworkVMGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWorkloadNetworkVMGroupArgs Empty = new GetWorkloadNetworkVMGroupArgs();

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

    /**
     * NSX VM Group identifier. Generally the same as the VM Group's display name
     * 
     */
    @InputImport(name="vmGroupId", required=true)
        private final String vmGroupId;

    public String getVmGroupId() {
        return this.vmGroupId;
    }

    public GetWorkloadNetworkVMGroupArgs(
        String privateCloudName,
        String resourceGroupName,
        String vmGroupId) {
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vmGroupId = Objects.requireNonNull(vmGroupId, "expected parameter 'vmGroupId' to be non-null");
    }

    private GetWorkloadNetworkVMGroupArgs() {
        this.privateCloudName = null;
        this.resourceGroupName = null;
        this.vmGroupId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadNetworkVMGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateCloudName;
        private String resourceGroupName;
        private String vmGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadNetworkVMGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vmGroupId = defaults.vmGroupId;
        }

        public Builder setPrivateCloudName(String privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVmGroupId(String vmGroupId) {
            this.vmGroupId = Objects.requireNonNull(vmGroupId);
            return this;
        }
        public GetWorkloadNetworkVMGroupArgs build() {
            return new GetWorkloadNetworkVMGroupArgs(privateCloudName, resourceGroupName, vmGroupId);
        }
    }
}
