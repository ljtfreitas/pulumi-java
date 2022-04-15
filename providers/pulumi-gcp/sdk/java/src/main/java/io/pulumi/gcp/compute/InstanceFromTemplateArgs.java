// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateAdvancedMachineFeaturesArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateAttachedDiskArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateBootDiskArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateConfidentialInstanceConfigArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateGuestAcceleratorArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkInterfaceArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateNetworkPerformanceConfigArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateReservationAffinityArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateSchedulingArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateScratchDiskArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateServiceAccountArgs;
import io.pulumi.gcp.compute.inputs.InstanceFromTemplateShieldedInstanceConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromTemplateArgs Empty = new InstanceFromTemplateArgs();

    /**
     * Controls for advanced machine-related behavior features.
     * 
     */
    @Import(name="advancedMachineFeatures")
      private final @Nullable Output<InstanceFromTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures;

    public Output<InstanceFromTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures() {
        return this.advancedMachineFeatures == null ? Codegen.empty() : this.advancedMachineFeatures;
    }

    /**
     * If true, allows Terraform to stop the instance to update its properties. If you try to update a property that requires
     * stopping the instance without setting this field, the update will fail.
     * 
     */
    @Import(name="allowStoppingForUpdate")
      private final @Nullable Output<Boolean> allowStoppingForUpdate;

    public Output<Boolean> allowStoppingForUpdate() {
        return this.allowStoppingForUpdate == null ? Codegen.empty() : this.allowStoppingForUpdate;
    }

    /**
     * List of disks attached to the instance
     * 
     */
    @Import(name="attachedDisks")
      private final @Nullable Output<List<InstanceFromTemplateAttachedDiskArgs>> attachedDisks;

    public Output<List<InstanceFromTemplateAttachedDiskArgs>> attachedDisks() {
        return this.attachedDisks == null ? Codegen.empty() : this.attachedDisks;
    }

    /**
     * The boot disk for the instance.
     * 
     */
    @Import(name="bootDisk")
      private final @Nullable Output<InstanceFromTemplateBootDiskArgs> bootDisk;

    public Output<InstanceFromTemplateBootDiskArgs> bootDisk() {
        return this.bootDisk == null ? Codegen.empty() : this.bootDisk;
    }

    /**
     * Whether sending and receiving of packets with non-matching source or destination IPs is allowed.
     * 
     */
    @Import(name="canIpForward")
      private final @Nullable Output<Boolean> canIpForward;

    public Output<Boolean> canIpForward() {
        return this.canIpForward == null ? Codegen.empty() : this.canIpForward;
    }

    /**
     * The Confidential VM config being used by the instance. on_host_maintenance has to be set to TERMINATE or this will fail
     * to create.
     * 
     */
    @Import(name="confidentialInstanceConfig")
      private final @Nullable Output<InstanceFromTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig;

    public Output<InstanceFromTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig() {
        return this.confidentialInstanceConfig == null ? Codegen.empty() : this.confidentialInstanceConfig;
    }

    /**
     * Whether deletion protection is enabled on this instance.
     * 
     */
    @Import(name="deletionProtection")
      private final @Nullable Output<Boolean> deletionProtection;

    public Output<Boolean> deletionProtection() {
        return this.deletionProtection == null ? Codegen.empty() : this.deletionProtection;
    }

    /**
     * A brief description of the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Desired status of the instance. Either "RUNNING" or "TERMINATED".
     * 
     */
    @Import(name="desiredStatus")
      private final @Nullable Output<String> desiredStatus;

    public Output<String> desiredStatus() {
        return this.desiredStatus == null ? Codegen.empty() : this.desiredStatus;
    }

    /**
     * Whether the instance has virtual displays enabled.
     * 
     */
    @Import(name="enableDisplay")
      private final @Nullable Output<Boolean> enableDisplay;

    public Output<Boolean> enableDisplay() {
        return this.enableDisplay == null ? Codegen.empty() : this.enableDisplay;
    }

    /**
     * List of the type and count of accelerator cards attached to the instance.
     * 
     */
    @Import(name="guestAccelerators")
      private final @Nullable Output<List<InstanceFromTemplateGuestAcceleratorArgs>> guestAccelerators;

    public Output<List<InstanceFromTemplateGuestAcceleratorArgs>> guestAccelerators() {
        return this.guestAccelerators == null ? Codegen.empty() : this.guestAccelerators;
    }

    /**
     * A custom hostname for the instance. Must be a fully qualified DNS name and RFC-1035-valid. Valid format is a series of
     * labels 1-63 characters long matching the regular expression [a-z]([-a-z0-9]*[a-z0-9]), concatenated with periods. The
     * entire hostname must not exceed 253 characters. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="hostname")
      private final @Nullable Output<String> hostname;

    public Output<String> hostname() {
        return this.hostname == null ? Codegen.empty() : this.hostname;
    }

    /**
     * A set of key/value label pairs assigned to the instance.
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
    @Import(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> machineType() {
        return this.machineType == null ? Codegen.empty() : this.machineType;
    }

    /**
     * Metadata key/value pairs made available within the instance.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Metadata startup scripts made available within the instance.
     * 
     */
    @Import(name="metadataStartupScript")
      private final @Nullable Output<String> metadataStartupScript;

    public Output<String> metadataStartupScript() {
        return this.metadataStartupScript == null ? Codegen.empty() : this.metadataStartupScript;
    }

    /**
     * The minimum CPU platform specified for the VM instance.
     * 
     */
    @Import(name="minCpuPlatform")
      private final @Nullable Output<String> minCpuPlatform;

    public Output<String> minCpuPlatform() {
        return this.minCpuPlatform == null ? Codegen.empty() : this.minCpuPlatform;
    }

    /**
     * A unique name for the resource, required by GCE.
     * Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The networks attached to the instance.
     * 
     */
    @Import(name="networkInterfaces")
      private final @Nullable Output<List<InstanceFromTemplateNetworkInterfaceArgs>> networkInterfaces;

    public Output<List<InstanceFromTemplateNetworkInterfaceArgs>> networkInterfaces() {
        return this.networkInterfaces == null ? Codegen.empty() : this.networkInterfaces;
    }

    /**
     * Configures network performance settings for the instance. If not specified, the instance will be created with its
     * default network performance configuration.
     * 
     */
    @Import(name="networkPerformanceConfig")
      private final @Nullable Output<InstanceFromTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig;

    public Output<InstanceFromTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig() {
        return this.networkPerformanceConfig == null ? Codegen.empty() : this.networkPerformanceConfig;
    }

    /**
     * The ID of the project in which the resource belongs. If self_link is provided, this value is ignored. If neither
     * self_link nor project are provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Specifies the reservations that this instance can consume from.
     * 
     */
    @Import(name="reservationAffinity")
      private final @Nullable Output<InstanceFromTemplateReservationAffinityArgs> reservationAffinity;

    public Output<InstanceFromTemplateReservationAffinityArgs> reservationAffinity() {
        return this.reservationAffinity == null ? Codegen.empty() : this.reservationAffinity;
    }

    /**
     * A list of short names or self_links of resource policies to attach to the instance. Currently a max of 1 resource policy
     * is supported.
     * 
     */
    @Import(name="resourcePolicies")
      private final @Nullable Output<String> resourcePolicies;

    public Output<String> resourcePolicies() {
        return this.resourcePolicies == null ? Codegen.empty() : this.resourcePolicies;
    }

    /**
     * The scheduling strategy being used by the instance.
     * 
     */
    @Import(name="scheduling")
      private final @Nullable Output<InstanceFromTemplateSchedulingArgs> scheduling;

    public Output<InstanceFromTemplateSchedulingArgs> scheduling() {
        return this.scheduling == null ? Codegen.empty() : this.scheduling;
    }

    /**
     * The scratch disks attached to the instance.
     * 
     */
    @Import(name="scratchDisks")
      private final @Nullable Output<List<InstanceFromTemplateScratchDiskArgs>> scratchDisks;

    public Output<List<InstanceFromTemplateScratchDiskArgs>> scratchDisks() {
        return this.scratchDisks == null ? Codegen.empty() : this.scratchDisks;
    }

    /**
     * The service account to attach to the instance.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<InstanceFromTemplateServiceAccountArgs> serviceAccount;

    public Output<InstanceFromTemplateServiceAccountArgs> serviceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    /**
     * The shielded vm config being used by the instance.
     * 
     */
    @Import(name="shieldedInstanceConfig")
      private final @Nullable Output<InstanceFromTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Output<InstanceFromTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Codegen.empty() : this.shieldedInstanceConfig;
    }

    /**
     * Name or self link of an instance
     * template to create the instance based on.
     * 
     */
    @Import(name="sourceInstanceTemplate", required=true)
      private final Output<String> sourceInstanceTemplate;

    public Output<String> sourceInstanceTemplate() {
        return this.sourceInstanceTemplate;
    }

    /**
     * The list of tags attached to the instance.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The zone that the machine should be created in. If not
     * set, the provider zone is used.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> zone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public InstanceFromTemplateArgs(
        @Nullable Output<InstanceFromTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures,
        @Nullable Output<Boolean> allowStoppingForUpdate,
        @Nullable Output<List<InstanceFromTemplateAttachedDiskArgs>> attachedDisks,
        @Nullable Output<InstanceFromTemplateBootDiskArgs> bootDisk,
        @Nullable Output<Boolean> canIpForward,
        @Nullable Output<InstanceFromTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig,
        @Nullable Output<Boolean> deletionProtection,
        @Nullable Output<String> description,
        @Nullable Output<String> desiredStatus,
        @Nullable Output<Boolean> enableDisplay,
        @Nullable Output<List<InstanceFromTemplateGuestAcceleratorArgs>> guestAccelerators,
        @Nullable Output<String> hostname,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> machineType,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> metadataStartupScript,
        @Nullable Output<String> minCpuPlatform,
        @Nullable Output<String> name,
        @Nullable Output<List<InstanceFromTemplateNetworkInterfaceArgs>> networkInterfaces,
        @Nullable Output<InstanceFromTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig,
        @Nullable Output<String> project,
        @Nullable Output<InstanceFromTemplateReservationAffinityArgs> reservationAffinity,
        @Nullable Output<String> resourcePolicies,
        @Nullable Output<InstanceFromTemplateSchedulingArgs> scheduling,
        @Nullable Output<List<InstanceFromTemplateScratchDiskArgs>> scratchDisks,
        @Nullable Output<InstanceFromTemplateServiceAccountArgs> serviceAccount,
        @Nullable Output<InstanceFromTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig,
        Output<String> sourceInstanceTemplate,
        @Nullable Output<List<String>> tags,
        @Nullable Output<String> zone) {
        this.advancedMachineFeatures = advancedMachineFeatures;
        this.allowStoppingForUpdate = allowStoppingForUpdate;
        this.attachedDisks = attachedDisks;
        this.bootDisk = bootDisk;
        this.canIpForward = canIpForward;
        this.confidentialInstanceConfig = confidentialInstanceConfig;
        this.deletionProtection = deletionProtection;
        this.description = description;
        this.desiredStatus = desiredStatus;
        this.enableDisplay = enableDisplay;
        this.guestAccelerators = guestAccelerators;
        this.hostname = hostname;
        this.labels = labels;
        this.machineType = machineType;
        this.metadata = metadata;
        this.metadataStartupScript = metadataStartupScript;
        this.minCpuPlatform = minCpuPlatform;
        this.name = name;
        this.networkInterfaces = networkInterfaces;
        this.networkPerformanceConfig = networkPerformanceConfig;
        this.project = project;
        this.reservationAffinity = reservationAffinity;
        this.resourcePolicies = resourcePolicies;
        this.scheduling = scheduling;
        this.scratchDisks = scratchDisks;
        this.serviceAccount = serviceAccount;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.sourceInstanceTemplate = Objects.requireNonNull(sourceInstanceTemplate, "expected parameter 'sourceInstanceTemplate' to be non-null");
        this.tags = tags;
        this.zone = zone;
    }

    private InstanceFromTemplateArgs() {
        this.advancedMachineFeatures = Codegen.empty();
        this.allowStoppingForUpdate = Codegen.empty();
        this.attachedDisks = Codegen.empty();
        this.bootDisk = Codegen.empty();
        this.canIpForward = Codegen.empty();
        this.confidentialInstanceConfig = Codegen.empty();
        this.deletionProtection = Codegen.empty();
        this.description = Codegen.empty();
        this.desiredStatus = Codegen.empty();
        this.enableDisplay = Codegen.empty();
        this.guestAccelerators = Codegen.empty();
        this.hostname = Codegen.empty();
        this.labels = Codegen.empty();
        this.machineType = Codegen.empty();
        this.metadata = Codegen.empty();
        this.metadataStartupScript = Codegen.empty();
        this.minCpuPlatform = Codegen.empty();
        this.name = Codegen.empty();
        this.networkInterfaces = Codegen.empty();
        this.networkPerformanceConfig = Codegen.empty();
        this.project = Codegen.empty();
        this.reservationAffinity = Codegen.empty();
        this.resourcePolicies = Codegen.empty();
        this.scheduling = Codegen.empty();
        this.scratchDisks = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.shieldedInstanceConfig = Codegen.empty();
        this.sourceInstanceTemplate = Codegen.empty();
        this.tags = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceFromTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures;
        private @Nullable Output<Boolean> allowStoppingForUpdate;
        private @Nullable Output<List<InstanceFromTemplateAttachedDiskArgs>> attachedDisks;
        private @Nullable Output<InstanceFromTemplateBootDiskArgs> bootDisk;
        private @Nullable Output<Boolean> canIpForward;
        private @Nullable Output<InstanceFromTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig;
        private @Nullable Output<Boolean> deletionProtection;
        private @Nullable Output<String> description;
        private @Nullable Output<String> desiredStatus;
        private @Nullable Output<Boolean> enableDisplay;
        private @Nullable Output<List<InstanceFromTemplateGuestAcceleratorArgs>> guestAccelerators;
        private @Nullable Output<String> hostname;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> machineType;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> metadataStartupScript;
        private @Nullable Output<String> minCpuPlatform;
        private @Nullable Output<String> name;
        private @Nullable Output<List<InstanceFromTemplateNetworkInterfaceArgs>> networkInterfaces;
        private @Nullable Output<InstanceFromTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig;
        private @Nullable Output<String> project;
        private @Nullable Output<InstanceFromTemplateReservationAffinityArgs> reservationAffinity;
        private @Nullable Output<String> resourcePolicies;
        private @Nullable Output<InstanceFromTemplateSchedulingArgs> scheduling;
        private @Nullable Output<List<InstanceFromTemplateScratchDiskArgs>> scratchDisks;
        private @Nullable Output<InstanceFromTemplateServiceAccountArgs> serviceAccount;
        private @Nullable Output<InstanceFromTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig;
        private Output<String> sourceInstanceTemplate;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedMachineFeatures = defaults.advancedMachineFeatures;
    	      this.allowStoppingForUpdate = defaults.allowStoppingForUpdate;
    	      this.attachedDisks = defaults.attachedDisks;
    	      this.bootDisk = defaults.bootDisk;
    	      this.canIpForward = defaults.canIpForward;
    	      this.confidentialInstanceConfig = defaults.confidentialInstanceConfig;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.description = defaults.description;
    	      this.desiredStatus = defaults.desiredStatus;
    	      this.enableDisplay = defaults.enableDisplay;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.hostname = defaults.hostname;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.metadataStartupScript = defaults.metadataStartupScript;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.name = defaults.name;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.networkPerformanceConfig = defaults.networkPerformanceConfig;
    	      this.project = defaults.project;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.scheduling = defaults.scheduling;
    	      this.scratchDisks = defaults.scratchDisks;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.sourceInstanceTemplate = defaults.sourceInstanceTemplate;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder advancedMachineFeatures(@Nullable Output<InstanceFromTemplateAdvancedMachineFeaturesArgs> advancedMachineFeatures) {
            this.advancedMachineFeatures = advancedMachineFeatures;
            return this;
        }
        public Builder advancedMachineFeatures(@Nullable InstanceFromTemplateAdvancedMachineFeaturesArgs advancedMachineFeatures) {
            this.advancedMachineFeatures = Codegen.ofNullable(advancedMachineFeatures);
            return this;
        }
        public Builder allowStoppingForUpdate(@Nullable Output<Boolean> allowStoppingForUpdate) {
            this.allowStoppingForUpdate = allowStoppingForUpdate;
            return this;
        }
        public Builder allowStoppingForUpdate(@Nullable Boolean allowStoppingForUpdate) {
            this.allowStoppingForUpdate = Codegen.ofNullable(allowStoppingForUpdate);
            return this;
        }
        public Builder attachedDisks(@Nullable Output<List<InstanceFromTemplateAttachedDiskArgs>> attachedDisks) {
            this.attachedDisks = attachedDisks;
            return this;
        }
        public Builder attachedDisks(@Nullable List<InstanceFromTemplateAttachedDiskArgs> attachedDisks) {
            this.attachedDisks = Codegen.ofNullable(attachedDisks);
            return this;
        }
        public Builder attachedDisks(InstanceFromTemplateAttachedDiskArgs... attachedDisks) {
            return attachedDisks(List.of(attachedDisks));
        }
        public Builder bootDisk(@Nullable Output<InstanceFromTemplateBootDiskArgs> bootDisk) {
            this.bootDisk = bootDisk;
            return this;
        }
        public Builder bootDisk(@Nullable InstanceFromTemplateBootDiskArgs bootDisk) {
            this.bootDisk = Codegen.ofNullable(bootDisk);
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
        public Builder confidentialInstanceConfig(@Nullable Output<InstanceFromTemplateConfidentialInstanceConfigArgs> confidentialInstanceConfig) {
            this.confidentialInstanceConfig = confidentialInstanceConfig;
            return this;
        }
        public Builder confidentialInstanceConfig(@Nullable InstanceFromTemplateConfidentialInstanceConfigArgs confidentialInstanceConfig) {
            this.confidentialInstanceConfig = Codegen.ofNullable(confidentialInstanceConfig);
            return this;
        }
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }
        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Codegen.ofNullable(deletionProtection);
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
        public Builder desiredStatus(@Nullable Output<String> desiredStatus) {
            this.desiredStatus = desiredStatus;
            return this;
        }
        public Builder desiredStatus(@Nullable String desiredStatus) {
            this.desiredStatus = Codegen.ofNullable(desiredStatus);
            return this;
        }
        public Builder enableDisplay(@Nullable Output<Boolean> enableDisplay) {
            this.enableDisplay = enableDisplay;
            return this;
        }
        public Builder enableDisplay(@Nullable Boolean enableDisplay) {
            this.enableDisplay = Codegen.ofNullable(enableDisplay);
            return this;
        }
        public Builder guestAccelerators(@Nullable Output<List<InstanceFromTemplateGuestAcceleratorArgs>> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }
        public Builder guestAccelerators(@Nullable List<InstanceFromTemplateGuestAcceleratorArgs> guestAccelerators) {
            this.guestAccelerators = Codegen.ofNullable(guestAccelerators);
            return this;
        }
        public Builder guestAccelerators(InstanceFromTemplateGuestAcceleratorArgs... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }
        public Builder hostname(@Nullable Output<String> hostname) {
            this.hostname = hostname;
            return this;
        }
        public Builder hostname(@Nullable String hostname) {
            this.hostname = Codegen.ofNullable(hostname);
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
        public Builder machineType(@Nullable Output<String> machineType) {
            this.machineType = machineType;
            return this;
        }
        public Builder machineType(@Nullable String machineType) {
            this.machineType = Codegen.ofNullable(machineType);
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
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
        public Builder networkInterfaces(@Nullable Output<List<InstanceFromTemplateNetworkInterfaceArgs>> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }
        public Builder networkInterfaces(@Nullable List<InstanceFromTemplateNetworkInterfaceArgs> networkInterfaces) {
            this.networkInterfaces = Codegen.ofNullable(networkInterfaces);
            return this;
        }
        public Builder networkInterfaces(InstanceFromTemplateNetworkInterfaceArgs... networkInterfaces) {
            return networkInterfaces(List.of(networkInterfaces));
        }
        public Builder networkPerformanceConfig(@Nullable Output<InstanceFromTemplateNetworkPerformanceConfigArgs> networkPerformanceConfig) {
            this.networkPerformanceConfig = networkPerformanceConfig;
            return this;
        }
        public Builder networkPerformanceConfig(@Nullable InstanceFromTemplateNetworkPerformanceConfigArgs networkPerformanceConfig) {
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
        public Builder reservationAffinity(@Nullable Output<InstanceFromTemplateReservationAffinityArgs> reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }
        public Builder reservationAffinity(@Nullable InstanceFromTemplateReservationAffinityArgs reservationAffinity) {
            this.reservationAffinity = Codegen.ofNullable(reservationAffinity);
            return this;
        }
        public Builder resourcePolicies(@Nullable Output<String> resourcePolicies) {
            this.resourcePolicies = resourcePolicies;
            return this;
        }
        public Builder resourcePolicies(@Nullable String resourcePolicies) {
            this.resourcePolicies = Codegen.ofNullable(resourcePolicies);
            return this;
        }
        public Builder scheduling(@Nullable Output<InstanceFromTemplateSchedulingArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }
        public Builder scheduling(@Nullable InstanceFromTemplateSchedulingArgs scheduling) {
            this.scheduling = Codegen.ofNullable(scheduling);
            return this;
        }
        public Builder scratchDisks(@Nullable Output<List<InstanceFromTemplateScratchDiskArgs>> scratchDisks) {
            this.scratchDisks = scratchDisks;
            return this;
        }
        public Builder scratchDisks(@Nullable List<InstanceFromTemplateScratchDiskArgs> scratchDisks) {
            this.scratchDisks = Codegen.ofNullable(scratchDisks);
            return this;
        }
        public Builder scratchDisks(InstanceFromTemplateScratchDiskArgs... scratchDisks) {
            return scratchDisks(List.of(scratchDisks));
        }
        public Builder serviceAccount(@Nullable Output<InstanceFromTemplateServiceAccountArgs> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable InstanceFromTemplateServiceAccountArgs serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder shieldedInstanceConfig(@Nullable Output<InstanceFromTemplateShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }
        public Builder shieldedInstanceConfig(@Nullable InstanceFromTemplateShieldedInstanceConfigArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Codegen.ofNullable(shieldedInstanceConfig);
            return this;
        }
        public Builder sourceInstanceTemplate(Output<String> sourceInstanceTemplate) {
            this.sourceInstanceTemplate = Objects.requireNonNull(sourceInstanceTemplate);
            return this;
        }
        public Builder sourceInstanceTemplate(String sourceInstanceTemplate) {
            this.sourceInstanceTemplate = Output.of(Objects.requireNonNull(sourceInstanceTemplate));
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
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public InstanceFromTemplateArgs build() {
            return new InstanceFromTemplateArgs(advancedMachineFeatures, allowStoppingForUpdate, attachedDisks, bootDisk, canIpForward, confidentialInstanceConfig, deletionProtection, description, desiredStatus, enableDisplay, guestAccelerators, hostname, labels, machineType, metadata, metadataStartupScript, minCpuPlatform, name, networkInterfaces, networkPerformanceConfig, project, reservationAffinity, resourcePolicies, scheduling, scratchDisks, serviceAccount, shieldedInstanceConfig, sourceInstanceTemplate, tags, zone);
        }
    }
}
