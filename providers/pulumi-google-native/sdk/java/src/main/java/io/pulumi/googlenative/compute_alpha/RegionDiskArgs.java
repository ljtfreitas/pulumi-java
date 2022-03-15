// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.enums.RegionDiskArchitecture;
import io.pulumi.googlenative.compute_alpha.inputs.CustomerEncryptionKeyArgs;
import io.pulumi.googlenative.compute_alpha.inputs.GuestOsFeatureArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionDiskArgs Empty = new RegionDiskArgs();

    /**
     * The architecture of the disk. Valid values are ARM64 or X86_64.
     * 
     */
    @Import(name="architecture")
      private final @Nullable Output<RegionDiskArchitecture> architecture;

    public Output<RegionDiskArchitecture> getArchitecture() {
        return this.architecture == null ? Output.empty() : this.architecture;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Encrypts the disk using a customer-supplied encryption key or a customer-managed encryption key. Encryption keys do not protect access to metadata of the disk. After you encrypt a disk with a customer-supplied key, you must provide the same key if you use the disk later. For example, to create a disk snapshot, to create a disk image, to create a machine image, or to attach the disk to a virtual machine. After you encrypt a disk with a customer-managed key, the diskEncryptionKey.kmsKeyName is set to a key *version* name once the disk is created. The disk is encrypted with this version of the key. In the response, diskEncryptionKey.kmsKeyName appears in the following format: "diskEncryptionKey.kmsKeyName": "projects/kms_project_id/locations/region/keyRings/ key_region/cryptoKeys/key /cryptoKeysVersions/version If you do not provide an encryption key when creating the disk, then the disk is encrypted using an automatically generated key and you don't need to provide a key to use the disk later.
     * 
     */
    @Import(name="diskEncryptionKey")
      private final @Nullable Output<CustomerEncryptionKeyArgs> diskEncryptionKey;

    public Output<CustomerEncryptionKeyArgs> getDiskEncryptionKey() {
        return this.diskEncryptionKey == null ? Output.empty() : this.diskEncryptionKey;
    }

    /**
     * Specifies whether the disk restored from a source snapshot should erase Windows specific VSS signature.
     * 
     */
    @Import(name="eraseWindowsVssSignature")
      private final @Nullable Output<Boolean> eraseWindowsVssSignature;

    public Output<Boolean> getEraseWindowsVssSignature() {
        return this.eraseWindowsVssSignature == null ? Output.empty() : this.eraseWindowsVssSignature;
    }

    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    @Import(name="guestOsFeatures")
      private final @Nullable Output<List<GuestOsFeatureArgs>> guestOsFeatures;

    public Output<List<GuestOsFeatureArgs>> getGuestOsFeatures() {
        return this.guestOsFeatures == null ? Output.empty() : this.guestOsFeatures;
    }

    /**
     * Labels to apply to this disk. These can be later modified by the setLabels method.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Integer license codes indicating which licenses are attached to this disk.
     * 
     */
    @Import(name="licenseCodes")
      private final @Nullable Output<List<String>> licenseCodes;

    public Output<List<String>> getLicenseCodes() {
        return this.licenseCodes == null ? Output.empty() : this.licenseCodes;
    }

    /**
     * A list of publicly visible licenses. Reserved for Google's use.
     * 
     */
    @Import(name="licenses")
      private final @Nullable Output<List<String>> licenses;

    public Output<List<String>> getLicenses() {
        return this.licenses == null ? Output.empty() : this.licenses;
    }

    /**
     * An opaque location hint used to place the disk close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @Import(name="locationHint")
      private final @Nullable Output<String> locationHint;

    public Output<String> getLocationHint() {
        return this.locationHint == null ? Output.empty() : this.locationHint;
    }

    /**
     * Indicates whether or not the disk can be read/write attached to more than one instance.
     * 
     */
    @Import(name="multiWriter")
      private final @Nullable Output<Boolean> multiWriter;

    public Output<Boolean> getMultiWriter() {
        return this.multiWriter == null ? Output.empty() : this.multiWriter;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Internal use only.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<String> options;

    public Output<String> getOptions() {
        return this.options == null ? Output.empty() : this.options;
    }

    /**
     * Physical block size of the persistent disk, in bytes. If not present in a request, a default value is used. The currently supported size is 4096, other sizes may be added in the future. If an unsupported value is requested, the error message will list the supported values for the caller's project.
     * 
     */
    @Import(name="physicalBlockSizeBytes")
      private final @Nullable Output<String> physicalBlockSizeBytes;

    public Output<String> getPhysicalBlockSizeBytes() {
        return this.physicalBlockSizeBytes == null ? Output.empty() : this.physicalBlockSizeBytes;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
     * 
     */
    @Import(name="provisionedIops")
      private final @Nullable Output<String> provisionedIops;

    public Output<String> getProvisionedIops() {
        return this.provisionedIops == null ? Output.empty() : this.provisionedIops;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    /**
     * URLs of the zones where the disk should be replicated to. Only applicable for regional resources.
     * 
     */
    @Import(name="replicaZones")
      private final @Nullable Output<List<String>> replicaZones;

    public Output<List<String>> getReplicaZones() {
        return this.replicaZones == null ? Output.empty() : this.replicaZones;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    /**
     * Resource policies applied to this disk for automatic snapshot creations.
     * 
     */
    @Import(name="resourcePolicies")
      private final @Nullable Output<List<String>> resourcePolicies;

    public Output<List<String>> getResourcePolicies() {
        return this.resourcePolicies == null ? Output.empty() : this.resourcePolicies;
    }

    /**
     * Size, in GB, of the persistent disk. You can specify this field when creating a persistent disk using the sourceImage, sourceSnapshot, or sourceDisk parameter, or specify it alone to create an empty persistent disk. If you specify this field along with a source, the value of sizeGb must not be less than the size of the source. Acceptable values are 1 to 65536, inclusive.
     * 
     */
    @Import(name="sizeGb")
      private final @Nullable Output<String> sizeGb;

    public Output<String> getSizeGb() {
        return this.sizeGb == null ? Output.empty() : this.sizeGb;
    }

    /**
     * The source disk used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - https://www.googleapis.com/compute/v1/projects/project/regions/region /disks/disk - projects/project/zones/zone/disks/disk - projects/project/regions/region/disks/disk - zones/zone/disks/disk - regions/region/disks/disk
     * 
     */
    @Import(name="sourceDisk")
      private final @Nullable Output<String> sourceDisk;

    public Output<String> getSourceDisk() {
        return this.sourceDisk == null ? Output.empty() : this.sourceDisk;
    }

    /**
     * The source image used to create this disk. If the source image is deleted, this field will not be set. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family
     * 
     */
    @Import(name="sourceImage")
      private final @Nullable Output<String> sourceImage;

    public Output<String> getSourceImage() {
        return this.sourceImage == null ? Output.empty() : this.sourceImage;
    }

    /**
     * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key.
     * 
     */
    @Import(name="sourceImageEncryptionKey")
      private final @Nullable Output<CustomerEncryptionKeyArgs> sourceImageEncryptionKey;

    public Output<CustomerEncryptionKeyArgs> getSourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey == null ? Output.empty() : this.sourceImageEncryptionKey;
    }

    /**
     * The source instant snapshot used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /instantSnapshots/instantSnapshot - projects/project/zones/zone/instantSnapshots/instantSnapshot - zones/zone/instantSnapshots/instantSnapshot
     * 
     */
    @Import(name="sourceInstantSnapshot")
      private final @Nullable Output<String> sourceInstantSnapshot;

    public Output<String> getSourceInstantSnapshot() {
        return this.sourceInstantSnapshot == null ? Output.empty() : this.sourceInstantSnapshot;
    }

    /**
     * The source snapshot used to create this disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project /global/snapshots/snapshot - projects/project/global/snapshots/snapshot - global/snapshots/snapshot
     * 
     */
    @Import(name="sourceSnapshot")
      private final @Nullable Output<String> sourceSnapshot;

    public Output<String> getSourceSnapshot() {
        return this.sourceSnapshot == null ? Output.empty() : this.sourceSnapshot;
    }

    /**
     * The customer-supplied encryption key of the source snapshot. Required if the source snapshot is protected by a customer-supplied encryption key.
     * 
     */
    @Import(name="sourceSnapshotEncryptionKey")
      private final @Nullable Output<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey;

    public Output<CustomerEncryptionKeyArgs> getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey == null ? Output.empty() : this.sourceSnapshotEncryptionKey;
    }

    /**
     * The full Google Cloud Storage URI where the disk image is stored. This file must be a gzip-compressed tarball whose name ends in .tar.gz or virtual machine disk whose name ends in vmdk. Valid URIs may start with gs:// or https://storage.googleapis.com/. This flag is not optimized for creating multiple disks from a source storage object. To create many disks from a source storage object, use gcloud compute images import instead.
     * 
     */
    @Import(name="sourceStorageObject")
      private final @Nullable Output<String> sourceStorageObject;

    public Output<String> getSourceStorageObject() {
        return this.sourceStorageObject == null ? Output.empty() : this.sourceStorageObject;
    }

    /**
     * URL of the disk type resource describing which disk type to use to create the disk. Provide this when creating the disk. For example: projects/project /zones/zone/diskTypes/pd-ssd . See Persistent disk types.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * A list of publicly visible user-licenses. Unlike regular licenses, user provided licenses can be modified after the disk is created. This includes a list of URLs to the license resource. For example, to provide a debian license: https://www.googleapis.com/compute/v1/projects/debian-cloud/global/licenses/debian-9-stretch
     * 
     */
    @Import(name="userLicenses")
      private final @Nullable Output<List<String>> userLicenses;

    public Output<List<String>> getUserLicenses() {
        return this.userLicenses == null ? Output.empty() : this.userLicenses;
    }

    public RegionDiskArgs(
        @Nullable Output<RegionDiskArchitecture> architecture,
        @Nullable Output<String> description,
        @Nullable Output<CustomerEncryptionKeyArgs> diskEncryptionKey,
        @Nullable Output<Boolean> eraseWindowsVssSignature,
        @Nullable Output<List<GuestOsFeatureArgs>> guestOsFeatures,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<List<String>> licenseCodes,
        @Nullable Output<List<String>> licenses,
        @Nullable Output<String> locationHint,
        @Nullable Output<Boolean> multiWriter,
        @Nullable Output<String> name,
        @Nullable Output<String> options,
        @Nullable Output<String> physicalBlockSizeBytes,
        @Nullable Output<String> project,
        @Nullable Output<String> provisionedIops,
        Output<String> region,
        @Nullable Output<List<String>> replicaZones,
        @Nullable Output<String> requestId,
        @Nullable Output<List<String>> resourcePolicies,
        @Nullable Output<String> sizeGb,
        @Nullable Output<String> sourceDisk,
        @Nullable Output<String> sourceImage,
        @Nullable Output<CustomerEncryptionKeyArgs> sourceImageEncryptionKey,
        @Nullable Output<String> sourceInstantSnapshot,
        @Nullable Output<String> sourceSnapshot,
        @Nullable Output<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey,
        @Nullable Output<String> sourceStorageObject,
        @Nullable Output<String> type,
        @Nullable Output<List<String>> userLicenses) {
        this.architecture = architecture;
        this.description = description;
        this.diskEncryptionKey = diskEncryptionKey;
        this.eraseWindowsVssSignature = eraseWindowsVssSignature;
        this.guestOsFeatures = guestOsFeatures;
        this.labels = labels;
        this.licenseCodes = licenseCodes;
        this.licenses = licenses;
        this.locationHint = locationHint;
        this.multiWriter = multiWriter;
        this.name = name;
        this.options = options;
        this.physicalBlockSizeBytes = physicalBlockSizeBytes;
        this.project = project;
        this.provisionedIops = provisionedIops;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.replicaZones = replicaZones;
        this.requestId = requestId;
        this.resourcePolicies = resourcePolicies;
        this.sizeGb = sizeGb;
        this.sourceDisk = sourceDisk;
        this.sourceImage = sourceImage;
        this.sourceImageEncryptionKey = sourceImageEncryptionKey;
        this.sourceInstantSnapshot = sourceInstantSnapshot;
        this.sourceSnapshot = sourceSnapshot;
        this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
        this.sourceStorageObject = sourceStorageObject;
        this.type = type;
        this.userLicenses = userLicenses;
    }

    private RegionDiskArgs() {
        this.architecture = Output.empty();
        this.description = Output.empty();
        this.diskEncryptionKey = Output.empty();
        this.eraseWindowsVssSignature = Output.empty();
        this.guestOsFeatures = Output.empty();
        this.labels = Output.empty();
        this.licenseCodes = Output.empty();
        this.licenses = Output.empty();
        this.locationHint = Output.empty();
        this.multiWriter = Output.empty();
        this.name = Output.empty();
        this.options = Output.empty();
        this.physicalBlockSizeBytes = Output.empty();
        this.project = Output.empty();
        this.provisionedIops = Output.empty();
        this.region = Output.empty();
        this.replicaZones = Output.empty();
        this.requestId = Output.empty();
        this.resourcePolicies = Output.empty();
        this.sizeGb = Output.empty();
        this.sourceDisk = Output.empty();
        this.sourceImage = Output.empty();
        this.sourceImageEncryptionKey = Output.empty();
        this.sourceInstantSnapshot = Output.empty();
        this.sourceSnapshot = Output.empty();
        this.sourceSnapshotEncryptionKey = Output.empty();
        this.sourceStorageObject = Output.empty();
        this.type = Output.empty();
        this.userLicenses = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegionDiskArchitecture> architecture;
        private @Nullable Output<String> description;
        private @Nullable Output<CustomerEncryptionKeyArgs> diskEncryptionKey;
        private @Nullable Output<Boolean> eraseWindowsVssSignature;
        private @Nullable Output<List<GuestOsFeatureArgs>> guestOsFeatures;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<List<String>> licenseCodes;
        private @Nullable Output<List<String>> licenses;
        private @Nullable Output<String> locationHint;
        private @Nullable Output<Boolean> multiWriter;
        private @Nullable Output<String> name;
        private @Nullable Output<String> options;
        private @Nullable Output<String> physicalBlockSizeBytes;
        private @Nullable Output<String> project;
        private @Nullable Output<String> provisionedIops;
        private Output<String> region;
        private @Nullable Output<List<String>> replicaZones;
        private @Nullable Output<String> requestId;
        private @Nullable Output<List<String>> resourcePolicies;
        private @Nullable Output<String> sizeGb;
        private @Nullable Output<String> sourceDisk;
        private @Nullable Output<String> sourceImage;
        private @Nullable Output<CustomerEncryptionKeyArgs> sourceImageEncryptionKey;
        private @Nullable Output<String> sourceInstantSnapshot;
        private @Nullable Output<String> sourceSnapshot;
        private @Nullable Output<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey;
        private @Nullable Output<String> sourceStorageObject;
        private @Nullable Output<String> type;
        private @Nullable Output<List<String>> userLicenses;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.description = defaults.description;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.eraseWindowsVssSignature = defaults.eraseWindowsVssSignature;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.labels = defaults.labels;
    	      this.licenseCodes = defaults.licenseCodes;
    	      this.licenses = defaults.licenses;
    	      this.locationHint = defaults.locationHint;
    	      this.multiWriter = defaults.multiWriter;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.physicalBlockSizeBytes = defaults.physicalBlockSizeBytes;
    	      this.project = defaults.project;
    	      this.provisionedIops = defaults.provisionedIops;
    	      this.region = defaults.region;
    	      this.replicaZones = defaults.replicaZones;
    	      this.requestId = defaults.requestId;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.sizeGb = defaults.sizeGb;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.sourceImage = defaults.sourceImage;
    	      this.sourceImageEncryptionKey = defaults.sourceImageEncryptionKey;
    	      this.sourceInstantSnapshot = defaults.sourceInstantSnapshot;
    	      this.sourceSnapshot = defaults.sourceSnapshot;
    	      this.sourceSnapshotEncryptionKey = defaults.sourceSnapshotEncryptionKey;
    	      this.sourceStorageObject = defaults.sourceStorageObject;
    	      this.type = defaults.type;
    	      this.userLicenses = defaults.userLicenses;
        }

        public Builder architecture(@Nullable Output<RegionDiskArchitecture> architecture) {
            this.architecture = architecture;
            return this;
        }

        public Builder architecture(@Nullable RegionDiskArchitecture architecture) {
            this.architecture = Output.ofNullable(architecture);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder diskEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        public Builder diskEncryptionKey(@Nullable CustomerEncryptionKeyArgs diskEncryptionKey) {
            this.diskEncryptionKey = Output.ofNullable(diskEncryptionKey);
            return this;
        }

        public Builder eraseWindowsVssSignature(@Nullable Output<Boolean> eraseWindowsVssSignature) {
            this.eraseWindowsVssSignature = eraseWindowsVssSignature;
            return this;
        }

        public Builder eraseWindowsVssSignature(@Nullable Boolean eraseWindowsVssSignature) {
            this.eraseWindowsVssSignature = Output.ofNullable(eraseWindowsVssSignature);
            return this;
        }

        public Builder guestOsFeatures(@Nullable Output<List<GuestOsFeatureArgs>> guestOsFeatures) {
            this.guestOsFeatures = guestOsFeatures;
            return this;
        }

        public Builder guestOsFeatures(@Nullable List<GuestOsFeatureArgs> guestOsFeatures) {
            this.guestOsFeatures = Output.ofNullable(guestOsFeatures);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder licenseCodes(@Nullable Output<List<String>> licenseCodes) {
            this.licenseCodes = licenseCodes;
            return this;
        }

        public Builder licenseCodes(@Nullable List<String> licenseCodes) {
            this.licenseCodes = Output.ofNullable(licenseCodes);
            return this;
        }

        public Builder licenses(@Nullable Output<List<String>> licenses) {
            this.licenses = licenses;
            return this;
        }

        public Builder licenses(@Nullable List<String> licenses) {
            this.licenses = Output.ofNullable(licenses);
            return this;
        }

        public Builder locationHint(@Nullable Output<String> locationHint) {
            this.locationHint = locationHint;
            return this;
        }

        public Builder locationHint(@Nullable String locationHint) {
            this.locationHint = Output.ofNullable(locationHint);
            return this;
        }

        public Builder multiWriter(@Nullable Output<Boolean> multiWriter) {
            this.multiWriter = multiWriter;
            return this;
        }

        public Builder multiWriter(@Nullable Boolean multiWriter) {
            this.multiWriter = Output.ofNullable(multiWriter);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder options(@Nullable Output<String> options) {
            this.options = options;
            return this;
        }

        public Builder options(@Nullable String options) {
            this.options = Output.ofNullable(options);
            return this;
        }

        public Builder physicalBlockSizeBytes(@Nullable Output<String> physicalBlockSizeBytes) {
            this.physicalBlockSizeBytes = physicalBlockSizeBytes;
            return this;
        }

        public Builder physicalBlockSizeBytes(@Nullable String physicalBlockSizeBytes) {
            this.physicalBlockSizeBytes = Output.ofNullable(physicalBlockSizeBytes);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder provisionedIops(@Nullable Output<String> provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }

        public Builder provisionedIops(@Nullable String provisionedIops) {
            this.provisionedIops = Output.ofNullable(provisionedIops);
            return this;
        }

        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }

        public Builder replicaZones(@Nullable Output<List<String>> replicaZones) {
            this.replicaZones = replicaZones;
            return this;
        }

        public Builder replicaZones(@Nullable List<String> replicaZones) {
            this.replicaZones = Output.ofNullable(replicaZones);
            return this;
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }

        public Builder resourcePolicies(@Nullable Output<List<String>> resourcePolicies) {
            this.resourcePolicies = resourcePolicies;
            return this;
        }

        public Builder resourcePolicies(@Nullable List<String> resourcePolicies) {
            this.resourcePolicies = Output.ofNullable(resourcePolicies);
            return this;
        }

        public Builder sizeGb(@Nullable Output<String> sizeGb) {
            this.sizeGb = sizeGb;
            return this;
        }

        public Builder sizeGb(@Nullable String sizeGb) {
            this.sizeGb = Output.ofNullable(sizeGb);
            return this;
        }

        public Builder sourceDisk(@Nullable Output<String> sourceDisk) {
            this.sourceDisk = sourceDisk;
            return this;
        }

        public Builder sourceDisk(@Nullable String sourceDisk) {
            this.sourceDisk = Output.ofNullable(sourceDisk);
            return this;
        }

        public Builder sourceImage(@Nullable Output<String> sourceImage) {
            this.sourceImage = sourceImage;
            return this;
        }

        public Builder sourceImage(@Nullable String sourceImage) {
            this.sourceImage = Output.ofNullable(sourceImage);
            return this;
        }

        public Builder sourceImageEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = sourceImageEncryptionKey;
            return this;
        }

        public Builder sourceImageEncryptionKey(@Nullable CustomerEncryptionKeyArgs sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = Output.ofNullable(sourceImageEncryptionKey);
            return this;
        }

        public Builder sourceInstantSnapshot(@Nullable Output<String> sourceInstantSnapshot) {
            this.sourceInstantSnapshot = sourceInstantSnapshot;
            return this;
        }

        public Builder sourceInstantSnapshot(@Nullable String sourceInstantSnapshot) {
            this.sourceInstantSnapshot = Output.ofNullable(sourceInstantSnapshot);
            return this;
        }

        public Builder sourceSnapshot(@Nullable Output<String> sourceSnapshot) {
            this.sourceSnapshot = sourceSnapshot;
            return this;
        }

        public Builder sourceSnapshot(@Nullable String sourceSnapshot) {
            this.sourceSnapshot = Output.ofNullable(sourceSnapshot);
            return this;
        }

        public Builder sourceSnapshotEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
            return this;
        }

        public Builder sourceSnapshotEncryptionKey(@Nullable CustomerEncryptionKeyArgs sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = Output.ofNullable(sourceSnapshotEncryptionKey);
            return this;
        }

        public Builder sourceStorageObject(@Nullable Output<String> sourceStorageObject) {
            this.sourceStorageObject = sourceStorageObject;
            return this;
        }

        public Builder sourceStorageObject(@Nullable String sourceStorageObject) {
            this.sourceStorageObject = Output.ofNullable(sourceStorageObject);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }

        public Builder userLicenses(@Nullable Output<List<String>> userLicenses) {
            this.userLicenses = userLicenses;
            return this;
        }

        public Builder userLicenses(@Nullable List<String> userLicenses) {
            this.userLicenses = Output.ofNullable(userLicenses);
            return this;
        }
        public RegionDiskArgs build() {
            return new RegionDiskArgs(architecture, description, diskEncryptionKey, eraseWindowsVssSignature, guestOsFeatures, labels, licenseCodes, licenses, locationHint, multiWriter, name, options, physicalBlockSizeBytes, project, provisionedIops, region, replicaZones, requestId, resourcePolicies, sizeGb, sourceDisk, sourceImage, sourceImageEncryptionKey, sourceInstantSnapshot, sourceSnapshot, sourceSnapshotEncryptionKey, sourceStorageObject, type, userLicenses);
        }
    }
}
