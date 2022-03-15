// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.AmiEbsBlockDeviceGetArgs;
import io.pulumi.aws.ec2.inputs.AmiEphemeralBlockDeviceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AmiState extends io.pulumi.resources.ResourceArgs {

    public static final AmiState Empty = new AmiState();

    /**
     * Machine architecture for created instances. Defaults to "x86_64".
     * 
     */
    @Import(name="architecture")
      private final @Nullable Output<String> architecture;

    public Output<String> getArchitecture() {
        return this.architecture == null ? Output.empty() : this.architecture;
    }

    /**
     * The ARN of the AMI.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * A longer, human-readable description for the AMI.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Nested block describing an EBS block device that should be
     * attached to created instances. The structure of this block is described below.
     * 
     */
    @Import(name="ebsBlockDevices")
      private final @Nullable Output<List<AmiEbsBlockDeviceGetArgs>> ebsBlockDevices;

    public Output<List<AmiEbsBlockDeviceGetArgs>> getEbsBlockDevices() {
        return this.ebsBlockDevices == null ? Output.empty() : this.ebsBlockDevices;
    }

    /**
     * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
     * 
     */
    @Import(name="enaSupport")
      private final @Nullable Output<Boolean> enaSupport;

    public Output<Boolean> getEnaSupport() {
        return this.enaSupport == null ? Output.empty() : this.enaSupport;
    }

    /**
     * Nested block describing an ephemeral block device that
     * should be attached to created instances. The structure of this block is described below.
     * 
     */
    @Import(name="ephemeralBlockDevices")
      private final @Nullable Output<List<AmiEphemeralBlockDeviceGetArgs>> ephemeralBlockDevices;

    public Output<List<AmiEphemeralBlockDeviceGetArgs>> getEphemeralBlockDevices() {
        return this.ephemeralBlockDevices == null ? Output.empty() : this.ephemeralBlockDevices;
    }

    /**
     * The hypervisor type of the image.
     * 
     */
    @Import(name="hypervisor")
      private final @Nullable Output<String> hypervisor;

    public Output<String> getHypervisor() {
        return this.hypervisor == null ? Output.empty() : this.hypervisor;
    }

    /**
     * Path to an S3 object containing an image manifest, e.g., created
     * by the `ec2-upload-bundle` command in the EC2 command line tools.
     * 
     */
    @Import(name="imageLocation")
      private final @Nullable Output<String> imageLocation;

    public Output<String> getImageLocation() {
        return this.imageLocation == null ? Output.empty() : this.imageLocation;
    }

    /**
     * The AWS account alias (for example, amazon, self) or the AWS account ID of the AMI owner.
     * 
     */
    @Import(name="imageOwnerAlias")
      private final @Nullable Output<String> imageOwnerAlias;

    public Output<String> getImageOwnerAlias() {
        return this.imageOwnerAlias == null ? Output.empty() : this.imageOwnerAlias;
    }

    /**
     * The type of image.
     * 
     */
    @Import(name="imageType")
      private final @Nullable Output<String> imageType;

    public Output<String> getImageType() {
        return this.imageType == null ? Output.empty() : this.imageType;
    }

    /**
     * The id of the kernel image (AKI) that will be used as the paravirtual
     * kernel in created instances.
     * 
     */
    @Import(name="kernelId")
      private final @Nullable Output<String> kernelId;

    public Output<String> getKernelId() {
        return this.kernelId == null ? Output.empty() : this.kernelId;
    }

    @Import(name="manageEbsSnapshots")
      private final @Nullable Output<Boolean> manageEbsSnapshots;

    public Output<Boolean> getManageEbsSnapshots() {
        return this.manageEbsSnapshots == null ? Output.empty() : this.manageEbsSnapshots;
    }

    /**
     * A region-unique name for the AMI.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The AWS account ID of the image owner.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> getOwnerId() {
        return this.ownerId == null ? Output.empty() : this.ownerId;
    }

    /**
     * This value is set to windows for Windows AMIs; otherwise, it is blank.
     * 
     */
    @Import(name="platform")
      private final @Nullable Output<String> platform;

    public Output<String> getPlatform() {
        return this.platform == null ? Output.empty() : this.platform;
    }

    /**
     * The platform details associated with the billing code of the AMI.
     * 
     */
    @Import(name="platformDetails")
      private final @Nullable Output<String> platformDetails;

    public Output<String> getPlatformDetails() {
        return this.platformDetails == null ? Output.empty() : this.platformDetails;
    }

    /**
     * Indicates whether the image has public launch permissions.
     * 
     */
    @Import(name="public")
      private final @Nullable Output<Boolean> $public;

    public Output<Boolean> get$public() {
        return this.$public == null ? Output.empty() : this.$public;
    }

    /**
     * The id of an initrd image (ARI) that will be used when booting the
     * created instances.
     * 
     */
    @Import(name="ramdiskId")
      private final @Nullable Output<String> ramdiskId;

    public Output<String> getRamdiskId() {
        return this.ramdiskId == null ? Output.empty() : this.ramdiskId;
    }

    /**
     * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
     * 
     */
    @Import(name="rootDeviceName")
      private final @Nullable Output<String> rootDeviceName;

    public Output<String> getRootDeviceName() {
        return this.rootDeviceName == null ? Output.empty() : this.rootDeviceName;
    }

    /**
     * The Snapshot ID for the root volume (for EBS-backed AMIs)
     * 
     */
    @Import(name="rootSnapshotId")
      private final @Nullable Output<String> rootSnapshotId;

    public Output<String> getRootSnapshotId() {
        return this.rootSnapshotId == null ? Output.empty() : this.rootSnapshotId;
    }

    /**
     * When set to "simple" (the default), enables enhanced networking
     * for created instances. No other value is supported at this time.
     * 
     */
    @Import(name="sriovNetSupport")
      private final @Nullable Output<String> sriovNetSupport;

    public Output<String> getSriovNetSupport() {
        return this.sriovNetSupport == null ? Output.empty() : this.sriovNetSupport;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * The operation of the Amazon EC2 instance and the billing code that is associated with the AMI.
     * 
     */
    @Import(name="usageOperation")
      private final @Nullable Output<String> usageOperation;

    public Output<String> getUsageOperation() {
        return this.usageOperation == null ? Output.empty() : this.usageOperation;
    }

    /**
     * Keyword to choose what virtualization mode created instances
     * will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
     * changes the set of further arguments that are required, as described below.
     * 
     */
    @Import(name="virtualizationType")
      private final @Nullable Output<String> virtualizationType;

    public Output<String> getVirtualizationType() {
        return this.virtualizationType == null ? Output.empty() : this.virtualizationType;
    }

    public AmiState(
        @Nullable Output<String> architecture,
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<List<AmiEbsBlockDeviceGetArgs>> ebsBlockDevices,
        @Nullable Output<Boolean> enaSupport,
        @Nullable Output<List<AmiEphemeralBlockDeviceGetArgs>> ephemeralBlockDevices,
        @Nullable Output<String> hypervisor,
        @Nullable Output<String> imageLocation,
        @Nullable Output<String> imageOwnerAlias,
        @Nullable Output<String> imageType,
        @Nullable Output<String> kernelId,
        @Nullable Output<Boolean> manageEbsSnapshots,
        @Nullable Output<String> name,
        @Nullable Output<String> ownerId,
        @Nullable Output<String> platform,
        @Nullable Output<String> platformDetails,
        @Nullable Output<Boolean> $public,
        @Nullable Output<String> ramdiskId,
        @Nullable Output<String> rootDeviceName,
        @Nullable Output<String> rootSnapshotId,
        @Nullable Output<String> sriovNetSupport,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> usageOperation,
        @Nullable Output<String> virtualizationType) {
        this.architecture = architecture;
        this.arn = arn;
        this.description = description;
        this.ebsBlockDevices = ebsBlockDevices;
        this.enaSupport = enaSupport;
        this.ephemeralBlockDevices = ephemeralBlockDevices;
        this.hypervisor = hypervisor;
        this.imageLocation = imageLocation;
        this.imageOwnerAlias = imageOwnerAlias;
        this.imageType = imageType;
        this.kernelId = kernelId;
        this.manageEbsSnapshots = manageEbsSnapshots;
        this.name = name;
        this.ownerId = ownerId;
        this.platform = platform;
        this.platformDetails = platformDetails;
        this.$public = $public;
        this.ramdiskId = ramdiskId;
        this.rootDeviceName = rootDeviceName;
        this.rootSnapshotId = rootSnapshotId;
        this.sriovNetSupport = sriovNetSupport;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.usageOperation = usageOperation;
        this.virtualizationType = virtualizationType;
    }

    private AmiState() {
        this.architecture = Output.empty();
        this.arn = Output.empty();
        this.description = Output.empty();
        this.ebsBlockDevices = Output.empty();
        this.enaSupport = Output.empty();
        this.ephemeralBlockDevices = Output.empty();
        this.hypervisor = Output.empty();
        this.imageLocation = Output.empty();
        this.imageOwnerAlias = Output.empty();
        this.imageType = Output.empty();
        this.kernelId = Output.empty();
        this.manageEbsSnapshots = Output.empty();
        this.name = Output.empty();
        this.ownerId = Output.empty();
        this.platform = Output.empty();
        this.platformDetails = Output.empty();
        this.$public = Output.empty();
        this.ramdiskId = Output.empty();
        this.rootDeviceName = Output.empty();
        this.rootSnapshotId = Output.empty();
        this.sriovNetSupport = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.usageOperation = Output.empty();
        this.virtualizationType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> architecture;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<List<AmiEbsBlockDeviceGetArgs>> ebsBlockDevices;
        private @Nullable Output<Boolean> enaSupport;
        private @Nullable Output<List<AmiEphemeralBlockDeviceGetArgs>> ephemeralBlockDevices;
        private @Nullable Output<String> hypervisor;
        private @Nullable Output<String> imageLocation;
        private @Nullable Output<String> imageOwnerAlias;
        private @Nullable Output<String> imageType;
        private @Nullable Output<String> kernelId;
        private @Nullable Output<Boolean> manageEbsSnapshots;
        private @Nullable Output<String> name;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<String> platform;
        private @Nullable Output<String> platformDetails;
        private @Nullable Output<Boolean> $public;
        private @Nullable Output<String> ramdiskId;
        private @Nullable Output<String> rootDeviceName;
        private @Nullable Output<String> rootSnapshotId;
        private @Nullable Output<String> sriovNetSupport;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> usageOperation;
        private @Nullable Output<String> virtualizationType;

        public Builder() {
    	      // Empty
        }

        public Builder(AmiState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.ebsBlockDevices = defaults.ebsBlockDevices;
    	      this.enaSupport = defaults.enaSupport;
    	      this.ephemeralBlockDevices = defaults.ephemeralBlockDevices;
    	      this.hypervisor = defaults.hypervisor;
    	      this.imageLocation = defaults.imageLocation;
    	      this.imageOwnerAlias = defaults.imageOwnerAlias;
    	      this.imageType = defaults.imageType;
    	      this.kernelId = defaults.kernelId;
    	      this.manageEbsSnapshots = defaults.manageEbsSnapshots;
    	      this.name = defaults.name;
    	      this.ownerId = defaults.ownerId;
    	      this.platform = defaults.platform;
    	      this.platformDetails = defaults.platformDetails;
    	      this.$public = defaults.$public;
    	      this.ramdiskId = defaults.ramdiskId;
    	      this.rootDeviceName = defaults.rootDeviceName;
    	      this.rootSnapshotId = defaults.rootSnapshotId;
    	      this.sriovNetSupport = defaults.sriovNetSupport;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.usageOperation = defaults.usageOperation;
    	      this.virtualizationType = defaults.virtualizationType;
        }

        public Builder architecture(@Nullable Output<String> architecture) {
            this.architecture = architecture;
            return this;
        }

        public Builder architecture(@Nullable String architecture) {
            this.architecture = Output.ofNullable(architecture);
            return this;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
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

        public Builder ebsBlockDevices(@Nullable Output<List<AmiEbsBlockDeviceGetArgs>> ebsBlockDevices) {
            this.ebsBlockDevices = ebsBlockDevices;
            return this;
        }

        public Builder ebsBlockDevices(@Nullable List<AmiEbsBlockDeviceGetArgs> ebsBlockDevices) {
            this.ebsBlockDevices = Output.ofNullable(ebsBlockDevices);
            return this;
        }

        public Builder enaSupport(@Nullable Output<Boolean> enaSupport) {
            this.enaSupport = enaSupport;
            return this;
        }

        public Builder enaSupport(@Nullable Boolean enaSupport) {
            this.enaSupport = Output.ofNullable(enaSupport);
            return this;
        }

        public Builder ephemeralBlockDevices(@Nullable Output<List<AmiEphemeralBlockDeviceGetArgs>> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = ephemeralBlockDevices;
            return this;
        }

        public Builder ephemeralBlockDevices(@Nullable List<AmiEphemeralBlockDeviceGetArgs> ephemeralBlockDevices) {
            this.ephemeralBlockDevices = Output.ofNullable(ephemeralBlockDevices);
            return this;
        }

        public Builder hypervisor(@Nullable Output<String> hypervisor) {
            this.hypervisor = hypervisor;
            return this;
        }

        public Builder hypervisor(@Nullable String hypervisor) {
            this.hypervisor = Output.ofNullable(hypervisor);
            return this;
        }

        public Builder imageLocation(@Nullable Output<String> imageLocation) {
            this.imageLocation = imageLocation;
            return this;
        }

        public Builder imageLocation(@Nullable String imageLocation) {
            this.imageLocation = Output.ofNullable(imageLocation);
            return this;
        }

        public Builder imageOwnerAlias(@Nullable Output<String> imageOwnerAlias) {
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        public Builder imageOwnerAlias(@Nullable String imageOwnerAlias) {
            this.imageOwnerAlias = Output.ofNullable(imageOwnerAlias);
            return this;
        }

        public Builder imageType(@Nullable Output<String> imageType) {
            this.imageType = imageType;
            return this;
        }

        public Builder imageType(@Nullable String imageType) {
            this.imageType = Output.ofNullable(imageType);
            return this;
        }

        public Builder kernelId(@Nullable Output<String> kernelId) {
            this.kernelId = kernelId;
            return this;
        }

        public Builder kernelId(@Nullable String kernelId) {
            this.kernelId = Output.ofNullable(kernelId);
            return this;
        }

        public Builder manageEbsSnapshots(@Nullable Output<Boolean> manageEbsSnapshots) {
            this.manageEbsSnapshots = manageEbsSnapshots;
            return this;
        }

        public Builder manageEbsSnapshots(@Nullable Boolean manageEbsSnapshots) {
            this.manageEbsSnapshots = Output.ofNullable(manageEbsSnapshots);
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

        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Output.ofNullable(ownerId);
            return this;
        }

        public Builder platform(@Nullable Output<String> platform) {
            this.platform = platform;
            return this;
        }

        public Builder platform(@Nullable String platform) {
            this.platform = Output.ofNullable(platform);
            return this;
        }

        public Builder platformDetails(@Nullable Output<String> platformDetails) {
            this.platformDetails = platformDetails;
            return this;
        }

        public Builder platformDetails(@Nullable String platformDetails) {
            this.platformDetails = Output.ofNullable(platformDetails);
            return this;
        }

        public Builder $public(@Nullable Output<Boolean> $public) {
            this.$public = $public;
            return this;
        }

        public Builder $public(@Nullable Boolean $public) {
            this.$public = Output.ofNullable($public);
            return this;
        }

        public Builder ramdiskId(@Nullable Output<String> ramdiskId) {
            this.ramdiskId = ramdiskId;
            return this;
        }

        public Builder ramdiskId(@Nullable String ramdiskId) {
            this.ramdiskId = Output.ofNullable(ramdiskId);
            return this;
        }

        public Builder rootDeviceName(@Nullable Output<String> rootDeviceName) {
            this.rootDeviceName = rootDeviceName;
            return this;
        }

        public Builder rootDeviceName(@Nullable String rootDeviceName) {
            this.rootDeviceName = Output.ofNullable(rootDeviceName);
            return this;
        }

        public Builder rootSnapshotId(@Nullable Output<String> rootSnapshotId) {
            this.rootSnapshotId = rootSnapshotId;
            return this;
        }

        public Builder rootSnapshotId(@Nullable String rootSnapshotId) {
            this.rootSnapshotId = Output.ofNullable(rootSnapshotId);
            return this;
        }

        public Builder sriovNetSupport(@Nullable Output<String> sriovNetSupport) {
            this.sriovNetSupport = sriovNetSupport;
            return this;
        }

        public Builder sriovNetSupport(@Nullable String sriovNetSupport) {
            this.sriovNetSupport = Output.ofNullable(sriovNetSupport);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder usageOperation(@Nullable Output<String> usageOperation) {
            this.usageOperation = usageOperation;
            return this;
        }

        public Builder usageOperation(@Nullable String usageOperation) {
            this.usageOperation = Output.ofNullable(usageOperation);
            return this;
        }

        public Builder virtualizationType(@Nullable Output<String> virtualizationType) {
            this.virtualizationType = virtualizationType;
            return this;
        }

        public Builder virtualizationType(@Nullable String virtualizationType) {
            this.virtualizationType = Output.ofNullable(virtualizationType);
            return this;
        }
        public AmiState build() {
            return new AmiState(architecture, arn, description, ebsBlockDevices, enaSupport, ephemeralBlockDevices, hypervisor, imageLocation, imageOwnerAlias, imageType, kernelId, manageEbsSnapshots, name, ownerId, platform, platformDetails, $public, ramdiskId, rootDeviceName, rootSnapshotId, sriovNetSupport, tags, tagsAll, usageOperation, virtualizationType);
        }
    }
}
