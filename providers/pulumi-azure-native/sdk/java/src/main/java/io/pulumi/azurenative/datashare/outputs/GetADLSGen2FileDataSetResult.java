// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.outputs;

import io.pulumi.azurenative.datashare.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetADLSGen2FileDataSetResult {
    /**
     * Unique id for identifying a data set resource
     * 
     */
    private final String dataSetId;
    /**
     * File path within the file system.
     * 
     */
    private final String filePath;
    /**
     * File system to which the file belongs.
     * 
     */
    private final String fileSystem;
    /**
     * The resource id of the azure resource
     * 
     */
    private final String id;
    /**
     * Kind of data set.
     * Expected value is 'AdlsGen2File'.
     * 
     */
    private final String kind;
    /**
     * Name of the azure resource
     * 
     */
    private final String name;
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

    @OutputCustomType.Constructor({"dataSetId","filePath","fileSystem","id","kind","name","resourceGroup","storageAccountName","subscriptionId","systemData","type"})
    private GetADLSGen2FileDataSetResult(
        String dataSetId,
        String filePath,
        String fileSystem,
        String id,
        String kind,
        String name,
        String resourceGroup,
        String storageAccountName,
        String subscriptionId,
        SystemDataResponse systemData,
        String type) {
        this.dataSetId = Objects.requireNonNull(dataSetId);
        this.filePath = Objects.requireNonNull(filePath);
        this.fileSystem = Objects.requireNonNull(fileSystem);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.resourceGroup = Objects.requireNonNull(resourceGroup);
        this.storageAccountName = Objects.requireNonNull(storageAccountName);
        this.subscriptionId = Objects.requireNonNull(subscriptionId);
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Unique id for identifying a data set resource
     * 
     */
    public String getDataSetId() {
        return this.dataSetId;
    }
    /**
     * File path within the file system.
     * 
     */
    public String getFilePath() {
        return this.filePath;
    }
    /**
     * File system to which the file belongs.
     * 
     */
    public String getFileSystem() {
        return this.fileSystem;
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
     * Expected value is 'AdlsGen2File'.
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

    public static Builder builder(GetADLSGen2FileDataSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataSetId;
        private String filePath;
        private String fileSystem;
        private String id;
        private String kind;
        private String name;
        private String resourceGroup;
        private String storageAccountName;
        private String subscriptionId;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetADLSGen2FileDataSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetId = defaults.dataSetId;
    	      this.filePath = defaults.filePath;
    	      this.fileSystem = defaults.fileSystem;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setDataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }

        public Builder setFilePath(String filePath) {
            this.filePath = Objects.requireNonNull(filePath);
            return this;
        }

        public Builder setFileSystem(String fileSystem) {
            this.fileSystem = Objects.requireNonNull(fileSystem);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder setStorageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetADLSGen2FileDataSetResult build() {
            return new GetADLSGen2FileDataSetResult(dataSetId, filePath, fileSystem, id, kind, name, resourceGroup, storageAccountName, subscriptionId, systemData, type);
        }
    }
}
