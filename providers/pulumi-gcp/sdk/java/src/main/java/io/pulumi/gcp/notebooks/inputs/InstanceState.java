// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.notebooks.inputs.InstanceAcceleratorConfigGetArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceContainerImageGetArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceReservationAffinityGetArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceShieldedInstanceConfigGetArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceVmImageGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * The hardware accelerator used on this instance. If you use accelerators,
     * make sure that your configuration has enough vCPUs and memory to support the
     * machineType you have selected.
     * Structure is documented below.
     * 
     */
    @Import(name="acceleratorConfig")
      private final @Nullable Output<InstanceAcceleratorConfigGetArgs> acceleratorConfig;

    public Output<InstanceAcceleratorConfigGetArgs> acceleratorConfig() {
        return this.acceleratorConfig == null ? Codegen.empty() : this.acceleratorConfig;
    }

    /**
     * The size of the boot disk in GB attached to this instance,
     * up to a maximum of 64000 GB (64 TB). The minimum recommended value is 100 GB.
     * If not specified, this defaults to 100.
     * 
     */
    @Import(name="bootDiskSizeGb")
      private final @Nullable Output<Integer> bootDiskSizeGb;

    public Output<Integer> bootDiskSizeGb() {
        return this.bootDiskSizeGb == null ? Codegen.empty() : this.bootDiskSizeGb;
    }

    /**
     * Possible disk types for notebook instances.
     * Possible values are `DISK_TYPE_UNSPECIFIED`, `PD_STANDARD`, `PD_SSD`, and `PD_BALANCED`.
     * 
     */
    @Import(name="bootDiskType")
      private final @Nullable Output<String> bootDiskType;

    public Output<String> bootDiskType() {
        return this.bootDiskType == null ? Codegen.empty() : this.bootDiskType;
    }

    /**
     * Use a container image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="containerImage")
      private final @Nullable Output<InstanceContainerImageGetArgs> containerImage;

    public Output<InstanceContainerImageGetArgs> containerImage() {
        return this.containerImage == null ? Codegen.empty() : this.containerImage;
    }

    /**
     * Instance creation time
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we'll automatically choose from official GPU drivers.
     * 
     */
    @Import(name="customGpuDriverPath")
      private final @Nullable Output<String> customGpuDriverPath;

    public Output<String> customGpuDriverPath() {
        return this.customGpuDriverPath == null ? Codegen.empty() : this.customGpuDriverPath;
    }

    /**
     * The size of the data disk in GB attached to this instance,
     * up to a maximum of 64000 GB (64 TB).
     * You can choose the size of the data disk based on how big your notebooks and data are.
     * If not specified, this defaults to 100.
     * 
     */
    @Import(name="dataDiskSizeGb")
      private final @Nullable Output<Integer> dataDiskSizeGb;

    public Output<Integer> dataDiskSizeGb() {
        return this.dataDiskSizeGb == null ? Codegen.empty() : this.dataDiskSizeGb;
    }

    /**
     * Possible disk types for notebook instances.
     * Possible values are `DISK_TYPE_UNSPECIFIED`, `PD_STANDARD`, `PD_SSD`, and `PD_BALANCED`.
     * 
     */
    @Import(name="dataDiskType")
      private final @Nullable Output<String> dataDiskType;

    public Output<String> dataDiskType() {
        return this.dataDiskType == null ? Codegen.empty() : this.dataDiskType;
    }

    /**
     * Disk encryption method used on the boot and data disks, defaults to GMEK.
     * Possible values are `DISK_ENCRYPTION_UNSPECIFIED`, `GMEK`, and `CMEK`.
     * 
     */
    @Import(name="diskEncryption")
      private final @Nullable Output<String> diskEncryption;

    public Output<String> diskEncryption() {
        return this.diskEncryption == null ? Codegen.empty() : this.diskEncryption;
    }

    /**
     * Whether the end user authorizes Google Cloud to install GPU driver
     * on this instance. If this field is empty or set to false, the GPU driver
     * won't be installed. Only applicable to instances with GPUs.
     * 
     */
    @Import(name="installGpuDriver")
      private final @Nullable Output<Boolean> installGpuDriver;

    public Output<Boolean> installGpuDriver() {
        return this.installGpuDriver == null ? Codegen.empty() : this.installGpuDriver;
    }

    /**
     * The list of owners of this instance after creation.
     * Format: alias@example.com.
     * Currently supports one owner only.
     * If not specified, all of the service account users of
     * your VM instance's service account can use the instance.
     * 
     */
    @Import(name="instanceOwners")
      private final @Nullable Output<List<String>> instanceOwners;

    public Output<List<String>> instanceOwners() {
        return this.instanceOwners == null ? Codegen.empty() : this.instanceOwners;
    }

    /**
     * The KMS key used to encrypt the disks, only applicable if diskEncryption is CMEK.
     * Format: projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}
     * 
     */
    @Import(name="kmsKey")
      private final @Nullable Output<String> kmsKey;

    public Output<String> kmsKey() {
        return this.kmsKey == null ? Codegen.empty() : this.kmsKey;
    }

    /**
     * Labels to apply to this instance. These can be later modified by the setLabels method.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * A reference to a machine type which defines VM kind.
     * 
     */
    @Import(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> machineType() {
        return this.machineType == null ? Codegen.empty() : this.machineType;
    }

    /**
     * Custom metadata to apply to this instance.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * The name specified for the Notebook instance.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The name of the VPC that this instance is in.
     * Format: projects/{project_id}/global/networks/{network_id}
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * The type of vNIC driver.
     * Possible values are `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, and `GVNIC`.
     * 
     */
    @Import(name="nicType")
      private final @Nullable Output<String> nicType;

    public Output<String> nicType() {
        return this.nicType == null ? Codegen.empty() : this.nicType;
    }

    /**
     * The notebook instance will not register with the proxy..
     * 
     */
    @Import(name="noProxyAccess")
      private final @Nullable Output<Boolean> noProxyAccess;

    public Output<Boolean> noProxyAccess() {
        return this.noProxyAccess == null ? Codegen.empty() : this.noProxyAccess;
    }

    /**
     * No public IP will be assigned to this instance.
     * 
     */
    @Import(name="noPublicIp")
      private final @Nullable Output<Boolean> noPublicIp;

    public Output<Boolean> noPublicIp() {
        return this.noPublicIp == null ? Codegen.empty() : this.noPublicIp;
    }

    /**
     * If true, the data disk will not be auto deleted when deleting the instance.
     * 
     */
    @Import(name="noRemoveDataDisk")
      private final @Nullable Output<Boolean> noRemoveDataDisk;

    public Output<Boolean> noRemoveDataDisk() {
        return this.noRemoveDataDisk == null ? Codegen.empty() : this.noRemoveDataDisk;
    }

    /**
     * Path to a Bash script that automatically runs after a
     * notebook instance fully boots up. The path must be a URL
     * or Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    @Import(name="postStartupScript")
      private final @Nullable Output<String> postStartupScript;

    public Output<String> postStartupScript() {
        return this.postStartupScript == null ? Codegen.empty() : this.postStartupScript;
    }

    /**
     * The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The proxy endpoint that is used to access the Jupyter notebook.
     * 
     */
    @Import(name="proxyUri")
      private final @Nullable Output<String> proxyUri;

    public Output<String> proxyUri() {
        return this.proxyUri == null ? Codegen.empty() : this.proxyUri;
    }

    /**
     * Reservation Affinity for consuming Zonal reservation.
     * Structure is documented below.
     * 
     */
    @Import(name="reservationAffinity")
      private final @Nullable Output<InstanceReservationAffinityGetArgs> reservationAffinity;

    public Output<InstanceReservationAffinityGetArgs> reservationAffinity() {
        return this.reservationAffinity == null ? Codegen.empty() : this.reservationAffinity;
    }

    /**
     * The service account on this instance, giving access to other
     * Google Cloud services. You can use any service account within
     * the same project, but you must have the service account user
     * permission to use the instance. If not specified,
     * the Compute Engine default service account is used.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> serviceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances.
     * If not specified, the following scopes are defined:
     * - https://www.googleapis.com/auth/cloud-platform
     * - https://www.googleapis.com/auth/userinfo.email
     * 
     */
    @Import(name="serviceAccountScopes")
      private final @Nullable Output<List<String>> serviceAccountScopes;

    public Output<List<String>> serviceAccountScopes() {
        return this.serviceAccountScopes == null ? Codegen.empty() : this.serviceAccountScopes;
    }

    /**
     * A set of Shielded Instance options. Check [Images using supported Shielded VM features]
     * Not all combinations are valid
     * Structure is documented below.
     * 
     */
    @Import(name="shieldedInstanceConfig")
      private final @Nullable Output<InstanceShieldedInstanceConfigGetArgs> shieldedInstanceConfig;

    public Output<InstanceShieldedInstanceConfigGetArgs> shieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Codegen.empty() : this.shieldedInstanceConfig;
    }

    /**
     * The state of this instance.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    /**
     * The name of the subnet that this instance is in.
     * Format: projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}
     * 
     */
    @Import(name="subnet")
      private final @Nullable Output<String> subnet;

    public Output<String> subnet() {
        return this.subnet == null ? Codegen.empty() : this.subnet;
    }

    /**
     * The Compute Engine tags to add to instance.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Instance update time.
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> updateTime() {
        return this.updateTime == null ? Codegen.empty() : this.updateTime;
    }

    /**
     * Use a Compute Engine VM image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="vmImage")
      private final @Nullable Output<InstanceVmImageGetArgs> vmImage;

    public Output<InstanceVmImageGetArgs> vmImage() {
        return this.vmImage == null ? Codegen.empty() : this.vmImage;
    }

    public InstanceState(
        @Nullable Output<InstanceAcceleratorConfigGetArgs> acceleratorConfig,
        @Nullable Output<Integer> bootDiskSizeGb,
        @Nullable Output<String> bootDiskType,
        @Nullable Output<InstanceContainerImageGetArgs> containerImage,
        @Nullable Output<String> createTime,
        @Nullable Output<String> customGpuDriverPath,
        @Nullable Output<Integer> dataDiskSizeGb,
        @Nullable Output<String> dataDiskType,
        @Nullable Output<String> diskEncryption,
        @Nullable Output<Boolean> installGpuDriver,
        @Nullable Output<List<String>> instanceOwners,
        @Nullable Output<String> kmsKey,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> machineType,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<String> nicType,
        @Nullable Output<Boolean> noProxyAccess,
        @Nullable Output<Boolean> noPublicIp,
        @Nullable Output<Boolean> noRemoveDataDisk,
        @Nullable Output<String> postStartupScript,
        @Nullable Output<String> project,
        @Nullable Output<String> proxyUri,
        @Nullable Output<InstanceReservationAffinityGetArgs> reservationAffinity,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<List<String>> serviceAccountScopes,
        @Nullable Output<InstanceShieldedInstanceConfigGetArgs> shieldedInstanceConfig,
        @Nullable Output<String> state,
        @Nullable Output<String> subnet,
        @Nullable Output<List<String>> tags,
        @Nullable Output<String> updateTime,
        @Nullable Output<InstanceVmImageGetArgs> vmImage) {
        this.acceleratorConfig = acceleratorConfig;
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.bootDiskType = bootDiskType;
        this.containerImage = containerImage;
        this.createTime = createTime;
        this.customGpuDriverPath = customGpuDriverPath;
        this.dataDiskSizeGb = dataDiskSizeGb;
        this.dataDiskType = dataDiskType;
        this.diskEncryption = diskEncryption;
        this.installGpuDriver = installGpuDriver;
        this.instanceOwners = instanceOwners;
        this.kmsKey = kmsKey;
        this.labels = labels;
        this.location = location;
        this.machineType = machineType;
        this.metadata = metadata;
        this.name = name;
        this.network = network;
        this.nicType = nicType;
        this.noProxyAccess = noProxyAccess;
        this.noPublicIp = noPublicIp;
        this.noRemoveDataDisk = noRemoveDataDisk;
        this.postStartupScript = postStartupScript;
        this.project = project;
        this.proxyUri = proxyUri;
        this.reservationAffinity = reservationAffinity;
        this.serviceAccount = serviceAccount;
        this.serviceAccountScopes = serviceAccountScopes;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.state = state;
        this.subnet = subnet;
        this.tags = tags;
        this.updateTime = updateTime;
        this.vmImage = vmImage;
    }

    private InstanceState() {
        this.acceleratorConfig = Codegen.empty();
        this.bootDiskSizeGb = Codegen.empty();
        this.bootDiskType = Codegen.empty();
        this.containerImage = Codegen.empty();
        this.createTime = Codegen.empty();
        this.customGpuDriverPath = Codegen.empty();
        this.dataDiskSizeGb = Codegen.empty();
        this.dataDiskType = Codegen.empty();
        this.diskEncryption = Codegen.empty();
        this.installGpuDriver = Codegen.empty();
        this.instanceOwners = Codegen.empty();
        this.kmsKey = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.machineType = Codegen.empty();
        this.metadata = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.nicType = Codegen.empty();
        this.noProxyAccess = Codegen.empty();
        this.noPublicIp = Codegen.empty();
        this.noRemoveDataDisk = Codegen.empty();
        this.postStartupScript = Codegen.empty();
        this.project = Codegen.empty();
        this.proxyUri = Codegen.empty();
        this.reservationAffinity = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.serviceAccountScopes = Codegen.empty();
        this.shieldedInstanceConfig = Codegen.empty();
        this.state = Codegen.empty();
        this.subnet = Codegen.empty();
        this.tags = Codegen.empty();
        this.updateTime = Codegen.empty();
        this.vmImage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceAcceleratorConfigGetArgs> acceleratorConfig;
        private @Nullable Output<Integer> bootDiskSizeGb;
        private @Nullable Output<String> bootDiskType;
        private @Nullable Output<InstanceContainerImageGetArgs> containerImage;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> customGpuDriverPath;
        private @Nullable Output<Integer> dataDiskSizeGb;
        private @Nullable Output<String> dataDiskType;
        private @Nullable Output<String> diskEncryption;
        private @Nullable Output<Boolean> installGpuDriver;
        private @Nullable Output<List<String>> instanceOwners;
        private @Nullable Output<String> kmsKey;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> machineType;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<String> nicType;
        private @Nullable Output<Boolean> noProxyAccess;
        private @Nullable Output<Boolean> noPublicIp;
        private @Nullable Output<Boolean> noRemoveDataDisk;
        private @Nullable Output<String> postStartupScript;
        private @Nullable Output<String> project;
        private @Nullable Output<String> proxyUri;
        private @Nullable Output<InstanceReservationAffinityGetArgs> reservationAffinity;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<List<String>> serviceAccountScopes;
        private @Nullable Output<InstanceShieldedInstanceConfigGetArgs> shieldedInstanceConfig;
        private @Nullable Output<String> state;
        private @Nullable Output<String> subnet;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<String> updateTime;
        private @Nullable Output<InstanceVmImageGetArgs> vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
    	      this.containerImage = defaults.containerImage;
    	      this.createTime = defaults.createTime;
    	      this.customGpuDriverPath = defaults.customGpuDriverPath;
    	      this.dataDiskSizeGb = defaults.dataDiskSizeGb;
    	      this.dataDiskType = defaults.dataDiskType;
    	      this.diskEncryption = defaults.diskEncryption;
    	      this.installGpuDriver = defaults.installGpuDriver;
    	      this.instanceOwners = defaults.instanceOwners;
    	      this.kmsKey = defaults.kmsKey;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.nicType = defaults.nicType;
    	      this.noProxyAccess = defaults.noProxyAccess;
    	      this.noPublicIp = defaults.noPublicIp;
    	      this.noRemoveDataDisk = defaults.noRemoveDataDisk;
    	      this.postStartupScript = defaults.postStartupScript;
    	      this.project = defaults.project;
    	      this.proxyUri = defaults.proxyUri;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceAccountScopes = defaults.serviceAccountScopes;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.state = defaults.state;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
    	      this.updateTime = defaults.updateTime;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder acceleratorConfig(@Nullable Output<InstanceAcceleratorConfigGetArgs> acceleratorConfig) {
            this.acceleratorConfig = acceleratorConfig;
            return this;
        }
        public Builder acceleratorConfig(@Nullable InstanceAcceleratorConfigGetArgs acceleratorConfig) {
            this.acceleratorConfig = Codegen.ofNullable(acceleratorConfig);
            return this;
        }
        public Builder bootDiskSizeGb(@Nullable Output<Integer> bootDiskSizeGb) {
            this.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }
        public Builder bootDiskSizeGb(@Nullable Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = Codegen.ofNullable(bootDiskSizeGb);
            return this;
        }
        public Builder bootDiskType(@Nullable Output<String> bootDiskType) {
            this.bootDiskType = bootDiskType;
            return this;
        }
        public Builder bootDiskType(@Nullable String bootDiskType) {
            this.bootDiskType = Codegen.ofNullable(bootDiskType);
            return this;
        }
        public Builder containerImage(@Nullable Output<InstanceContainerImageGetArgs> containerImage) {
            this.containerImage = containerImage;
            return this;
        }
        public Builder containerImage(@Nullable InstanceContainerImageGetArgs containerImage) {
            this.containerImage = Codegen.ofNullable(containerImage);
            return this;
        }
        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
            return this;
        }
        public Builder customGpuDriverPath(@Nullable Output<String> customGpuDriverPath) {
            this.customGpuDriverPath = customGpuDriverPath;
            return this;
        }
        public Builder customGpuDriverPath(@Nullable String customGpuDriverPath) {
            this.customGpuDriverPath = Codegen.ofNullable(customGpuDriverPath);
            return this;
        }
        public Builder dataDiskSizeGb(@Nullable Output<Integer> dataDiskSizeGb) {
            this.dataDiskSizeGb = dataDiskSizeGb;
            return this;
        }
        public Builder dataDiskSizeGb(@Nullable Integer dataDiskSizeGb) {
            this.dataDiskSizeGb = Codegen.ofNullable(dataDiskSizeGb);
            return this;
        }
        public Builder dataDiskType(@Nullable Output<String> dataDiskType) {
            this.dataDiskType = dataDiskType;
            return this;
        }
        public Builder dataDiskType(@Nullable String dataDiskType) {
            this.dataDiskType = Codegen.ofNullable(dataDiskType);
            return this;
        }
        public Builder diskEncryption(@Nullable Output<String> diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Builder diskEncryption(@Nullable String diskEncryption) {
            this.diskEncryption = Codegen.ofNullable(diskEncryption);
            return this;
        }
        public Builder installGpuDriver(@Nullable Output<Boolean> installGpuDriver) {
            this.installGpuDriver = installGpuDriver;
            return this;
        }
        public Builder installGpuDriver(@Nullable Boolean installGpuDriver) {
            this.installGpuDriver = Codegen.ofNullable(installGpuDriver);
            return this;
        }
        public Builder instanceOwners(@Nullable Output<List<String>> instanceOwners) {
            this.instanceOwners = instanceOwners;
            return this;
        }
        public Builder instanceOwners(@Nullable List<String> instanceOwners) {
            this.instanceOwners = Codegen.ofNullable(instanceOwners);
            return this;
        }
        public Builder instanceOwners(String... instanceOwners) {
            return instanceOwners(List.of(instanceOwners));
        }
        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = Codegen.ofNullable(kmsKey);
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
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable String network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder nicType(@Nullable Output<String> nicType) {
            this.nicType = nicType;
            return this;
        }
        public Builder nicType(@Nullable String nicType) {
            this.nicType = Codegen.ofNullable(nicType);
            return this;
        }
        public Builder noProxyAccess(@Nullable Output<Boolean> noProxyAccess) {
            this.noProxyAccess = noProxyAccess;
            return this;
        }
        public Builder noProxyAccess(@Nullable Boolean noProxyAccess) {
            this.noProxyAccess = Codegen.ofNullable(noProxyAccess);
            return this;
        }
        public Builder noPublicIp(@Nullable Output<Boolean> noPublicIp) {
            this.noPublicIp = noPublicIp;
            return this;
        }
        public Builder noPublicIp(@Nullable Boolean noPublicIp) {
            this.noPublicIp = Codegen.ofNullable(noPublicIp);
            return this;
        }
        public Builder noRemoveDataDisk(@Nullable Output<Boolean> noRemoveDataDisk) {
            this.noRemoveDataDisk = noRemoveDataDisk;
            return this;
        }
        public Builder noRemoveDataDisk(@Nullable Boolean noRemoveDataDisk) {
            this.noRemoveDataDisk = Codegen.ofNullable(noRemoveDataDisk);
            return this;
        }
        public Builder postStartupScript(@Nullable Output<String> postStartupScript) {
            this.postStartupScript = postStartupScript;
            return this;
        }
        public Builder postStartupScript(@Nullable String postStartupScript) {
            this.postStartupScript = Codegen.ofNullable(postStartupScript);
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
        public Builder proxyUri(@Nullable Output<String> proxyUri) {
            this.proxyUri = proxyUri;
            return this;
        }
        public Builder proxyUri(@Nullable String proxyUri) {
            this.proxyUri = Codegen.ofNullable(proxyUri);
            return this;
        }
        public Builder reservationAffinity(@Nullable Output<InstanceReservationAffinityGetArgs> reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }
        public Builder reservationAffinity(@Nullable InstanceReservationAffinityGetArgs reservationAffinity) {
            this.reservationAffinity = Codegen.ofNullable(reservationAffinity);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder serviceAccountScopes(@Nullable Output<List<String>> serviceAccountScopes) {
            this.serviceAccountScopes = serviceAccountScopes;
            return this;
        }
        public Builder serviceAccountScopes(@Nullable List<String> serviceAccountScopes) {
            this.serviceAccountScopes = Codegen.ofNullable(serviceAccountScopes);
            return this;
        }
        public Builder serviceAccountScopes(String... serviceAccountScopes) {
            return serviceAccountScopes(List.of(serviceAccountScopes));
        }
        public Builder shieldedInstanceConfig(@Nullable Output<InstanceShieldedInstanceConfigGetArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }
        public Builder shieldedInstanceConfig(@Nullable InstanceShieldedInstanceConfigGetArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Codegen.ofNullable(shieldedInstanceConfig);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }
        public Builder subnet(@Nullable Output<String> subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder subnet(@Nullable String subnet) {
            this.subnet = Codegen.ofNullable(subnet);
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
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Codegen.ofNullable(updateTime);
            return this;
        }
        public Builder vmImage(@Nullable Output<InstanceVmImageGetArgs> vmImage) {
            this.vmImage = vmImage;
            return this;
        }
        public Builder vmImage(@Nullable InstanceVmImageGetArgs vmImage) {
            this.vmImage = Codegen.ofNullable(vmImage);
            return this;
        }        public InstanceState build() {
            return new InstanceState(acceleratorConfig, bootDiskSizeGb, bootDiskType, containerImage, createTime, customGpuDriverPath, dataDiskSizeGb, dataDiskType, diskEncryption, installGpuDriver, instanceOwners, kmsKey, labels, location, machineType, metadata, name, network, nicType, noProxyAccess, noPublicIp, noRemoveDataDisk, postStartupScript, project, proxyUri, reservationAffinity, serviceAccount, serviceAccountScopes, shieldedInstanceConfig, state, subnet, tags, updateTime, vmImage);
        }
    }
}
