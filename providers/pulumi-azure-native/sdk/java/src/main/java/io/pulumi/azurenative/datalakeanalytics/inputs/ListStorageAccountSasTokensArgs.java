// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListStorageAccountSasTokensArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListStorageAccountSasTokensArgs Empty = new ListStorageAccountSasTokensArgs();

    /**
     * The name of the Data Lake Analytics account.
     * 
     */
    @InputImport(name="accountName", required=true)
        private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the Azure storage container for which the SAS token is being requested.
     * 
     */
    @InputImport(name="containerName", required=true)
        private final String containerName;

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * The name of the Azure resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Azure storage account for which the SAS token is being requested.
     * 
     */
    @InputImport(name="storageAccountName", required=true)
        private final String storageAccountName;

    public String getStorageAccountName() {
        return this.storageAccountName;
    }

    public ListStorageAccountSasTokensArgs(
        String accountName,
        String containerName,
        String resourceGroupName,
        String storageAccountName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
    }

    private ListStorageAccountSasTokensArgs() {
        this.accountName = null;
        this.containerName = null;
        this.resourceGroupName = null;
        this.storageAccountName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStorageAccountSasTokensArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String containerName;
        private String resourceGroupName;
        private String storageAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStorageAccountSasTokensArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.containerName = defaults.containerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.storageAccountName = defaults.storageAccountName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setStorageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public ListStorageAccountSasTokensArgs build() {
            return new ListStorageAccountSasTokensArgs(accountName, containerName, resourceGroupName, storageAccountName);
        }
    }
}
