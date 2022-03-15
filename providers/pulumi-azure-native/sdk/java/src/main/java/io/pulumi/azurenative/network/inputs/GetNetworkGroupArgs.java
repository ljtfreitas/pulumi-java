// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNetworkGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNetworkGroupArgs Empty = new GetNetworkGroupArgs();

    /**
     * The name of the network group to get.
     * 
     */
    @Import(name="networkGroupName", required=true)
      private final String networkGroupName;

    public String getNetworkGroupName() {
        return this.networkGroupName;
    }

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
      private final String networkManagerName;

    public String getNetworkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetNetworkGroupArgs(
        String networkGroupName,
        String networkManagerName,
        String resourceGroupName) {
        this.networkGroupName = Objects.requireNonNull(networkGroupName, "expected parameter 'networkGroupName' to be non-null");
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetNetworkGroupArgs() {
        this.networkGroupName = null;
        this.networkManagerName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkGroupName;
        private String networkManagerName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkGroupName = defaults.networkGroupName;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder networkGroupName(String networkGroupName) {
            this.networkGroupName = Objects.requireNonNull(networkGroupName);
            return this;
        }

        public Builder networkManagerName(String networkManagerName) {
            this.networkManagerName = Objects.requireNonNull(networkManagerName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetNetworkGroupArgs build() {
            return new GetNetworkGroupArgs(networkGroupName, networkManagerName, resourceGroupName);
        }
    }
}
