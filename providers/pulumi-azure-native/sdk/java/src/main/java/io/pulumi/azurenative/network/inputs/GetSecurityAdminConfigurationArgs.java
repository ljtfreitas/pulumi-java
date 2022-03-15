// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSecurityAdminConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecurityAdminConfigurationArgs Empty = new GetSecurityAdminConfigurationArgs();

    /**
     * The name of the network manager security Configuration.
     * 
     */
    @Import(name="configurationName", required=true)
      private final String configurationName;

    public String getConfigurationName() {
        return this.configurationName;
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

    public GetSecurityAdminConfigurationArgs(
        String configurationName,
        String networkManagerName,
        String resourceGroupName) {
        this.configurationName = Objects.requireNonNull(configurationName, "expected parameter 'configurationName' to be non-null");
        this.networkManagerName = Objects.requireNonNull(networkManagerName, "expected parameter 'networkManagerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetSecurityAdminConfigurationArgs() {
        this.configurationName = null;
        this.networkManagerName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityAdminConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configurationName;
        private String networkManagerName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityAdminConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.networkManagerName = defaults.networkManagerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder configurationName(String configurationName) {
            this.configurationName = Objects.requireNonNull(configurationName);
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
        public GetSecurityAdminConfigurationArgs build() {
            return new GetSecurityAdminConfigurationArgs(configurationName, networkManagerName, resourceGroupName);
        }
    }
}
