// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWorkloadNetworkDhcpArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWorkloadNetworkDhcpArgs Empty = new GetWorkloadNetworkDhcpArgs();

    /**
     * NSX DHCP identifier. Generally the same as the DHCP display name
     * 
     */
    @InputImport(name="dhcpId", required=true)
        private final String dhcpId;

    public String getDhcpId() {
        return this.dhcpId;
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

    public GetWorkloadNetworkDhcpArgs(
        String dhcpId,
        String privateCloudName,
        String resourceGroupName) {
        this.dhcpId = Objects.requireNonNull(dhcpId, "expected parameter 'dhcpId' to be non-null");
        this.privateCloudName = Objects.requireNonNull(privateCloudName, "expected parameter 'privateCloudName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetWorkloadNetworkDhcpArgs() {
        this.dhcpId = null;
        this.privateCloudName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadNetworkDhcpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dhcpId;
        private String privateCloudName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadNetworkDhcpArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dhcpId = defaults.dhcpId;
    	      this.privateCloudName = defaults.privateCloudName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDhcpId(String dhcpId) {
            this.dhcpId = Objects.requireNonNull(dhcpId);
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
        public GetWorkloadNetworkDhcpArgs build() {
            return new GetWorkloadNetworkDhcpArgs(dhcpId, privateCloudName, resourceGroupName);
        }
    }
}
