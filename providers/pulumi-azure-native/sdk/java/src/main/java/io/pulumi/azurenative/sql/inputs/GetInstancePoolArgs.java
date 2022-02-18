// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetInstancePoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstancePoolArgs Empty = new GetInstancePoolArgs();

    /**
     * The name of the instance pool to be retrieved.
     * 
     */
    @InputImport(name="instancePoolName", required=true)
    private final String instancePoolName;

    public String getInstancePoolName() {
        return this.instancePoolName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetInstancePoolArgs(
        String instancePoolName,
        String resourceGroupName) {
        this.instancePoolName = Objects.requireNonNull(instancePoolName, "expected parameter 'instancePoolName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetInstancePoolArgs() {
        this.instancePoolName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instancePoolName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancePoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instancePoolName = defaults.instancePoolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setInstancePoolName(String instancePoolName) {
            this.instancePoolName = Objects.requireNonNull(instancePoolName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetInstancePoolArgs build() {
            return new GetInstancePoolArgs(instancePoolName, resourceGroupName);
        }
    }
}
