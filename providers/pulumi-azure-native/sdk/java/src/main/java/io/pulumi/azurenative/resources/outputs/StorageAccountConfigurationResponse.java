// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StorageAccountConfigurationResponse {
    /**
     * The storage account access key.
     * 
     */
    private final @Nullable String storageAccountKey;
    /**
     * The storage account name.
     * 
     */
    private final @Nullable String storageAccountName;

    @CustomType.Constructor
    private StorageAccountConfigurationResponse(
        @CustomType.Parameter("storageAccountKey") @Nullable String storageAccountKey,
        @CustomType.Parameter("storageAccountName") @Nullable String storageAccountName) {
        this.storageAccountKey = storageAccountKey;
        this.storageAccountName = storageAccountName;
    }

    /**
     * The storage account access key.
     * 
    */
    public Optional<String> getStorageAccountKey() {
        return Optional.ofNullable(this.storageAccountKey);
    }
    /**
     * The storage account name.
     * 
    */
    public Optional<String> getStorageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String storageAccountKey;
        private @Nullable String storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageAccountKey = defaults.storageAccountKey;
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder storageAccountKey(@Nullable String storageAccountKey) {
            this.storageAccountKey = storageAccountKey;
            return this;
        }

        public Builder storageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }
        public StorageAccountConfigurationResponse build() {
            return new StorageAccountConfigurationResponse(storageAccountKey, storageAccountName);
        }
    }
}
