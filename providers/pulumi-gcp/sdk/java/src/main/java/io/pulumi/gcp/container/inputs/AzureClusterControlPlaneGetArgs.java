// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.AzureClusterControlPlaneDatabaseEncryptionGetArgs;
import io.pulumi.gcp.container.inputs.AzureClusterControlPlaneMainVolumeGetArgs;
import io.pulumi.gcp.container.inputs.AzureClusterControlPlaneProxyConfigGetArgs;
import io.pulumi.gcp.container.inputs.AzureClusterControlPlaneReplicaPlacementGetArgs;
import io.pulumi.gcp.container.inputs.AzureClusterControlPlaneRootVolumeGetArgs;
import io.pulumi.gcp.container.inputs.AzureClusterControlPlaneSshConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureClusterControlPlaneGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureClusterControlPlaneGetArgs Empty = new AzureClusterControlPlaneGetArgs();

    /**
     * Optional. Configuration related to application-layer secrets encryption.
     * 
     */
    @InputImport(name="databaseEncryption")
        private final @Nullable Input<AzureClusterControlPlaneDatabaseEncryptionGetArgs> databaseEncryption;

    public Input<AzureClusterControlPlaneDatabaseEncryptionGetArgs> getDatabaseEncryption() {
        return this.databaseEncryption == null ? Input.empty() : this.databaseEncryption;
    }

    /**
     * Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster's etcd state. When unspecified, it defaults to a 8-GiB Azure Disk.
     * 
     */
    @InputImport(name="mainVolume")
        private final @Nullable Input<AzureClusterControlPlaneMainVolumeGetArgs> mainVolume;

    public Input<AzureClusterControlPlaneMainVolumeGetArgs> getMainVolume() {
        return this.mainVolume == null ? Input.empty() : this.mainVolume;
    }

    /**
     * Proxy configuration for outbound HTTP(S) traffic.
     * 
     */
    @InputImport(name="proxyConfig")
        private final @Nullable Input<AzureClusterControlPlaneProxyConfigGetArgs> proxyConfig;

    public Input<AzureClusterControlPlaneProxyConfigGetArgs> getProxyConfig() {
        return this.proxyConfig == null ? Input.empty() : this.proxyConfig;
    }

    /**
     * Configuration for where to place the control plane replicas. Up to three replica placement instances can be specified. If replica_placements is set, the replica placement instances will be applied to the three control plane replicas as evenly as possible.
     * 
     */
    @InputImport(name="replicaPlacements")
        private final @Nullable Input<List<AzureClusterControlPlaneReplicaPlacementGetArgs>> replicaPlacements;

    public Input<List<AzureClusterControlPlaneReplicaPlacementGetArgs>> getReplicaPlacements() {
        return this.replicaPlacements == null ? Input.empty() : this.replicaPlacements;
    }

    /**
     * Optional. Configuration related to the root volume provisioned for each control plane replica. When unspecified, it defaults to 32-GiB Azure Disk.
     * 
     */
    @InputImport(name="rootVolume")
        private final @Nullable Input<AzureClusterControlPlaneRootVolumeGetArgs> rootVolume;

    public Input<AzureClusterControlPlaneRootVolumeGetArgs> getRootVolume() {
        return this.rootVolume == null ? Input.empty() : this.rootVolume;
    }

    /**
     * Required. SSH configuration for how to access the underlying control plane machines.
     * 
     */
    @InputImport(name="sshConfig", required=true)
        private final Input<AzureClusterControlPlaneSshConfigGetArgs> sshConfig;

    public Input<AzureClusterControlPlaneSshConfigGetArgs> getSshConfig() {
        return this.sshConfig;
    }

    /**
     * For a given replica, the ARM ID of the subnet where the control plane VM is deployed. Make sure it's a subnet under the virtual network in the cluster configuration.
     * 
     */
    @InputImport(name="subnetId", required=true)
        private final Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId;
    }

    /**
     * Optional. A set of tags to apply to all underlying control plane Azure resources.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Required. The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling GetAzureServerConfig.
     * 
     */
    @InputImport(name="version", required=true)
        private final Input<String> version;

    public Input<String> getVersion() {
        return this.version;
    }

    /**
     * Optional. The Azure VM size name. Example: `Standard_DS2_v2`. For available VM sizes, see https://docs.microsoft.com/en-us/azure/virtual-machines/vm-naming-conventions. When unspecified, it defaults to `Standard_DS2_v2`.
     * 
     */
    @InputImport(name="vmSize")
        private final @Nullable Input<String> vmSize;

    public Input<String> getVmSize() {
        return this.vmSize == null ? Input.empty() : this.vmSize;
    }

    public AzureClusterControlPlaneGetArgs(
        @Nullable Input<AzureClusterControlPlaneDatabaseEncryptionGetArgs> databaseEncryption,
        @Nullable Input<AzureClusterControlPlaneMainVolumeGetArgs> mainVolume,
        @Nullable Input<AzureClusterControlPlaneProxyConfigGetArgs> proxyConfig,
        @Nullable Input<List<AzureClusterControlPlaneReplicaPlacementGetArgs>> replicaPlacements,
        @Nullable Input<AzureClusterControlPlaneRootVolumeGetArgs> rootVolume,
        Input<AzureClusterControlPlaneSshConfigGetArgs> sshConfig,
        Input<String> subnetId,
        @Nullable Input<Map<String,String>> tags,
        Input<String> version,
        @Nullable Input<String> vmSize) {
        this.databaseEncryption = databaseEncryption;
        this.mainVolume = mainVolume;
        this.proxyConfig = proxyConfig;
        this.replicaPlacements = replicaPlacements;
        this.rootVolume = rootVolume;
        this.sshConfig = Objects.requireNonNull(sshConfig, "expected parameter 'sshConfig' to be non-null");
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
        this.tags = tags;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
        this.vmSize = vmSize;
    }

    private AzureClusterControlPlaneGetArgs() {
        this.databaseEncryption = Input.empty();
        this.mainVolume = Input.empty();
        this.proxyConfig = Input.empty();
        this.replicaPlacements = Input.empty();
        this.rootVolume = Input.empty();
        this.sshConfig = Input.empty();
        this.subnetId = Input.empty();
        this.tags = Input.empty();
        this.version = Input.empty();
        this.vmSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterControlPlaneGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AzureClusterControlPlaneDatabaseEncryptionGetArgs> databaseEncryption;
        private @Nullable Input<AzureClusterControlPlaneMainVolumeGetArgs> mainVolume;
        private @Nullable Input<AzureClusterControlPlaneProxyConfigGetArgs> proxyConfig;
        private @Nullable Input<List<AzureClusterControlPlaneReplicaPlacementGetArgs>> replicaPlacements;
        private @Nullable Input<AzureClusterControlPlaneRootVolumeGetArgs> rootVolume;
        private Input<AzureClusterControlPlaneSshConfigGetArgs> sshConfig;
        private Input<String> subnetId;
        private @Nullable Input<Map<String,String>> tags;
        private Input<String> version;
        private @Nullable Input<String> vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterControlPlaneGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseEncryption = defaults.databaseEncryption;
    	      this.mainVolume = defaults.mainVolume;
    	      this.proxyConfig = defaults.proxyConfig;
    	      this.replicaPlacements = defaults.replicaPlacements;
    	      this.rootVolume = defaults.rootVolume;
    	      this.sshConfig = defaults.sshConfig;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setDatabaseEncryption(@Nullable Input<AzureClusterControlPlaneDatabaseEncryptionGetArgs> databaseEncryption) {
            this.databaseEncryption = databaseEncryption;
            return this;
        }

        public Builder setDatabaseEncryption(@Nullable AzureClusterControlPlaneDatabaseEncryptionGetArgs databaseEncryption) {
            this.databaseEncryption = Input.ofNullable(databaseEncryption);
            return this;
        }

        public Builder setMainVolume(@Nullable Input<AzureClusterControlPlaneMainVolumeGetArgs> mainVolume) {
            this.mainVolume = mainVolume;
            return this;
        }

        public Builder setMainVolume(@Nullable AzureClusterControlPlaneMainVolumeGetArgs mainVolume) {
            this.mainVolume = Input.ofNullable(mainVolume);
            return this;
        }

        public Builder setProxyConfig(@Nullable Input<AzureClusterControlPlaneProxyConfigGetArgs> proxyConfig) {
            this.proxyConfig = proxyConfig;
            return this;
        }

        public Builder setProxyConfig(@Nullable AzureClusterControlPlaneProxyConfigGetArgs proxyConfig) {
            this.proxyConfig = Input.ofNullable(proxyConfig);
            return this;
        }

        public Builder setReplicaPlacements(@Nullable Input<List<AzureClusterControlPlaneReplicaPlacementGetArgs>> replicaPlacements) {
            this.replicaPlacements = replicaPlacements;
            return this;
        }

        public Builder setReplicaPlacements(@Nullable List<AzureClusterControlPlaneReplicaPlacementGetArgs> replicaPlacements) {
            this.replicaPlacements = Input.ofNullable(replicaPlacements);
            return this;
        }

        public Builder setRootVolume(@Nullable Input<AzureClusterControlPlaneRootVolumeGetArgs> rootVolume) {
            this.rootVolume = rootVolume;
            return this;
        }

        public Builder setRootVolume(@Nullable AzureClusterControlPlaneRootVolumeGetArgs rootVolume) {
            this.rootVolume = Input.ofNullable(rootVolume);
            return this;
        }

        public Builder setSshConfig(Input<AzureClusterControlPlaneSshConfigGetArgs> sshConfig) {
            this.sshConfig = Objects.requireNonNull(sshConfig);
            return this;
        }

        public Builder setSshConfig(AzureClusterControlPlaneSshConfigGetArgs sshConfig) {
            this.sshConfig = Input.of(Objects.requireNonNull(sshConfig));
            return this;
        }

        public Builder setSubnetId(Input<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Input.of(Objects.requireNonNull(subnetId));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVersion(Input<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Input.of(Objects.requireNonNull(version));
            return this;
        }

        public Builder setVmSize(@Nullable Input<String> vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public Builder setVmSize(@Nullable String vmSize) {
            this.vmSize = Input.ofNullable(vmSize);
            return this;
        }
        public AzureClusterControlPlaneGetArgs build() {
            return new AzureClusterControlPlaneGetArgs(databaseEncryption, mainVolume, proxyConfig, replicaPlacements, rootVolume, sshConfig, subnetId, tags, version, vmSize);
        }
    }
}
