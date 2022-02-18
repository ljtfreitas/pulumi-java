// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Azure container mapping of the endpoint.
 * 
 */
public final class AzureContainerInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureContainerInfoResponse Empty = new AzureContainerInfoResponse();

    /**
     * Container name (Based on the data format specified, this represents the name of Azure Files/Page blob/Block blob).
     * 
     */
    @InputImport(name="containerName", required=true)
    private final String containerName;

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * Storage format used for the file represented by the share.
     * 
     */
    @InputImport(name="dataFormat", required=true)
    private final String dataFormat;

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * ID of the storage account credential used to access storage.
     * 
     */
    @InputImport(name="storageAccountCredentialId", required=true)
    private final String storageAccountCredentialId;

    public String getStorageAccountCredentialId() {
        return this.storageAccountCredentialId;
    }

    public AzureContainerInfoResponse(
        String containerName,
        String dataFormat,
        String storageAccountCredentialId) {
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.dataFormat = Objects.requireNonNull(dataFormat, "expected parameter 'dataFormat' to be non-null");
        this.storageAccountCredentialId = Objects.requireNonNull(storageAccountCredentialId, "expected parameter 'storageAccountCredentialId' to be non-null");
    }

    private AzureContainerInfoResponse() {
        this.containerName = null;
        this.dataFormat = null;
        this.storageAccountCredentialId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureContainerInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private String dataFormat;
        private String storageAccountCredentialId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureContainerInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.dataFormat = defaults.dataFormat;
    	      this.storageAccountCredentialId = defaults.storageAccountCredentialId;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setDataFormat(String dataFormat) {
            this.dataFormat = Objects.requireNonNull(dataFormat);
            return this;
        }

        public Builder setStorageAccountCredentialId(String storageAccountCredentialId) {
            this.storageAccountCredentialId = Objects.requireNonNull(storageAccountCredentialId);
            return this;
        }

        public AzureContainerInfoResponse build() {
            return new AzureContainerInfoResponse(containerName, dataFormat, storageAccountCredentialId);
        }
    }
}
