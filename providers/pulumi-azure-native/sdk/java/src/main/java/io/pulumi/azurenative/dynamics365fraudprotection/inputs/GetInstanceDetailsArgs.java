// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dynamics365fraudprotection.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceDetailsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceDetailsArgs Empty = new GetInstanceDetailsArgs();

    /**
     * The name of the instance. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    @InputImport(name="instanceName", required=true)
    private final String instanceName;

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * The name of the Azure Resource group of which a given DFP instance is part. This name must be at least 1 character in length, and no more than 90.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetInstanceDetailsArgs(
        String instanceName,
        String resourceGroupName) {
        this.instanceName = Objects.requireNonNull(instanceName, "expected parameter 'instanceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetInstanceDetailsArgs() {
        this.instanceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceName = defaults.instanceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setInstanceName(String instanceName) {
            this.instanceName = Objects.requireNonNull(instanceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetInstanceDetailsArgs build() {
            return new GetInstanceDetailsArgs(instanceName, resourceGroupName);
        }
    }
}
