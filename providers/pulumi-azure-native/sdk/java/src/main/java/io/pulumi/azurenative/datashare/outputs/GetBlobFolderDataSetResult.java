// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBlobFolderDataSetResult {
    /**
     * Container that has the file path.
     * 
     */
    private final String containerName;
    /**
     * Unique id for identifying a data set resource
     * 
     */
    private final String dataSetId;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of data set.
     * Expected value is 'BlobFolder'.
     * 
     */
    private final String kind;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
    /**
     * Prefix for blob folder
     * 
     */
    private final String prefix;
    /**
     * Resource group of storage account
     * 
     */
    private final String resourceGroup;
    /**
     * Storage account name of the source data set
     * 
     */
    private final String storageAccountName;
    /**
     * Subscription id of storage account
     * 
     */
    private final String subscriptionId;
    /**
     * System Data of the Azure resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Type of the azure resource
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetBlobFolderDataSetResult(
        @CustomType.Parameter("containerName") String containerName,
        @CustomType.Parameter("dataSetId") String dataSetId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("prefix") String prefix,
        @CustomType.Parameter("resourceGroup") String resourceGroup,
        @CustomType.Parameter("storageAccountName") String storageAccountName,
        @CustomType.Parameter("subscriptionId") String subscriptionId,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.containerName = containerName;
        this.dataSetId = dataSetId;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.prefix = prefix;
        this.resourceGroup = resourceGroup;
        this.storageAccountName = storageAccountName;
        this.subscriptionId = subscriptionId;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Container that has the file path.
     * 
    */
    public String getContainerName() {
        return this.containerName;
    }
    /**
     * Unique id for identifying a data set resource
     * 
    */
    public String getDataSetId() {
        return this.dataSetId;
    }
    /**
     * The resource id of the azure resource
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Kind of data set.
     * Expected value is 'BlobFolder'.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the azure resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Prefix for blob folder
     * 
    */
    public String getPrefix() {
        return this.prefix;
    }
    /**
     * Resource group of storage account
     * 
    */
    public String getResourceGroup() {
        return this.resourceGroup;
    }
    /**
     * Storage account name of the source data set
     * 
    */
    public String getStorageAccountName() {
        return this.storageAccountName;
    }
    /**
     * Subscription id of storage account
     * 
    */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * System Data of the Azure resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the azure resource
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBlobFolderDataSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private String dataSetId;
        private String id;
        private String kind;
        private String name;
        private String prefix;
        private String resourceGroup;
        private String storageAccountName;
        private String subscriptionId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlobFolderDataSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.dataSetId = defaults.dataSetId;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.prefix = defaults.prefix;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder dataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder prefix(String prefix) {
            this.prefix = Objects.requireNonNull(prefix);
            return this;
        }

        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetBlobFolderDataSetResult build() {
            return new GetBlobFolderDataSetResult(containerName, dataSetId, id, kind, name, prefix, resourceGroup, storageAccountName, subscriptionId, systemData, type);
        }
    }
}
