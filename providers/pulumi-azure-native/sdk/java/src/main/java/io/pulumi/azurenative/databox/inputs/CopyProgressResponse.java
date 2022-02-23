// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Copy progress.
 * 
 */
public final class CopyProgressResponse extends io.pulumi.resources.InvokeArgs {

    public static final CopyProgressResponse Empty = new CopyProgressResponse();

    /**
     * Id of the account where the data needs to be uploaded.
     * 
     */
    @InputImport(name="accountId", required=true)
        private final String accountId;

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * To indicate bytes transferred.
     * 
     */
    @InputImport(name="bytesProcessed", required=true)
        private final Double bytesProcessed;

    public Double getBytesProcessed() {
        return this.bytesProcessed;
    }

    /**
     * Data Account Type.
     * 
     */
    @InputImport(name="dataAccountType", required=true)
        private final String dataAccountType;

    public String getDataAccountType() {
        return this.dataAccountType;
    }

    /**
     * To indicate directories errored out in the job.
     * 
     */
    @InputImport(name="directoriesErroredOut", required=true)
        private final Double directoriesErroredOut;

    public Double getDirectoriesErroredOut() {
        return this.directoriesErroredOut;
    }

    /**
     * Number of files which could not be copied
     * 
     */
    @InputImport(name="filesErroredOut", required=true)
        private final Double filesErroredOut;

    public Double getFilesErroredOut() {
        return this.filesErroredOut;
    }

    /**
     * Number of files processed
     * 
     */
    @InputImport(name="filesProcessed", required=true)
        private final Double filesProcessed;

    public Double getFilesProcessed() {
        return this.filesProcessed;
    }

    /**
     * To indicate directories renamed
     * 
     */
    @InputImport(name="invalidDirectoriesProcessed", required=true)
        private final Double invalidDirectoriesProcessed;

    public Double getInvalidDirectoriesProcessed() {
        return this.invalidDirectoriesProcessed;
    }

    /**
     * Total amount of data not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    @InputImport(name="invalidFileBytesUploaded", required=true)
        private final Double invalidFileBytesUploaded;

    public Double getInvalidFileBytesUploaded() {
        return this.invalidFileBytesUploaded;
    }

    /**
     * Number of files not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    @InputImport(name="invalidFilesProcessed", required=true)
        private final Double invalidFilesProcessed;

    public Double getInvalidFilesProcessed() {
        return this.invalidFilesProcessed;
    }

    /**
     * To indicate if enumeration of data is in progress.
     * Until this is true, the TotalBytesToProcess may not be valid.
     * 
     */
    @InputImport(name="isEnumerationInProgress", required=true)
        private final Boolean isEnumerationInProgress;

    public Boolean getIsEnumerationInProgress() {
        return this.isEnumerationInProgress;
    }

    /**
     * Number of folders not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    @InputImport(name="renamedContainerCount", required=true)
        private final Double renamedContainerCount;

    public Double getRenamedContainerCount() {
        return this.renamedContainerCount;
    }

    /**
     * Name of the storage account. This will be empty for data account types other than storage account.
     * 
     */
    @InputImport(name="storageAccountName", required=true)
        private final String storageAccountName;

    public String getStorageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Total amount of data to be processed by the job.
     * 
     */
    @InputImport(name="totalBytesToProcess", required=true)
        private final Double totalBytesToProcess;

    public Double getTotalBytesToProcess() {
        return this.totalBytesToProcess;
    }

    /**
     * Total files to process
     * 
     */
    @InputImport(name="totalFilesToProcess", required=true)
        private final Double totalFilesToProcess;

    public Double getTotalFilesToProcess() {
        return this.totalFilesToProcess;
    }

    /**
     * Transfer type of data
     * 
     */
    @InputImport(name="transferType", required=true)
        private final String transferType;

    public String getTransferType() {
        return this.transferType;
    }

    public CopyProgressResponse(
        String accountId,
        Double bytesProcessed,
        String dataAccountType,
        Double directoriesErroredOut,
        Double filesErroredOut,
        Double filesProcessed,
        Double invalidDirectoriesProcessed,
        Double invalidFileBytesUploaded,
        Double invalidFilesProcessed,
        Boolean isEnumerationInProgress,
        Double renamedContainerCount,
        String storageAccountName,
        Double totalBytesToProcess,
        Double totalFilesToProcess,
        String transferType) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.bytesProcessed = Objects.requireNonNull(bytesProcessed, "expected parameter 'bytesProcessed' to be non-null");
        this.dataAccountType = Objects.requireNonNull(dataAccountType, "expected parameter 'dataAccountType' to be non-null");
        this.directoriesErroredOut = Objects.requireNonNull(directoriesErroredOut, "expected parameter 'directoriesErroredOut' to be non-null");
        this.filesErroredOut = Objects.requireNonNull(filesErroredOut, "expected parameter 'filesErroredOut' to be non-null");
        this.filesProcessed = Objects.requireNonNull(filesProcessed, "expected parameter 'filesProcessed' to be non-null");
        this.invalidDirectoriesProcessed = Objects.requireNonNull(invalidDirectoriesProcessed, "expected parameter 'invalidDirectoriesProcessed' to be non-null");
        this.invalidFileBytesUploaded = Objects.requireNonNull(invalidFileBytesUploaded, "expected parameter 'invalidFileBytesUploaded' to be non-null");
        this.invalidFilesProcessed = Objects.requireNonNull(invalidFilesProcessed, "expected parameter 'invalidFilesProcessed' to be non-null");
        this.isEnumerationInProgress = Objects.requireNonNull(isEnumerationInProgress, "expected parameter 'isEnumerationInProgress' to be non-null");
        this.renamedContainerCount = Objects.requireNonNull(renamedContainerCount, "expected parameter 'renamedContainerCount' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
        this.totalBytesToProcess = Objects.requireNonNull(totalBytesToProcess, "expected parameter 'totalBytesToProcess' to be non-null");
        this.totalFilesToProcess = Objects.requireNonNull(totalFilesToProcess, "expected parameter 'totalFilesToProcess' to be non-null");
        this.transferType = Objects.requireNonNull(transferType, "expected parameter 'transferType' to be non-null");
    }

