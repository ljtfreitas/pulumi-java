// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetProfileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProfileArgs Empty = new GetProfileArgs();

    /**
     * The name of the Traffic Manager profile.
     * 
     */
    @InputImport(name="profileName", required=true)
        private final String profileName;

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * The name of the resource group containing the Traffic Manager profile.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetProfileArgs(
        String profileName,
        String resourceGroupName) {
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetProfileArgs() {
        this.profileName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String profileName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProfileArgs defaults) {
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
        public GetProfileArgs build() {
            return new GetProfileArgs(profileName, resourceGroupName);
        }
    }
}
