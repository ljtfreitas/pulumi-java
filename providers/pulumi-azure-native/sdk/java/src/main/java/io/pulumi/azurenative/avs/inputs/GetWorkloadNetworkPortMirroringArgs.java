// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWorkloadNetworkPortMirroringArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWorkloadNetworkPortMirroringArgs Empty = new GetWorkloadNetworkPortMirroringArgs();

    /**
     * NSX Port Mirroring identifier. Generally the same as the Port Mirroring display name
     * 
     */
    @InputImport(name="portMirroringId", required=true)
    private final String portMirroringId;

    public String getPortMirroringId() {
        return this.portMirroringId;
    }

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

    public GetWorkloadNetworkPortMirroringArgs(
        String portMirroringId,
        String privateCloudName,
        String resourceGroupName) {
        this.portMirroringId = Objects.requireNonNull(portMirroringId, "expected parameter 'portMirroringId' to be non-null");
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetWorkloadNetworkPortMirroringArgs() {
        this.portMirroringId = null;
        this.privateCloudName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadNetworkPortMirroringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String portMirroringId;
        private String privateCloudName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadNetworkPortMirroringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.portMirroringId = defaults.portMirroringId;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setPortMirroringId(String portMirroringId) {
            this.portMirroringId = Objects.requireNonNull(portMirroringId);
            return this;
        }

        public Builder setPrivateCloudName(String privateCloudName) {
            this.privateCloudName = Objects.requireNonNull(privateCloudName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetWorkloadNetworkPortMirroringArgs build() {
            return new GetWorkloadNetworkPortMirroringArgs(portMirroringId, privateCloudName, resourceGroupName);
        }
    }
}
