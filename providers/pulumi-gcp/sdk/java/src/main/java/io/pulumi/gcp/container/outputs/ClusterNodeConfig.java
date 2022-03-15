// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.container.outputs.ClusterNodeConfigEphemeralStorageConfig;
import io.pulumi.gcp.container.outputs.ClusterNodeConfigGcfsConfig;
import io.pulumi.gcp.container.outputs.ClusterNodeConfigGuestAccelerator;
import io.pulumi.gcp.container.outputs.ClusterNodeConfigKubeletConfig;
import io.pulumi.gcp.container.outputs.ClusterNodeConfigLinuxNodeConfig;
import io.pulumi.gcp.container.outputs.ClusterNodeConfigSandboxConfig;
import io.pulumi.gcp.container.outputs.ClusterNodeConfigShieldedInstanceConfig;
import io.pulumi.gcp.container.outputs.ClusterNodeConfigTaint;
import io.pulumi.gcp.container.outputs.ClusterNodeConfigWorkloadMetadataConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNodeConfig {
    /**
     * The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: <https://cloud.google.com/compute/docs/disks/customer-managed-encryption>
     * 
     */
    private final @Nullable String bootDiskKmsKey;
    /**
     * Size of the disk attached to each node, specified
     * in GB. The smallest allowed disk size is 10GB. Defaults to 100GB.
     * 
     */
    private final @Nullable Integer diskSizeGb;
    /**
     * Type of the disk attached to each node
     * (e.g. 'pd-standard', 'pd-balanced' or 'pd-ssd'). If unspecified, the default disk type is 'pd-standard'
     * 
     */
    private final @Nullable String diskType;
    /**
     * Parameters for the ephemeral storage filesystem. If unspecified, ephemeral storage is backed by the boot disk. Structure is documented below.
     * 
     */
    private final @Nullable ClusterNodeConfigEphemeralStorageConfig ephemeralStorageConfig;
    /**
     * Parameters for the Google Container Filesystem (GCFS).
     * If unspecified, GCFS will not be enabled on the node pool. When enabling this feature you must specify `image_type = "COS_CONTAINERD"` and `node_version` from GKE versions 1.19 or later to use it.
     * For GKE versions 1.19, 1.20, and 1.21, the recommended minimum `node_version` would be 1.19.15-gke.1300, 1.20.11-gke.1300, and 1.21.5-gke.1300 respectively.
     * A `machine_type` that has more than 16 GiB of memory is also recommended.
     * GCFS must be enabled in order to use [image streaming](https://cloud.google.com/kubernetes-engine/docs/how-to/image-streaming).
     * Structure is documented below.
     * 
     */
    private final @Nullable ClusterNodeConfigGcfsConfig gcfsConfig;
    /**
     * List of the type and count of accelerator cards attached to the instance.
     * Structure documented below.
     * 
     */
    private final @Nullable List<ClusterNodeConfigGuestAccelerator> guestAccelerators;
    /**
     * The image type to use for this node. Note that changing the image type
     * will delete and recreate all nodes in the node pool.
     * 
     */
    private final @Nullable String imageType;
    /**
     * Kubelet configuration, currently supported attributes can be found [here](https://cloud.google.com/sdk/gcloud/reference/beta/container/node-pools/create#--system-config-from-file).
     * Structure is documented below.
     * 
     */
    private final @Nullable ClusterNodeConfigKubeletConfig kubeletConfig;
    /**
     * The Kubernetes labels (key/value pairs) to be applied to each node. The kubernetes.io/ and k8s.io/ prefixes are
     * reserved by Kubernetes Core components and cannot be specified.
     * 
     */
    private final @Nullable Map<String,String> labels;
    /**
     * Linux node configuration, currently supported attributes can be found [here](https://cloud.google.com/sdk/gcloud/reference/beta/container/node-pools/create#--system-config-from-file).
     * Note that validations happen all server side. All attributes are optional.
     * Structure is documented below.
     * 
     */
    private final @Nullable ClusterNodeConfigLinuxNodeConfig linuxNodeConfig;
    /**
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
     */
    private final @Nullable Integer localSsdCount;
    /**
     * The name of a Google Compute Engine machine type.
     * Defaults to `e2-medium`. To create a custom machine type, value should be set as specified
     * [here](https://cloud.google.com/compute/docs/reference/latest/instances#machineType).
     * 
     */
    private final @Nullable String machineType;
    /**
     * The metadata key/value pairs assigned to instances in
     * the cluster. From GKE `1.12` onwards, `disable-legacy-endpoints` is set to
     * `true` by the API; if `metadata` is set but that default value is not
     * included, the provider will attempt to unset the value. To avoid this, set the
     * value in your config.
     * 
     */
    private final @Nullable Map<String,String> metadata;
    /**
     * Minimum CPU platform to be used by this instance.
     * The instance may be scheduled on the specified or newer CPU platform. Applicable
     * values are the friendly names of CPU platforms, such as `Intel Haswell`. See the
     * [official documentation](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * for more information.
     * 
     */
    private final @Nullable String minCpuPlatform;
    /**
     * Setting this field will assign instances of this pool to run on the specified node group. This is useful for running workloads on [sole tenant nodes](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes).
     * 
     */
    private final @Nullable String nodeGroup;
    /**
     * The set of Google API scopes to be made available
     * on all of the node VMs under the "default" service account.
     * Use the "https://www.googleapis.com/auth/cloud-platform" scope to grant access to all APIs. It is recommended that you set `service_account` to a non-default service account and grant IAM roles to that service account for only the resources that it needs.
     * 
     */
    private final @Nullable List<String> oauthScopes;
    /**
     * A boolean that represents whether or not the underlying node VMs
     * are preemptible. See the [official documentation](https://cloud.google.com/container-engine/docs/preemptible-vm)
     * for more information. Defaults to false.
     * 
     */
    private final @Nullable Boolean preemptible;
    /**
     * [GKE Sandbox](https://cloud.google.com/kubernetes-engine/docs/how-to/sandbox-pods) configuration. When enabling this feature you must specify `image_type = "COS_CONTAINERD"` and `node_version = "1.12.7-gke.17"` or later to use it.
     * Structure is documented below.
     * 
     */
    private final @Nullable ClusterNodeConfigSandboxConfig sandboxConfig;
    /**
     * The service account to be used by the Node VMs.
     * If not specified, the "default" service account is used.
     * 
     */
    private final @Nullable String serviceAccount;
    /**
     * Shielded Instance options. Structure is documented below.
     * 
     */
    private final @Nullable ClusterNodeConfigShieldedInstanceConfig shieldedInstanceConfig;
    /**
     * ) A boolean
     * that represents whether the underlying node VMs are spot. See the [official documentation](https://cloud.google.com/kubernetes-engine/docs/concepts/spot-vms)
     * for more information. Defaults to false.
     * 
     */
    private final @Nullable Boolean spot;
    /**
     * The list of instance tags applied to all nodes. Tags are used to identify
     * valid sources or targets for network firewalls.
     * 
     */
    private final @Nullable List<String> tags;
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
    private final @Nullable List<ClusterNodeConfigTaint> taints;
    /**
     * Metadata configuration to expose to workloads on the node pool.
     * Structure is documented below.
     * 
     */
    private final @Nullable ClusterNodeConfigWorkloadMetadataConfig workloadMetadataConfig;

    @CustomType.Constructor
    private ClusterNodeConfig(
        @CustomType.Parameter("bootDiskKmsKey") @Nullable String bootDiskKmsKey,
        @CustomType.Parameter("diskSizeGb") @Nullable Integer diskSizeGb,
        @CustomType.Parameter("diskType") @Nullable String diskType,
        @CustomType.Parameter("ephemeralStorageConfig") @Nullable ClusterNodeConfigEphemeralStorageConfig ephemeralStorageConfig,
        @CustomType.Parameter("gcfsConfig") @Nullable ClusterNodeConfigGcfsConfig gcfsConfig,
        @CustomType.Parameter("guestAccelerators") @Nullable List<ClusterNodeConfigGuestAccelerator> guestAccelerators,
        @CustomType.Parameter("imageType") @Nullable String imageType,
        @CustomType.Parameter("kubeletConfig") @Nullable ClusterNodeConfigKubeletConfig kubeletConfig,
        @CustomType.Parameter("labels") @Nullable Map<String,String> labels,
        @CustomType.Parameter("linuxNodeConfig") @Nullable ClusterNodeConfigLinuxNodeConfig linuxNodeConfig,
        @CustomType.Parameter("localSsdCount") @Nullable Integer localSsdCount,
        @CustomType.Parameter("machineType") @Nullable String machineType,
        @CustomType.Parameter("metadata") @Nullable Map<String,String> metadata,
        @CustomType.Parameter("minCpuPlatform") @Nullable String minCpuPlatform,
        @CustomType.Parameter("nodeGroup") @Nullable String nodeGroup,
        @CustomType.Parameter("oauthScopes") @Nullable List<String> oauthScopes,
        @CustomType.Parameter("preemptible") @Nullable Boolean preemptible,
        @CustomType.Parameter("sandboxConfig") @Nullable ClusterNodeConfigSandboxConfig sandboxConfig,
        @CustomType.Parameter("serviceAccount") @Nullable String serviceAccount,
        @CustomType.Parameter("shieldedInstanceConfig") @Nullable ClusterNodeConfigShieldedInstanceConfig shieldedInstanceConfig,
        @CustomType.Parameter("spot") @Nullable Boolean spot,
        @CustomType.Parameter("tags") @Nullable List<String> tags,
        @CustomType.Parameter("taints") @Nullable List<ClusterNodeConfigTaint> taints,
        @CustomType.Parameter("workloadMetadataConfig") @Nullable ClusterNodeConfigWorkloadMetadataConfig workloadMetadataConfig) {
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

    /**
     * The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: <https://cloud.google.com/compute/docs/disks/customer-managed-encryption>
     * 
    */
    public Optional<String> getBootDiskKmsKey() {
        return Optional.ofNullable(this.bootDiskKmsKey);
    }
    /**
     * Size of the disk attached to each node, specified
     * in GB. The smallest allowed disk size is 10GB. Defaults to 100GB.
     * 
    */
    public Optional<Integer> getDiskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }
    /**
     * Type of the disk attached to each node
     * (e.g. 'pd-standard', 'pd-balanced' or 'pd-ssd'). If unspecified, the default disk type is 'pd-standard'
     * 
    */
    public Optional<String> getDiskType() {
        return Optional.ofNullable(this.diskType);
    }
    /**
     * Parameters for the ephemeral storage filesystem. If unspecified, ephemeral storage is backed by the boot disk. Structure is documented below.
     * 
    */
    public Optional<ClusterNodeConfigEphemeralStorageConfig> getEphemeralStorageConfig() {
        return Optional.ofNullable(this.ephemeralStorageConfig);
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
    public Optional<ClusterNodeConfigGcfsConfig> getGcfsConfig() {
        return Optional.ofNullable(this.gcfsConfig);
    }
    /**
     * List of the type and count of accelerator cards attached to the instance.
     * Structure documented below.
     * 
    */
    public List<ClusterNodeConfigGuestAccelerator> getGuestAccelerators() {
        return this.guestAccelerators == null ? List.of() : this.guestAccelerators;
    }
    /**
     * The image type to use for this node. Note that changing the image type
     * will delete and recreate all nodes in the node pool.
     * 
    */
    public Optional<String> getImageType() {
        return Optional.ofNullable(this.imageType);
    }
    /**
     * Kubelet configuration, currently supported attributes can be found [here](https://cloud.google.com/sdk/gcloud/reference/beta/container/node-pools/create#--system-config-from-file).
     * Structure is documented below.
     * 
    */
    public Optional<ClusterNodeConfigKubeletConfig> getKubeletConfig() {
        return Optional.ofNullable(this.kubeletConfig);
    }
    /**
     * The Kubernetes labels (key/value pairs) to be applied to each node. The kubernetes.io/ and k8s.io/ prefixes are
     * reserved by Kubernetes Core components and cannot be specified.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * Linux node configuration, currently supported attributes can be found [here](https://cloud.google.com/sdk/gcloud/reference/beta/container/node-pools/create#--system-config-from-file).
     * Note that validations happen all server side. All attributes are optional.
     * Structure is documented below.
     * 
    */
    public Optional<ClusterNodeConfigLinuxNodeConfig> getLinuxNodeConfig() {
        return Optional.ofNullable(this.linuxNodeConfig);
    }
    /**
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
    */
    public Optional<Integer> getLocalSsdCount() {
        return Optional.ofNullable(this.localSsdCount);
    }
    /**
     * The name of a Google Compute Engine machine type.
     * Defaults to `e2-medium`. To create a custom machine type, value should be set as specified
     * [here](https://cloud.google.com/compute/docs/reference/latest/instances#machineType).
     * 
    */
    public Optional<String> getMachineType() {
        return Optional.ofNullable(this.machineType);
    }
    /**
     * The metadata key/value pairs assigned to instances in
     * the cluster. From GKE `1.12` onwards, `disable-legacy-endpoints` is set to
     * `true` by the API; if `metadata` is set but that default value is not
     * included, the provider will attempt to unset the value. To avoid this, set the
     * value in your config.
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * Minimum CPU platform to be used by this instance.
     * The instance may be scheduled on the specified or newer CPU platform. Applicable
     * values are the friendly names of CPU platforms, such as `Intel Haswell`. See the
     * [official documentation](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * for more information.
     * 
    */
    public Optional<String> getMinCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }
    /**
     * Setting this field will assign instances of this pool to run on the specified node group. This is useful for running workloads on [sole tenant nodes](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes).
     * 
    */
    public Optional<String> getNodeGroup() {
        return Optional.ofNullable(this.nodeGroup);
    }
    /**
     * The set of Google API scopes to be made available
     * on all of the node VMs under the "default" service account.
     * Use the "https://www.googleapis.com/auth/cloud-platform" scope to grant access to all APIs. It is recommended that you set `service_account` to a non-default service account and grant IAM roles to that service account for only the resources that it needs.
     * 
    */
    public List<String> getOauthScopes() {
        return this.oauthScopes == null ? List.of() : this.oauthScopes;
    }
    /**
     * A boolean that represents whether or not the underlying node VMs
     * are preemptible. See the [official documentation](https://cloud.google.com/container-engine/docs/preemptible-vm)
     * for more information. Defaults to false.
     * 
    */
    public Optional<Boolean> getPreemptible() {
        return Optional.ofNullable(this.preemptible);
    }
    /**
     * [GKE Sandbox](https://cloud.google.com/kubernetes-engine/docs/how-to/sandbox-pods) configuration. When enabling this feature you must specify `image_type = "COS_CONTAINERD"` and `node_version = "1.12.7-gke.17"` or later to use it.
     * Structure is documented below.
     * 
    */
    public Optional<ClusterNodeConfigSandboxConfig> getSandboxConfig() {
        return Optional.ofNullable(this.sandboxConfig);
    }
    /**
     * The service account to be used by the Node VMs.
     * If not specified, the "default" service account is used.
     * 
    */
    public Optional<String> getServiceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }
    /**
     * Shielded Instance options. Structure is documented below.
     * 
    */
    public Optional<ClusterNodeConfigShieldedInstanceConfig> getShieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }
    /**
     * ) A boolean
     * that represents whether the underlying node VMs are spot. See the [official documentation](https://cloud.google.com/kubernetes-engine/docs/concepts/spot-vms)
     * for more information. Defaults to false.
     * 
    */
    public Optional<Boolean> getSpot() {
        return Optional.ofNullable(this.spot);
    }
    /**
     * The list of instance tags applied to all nodes. Tags are used to identify
     * valid sources or targets for network firewalls.
     * 
    */
    public List<String> getTags() {
        return this.tags == null ? List.of() : this.tags;
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
    public List<ClusterNodeConfigTaint> getTaints() {
        return this.taints == null ? List.of() : this.taints;
    }
    /**
     * Metadata configuration to expose to workloads on the node pool.
     * Structure is documented below.
     * 
    */
    public Optional<ClusterNodeConfigWorkloadMetadataConfig> getWorkloadMetadataConfig() {
        return Optional.ofNullable(this.workloadMetadataConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bootDiskKmsKey;
        private @Nullable Integer diskSizeGb;
        private @Nullable String diskType;
        private @Nullable ClusterNodeConfigEphemeralStorageConfig ephemeralStorageConfig;
        private @Nullable ClusterNodeConfigGcfsConfig gcfsConfig;
        private @Nullable List<ClusterNodeConfigGuestAccelerator> guestAccelerators;
        private @Nullable String imageType;
        private @Nullable ClusterNodeConfigKubeletConfig kubeletConfig;
        private @Nullable Map<String,String> labels;
        private @Nullable ClusterNodeConfigLinuxNodeConfig linuxNodeConfig;
        private @Nullable Integer localSsdCount;
        private @Nullable String machineType;
        private @Nullable Map<String,String> metadata;
        private @Nullable String minCpuPlatform;
        private @Nullable String nodeGroup;
        private @Nullable List<String> oauthScopes;
        private @Nullable Boolean preemptible;
        private @Nullable ClusterNodeConfigSandboxConfig sandboxConfig;
        private @Nullable String serviceAccount;
        private @Nullable ClusterNodeConfigShieldedInstanceConfig shieldedInstanceConfig;
        private @Nullable Boolean spot;
        private @Nullable List<String> tags;
        private @Nullable List<ClusterNodeConfigTaint> taints;
        private @Nullable ClusterNodeConfigWorkloadMetadataConfig workloadMetadataConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfig defaults) {
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

        public Builder bootDiskKmsKey(@Nullable String bootDiskKmsKey) {
            this.bootDiskKmsKey = bootDiskKmsKey;
            return this;
        }

        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder diskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder ephemeralStorageConfig(@Nullable ClusterNodeConfigEphemeralStorageConfig ephemeralStorageConfig) {
            this.ephemeralStorageConfig = ephemeralStorageConfig;
            return this;
        }

        public Builder gcfsConfig(@Nullable ClusterNodeConfigGcfsConfig gcfsConfig) {
            this.gcfsConfig = gcfsConfig;
            return this;
        }

        public Builder guestAccelerators(@Nullable List<ClusterNodeConfigGuestAccelerator> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }

        public Builder imageType(@Nullable String imageType) {
            this.imageType = imageType;
            return this;
        }

        public Builder kubeletConfig(@Nullable ClusterNodeConfigKubeletConfig kubeletConfig) {
            this.kubeletConfig = kubeletConfig;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder linuxNodeConfig(@Nullable ClusterNodeConfigLinuxNodeConfig linuxNodeConfig) {
            this.linuxNodeConfig = linuxNodeConfig;
            return this;
        }

        public Builder localSsdCount(@Nullable Integer localSsdCount) {
            this.localSsdCount = localSsdCount;
            return this;
        }

        public Builder machineType(@Nullable String machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder nodeGroup(@Nullable String nodeGroup) {
            this.nodeGroup = nodeGroup;
            return this;
        }

        public Builder oauthScopes(@Nullable List<String> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }

        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = preemptible;
            return this;
        }

        public Builder sandboxConfig(@Nullable ClusterNodeConfigSandboxConfig sandboxConfig) {
            this.sandboxConfig = sandboxConfig;
            return this;
        }

        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder shieldedInstanceConfig(@Nullable ClusterNodeConfigShieldedInstanceConfig shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder spot(@Nullable Boolean spot) {
            this.spot = spot;
            return this;
        }

        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder taints(@Nullable List<ClusterNodeConfigTaint> taints) {
            this.taints = taints;
            return this;
        }

        public Builder workloadMetadataConfig(@Nullable ClusterNodeConfigWorkloadMetadataConfig workloadMetadataConfig) {
            this.workloadMetadataConfig = workloadMetadataConfig;
            return this;
        }
        public ClusterNodeConfig build() {
            return new ClusterNodeConfig(bootDiskKmsKey, diskSizeGb, diskType, ephemeralStorageConfig, gcfsConfig, guestAccelerators, imageType, kubeletConfig, labels, linuxNodeConfig, localSsdCount, machineType, metadata, minCpuPlatform, nodeGroup, oauthScopes, preemptible, sandboxConfig, serviceAccount, shieldedInstanceConfig, spot, tags, taints, workloadMetadataConfig);
        }
    }
}
