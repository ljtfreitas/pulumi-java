// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.notebooks_v1.outputs.LocalDiskInitializeParamsResponse;
import io.pulumi.googlenative.notebooks_v1.outputs.RuntimeGuestOsFeatureResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LocalDiskResponse {
    /**
     * Optional. Output only. Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    private final Boolean autoDelete;
    /**
     * Optional. Output only. Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    private final Boolean boot;
    /**
     * Optional. Output only. Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
     * 
     */
    private final String deviceName;
    /**
     * Indicates a list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    private final List<RuntimeGuestOsFeatureResponse> guestOsFeatures;
    /**
     * A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number.
     * 
     */
    private final Integer index;
    /**
     * Input only. Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
     * 
     */
    private final LocalDiskInitializeParamsResponse initializeParams;
    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance. Valid values: * NVME * SCSI
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
     * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode. Valid values: * READ_ONLY * READ_WRITE
     * 
     */
    private final String mode;
    /**
     * Specifies a valid partial or full URL to an existing Persistent Disk resource.
     * 
     */
    private final String source;
    /**
     * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT. Valid values: * PERSISTENT * SCRATCH
     * 
     */
    private final String type;

    @CustomType.Constructor
    private LocalDiskResponse(
        @CustomType.Parameter("autoDelete") Boolean autoDelete,
        @CustomType.Parameter("boot") Boolean boot,
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("guestOsFeatures") List<RuntimeGuestOsFeatureResponse> guestOsFeatures,
        @CustomType.Parameter("index") Integer index,
        @CustomType.Parameter("initializeParams") LocalDiskInitializeParamsResponse initializeParams,
        @CustomType.Parameter("interface") String $interface,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("licenses") List<String> licenses,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("type") String type) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.guestOsFeatures = guestOsFeatures;
        this.index = index;
        this.initializeParams = initializeParams;
        this.$interface = $interface;
        this.kind = kind;
        this.licenses = licenses;
        this.mode = mode;
        this.source = source;
        this.type = type;
    }

    /**
     * Optional. Output only. Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
    */
    public Boolean getAutoDelete() {
        return this.autoDelete;
    }
    /**
     * Optional. Output only. Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
    */
    public Boolean getBoot() {
        return this.boot;
    }
    /**
     * Optional. Output only. Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
     * 
    */
    public String getDeviceName() {
        return this.deviceName;
    }
    /**
     * Indicates a list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
    */
    public List<RuntimeGuestOsFeatureResponse> getGuestOsFeatures() {
        return this.guestOsFeatures;
    }
    /**
     * A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number.
     * 
    */
    public Integer getIndex() {
        return this.index;
    }
    /**
     * Input only. Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
     * 
    */
    public LocalDiskInitializeParamsResponse getInitializeParams() {
        return this.initializeParams;
    }
    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance. Valid values: * NVME * SCSI
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
     * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode. Valid values: * READ_ONLY * READ_WRITE
     * 
    */
    public String getMode() {
        return this.mode;
    }
    /**
     * Specifies a valid partial or full URL to an existing Persistent Disk resource.
     * 
    */
    public String getSource() {
        return this.source;
    }
    /**
     * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT. Valid values: * PERSISTENT * SCRATCH
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private Boolean boot;
        private String deviceName;
        private List<RuntimeGuestOsFeatureResponse> guestOsFeatures;
        private Integer index;
        private LocalDiskInitializeParamsResponse initializeParams;
        private String $interface;
        private String kind;
        private List<String> licenses;
        private String mode;
        private String source;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.index = defaults.index;
    	      this.initializeParams = defaults.initializeParams;
    	      this.$interface = defaults.$interface;
    	      this.kind = defaults.kind;
    	      this.licenses = defaults.licenses;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
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

        public Builder guestOsFeatures(List<RuntimeGuestOsFeatureResponse> guestOsFeatures) {
            this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
            return this;
        }

        public Builder index(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }

        public Builder initializeParams(LocalDiskInitializeParamsResponse initializeParams) {
            this.initializeParams = Objects.requireNonNull(initializeParams);
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

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public LocalDiskResponse build() {
            return new LocalDiskResponse(autoDelete, boot, deviceName, guestOsFeatures, index, initializeParams, $interface, kind, licenses, mode, source, type);
        }
    }
}
