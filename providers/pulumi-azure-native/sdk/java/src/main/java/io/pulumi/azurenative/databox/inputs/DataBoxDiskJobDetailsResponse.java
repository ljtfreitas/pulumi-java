// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.ContactDetailsResponse;
import io.pulumi.azurenative.databox.inputs.DataBoxAccountCopyLogDetailsResponse;
import io.pulumi.azurenative.databox.inputs.DataBoxDiskCopyLogDetailsResponse;
import io.pulumi.azurenative.databox.inputs.DataBoxDiskCopyProgressResponse;
import io.pulumi.azurenative.databox.inputs.DataBoxHeavyAccountCopyLogDetailsResponse;
import io.pulumi.azurenative.databox.inputs.DataExportDetailsResponse;
import io.pulumi.azurenative.databox.inputs.DataImportDetailsResponse;
import io.pulumi.azurenative.databox.inputs.JobStagesResponse;
import io.pulumi.azurenative.databox.inputs.KeyEncryptionKeyResponse;
import io.pulumi.azurenative.databox.inputs.PackageShippingDetailsResponse;
import io.pulumi.azurenative.databox.inputs.PreferencesResponse;
import io.pulumi.azurenative.databox.inputs.ShippingAddressResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DataBox Disk Job Details.
 * 
 */
