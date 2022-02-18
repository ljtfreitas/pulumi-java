// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFrontDoorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFrontDoorArgs Empty = new GetFrontDoorArgs();

    /**
     * Name of the Front Door which is globally unique.
     * 
     */
    @InputImport(name="frontDoorName", required=true)
    private final String frontDoorName;

    public String getFrontDoorName() {
        return this.frontDoorName;
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

    public GetFrontDoorArgs(
        String frontDoorName,
        String resourceGroupName) {
        this.frontDoorName = Objects.requireNonNull(frontDoorName, "expected parameter 'frontDoorName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetFrontDoorArgs() {
        this.frontDoorName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFrontDoorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String frontDoorName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFrontDoorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.frontDoorName = defaults.frontDoorName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setFrontDoorName(String frontDoorName) {
            this.frontDoorName = Objects.requireNonNull(frontDoorName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetFrontDoorArgs build() {
            return new GetFrontDoorArgs(frontDoorName, resourceGroupName);
        }
    }
}
