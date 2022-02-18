// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.azurenative.servicefabric.inputs.EndpointRangeDescriptionArgs;
import io.pulumi.azurenative.servicefabric.inputs.VMSSExtensionArgs;
import io.pulumi.azurenative.servicefabric.inputs.VaultSecretGroupArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeTypeArgs Empty = new NodeTypeArgs();

    /**
     * The range of ports from which cluster assigned port to Service Fabric applications.
     * 
     */
    @InputImport(name="applicationPorts")
    private final @Nullable Input<EndpointRangeDescriptionArgs> applicationPorts;

    public Input<EndpointRangeDescriptionArgs> getApplicationPorts() {
        return this.applicationPorts == null ? Input.empty() : this.applicationPorts;
    }

    /**
     * The capacity tags applied to the nodes in the node type, the cluster resource manager uses these tags to understand how much resource a node has.
     * 
     */
    @InputImport(name="capacities")
    private final @Nullable Input<Map<String,String>> capacities;

    public Input<Map<String,String>> getCapacities() {
        return this.capacities == null ? Input.empty() : this.capacities;
    }

    /**
     * The name of the cluster resource.
     * 
     */
    @InputImport(name="clusterName", required=true)
    private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * Disk size for each vm in the node type in GBs.
     * 
     */
    @InputImport(name="dataDiskSizeGB", required=true)
    private final Input<Integer> dataDiskSizeGB;

    public Input<Integer> getDataDiskSizeGB() {
        return this.dataDiskSizeGB;
    }

    /**
     * The range of ephemeral ports that nodes in this node type should be configured with.
     * 
     */
    @InputImport(name="ephemeralPorts")
    private final @Nullable Input<EndpointRangeDescriptionArgs> ephemeralPorts;

    public Input<EndpointRangeDescriptionArgs> getEphemeralPorts() {
        return this.ephemeralPorts == null ? Input.empty() : this.ephemeralPorts;
    }

    /**
     * The node type on which system services will run. Only one node type should be marked as primary. Primary node type cannot be deleted or changed for existing clusters.
     * 
     */
    @InputImport(name="isPrimary", required=true)
    private final Input<Boolean> isPrimary;

    public Input<Boolean> getIsPrimary() {
        return this.isPrimary;
    }

    /**
     * The name of the node type.
     * 
     */
    @InputImport(name="nodeTypeName")
    private final @Nullable Input<String> nodeTypeName;

    public Input<String> getNodeTypeName() {
        return this.nodeTypeName == null ? Input.empty() : this.nodeTypeName;
    }

    /**
     * The placement tags applied to nodes in the node type, which can be used to indicate where certain services (workload) should run.
     * 
     */
    @InputImport(name="placementProperties")
    private final @Nullable Input<Map<String,String>> placementProperties;

    public Input<Map<String,String>> getPlacementProperties() {
        return this.placementProperties == null ? Input.empty() : this.placementProperties;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Azure resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Set of extensions that should be installed onto the virtual machines.
     * 
     */
    @InputImport(name="vmExtensions")
    private final @Nullable Input<List<VMSSExtensionArgs>> vmExtensions;

    public Input<List<VMSSExtensionArgs>> getVmExtensions() {
        return this.vmExtensions == null ? Input.empty() : this.vmExtensions;
    }

    /**
     * The offer type of the Azure Virtual Machines Marketplace image. For example, UbuntuServer or WindowsServer.
     * 
     */
    @InputImport(name="vmImageOffer")
    private final @Nullable Input<String> vmImageOffer;

    public Input<String> getVmImageOffer() {
        return this.vmImageOffer == null ? Input.empty() : this.vmImageOffer;
    }

    /**
     * The publisher of the Azure Virtual Machines Marketplace image. For example, Canonical or MicrosoftWindowsServer.
     * 
     */
    @InputImport(name="vmImagePublisher")
    private final @Nullable Input<String> vmImagePublisher;

    public Input<String> getVmImagePublisher() {
        return this.vmImagePublisher == null ? Input.empty() : this.vmImagePublisher;
    }

    /**
     * The SKU of the Azure Virtual Machines Marketplace image. For example, 14.04.0-LTS or 2012-R2-Datacenter.
     * 
     */
    @InputImport(name="vmImageSku")
    private final @Nullable Input<String> vmImageSku;

    public Input<String> getVmImageSku() {
        return this.vmImageSku == null ? Input.empty() : this.vmImageSku;
    }

    /**
     * The version of the Azure Virtual Machines Marketplace image. A value of 'latest' can be specified to select the latest version of an image. If omitted, the default is 'latest'.
     * 
     */
    @InputImport(name="vmImageVersion")
    private final @Nullable Input<String> vmImageVersion;

    public Input<String> getVmImageVersion() {
        return this.vmImageVersion == null ? Input.empty() : this.vmImageVersion;
    }

    /**
     * The number of nodes in the node type.
     * 
     */
    @InputImport(name="vmInstanceCount", required=true)
    private final Input<Integer> vmInstanceCount;

    public Input<Integer> getVmInstanceCount() {
        return this.vmInstanceCount;
    }

    /**
     * The secrets to install in the virtual machines.
     * 
     */
    @InputImport(name="vmSecrets")
    private final @Nullable Input<List<VaultSecretGroupArgs>> vmSecrets;

    public Input<List<VaultSecretGroupArgs>> getVmSecrets() {
        return this.vmSecrets == null ? Input.empty() : this.vmSecrets;
    }

    /**
     * The size of virtual machines in the pool. All virtual machines in a pool are the same size. For example, Standard_D3.
     * 
     */
    @InputImport(name="vmSize")
    private final @Nullable Input<String> vmSize;

    public Input<String> getVmSize() {
        return this.vmSize == null ? Input.empty() : this.vmSize;
    }

    public NodeTypeArgs(
        @Nullable Input<EndpointRangeDescriptionArgs> applicationPorts,
        @Nullable Input<Map<String,String>> capacities,
        Input<String> clusterName,
        Input<Integer> dataDiskSizeGB,
        @Nullable Input<EndpointRangeDescriptionArgs> ephemeralPorts,
        Input<Boolean> isPrimary,
        @Nullable Input<String> nodeTypeName,
        @Nullable Input<Map<String,String>> placementProperties,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<VMSSExtensionArgs>> vmExtensions,
        @Nullable Input<String> vmImageOffer,
        @Nullable Input<String> vmImagePublisher,
        @Nullable Input<String> vmImageSku,
        @Nullable Input<String> vmImageVersion,
        Input<Integer> vmInstanceCount,
        @Nullable Input<List<VaultSecretGroupArgs>> vmSecrets,
        @Nullable Input<String> vmSize) {
        this.applicationPorts = applicationPorts;
        this.capacities = capacities;
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.dataDiskSizeGB = Objects.requireNonNull(dataDiskSizeGB, "expected parameter 'dataDiskSizeGB' to be non-null");
        this.ephemeralPorts = ephemeralPorts;
        this.isPrimary = Objects.requireNonNull(isPrimary, "expected parameter 'isPrimary' to be non-null");
        this.nodeTypeName = nodeTypeName;
        this.placementProperties = placementProperties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vmExtensions = vmExtensions;
        this.vmImageOffer = vmImageOffer;
        this.vmImagePublisher = vmImagePublisher;
        this.vmImageSku = vmImageSku;
        this.vmImageVersion = vmImageVersion;
        this.vmInstanceCount = Objects.requireNonNull(vmInstanceCount, "expected parameter 'vmInstanceCount' to be non-null");
        this.vmSecrets = vmSecrets;
        this.vmSize = vmSize;
    }

    private NodeTypeArgs() {
        this.applicationPorts = Input.empty();
        this.capacities = Input.empty();
        this.clusterName = Input.empty();
        this.dataDiskSizeGB = Input.empty();
        this.ephemeralPorts = Input.empty();
        this.isPrimary = Input.empty();
        this.nodeTypeName = Input.empty();
        this.placementProperties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.vmExtensions = Input.empty();
        this.vmImageOffer = Input.empty();
        this.vmImagePublisher = Input.empty();
        this.vmImageSku = Input.empty();
        this.vmImageVersion = Input.empty();
        this.vmInstanceCount = Input.empty();
        this.vmSecrets = Input.empty();
        this.vmSize = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EndpointRangeDescriptionArgs> applicationPorts;
        private @Nullable Input<Map<String,String>> capacities;
        private Input<String> clusterName;
        private Input<Integer> dataDiskSizeGB;
        private @Nullable Input<EndpointRangeDescriptionArgs> ephemeralPorts;
        private Input<Boolean> isPrimary;
        private @Nullable Input<String> nodeTypeName;
        private @Nullable Input<Map<String,String>> placementProperties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<VMSSExtensionArgs>> vmExtensions;
        private @Nullable Input<String> vmImageOffer;
        private @Nullable Input<String> vmImagePublisher;
        private @Nullable Input<String> vmImageSku;
        private @Nullable Input<String> vmImageVersion;
        private Input<Integer> vmInstanceCount;
        private @Nullable Input<List<VaultSecretGroupArgs>> vmSecrets;
        private @Nullable Input<String> vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationPorts = defaults.applicationPorts;
    	      this.capacities = defaults.capacities;
    	      this.clusterName = defaults.clusterName;
    	      this.dataDiskSizeGB = defaults.dataDiskSizeGB;
    	      this.ephemeralPorts = defaults.ephemeralPorts;
    	      this.isPrimary = defaults.isPrimary;
    	      this.nodeTypeName = defaults.nodeTypeName;
    	      this.placementProperties = defaults.placementProperties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vmExtensions = defaults.vmExtensions;
    	      this.vmImageOffer = defaults.vmImageOffer;
    	      this.vmImagePublisher = defaults.vmImagePublisher;
    	      this.vmImageSku = defaults.vmImageSku;
    	      this.vmImageVersion = defaults.vmImageVersion;
    	      this.vmInstanceCount = defaults.vmInstanceCount;
    	      this.vmSecrets = defaults.vmSecrets;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder setApplicationPorts(@Nullable Input<EndpointRangeDescriptionArgs> applicationPorts) {
            this.applicationPorts = applicationPorts;
            return this;
        }

        public Builder setApplicationPorts(@Nullable EndpointRangeDescriptionArgs applicationPorts) {
            this.applicationPorts = Input.ofNullable(applicationPorts);
            return this;
        }

        public Builder setCapacities(@Nullable Input<Map<String,String>> capacities) {
            this.capacities = capacities;
            return this;
        }

        public Builder setCapacities(@Nullable Map<String,String> capacities) {
            this.capacities = Input.ofNullable(capacities);
            return this;
        }

        public Builder setClusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder setDataDiskSizeGB(Input<Integer> dataDiskSizeGB) {
            this.dataDiskSizeGB = Objects.requireNonNull(dataDiskSizeGB);
            return this;
        }

        public Builder setDataDiskSizeGB(Integer dataDiskSizeGB) {
            this.dataDiskSizeGB = Input.of(Objects.requireNonNull(dataDiskSizeGB));
            return this;
        }

        public Builder setEphemeralPorts(@Nullable Input<EndpointRangeDescriptionArgs> ephemeralPorts) {
            this.ephemeralPorts = ephemeralPorts;
            return this;
        }

        public Builder setEphemeralPorts(@Nullable EndpointRangeDescriptionArgs ephemeralPorts) {
            this.ephemeralPorts = Input.ofNullable(ephemeralPorts);
            return this;
        }

        public Builder setIsPrimary(Input<Boolean> isPrimary) {
            this.isPrimary = Objects.requireNonNull(isPrimary);
            return this;
        }

        public Builder setIsPrimary(Boolean isPrimary) {
            this.isPrimary = Input.of(Objects.requireNonNull(isPrimary));
            return this;
        }

        public Builder setNodeTypeName(@Nullable Input<String> nodeTypeName) {
            this.nodeTypeName = nodeTypeName;
            return this;
        }

        public Builder setNodeTypeName(@Nullable String nodeTypeName) {
            this.nodeTypeName = Input.ofNullable(nodeTypeName);
            return this;
        }

        public Builder setPlacementProperties(@Nullable Input<Map<String,String>> placementProperties) {
            this.placementProperties = placementProperties;
            return this;
        }

        public Builder setPlacementProperties(@Nullable Map<String,String> placementProperties) {
            this.placementProperties = Input.ofNullable(placementProperties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
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

        public Builder setVmExtensions(@Nullable Input<List<VMSSExtensionArgs>> vmExtensions) {
            this.vmExtensions = vmExtensions;
            return this;
        }

        public Builder setVmExtensions(@Nullable List<VMSSExtensionArgs> vmExtensions) {
            this.vmExtensions = Input.ofNullable(vmExtensions);
            return this;
        }

        public Builder setVmImageOffer(@Nullable Input<String> vmImageOffer) {
            this.vmImageOffer = vmImageOffer;
            return this;
        }

        public Builder setVmImageOffer(@Nullable String vmImageOffer) {
            this.vmImageOffer = Input.ofNullable(vmImageOffer);
            return this;
        }

        public Builder setVmImagePublisher(@Nullable Input<String> vmImagePublisher) {
            this.vmImagePublisher = vmImagePublisher;
            return this;
        }

        public Builder setVmImagePublisher(@Nullable String vmImagePublisher) {
            this.vmImagePublisher = Input.ofNullable(vmImagePublisher);
            return this;
        }

        public Builder setVmImageSku(@Nullable Input<String> vmImageSku) {
            this.vmImageSku = vmImageSku;
            return this;
        }

        public Builder setVmImageSku(@Nullable String vmImageSku) {
            this.vmImageSku = Input.ofNullable(vmImageSku);
            return this;
        }

        public Builder setVmImageVersion(@Nullable Input<String> vmImageVersion) {
            this.vmImageVersion = vmImageVersion;
            return this;
        }

        public Builder setVmImageVersion(@Nullable String vmImageVersion) {
            this.vmImageVersion = Input.ofNullable(vmImageVersion);
            return this;
        }

        public Builder setVmInstanceCount(Input<Integer> vmInstanceCount) {
            this.vmInstanceCount = Objects.requireNonNull(vmInstanceCount);
            return this;
        }

        public Builder setVmInstanceCount(Integer vmInstanceCount) {
            this.vmInstanceCount = Input.of(Objects.requireNonNull(vmInstanceCount));
            return this;
        }

        public Builder setVmSecrets(@Nullable Input<List<VaultSecretGroupArgs>> vmSecrets) {
            this.vmSecrets = vmSecrets;
            return this;
        }

        public Builder setVmSecrets(@Nullable List<VaultSecretGroupArgs> vmSecrets) {
            this.vmSecrets = Input.ofNullable(vmSecrets);
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

        public NodeTypeArgs build() {
            return new NodeTypeArgs(applicationPorts, capacities, clusterName, dataDiskSizeGB, ephemeralPorts, isPrimary, nodeTypeName, placementProperties, resourceGroupName, tags, vmExtensions, vmImageOffer, vmImagePublisher, vmImageSku, vmImageVersion, vmInstanceCount, vmSecrets, vmSize);
        }
    }
}