public final class DataBoxDiskJobDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataBoxDiskJobDetailsResponse Empty = new DataBoxDiskJobDetailsResponse();

    /**
     * Shared access key to download the chain of custody logs
     * 
     */
    @InputImport(name="chainOfCustodySasKey", required=true)
        private final String chainOfCustodySasKey;

    public String getChainOfCustodySasKey() {
        return this.chainOfCustodySasKey;
    }

    /**
     * Contact details for notification and shipping.
     * 
     */
    @InputImport(name="contactDetails", required=true)
        private final ContactDetailsResponse contactDetails;

    public ContactDetailsResponse getContactDetails() {
        return this.contactDetails;
    }

    /**
     * List of copy log details.
     * 
     */
    @InputImport(name="copyLogDetails", required=true)
        private final List<Object> copyLogDetails;

    public List<Object> getCopyLogDetails() {
        return this.copyLogDetails;
    }

    /**
     * Copy progress per disk.
     * 
     */
    @InputImport(name="copyProgress", required=true)
        private final List<DataBoxDiskCopyProgressResponse> copyProgress;

    public List<DataBoxDiskCopyProgressResponse> getCopyProgress() {
        return this.copyProgress;
    }

    /**
     * Details of the data to be exported from azure.
     * 
     */
    @InputImport(name="dataExportDetails")
        private final @Nullable List<DataExportDetailsResponse> dataExportDetails;

    public List<DataExportDetailsResponse> getDataExportDetails() {
        return this.dataExportDetails == null ? List.of() : this.dataExportDetails;
    }

    /**
     * Details of the data to be imported into azure.
     * 
     */
    @InputImport(name="dataImportDetails")
        private final @Nullable List<DataImportDetailsResponse> dataImportDetails;

    public List<DataImportDetailsResponse> getDataImportDetails() {
        return this.dataImportDetails == null ? List.of() : this.dataImportDetails;
    }

    /**
     * Delivery package shipping details.
     * 
     */
    @InputImport(name="deliveryPackage", required=true)
        private final PackageShippingDetailsResponse deliveryPackage;

    public PackageShippingDetailsResponse getDeliveryPackage() {
        return this.deliveryPackage;
    }

    /**
     * Contains the map of disk serial number to the disk size being used for the job. Is returned only after the disks are shipped to the customer.
     * 
     */
    @InputImport(name="disksAndSizeDetails", required=true)
        private final Map<String,Integer> disksAndSizeDetails;

    public Map<String,Integer> getDisksAndSizeDetails() {
        return this.disksAndSizeDetails;
    }

    /**
     * The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
     */
    @InputImport(name="expectedDataSizeInTeraBytes")
        private final @Nullable Integer expectedDataSizeInTeraBytes;

    public Optional<Integer> getExpectedDataSizeInTeraBytes() {
        return this.expectedDataSizeInTeraBytes == null ? Optional.empty() : Optional.ofNullable(this.expectedDataSizeInTeraBytes);
    }

    /**
     * Indicates the type of job details.
     * Expected value is 'DataBoxDisk'.
     * 
     */
    @InputImport(name="jobDetailsType", required=true)
        private final String jobDetailsType;

    public String getJobDetailsType() {
        return this.jobDetailsType;
    }

    /**
     * List of stages that run in the job.
     * 
     */
    @InputImport(name="jobStages", required=true)
        private final List<JobStagesResponse> jobStages;

    public List<JobStagesResponse> getJobStages() {
        return this.jobStages;
    }

    /**
     * Details about which key encryption type is being used.
     * 
     */
    @InputImport(name="keyEncryptionKey")
        private final @Nullable KeyEncryptionKeyResponse keyEncryptionKey;

    public Optional<KeyEncryptionKeyResponse> getKeyEncryptionKey() {
        return this.keyEncryptionKey == null ? Optional.empty() : Optional.ofNullable(this.keyEncryptionKey);
    }

    /**
     * User entered passkey for DataBox Disk job.
     * 
     */
    @InputImport(name="passkey")
        private final @Nullable String passkey;

    public Optional<String> getPasskey() {
        return this.passkey == null ? Optional.empty() : Optional.ofNullable(this.passkey);
    }

    /**
     * Preferences for the order.
     * 
     */
    @InputImport(name="preferences")
        private final @Nullable PreferencesResponse preferences;

    public Optional<PreferencesResponse> getPreferences() {
        return this.preferences == null ? Optional.empty() : Optional.ofNullable(this.preferences);
    }

    /**
     * User preference on what size disks are needed for the job. The map is from the disk size in TB to the count. Eg. {2,5} means 5 disks of 2 TB size. Key is string but will be checked against an int.
     * 
     */
    @InputImport(name="preferredDisks")
        private final @Nullable Map<String,Integer> preferredDisks;

    public Map<String,Integer> getPreferredDisks() {
        return this.preferredDisks == null ? Map.of() : this.preferredDisks;
    }

    /**
     * Return package shipping details.
     * 
     */
    @InputImport(name="returnPackage", required=true)
        private final PackageShippingDetailsResponse returnPackage;

    public PackageShippingDetailsResponse getReturnPackage() {
        return this.returnPackage;
    }

    /**
     * Shared access key to download the return shipment label
     * 
     */
    @InputImport(name="reverseShipmentLabelSasKey", required=true)
        private final String reverseShipmentLabelSasKey;

    public String getReverseShipmentLabelSasKey() {
        return this.reverseShipmentLabelSasKey;
    }

    /**
     * Shipping address of the customer.
     * 
     */
    @InputImport(name="shippingAddress")
        private final @Nullable ShippingAddressResponse shippingAddress;

    public Optional<ShippingAddressResponse> getShippingAddress() {
        return this.shippingAddress == null ? Optional.empty() : Optional.ofNullable(this.shippingAddress);
    }

    public DataBoxDiskJobDetailsResponse(
        String chainOfCustodySasKey,
        ContactDetailsResponse contactDetails,
        List<Object> copyLogDetails,
        List<DataBoxDiskCopyProgressResponse> copyProgress,
        @Nullable List<DataExportDetailsResponse> dataExportDetails,
        @Nullable List<DataImportDetailsResponse> dataImportDetails,
        PackageShippingDetailsResponse deliveryPackage,
        Map<String,Integer> disksAndSizeDetails,
        @Nullable Integer expectedDataSizeInTeraBytes,
        String jobDetailsType,
        List<JobStagesResponse> jobStages,
        @Nullable KeyEncryptionKeyResponse keyEncryptionKey,
        @Nullable String passkey,
        @Nullable PreferencesResponse preferences,
        @Nullable Map<String,Integer> preferredDisks,
        PackageShippingDetailsResponse returnPackage,
        String reverseShipmentLabelSasKey,
        @Nullable ShippingAddressResponse shippingAddress) {
        this.chainOfCustodySasKey = Objects.requireNonNull(chainOfCustodySasKey, "expected parameter 'chainOfCustodySasKey' to be non-null");
        this.contactDetails = Objects.requireNonNull(contactDetails, "expected parameter 'contactDetails' to be non-null");
        this.copyLogDetails = Objects.requireNonNull(copyLogDetails, "expected parameter 'copyLogDetails' to be non-null");
        this.copyProgress = Objects.requireNonNull(copyProgress, "expected parameter 'copyProgress' to be non-null");
        this.dataExportDetails = dataExportDetails;
        this.dataImportDetails = dataImportDetails;
        this.deliveryPackage = Objects.requireNonNull(deliveryPackage, "expected parameter 'deliveryPackage' to be non-null");
        this.disksAndSizeDetails = Objects.requireNonNull(disksAndSizeDetails, "expected parameter 'disksAndSizeDetails' to be non-null");
        this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
        this.jobDetailsType = Objects.requireNonNull(jobDetailsType, "expected parameter 'jobDetailsType' to be non-null");
        this.jobStages = Objects.requireNonNull(jobStages, "expected parameter 'jobStages' to be non-null");
        this.keyEncryptionKey = keyEncryptionKey;
        this.passkey = passkey;
        this.preferences = preferences;
        this.preferredDisks = preferredDisks;
        this.returnPackage = Objects.requireNonNull(returnPackage, "expected parameter 'returnPackage' to be non-null");
        this.reverseShipmentLabelSasKey = Objects.requireNonNull(reverseShipmentLabelSasKey, "expected parameter 'reverseShipmentLabelSasKey' to be non-null");
        this.shippingAddress = shippingAddress;
    }

    private DataBoxDiskJobDetailsResponse() {
        this.chainOfCustodySasKey = null;
        this.contactDetails = null;
        this.copyLogDetails = List.of();
        this.copyProgress = List.of();
        this.dataExportDetails = List.of();
        this.dataImportDetails = List.of();
        this.deliveryPackage = null;
        this.disksAndSizeDetails = Map.of();
        this.expectedDataSizeInTeraBytes = null;
        this.jobDetailsType = null;
        this.jobStages = List.of();
        this.keyEncryptionKey = null;
        this.passkey = null;
        this.preferences = null;
        this.preferredDisks = Map.of();
        this.returnPackage = null;
        this.reverseShipmentLabelSasKey = null;
        this.shippingAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxDiskJobDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String chainOfCustodySasKey;
        private ContactDetailsResponse contactDetails;
        private List<Object> copyLogDetails;
        private List<DataBoxDiskCopyProgressResponse> copyProgress;
        private @Nullable List<DataExportDetailsResponse> dataExportDetails;
        private @Nullable List<DataImportDetailsResponse> dataImportDetails;
        private PackageShippingDetailsResponse deliveryPackage;
        private Map<String,Integer> disksAndSizeDetails;
        private @Nullable Integer expectedDataSizeInTeraBytes;
        private String jobDetailsType;
        private List<JobStagesResponse> jobStages;
        private @Nullable KeyEncryptionKeyResponse keyEncryptionKey;
        private @Nullable String passkey;
        private @Nullable PreferencesResponse preferences;
        private @Nullable Map<String,Integer> preferredDisks;
        private PackageShippingDetailsResponse returnPackage;
        private String reverseShipmentLabelSasKey;
        private @Nullable ShippingAddressResponse shippingAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxDiskJobDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chainOfCustodySasKey = defaults.chainOfCustodySasKey;
    	      this.contactDetails = defaults.contactDetails;
    	      this.copyLogDetails = defaults.copyLogDetails;
    	      this.copyProgress = defaults.copyProgress;
    	      this.dataExportDetails = defaults.dataExportDetails;
    	      this.dataImportDetails = defaults.dataImportDetails;
    	      this.deliveryPackage = defaults.deliveryPackage;
    	      this.disksAndSizeDetails = defaults.disksAndSizeDetails;
    	      this.expectedDataSizeInTeraBytes = defaults.expectedDataSizeInTeraBytes;
    	      this.jobDetailsType = defaults.jobDetailsType;
    	      this.jobStages = defaults.jobStages;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
    	      this.passkey = defaults.passkey;
    	      this.preferences = defaults.preferences;
    	      this.preferredDisks = defaults.preferredDisks;
    	      this.returnPackage = defaults.returnPackage;
    	      this.reverseShipmentLabelSasKey = defaults.reverseShipmentLabelSasKey;
    	      this.shippingAddress = defaults.shippingAddress;
        }

        public Builder setChainOfCustodySasKey(String chainOfCustodySasKey) {
            this.chainOfCustodySasKey = Objects.requireNonNull(chainOfCustodySasKey);
            return this;
        }

        public Builder setContactDetails(ContactDetailsResponse contactDetails) {
            this.contactDetails = Objects.requireNonNull(contactDetails);
            return this;
        }

        public Builder setCopyLogDetails(List<Object> copyLogDetails) {
            this.copyLogDetails = Objects.requireNonNull(copyLogDetails);
            return this;
        }

        public Builder setCopyProgress(List<DataBoxDiskCopyProgressResponse> copyProgress) {
            this.copyProgress = Objects.requireNonNull(copyProgress);
            return this;
        }

        public Builder setDataExportDetails(@Nullable List<DataExportDetailsResponse> dataExportDetails) {
            this.dataExportDetails = dataExportDetails;
            return this;
        }

        public Builder setDataImportDetails(@Nullable List<DataImportDetailsResponse> dataImportDetails) {
            this.dataImportDetails = dataImportDetails;
            return this;
        }

        public Builder setDeliveryPackage(PackageShippingDetailsResponse deliveryPackage) {
            this.deliveryPackage = Objects.requireNonNull(deliveryPackage);
            return this;
        }

        public Builder setDisksAndSizeDetails(Map<String,Integer> disksAndSizeDetails) {
            this.disksAndSizeDetails = Objects.requireNonNull(disksAndSizeDetails);
            return this;
        }

        public Builder setExpectedDataSizeInTeraBytes(@Nullable Integer expectedDataSizeInTeraBytes) {
            this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
            return this;
        }

        public Builder setJobDetailsType(String jobDetailsType) {
            this.jobDetailsType = Objects.requireNonNull(jobDetailsType);
            return this;
        }

        public Builder setJobStages(List<JobStagesResponse> jobStages) {
            this.jobStages = Objects.requireNonNull(jobStages);
            return this;
        }

        public Builder setKeyEncryptionKey(@Nullable KeyEncryptionKeyResponse keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }

        public Builder setPasskey(@Nullable String passkey) {
            this.passkey = passkey;
            return this;
        }

        public Builder setPreferences(@Nullable PreferencesResponse preferences) {
            this.preferences = preferences;
            return this;
        }

        public Builder setPreferredDisks(@Nullable Map<String,Integer> preferredDisks) {
            this.preferredDisks = preferredDisks;
            return this;
        }

        public Builder setReturnPackage(PackageShippingDetailsResponse returnPackage) {
            this.returnPackage = Objects.requireNonNull(returnPackage);
            return this;
        }

        public Builder setReverseShipmentLabelSasKey(String reverseShipmentLabelSasKey) {
            this.reverseShipmentLabelSasKey = Objects.requireNonNull(reverseShipmentLabelSasKey);
            return this;
        }

        public Builder setShippingAddress(@Nullable ShippingAddressResponse shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }
        public DataBoxDiskJobDetailsResponse build() {
            return new DataBoxDiskJobDetailsResponse(chainOfCustodySasKey, contactDetails, copyLogDetails, copyProgress, dataExportDetails, dataImportDetails, deliveryPackage, disksAndSizeDetails, expectedDataSizeInTeraBytes, jobDetailsType, jobStages, keyEncryptionKey, passkey, preferences, preferredDisks, returnPackage, reverseShipmentLabelSasKey, shippingAddress);
        }
    }
}
