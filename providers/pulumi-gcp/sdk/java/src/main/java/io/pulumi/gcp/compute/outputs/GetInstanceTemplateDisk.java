// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetInstanceTemplateDiskDiskEncryptionKey;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetInstanceTemplateDisk {
    /**
     * Whether or not the disk should be auto-deleted.
     * This defaults to true.
     * 
     */
    private final Boolean autoDelete;
    /**
     * Indicates that this is a boot disk.
     * 
     */
    private final Boolean boot;
    /**
     * A unique device name that is reflected into the
     * /dev/  tree of a Linux operating system running within the instance. If not
     * specified, the server chooses a default device name to apply to this disk.
     * 
     */
    private final String deviceName;
    /**
     * Encrypts or decrypts a disk using a customer-supplied encryption key.
     * 
     */
    private final List<GetInstanceTemplateDiskDiskEncryptionKey> diskEncryptionKeys;
    /**
     * Name of the disk. When not provided, this defaults
     * to the name of the instance.
     * 
     */
    private final String diskName;
    /**
     * The size of the image in gigabytes. If not
     * specified, it will inherit the size of its base image. For SCRATCH disks,
     * the size must be exactly 375GB.
     * 
     */
    private final Integer diskSizeGb;
    /**
     * The GCE disk type. Can be either `"pd-ssd"`,
     * `"local-ssd"`, `"pd-balanced"` or `"pd-standard"`.
     * 
     */
    private final String diskType;
    /**
     * Specifies the disk interface to use for attaching this disk,
     * which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI
     * and the request will fail if you attempt to attach a persistent disk in any other format
     * than SCSI. Local SSDs can use either NVME or SCSI.
     * 
     */
    private final String $interface;
    /**
     * (Optional) A set of ket/value label pairs to assign to disk created from
     * this template
     * 
     */
    private final Map<String,String> labels;
    /**
     * The mode in which to attach this disk, either READ_WRITE
     * or READ_ONLY. If you are attaching or creating a boot disk, this must
     * read-write mode.
     * 
     */
    private final String mode;
    private final List<String> resourcePolicies;
    /**
     * The name (**not self_link**)
     * of the disk (such as those managed by `gcp.compute.Disk`) to attach.
     * > **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    private final String source;
    /**
     * The image from which to
     * initialize this disk. This can be one of: the image's `self_link`,
     * `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`.
     * > **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    private final String sourceImage;
    /**
     * The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"autoDelete","boot","deviceName","diskEncryptionKeys","diskName","diskSizeGb","diskType","$interface","labels","mode","resourcePolicies","source","sourceImage","type"})
    private GetInstanceTemplateDisk(
        Boolean autoDelete,
        Boolean boot,
        String deviceName,
        List<GetInstanceTemplateDiskDiskEncryptionKey> diskEncryptionKeys,
        String diskName,
        Integer diskSizeGb,
        String diskType,
        String $interface,
        Map<String,String> labels,
        String mode,
        List<String> resourcePolicies,
        String source,
        String sourceImage,
        String type) {
        this.autoDelete = Objects.requireNonNull(autoDelete);
        this.boot = Objects.requireNonNull(boot);
        this.deviceName = Objects.requireNonNull(deviceName);
        this.diskEncryptionKeys = Objects.requireNonNull(diskEncryptionKeys);
        this.diskName = Objects.requireNonNull(diskName);
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
        this.diskType = Objects.requireNonNull(diskType);
        this.$interface = Objects.requireNonNull($interface);
        this.labels = Objects.requireNonNull(labels);
        this.mode = Objects.requireNonNull(mode);
        this.resourcePolicies = Objects.requireNonNull(resourcePolicies);
        this.source = Objects.requireNonNull(source);
        this.sourceImage = Objects.requireNonNull(sourceImage);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Whether or not the disk should be auto-deleted.
     * This defaults to true.
     * 
     */
    public Boolean getAutoDelete() {
        return this.autoDelete;
    }
    /**
     * Indicates that this is a boot disk.
     * 
     */
    public Boolean getBoot() {
        return this.boot;
    }
    /**
     * A unique device name that is reflected into the
     * /dev/  tree of a Linux operating system running within the instance. If not
     * specified, the server chooses a default device name to apply to this disk.
     * 
     */
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Encrypts or decrypts a disk using a customer-supplied encryption key.
     * 
     */
    public List<GetInstanceTemplateDiskDiskEncryptionKey> getDiskEncryptionKeys() {
        return this.diskEncryptionKeys;
    }
    /**
     * Name of the disk. When not provided, this defaults
     * to the name of the instance.
     * 
     */
    public String getDiskName() {
        return this.diskName;
    }
    /**
     * The size of the image in gigabytes. If not
     * specified, it will inherit the size of its base image. For SCRATCH disks,
     * the size must be exactly 375GB.
     * 
     */
    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * The GCE disk type. Can be either `"pd-ssd"`,
     * `"local-ssd"`, `"pd-balanced"` or `"pd-standard"`.
     * 
     */
    public String getDiskType() {
        return this.diskType;
    }
    /**
     * Specifies the disk interface to use for attaching this disk,
     * which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI
     * and the request will fail if you attempt to attach a persistent disk in any other format
     * than SCSI. Local SSDs can use either NVME or SCSI.
     * 
     */
    public String get$interface() {
        return this.$interface;
    }
    /**
     * (Optional) A set of ket/value label pairs to assign to disk created from
     * this template
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The mode in which to attach this disk, either READ_WRITE
     * or READ_ONLY. If you are attaching or creating a boot disk, this must
     * read-write mode.
     * 
     */
    public String getMode() {
        return this.mode;
    }
    public List<String> getResourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * The name (**not self_link**)
     * of the disk (such as those managed by `gcp.compute.Disk`) to attach.
     * > **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    public String getSource() {
        return this.source;
    }
    /**
     * The image from which to
     * initialize this disk. This can be one of: the image's `self_link`,
     * `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`.
     * > **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    public String getSourceImage() {
        return this.sourceImage;
    }
    /**
     * The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private Boolean boot;
        private String deviceName;
        private List<GetInstanceTemplateDiskDiskEncryptionKey> diskEncryptionKeys;
        private String diskName;
        private Integer diskSizeGb;
        private String diskType;
        private String $interface;
        private Map<String,String> labels;
        private String mode;
        private List<String> resourcePolicies;
        private String source;
        private String sourceImage;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKeys = defaults.diskEncryptionKeys;
    	      this.diskName = defaults.diskName;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.$interface = defaults.$interface;
    	      this.labels = defaults.labels;
    	      this.mode = defaults.mode;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.source = defaults.source;
    	      this.sourceImage = defaults.sourceImage;
    	      this.type = defaults.type;
        }

        public Builder setAutoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }

        public Builder setBoot(Boolean boot) {
            this.boot = Objects.requireNonNull(boot);
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setDiskEncryptionKeys(List<GetInstanceTemplateDiskDiskEncryptionKey> diskEncryptionKeys) {
            this.diskEncryptionKeys = Objects.requireNonNull(diskEncryptionKeys);
            return this;
        }

        public Builder setDiskName(String diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }

        public Builder setDiskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setDiskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder set$interface(String $interface) {
            this.$interface = Objects.requireNonNull($interface);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setResourcePolicies(List<String> resourcePolicies) {
            this.resourcePolicies = Objects.requireNonNull(resourcePolicies);
            return this;
        }

        public Builder setSource(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSourceImage(String sourceImage) {
            this.sourceImage = Objects.requireNonNull(sourceImage);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetInstanceTemplateDisk build() {
            return new GetInstanceTemplateDisk(autoDelete, boot, deviceName, diskEncryptionKeys, diskName, diskSizeGb, diskType, $interface, labels, mode, resourcePolicies, source, sourceImage, type);
        }
    }
}
