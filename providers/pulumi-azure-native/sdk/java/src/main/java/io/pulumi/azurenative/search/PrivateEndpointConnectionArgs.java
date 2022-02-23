// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search;

import io.pulumi.azurenative.search.inputs.PrivateEndpointConnectionPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionArgs Empty = new PrivateEndpointConnectionArgs();

    /**
     * The name of the private endpoint connection to the Azure Cognitive Search service with the specified resource group.
     * 
     */
    @InputImport(name="privateEndpointConnectionName")
        private final @Nullable Input<String> privateEndpointConnectionName;

    public Input<String> getPrivateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Input.empty() : this.privateEndpointConnectionName;
    }

    /**
     * Describes the properties of an existing Private Endpoint connection to the Azure Cognitive Search service.
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Input<PrivateEndpointConnectionPropertiesArgs> properties;

    public Input<PrivateEndpointConnectionPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group within the current subscription. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Azure Cognitive Search service associated with the specified resource group.
     * 
     */
    @InputImport(name="searchServiceName", required=true)
        private final Input<String> searchServiceName;

    public Input<String> getSearchServiceName() {
        return this.searchServiceName;
    }

    public PrivateEndpointConnectionArgs(
        @Nullable Input<String> privateEndpointConnectionName,
        @Nullable Input<PrivateEndpointConnectionPropertiesArgs> properties,
        Input<String> resourceGroupName,
        Input<String> searchServiceName) {
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.searchServiceName = Objects.requireNonNull(searchServiceName, "expected parameter 'searchServiceName' to be non-null");
    }

    private PrivateEndpointConnectionArgs() {
        this.privateEndpointConnectionName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.searchServiceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> privateEndpointConnectionName;
        private @Nullable Input<PrivateEndpointConnectionPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> searchServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.searchServiceName = defaults.searchServiceName;
        }

        public Builder setPrivateEndpointConnectionName(@Nullable Input<String> privateEndpointConnectionName) {
            this.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder setPrivateEndpointConnectionName(@Nullable String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Input.ofNullable(privateEndpointConnectionName);
            return this;
        }

        public Builder setProperties(@Nullable Input<PrivateEndpointConnectionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable PrivateEndpointConnectionPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSearchServiceName(Input<String> searchServiceName) {
            this.searchServiceName = Objects.requireNonNull(searchServiceName);
            return this;
        }

        public Builder setSearchServiceName(String searchServiceName) {
            this.searchServiceName = Input.of(Objects.requireNonNull(searchServiceName));
            return this;
        }
        public PrivateEndpointConnectionArgs build() {
            return new PrivateEndpointConnectionArgs(privateEndpointConnectionName, properties, resourceGroupName, searchServiceName);
        }
    }
}
