// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.InstanceTemplateAdvancedMachineFeaturesArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateConfidentialInstanceConfigArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateDiskArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateGuestAcceleratorArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateNetworkInterfaceArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateNetworkPerformanceConfigArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateReservationAffinityArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateSchedulingArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateServiceAccountArgs;
import io.pulumi.gcp.compute.inputs.InstanceTemplateShieldedInstanceConfigArgs;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateArgs Empty = new InstanceTemplateArgs();

    /**
     * Configure Nested Virtualisation and Simultaneous Hyper Threading on this VM. Structure is documented below
     * 
     */
    @Import(name="advancedMachineFeatures")
      private final @Nullable Output<InstanceTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures;

    public Output<InstanceTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures() {
        return this.advancedMachineFeatures == null ? Codegen.empty() : this.advancedMachineFeatures;
    }

    /**
     * Whether to allow sending and receiving of
     * packets with non-matching source or destination IPs. This defaults to false.
     * 
     */
    @Import(name="canIpForward")
      private final @Nullable Output<Boolean> canIpForward;

    public Output<Boolean> canIpForward() {
        return this.canIpForward == null ? Codegen.empty() : this.canIpForward;
    }

    /**
     * Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     * 
     */
    @Import(name="confidentialInstanceConfig")
      private final @Nullable Output<InstanceTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig;

    public Output<InstanceTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig() {
        return this.confidentialInstanceConfig == null ? Codegen.empty() : this.confidentialInstanceConfig;
    }

    /**
     * A brief description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Disks to attach to instances created from this template.
     * This can be specified multiple times for multiple disks. Structure is
     * documented below.
     * 
     */
    @Import(name="disks", required=true)
      private final Output<List<InstanceTemplateDiskArgs>> disks;

    public Output<List<InstanceTemplateDiskArgs>> disks() {
        return this.disks;
    }

    /**
     * ) Enable [Virtual Displays](https://cloud.google.com/compute/docs/instances/enable-instance-virtual-display#verify_display_driver) on this instance.
     * **Note**: `allow_stopping_for_update` must be set to true in order to update this field.
     * 
     */
    @Import(name="enableDisplay")
      private final @Nullable Output<Boolean> enableDisplay;

    public Output<Boolean> enableDisplay() {
        return this.enableDisplay == null ? Codegen.empty() : this.enableDisplay;
    }

    /**
     * List of the type and count of accelerator cards attached to the instance. Structure documented below.
     * 
     */
    @Import(name="guestAccelerators")
      private final @Nullable Output<List<InstanceTemplateGuestAcceleratorArgs>> guestAccelerators;

    public Output<List<InstanceTemplateGuestAcceleratorArgs>> guestAccelerators() {
        return this.guestAccelerators == null ? Codegen.empty() : this.guestAccelerators;
    }

    /**
     * A brief description to use for instances
     * created from this template.
     * 
     */
    @Import(name="instanceDescription")
      private final @Nullable Output<String> instanceDescription;

    public Output<String> instanceDescription() {
        return this.instanceDescription == null ? Codegen.empty() : this.instanceDescription;
    }

    /**
     * A set of ket/value label pairs to assign to disk created from
     * this template
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The machine type to create.
     * 
     */
    @Import(name="machineType", required=true)
      private final Output<String> machineType;

    public Output<String> machineType() {
        return this.machineType;
    }

    /**
     * Metadata key/value pairs to make available from
     * within instances created from this template.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,Object>> metadata;

    public Output<Map<String,Object>> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * An alternative to using the
     * startup-script metadata key, mostly to match the compute_instance resource.
     * This replaces the startup-script metadata key on the created instance and
     * thus the two mechanisms are not allowed to be used simultaneously.
     * 
     */
    @Import(name="metadataStartupScript")
      private final @Nullable Output<String> metadataStartupScript;

    public Output<String> metadataStartupScript() {
        return this.metadataStartupScript == null ? Codegen.empty() : this.metadataStartupScript;
    }

    /**
     * Specifies a minimum CPU platform. Applicable values are the friendly names of CPU platforms, such as
     * `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
     * 
     */
    @Import(name="minCpuPlatform")
      private final @Nullable Output<String> minCpuPlatform;

    public Output<String> minCpuPlatform() {
        return this.minCpuPlatform == null ? Codegen.empty() : this.minCpuPlatform;
    }

    /**
     * The name of the instance template. If you leave
     * this blank, the provider will auto-generate a unique name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> namePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * Networks to attach to instances created from
     * this template. This can be specified multiple times for multiple networks.
     * Structure is documented below.
     * 
     */
    @Import(name="networkInterfaces")
      private final @Nullable Output<List<InstanceTemplateNetworkInterfaceArgs>> networkInterfaces;

    public Output<List<InstanceTemplateNetworkInterfaceArgs>> networkInterfaces() {
        return this.networkInterfaces == null ? Codegen.empty() : this.networkInterfaces;
    }

    /**
     * Configures network performance settings for the instance created from the
     * template. Structure is documented below. **Note**: `machine_type`
     * must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     * 
     */
    @Import(name="networkPerformanceConfig")
      private final @Nullable Output<InstanceTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig;

    public Output<InstanceTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig() {
        return this.networkPerformanceConfig == null ? Codegen.empty() : this.networkPerformanceConfig;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * An instance template is a global resource that is not
     * bound to a zone or a region. However, you can still specify some regional
     * resources in an instance template, which restricts the template to the
     * region where that resource resides. For example, a custom `subnetwork`
     * resource is tied to a specific region. Defaults to the region of the
     * Provider if no value is given.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     * 
     */
    @Import(name="reservationAffinity")
      private final @Nullable Output<InstanceTemplateReservationAffinityArgs> reservationAffinity;

    public Output<InstanceTemplateReservationAffinityArgs> reservationAffinity() {
        return this.reservationAffinity == null ? Codegen.empty() : this.reservationAffinity;
    }

    /**
     * The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     * 
     */
    @Import(name="scheduling")
      private final @Nullable Output<InstanceTemplateSchedulingArgs> scheduling;

    public Output<InstanceTemplateSchedulingArgs> scheduling() {
        return this.scheduling == null ? Codegen.empty() : this.scheduling;
    }

    /**
     * Service account to attach to the instance. Structure is documented below.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<InstanceTemplateServiceAccountArgs> serviceAccount;

    public Output<InstanceTemplateServiceAccountArgs> serviceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    /**
     * Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shielded_instance_config` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     * 
     */
    @Import(name="shieldedInstanceConfig")
      private final @Nullable Output<InstanceTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Output<InstanceTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Codegen.empty() : this.shieldedInstanceConfig;
    }

    /**
     * Tags to attach to the instance.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public InstanceTemplateArgs(
        @Nullable Output<InstanceTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures,
        @Nullable Output<Boolean> canIpForward,
        @Nullable Output<InstanceTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig,
        @Nullable Output<String> description,
        Output<List<InstanceTemplateDiskArgs>> disks,
        @Nullable Output<Boolean> enableDisplay,
        @Nullable Output<List<InstanceTemplateGuestAcceleratorArgs>> guestAccelerators,
        @Nullable Output<String> instanceDescription,
        @Nullable Output<Map<String,String>> labels,
        Output<String> machineType,
        @Nullable Output<Map<String,Object>> metadata,
        @Nullable Output<String> metadataStartupScript,
        @Nullable Output<String> minCpuPlatform,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<List<InstanceTemplateNetworkInterfaceArgs>> networkInterfaces,
        @Nullable Output<InstanceTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<InstanceTemplateReservationAffinityArgs> reservationAffinity,
        @Nullable Output<InstanceTemplateSchedulingArgs> scheduling,
        @Nullable Output<InstanceTemplateServiceAccountArgs> serviceAccount,
        @Nullable Output<InstanceTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig,
        @Nullable Output<List<String>> tags) {
        this.advancedMachineFeatures = advancedMachineFeatures;
        this.canIpForward = canIpForward;
        this.confidentialInstanceConfig = confidentialInstanceConfig;
        this.description = description;
        this.disks = Objects.requireNonNull(disks, "expected parameter 'disks' to be non-null");
        this.enableDisplay = enableDisplay;
        this.guestAccelerators = guestAccelerators;
        this.instanceDescription = instanceDescription;
        this.labels = labels;
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.metadata = metadata;
        this.metadataStartupScript = metadataStartupScript;
        this.minCpuPlatform = minCpuPlatform;
        this.name = name;
        this.namePrefix = namePrefix;
        this.networkInterfaces = networkInterfaces;
        this.networkPerformanceConfig = networkPerformanceConfig;
        this.project = project;
        this.region = region;
        this.reservationAffinity = reservationAffinity;
        this.scheduling = scheduling;
        this.serviceAccount = serviceAccount;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.tags = tags;
    }

    private InstanceTemplateArgs() {
        this.advancedMachineFeatures = Codegen.empty();
        this.canIpForward = Codegen.empty();
        this.confidentialInstanceConfig = Codegen.empty();
        this.description = Codegen.empty();
        this.disks = Codegen.empty();
        this.enableDisplay = Codegen.empty();
        this.guestAccelerators = Codegen.empty();
        this.instanceDescription = Codegen.empty();
        this.labels = Codegen.empty();
        this.machineType = Codegen.empty();
        this.metadata = Codegen.empty();
        this.metadataStartupScript = Codegen.empty();
        this.minCpuPlatform = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.networkInterfaces = Codegen.empty();
        this.networkPerformanceConfig = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.reservationAffinity = Codegen.empty();
        this.scheduling = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.shieldedInstanceConfig = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures;
        private @Nullable Output<Boolean> canIpForward;
        private @Nullable Output<InstanceTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig;
        private @Nullable Output<String> description;
        private Output<List<InstanceTemplateDiskArgs>> disks;
        private @Nullable Output<Boolean> enableDisplay;
        private @Nullable Output<List<InstanceTemplateGuestAcceleratorArgs>> guestAccelerators;
        private @Nullable Output<String> instanceDescription;
        private @Nullable Output<Map<String,String>> labels;
        private Output<String> machineType;
        private @Nullable Output<Map<String,Object>> metadata;
        private @Nullable Output<String> metadataStartupScript;
        private @Nullable Output<String> minCpuPlatform;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<List<InstanceTemplateNetworkInterfaceArgs>> networkInterfaces;
        private @Nullable Output<InstanceTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<InstanceTemplateReservationAffinityArgs> reservationAffinity;
        private @Nullable Output<InstanceTemplateSchedulingArgs> scheduling;
        private @Nullable Output<InstanceTemplateServiceAccountArgs> serviceAccount;
        private @Nullable Output<InstanceTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig;
        private @Nullable Output<List<String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedMachineFeatures = defaults.advancedMachineFeatures;
    	      this.canIpForward = defaults.canIpForward;
    	      this.confidentialInstanceConfig = defaults.confidentialInstanceConfig;
    	      this.description = defaults.description;
    	      this.disks = defaults.disks;
    	      this.enableDisplay = defaults.enableDisplay;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.instanceDescription = defaults.instanceDescription;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.metadataStartupScript = defaults.metadataStartupScript;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkPerformanceConfig = defaults.networkPerformanceConfig;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.scheduling = defaults.scheduling;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.tags = defaults.tags;
        }

        public Builder advancedMachineFeatures(@Nullable Output<InstanceTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures) {
            this.advancedMachineFeatures = advancedMachineFeatures;
            return this;
        }
        public Builder advancedMachineFeatures(@Nullable InstanceTemplateAdvancedMachineFeaturesArgs advancedMachineFeatures) {
            this.advancedMachineFeatures = Codegen.ofNullable(advancedMachineFeatures);
            return this;
        }
        public Builder canIpForward(@Nullable Output<Boolean> canIpForward) {
            this.canIpForward = canIpForward;
            return this;
        }
        public Builder canIpForward(@Nullable Boolean canIpForward) {
            this.canIpForward = Codegen.ofNullable(canIpForward);
            return this;
        }
        public Builder confidentialInstanceConfig(@Nullable Output<InstanceTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig) {
            this.confidentialInstanceConfig = confidentialInstanceConfig;
            return this;
        }
        public Builder confidentialInstanceConfig(@Nullable InstanceTemplateConfidentialInstanceConfigArgs confidentialInstanceConfig) {
            this.confidentialInstanceConfig = Codegen.ofNullable(confidentialInstanceConfig);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder disks(Output<List<InstanceTemplateDiskArgs>> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }
        public Builder disks(List<InstanceTemplateDiskArgs> disks) {
            this.disks = Output.of(Objects.requireNonNull(disks));
            return this;
        }
        public Builder disks(InstanceTemplateDiskArgs... disks) {
            return disks(List.of(disks));
        }
        public Builder enableDisplay(@Nullable Output<Boolean> enableDisplay) {
            this.enableDisplay = enableDisplay;
            return this;
        }
        public Builder enableDisplay(@Nullable Boolean enableDisplay) {
            this.enableDisplay = Codegen.ofNullable(enableDisplay);
            return this;
        }
        public Builder guestAccelerators(@Nullable Output<List<InstanceTemplateGuestAcceleratorArgs>> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }
        public Builder guestAccelerators(@Nullable List<InstanceTemplateGuestAcceleratorArgs> guestAccelerators) {
            this.guestAccelerators = Codegen.ofNullable(guestAccelerators);
            return this;
        }
        public Builder guestAccelerators(InstanceTemplateGuestAcceleratorArgs... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }
        public Builder instanceDescription(@Nullable Output<String> instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public Builder instanceDescription(@Nullable String instanceDescription) {
            this.instanceDescription = Codegen.ofNullable(instanceDescription);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder machineType(Output<String> machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Output.of(Objects.requireNonNull(machineType));
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,Object>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,Object> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder metadataStartupScript(@Nullable Output<String> metadataStartupScript) {
            this.metadataStartupScript = metadataStartupScript;
            return this;
        }
        public Builder metadataStartupScript(@Nullable String metadataStartupScript) {
            this.metadataStartupScript = Codegen.ofNullable(metadataStartupScript);
            return this;
        }
        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }
        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Codegen.ofNullable(minCpuPlatform);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder networkInterfaces(@Nullable Output<List<InstanceTemplateNetworkInterfaceArgs>> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public Builder networkInterfaces(@Nullable List<InstanceTemplateNetworkInterfaceArgs> networkInterfaces) {
            this.networkInterfaces = Codegen.ofNullable(networkInterfaces);
            return this;
        }
        public Builder networkInterfaces(InstanceTemplateNetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder networkPerformanceConfig(@Nullable Output<InstanceTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig) {
            this.networkPerformanceConfig = networkPerformanceConfig;
            return this;
        }
        public Builder networkPerformanceConfig(@Nullable InstanceTemplateNetworkPerformanceConfigArgs networkPerformanceConfig) {
            this.networkPerformanceConfig = Codegen.ofNullable(networkPerformanceConfig);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder reservationAffinity(@Nullable Output<InstanceTemplateReservationAffinityArgs> reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }
        public Builder reservationAffinity(@Nullable InstanceTemplateReservationAffinityArgs reservationAffinity) {
            this.reservationAffinity = Codegen.ofNullable(reservationAffinity);
            return this;
        }
        public Builder scheduling(@Nullable Output<InstanceTemplateSchedulingArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }
        public Builder scheduling(@Nullable InstanceTemplateSchedulingArgs scheduling) {
            this.scheduling = Codegen.ofNullable(scheduling);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<InstanceTemplateServiceAccountArgs> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable InstanceTemplateServiceAccountArgs serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder shieldedInstanceConfig(@Nullable Output<InstanceTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }
        public Builder shieldedInstanceConfig(@Nullable InstanceTemplateShieldedInstanceConfigArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Codegen.ofNullable(shieldedInstanceConfig);
            return this;
        }
        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }        public InstanceTemplateArgs build() {
            return new InstanceTemplateArgs(advancedMachineFeatures, canIpForward, confidentialInstanceConfig, description, disks, enableDisplay, guestAccelerators, instanceDescription, labels, machineType, metadata, metadataStartupScript, minCpuPlatform, name, namePrefix, networkInterfaces, networkPerformanceConfig, project, region, reservationAffinity, scheduling, serviceAccount, shieldedInstanceConfig, tags);
        }
    }
}
