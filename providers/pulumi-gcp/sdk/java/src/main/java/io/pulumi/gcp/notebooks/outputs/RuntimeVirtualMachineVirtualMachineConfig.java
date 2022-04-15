// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig;
import io.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachineVirtualMachineConfigContainerImage;
import io.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachineVirtualMachineConfigDataDisk;
import io.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig;
import io.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuntimeVirtualMachineVirtualMachineConfig {
    /**
     * The Compute Engine accelerator configuration for this runtime.
     * Structure is documented below.
     * 
     */
    private final @Nullable RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig acceleratorConfig;
    /**
     * Use a list of container images to start the notebook instance.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<RuntimeVirtualMachineVirtualMachineConfigContainerImage> containerImages;
    /**
     * Data disk option configuration settings.
     * Structure is documented below.
     * 
     */
    private final RuntimeVirtualMachineVirtualMachineConfigDataDisk dataDisk;
    /**
     * Encryption settings for virtual machine data disk.
     * Structure is documented below.
     * 
     */
    private final @Nullable RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig encryptionConfig;
    /**
     * - 
     * The Compute Engine guest attributes. (see [Project and instance
     * guest attributes](https://cloud.google.com/compute/docs/
     * storing-retrieving-metadata#guest_attributes)).
     * 
     */
    private final @Nullable Map<String,String> guestAttributes;
    /**
     * If true, runtime will only have internal IP addresses. By default,
     * runtimes are not restricted to internal IP addresses, and will
     * have ephemeral external IP addresses assigned to each vm. This
     * `internal_ip_only` restriction can only be enabled for subnetwork
     * enabled networks, and all dependencies must be configured to be
     * accessible without external IP addresses.
     * 
     */
    private final @Nullable Boolean internalIpOnly;
    /**
     * Labels to apply to this disk. These can be later modified
     * by the disks.setLabels method. This field is only
     * applicable for persistent disks.
     * 
     */
    private final @Nullable Map<String,String> labels;
    /**
     * The Compute Engine machine type used for runtimes.
     * 
     */
    private final String machineType;
    /**
     * The Compute Engine metadata entries to add to virtual machine.
     * (see [Project and instance metadata](https://cloud.google.com
     * /compute/docs/storing-retrieving-metadata#project_and_instance
     * _metadata)).
     * 
     */
    private final @Nullable Map<String,String> metadata;
    /**
     * The Compute Engine network to be used for machine communications.
     * Cannot be specified with subnetwork. If neither `network` nor
     * `subnet` is specified, the "default" network of the project is
     * used, if it exists. A full URL or partial URI. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
     *   regions/global/default`
     * * `projects/[project_id]/regions/global/default`
     *   Runtimes are managed resources inside Google Infrastructure.
     *   Runtimes support the following network configurations:
     * * Google Managed Network (Network & subnet are empty)
     * * Consumer Project VPC (network & subnet are required). Requires
     *   configuring Private Service Access.
     * * Shared VPC (network & subnet are required). Requires
     *   configuring Private Service Access.
     * 
     */
    private final @Nullable String network;
    /**
     * The type of vNIC to be used on this interface. This may be gVNIC
     * or VirtioNet.
     * Possible values are `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, and `GVNIC`.
     * 
     */
    private final @Nullable String nicType;
    /**
     * Shielded VM Instance configuration settings.
     * Structure is documented below.
     * 
     */
    private final @Nullable RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig shieldedInstanceConfig;
    /**
     * The Compute Engine subnetwork to be used for machine
     * communications. Cannot be specified with network. A full URL or
     * partial URI are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
     *   regions/us-east1/subnetworks/sub0`
     * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * 
     */
    private final @Nullable String subnet;
    /**
     * The Compute Engine tags to add to runtime (see [Tagging instances]
     * (https://cloud.google.com/compute/docs/
     * label-or-tag-resources#tags)).
     * 
     */
    private final @Nullable List<String> tags;
    /**
     * - 
     * The zone where the virtual machine is located.
     * 
     */
    private final @Nullable String zone;

    @CustomType.Constructor
    private RuntimeVirtualMachineVirtualMachineConfig(
        @CustomType.Parameter("acceleratorConfig") @Nullable RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig acceleratorConfig,
        @CustomType.Parameter("containerImages") @Nullable List<RuntimeVirtualMachineVirtualMachineConfigContainerImage> containerImages,
        @CustomType.Parameter("dataDisk") RuntimeVirtualMachineVirtualMachineConfigDataDisk dataDisk,
        @CustomType.Parameter("encryptionConfig") @Nullable RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig encryptionConfig,
        @CustomType.Parameter("guestAttributes") @Nullable Map<String,String> guestAttributes,
        @CustomType.Parameter("internalIpOnly") @Nullable Boolean internalIpOnly,
        @CustomType.Parameter("labels") @Nullable Map<String,String> labels,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("metadata") @Nullable Map<String,String> metadata,
        @CustomType.Parameter("network") @Nullable String network,
        @CustomType.Parameter("nicType") @Nullable String nicType,
        @CustomType.Parameter("shieldedInstanceConfig") @Nullable RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig shieldedInstanceConfig,
        @CustomType.Parameter("subnet") @Nullable String subnet,
        @CustomType.Parameter("tags") @Nullable List<String> tags,
        @CustomType.Parameter("zone") @Nullable String zone) {
        this.acceleratorConfig = acceleratorConfig;
        this.containerImages = containerImages;
        this.dataDisk = dataDisk;
        this.encryptionConfig = encryptionConfig;
        this.guestAttributes = guestAttributes;
        this.internalIpOnly = internalIpOnly;
        this.labels = labels;
        this.machineType = machineType;
        this.metadata = metadata;
        this.network = network;
        this.nicType = nicType;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.subnet = subnet;
        this.tags = tags;
        this.zone = zone;
    }

    /**
     * The Compute Engine accelerator configuration for this runtime.
     * Structure is documented below.
     * 
    */
    public Optional<RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig> acceleratorConfig() {
        return Optional.ofNullable(this.acceleratorConfig);
    }
    /**
     * Use a list of container images to start the notebook instance.
     * Structure is documented below.
     * 
    */
    public List<RuntimeVirtualMachineVirtualMachineConfigContainerImage> containerImages() {
        return this.containerImages == null ? List.of() : this.containerImages;
    }
    /**
     * Data disk option configuration settings.
     * Structure is documented below.
     * 
    */
    public RuntimeVirtualMachineVirtualMachineConfigDataDisk dataDisk() {
        return this.dataDisk;
    }
    /**
     * Encryption settings for virtual machine data disk.
     * Structure is documented below.
     * 
    */
    public Optional<RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig> encryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }
    /**
     * - 
     * The Compute Engine guest attributes. (see [Project and instance
     * guest attributes](https://cloud.google.com/compute/docs/
     * storing-retrieving-metadata#guest_attributes)).
     * 
    */
    public Map<String,String> guestAttributes() {
        return this.guestAttributes == null ? Map.of() : this.guestAttributes;
    }
    /**
     * If true, runtime will only have internal IP addresses. By default,
     * runtimes are not restricted to internal IP addresses, and will
     * have ephemeral external IP addresses assigned to each vm. This
     * `internal_ip_only` restriction can only be enabled for subnetwork
     * enabled networks, and all dependencies must be configured to be
     * accessible without external IP addresses.
     * 
    */
    public Optional<Boolean> internalIpOnly() {
        return Optional.ofNullable(this.internalIpOnly);
    }
    /**
     * Labels to apply to this disk. These can be later modified
     * by the disks.setLabels method. This field is only
     * applicable for persistent disks.
     * 
    */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * The Compute Engine machine type used for runtimes.
     * 
    */
    public String machineType() {
        return this.machineType;
    }
    /**
     * The Compute Engine metadata entries to add to virtual machine.
     * (see [Project and instance metadata](https://cloud.google.com
     * /compute/docs/storing-retrieving-metadata#project_and_instance
     * _metadata)).
     * 
    */
    public Map<String,String> metadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * The Compute Engine network to be used for machine communications.
     * Cannot be specified with subnetwork. If neither `network` nor
     * `subnet` is specified, the "default" network of the project is
     * used, if it exists. A full URL or partial URI. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
     *   regions/global/default`
     * * `projects/[project_id]/regions/global/default`
     *   Runtimes are managed resources inside Google Infrastructure.
     *   Runtimes support the following network configurations:
     * * Google Managed Network (Network & subnet are empty)
     * * Consumer Project VPC (network & subnet are required). Requires
     *   configuring Private Service Access.
     * * Shared VPC (network & subnet are required). Requires
     *   configuring Private Service Access.
     * 
    */
    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * The type of vNIC to be used on this interface. This may be gVNIC
     * or VirtioNet.
     * Possible values are `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, and `GVNIC`.
     * 
    */
    public Optional<String> nicType() {
        return Optional.ofNullable(this.nicType);
    }
    /**
     * Shielded VM Instance configuration settings.
     * Structure is documented below.
     * 
    */
    public Optional<RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig> shieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }
    /**
     * The Compute Engine subnetwork to be used for machine
     * communications. Cannot be specified with network. A full URL or
     * partial URI are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
     *   regions/us-east1/subnetworks/sub0`
     * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * 
    */
    public Optional<String> subnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * The Compute Engine tags to add to runtime (see [Tagging instances]
     * (https://cloud.google.com/compute/docs/
     * label-or-tag-resources#tags)).
     * 
    */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * - 
     * The zone where the virtual machine is located.
     * 
    */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig acceleratorConfig;
        private @Nullable List<RuntimeVirtualMachineVirtualMachineConfigContainerImage> containerImages;
        private RuntimeVirtualMachineVirtualMachineConfigDataDisk dataDisk;
        private @Nullable RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig encryptionConfig;
        private @Nullable Map<String,String> guestAttributes;
        private @Nullable Boolean internalIpOnly;
        private @Nullable Map<String,String> labels;
        private String machineType;
        private @Nullable Map<String,String> metadata;
        private @Nullable String network;
        private @Nullable String nicType;
        private @Nullable RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig shieldedInstanceConfig;
        private @Nullable String subnet;
        private @Nullable List<String> tags;
        private @Nullable String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.containerImages = defaults.containerImages;
    	      this.dataDisk = defaults.dataDisk;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.guestAttributes = defaults.guestAttributes;
    	      this.internalIpOnly = defaults.internalIpOnly;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.network = defaults.network;
    	      this.nicType = defaults.nicType;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder acceleratorConfig(@Nullable RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig acceleratorConfig) {
            this.acceleratorConfig = acceleratorConfig;
            return this;
        }
        public Builder containerImages(@Nullable List<RuntimeVirtualMachineVirtualMachineConfigContainerImage> containerImages) {
            this.containerImages = containerImages;
            return this;
        }
        public Builder containerImages(RuntimeVirtualMachineVirtualMachineConfigContainerImage... containerImages) {
            return containerImages(List.of(containerImages));
        }
        public Builder dataDisk(RuntimeVirtualMachineVirtualMachineConfigDataDisk dataDisk) {
            this.dataDisk = Objects.requireNonNull(dataDisk);
            return this;
        }
        public Builder encryptionConfig(@Nullable RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        public Builder guestAttributes(@Nullable Map<String,String> guestAttributes) {
            this.guestAttributes = guestAttributes;
            return this;
        }
        public Builder internalIpOnly(@Nullable Boolean internalIpOnly) {
            this.internalIpOnly = internalIpOnly;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = network;
            return this;
        }
        public Builder nicType(@Nullable String nicType) {
            this.nicType = nicType;
            return this;
        }
        public Builder shieldedInstanceConfig(@Nullable RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }
        public Builder subnet(@Nullable String subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder zone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }        public RuntimeVirtualMachineVirtualMachineConfig build() {
            return new RuntimeVirtualMachineVirtualMachineConfig(acceleratorConfig, containerImages, dataDisk, encryptionConfig, guestAttributes, internalIpOnly, labels, machineType, metadata, network, nicType, shieldedInstanceConfig, subnet, tags, zone);
        }
    }
}
