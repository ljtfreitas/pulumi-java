// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azureactivedirectory;

import io.pulumi.azurenative.azureactivedirectory.inputs.B2CResourceSKUArgs;
import io.pulumi.azurenative.azureactivedirectory.inputs.CreateTenantRequestBodyPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class B2CTenantArgs extends io.pulumi.resources.ResourceArgs {

    public static final B2CTenantArgs Empty = new B2CTenantArgs();

    /**
     * The location in which the resource is hosted and data resides. Can be one of 'United States', 'Europe', 'Asia Pacific', or 'Australia' (preview). Refer to [this documentation](https://aka.ms/B2CDataResidency) for more information.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="properties", required=true)
        private final Input<CreateTenantRequestBodyPropertiesArgs> properties;

    public Input<CreateTenantRequestBodyPropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The initial domain name of the B2C tenant.
     * 
     */
    @InputImport(name="resourceName")
        private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    /**
     * SKU properties of the Azure AD B2C tenant. Learn more about Azure AD B2C billing at [aka.ms/b2cBilling](https://aka.ms/b2cBilling).
     * 
     */
    @InputImport(name="sku", required=true)
        private final Input<B2CResourceSKUArgs> sku;

    public Input<B2CResourceSKUArgs> getSku() {
        return this.sku;
    }

    /**
     * Resource Tags
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public B2CTenantArgs(
        @Nullable Input<String> location,
        Input<CreateTenantRequestBodyPropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        Input<B2CResourceSKUArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.location = location;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
    }

    private B2CTenantArgs() {
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(B2CTenantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private Input<CreateTenantRequestBodyPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private Input<B2CResourceSKUArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(B2CTenantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProperties(Input<CreateTenantRequestBodyPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(CreateTenantRequestBodyPropertiesArgs properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
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

        public Builder setResourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
            return this;
        }

        public Builder setSku(Input<B2CResourceSKUArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(B2CResourceSKUArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public B2CTenantArgs build() {
            return new B2CTenantArgs(location, properties, resourceGroupName, resourceName, sku, tags);
        }
    }
}
