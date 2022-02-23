// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetHostPoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetHostPoolArgs Empty = new GetHostPoolArgs();

    /**
     * The name of the host pool within the specified resource group
     * 
     */
    @InputImport(name="hostPoolName", required=true)
        private final String hostPoolName;

    public String getHostPoolName() {
        return this.hostPoolName;
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

    public GetHostPoolArgs(
        String hostPoolName,
        String resourceGroupName) {
        this.hostPoolName = Objects.requireNonNull(hostPoolName, "expected parameter 'hostPoolName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetHostPoolArgs() {
        this.hostPoolName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hostPoolName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHostPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostPoolName = defaults.hostPoolName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setHostPoolName(String hostPoolName) {
            this.hostPoolName = Objects.requireNonNull(hostPoolName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetHostPoolArgs build() {
            return new GetHostPoolArgs(hostPoolName, resourceGroupName);
        }
    }
}
