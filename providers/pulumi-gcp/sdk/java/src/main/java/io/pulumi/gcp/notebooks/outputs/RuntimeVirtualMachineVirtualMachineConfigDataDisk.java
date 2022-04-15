// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParams;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuntimeVirtualMachineVirtualMachineConfigDataDisk {
    /**
     * - 
     * Optional. Specifies whether the disk will be auto-deleted
     * when the instance is deleted (but not when the disk is
     * detached from the instance).
     * 
     */
    private final @Nullable Boolean autoDelete;
    /**
     * - 
     * Optional. Indicates that this is a boot disk. The virtual
     * machine will use the first partition of the disk for its
     * root filesystem.
     * 
     */
    private final @Nullable Boolean boot;
    /**
     * - 
     * Optional. Specifies a unique device name of your choice
     * that is reflected into the /dev/disk/by-id/google-* tree
     * of a Linux operating system running within the instance.
     * This name can be used to reference the device for mounting,
     * resizing, and so on, from within the instance.
     * If not specified, the server chooses a default device name
     * to apply to this disk, in the form persistent-disk-x, where
     * x is a number assigned by Google Compute Engine. This field
     * is only applicable for persistent disks.
     * 
     */
    private final @Nullable String deviceName;
    /**
     * - 
     * Indicates a list of features to enable on the guest operating
     * system. Applicable only for bootable images. To see a list of
     * available features, read `https://cloud.google.com/compute/docs/
     * images/create-delete-deprecate-private-images#guest-os-features`
     * options. ``
     * 
     */
    private final @Nullable List<String> guestOsFeatures;
    /**
     * - 
     * Output only. A zero-based index to this disk, where 0 is
     * reserved for the boot disk. If you have many disks attached
     * to an instance, each disk would have a unique index number.
     * 
     */
    private final @Nullable Integer index;
    /**
     * Input only. Specifies the parameters for a new disk that will
     * be created alongside the new instance. Use initialization
     * parameters to create boot disks or local SSDs attached to the
     * new instance. This property is mutually exclusive with the
     * source property; you can only define one or the other, but not
     * both.
     * Structure is documented below.
     * 
     */
    private final @Nullable RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParams initializeParams;
    /**
     * "Specifies the disk interface to use for attaching this disk,
     * which is either SCSI or NVME. The default is SCSI. Persistent
     * disks must always use SCSI and the request will fail if you attempt
     * to attach a persistent disk in any other format than SCSI. Local SSDs
     * can use either NVME or SCSI. For performance characteristics of SCSI
     * over NVMe, see Local SSD performance. Valid values: * NVME * SCSI".
     * 
     */
    private final @Nullable String interface_;
    /**
     * - 
     * Type of the resource. Always compute#attachedDisk for attached
     * disks.
     * 
     */
    private final @Nullable String kind;
    /**
     * - 
     * Output only. Any valid publicly visible licenses.
     * 
     */
    private final @Nullable List<String> licenses;
    /**
     * The mode in which to attach this disk, either READ_WRITE
     * or READ_ONLY. If not specified, the default is to attach
     * the disk in READ_WRITE mode.
     * 
     */
    private final @Nullable String mode;
    /**
     * Specifies a valid partial or full URL to an existing
     * Persistent Disk resource.
     * 
     */
    private final @Nullable String source;
    /**
     * Accelerator model. For valid values, see
     * `https://cloud.google.com/vertex-ai/docs/workbench/reference/
     * rest/v1/projects.locations.runtimes#AcceleratorType`
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private RuntimeVirtualMachineVirtualMachineConfigDataDisk(
        @CustomType.Parameter("autoDelete") @Nullable Boolean autoDelete,
        @CustomType.Parameter("boot") @Nullable Boolean boot,
        @CustomType.Parameter("deviceName") @Nullable String deviceName,
        @CustomType.Parameter("guestOsFeatures") @Nullable List<String> guestOsFeatures,
        @CustomType.Parameter("index") @Nullable Integer index,
        @CustomType.Parameter("initializeParams") @Nullable RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParams initializeParams,
        @CustomType.Parameter("interface") @Nullable String interface_,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("licenses") @Nullable List<String> licenses,
        @CustomType.Parameter("mode") @Nullable String mode,
        @CustomType.Parameter("source") @Nullable String source,
        @CustomType.Parameter("type") @Nullable String type) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.guestOsFeatures = guestOsFeatures;
        this.index = index;
        this.initializeParams = initializeParams;
        this.interface_ = interface_;
        this.kind = kind;
        this.licenses = licenses;
        this.mode = mode;
        this.source = source;
        this.type = type;
    }

    /**
     * - 
     * Optional. Specifies whether the disk will be auto-deleted
     * when the instance is deleted (but not when the disk is
     * detached from the instance).
     * 
    */
    public Optional<Boolean> autoDelete() {
        return Optional.ofNullable(this.autoDelete);
    }
    /**
     * - 
     * Optional. Indicates that this is a boot disk. The virtual
     * machine will use the first partition of the disk for its
     * root filesystem.
     * 
    */
    public Optional<Boolean> boot() {
        return Optional.ofNullable(this.boot);
    }
    /**
     * - 
     * Optional. Specifies a unique device name of your choice
     * that is reflected into the /dev/disk/by-id/google-* tree
     * of a Linux operating system running within the instance.
     * This name can be used to reference the device for mounting,
     * resizing, and so on, from within the instance.
     * If not specified, the server chooses a default device name
     * to apply to this disk, in the form persistent-disk-x, where
     * x is a number assigned by Google Compute Engine. This field
     * is only applicable for persistent disks.
     * 
    */
    public Optional<String> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * - 
     * Indicates a list of features to enable on the guest operating
     * system. Applicable only for bootable images. To see a list of
     * available features, read `https://cloud.google.com/compute/docs/
     * images/create-delete-deprecate-private-images#guest-os-features`
     * options. ``
     * 
    */
    public List<String> guestOsFeatures() {
        return this.guestOsFeatures == null ? List.of() : this.guestOsFeatures;
    }
    /**
     * - 
     * Output only. A zero-based index to this disk, where 0 is
     * reserved for the boot disk. If you have many disks attached
     * to an instance, each disk would have a unique index number.
     * 
    */
    public Optional<Integer> index() {
        return Optional.ofNullable(this.index);
    }
    /**
     * Input only. Specifies the parameters for a new disk that will
     * be created alongside the new instance. Use initialization
     * parameters to create boot disks or local SSDs attached to the
     * new instance. This property is mutually exclusive with the
     * source property; you can only define one or the other, but not
     * both.
     * Structure is documented below.
     * 
    */
    public Optional<RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParams> initializeParams() {
        return Optional.ofNullable(this.initializeParams);
    }
    /**
     * "Specifies the disk interface to use for attaching this disk,
     * which is either SCSI or NVME. The default is SCSI. Persistent
     * disks must always use SCSI and the request will fail if you attempt
     * to attach a persistent disk in any other format than SCSI. Local SSDs
     * can use either NVME or SCSI. For performance characteristics of SCSI
     * over NVMe, see Local SSD performance. Valid values: * NVME * SCSI".
     * 
    */
    public Optional<String> interface_() {
        return Optional.ofNullable(this.interface_);
    }
    /**
     * - 
     * Type of the resource. Always compute#attachedDisk for attached
     * disks.
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * - 
     * Output only. Any valid publicly visible licenses.
     * 
    */
    public List<String> licenses() {
        return this.licenses == null ? List.of() : this.licenses;
    }
    /**
     * The mode in which to attach this disk, either READ_WRITE
     * or READ_ONLY. If not specified, the default is to attach
     * the disk in READ_WRITE mode.
     * 
    */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * Specifies a valid partial or full URL to an existing
     * Persistent Disk resource.
     * 
    */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * Accelerator model. For valid values, see
     * `https://cloud.google.com/vertex-ai/docs/workbench/reference/
     * rest/v1/projects.locations.runtimes#AcceleratorType`
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigDataDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoDelete;
        private @Nullable Boolean boot;
        private @Nullable String deviceName;
        private @Nullable List<String> guestOsFeatures;
        private @Nullable Integer index;
        private @Nullable RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParams initializeParams;
        private @Nullable String interface_;
        private @Nullable String kind;
        private @Nullable List<String> licenses;
        private @Nullable String mode;
        private @Nullable String source;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigDataDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.index = defaults.index;
    	      this.initializeParams = defaults.initializeParams;
    	      this.interface_ = defaults.interface_;
    	      this.kind = defaults.kind;
    	      this.licenses = defaults.licenses;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        public Builder autoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }
        public Builder boot(@Nullable Boolean boot) {
            this.boot = boot;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder guestOsFeatures(@Nullable List<String> guestOsFeatures) {
            this.guestOsFeatures = guestOsFeatures;
            return this;
        }
        public Builder guestOsFeatures(String... guestOsFeatures) {
            return guestOsFeatures(List.of(guestOsFeatures));
        }
        public Builder index(@Nullable Integer index) {
            this.index = index;
            return this;
        }
        public Builder initializeParams(@Nullable RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParams initializeParams) {
            this.initializeParams = initializeParams;
            return this;
        }
        public Builder interface_(@Nullable String interface_) {
            this.interface_ = interface_;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder licenses(@Nullable List<String> licenses) {
            this.licenses = licenses;
            return this;
        }
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public RuntimeVirtualMachineVirtualMachineConfigDataDisk build() {
            return new RuntimeVirtualMachineVirtualMachineConfigDataDisk(autoDelete, boot, deviceName, guestOsFeatures, index, initializeParams, interface_, kind, licenses, mode, source, type);
        }
    }
}
