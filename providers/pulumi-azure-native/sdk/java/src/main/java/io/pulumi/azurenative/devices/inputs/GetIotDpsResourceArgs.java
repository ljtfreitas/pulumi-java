// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetIotDpsResourceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIotDpsResourceArgs Empty = new GetIotDpsResourceArgs();

    /**
     * Name of the provisioning service to retrieve.
     * 
     */
    @InputImport(name="provisioningServiceName", required=true)
        private final String provisioningServiceName;

    public String getProvisioningServiceName() {
        return this.provisioningServiceName;
    }

    /**
     * Resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetIotDpsResourceArgs(
        String provisioningServiceName,
        String resourceGroupName) {
        this.provisioningServiceName = Objects.requireNonNull(provisioningServiceName, "expected parameter 'provisioningServiceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetIotDpsResourceArgs() {
        this.provisioningServiceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIotDpsResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String provisioningServiceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIotDpsResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provisioningServiceName = defaults.provisioningServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setProvisioningServiceName(String provisioningServiceName) {
            this.provisioningServiceName = Objects.requireNonNull(provisioningServiceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetIotDpsResourceArgs build() {
            return new GetIotDpsResourceArgs(provisioningServiceName, resourceGroupName);
        }
    }
}
