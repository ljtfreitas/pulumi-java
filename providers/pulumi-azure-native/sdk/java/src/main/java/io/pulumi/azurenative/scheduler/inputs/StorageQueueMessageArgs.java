// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StorageQueueMessageArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageQueueMessageArgs Empty = new StorageQueueMessageArgs();

    /**
     * Gets or sets the message.
     * 
     */
    @InputImport(name="message")
        private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    /**
     * Gets or sets the queue name.
     * 
     */
    @InputImport(name="queueName")
        private final @Nullable Input<String> queueName;

    public Input<String> getQueueName() {
        return this.queueName == null ? Input.empty() : this.queueName;
    }

    /**
     * Gets or sets the SAS key.
     * 
     */
    @InputImport(name="sasToken")
        private final @Nullable Input<String> sasToken;

    public Input<String> getSasToken() {
        return this.sasToken == null ? Input.empty() : this.sasToken;
    }

    /**
     * Gets or sets the storage account name.
     * 
     */
    @InputImport(name="storageAccount")
        private final @Nullable Input<String> storageAccount;

    public Input<String> getStorageAccount() {
        return this.storageAccount == null ? Input.empty() : this.storageAccount;
    }

    public StorageQueueMessageArgs(
        @Nullable Input<String> message,
        @Nullable Input<String> queueName,
        @Nullable Input<String> sasToken,
        @Nullable Input<String> storageAccount) {
        this.message = message;
        this.queueName = queueName;
        this.sasToken = sasToken;
        this.storageAccount = storageAccount;
    }

    private StorageQueueMessageArgs() {
        this.message = Input.empty();
        this.queueName = Input.empty();
        this.sasToken = Input.empty();
        this.storageAccount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageQueueMessageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> message;
        private @Nullable Input<String> queueName;
        private @Nullable Input<String> sasToken;
        private @Nullable Input<String> storageAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageQueueMessageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.queueName = defaults.queueName;
    	      this.sasToken = defaults.sasToken;
    	      this.storageAccount = defaults.storageAccount;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setQueueName(@Nullable Input<String> queueName) {
            this.queueName = queueName;
            return this;
        }

        public Builder setQueueName(@Nullable String queueName) {
            this.queueName = Input.ofNullable(queueName);
            return this;
        }

        public Builder setSasToken(@Nullable Input<String> sasToken) {
            this.sasToken = sasToken;
            return this;
        }

        public Builder setSasToken(@Nullable String sasToken) {
            this.sasToken = Input.ofNullable(sasToken);
            return this;
        }

        public Builder setStorageAccount(@Nullable Input<String> storageAccount) {
            this.storageAccount = storageAccount;
            return this;
        }

        public Builder setStorageAccount(@Nullable String storageAccount) {
            this.storageAccount = Input.ofNullable(storageAccount);
            return this;
        }
        public StorageQueueMessageArgs build() {
            return new StorageQueueMessageArgs(message, queueName, sasToken, storageAccount);
        }
    }
}
