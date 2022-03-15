// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.tpu_v2alpha1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.tpu_v2alpha1.enums.NodeHealth;
import io.pulumi.googlenative.tpu_v2alpha1.inputs.AttachedDiskArgs;
import io.pulumi.googlenative.tpu_v2alpha1.inputs.NetworkConfigArgs;
import io.pulumi.googlenative.tpu_v2alpha1.inputs.SchedulingConfigArgs;
import io.pulumi.googlenative.tpu_v2alpha1.inputs.ServiceAccountArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeArgs Empty = new NodeArgs();

    /**
     * The type of hardware accelerators associated with this node.
     * 
     */
    @Import(name="acceleratorType", required=true)
      private final Output<String> acceleratorType;

    public Output<String> getAcceleratorType() {
        return this.acceleratorType;
    }

    /**
     * The CIDR block that the TPU node will use when selecting an IP address. This CIDR block must be a /29 block; the Compute Engine networks API forbids a smaller block, and using a larger block would be wasteful (a node can only consume one IP address). Errors will occur if the CIDR block has already been used for a currently existing TPU node, the CIDR block conflicts with any subnetworks in the user's provided network, or the provided network is peered with another network that is using that CIDR block.
     * 
     */
    @Import(name="cidrBlock")
      private final @Nullable Output<String> cidrBlock;

    public Output<String> getCidrBlock() {
        return this.cidrBlock == null ? Output.empty() : this.cidrBlock;
    }

    /**
     * The additional data disks for the Node.
     * 
     */
    @Import(name="dataDisks")
      private final @Nullable Output<List<AttachedDiskArgs>> dataDisks;

    public Output<List<AttachedDiskArgs>> getDataDisks() {
        return this.dataDisks == null ? Output.empty() : this.dataDisks;
    }

    /**
     * The user-supplied description of the TPU. Maximum of 512 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The health status of the TPU node.
     * 
     */
    @Import(name="health")
      private final @Nullable Output<NodeHealth> health;

    public Output<NodeHealth> getHealth() {
        return this.health == null ? Output.empty() : this.health;
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Custom metadata to apply to the TPU Node. Can set startup-script and shutdown-script
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * Network configurations for the TPU node.
     * 
     */
    @Import(name="networkConfig")
      private final @Nullable Output<NetworkConfigArgs> networkConfig;

    public Output<NetworkConfigArgs> getNetworkConfig() {
        return this.networkConfig == null ? Output.empty() : this.networkConfig;
    }

    @Import(name="nodeId")
      private final @Nullable Output<String> nodeId;

    public Output<String> getNodeId() {
        return this.nodeId == null ? Output.empty() : this.nodeId;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The runtime version running in the Node.
     * 
     */
    @Import(name="runtimeVersion", required=true)
      private final Output<String> runtimeVersion;

    public Output<String> getRuntimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * The scheduling options for this node.
     * 
     */
    @Import(name="schedulingConfig")
      private final @Nullable Output<SchedulingConfigArgs> schedulingConfig;

    public Output<SchedulingConfigArgs> getSchedulingConfig() {
        return this.schedulingConfig == null ? Output.empty() : this.schedulingConfig;
    }

    /**
     * The Google Cloud Platform Service Account to be used by the TPU node VMs. If None is specified, the default compute service account will be used.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<ServiceAccountArgs> serviceAccount;

    public Output<ServiceAccountArgs> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    /**
     * Tags to apply to the TPU Node. Tags are used to identify valid sources or targets for network firewalls.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public NodeArgs(
        Output<String> acceleratorType,
        @Nullable Output<String> cidrBlock,
        @Nullable Output<List<AttachedDiskArgs>> dataDisks,
        @Nullable Output<String> description,
        @Nullable Output<NodeHealth> health,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<NetworkConfigArgs> networkConfig,
        @Nullable Output<String> nodeId,
        @Nullable Output<String> project,
        Output<String> runtimeVersion,
        @Nullable Output<SchedulingConfigArgs> schedulingConfig,
        @Nullable Output<ServiceAccountArgs> serviceAccount,
        @Nullable Output<List<String>> tags) {
        this.acceleratorType = Objects.requireNonNull(acceleratorType, "expected parameter 'acceleratorType' to be non-null");
        this.cidrBlock = cidrBlock;
        this.dataDisks = dataDisks;
        this.description = description;
        this.health = health;
        this.labels = labels;
        this.location = location;
        this.metadata = metadata;
        this.networkConfig = networkConfig;
        this.nodeId = nodeId;
        this.project = project;
        this.runtimeVersion = Objects.requireNonNull(runtimeVersion, "expected parameter 'runtimeVersion' to be non-null");
        this.schedulingConfig = schedulingConfig;
        this.serviceAccount = serviceAccount;
        this.tags = tags;
    }

    private NodeArgs() {
        this.acceleratorType = Output.empty();
        this.cidrBlock = Output.empty();
        this.dataDisks = Output.empty();
        this.description = Output.empty();
        this.health = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.metadata = Output.empty();
        this.networkConfig = Output.empty();
        this.nodeId = Output.empty();
        this.project = Output.empty();
        this.runtimeVersion = Output.empty();
        this.schedulingConfig = Output.empty();
        this.serviceAccount = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> acceleratorType;
        private @Nullable Output<String> cidrBlock;
        private @Nullable Output<List<AttachedDiskArgs>> dataDisks;
        private @Nullable Output<String> description;
        private @Nullable Output<NodeHealth> health;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<NetworkConfigArgs> networkConfig;
        private @Nullable Output<String> nodeId;
        private @Nullable Output<String> project;
        private Output<String> runtimeVersion;
        private @Nullable Output<SchedulingConfigArgs> schedulingConfig;
        private @Nullable Output<ServiceAccountArgs> serviceAccount;
        private @Nullable Output<List<String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.dataDisks = defaults.dataDisks;
    	      this.description = defaults.description;
    	      this.health = defaults.health;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.networkConfig = defaults.networkConfig;
    	      this.nodeId = defaults.nodeId;
    	      this.project = defaults.project;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.schedulingConfig = defaults.schedulingConfig;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.tags = defaults.tags;
        }

        public Builder acceleratorType(Output<String> acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }

        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = Output.of(Objects.requireNonNull(acceleratorType));
            return this;
        }

        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Output.ofNullable(cidrBlock);
            return this;
        }

        public Builder dataDisks(@Nullable Output<List<AttachedDiskArgs>> dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        public Builder dataDisks(@Nullable List<AttachedDiskArgs> dataDisks) {
            this.dataDisks = Output.ofNullable(dataDisks);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder health(@Nullable Output<NodeHealth> health) {
            this.health = health;
            return this;
        }

        public Builder health(@Nullable NodeHealth health) {
            this.health = Output.ofNullable(health);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }

        public Builder networkConfig(@Nullable Output<NetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder networkConfig(@Nullable NetworkConfigArgs networkConfig) {
            this.networkConfig = Output.ofNullable(networkConfig);
            return this;
        }

        public Builder nodeId(@Nullable Output<String> nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        public Builder nodeId(@Nullable String nodeId) {
            this.nodeId = Output.ofNullable(nodeId);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder runtimeVersion(Output<String> runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }

        public Builder runtimeVersion(String runtimeVersion) {
            this.runtimeVersion = Output.of(Objects.requireNonNull(runtimeVersion));
            return this;
        }

        public Builder schedulingConfig(@Nullable Output<SchedulingConfigArgs> schedulingConfig) {
            this.schedulingConfig = schedulingConfig;
            return this;
        }

        public Builder schedulingConfig(@Nullable SchedulingConfigArgs schedulingConfig) {
            this.schedulingConfig = Output.ofNullable(schedulingConfig);
            return this;
        }

        public Builder serviceAccount(@Nullable Output<ServiceAccountArgs> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(@Nullable ServiceAccountArgs serviceAccount) {
            this.serviceAccount = Output.ofNullable(serviceAccount);
            return this;
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public NodeArgs build() {
            return new NodeArgs(acceleratorType, cidrBlock, dataDisks, description, health, labels, location, metadata, networkConfig, nodeId, project, runtimeVersion, schedulingConfig, serviceAccount, tags);
        }
    }
}