    private CopyProgressResponse() {
        this.accountId = null;
        this.bytesProcessed = null;
        this.dataAccountType = null;
        this.directoriesErroredOut = null;
        this.filesErroredOut = null;
        this.filesProcessed = null;
        this.invalidDirectoriesProcessed = null;
        this.invalidFileBytesUploaded = null;
        this.invalidFilesProcessed = null;
        this.isEnumerationInProgress = null;
        this.renamedContainerCount = null;
        this.storageAccountName = null;
        this.totalBytesToProcess = null;
        this.totalFilesToProcess = null;
        this.transferType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CopyProgressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private Double bytesProcessed;
        private String dataAccountType;
        private Double directoriesErroredOut;
        private Double filesErroredOut;
        private Double filesProcessed;
        private Double invalidDirectoriesProcessed;
        private Double invalidFileBytesUploaded;
        private Double invalidFilesProcessed;
        private Boolean isEnumerationInProgress;
        private Double renamedContainerCount;
        private String storageAccountName;
        private Double totalBytesToProcess;
        private Double totalFilesToProcess;
        private String transferType;

        public Builder() {
    	      // Empty
        }

        public Builder(CopyProgressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.bytesProcessed = defaults.bytesProcessed;
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.directoriesErroredOut = defaults.directoriesErroredOut;
    	      this.filesErroredOut = defaults.filesErroredOut;
    	      this.filesProcessed = defaults.filesProcessed;
    	      this.invalidDirectoriesProcessed = defaults.invalidDirectoriesProcessed;
    	      this.invalidFileBytesUploaded = defaults.invalidFileBytesUploaded;
    	      this.invalidFilesProcessed = defaults.invalidFilesProcessed;
    	      this.isEnumerationInProgress = defaults.isEnumerationInProgress;
    	      this.renamedContainerCount = defaults.renamedContainerCount;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.totalBytesToProcess = defaults.totalBytesToProcess;
    	      this.totalFilesToProcess = defaults.totalFilesToProcess;
    	      this.transferType = defaults.transferType;
        }

        public Builder setAccountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder setBytesProcessed(Double bytesProcessed) {
            this.bytesProcessed = Objects.requireNonNull(bytesProcessed);
            return this;
        }

        public Builder setDataAccountType(String dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }

        public Builder setDirectoriesErroredOut(Double directoriesErroredOut) {
            this.directoriesErroredOut = Objects.requireNonNull(directoriesErroredOut);
            return this;
        }

        public Builder setFilesErroredOut(Double filesErroredOut) {
            this.filesErroredOut = Objects.requireNonNull(filesErroredOut);
            return this;
        }

        public Builder setFilesProcessed(Double filesProcessed) {
            this.filesProcessed = Objects.requireNonNull(filesProcessed);
            return this;
        }

        public Builder setInvalidDirectoriesProcessed(Double invalidDirectoriesProcessed) {
            this.invalidDirectoriesProcessed = Objects.requireNonNull(invalidDirectoriesProcessed);
            return this;
        }

        public Builder setInvalidFileBytesUploaded(Double invalidFileBytesUploaded) {
            this.invalidFileBytesUploaded = Objects.requireNonNull(invalidFileBytesUploaded);
            return this;
        }

        public Builder setInvalidFilesProcessed(Double invalidFilesProcessed) {
            this.invalidFilesProcessed = Objects.requireNonNull(invalidFilesProcessed);
            return this;
        }

        public Builder setIsEnumerationInProgress(Boolean isEnumerationInProgress) {
            this.isEnumerationInProgress = Objects.requireNonNull(isEnumerationInProgress);
            return this;
        }

        public Builder setRenamedContainerCount(Double renamedContainerCount) {
            this.renamedContainerCount = Objects.requireNonNull(renamedContainerCount);
            return this;
        }

        public Builder setStorageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }

        public Builder setTotalBytesToProcess(Double totalBytesToProcess) {
            this.totalBytesToProcess = Objects.requireNonNull(totalBytesToProcess);
            return this;
        }

        public Builder setTotalFilesToProcess(Double totalFilesToProcess) {
            this.totalFilesToProcess = Objects.requireNonNull(totalFilesToProcess);
            return this;
        }

        public Builder setTransferType(String transferType) {
            this.transferType = Objects.requireNonNull(transferType);
            return this;
        }
        public CopyProgressResponse build() {
            return new CopyProgressResponse(accountId, bytesProcessed, dataAccountType, directoriesErroredOut, filesErroredOut, filesProcessed, invalidDirectoriesProcessed, invalidFileBytesUploaded, invalidFilesProcessed, isEnumerationInProgress, renamedContainerCount, storageAccountName, totalBytesToProcess, totalFilesToProcess, transferType);
        }
    }
}
