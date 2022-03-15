// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.azurenative.storage.outputs.StorageAccountKeyResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ListStorageAccountKeysResult {
    /**
     * Gets the list of storage account keys and their properties for the specified storage account.
     * 
     */
    private final List<StorageAccountKeyResponse> keys;

    @CustomType.Constructor
    private ListStorageAccountKeysResult(@CustomType.Parameter("keys") List<StorageAccountKeyResponse> keys) {
        this.keys = keys;
    }

    /**
     * Gets the list of storage account keys and their properties for the specified storage account.
     * 
    */
    public List<StorageAccountKeyResponse> getKeys() {
        return this.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStorageAccountKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<StorageAccountKeyResponse> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStorageAccountKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keys = defaults.keys;
        }

        public Builder keys(List<StorageAccountKeyResponse> keys) {
            this.keys = Objects.requireNonNull(keys);
            return this;
        }
        public ListStorageAccountKeysResult build() {
            return new ListStorageAccountKeysResult(keys);
        }
    }
}
