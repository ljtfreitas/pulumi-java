// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateZoneArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateZoneArgs Empty = new GetPrivateZoneArgs();

    /**
     * The name of the Private DNS zone (without a terminating dot).
     * 
     */
    @InputImport(name="privateZoneName", required=true)
    private final String privateZoneName;

    public String getPrivateZoneName() {
        return this.privateZoneName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPrivateZoneArgs(
        String privateZoneName,
        String resourceGroupName) {
        this.privateZoneName = Objects.requireNonNull(privateZoneName, "expected parameter 'privateZoneName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPrivateZoneArgs() {
        this.privateZoneName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateZoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateZoneName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateZoneArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateZoneName = defaults.privateZoneName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setPrivateZoneName(String privateZoneName) {
            this.privateZoneName = Objects.requireNonNull(privateZoneName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetPrivateZoneArgs build() {
            return new GetPrivateZoneArgs(privateZoneName, resourceGroupName);
        }
    }
}
