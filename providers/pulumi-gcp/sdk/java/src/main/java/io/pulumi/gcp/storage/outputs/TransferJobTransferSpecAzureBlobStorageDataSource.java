// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.storage.outputs.TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentials;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TransferJobTransferSpecAzureBlobStorageDataSource {
    private final TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentials azureCredentials;
    private final String container;
    private final @Nullable String path;
    private final String storageAccount;

    @OutputCustomType.Constructor({"azureCredentials","container","path","storageAccount"})
    private TransferJobTransferSpecAzureBlobStorageDataSource(
        TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentials azureCredentials,
        String container,
        @Nullable String path,
        String storageAccount) {
        this.azureCredentials = Objects.requireNonNull(azureCredentials);
        this.container = Objects.requireNonNull(container);
        this.path = path;
        this.storageAccount = Objects.requireNonNull(storageAccount);
    }

    public TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentials getAzureCredentials() {
        return this.azureCredentials;
    }
    public String getContainer() {
        return this.container;
    }
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    public String getStorageAccount() {
        return this.storageAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecAzureBlobStorageDataSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentials azureCredentials;
        private String container;
        private @Nullable String path;
        private String storageAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecAzureBlobStorageDataSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureCredentials = defaults.azureCredentials;
    	      this.container = defaults.container;
    	      this.path = defaults.path;
    	      this.storageAccount = defaults.storageAccount;
        }

        public Builder setAzureCredentials(TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentials azureCredentials) {
            this.azureCredentials = Objects.requireNonNull(azureCredentials);
            return this;
        }

        public Builder setContainer(String container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setStorageAccount(String storageAccount) {
            this.storageAccount = Objects.requireNonNull(storageAccount);
            return this;
        }

        public TransferJobTransferSpecAzureBlobStorageDataSource build() {
            return new TransferJobTransferSpecAzureBlobStorageDataSource(azureCredentials, container, path, storageAccount);
        }
    }
}