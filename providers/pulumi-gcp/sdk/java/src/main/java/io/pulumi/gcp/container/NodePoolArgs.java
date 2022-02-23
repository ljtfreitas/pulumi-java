// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.NodePoolAutoscalingArgs;
import io.pulumi.gcp.container.inputs.NodePoolManagementArgs;
import io.pulumi.gcp.container.inputs.NodePoolNetworkConfigArgs;
import io.pulumi.gcp.container.inputs.NodePoolNodeConfigArgs;
import io.pulumi.gcp.container.inputs.NodePoolUpgradeSettingsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodePoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodePoolArgs Empty = new NodePoolArgs();

    /**
     * Configuration required by cluster autoscaler to adjust
     * the size of the node pool to the current cluster usage. Structure is documented below.
     * 
     */
    @InputImport(name="autoscaling")
        private final @Nullable Input<NodePoolAutoscalingArgs> autoscaling;

    public Input<NodePoolAutoscalingArgs> getAutoscaling() {
        return this.autoscaling == null ? Input.empty() : this.autoscaling;
    }

    /**
     * The cluster to create the node pool for. Cluster must be present in `location` provided for clusters. May be specified in the format `projects/{{project}}/locations/{{location}}/clusters/{{cluster}}` or as just the name of the cluster.
     * 
     */
    @InputImport(name="cluster", required=true)
        private final Input<String> cluster;

    public Input<String> getCluster() {
        return this.cluster;
    }

    /**
     * The initial number of nodes for the pool. In
     * regional or multi-zonal clusters, this is the number of nodes per zone. Changing
     * this will force recreation of the resource. WARNING: Resizing your node pool manually
     * may change this value in your existing cluster, which will trigger destruction
     * and recreation on the next provider run (to rectify the discrepancy).  If you don't
     * need this value, don't set it.  If you do need it, you can use a lifecycle block to
     * ignore subsqeuent changes to this field.
     * 
     */
    @InputImport(name="initialNodeCount")
        private final @Nullable Input<Integer> initialNodeCount;

    public Input<Integer> getInitialNodeCount() {
        return this.initialNodeCount == null ? Input.empty() : this.initialNodeCount;
    }

    /**
     * The location (region or zone) of the cluster.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Node management configuration, wherein auto-repair and
     * auto-upgrade is configured. Structure is documented below.
     * 
     */
    @InputImport(name="management")
        private final @Nullable Input<NodePoolManagementArgs> management;

    public Input<NodePoolManagementArgs> getManagement() {
        return this.management == null ? Input.empty() : this.management;
    }

    /**
     * The maximum number of pods per node in this node pool.
     * Note that this does not work on node pools which are "route-based" - that is, node
     * pools belonging to clusters that do not have IP Aliasing enabled.
     * See the [official documentation](https://cloud.google.com/kubernetes-engine/docs/how-to/flexible-pod-cidr)
     * for more information.
     * 
     */
    @InputImport(name="maxPodsPerNode")
        private final @Nullable Input<Integer> maxPodsPerNode;

    public Input<Integer> getMaxPodsPerNode() {
        return this.maxPodsPerNode == null ? Input.empty() : this.maxPodsPerNode;
    }

    /**
     * The name of the node pool. If left blank, the provider will
     * auto-generate a unique name.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Creates a unique name for the node pool beginning
     * with the specified prefix. Conflicts with `name`.
     * 
     */
    @InputImport(name="namePrefix")
        private final @Nullable Input<String> namePrefix;

    public Input<String> getNamePrefix() {
        return this.namePrefix == null ? Input.empty() : this.namePrefix;
    }

    /**
     * The network configuration of the pool. See
     * gcp.container.Cluster for schema.
     * 
     */
    @InputImport(name="networkConfig")
        private final @Nullable Input<NodePoolNetworkConfigArgs> networkConfig;

    public Input<NodePoolNetworkConfigArgs> getNetworkConfig() {
        return this.networkConfig == null ? Input.empty() : this.networkConfig;
    }

    /**
     * Parameters used in creating the node pool. See
     * gcp.container.Cluster for schema.
     * 
     */
    @InputImport(name="nodeConfig")
        private final @Nullable Input<NodePoolNodeConfigArgs> nodeConfig;

    public Input<NodePoolNodeConfigArgs> getNodeConfig() {
        return this.nodeConfig == null ? Input.empty() : this.nodeConfig;
    }

    /**
     * The number of nodes per instance group. This field can be used to
     * update the number of nodes per instance group but should not be used alongside `autoscaling`.
     * 
     */
    @InputImport(name="nodeCount")
        private final @Nullable Input<Integer> nodeCount;

    public Input<Integer> getNodeCount() {
        return this.nodeCount == null ? Input.empty() : this.nodeCount;
    }

    /**
     * The list of zones in which the node pool's nodes should be located. Nodes must
     * be in the region of their regional cluster or in the same region as their
     * cluster's zone for zonal clusters. If unspecified, the cluster-level
     * `node_locations` will be used.
     * 
     */
    @InputImport(name="nodeLocations")
        private final @Nullable Input<List<String>> nodeLocations;

    public Input<List<String>> getNodeLocations() {
        return this.nodeLocations == null ? Input.empty() : this.nodeLocations;
    }

    /**
     * The ID of the project in which to create the node pool. If blank,
     * the provider-configured project will be used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Specify node upgrade settings to change how many nodes GKE attempts to
     * upgrade at once. The number of nodes upgraded simultaneously is the sum of `max_surge` and `max_unavailable`.
     * The maximum number of nodes upgraded simultaneously is limited to 20. Structure is documented below.
     * 
     */
    @InputImport(name="upgradeSettings")
        private final @Nullable Input<NodePoolUpgradeSettingsArgs> upgradeSettings;

    public Input<NodePoolUpgradeSettingsArgs> getUpgradeSettings() {
        return this.upgradeSettings == null ? Input.empty() : this.upgradeSettings;
    }

    /**
     * The Kubernetes version for the nodes in this pool. Note that if this field
     * and `auto_upgrade` are both specified, they will fight each other for what the node version should
     * be, so setting both is highly discouraged. While a fuzzy version can be specified, it's
     * recommended that you specify explicit versions as the provider will see spurious diffs
     * when fuzzy versions are used. See the `gcp.container.getEngineVersions` data source's
     * `version_prefix` field to approximate fuzzy versions in a provider-compatible way.
     * 
     */
    @InputImport(name="version")
        private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public NodePoolArgs(
        @Nullable Input<NodePoolAutoscalingArgs> autoscaling,
        Input<String> cluster,
        @Nullable Input<Integer> initialNodeCount,
        @Nullable Input<String> location,
        @Nullable Input<NodePoolManagementArgs> management,
        @Nullable Input<Integer> maxPodsPerNode,
        @Nullable Input<String> name,
        @Nullable Input<String> namePrefix,
        @Nullable Input<NodePoolNetworkConfigArgs> networkConfig,
        @Nullable Input<NodePoolNodeConfigArgs> nodeConfig,
        @Nullable Input<Integer> nodeCount,
        @Nullable Input<List<String>> nodeLocations,
        @Nullable Input<String> project,
        @Nullable Input<NodePoolUpgradeSettingsArgs> upgradeSettings,
        @Nullable Input<String> version) {
        this.autoscaling = autoscaling;
        this.cluster = Objects.requireNonNull(cluster, "expected parameter 'cluster' to be non-null");
        this.initialNodeCount = initialNodeCount;
        this.location = location;
        this.management = management;
        this.maxPodsPerNode = maxPodsPerNode;
        this.name = name;
        this.namePrefix = namePrefix;
        this.networkConfig = networkConfig;
        this.nodeConfig = nodeConfig;
        this.nodeCount = nodeCount;
        this.nodeLocations = nodeLocations;
        this.project = project;
        this.upgradeSettings = upgradeSettings;
        this.version = version;
    }

    private NodePoolArgs() {
        this.autoscaling = Input.empty();
        this.cluster = Input.empty();
        this.initialNodeCount = Input.empty();
        this.location = Input.empty();
        this.management = Input.empty();
        this.maxPodsPerNode = Input.empty();
        this.name = Input.empty();
        this.namePrefix = Input.empty();
        this.networkConfig = Input.empty();
        this.nodeConfig = Input.empty();
        this.nodeCount = Input.empty();
        this.nodeLocations = Input.empty();
        this.project = Input.empty();
        this.upgradeSettings = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<NodePoolAutoscalingArgs> autoscaling;
        private Input<String> cluster;
        private @Nullable Input<Integer> initialNodeCount;
        private @Nullable Input<String> location;
        private @Nullable Input<NodePoolManagementArgs> management;
        private @Nullable Input<Integer> maxPodsPerNode;
        private @Nullable Input<String> name;
        private @Nullable Input<String> namePrefix;
        private @Nullable Input<NodePoolNetworkConfigArgs> networkConfig;
        private @Nullable Input<NodePoolNodeConfigArgs> nodeConfig;
        private @Nullable Input<Integer> nodeCount;
        private @Nullable Input<List<String>> nodeLocations;
        private @Nullable Input<String> project;
        private @Nullable Input<NodePoolUpgradeSettingsArgs> upgradeSettings;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaling = defaults.autoscaling;
    	      this.cluster = defaults.cluster;
    	      this.initialNodeCount = defaults.initialNodeCount;
    	      this.location = defaults.location;
    	      this.management = defaults.management;
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.networkConfig = defaults.networkConfig;
    	      this.nodeConfig = defaults.nodeConfig;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nodeLocations = defaults.nodeLocations;
    	      this.project = defaults.project;
    	      this.upgradeSettings = defaults.upgradeSettings;
    	      this.version = defaults.version;
        }

        public Builder setAutoscaling(@Nullable Input<NodePoolAutoscalingArgs> autoscaling) {
            this.autoscaling = autoscaling;
            return this;
        }

        public Builder setAutoscaling(@Nullable NodePoolAutoscalingArgs autoscaling) {
            this.autoscaling = Input.ofNullable(autoscaling);
            return this;
        }

        public Builder setCluster(Input<String> cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }

        public Builder setCluster(String cluster) {
            this.cluster = Input.of(Objects.requireNonNull(cluster));
            return this;
        }

        public Builder setInitialNodeCount(@Nullable Input<Integer> initialNodeCount) {
            this.initialNodeCount = initialNodeCount;
            return this;
        }

        public Builder setInitialNodeCount(@Nullable Integer initialNodeCount) {
            this.initialNodeCount = Input.ofNullable(initialNodeCount);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setManagement(@Nullable Input<NodePoolManagementArgs> management) {
            this.management = management;
            return this;
        }

        public Builder setManagement(@Nullable NodePoolManagementArgs management) {
            this.management = Input.ofNullable(management);
            return this;
        }

        public Builder setMaxPodsPerNode(@Nullable Input<Integer> maxPodsPerNode) {
            this.maxPodsPerNode = maxPodsPerNode;
            return this;
        }

        public Builder setMaxPodsPerNode(@Nullable Integer maxPodsPerNode) {
            this.maxPodsPerNode = Input.ofNullable(maxPodsPerNode);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNamePrefix(@Nullable Input<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }

        public Builder setNamePrefix(@Nullable String namePrefix) {
            this.namePrefix = Input.ofNullable(namePrefix);
            return this;
        }

        public Builder setNetworkConfig(@Nullable Input<NodePoolNetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        public Builder setNetworkConfig(@Nullable NodePoolNetworkConfigArgs networkConfig) {
            this.networkConfig = Input.ofNullable(networkConfig);
            return this;
        }

        public Builder setNodeConfig(@Nullable Input<NodePoolNodeConfigArgs> nodeConfig) {
            this.nodeConfig = nodeConfig;
            return this;
        }

        public Builder setNodeConfig(@Nullable NodePoolNodeConfigArgs nodeConfig) {
            this.nodeConfig = Input.ofNullable(nodeConfig);
            return this;
        }

        public Builder setNodeCount(@Nullable Input<Integer> nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        public Builder setNodeCount(@Nullable Integer nodeCount) {
            this.nodeCount = Input.ofNullable(nodeCount);
            return this;
        }

        public Builder setNodeLocations(@Nullable Input<List<String>> nodeLocations) {
            this.nodeLocations = nodeLocations;
            return this;
        }

        public Builder setNodeLocations(@Nullable List<String> nodeLocations) {
            this.nodeLocations = Input.ofNullable(nodeLocations);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setUpgradeSettings(@Nullable Input<NodePoolUpgradeSettingsArgs> upgradeSettings) {
            this.upgradeSettings = upgradeSettings;
            return this;
        }

        public Builder setUpgradeSettings(@Nullable NodePoolUpgradeSettingsArgs upgradeSettings) {
            this.upgradeSettings = Input.ofNullable(upgradeSettings);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public NodePoolArgs build() {
            return new NodePoolArgs(autoscaling, cluster, initialNodeCount, location, management, maxPodsPerNode, name, namePrefix, networkConfig, nodeConfig, nodeCount, nodeLocations, project, upgradeSettings, version);
        }
    }
}
