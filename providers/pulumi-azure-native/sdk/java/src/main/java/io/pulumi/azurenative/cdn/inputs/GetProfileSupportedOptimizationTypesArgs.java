// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetProfileSupportedOptimizationTypesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProfileSupportedOptimizationTypesArgs Empty = new GetProfileSupportedOptimizationTypesArgs();

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @InputImport(name="profileName", required=true)
        private final String profileName;

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetProfileSupportedOptimizationTypesArgs(
        String profileName,
        String resourceGroupName) {
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetProfileSupportedOptimizationTypesArgs() {
        this.profileName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProfileSupportedOptimizationTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String profileName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProfileSupportedOptimizationTypesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetProfileSupportedOptimizationTypesArgs build() {
            return new GetProfileSupportedOptimizationTypesArgs(profileName, resourceGroupName);
        }
    }
}
