// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetComponentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetComponentArgs Empty = new GetComponentArgs();

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
     * The name of the Application Insights component resource.
     * 
     */
    @InputImport(name="resourceName", required=true)
        private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    public GetComponentArgs(
        String resourceGroupName,
        String resourceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private GetComponentArgs() {
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComponentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public GetComponentArgs build() {
            return new GetComponentArgs(resourceGroupName, resourceName);
        }
    }
}
