// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListBotConnectionWithSecretsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListBotConnectionWithSecretsArgs Empty = new ListBotConnectionWithSecretsArgs();

    /**
     * The name of the Bot Service Connection Setting resource.
     * 
     */
    @InputImport(name="connectionName", required=true)
        private final String connectionName;

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * The name of the Bot resource group in the user subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Bot resource.
     * 
     */
    @InputImport(name="resourceName", required=true)
        private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    public ListBotConnectionWithSecretsArgs(
        String connectionName,
        String resourceGroupName,
        String resourceName) {
        this.connectionName = Objects.requireNonNull(connectionName, "expected parameter 'connectionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private ListBotConnectionWithSecretsArgs() {
        this.connectionName = null;
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListBotConnectionWithSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionName;
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListBotConnectionWithSecretsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionName = defaults.connectionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder setConnectionName(String connectionName) {
            this.connectionName = Objects.requireNonNull(connectionName);
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
        public ListBotConnectionWithSecretsArgs build() {
            return new ListBotConnectionWithSecretsArgs(connectionName, resourceGroupName, resourceName);
        }
    }
}
