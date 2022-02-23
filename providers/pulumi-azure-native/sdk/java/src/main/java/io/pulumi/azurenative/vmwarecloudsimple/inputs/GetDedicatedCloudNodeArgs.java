// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDedicatedCloudNodeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDedicatedCloudNodeArgs Empty = new GetDedicatedCloudNodeArgs();

    /**
     * dedicated cloud node name
     * 
     */
    @InputImport(name="dedicatedCloudNodeName", required=true)
        private final String dedicatedCloudNodeName;

    public String getDedicatedCloudNodeName() {
        return this.dedicatedCloudNodeName;
    }

    /**
     * The name of the resource group
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDedicatedCloudNodeArgs(
        String dedicatedCloudNodeName,
        String resourceGroupName) {
        this.dedicatedCloudNodeName = Objects.requireNonNull(dedicatedCloudNodeName, "expected parameter 'dedicatedCloudNodeName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDedicatedCloudNodeArgs() {
        this.dedicatedCloudNodeName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDedicatedCloudNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dedicatedCloudNodeName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDedicatedCloudNodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedicatedCloudNodeName = defaults.dedicatedCloudNodeName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDedicatedCloudNodeName(String dedicatedCloudNodeName) {
            this.dedicatedCloudNodeName = Objects.requireNonNull(dedicatedCloudNodeName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetDedicatedCloudNodeArgs build() {
            return new GetDedicatedCloudNodeArgs(dedicatedCloudNodeName, resourceGroupName);
        }
    }
}
