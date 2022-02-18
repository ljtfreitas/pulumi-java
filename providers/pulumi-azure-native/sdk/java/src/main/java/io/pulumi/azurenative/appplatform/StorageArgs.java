// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.appplatform.inputs.StorageAccountArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StorageArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageArgs Empty = new StorageArgs();

    /**
     * Properties of the storage resource payload.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<StorageAccountArgs> properties;

    public Input<StorageAccountArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * The name of the storage resource.
     * 
     */
    @InputImport(name="storageName")
    private final @Nullable Input<String> storageName;

    public Input<String> getStorageName() {
        return this.storageName == null ? Input.empty() : this.storageName;
    }

    public StorageArgs(
        @Nullable Input<StorageAccountArgs> properties,
        Input<String> resourceGroupName,
        Input<String> serviceName,
        @Nullable Input<String> storageName) {
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.storageName = storageName;
    }

    private StorageArgs() {
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
        this.storageName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<StorageAccountArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;
        private @Nullable Input<String> storageName;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.storageName = defaults.storageName;
        }

        public Builder setProperties(@Nullable Input<StorageAccountArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable StorageAccountArgs properties) {
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

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setStorageName(@Nullable Input<String> storageName) {
            this.storageName = storageName;
            return this;
        }

        public Builder setStorageName(@Nullable String storageName) {
            this.storageName = Input.ofNullable(storageName);
            return this;
        }

        public StorageArgs build() {
            return new StorageArgs(properties, resourceGroupName, serviceName, storageName);
        }
    }
}
