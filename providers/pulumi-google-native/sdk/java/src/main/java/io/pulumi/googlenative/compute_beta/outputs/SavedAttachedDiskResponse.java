// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_beta.outputs.CustomerEncryptionKeyResponse;
import io.pulumi.googlenative.compute_beta.outputs.GuestOsFeatureResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SavedAttachedDiskResponse {
    /**
     * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    private final Boolean autoDelete;
    /**
     * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    private final Boolean boot;
    /**
     * Specifies the name of the disk attached to the source instance.
     * 
     */
    private final String deviceName;
    /**
     * The encryption key for the disk.
     * 
     */
    private final CustomerEncryptionKeyResponse diskEncryptionKey;
    /**
     * The size of the disk in base-2 GB.
     * 
     */
    private final String diskSizeGb;
    /**
     * URL of the disk type resource. For example: projects/project /zones/zone/diskTypes/pd-standard or pd-ssd
     * 
     */
    private final String diskType;
    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    private final List<GuestOsFeatureResponse> guestOsFeatures;
    /**
     * Specifies zero-based index of the disk that is attached to the source instance.
     * 
     */
    private final Integer index;
    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
     * 
     */
    private final String $interface;
    /**
     * Type of the resource. Always compute#attachedDisk for attached disks.
     * 
     */
    private final String kind;
    /**
     * Any valid publicly visible licenses.
     * 
     */
    private final List<String> licenses;
    /**
     * The mode in which this disk is attached to the source instance, either READ_WRITE or READ_ONLY.
     * 
     */
    private final String mode;
    /**
     * Specifies a URL of the disk attached to the source instance.
     * 
     */
    private final String source;
    /**
     * A size of the storage used by the disk's snapshot by this machine image.
     * 
     */
    private final String storageBytes;
    /**
     * An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
     */
    private final String storageBytesStatus;
    /**
     * Specifies the type of the attached disk, either SCRATCH or PERSISTENT.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SavedAttachedDiskResponse(
        @CustomType.Parameter("autoDelete") Boolean autoDelete,
        @CustomType.Parameter("boot") Boolean boot,
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("diskEncryptionKey") CustomerEncryptionKeyResponse diskEncryptionKey,
        @CustomType.Parameter("diskSizeGb") String diskSizeGb,
        @CustomType.Parameter("diskType") String diskType,
        @CustomType.Parameter("guestOsFeatures") List<GuestOsFeatureResponse> guestOsFeatures,
        @CustomType.Parameter("index") Integer index,
        @CustomType.Parameter("interface") String $interface,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("licenses") List<String> licenses,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("storageBytes") String storageBytes,
        @CustomType.Parameter("storageBytesStatus") String storageBytesStatus,
        @CustomType.Parameter("type") String type) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.diskEncryptionKey = diskEncryptionKey;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.guestOsFeatures = guestOsFeatures;
        this.index = index;
        this.$interface = $interface;
        this.kind = kind;
        this.licenses = licenses;
        this.mode = mode;
        this.source = source;
        this.storageBytes = storageBytes;
        this.storageBytesStatus = storageBytesStatus;
        this.type = type;
    }

    /**
     * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
    */
    public Boolean getAutoDelete() {
        return this.autoDelete;
    }
    /**
     * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
    */
    public Boolean getBoot() {
        return this.boot;
    }
    /**
     * Specifies the name of the disk attached to the source instance.
     * 
    */
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * The encryption key for the disk.
     * 
    */
    public CustomerEncryptionKeyResponse getDiskEncryptionKey() {
        return this.diskEncryptionKey;
    }
    /**
     * The size of the disk in base-2 GB.
     * 
    */
    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * URL of the disk type resource. For example: projects/project /zones/zone/diskTypes/pd-standard or pd-ssd
     * 
    */
    public String getDiskType() {
        return this.diskType;
    }
    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
    */
    public List<GuestOsFeatureResponse> getGuestOsFeatures() {
        return this.guestOsFeatures;
    }
    /**
     * Specifies zero-based index of the disk that is attached to the source instance.
     * 
    */
    public Integer getIndex() {
        return this.index;
    }
    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
     * 
    */
    public String get$interface() {
        return this.$interface;
    }
    /**
     * Type of the resource. Always compute#attachedDisk for attached disks.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Any valid publicly visible licenses.
     * 
    */
    public List<String> getLicenses() {
        return this.licenses;
    }
    /**
     * The mode in which this disk is attached to the source instance, either READ_WRITE or READ_ONLY.
     * 
    */
    public String getMode() {
        return this.mode;
    }
    /**
     * Specifies a URL of the disk attached to the source instance.
     * 
    */
    public String getSource() {
        return this.source;
    }
    /**
     * A size of the storage used by the disk's snapshot by this machine image.
     * 
    */
    public String getStorageBytes() {
        return this.storageBytes;
    }
    /**
     * An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
    */
    public String getStorageBytesStatus() {
        return this.storageBytesStatus;
    }
    /**
     * Specifies the type of the attached disk, either SCRATCH or PERSISTENT.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SavedAttachedDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private Boolean boot;
        private String deviceName;
        private CustomerEncryptionKeyResponse diskEncryptionKey;
        private String diskSizeGb;
        private String diskType;
        private List<GuestOsFeatureResponse> guestOsFeatures;
        private Integer index;
        private String $interface;
        private String kind;
        private List<String> licenses;
        private String mode;
        private String source;
        private String storageBytes;
        private String storageBytesStatus;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SavedAttachedDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.index = defaults.index;
    	      this.$interface = defaults.$interface;
    	      this.kind = defaults.kind;
    	      this.licenses = defaults.licenses;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
    	      this.storageBytes = defaults.storageBytes;
    	      this.storageBytesStatus = defaults.storageBytesStatus;
    	      this.type = defaults.type;
        }

        public Builder autoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }

        public Builder boot(Boolean boot) {
            this.boot = Objects.requireNonNull(boot);
            return this;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder diskEncryptionKey(CustomerEncryptionKeyResponse diskEncryptionKey) {
            this.diskEncryptionKey = Objects.requireNonNull(diskEncryptionKey);
            return this;
        }

        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder guestOsFeatures(List<GuestOsFeatureResponse> guestOsFeatures) {
            this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
            return this;
        }

        public Builder index(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }

        public Builder $interface(String $interface) {
            this.$interface = Objects.requireNonNull($interface);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder licenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }

        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder storageBytes(String storageBytes) {
            this.storageBytes = Objects.requireNonNull(storageBytes);
            return this;
        }

        public Builder storageBytesStatus(String storageBytesStatus) {
            this.storageBytesStatus = Objects.requireNonNull(storageBytesStatus);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SavedAttachedDiskResponse build() {
            return new SavedAttachedDiskResponse(autoDelete, boot, deviceName, diskEncryptionKey, diskSizeGb, diskType, guestOsFeatures, index, $interface, kind, licenses, mode, source, storageBytes, storageBytesStatus, type);
        }
    }
}
