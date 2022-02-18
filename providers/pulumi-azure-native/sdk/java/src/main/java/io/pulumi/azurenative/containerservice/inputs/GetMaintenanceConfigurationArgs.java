// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMaintenanceConfigurationArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMaintenanceConfigurationArgs Empty = new GetMaintenanceConfigurationArgs();

    /**
     * The name of the maintenance configuration.
     * 
     */
    @InputImport(name="configName", required=true)
    private final String configName;

    public String getConfigName() {
        return this.configName;
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

    /**
     * The name of the managed cluster resource.
     * 
     */
    @InputImport(name="resourceName", required=true)
    private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    public GetMaintenanceConfigurationArgs(
        String configName,
        String resourceGroupName,
        String resourceName) {
        this.configName = Objects.requireNonNull(configName, "expected parameter 'configName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private GetMaintenanceConfigurationArgs() {
        this.configName = null;
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaintenanceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configName;
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMaintenanceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configName = defaults.configName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder setConfigName(String configName) {
            this.configName = Objects.requireNonNull(configName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public GetMaintenanceConfigurationArgs build() {
            return new GetMaintenanceConfigurationArgs(configName, resourceGroupName, resourceName);
        }
    }
}
