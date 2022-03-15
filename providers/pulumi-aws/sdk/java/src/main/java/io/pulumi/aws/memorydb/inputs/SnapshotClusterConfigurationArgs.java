// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.memorydb.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotClusterConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotClusterConfigurationArgs Empty = new SnapshotClusterConfigurationArgs();

    /**
     * Description for the cluster.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Version number of the Redis engine used by the cluster.
     * 
     */
    @Import(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> getEngineVersion() {
        return this.engineVersion == null ? Output.empty() : this.engineVersion;
    }

    /**
     * The weekly time range during which maintenance on the cluster is performed.
     * 
     */
    @Import(name="maintenanceWindow")
      private final @Nullable Output<String> maintenanceWindow;

    public Output<String> getMaintenanceWindow() {
        return this.maintenanceWindow == null ? Output.empty() : this.maintenanceWindow;
    }

    /**
     * Name of the cluster.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Compute and memory capacity of the nodes in the cluster.
     * 
     */
    @Import(name="nodeType")
      private final @Nullable Output<String> nodeType;

    public Output<String> getNodeType() {
        return this.nodeType == null ? Output.empty() : this.nodeType;
    }

    /**
     * Number of shards in the cluster.
     * 
     */
    @Import(name="numShards")
      private final @Nullable Output<Integer> numShards;

    public Output<Integer> getNumShards() {
        return this.numShards == null ? Output.empty() : this.numShards;
    }

    /**
     * Name of the parameter group associated with the cluster.
     * 
     */
    @Import(name="parameterGroupName")
      private final @Nullable Output<String> parameterGroupName;

    public Output<String> getParameterGroupName() {
        return this.parameterGroupName == null ? Output.empty() : this.parameterGroupName;
    }

    /**
     * Port number on which the cluster accepts connections.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * Number of days for which MemoryDB retains automatic snapshots before deleting them.
     * 
     */
    @Import(name="snapshotRetentionLimit")
      private final @Nullable Output<Integer> snapshotRetentionLimit;

    public Output<Integer> getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit == null ? Output.empty() : this.snapshotRetentionLimit;
    }

    /**
     * The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of the shard.
     * 
     */
    @Import(name="snapshotWindow")
      private final @Nullable Output<String> snapshotWindow;

    public Output<String> getSnapshotWindow() {
        return this.snapshotWindow == null ? Output.empty() : this.snapshotWindow;
    }

    /**
     * Name of the subnet group used by the cluster.
     * 
     */
    @Import(name="subnetGroupName")
      private final @Nullable Output<String> subnetGroupName;

    public Output<String> getSubnetGroupName() {
        return this.subnetGroupName == null ? Output.empty() : this.subnetGroupName;
    }

    /**
     * ARN of the SNS topic to which cluster notifications are sent.
     * 
     */
    @Import(name="topicArn")
      private final @Nullable Output<String> topicArn;

    public Output<String> getTopicArn() {
        return this.topicArn == null ? Output.empty() : this.topicArn;
    }

    /**
     * The VPC in which the cluster exists.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId == null ? Output.empty() : this.vpcId;
    }

    public SnapshotClusterConfigurationArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> engineVersion,
        @Nullable Output<String> maintenanceWindow,
        @Nullable Output<String> name,
        @Nullable Output<String> nodeType,
        @Nullable Output<Integer> numShards,
        @Nullable Output<String> parameterGroupName,
        @Nullable Output<Integer> port,
        @Nullable Output<Integer> snapshotRetentionLimit,
        @Nullable Output<String> snapshotWindow,
        @Nullable Output<String> subnetGroupName,
        @Nullable Output<String> topicArn,
        @Nullable Output<String> vpcId) {
        this.description = description;
        this.engineVersion = engineVersion;
        this.maintenanceWindow = maintenanceWindow;
        this.name = name;
        this.nodeType = nodeType;
        this.numShards = numShards;
        this.parameterGroupName = parameterGroupName;
        this.port = port;
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        this.snapshotWindow = snapshotWindow;
        this.subnetGroupName = subnetGroupName;
        this.topicArn = topicArn;
        this.vpcId = vpcId;
    }

    private SnapshotClusterConfigurationArgs() {
        this.description = Output.empty();
        this.engineVersion = Output.empty();
        this.maintenanceWindow = Output.empty();
        this.name = Output.empty();
        this.nodeType = Output.empty();
        this.numShards = Output.empty();
        this.parameterGroupName = Output.empty();
        this.port = Output.empty();
        this.snapshotRetentionLimit = Output.empty();
        this.snapshotWindow = Output.empty();
        this.subnetGroupName = Output.empty();
        this.topicArn = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotClusterConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> engineVersion;
        private @Nullable Output<String> maintenanceWindow;
        private @Nullable Output<String> name;
        private @Nullable Output<String> nodeType;
        private @Nullable Output<Integer> numShards;
        private @Nullable Output<String> parameterGroupName;
        private @Nullable Output<Integer> port;
        private @Nullable Output<Integer> snapshotRetentionLimit;
        private @Nullable Output<String> snapshotWindow;
        private @Nullable Output<String> subnetGroupName;
        private @Nullable Output<String> topicArn;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotClusterConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.engineVersion = defaults.engineVersion;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.name = defaults.name;
    	      this.nodeType = defaults.nodeType;
    	      this.numShards = defaults.numShards;
    	      this.parameterGroupName = defaults.parameterGroupName;
    	      this.port = defaults.port;
    	      this.snapshotRetentionLimit = defaults.snapshotRetentionLimit;
    	      this.snapshotWindow = defaults.snapshotWindow;
    	      this.subnetGroupName = defaults.subnetGroupName;
    	      this.topicArn = defaults.topicArn;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder engineVersion(@Nullable String engineVersion) {
            this.engineVersion = Output.ofNullable(engineVersion);
            return this;
        }

        public Builder maintenanceWindow(@Nullable Output<String> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder maintenanceWindow(@Nullable String maintenanceWindow) {
            this.maintenanceWindow = Output.ofNullable(maintenanceWindow);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder nodeType(@Nullable Output<String> nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        public Builder nodeType(@Nullable String nodeType) {
            this.nodeType = Output.ofNullable(nodeType);
            return this;
        }

        public Builder numShards(@Nullable Output<Integer> numShards) {
            this.numShards = numShards;
            return this;
        }

        public Builder numShards(@Nullable Integer numShards) {
            this.numShards = Output.ofNullable(numShards);
            return this;
        }

        public Builder parameterGroupName(@Nullable Output<String> parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }

        public Builder parameterGroupName(@Nullable String parameterGroupName) {
            this.parameterGroupName = Output.ofNullable(parameterGroupName);
            return this;
        }

        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Output.ofNullable(port);
            return this;
        }

        public Builder snapshotRetentionLimit(@Nullable Output<Integer> snapshotRetentionLimit) {
            this.snapshotRetentionLimit = snapshotRetentionLimit;
            return this;
        }

        public Builder snapshotRetentionLimit(@Nullable Integer snapshotRetentionLimit) {
            this.snapshotRetentionLimit = Output.ofNullable(snapshotRetentionLimit);
            return this;
        }

        public Builder snapshotWindow(@Nullable Output<String> snapshotWindow) {
            this.snapshotWindow = snapshotWindow;
            return this;
        }

        public Builder snapshotWindow(@Nullable String snapshotWindow) {
            this.snapshotWindow = Output.ofNullable(snapshotWindow);
            return this;
        }

        public Builder subnetGroupName(@Nullable Output<String> subnetGroupName) {
            this.subnetGroupName = subnetGroupName;
            return this;
        }

        public Builder subnetGroupName(@Nullable String subnetGroupName) {
            this.subnetGroupName = Output.ofNullable(subnetGroupName);
            return this;
        }

        public Builder topicArn(@Nullable Output<String> topicArn) {
            this.topicArn = topicArn;
            return this;
        }

        public Builder topicArn(@Nullable String topicArn) {
            this.topicArn = Output.ofNullable(topicArn);
            return this;
        }

        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Output.ofNullable(vpcId);
            return this;
        }
        public SnapshotClusterConfigurationArgs build() {
            return new SnapshotClusterConfigurationArgs(description, engineVersion, maintenanceWindow, name, nodeType, numShards, parameterGroupName, port, snapshotRetentionLimit, snapshotWindow, subnetGroupName, topicArn, vpcId);
        }
    }
}
