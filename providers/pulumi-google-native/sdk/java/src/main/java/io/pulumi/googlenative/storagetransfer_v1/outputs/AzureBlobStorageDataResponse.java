// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.storagetransfer_v1.outputs.AzureCredentialsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AzureBlobStorageDataResponse {
    /**
     * Input only. Credentials used to authenticate API requests to Azure. For information on our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
     * 
     */
    private final AzureCredentialsResponse azureCredentials;
    /**
     * The container to transfer from the Azure Storage account.
     * 
     */
    private final String container;
    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with a '/'.
     * 
     */
    private final String path;
    /**
     * The name of the Azure Storage account.
     * 
     */
    private final String storageAccount;

    @CustomType.Constructor
    private AzureBlobStorageDataResponse(
        @CustomType.Parameter("azureCredentials") AzureCredentialsResponse azureCredentials,
        @CustomType.Parameter("container") String container,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("storageAccount") String storageAccount) {
        this.azureCredentials = azureCredentials;
        this.container = container;
        this.path = path;
        this.storageAccount = storageAccount;
    }

    /**
     * Input only. Credentials used to authenticate API requests to Azure. For information on our data retention policy for user credentials, see [User credentials](/storage-transfer/docs/data-retention#user-credentials).
     * 
    */
    public AzureCredentialsResponse getAzureCredentials() {
        return this.azureCredentials;
    }
    /**
     * The container to transfer from the Azure Storage account.
     * 
    */
    public String getContainer() {
        return this.container;
    }
    /**
     * Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with a '/'.
     * 
    */
    public String getPath() {
        return this.path;
    }
    /**
     * The name of the Azure Storage account.
     * 
    */
    public String getStorageAccount() {
        return this.storageAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBlobStorageDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureCredentialsResponse azureCredentials;
        private String container;
        private String path;
        private String storageAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBlobStorageDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureCredentials = defaults.azureCredentials;
    	      this.container = defaults.container;
    	      this.path = defaults.path;
    	      this.storageAccount = defaults.storageAccount;
        }

        public Builder azureCredentials(AzureCredentialsResponse azureCredentials) {
            this.azureCredentials = Objects.requireNonNull(azureCredentials);
            return this;
        }

        public Builder container(String container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder storageAccount(String storageAccount) {
            this.storageAccount = Objects.requireNonNull(storageAccount);
            return this;
        }
        public AzureBlobStorageDataResponse build() {
            return new AzureBlobStorageDataResponse(azureCredentials, container, path, storageAccount);
        }
    }
}
