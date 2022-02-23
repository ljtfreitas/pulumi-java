// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.importexport.outputs;

import io.pulumi.azurenative.importexport.outputs.DeliveryPackageInformationResponse;
import io.pulumi.azurenative.importexport.outputs.DriveStatusResponse;
import io.pulumi.azurenative.importexport.outputs.EncryptionKeyDetailsResponse;
import io.pulumi.azurenative.importexport.outputs.ExportResponse;
import io.pulumi.azurenative.importexport.outputs.PackageInformationResponse;
import io.pulumi.azurenative.importexport.outputs.ReturnAddressResponse;
import io.pulumi.azurenative.importexport.outputs.ReturnShippingResponse;
import io.pulumi.azurenative.importexport.outputs.ShippingInformationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobDetailsResponse {
    /**
     * Default value is false. Indicates whether the manifest files on the drives should be copied to block blobs.
     * 
     */
    private final @Nullable Boolean backupDriveManifest;
    /**
     * Indicates whether a request has been submitted to cancel the job.
     * 
     */
    private final @Nullable Boolean cancelRequested;
    /**
     * Contains information about the package being shipped by the customer to the Microsoft data center.
     * 
     */
    private final @Nullable DeliveryPackageInformationResponse deliveryPackage;
    /**
     * The virtual blob directory to which the copy logs and backups of drive manifest files (if enabled) will be stored.
     * 
     */
    private final @Nullable String diagnosticsPath;
    /**
     * List of up to ten drives that comprise the job. The drive list is a required element for an import job; it is not specified for export jobs.
     * 
     */
    private final @Nullable List<DriveStatusResponse> driveList;
    /**
     * Contains information about the encryption key.
     * 
     */
    private final @Nullable EncryptionKeyDetailsResponse encryptionKey;
    /**
     * A property containing information about the blobs to be exported for an export job. This property is included for export jobs only.
     * 
     */
    private final @Nullable ExportResponse export;
    /**
     * A blob path that points to a block blob containing a list of blob names that were not exported due to insufficient drive space. If all blobs were exported successfully, then this element is not included in the response.
     * 
     */
    private final @Nullable String incompleteBlobListUri;
    /**
     * The type of job
     * 
     */
    private final @Nullable String jobType;
    /**
     * Default value is Error. Indicates whether error logging or verbose logging will be enabled.
     * 
     */
    private final @Nullable String logLevel;
    /**
     * Overall percentage completed for the job.
     * 
     */
    private final @Nullable Integer percentComplete;
    /**
     * Specifies the provisioning state of the job.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Specifies the return address information for the job.
     * 
     */
    private final @Nullable ReturnAddressResponse returnAddress;
    /**
     * Contains information about the package being shipped from the Microsoft data center to the customer to return the drives. The format is the same as the deliveryPackage property above. This property is not included if the drives have not yet been returned.
     * 
     */
    private final @Nullable PackageInformationResponse returnPackage;
    /**
     * Specifies the return carrier and customer's account with the carrier.
     * 
     */
    private final @Nullable ReturnShippingResponse returnShipping;
    /**
     * Contains information about the Microsoft datacenter to which the drives should be shipped.
     * 
     */
    private final @Nullable ShippingInformationResponse shippingInformation;
    /**
     * Current state of the job.
     * 
     */
    private final @Nullable String state;
    /**
     * The resource identifier of the storage account where data will be imported to or exported from.
     * 
     */
    private final @Nullable String storageAccountId;

    @OutputCustomType.Constructor({"backupDriveManifest","cancelRequested","deliveryPackage","diagnosticsPath","driveList","encryptionKey","export","incompleteBlobListUri","jobType","logLevel","percentComplete","provisioningState","returnAddress","returnPackage","returnShipping","shippingInformation","state","storageAccountId"})
    private JobDetailsResponse(
        @Nullable Boolean backupDriveManifest,
        @Nullable Boolean cancelRequested,
        @Nullable DeliveryPackageInformationResponse deliveryPackage,
        @Nullable String diagnosticsPath,
        @Nullable List<DriveStatusResponse> driveList,
        @Nullable EncryptionKeyDetailsResponse encryptionKey,
        @Nullable ExportResponse export,
        @Nullable String incompleteBlobListUri,
        @Nullable String jobType,
        @Nullable String logLevel,
        @Nullable Integer percentComplete,
        @Nullable String provisioningState,
        @Nullable ReturnAddressResponse returnAddress,
        @Nullable PackageInformationResponse returnPackage,
        @Nullable ReturnShippingResponse returnShipping,
        @Nullable ShippingInformationResponse shippingInformation,
        @Nullable String state,
        @Nullable String storageAccountId) {
        this.backupDriveManifest = backupDriveManifest;
        this.cancelRequested = cancelRequested;
        this.deliveryPackage = deliveryPackage;
        this.diagnosticsPath = diagnosticsPath;
        this.driveList = driveList;
        this.encryptionKey = encryptionKey;
        this.export = export;
        this.incompleteBlobListUri = incompleteBlobListUri;
        this.jobType = jobType;
        this.logLevel = logLevel;
        this.percentComplete = percentComplete;
        this.provisioningState = provisioningState;
        this.returnAddress = returnAddress;
        this.returnPackage = returnPackage;
        this.returnShipping = returnShipping;
        this.shippingInformation = shippingInformation;
        this.state = state;
        this.storageAccountId = storageAccountId;
    }

    /**
     * Default value is false. Indicates whether the manifest files on the drives should be copied to block blobs.
     * 
     */
    public Optional<Boolean> getBackupDriveManifest() {
        return Optional.ofNullable(this.backupDriveManifest);
    }
    /**
     * Indicates whether a request has been submitted to cancel the job.
     * 
     */
    public Optional<Boolean> getCancelRequested() {
        return Optional.ofNullable(this.cancelRequested);
    }
    /**
     * Contains information about the package being shipped by the customer to the Microsoft data center.
     * 
     */
    public Optional<DeliveryPackageInformationResponse> getDeliveryPackage() {
        return Optional.ofNullable(this.deliveryPackage);
    }
    /**
     * The virtual blob directory to which the copy logs and backups of drive manifest files (if enabled) will be stored.
     * 
     */
    public Optional<String> getDiagnosticsPath() {
        return Optional.ofNullable(this.diagnosticsPath);
    }
    /**
     * List of up to ten drives that comprise the job. The drive list is a required element for an import job; it is not specified for export jobs.
     * 
     */
    public List<DriveStatusResponse> getDriveList() {
        return this.driveList == null ? List.of() : this.driveList;
    }
    /**
     * Contains information about the encryption key.
     * 
     */
    public Optional<EncryptionKeyDetailsResponse> getEncryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }
    /**
     * A property containing information about the blobs to be exported for an export job. This property is included for export jobs only.
     * 
     */
    public Optional<ExportResponse> getExport() {
        return Optional.ofNullable(this.export);
    }
    /**
     * A blob path that points to a block blob containing a list of blob names that were not exported due to insufficient drive space. If all blobs were exported successfully, then this element is not included in the response.
     * 
     */
    public Optional<String> getIncompleteBlobListUri() {
        return Optional.ofNullable(this.incompleteBlobListUri);
    }
    /**
     * The type of job
     * 
     */
    public Optional<String> getJobType() {
        return Optional.ofNullable(this.jobType);
    }
    /**
     * Default value is Error. Indicates whether error logging or verbose logging will be enabled.
     * 
     */
    public Optional<String> getLogLevel() {
        return Optional.ofNullable(this.logLevel);
    }
    /**
     * Overall percentage completed for the job.
     * 
     */
    public Optional<Integer> getPercentComplete() {
        return Optional.ofNullable(this.percentComplete);
    }
    /**
     * Specifies the provisioning state of the job.
     * 
     */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Specifies the return address information for the job.
     * 
     */
    public Optional<ReturnAddressResponse> getReturnAddress() {
        return Optional.ofNullable(this.returnAddress);
    }
    /**
     * Contains information about the package being shipped from the Microsoft data center to the customer to return the drives. The format is the same as the deliveryPackage property above. This property is not included if the drives have not yet been returned.
     * 
     */
    public Optional<PackageInformationResponse> getReturnPackage() {
        return Optional.ofNullable(this.returnPackage);
    }
    /**
     * Specifies the return carrier and customer's account with the carrier.
     * 
     */
    public Optional<ReturnShippingResponse> getReturnShipping() {
        return Optional.ofNullable(this.returnShipping);
    }
    /**
     * Contains information about the Microsoft datacenter to which the drives should be shipped.
     * 
     */
    public Optional<ShippingInformationResponse> getShippingInformation() {
        return Optional.ofNullable(this.shippingInformation);
    }
    /**
     * Current state of the job.
     * 
     */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * The resource identifier of the storage account where data will be imported to or exported from.
     * 
     */
    public Optional<String> getStorageAccountId() {
        return Optional.ofNullable(this.storageAccountId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean backupDriveManifest;
        private @Nullable Boolean cancelRequested;
        private @Nullable DeliveryPackageInformationResponse deliveryPackage;
        private @Nullable String diagnosticsPath;
        private @Nullable List<DriveStatusResponse> driveList;
        private @Nullable EncryptionKeyDetailsResponse encryptionKey;
        private @Nullable ExportResponse export;
        private @Nullable String incompleteBlobListUri;
        private @Nullable String jobType;
        private @Nullable String logLevel;
        private @Nullable Integer percentComplete;
        private @Nullable String provisioningState;
        private @Nullable ReturnAddressResponse returnAddress;
        private @Nullable PackageInformationResponse returnPackage;
        private @Nullable ReturnShippingResponse returnShipping;
        private @Nullable ShippingInformationResponse shippingInformation;
        private @Nullable String state;
        private @Nullable String storageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupDriveManifest = defaults.backupDriveManifest;
    	      this.cancelRequested = defaults.cancelRequested;
    	      this.deliveryPackage = defaults.deliveryPackage;
    	      this.diagnosticsPath = defaults.diagnosticsPath;
    	      this.driveList = defaults.driveList;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.export = defaults.export;
    	      this.incompleteBlobListUri = defaults.incompleteBlobListUri;
    	      this.jobType = defaults.jobType;
    	      this.logLevel = defaults.logLevel;
    	      this.percentComplete = defaults.percentComplete;
    	      this.provisioningState = defaults.provisioningState;
    	      this.returnAddress = defaults.returnAddress;
    	      this.returnPackage = defaults.returnPackage;
    	      this.returnShipping = defaults.returnShipping;
    	      this.shippingInformation = defaults.shippingInformation;
    	      this.state = defaults.state;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        public Builder setBackupDriveManifest(@Nullable Boolean backupDriveManifest) {
            this.backupDriveManifest = backupDriveManifest;
            return this;
        }

        public Builder setCancelRequested(@Nullable Boolean cancelRequested) {
            this.cancelRequested = cancelRequested;
            return this;
        }

        public Builder setDeliveryPackage(@Nullable DeliveryPackageInformationResponse deliveryPackage) {
            this.deliveryPackage = deliveryPackage;
            return this;
        }

        public Builder setDiagnosticsPath(@Nullable String diagnosticsPath) {
            this.diagnosticsPath = diagnosticsPath;
            return this;
        }

        public Builder setDriveList(@Nullable List<DriveStatusResponse> driveList) {
            this.driveList = driveList;
            return this;
        }

        public Builder setEncryptionKey(@Nullable EncryptionKeyDetailsResponse encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }

        public Builder setExport(@Nullable ExportResponse export) {
            this.export = export;
            return this;
        }

        public Builder setIncompleteBlobListUri(@Nullable String incompleteBlobListUri) {
            this.incompleteBlobListUri = incompleteBlobListUri;
            return this;
        }

        public Builder setJobType(@Nullable String jobType) {
            this.jobType = jobType;
            return this;
        }

        public Builder setLogLevel(@Nullable String logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder setPercentComplete(@Nullable Integer percentComplete) {
            this.percentComplete = percentComplete;
            return this;
        }

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setReturnAddress(@Nullable ReturnAddressResponse returnAddress) {
            this.returnAddress = returnAddress;
            return this;
        }

        public Builder setReturnPackage(@Nullable PackageInformationResponse returnPackage) {
            this.returnPackage = returnPackage;
            return this;
        }

        public Builder setReturnShipping(@Nullable ReturnShippingResponse returnShipping) {
            this.returnShipping = returnShipping;
            return this;
        }

        public Builder setShippingInformation(@Nullable ShippingInformationResponse shippingInformation) {
            this.shippingInformation = shippingInformation;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setStorageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }
        public JobDetailsResponse build() {
            return new JobDetailsResponse(backupDriveManifest, cancelRequested, deliveryPackage, diagnosticsPath, driveList, encryptionKey, export, incompleteBlobListUri, jobType, logLevel, percentComplete, provisioningState, returnAddress, returnPackage, returnShipping, shippingInformation, state, storageAccountId);
        }
    }
}
