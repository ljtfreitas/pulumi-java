// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.compute_alpha.outputs.CustomerEncryptionKeyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.DeprecationStatusResponse;
import io.pulumi.googlenative.compute_alpha.outputs.GuestOsFeatureResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ImageRawDiskResponse;
import io.pulumi.googlenative.compute_alpha.outputs.InitialStateConfigResponse;
import io.pulumi.googlenative.compute_alpha.outputs.RolloutPolicyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetImageResult {
    /**
     * The architecture of the image. Valid values are ARM64 or X86_64.
     * 
     */
    private final String architecture;
    /**
     * Size of the image tar.gz archive stored in Google Cloud Storage (in bytes).
     * 
     */
    private final String archiveSizeBytes;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * The deprecation status associated with this image.
     * 
     */
    private final DeprecationStatusResponse deprecated;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Size of the image when restored onto a persistent disk (in GB).
     * 
     */
    private final String diskSizeGb;
    /**
     * The name of the image family to which this image belongs. You can create disks by specifying an image family instead of a specific image name. The image family always returns its latest image that is not deprecated. The name of the image family must comply with RFC1035.
     * 
     */
    private final String family;
    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. To see a list of available options, see the guestOSfeatures[].type parameter.
     * 
     */
    private final List<GuestOsFeatureResponse> guestOsFeatures;
    /**
     * Encrypts the image using a customer-supplied encryption key. After you encrypt an image with a customer-supplied key, you must provide the same key if you use the image later (e.g. to create a disk from the image). Customer-supplied encryption keys do not protect access to metadata of the disk. If you do not provide an encryption key when creating the image, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the image later.
     * 
     */
    private final CustomerEncryptionKeyResponse imageEncryptionKey;
    /**
     * Type of the resource. Always compute#image for images.
     * 
     */
    private final String kind;
    /**
     * A fingerprint for the labels being applied to this image, which is essentially a hash of the labels used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an image.
     * 
     */
    private final String labelFingerprint;
    /**
     * Labels to apply to this image. These can be later modified by the setLabels method.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Integer license codes indicating which licenses are attached to this image.
     * 
     */
    private final List<String> licenseCodes;
    /**
     * Any applicable license URI.
     * 
     */
    private final List<String> licenses;
    /**
     * A flag for marketplace VM disk created from the image, which is designed for marketplace VM disk to prevent the proprietary data on the disk from being accessed unwantedly. The flag will be inherited by the disk created from the image. The disk with locked flag set to true will be prohibited from performing the operations below: - R/W or R/O disk attach - Disk detach, if disk is created via create-on-create - Create images - Create snapshots - Create disk clone (create disk from the current disk) The image with the locked field set to true will be prohibited from performing the operations below: - Create images from the current image - Update the locked field for the current image The instance with at least one disk with locked flag set to true will be prohibited from performing the operations below: - Secondary disk attach - Create instant snapshot - Create machine images - Create instance template - Delete the instance with --keep-disk parameter set to true
     * 
     */
    private final Boolean locked;
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The parameters of the raw disk image.
     * 
     */
    private final ImageRawDiskResponse rawDisk;
    /**
     * A rollout policy to apply to this image. When specified, the rollout policy overrides per-zone references to the image via the associated image family. The rollout policy restricts the zones where this image is accessible when using a zonal image family reference. When the rollout policy does not include the user specified zone, or if the zone is rolled out, this image is accessible. The rollout policy for this image is read-only, except for allowlisted users. This field might not be configured. To view the latest non-deprecated image in a specific zone, use the imageFamilyViews.get method.
     * 
     */
    private final RolloutPolicyResponse rolloutOverride;
    /**
     * Reserved for future use.
     * 
     */
    private final Boolean satisfiesPzs;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined URL for this resource's resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * Set the secure boot keys of shielded instance.
     * 
     */
    private final InitialStateConfigResponse shieldedInstanceInitialState;
    /**
     * URL of the source disk used to create this image. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    private final String sourceDisk;
    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
     */
    private final CustomerEncryptionKeyResponse sourceDiskEncryptionKey;
    /**
     * The ID value of the disk used to create this image. This value may be used to determine whether the image was taken from the current or a previous instance of a given disk name.
     * 
     */
    private final String sourceDiskId;
    /**
     * URL of the source image used to create this image. The following are valid formats for the URL: - https://www.googleapis.com/compute/v1/projects/project_id/global/ images/image_name - projects/project_id/global/images/image_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    private final String sourceImage;
    /**
     * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
     * 
     */
    private final CustomerEncryptionKeyResponse sourceImageEncryptionKey;
    /**
     * The ID value of the image used to create this image. This value may be used to determine whether the image was taken from the current or a previous instance of a given image name.
     * 
     */
    private final String sourceImageId;
    /**
     * URL of the source snapshot used to create this image. The following are valid formats for the URL: - https://www.googleapis.com/compute/v1/projects/project_id/global/ snapshots/snapshot_name - projects/project_id/global/snapshots/snapshot_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
     */
    private final String sourceSnapshot;
    /**
     * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
     * 
     */
    private final CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey;
    /**
     * The ID value of the snapshot used to create this image. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a given snapshot name.
     * 
     */
    private final String sourceSnapshotId;
    /**
     * The type of the image used to create this disk. The default and only value is RAW
     * 
     */
    private final String sourceType;
    /**
     * The status of the image. An image can be used to create other resources, such as instances, only after the image has been successfully created and the status is set to READY. Possible values are FAILED, PENDING, or READY.
     * 
     */
    private final String status;
    /**
     * Cloud Storage bucket storage location of the image (regional or multi-regional).
     * 
     */
    private final List<String> storageLocations;
    /**
     * A list of publicly visible user-licenses. Unlike regular licenses, user provided licenses can be modified after the disk is created. This includes a list of URLs to the license resource. For example, to provide a debian license: https://www.googleapis.com/compute/v1/projects/debian-cloud/global/licenses/debian-9-stretch
     * 
     */
    private final List<String> userLicenses;

    @CustomType.Constructor
    private GetImageResult(
        @CustomType.Parameter("architecture") String architecture,
        @CustomType.Parameter("archiveSizeBytes") String archiveSizeBytes,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("deprecated") DeprecationStatusResponse deprecated,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("diskSizeGb") String diskSizeGb,
        @CustomType.Parameter("family") String family,
        @CustomType.Parameter("guestOsFeatures") List<GuestOsFeatureResponse> guestOsFeatures,
        @CustomType.Parameter("imageEncryptionKey") CustomerEncryptionKeyResponse imageEncryptionKey,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("labelFingerprint") String labelFingerprint,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("licenseCodes") List<String> licenseCodes,
        @CustomType.Parameter("licenses") List<String> licenses,
        @CustomType.Parameter("locked") Boolean locked,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("rawDisk") ImageRawDiskResponse rawDisk,
        @CustomType.Parameter("rolloutOverride") RolloutPolicyResponse rolloutOverride,
        @CustomType.Parameter("satisfiesPzs") Boolean satisfiesPzs,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("selfLinkWithId") String selfLinkWithId,
        @CustomType.Parameter("shieldedInstanceInitialState") InitialStateConfigResponse shieldedInstanceInitialState,
        @CustomType.Parameter("sourceDisk") String sourceDisk,
        @CustomType.Parameter("sourceDiskEncryptionKey") CustomerEncryptionKeyResponse sourceDiskEncryptionKey,
        @CustomType.Parameter("sourceDiskId") String sourceDiskId,
        @CustomType.Parameter("sourceImage") String sourceImage,
        @CustomType.Parameter("sourceImageEncryptionKey") CustomerEncryptionKeyResponse sourceImageEncryptionKey,
        @CustomType.Parameter("sourceImageId") String sourceImageId,
        @CustomType.Parameter("sourceSnapshot") String sourceSnapshot,
        @CustomType.Parameter("sourceSnapshotEncryptionKey") CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey,
        @CustomType.Parameter("sourceSnapshotId") String sourceSnapshotId,
        @CustomType.Parameter("sourceType") String sourceType,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("storageLocations") List<String> storageLocations,
        @CustomType.Parameter("userLicenses") List<String> userLicenses) {
        this.architecture = architecture;
        this.archiveSizeBytes = archiveSizeBytes;
        this.creationTimestamp = creationTimestamp;
        this.deprecated = deprecated;
        this.description = description;
        this.diskSizeGb = diskSizeGb;
        this.family = family;
        this.guestOsFeatures = guestOsFeatures;
        this.imageEncryptionKey = imageEncryptionKey;
        this.kind = kind;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.licenseCodes = licenseCodes;
        this.licenses = licenses;
        this.locked = locked;
        this.name = name;
        this.rawDisk = rawDisk;
        this.rolloutOverride = rolloutOverride;
        this.satisfiesPzs = satisfiesPzs;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
        this.shieldedInstanceInitialState = shieldedInstanceInitialState;
        this.sourceDisk = sourceDisk;
        this.sourceDiskEncryptionKey = sourceDiskEncryptionKey;
        this.sourceDiskId = sourceDiskId;
        this.sourceImage = sourceImage;
        this.sourceImageEncryptionKey = sourceImageEncryptionKey;
        this.sourceImageId = sourceImageId;
        this.sourceSnapshot = sourceSnapshot;
        this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
        this.sourceSnapshotId = sourceSnapshotId;
        this.sourceType = sourceType;
        this.status = status;
        this.storageLocations = storageLocations;
        this.userLicenses = userLicenses;
    }

    /**
     * The architecture of the image. Valid values are ARM64 or X86_64.
     * 
    */
    public String getArchitecture() {
        return this.architecture;
    }
    /**
     * Size of the image tar.gz archive stored in Google Cloud Storage (in bytes).
     * 
    */
    public String getArchiveSizeBytes() {
        return this.archiveSizeBytes;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * The deprecation status associated with this image.
     * 
    */
    public DeprecationStatusResponse getDeprecated() {
        return this.deprecated;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Size of the image when restored onto a persistent disk (in GB).
     * 
    */
    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * The name of the image family to which this image belongs. You can create disks by specifying an image family instead of a specific image name. The image family always returns its latest image that is not deprecated. The name of the image family must comply with RFC1035.
     * 
    */
    public String getFamily() {
        return this.family;
    }
    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. To see a list of available options, see the guestOSfeatures[].type parameter.
     * 
    */
    public List<GuestOsFeatureResponse> getGuestOsFeatures() {
        return this.guestOsFeatures;
    }
    /**
     * Encrypts the image using a customer-supplied encryption key. After you encrypt an image with a customer-supplied key, you must provide the same key if you use the image later (e.g. to create a disk from the image). Customer-supplied encryption keys do not protect access to metadata of the disk. If you do not provide an encryption key when creating the image, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the image later.
     * 
    */
    public CustomerEncryptionKeyResponse getImageEncryptionKey() {
        return this.imageEncryptionKey;
    }
    /**
     * Type of the resource. Always compute#image for images.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this image, which is essentially a hash of the labels used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an image.
     * 
    */
    public String getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels to apply to this image. These can be later modified by the setLabels method.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Integer license codes indicating which licenses are attached to this image.
     * 
    */
    public List<String> getLicenseCodes() {
        return this.licenseCodes;
    }
    /**
     * Any applicable license URI.
     * 
    */
    public List<String> getLicenses() {
        return this.licenses;
    }
    /**
     * A flag for marketplace VM disk created from the image, which is designed for marketplace VM disk to prevent the proprietary data on the disk from being accessed unwantedly. The flag will be inherited by the disk created from the image. The disk with locked flag set to true will be prohibited from performing the operations below: - R/W or R/O disk attach - Disk detach, if disk is created via create-on-create - Create images - Create snapshots - Create disk clone (create disk from the current disk) The image with the locked field set to true will be prohibited from performing the operations below: - Create images from the current image - Update the locked field for the current image The instance with at least one disk with locked flag set to true will be prohibited from performing the operations below: - Secondary disk attach - Create instant snapshot - Create machine images - Create instance template - Delete the instance with --keep-disk parameter set to true
     * 
    */
    public Boolean getLocked() {
        return this.locked;
    }
    /**
     * Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The parameters of the raw disk image.
     * 
    */
    public ImageRawDiskResponse getRawDisk() {
        return this.rawDisk;
    }
    /**
     * A rollout policy to apply to this image. When specified, the rollout policy overrides per-zone references to the image via the associated image family. The rollout policy restricts the zones where this image is accessible when using a zonal image family reference. When the rollout policy does not include the user specified zone, or if the zone is rolled out, this image is accessible. The rollout policy for this image is read-only, except for allowlisted users. This field might not be configured. To view the latest non-deprecated image in a specific zone, use the imageFamilyViews.get method.
     * 
    */
    public RolloutPolicyResponse getRolloutOverride() {
        return this.rolloutOverride;
    }
    /**
     * Reserved for future use.
     * 
    */
    public Boolean getSatisfiesPzs() {
        return this.satisfiesPzs;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource's resource id.
     * 
    */
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * Set the secure boot keys of shielded instance.
     * 
    */
    public InitialStateConfigResponse getShieldedInstanceInitialState() {
        return this.shieldedInstanceInitialState;
    }
    /**
     * URL of the source disk used to create this image. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
    */
    public String getSourceDisk() {
        return this.sourceDisk;
    }
    /**
     * The customer-supplied encryption key of the source disk. Required if the source disk is protected by a customer-supplied encryption key.
     * 
    */
    public CustomerEncryptionKeyResponse getSourceDiskEncryptionKey() {
        return this.sourceDiskEncryptionKey;
    }
    /**
     * The ID value of the disk used to create this image. This value may be used to determine whether the image was taken from the current or a previous instance of a given disk name.
     * 
    */
    public String getSourceDiskId() {
        return this.sourceDiskId;
    }
    /**
     * URL of the source image used to create this image. The following are valid formats for the URL: - https://www.googleapis.com/compute/v1/projects/project_id/global/ images/image_name - projects/project_id/global/images/image_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
    */
    public String getSourceImage() {
        return this.sourceImage;
    }
    /**
     * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
     * 
    */
    public CustomerEncryptionKeyResponse getSourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey;
    }
    /**
     * The ID value of the image used to create this image. This value may be used to determine whether the image was taken from the current or a previous instance of a given image name.
     * 
    */
    public String getSourceImageId() {
        return this.sourceImageId;
    }
    /**
     * URL of the source snapshot used to create this image. The following are valid formats for the URL: - https://www.googleapis.com/compute/v1/projects/project_id/global/ snapshots/snapshot_name - projects/project_id/global/snapshots/snapshot_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
     * 
    */
    public String getSourceSnapshot() {
        return this.sourceSnapshot;
    }
    /**
     * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
     * 
    */
    public CustomerEncryptionKeyResponse getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey;
    }
    /**
     * The ID value of the snapshot used to create this image. This value may be used to determine whether the snapshot was taken from the current or a previous instance of a given snapshot name.
     * 
    */
    public String getSourceSnapshotId() {
        return this.sourceSnapshotId;
    }
    /**
     * The type of the image used to create this disk. The default and only value is RAW
     * 
    */
    public String getSourceType() {
        return this.sourceType;
    }
    /**
     * The status of the image. An image can be used to create other resources, such as instances, only after the image has been successfully created and the status is set to READY. Possible values are FAILED, PENDING, or READY.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Cloud Storage bucket storage location of the image (regional or multi-regional).
     * 
    */
    public List<String> getStorageLocations() {
        return this.storageLocations;
    }
    /**
     * A list of publicly visible user-licenses. Unlike regular licenses, user provided licenses can be modified after the disk is created. This includes a list of URLs to the license resource. For example, to provide a debian license: https://www.googleapis.com/compute/v1/projects/debian-cloud/global/licenses/debian-9-stretch
     * 
    */
    public List<String> getUserLicenses() {
        return this.userLicenses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String architecture;
        private String archiveSizeBytes;
        private String creationTimestamp;
        private DeprecationStatusResponse deprecated;
        private String description;
        private String diskSizeGb;
        private String family;
        private List<GuestOsFeatureResponse> guestOsFeatures;
        private CustomerEncryptionKeyResponse imageEncryptionKey;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private List<String> licenseCodes;
        private List<String> licenses;
        private Boolean locked;
        private String name;
        private ImageRawDiskResponse rawDisk;
        private RolloutPolicyResponse rolloutOverride;
        private Boolean satisfiesPzs;
        private String selfLink;
        private String selfLinkWithId;
        private InitialStateConfigResponse shieldedInstanceInitialState;
        private String sourceDisk;
        private CustomerEncryptionKeyResponse sourceDiskEncryptionKey;
        private String sourceDiskId;
        private String sourceImage;
        private CustomerEncryptionKeyResponse sourceImageEncryptionKey;
        private String sourceImageId;
        private String sourceSnapshot;
        private CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey;
        private String sourceSnapshotId;
        private String sourceType;
        private String status;
        private List<String> storageLocations;
        private List<String> userLicenses;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.archiveSizeBytes = defaults.archiveSizeBytes;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.deprecated = defaults.deprecated;
    	      this.description = defaults.description;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.family = defaults.family;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.imageEncryptionKey = defaults.imageEncryptionKey;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.licenseCodes = defaults.licenseCodes;
    	      this.licenses = defaults.licenses;
    	      this.locked = defaults.locked;
    	      this.name = defaults.name;
    	      this.rawDisk = defaults.rawDisk;
    	      this.rolloutOverride = defaults.rolloutOverride;
    	      this.satisfiesPzs = defaults.satisfiesPzs;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.shieldedInstanceInitialState = defaults.shieldedInstanceInitialState;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceDiskEncryptionKey = defaults.sourceDiskEncryptionKey;
    	      this.sourceDiskId = defaults.sourceDiskId;
    	      this.sourceImage = defaults.sourceImage;
    	      this.sourceImageEncryptionKey = defaults.sourceImageEncryptionKey;
    	      this.sourceImageId = defaults.sourceImageId;
    	      this.sourceSnapshot = defaults.sourceSnapshot;
    	      this.sourceSnapshotEncryptionKey = defaults.sourceSnapshotEncryptionKey;
    	      this.sourceSnapshotId = defaults.sourceSnapshotId;
    	      this.sourceType = defaults.sourceType;
    	      this.status = defaults.status;
    	      this.storageLocations = defaults.storageLocations;
    	      this.userLicenses = defaults.userLicenses;
        }

        public Builder architecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }

        public Builder archiveSizeBytes(String archiveSizeBytes) {
            this.archiveSizeBytes = Objects.requireNonNull(archiveSizeBytes);
            return this;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder deprecated(DeprecationStatusResponse deprecated) {
            this.deprecated = Objects.requireNonNull(deprecated);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder family(String family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }

        public Builder guestOsFeatures(List<GuestOsFeatureResponse> guestOsFeatures) {
            this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
            return this;
        }

        public Builder imageEncryptionKey(CustomerEncryptionKeyResponse imageEncryptionKey) {
            this.imageEncryptionKey = Objects.requireNonNull(imageEncryptionKey);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder labelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder licenseCodes(List<String> licenseCodes) {
            this.licenseCodes = Objects.requireNonNull(licenseCodes);
            return this;
        }

        public Builder licenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }

        public Builder locked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder rawDisk(ImageRawDiskResponse rawDisk) {
            this.rawDisk = Objects.requireNonNull(rawDisk);
            return this;
        }

        public Builder rolloutOverride(RolloutPolicyResponse rolloutOverride) {
            this.rolloutOverride = Objects.requireNonNull(rolloutOverride);
            return this;
        }

        public Builder satisfiesPzs(Boolean satisfiesPzs) {
            this.satisfiesPzs = Objects.requireNonNull(satisfiesPzs);
            return this;
        }

        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder selfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }

        public Builder shieldedInstanceInitialState(InitialStateConfigResponse shieldedInstanceInitialState) {
            this.shieldedInstanceInitialState = Objects.requireNonNull(shieldedInstanceInitialState);
            return this;
        }

        public Builder sourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }

        public Builder sourceDiskEncryptionKey(CustomerEncryptionKeyResponse sourceDiskEncryptionKey) {
            this.sourceDiskEncryptionKey = Objects.requireNonNull(sourceDiskEncryptionKey);
            return this;
        }

        public Builder sourceDiskId(String sourceDiskId) {
            this.sourceDiskId = Objects.requireNonNull(sourceDiskId);
            return this;
        }

        public Builder sourceImage(String sourceImage) {
            this.sourceImage = Objects.requireNonNull(sourceImage);
            return this;
        }

        public Builder sourceImageEncryptionKey(CustomerEncryptionKeyResponse sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = Objects.requireNonNull(sourceImageEncryptionKey);
            return this;
        }

        public Builder sourceImageId(String sourceImageId) {
            this.sourceImageId = Objects.requireNonNull(sourceImageId);
            return this;
        }

        public Builder sourceSnapshot(String sourceSnapshot) {
            this.sourceSnapshot = Objects.requireNonNull(sourceSnapshot);
            return this;
        }

        public Builder sourceSnapshotEncryptionKey(CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = Objects.requireNonNull(sourceSnapshotEncryptionKey);
            return this;
        }

        public Builder sourceSnapshotId(String sourceSnapshotId) {
            this.sourceSnapshotId = Objects.requireNonNull(sourceSnapshotId);
            return this;
        }

        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }

        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder storageLocations(List<String> storageLocations) {
            this.storageLocations = Objects.requireNonNull(storageLocations);
            return this;
        }

        public Builder userLicenses(List<String> userLicenses) {
            this.userLicenses = Objects.requireNonNull(userLicenses);
            return this;
        }
        public GetImageResult build() {
            return new GetImageResult(architecture, archiveSizeBytes, creationTimestamp, deprecated, description, diskSizeGb, family, guestOsFeatures, imageEncryptionKey, kind, labelFingerprint, labels, licenseCodes, licenses, locked, name, rawDisk, rolloutOverride, satisfiesPzs, selfLink, selfLinkWithId, shieldedInstanceInitialState, sourceDisk, sourceDiskEncryptionKey, sourceDiskId, sourceImage, sourceImageEncryptionKey, sourceImageId, sourceSnapshot, sourceSnapshotEncryptionKey, sourceSnapshotId, sourceType, status, storageLocations, userLicenses);
        }
    }
}
