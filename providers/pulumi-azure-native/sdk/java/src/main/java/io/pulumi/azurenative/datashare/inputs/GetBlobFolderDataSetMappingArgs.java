// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetBlobFolderDataSetMappingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBlobFolderDataSetMappingArgs Empty = new GetBlobFolderDataSetMappingArgs();

    /**
     * The name of the share account.
     * 
     */
    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the dataSetMapping.
     * 
     */
    @InputImport(name="dataSetMappingName", required=true)
    private final String dataSetMappingName;

    public String getDataSetMappingName() {
        return this.dataSetMappingName;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the shareSubscription.
     * 
     */
    @InputImport(name="shareSubscriptionName", required=true)
    private final String shareSubscriptionName;

    public String getShareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    public GetBlobFolderDataSetMappingArgs(
        String accountName,
        String dataSetMappingName,
        String resourceGroupName,
        String shareSubscriptionName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.dataSetMappingName = Objects.requireNonNull(dataSetMappingName, "expected parameter 'dataSetMappingName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
    }

    private GetBlobFolderDataSetMappingArgs() {
        this.accountName = null;
        this.dataSetMappingName = null;
        this.resourceGroupName = null;
        this.shareSubscriptionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBlobFolderDataSetMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String dataSetMappingName;
        private String resourceGroupName;
        private String shareSubscriptionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlobFolderDataSetMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.dataSetMappingName = defaults.dataSetMappingName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareSubscriptionName = defaults.shareSubscriptionName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setDataSetMappingName(String dataSetMappingName) {
            this.dataSetMappingName = Objects.requireNonNull(dataSetMappingName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setShareSubscriptionName(String shareSubscriptionName) {
            this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName);
            return this;
        }

        public GetBlobFolderDataSetMappingArgs build() {
            return new GetBlobFolderDataSetMappingArgs(accountName, dataSetMappingName, resourceGroupName, shareSubscriptionName);
        }
    }
}
