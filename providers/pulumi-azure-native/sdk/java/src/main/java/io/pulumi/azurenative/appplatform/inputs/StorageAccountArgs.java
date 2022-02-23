// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * storage resource of type Azure Storage Account.
 * 
 */
public final class StorageAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageAccountArgs Empty = new StorageAccountArgs();

    /**
     * The account key of the Azure Storage Account.
     * 
     */
    @InputImport(name="accountKey", required=true)
        private final Input<String> accountKey;

    public Input<String> getAccountKey() {
        return this.accountKey;
    }

    /**
     * The account name of the Azure Storage Account.
     * 
     */
    @InputImport(name="accountName", required=true)
        private final Input<String> accountName;

    public Input<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The type of the storage.
     * Expected value is 'StorageAccount'.
     * 
     */
    @InputImport(name="storageType", required=true)
        private final Input<String> storageType;

    public Input<String> getStorageType() {
        return this.storageType;
    }

    public StorageAccountArgs(
        Input<String> accountKey,
        Input<String> accountName,
        Input<String> storageType) {
        this.accountKey = Objects.requireNonNull(accountKey, "expected parameter 'accountKey' to be non-null");
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.storageType = Objects.requireNonNull(storageType, "expected parameter 'storageType' to be non-null");
    }

    private StorageAccountArgs() {
        this.accountKey = Input.empty();
        this.accountName = Input.empty();
        this.storageType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> accountKey;
        private Input<String> accountName;
        private Input<String> storageType;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountKey = defaults.accountKey;
    	      this.accountName = defaults.accountName;
    	      this.storageType = defaults.storageType;
        }

        public Builder setAccountKey(Input<String> accountKey) {
            this.accountKey = Objects.requireNonNull(accountKey);
            return this;
        }

        public Builder setAccountKey(String accountKey) {
            this.accountKey = Input.of(Objects.requireNonNull(accountKey));
            return this;
        }

        public Builder setAccountName(Input<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Input.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder setStorageType(Input<String> storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }

        public Builder setStorageType(String storageType) {
            this.storageType = Input.of(Objects.requireNonNull(storageType));
            return this;
        }
        public StorageAccountArgs build() {
            return new StorageAccountArgs(accountKey, accountName, storageType);
        }
    }
}
