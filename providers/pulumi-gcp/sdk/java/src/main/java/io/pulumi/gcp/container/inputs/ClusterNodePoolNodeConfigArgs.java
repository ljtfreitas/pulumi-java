// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigEphemeralStorageConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGcfsConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigGuestAcceleratorArgs;
import io.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigKubeletConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigLinuxNodeConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigSandboxConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigShieldedInstanceConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigTaintArgs;
import io.pulumi.gcp.container.inputs.ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterNodePoolNodeConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNodeConfigArgs Empty = new ClusterNodePoolNodeConfigArgs();

    /**
     * The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: <https://cloud.google.com/compute/docs/disks/customer-managed-encryption>
     * 
     */
    @InputImport(name="bootDiskKmsKey")
        private final @Nullable Input<String> bootDiskKmsKey;

    public Input<String> getBootDiskKmsKey() {
        return this.bootDiskKmsKey == null ? Input.empty() : this.bootDiskKmsKey;
    }

    /**
     * Size of the disk attached to each node, specified
     * in GB. The smallest allowed disk size is 10GB. Defaults to 100GB.
     * 
     */
    @InputImport(name="diskSizeGb")
        private final @Nullable Input<Integer> diskSizeGb;

    public Input<Integer> getDiskSizeGb() {
        return this.diskSizeGb == null ? Input.empty() : this.diskSizeGb;
    }

    /**
     * Type of the disk attached to each node
     * (e.g. 'pd-standard', 'pd-balanced' or 'pd-ssd'). If unspecified, the default disk type is 'pd-standard'
     * 
     */
    @InputImport(name="diskType")
        private final @Nullable Input<String> diskType;

    public Input<String> getDiskType() {
        return this.diskType == null ? Input.empty() : this.diskType;
    }

    /**
     * Parameters for the ephemeral storage filesystem. If unspecified, ephemeral storage is backed by the boot disk. Structure is documented below.
     * 
     */
    @InputImport(name="ephemeralStorageConfig")
        private final @Nullable Input<ClusterNodePoolNodeConfigEphemeralStorageConfigArgs> ephemeralStorageConfig;

    public Input<ClusterNodePoolNodeConfigEphemeralStorageConfigArgs> getEphemeralStorageConfig() {
        return this.ephemeralStorageConfig == null ? Input.empty() : this.ephemeralStorageConfig;
    }

    /**
     * Parameters for the Google Container Filesystem (GCFS).
     * If unspecified, GCFS will not be enabled on the node pool. When enabling this feature you must specify `image_type = "COS_CONTAINERD"` and `node_version` from GKE versions 1.19 or later to use it.
     * For GKE versions 1.19, 1.20, and 1.21, the recommended minimum `node_version` would be 1.19.15-gke.1300, 1.20.11-gke.1300, and 1.21.5-gke.1300 respectively.
     * A `machine_type` that has more than 16 GiB of memory is also recommended.
     * GCFS must be enabled in order to use [image streaming](https://cloud.google.com/kubernetes-engine/docs/how-to/image-streaming).
     * Structure is documented below.
     * 
     */
    @InputImport(name="gcfsConfig")
        private final @Nullable Input<ClusterNodePoolNodeConfigGcfsConfigArgs> gcfsConfig;

    public Input<ClusterNodePoolNodeConfigGcfsConfigArgs> getGcfsConfig() {
        return this.gcfsConfig == null ? Input.empty() : this.gcfsConfig;
    }

    /**
     * List of the type and count of accelerator cards attached to the instance.
     * Structure documented below.
     * 
     */
    @InputImport(name="guestAccelerators")
        private final @Nullable Input<List<ClusterNodePoolNodeConfigGuestAcceleratorArgs>> guestAccelerators;

    public Input<List<ClusterNodePoolNodeConfigGuestAcceleratorArgs>> getGuestAccelerators() {
        return this.guestAccelerators == null ? Input.empty() : this.guestAccelerators;
    }

    /**
     * The image type to use for this node. Note that changing the image type
     * will delete and recreate all nodes in the node pool.
     * 
     */
    @InputImport(name="imageType")
        private final @Nullable Input<String> imageType;

    public Input<String> getImageType() {
        return this.imageType == null ? Input.empty() : this.imageType;
    }

    /**
     * Kubelet configuration, currently supported attributes can be found [here](https://cloud.google.com/sdk/gcloud/reference/beta/container/node-pools/create#--system-config-from-file).
     * Structure is documented below.
     * 
     */
    @InputImport(name="kubeletConfig")
        private final @Nullable Input<ClusterNodePoolNodeConfigKubeletConfigArgs> kubeletConfig;

    public Input<ClusterNodePoolNodeConfigKubeletConfigArgs> getKubeletConfig() {
        return this.kubeletConfig == null ? Input.empty() : this.kubeletConfig;
    }

    /**
     * The Kubernetes labels (key/value pairs) to be applied to each node. The kubernetes.io/ and k8s.io/ prefixes are
     * reserved by Kubernetes Core components and cannot be specified.
     * 
     */
    @InputImport(name="labels")
        private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Linux node configuration, currently supported attributes can be found [here](https://cloud.google.com/sdk/gcloud/reference/beta/container/node-pools/create#--system-config-from-file).
     * Note that validations happen all server side. All attributes are optional.
     * Structure is documented below.
     * 
     */
    @InputImport(name="linuxNodeConfig")
        private final @Nullable Input<ClusterNodePoolNodeConfigLinuxNodeConfigArgs> linuxNodeConfig;

    public Input<ClusterNodePoolNodeConfigLinuxNodeConfigArgs> getLinuxNodeConfig() {
        return this.linuxNodeConfig == null ? Input.empty() : this.linuxNodeConfig;
    }

    /**
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
     */
    @InputImport(name="localSsdCount")
        private final @Nullable Input<Integer> localSsdCount;

    public Input<Integer> getLocalSsdCount() {
        return this.localSsdCount == null ? Input.empty() : this.localSsdCount;
    }

    /**
     * The name of a Google Compute Engine machine type.
     * Defaults to `e2-medium`. To create a custom machine type, value should be set as specified
     * [here](https://cloud.google.com/compute/docs/reference/latest/instances#machineType).
     * 
     */
    @InputImport(name="machineType")
        private final @Nullable Input<String> machineType;

    public Input<String> getMachineType() {
        return this.machineType == null ? Input.empty() : this.machineType;
    }

    /**
     * The metadata key/value pairs assigned to instances in
     * the cluster. From GKE `1.12` onwards, `disable-legacy-endpoints` is set to
     * `true` by the API; if `metadata` is set but that default value is not
     * included, the provider will attempt to unset the value. To avoid this, set the
     * value in your config.
     * 
     */
    @InputImport(name="metadata")
        private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Minimum CPU platform to be used by this instance.
     * The instance may be scheduled on the specified or newer CPU platform. Applicable
     * values are the friendly names of CPU platforms, such as `Intel Haswell`. See the
     * [official documentation](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * for more information.
     * 
     */
    @InputImport(name="minCpuPlatform")
        private final @Nullable Input<String> minCpuPlatform;

    public Input<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Input.empty() : this.minCpuPlatform;
    }

    /**
     * Setting this field will assign instances of this pool to run on the specified node group. This is useful for running workloads on [sole tenant nodes](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes).
     * 
     */
    @InputImport(name="nodeGroup")
        private final @Nullable Input<String> nodeGroup;

    public Input<String> getNodeGroup() {
        return this.nodeGroup == null ? Input.empty() : this.nodeGroup;
    }

    /**
     * The set of Google API scopes to be made available
     * on all of the node VMs under the "default" service account.
     * Use the "https://www.googleapis.com/auth/cloud-platform" scope to grant access to all APIs. It is recommended that you set `service_account` to a non-default service account and grant IAM roles to that service account for only the resources that it needs.
     * 
     */
    @InputImport(name="oauthScopes")
        private final @Nullable Input<List<String>> oauthScopes;

    public Input<List<String>> getOauthScopes() {
        return this.oauthScopes == null ? Input.empty() : this.oauthScopes;
    }

    /**
     * A boolean that represents whether or not the underlying node VMs
     * are preemptible. See the [official documentation](https://cloud.google.com/container-engine/docs/preemptible-vm)
     * for more information. Defaults to false.
     * 
     */
    @InputImport(name="preemptible")
        private final @Nullable Input<Boolean> preemptible;

    public Input<Boolean> getPreemptible() {
        return this.preemptible == null ? Input.empty() : this.preemptible;
    }

    /**
     * [GKE Sandbox](https://cloud.google.com/kubernetes-engine/docs/how-to/sandbox-pods) configuration. When enabling this feature you must specify `image_type = "COS_CONTAINERD"` and `node_version = "1.12.7-gke.17"` or later to use it.
     * Structure is documented below.
     * 
     */
    @InputImport(name="sandboxConfig")
        private final @Nullable Input<ClusterNodePoolNodeConfigSandboxConfigArgs> sandboxConfig;

    public Input<ClusterNodePoolNodeConfigSandboxConfigArgs> getSandboxConfig() {
        return this.sandboxConfig == null ? Input.empty() : this.sandboxConfig;
    }

    /**
     * The service account to be used by the Node VMs.
     * If not specified, the "default" service account is used.
     * 
     */
    @InputImport(name="serviceAccount")
        private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    /**
     * Shielded Instance options. Structure is documented below.
     * 
     */
    @InputImport(name="shieldedInstanceConfig")
        private final @Nullable Input<ClusterNodePoolNodeConfigShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Input<ClusterNodePoolNodeConfigShieldedInstanceConfigArgs> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Input.empty() : this.shieldedInstanceConfig;
    }

    /**
     * ) A boolean
     * that represents whether the underlying node VMs are spot. See the [official documentation](https://cloud.google.com/kubernetes-engine/docs/concepts/spot-vms)
     * for more information. Defaults to false.
     * 
     */
    @InputImport(name="spot")
        private final @Nullable Input<Boolean> spot;

    public Input<Boolean> getSpot() {
        return this.spot == null ? Input.empty() : this.spot;
    }

    /**
     * The list of instance tags applied to all nodes. Tags are used to identify
     * valid sources or targets for network firewalls.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A list of [Kubernetes taints](https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/)
     * to apply to nodes. GKE's API can only set this field on cluster creation.
     * However, GKE will add taints to your nodes if you enable certain features such
     * as GPUs. If this field is set, any diffs on this field will cause the provider to
     * recreate the underlying resource. Taint values can be updated safely in
     * Kubernetes (eg. through `kubectl`), and it's recommended that you do not use
     * this field to manage taints. If you do, `lifecycle.ignore_changes` is
     * recommended. Structure is documented below.
     * 
     */
    @InputImport(name="taints")
        private final @Nullable Input<List<ClusterNodePoolNodeConfigTaintArgs>> taints;

    public Input<List<ClusterNodePoolNodeConfigTaintArgs>> getTaints() {
        return this.taints == null ? Input.empty() : this.taints;
    }

    /**
     * Metadata configuration to expose to workloads on the node pool.
     * Structure is documented below.
     * 
     */
    @InputImport(name="workloadMetadataConfig")
        private final @Nullable Input<ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs> workloadMetadataConfig;

    public Input<ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs> getWorkloadMetadataConfig() {
        return this.workloadMetadataConfig == null ? Input.empty() : this.workloadMetadataConfig;
    }

    public ClusterNodePoolNodeConfigArgs(
        @Nullable Input<String> bootDiskKmsKey,
        @Nullable Input<Integer> diskSizeGb,
        @Nullable Input<String> diskType,
        @Nullable Input<ClusterNodePoolNodeConfigEphemeralStorageConfigArgs> ephemeralStorageConfig,
        @Nullable Input<ClusterNodePoolNodeConfigGcfsConfigArgs> gcfsConfig,
        @Nullable Input<List<ClusterNodePoolNodeConfigGuestAcceleratorArgs>> guestAccelerators,
        @Nullable Input<String> imageType,
        @Nullable Input<ClusterNodePoolNodeConfigKubeletConfigArgs> kubeletConfig,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<ClusterNodePoolNodeConfigLinuxNodeConfigArgs> linuxNodeConfig,
        @Nullable Input<Integer> localSsdCount,
        @Nullable Input<String> machineType,
        @Nullable Input<Map<String,String>> metadata,
        @Nullable Input<String> minCpuPlatform,
        @Nullable Input<String> nodeGroup,
        @Nullable Input<List<String>> oauthScopes,
        @Nullable Input<Boolean> preemptible,
        @Nullable Input<ClusterNodePoolNodeConfigSandboxConfigArgs> sandboxConfig,
        @Nullable Input<String> serviceAccount,
        @Nullable Input<ClusterNodePoolNodeConfigShieldedInstanceConfigArgs> shieldedInstanceConfig,
        @Nullable Input<Boolean> spot,
        @Nullable Input<List<String>> tags,
        @Nullable Input<List<ClusterNodePoolNodeConfigTaintArgs>> taints,
        @Nullable Input<ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs> workloadMetadataConfig) {
        this.bootDiskKmsKey = bootDiskKmsKey;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.ephemeralStorageConfig = ephemeralStorageConfig;
        this.gcfsConfig = gcfsConfig;
        this.guestAccelerators = guestAccelerators;
        this.imageType = imageType;
        this.kubeletConfig = kubeletConfig;
        this.labels = labels;
        this.linuxNodeConfig = linuxNodeConfig;
        this.localSsdCount = localSsdCount;
        this.machineType = machineType;
        this.metadata = metadata;
        this.minCpuPlatform = minCpuPlatform;
        this.nodeGroup = nodeGroup;
        this.oauthScopes = oauthScopes;
        this.preemptible = preemptible;
        this.sandboxConfig = sandboxConfig;
        this.serviceAccount = serviceAccount;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.spot = spot;
        this.tags = tags;
        this.taints = taints;
        this.workloadMetadataConfig = workloadMetadataConfig;
    }

    private ClusterNodePoolNodeConfigArgs() {
        this.bootDiskKmsKey = Input.empty();
        this.diskSizeGb = Input.empty();
        this.diskType = Input.empty();
        this.ephemeralStorageConfig = Input.empty();
        this.gcfsConfig = Input.empty();
        this.guestAccelerators = Input.empty();
        this.imageType = Input.empty();
        this.kubeletConfig = Input.empty();
        this.labels = Input.empty();
        this.linuxNodeConfig = Input.empty();
        this.localSsdCount = Input.empty();
        this.machineType = Input.empty();
        this.metadata = Input.empty();
        this.minCpuPlatform = Input.empty();
        this.nodeGroup = Input.empty();
        this.oauthScopes = Input.empty();
        this.preemptible = Input.empty();
        this.sandboxConfig = Input.empty();
        this.serviceAccount = Input.empty();
        this.shieldedInstanceConfig = Input.empty();
        this.spot = Input.empty();
        this.tags = Input.empty();
        this.taints = Input.empty();
        this.workloadMetadataConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> bootDiskKmsKey;
        private @Nullable Input<Integer> diskSizeGb;
        private @Nullable Input<String> diskType;
        private @Nullable Input<ClusterNodePoolNodeConfigEphemeralStorageConfigArgs> ephemeralStorageConfig;
        private @Nullable Input<ClusterNodePoolNodeConfigGcfsConfigArgs> gcfsConfig;
        private @Nullable Input<List<ClusterNodePoolNodeConfigGuestAcceleratorArgs>> guestAccelerators;
        private @Nullable Input<String> imageType;
        private @Nullable Input<ClusterNodePoolNodeConfigKubeletConfigArgs> kubeletConfig;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<ClusterNodePoolNodeConfigLinuxNodeConfigArgs> linuxNodeConfig;
        private @Nullable Input<Integer> localSsdCount;
        private @Nullable Input<String> machineType;
        private @Nullable Input<Map<String,String>> metadata;
        private @Nullable Input<String> minCpuPlatform;
        private @Nullable Input<String> nodeGroup;
        private @Nullable Input<List<String>> oauthScopes;
        private @Nullable Input<Boolean> preemptible;
        private @Nullable Input<ClusterNodePoolNodeConfigSandboxConfigArgs> sandboxConfig;
        private @Nullable Input<String> serviceAccount;
        private @Nullable Input<ClusterNodePoolNodeConfigShieldedInstanceConfigArgs> shieldedInstanceConfig;
        private @Nullable Input<Boolean> spot;
        private @Nullable Input<List<String>> tags;
        private @Nullable Input<List<ClusterNodePoolNodeConfigTaintArgs>> taints;
        private @Nullable Input<ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs> workloadMetadataConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodePoolNodeConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskKmsKey = defaults.bootDiskKmsKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.ephemeralStorageConfig = defaults.ephemeralStorageConfig;
    	      this.gcfsConfig = defaults.gcfsConfig;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.imageType = defaults.imageType;
    	      this.kubeletConfig = defaults.kubeletConfig;
    	      this.labels = defaults.labels;
    	      this.linuxNodeConfig = defaults.linuxNodeConfig;
    	      this.localSsdCount = defaults.localSsdCount;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.nodeGroup = defaults.nodeGroup;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.preemptible = defaults.preemptible;
    	      this.sandboxConfig = defaults.sandboxConfig;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.spot = defaults.spot;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.workloadMetadataConfig = defaults.workloadMetadataConfig;
        }

        public Builder setBootDiskKmsKey(@Nullable Input<String> bootDiskKmsKey) {
            this.bootDiskKmsKey = bootDiskKmsKey;
            return this;
        }

        public Builder setBootDiskKmsKey(@Nullable String bootDiskKmsKey) {
            this.bootDiskKmsKey = Input.ofNullable(bootDiskKmsKey);
            return this;
        }

        public Builder setDiskSizeGb(@Nullable Input<Integer> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder setDiskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = Input.ofNullable(diskSizeGb);
            return this;
        }

        public Builder setDiskType(@Nullable Input<String> diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder setDiskType(@Nullable String diskType) {
            this.diskType = Input.ofNullable(diskType);
            return this;
        }

        public Builder setEphemeralStorageConfig(@Nullable Input<ClusterNodePoolNodeConfigEphemeralStorageConfigArgs> ephemeralStorageConfig) {
            this.ephemeralStorageConfig = ephemeralStorageConfig;
            return this;
        }

        public Builder setEphemeralStorageConfig(@Nullable ClusterNodePoolNodeConfigEphemeralStorageConfigArgs ephemeralStorageConfig) {
            this.ephemeralStorageConfig = Input.ofNullable(ephemeralStorageConfig);
            return this;
        }

        public Builder setGcfsConfig(@Nullable Input<ClusterNodePoolNodeConfigGcfsConfigArgs> gcfsConfig) {
            this.gcfsConfig = gcfsConfig;
            return this;
        }

        public Builder setGcfsConfig(@Nullable ClusterNodePoolNodeConfigGcfsConfigArgs gcfsConfig) {
            this.gcfsConfig = Input.ofNullable(gcfsConfig);
            return this;
        }

        public Builder setGuestAccelerators(@Nullable Input<List<ClusterNodePoolNodeConfigGuestAcceleratorArgs>> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }

        public Builder setGuestAccelerators(@Nullable List<ClusterNodePoolNodeConfigGuestAcceleratorArgs> guestAccelerators) {
            this.guestAccelerators = Input.ofNullable(guestAccelerators);
            return this;
        }

        public Builder setImageType(@Nullable Input<String> imageType) {
            this.imageType = imageType;
            return this;
        }

        public Builder setImageType(@Nullable String imageType) {
            this.imageType = Input.ofNullable(imageType);
            return this;
        }

        public Builder setKubeletConfig(@Nullable Input<ClusterNodePoolNodeConfigKubeletConfigArgs> kubeletConfig) {
            this.kubeletConfig = kubeletConfig;
            return this;
        }

        public Builder setKubeletConfig(@Nullable ClusterNodePoolNodeConfigKubeletConfigArgs kubeletConfig) {
            this.kubeletConfig = Input.ofNullable(kubeletConfig);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setLinuxNodeConfig(@Nullable Input<ClusterNodePoolNodeConfigLinuxNodeConfigArgs> linuxNodeConfig) {
            this.linuxNodeConfig = linuxNodeConfig;
            return this;
        }

        public Builder setLinuxNodeConfig(@Nullable ClusterNodePoolNodeConfigLinuxNodeConfigArgs linuxNodeConfig) {
            this.linuxNodeConfig = Input.ofNullable(linuxNodeConfig);
            return this;
        }

        public Builder setLocalSsdCount(@Nullable Input<Integer> localSsdCount) {
            this.localSsdCount = localSsdCount;
            return this;
        }

        public Builder setLocalSsdCount(@Nullable Integer localSsdCount) {
            this.localSsdCount = Input.ofNullable(localSsdCount);
            return this;
        }

        public Builder setMachineType(@Nullable Input<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder setMachineType(@Nullable String machineType) {
            this.machineType = Input.ofNullable(machineType);
            return this;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable Input<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Input.ofNullable(minCpuPlatform);
            return this;
        }

        public Builder setNodeGroup(@Nullable Input<String> nodeGroup) {
            this.nodeGroup = nodeGroup;
            return this;
        }

        public Builder setNodeGroup(@Nullable String nodeGroup) {
            this.nodeGroup = Input.ofNullable(nodeGroup);
            return this;
        }

        public Builder setOauthScopes(@Nullable Input<List<String>> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }

        public Builder setOauthScopes(@Nullable List<String> oauthScopes) {
            this.oauthScopes = Input.ofNullable(oauthScopes);
            return this;
        }

        public Builder setPreemptible(@Nullable Input<Boolean> preemptible) {
            this.preemptible = preemptible;
            return this;
        }

        public Builder setPreemptible(@Nullable Boolean preemptible) {
            this.preemptible = Input.ofNullable(preemptible);
            return this;
        }

        public Builder setSandboxConfig(@Nullable Input<ClusterNodePoolNodeConfigSandboxConfigArgs> sandboxConfig) {
            this.sandboxConfig = sandboxConfig;
            return this;
        }

        public Builder setSandboxConfig(@Nullable ClusterNodePoolNodeConfigSandboxConfigArgs sandboxConfig) {
            this.sandboxConfig = Input.ofNullable(sandboxConfig);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }

        public Builder setShieldedInstanceConfig(@Nullable Input<ClusterNodePoolNodeConfigShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder setShieldedInstanceConfig(@Nullable ClusterNodePoolNodeConfigShieldedInstanceConfigArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Input.ofNullable(shieldedInstanceConfig);
            return this;
        }

        public Builder setSpot(@Nullable Input<Boolean> spot) {
            this.spot = spot;
            return this;
        }

        public Builder setSpot(@Nullable Boolean spot) {
            this.spot = Input.ofNullable(spot);
            return this;
        }

        public Builder setTags(@Nullable Input<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTaints(@Nullable Input<List<ClusterNodePoolNodeConfigTaintArgs>> taints) {
            this.taints = taints;
            return this;
        }

        public Builder setTaints(@Nullable List<ClusterNodePoolNodeConfigTaintArgs> taints) {
            this.taints = Input.ofNullable(taints);
            return this;
        }

        public Builder setWorkloadMetadataConfig(@Nullable Input<ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs> workloadMetadataConfig) {
            this.workloadMetadataConfig = workloadMetadataConfig;
            return this;
        }

        public Builder setWorkloadMetadataConfig(@Nullable ClusterNodePoolNodeConfigWorkloadMetadataConfigArgs workloadMetadataConfig) {
            this.workloadMetadataConfig = Input.ofNullable(workloadMetadataConfig);
            return this;
        }
        public ClusterNodePoolNodeConfigArgs build() {
            return new ClusterNodePoolNodeConfigArgs(bootDiskKmsKey, diskSizeGb, diskType, ephemeralStorageConfig, gcfsConfig, guestAccelerators, imageType, kubeletConfig, labels, linuxNodeConfig, localSsdCount, machineType, metadata, minCpuPlatform, nodeGroup, oauthScopes, preemptible, sandboxConfig, serviceAccount, shieldedInstanceConfig, spot, tags, taints, workloadMetadataConfig);
        }
    }
}
