// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetArgs Empty = new AssetArgs();

    /**
     * The Media Services account name.
     * 
     */
    @InputImport(name="accountName", required=true)
        private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The alternate ID of the Asset.
     * 
     */
    @InputImport(name="alternateId")
        private final @Nullable Input<String> alternateId;

    public Input<String> getAlternateId() {
        return this.alternateId == null ? Input.empty() : this.alternateId;
    }

    /**
     * The Asset name.
     * 
     */
    @InputImport(name="assetName")
        private final @Nullable Input<String> assetName;

    public Input<String> getAssetName() {
        return this.assetName == null ? Input.empty() : this.assetName;
    }

    /**
     * The name of the asset blob container.
     * 
     */
    @InputImport(name="container")
        private final @Nullable Input<String> container;

    public Input<String> getContainer() {
        return this.container == null ? Input.empty() : this.container;
    }

    /**
     * The Asset description.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the storage account.
     * 
     */
    @InputImport(name="storageAccountName")
        private final @Nullable Input<String> storageAccountName;

    public Input<String> getStorageAccountName() {
        return this.storageAccountName == null ? Input.empty() : this.storageAccountName;
    }

    public AssetArgs(
        Input<String> accountName,
        @Nullable Input<String> alternateId,
        @Nullable Input<String> assetName,
        @Nullable Input<String> container,
        @Nullable Input<String> description,
        Input<String> resourceGroupName,
        @Nullable Input<String> storageAccountName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.alternateId = alternateId;
        this.assetName = assetName;
        this.container = container;
        this.description = description;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccountName = storageAccountName;
    }

    private AssetArgs() {
        this.accountName = Input.empty();
        this.alternateId = Input.empty();
        this.assetName = Input.empty();
        this.container = Input.empty();
        this.description = Input.empty();
        this.resourceGroupName = Input.empty();
        this.storageAccountName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountName;
        private @Nullable Input<String> alternateId;
        private @Nullable Input<String> assetName;
        private @Nullable Input<String> container;
        private @Nullable Input<String> description;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.alternateId = defaults.alternateId;
    	      this.assetName = defaults.assetName;
    	      this.container = defaults.container;
    	      this.description = defaults.description;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setAlternateId(@Nullable Input<String> alternateId) {
            this.alternateId = alternateId;
            return this;
        }

        public Builder setAlternateId(@Nullable String alternateId) {
            this.alternateId = Input.ofNullable(alternateId);
            return this;
        }

        public Builder setAssetName(@Nullable Input<String> assetName) {
            this.assetName = assetName;
            return this;
        }

        public Builder setAssetName(@Nullable String assetName) {
            this.assetName = Input.ofNullable(assetName);
            return this;
        }

        public Builder setContainer(@Nullable Input<String> container) {
            this.container = container;
            return this;
        }

        public Builder setContainer(@Nullable String container) {
            this.container = Input.ofNullable(container);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setStorageAccountName(@Nullable Input<String> storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }

        public Builder setStorageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = Input.ofNullable(storageAccountName);
            return this;
        }
        public AssetArgs build() {
            return new AssetArgs(accountName, alternateId, assetName, container, description, resourceGroupName, storageAccountName);
        }
    }
}
