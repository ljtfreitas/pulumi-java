// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.recoveryservices.inputs.IdentityDataArgs;
import io.pulumi.azurenative.recoveryservices.inputs.SkuArgs;
import io.pulumi.azurenative.recoveryservices.inputs.VaultPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VaultArgs extends io.pulumi.resources.ResourceArgs {

    public static final VaultArgs Empty = new VaultArgs();

    /**
     * Identity for the resource.
     * 
     */
    @InputImport(name="identity")
    private final @Nullable Input<IdentityDataArgs> identity;

    public Input<IdentityDataArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Properties of the vault.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<VaultPropertiesArgs> properties;

    public Input<VaultPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Identifies the unique system identifier for each Azure resource.
     * 
     */
    @InputImport(name="sku")
    private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @InputImport(name="vaultName")
    private final @Nullable Input<String> vaultName;

    public Input<String> getVaultName() {
        return this.vaultName == null ? Input.empty() : this.vaultName;
    }

    public VaultArgs(
        @Nullable Input<IdentityDataArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<VaultPropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> vaultName) {
        this.identity = identity;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.vaultName = vaultName;
    }

    private VaultArgs() {
        this.identity = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.vaultName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VaultArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IdentityDataArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<VaultPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(VaultArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder setIdentity(@Nullable Input<IdentityDataArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable IdentityDataArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProperties(@Nullable Input<VaultPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable VaultPropertiesArgs properties) {
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

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
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

        public Builder setVaultName(@Nullable Input<String> vaultName) {
            this.vaultName = vaultName;
            return this;
        }

        public Builder setVaultName(@Nullable String vaultName) {
            this.vaultName = Input.ofNullable(vaultName);
            return this;
        }

        public VaultArgs build() {
            return new VaultArgs(identity, location, properties, resourceGroupName, sku, tags, vaultName);
        }
    }
}
