// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details for the storage account.
 * 
 */
public final class StorageAccountDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageAccountDetailsArgs Empty = new StorageAccountDetailsArgs();

    /**
     * Account Type of the data to be transferred.
     * Expected value is 'StorageAccount'.
     * 
     */
    @InputImport(name="dataAccountType", required=true)
    private final Input<String> dataAccountType;

    public Input<String> getDataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Password for all the shares to be created on the device. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     * 
     */
    @InputImport(name="sharePassword")
    private final @Nullable Input<String> sharePassword;

    public Input<String> getSharePassword() {
        return this.sharePassword == null ? Input.empty() : this.sharePassword;
    }

    /**
     * Storage Account Resource Id.
     * 
     */
    @InputImport(name="storageAccountId", required=true)
    private final Input<String> storageAccountId;

    public Input<String> getStorageAccountId() {
        return this.storageAccountId;
    }

    public StorageAccountDetailsArgs(
        Input<String> dataAccountType,
        @Nullable Input<String> sharePassword,
        Input<String> storageAccountId) {
        this.dataAccountType = dataAccountType == null ? Input.ofNullable("StorageAccount") : Objects.requireNonNull(dataAccountType, "expected parameter 'dataAccountType' to be non-null");
        this.sharePassword = sharePassword;
        this.storageAccountId = Objects.requireNonNull(storageAccountId, "expected parameter 'storageAccountId' to be non-null");
    }

    private StorageAccountDetailsArgs() {
        this.dataAccountType = Input.empty();
        this.sharePassword = Input.empty();
        this.storageAccountId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> dataAccountType;
        private @Nullable Input<String> sharePassword;
        private Input<String> storageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.sharePassword = defaults.sharePassword;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        public Builder setDataAccountType(Input<String> dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }

        public Builder setDataAccountType(String dataAccountType) {
            this.dataAccountType = Input.of(Objects.requireNonNull(dataAccountType));
            return this;
        }

        public Builder setSharePassword(@Nullable Input<String> sharePassword) {
            this.sharePassword = sharePassword;
            return this;
        }

        public Builder setSharePassword(@Nullable String sharePassword) {
            this.sharePassword = Input.ofNullable(sharePassword);
            return this;
        }

        public Builder setStorageAccountId(Input<String> storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }

        public Builder setStorageAccountId(String storageAccountId) {
            this.storageAccountId = Input.of(Objects.requireNonNull(storageAccountId));
            return this;
        }

        public StorageAccountDetailsArgs build() {
            return new StorageAccountDetailsArgs(dataAccountType, sharePassword, storageAccountId);
        }
    }
}
