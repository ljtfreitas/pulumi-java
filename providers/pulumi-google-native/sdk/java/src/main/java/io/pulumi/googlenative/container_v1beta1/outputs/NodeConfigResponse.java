// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.container_v1beta1.outputs.AcceleratorConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.AdvancedMachineFeaturesResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.EphemeralStorageConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.GcfsConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.LinuxNodeConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.NodeKubeletConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.NodeTaintResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.ReservationAffinityResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.SandboxConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.ShieldedInstanceConfigResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.VirtualNICResponse;
import io.pulumi.googlenative.container_v1beta1.outputs.WorkloadMetadataConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class NodeConfigResponse {
    /**
     * A list of hardware accelerators to be attached to each node. See https://cloud.google.com/compute/docs/gpus for more information about support for GPUs.
     * 
     */
    private final List<AcceleratorConfigResponse> accelerators;
    /**
     * Advanced features for the Compute Engine VM.
     * 
     */
    private final AdvancedMachineFeaturesResponse advancedMachineFeatures;
    /**
     *  The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: https://cloud.google.com/compute/docs/disks/customer-managed-encryption
     * 
     */
    private final String bootDiskKmsKey;
    /**
     * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB.
     * 
     */
    private final Integer diskSizeGb;
    /**
     * Type of the disk attached to each node (e.g. 'pd-standard', 'pd-ssd' or 'pd-balanced') If unspecified, the default disk type is 'pd-standard'
     * 
     */
    private final String diskType;
    /**
     * Parameters for the ephemeral storage filesystem. If unspecified, ephemeral storage is backed by the boot disk.
     * 
     */
    private final EphemeralStorageConfigResponse ephemeralStorageConfig;
    /**
     * GCFS (Google Container File System) configs.
     * 
     */
    private final GcfsConfigResponse gcfsConfig;
    /**
     * Enable or disable gvnic on the node pool.
     * 
     */
    private final VirtualNICResponse gvnic;
    /**
     * The image type to use for this node. Note that for a given image type, the latest version of it will be used.
     * 
     */
    private final String imageType;
    /**
     * Node kubelet configs.
     * 
     */
    private final NodeKubeletConfigResponse kubeletConfig;
    /**
     * The map of Kubernetes labels (key/value pairs) to be applied to each node. These will added in addition to any default label(s) that Kubernetes may apply to the node. In case of conflict in label keys, the applied set may differ depending on the Kubernetes version -- it's best to assume the behavior is undefined and conflicts should be avoided. For more information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
     * 
     */
    private final Map<String,String> labels;
    /**
     * Parameters that can be configured on Linux nodes.
     * 
     */
    private final LinuxNodeConfigResponse linuxNodeConfig;
    /**
     * The number of local SSD disks to be attached to the node. The limit for this value is dependent upon the maximum number of disks available on a machine per zone. See: https://cloud.google.com/compute/docs/disks/local-ssd for more information.
     * 
     */
    private final Integer localSsdCount;
    /**
     * The name of a Google Compute Engine [machine type](https://cloud.google.com/compute/docs/machine-types). If unspecified, the default machine type is `e2-medium`.
     * 
     */
    private final String machineType;
    /**
     * The metadata key/value pairs assigned to instances in the cluster. Keys must conform to the regexp `[a-zA-Z0-9-_]+` and be less than 128 bytes in length. These are reflected as part of a URL in the metadata server. Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys for the project or be one of the reserved keys: - "cluster-location" - "cluster-name" - "cluster-uid" - "configure-sh" - "containerd-configure-sh" - "enable-oslogin" - "gci-ensure-gke-docker" - "gci-metrics-enabled" - "gci-update-strategy" - "instance-template" - "kube-env" - "startup-script" - "user-data" - "disable-address-manager" - "windows-startup-script-ps1" - "common-psm1" - "k8s-node-setup-psm1" - "install-ssh-psm1" - "user-profile-psm1" Values are free-form strings, and only have meaning as interpreted by the image running in the instance. The only restriction placed on them is that each value's size must be less than or equal to 32 KB. The total size of all keys and values must be less than 512 KB.
     * 
     */
    private final Map<String,String> metadata;
    /**
     * Minimum CPU platform to be used by this instance. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such as `minCpuPlatform: "Intel Haswell"` or `minCpuPlatform: "Intel Sandy Bridge"`. For more information, read [how to specify min CPU platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * 
     */
    private final String minCpuPlatform;
    /**
     * Setting this field will assign instances of this pool to run on the specified node group. This is useful for running workloads on [sole tenant nodes](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes).
     * 
     */
    private final String nodeGroup;
    /**
     * The set of Google API scopes to be made available on all of the node VMs under the "default" service account. The following scopes are recommended, but not required, and by default are not included: * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is required for communicating with **gcr.io** (the [Google Container Registry](https://cloud.google.com/container-registry/)). If unspecified, no scopes are added, unless Cloud Logging or Cloud Monitoring are enabled, in which case their required scopes will be added.
     * 
     */
    private final List<String> oauthScopes;
    /**
     * Whether the nodes are created as preemptible VM instances. See: https://cloud.google.com/compute/docs/instances/preemptible for more inforamtion about preemptible VM instances.
     * 
     */
    private final Boolean preemptible;
    /**
     * The optional reservation affinity. Setting this field will apply the specified [Zonal Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) to this node pool.
     * 
     */
    private final ReservationAffinityResponse reservationAffinity;
    /**
     * Sandbox configuration for this node.
     * 
     */
    private final SandboxConfigResponse sandboxConfig;
    /**
     * The Google Cloud Platform Service Account to be used by the node VMs. Specify the email address of the Service Account; otherwise, if no Service Account is specified, the "default" service account is used.
     * 
     */
    private final String serviceAccount;
    /**
     * Shielded Instance options.
     * 
     */
    private final ShieldedInstanceConfigResponse shieldedInstanceConfig;
    /**
     * Spot flag for enabling Spot VM, which is a rebrand of the existing preemptible flag.
     * 
     */
    private final Boolean spot;
    /**
     * The list of instance tags applied to all nodes. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during cluster or node pool creation. Each tag within the list must comply with RFC1035.
     * 
     */
    private final List<String> tags;
    /**
     * List of kubernetes taints to be applied to each node. For more information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
     * 
     */
    private final List<NodeTaintResponse> taints;
    /**
     * The workload metadata configuration for this node.
     * 
     */
    private final WorkloadMetadataConfigResponse workloadMetadataConfig;

    @CustomType.Constructor
    private NodeConfigResponse(
        @CustomType.Parameter("accelerators") List<AcceleratorConfigResponse> accelerators,
        @CustomType.Parameter("advancedMachineFeatures") AdvancedMachineFeaturesResponse advancedMachineFeatures,
        @CustomType.Parameter("bootDiskKmsKey") String bootDiskKmsKey,
        @CustomType.Parameter("diskSizeGb") Integer diskSizeGb,
        @CustomType.Parameter("diskType") String diskType,
        @CustomType.Parameter("ephemeralStorageConfig") EphemeralStorageConfigResponse ephemeralStorageConfig,
        @CustomType.Parameter("gcfsConfig") GcfsConfigResponse gcfsConfig,
        @CustomType.Parameter("gvnic") VirtualNICResponse gvnic,
        @CustomType.Parameter("imageType") String imageType,
        @CustomType.Parameter("kubeletConfig") NodeKubeletConfigResponse kubeletConfig,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("linuxNodeConfig") LinuxNodeConfigResponse linuxNodeConfig,
        @CustomType.Parameter("localSsdCount") Integer localSsdCount,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("metadata") Map<String,String> metadata,
        @CustomType.Parameter("minCpuPlatform") String minCpuPlatform,
        @CustomType.Parameter("nodeGroup") String nodeGroup,
        @CustomType.Parameter("oauthScopes") List<String> oauthScopes,
        @CustomType.Parameter("preemptible") Boolean preemptible,
        @CustomType.Parameter("reservationAffinity") ReservationAffinityResponse reservationAffinity,
        @CustomType.Parameter("sandboxConfig") SandboxConfigResponse sandboxConfig,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("shieldedInstanceConfig") ShieldedInstanceConfigResponse shieldedInstanceConfig,
        @CustomType.Parameter("spot") Boolean spot,
        @CustomType.Parameter("tags") List<String> tags,
        @CustomType.Parameter("taints") List<NodeTaintResponse> taints,
        @CustomType.Parameter("workloadMetadataConfig") WorkloadMetadataConfigResponse workloadMetadataConfig) {
        this.accelerators = accelerators;
        this.advancedMachineFeatures = advancedMachineFeatures;
        this.bootDiskKmsKey = bootDiskKmsKey;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.ephemeralStorageConfig = ephemeralStorageConfig;
        this.gcfsConfig = gcfsConfig;
        this.gvnic = gvnic;
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
        this.reservationAffinity = reservationAffinity;
        this.sandboxConfig = sandboxConfig;
        this.serviceAccount = serviceAccount;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.spot = spot;
        this.tags = tags;
        this.taints = taints;
        this.workloadMetadataConfig = workloadMetadataConfig;
    }

    /**
     * A list of hardware accelerators to be attached to each node. See https://cloud.google.com/compute/docs/gpus for more information about support for GPUs.
     * 
    */
    public List<AcceleratorConfigResponse> getAccelerators() {
        return this.accelerators;
    }
    /**
     * Advanced features for the Compute Engine VM.
     * 
    */
    public AdvancedMachineFeaturesResponse getAdvancedMachineFeatures() {
        return this.advancedMachineFeatures;
    }
    /**
     *  The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: https://cloud.google.com/compute/docs/disks/customer-managed-encryption
     * 
    */
    public String getBootDiskKmsKey() {
        return this.bootDiskKmsKey;
    }
    /**
     * Size of the disk attached to each node, specified in GB. The smallest allowed disk size is 10GB. If unspecified, the default disk size is 100GB.
     * 
    */
    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Type of the disk attached to each node (e.g. 'pd-standard', 'pd-ssd' or 'pd-balanced') If unspecified, the default disk type is 'pd-standard'
     * 
    */
    public String getDiskType() {
        return this.diskType;
    }
    /**
     * Parameters for the ephemeral storage filesystem. If unspecified, ephemeral storage is backed by the boot disk.
     * 
    */
    public EphemeralStorageConfigResponse getEphemeralStorageConfig() {
        return this.ephemeralStorageConfig;
    }
    /**
     * GCFS (Google Container File System) configs.
     * 
    */
    public GcfsConfigResponse getGcfsConfig() {
        return this.gcfsConfig;
    }
    /**
     * Enable or disable gvnic on the node pool.
     * 
    */
    public VirtualNICResponse getGvnic() {
        return this.gvnic;
    }
    /**
     * The image type to use for this node. Note that for a given image type, the latest version of it will be used.
     * 
    */
    public String getImageType() {
        return this.imageType;
    }
    /**
     * Node kubelet configs.
     * 
    */
    public NodeKubeletConfigResponse getKubeletConfig() {
        return this.kubeletConfig;
    }
    /**
     * The map of Kubernetes labels (key/value pairs) to be applied to each node. These will added in addition to any default label(s) that Kubernetes may apply to the node. In case of conflict in label keys, the applied set may differ depending on the Kubernetes version -- it's best to assume the behavior is undefined and conflicts should be avoided. For more information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Parameters that can be configured on Linux nodes.
     * 
    */
    public LinuxNodeConfigResponse getLinuxNodeConfig() {
        return this.linuxNodeConfig;
    }
    /**
     * The number of local SSD disks to be attached to the node. The limit for this value is dependent upon the maximum number of disks available on a machine per zone. See: https://cloud.google.com/compute/docs/disks/local-ssd for more information.
     * 
    */
    public Integer getLocalSsdCount() {
        return this.localSsdCount;
    }
    /**
     * The name of a Google Compute Engine [machine type](https://cloud.google.com/compute/docs/machine-types). If unspecified, the default machine type is `e2-medium`.
     * 
    */
    public String getMachineType() {
        return this.machineType;
    }
    /**
     * The metadata key/value pairs assigned to instances in the cluster. Keys must conform to the regexp `[a-zA-Z0-9-_]+` and be less than 128 bytes in length. These are reflected as part of a URL in the metadata server. Additionally, to avoid ambiguity, keys must not conflict with any other metadata keys for the project or be one of the reserved keys: - "cluster-location" - "cluster-name" - "cluster-uid" - "configure-sh" - "containerd-configure-sh" - "enable-oslogin" - "gci-ensure-gke-docker" - "gci-metrics-enabled" - "gci-update-strategy" - "instance-template" - "kube-env" - "startup-script" - "user-data" - "disable-address-manager" - "windows-startup-script-ps1" - "common-psm1" - "k8s-node-setup-psm1" - "install-ssh-psm1" - "user-profile-psm1" Values are free-form strings, and only have meaning as interpreted by the image running in the instance. The only restriction placed on them is that each value's size must be less than or equal to 32 KB. The total size of all keys and values must be less than 512 KB.
     * 
    */
    public Map<String,String> getMetadata() {
        return this.metadata;
    }
    /**
     * Minimum CPU platform to be used by this instance. The instance may be scheduled on the specified or newer CPU platform. Applicable values are the friendly names of CPU platforms, such as `minCpuPlatform: "Intel Haswell"` or `minCpuPlatform: "Intel Sandy Bridge"`. For more information, read [how to specify min CPU platform](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * 
    */
    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * Setting this field will assign instances of this pool to run on the specified node group. This is useful for running workloads on [sole tenant nodes](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes).
     * 
    */
    public String getNodeGroup() {
        return this.nodeGroup;
    }
    /**
     * The set of Google API scopes to be made available on all of the node VMs under the "default" service account. The following scopes are recommended, but not required, and by default are not included: * `https://www.googleapis.com/auth/compute` is required for mounting persistent storage on your nodes. * `https://www.googleapis.com/auth/devstorage.read_only` is required for communicating with **gcr.io** (the [Google Container Registry](https://cloud.google.com/container-registry/)). If unspecified, no scopes are added, unless Cloud Logging or Cloud Monitoring are enabled, in which case their required scopes will be added.
     * 
    */
    public List<String> getOauthScopes() {
        return this.oauthScopes;
    }
    /**
     * Whether the nodes are created as preemptible VM instances. See: https://cloud.google.com/compute/docs/instances/preemptible for more inforamtion about preemptible VM instances.
     * 
    */
    public Boolean getPreemptible() {
        return this.preemptible;
    }
    /**
     * The optional reservation affinity. Setting this field will apply the specified [Zonal Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources) to this node pool.
     * 
    */
    public ReservationAffinityResponse getReservationAffinity() {
        return this.reservationAffinity;
    }
    /**
     * Sandbox configuration for this node.
     * 
    */
    public SandboxConfigResponse getSandboxConfig() {
        return this.sandboxConfig;
    }
    /**
     * The Google Cloud Platform Service Account to be used by the node VMs. Specify the email address of the Service Account; otherwise, if no Service Account is specified, the "default" service account is used.
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * Shielded Instance options.
     * 
    */
    public ShieldedInstanceConfigResponse getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig;
    }
    /**
     * Spot flag for enabling Spot VM, which is a rebrand of the existing preemptible flag.
     * 
    */
    public Boolean getSpot() {
        return this.spot;
    }
    /**
     * The list of instance tags applied to all nodes. Tags are used to identify valid sources or targets for network firewalls and are specified by the client during cluster or node pool creation. Each tag within the list must comply with RFC1035.
     * 
    */
    public List<String> getTags() {
        return this.tags;
    }
    /**
     * List of kubernetes taints to be applied to each node. For more information, including usage and the valid values, see: https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/
     * 
    */
    public List<NodeTaintResponse> getTaints() {
        return this.taints;
    }
    /**
     * The workload metadata configuration for this node.
     * 
    */
    public WorkloadMetadataConfigResponse getWorkloadMetadataConfig() {
        return this.workloadMetadataConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AcceleratorConfigResponse> accelerators;
        private AdvancedMachineFeaturesResponse advancedMachineFeatures;
        private String bootDiskKmsKey;
        private Integer diskSizeGb;
        private String diskType;
        private EphemeralStorageConfigResponse ephemeralStorageConfig;
        private GcfsConfigResponse gcfsConfig;
        private VirtualNICResponse gvnic;
        private String imageType;
        private NodeKubeletConfigResponse kubeletConfig;
        private Map<String,String> labels;
        private LinuxNodeConfigResponse linuxNodeConfig;
        private Integer localSsdCount;
        private String machineType;
        private Map<String,String> metadata;
        private String minCpuPlatform;
        private String nodeGroup;
        private List<String> oauthScopes;
        private Boolean preemptible;
        private ReservationAffinityResponse reservationAffinity;
        private SandboxConfigResponse sandboxConfig;
        private String serviceAccount;
        private ShieldedInstanceConfigResponse shieldedInstanceConfig;
        private Boolean spot;
        private List<String> tags;
        private List<NodeTaintResponse> taints;
        private WorkloadMetadataConfigResponse workloadMetadataConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.advancedMachineFeatures = defaults.advancedMachineFeatures;
    	      this.bootDiskKmsKey = defaults.bootDiskKmsKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.ephemeralStorageConfig = defaults.ephemeralStorageConfig;
    	      this.gcfsConfig = defaults.gcfsConfig;
    	      this.gvnic = defaults.gvnic;
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
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.sandboxConfig = defaults.sandboxConfig;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.spot = defaults.spot;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.workloadMetadataConfig = defaults.workloadMetadataConfig;
        }

        public Builder accelerators(List<AcceleratorConfigResponse> accelerators) {
            this.accelerators = Objects.requireNonNull(accelerators);
            return this;
        }

        public Builder advancedMachineFeatures(AdvancedMachineFeaturesResponse advancedMachineFeatures) {
            this.advancedMachineFeatures = Objects.requireNonNull(advancedMachineFeatures);
            return this;
        }

        public Builder bootDiskKmsKey(String bootDiskKmsKey) {
            this.bootDiskKmsKey = Objects.requireNonNull(bootDiskKmsKey);
            return this;
        }

        public Builder diskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder ephemeralStorageConfig(EphemeralStorageConfigResponse ephemeralStorageConfig) {
            this.ephemeralStorageConfig = Objects.requireNonNull(ephemeralStorageConfig);
            return this;
        }

        public Builder gcfsConfig(GcfsConfigResponse gcfsConfig) {
            this.gcfsConfig = Objects.requireNonNull(gcfsConfig);
            return this;
        }

        public Builder gvnic(VirtualNICResponse gvnic) {
            this.gvnic = Objects.requireNonNull(gvnic);
            return this;
        }

        public Builder imageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }

        public Builder kubeletConfig(NodeKubeletConfigResponse kubeletConfig) {
            this.kubeletConfig = Objects.requireNonNull(kubeletConfig);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder linuxNodeConfig(LinuxNodeConfigResponse linuxNodeConfig) {
            this.linuxNodeConfig = Objects.requireNonNull(linuxNodeConfig);
            return this;
        }

        public Builder localSsdCount(Integer localSsdCount) {
            this.localSsdCount = Objects.requireNonNull(localSsdCount);
            return this;
        }

        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder minCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }

        public Builder nodeGroup(String nodeGroup) {
            this.nodeGroup = Objects.requireNonNull(nodeGroup);
            return this;
        }

        public Builder oauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }

        public Builder preemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }

        public Builder reservationAffinity(ReservationAffinityResponse reservationAffinity) {
            this.reservationAffinity = Objects.requireNonNull(reservationAffinity);
            return this;
        }

        public Builder sandboxConfig(SandboxConfigResponse sandboxConfig) {
            this.sandboxConfig = Objects.requireNonNull(sandboxConfig);
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder shieldedInstanceConfig(ShieldedInstanceConfigResponse shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Objects.requireNonNull(shieldedInstanceConfig);
            return this;
        }

        public Builder spot(Boolean spot) {
            this.spot = Objects.requireNonNull(spot);
            return this;
        }

        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder taints(List<NodeTaintResponse> taints) {
            this.taints = Objects.requireNonNull(taints);
            return this;
        }

        public Builder workloadMetadataConfig(WorkloadMetadataConfigResponse workloadMetadataConfig) {
            this.workloadMetadataConfig = Objects.requireNonNull(workloadMetadataConfig);
            return this;
        }
        public NodeConfigResponse build() {
            return new NodeConfigResponse(accelerators, advancedMachineFeatures, bootDiskKmsKey, diskSizeGb, diskType, ephemeralStorageConfig, gcfsConfig, gvnic, imageType, kubeletConfig, labels, linuxNodeConfig, localSsdCount, machineType, metadata, minCpuPlatform, nodeGroup, oauthScopes, preemptible, reservationAffinity, sandboxConfig, serviceAccount, shieldedInstanceConfig, spot, tags, taints, workloadMetadataConfig);
        }
    }
}
