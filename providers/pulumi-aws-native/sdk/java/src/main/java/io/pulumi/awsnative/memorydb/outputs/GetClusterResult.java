// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.memorydb.outputs;

import io.pulumi.awsnative.memorydb.outputs.ClusterEndpoint;
import io.pulumi.awsnative.memorydb.outputs.ClusterTag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetClusterResult {
    private final @Nullable String aCLName;
    private final @Nullable String aRN;
    private final @Nullable Boolean autoMinorVersionUpgrade;
    private final @Nullable ClusterEndpoint clusterEndpoint;
    private final @Nullable String description;
    private final @Nullable String engineVersion;
    private final @Nullable String finalSnapshotName;
    private final @Nullable String maintenanceWindow;
    private final @Nullable String nodeType;
    private final @Nullable Integer numReplicasPerShard;
    private final @Nullable Integer numShards;
    private final @Nullable String parameterGroupName;
    private final @Nullable String parameterGroupStatus;
    private final @Nullable List<String> securityGroupIds;
    private final @Nullable Integer snapshotRetentionLimit;
    private final @Nullable String snapshotWindow;
    private final @Nullable String snsTopicArn;
    private final @Nullable String snsTopicStatus;
    private final @Nullable String status;
    private final @Nullable String subnetGroupName;
    private final @Nullable List<ClusterTag> tags;

    @OutputCustomType.Constructor({"aCLName","aRN","autoMinorVersionUpgrade","clusterEndpoint","description","engineVersion","finalSnapshotName","maintenanceWindow","nodeType","numReplicasPerShard","numShards","parameterGroupName","parameterGroupStatus","securityGroupIds","snapshotRetentionLimit","snapshotWindow","snsTopicArn","snsTopicStatus","status","subnetGroupName","tags"})
    private GetClusterResult(
        @Nullable String aCLName,
        @Nullable String aRN,
        @Nullable Boolean autoMinorVersionUpgrade,
        @Nullable ClusterEndpoint clusterEndpoint,
        @Nullable String description,
        @Nullable String engineVersion,
        @Nullable String finalSnapshotName,
        @Nullable String maintenanceWindow,
        @Nullable String nodeType,
        @Nullable Integer numReplicasPerShard,
        @Nullable Integer numShards,
        @Nullable String parameterGroupName,
        @Nullable String parameterGroupStatus,
        @Nullable List<String> securityGroupIds,
        @Nullable Integer snapshotRetentionLimit,
        @Nullable String snapshotWindow,
        @Nullable String snsTopicArn,
        @Nullable String snsTopicStatus,
        @Nullable String status,
        @Nullable String subnetGroupName,
        @Nullable List<ClusterTag> tags) {
        this.aCLName = aCLName;
        this.aRN = aRN;
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        this.clusterEndpoint = clusterEndpoint;
        this.description = description;
        this.engineVersion = engineVersion;
        this.finalSnapshotName = finalSnapshotName;
        this.maintenanceWindow = maintenanceWindow;
        this.nodeType = nodeType;
        this.numReplicasPerShard = numReplicasPerShard;
        this.numShards = numShards;
        this.parameterGroupName = parameterGroupName;
        this.parameterGroupStatus = parameterGroupStatus;
        this.securityGroupIds = securityGroupIds;
        this.snapshotRetentionLimit = snapshotRetentionLimit;
        this.snapshotWindow = snapshotWindow;
        this.snsTopicArn = snsTopicArn;
        this.snsTopicStatus = snsTopicStatus;
        this.status = status;
        this.subnetGroupName = subnetGroupName;
        this.tags = tags;
    }

    public Optional<String> getACLName() {
        return Optional.ofNullable(this.aCLName);
    }
    public Optional<String> getARN() {
        return Optional.ofNullable(this.aRN);
    }
    public Optional<Boolean> getAutoMinorVersionUpgrade() {
        return Optional.ofNullable(this.autoMinorVersionUpgrade);
    }
    public Optional<ClusterEndpoint> getClusterEndpoint() {
        return Optional.ofNullable(this.clusterEndpoint);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getEngineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }
    public Optional<String> getFinalSnapshotName() {
        return Optional.ofNullable(this.finalSnapshotName);
    }
    public Optional<String> getMaintenanceWindow() {
        return Optional.ofNullable(this.maintenanceWindow);
    }
    public Optional<String> getNodeType() {
        return Optional.ofNullable(this.nodeType);
    }
    public Optional<Integer> getNumReplicasPerShard() {
        return Optional.ofNullable(this.numReplicasPerShard);
    }
    public Optional<Integer> getNumShards() {
        return Optional.ofNullable(this.numShards);
    }
    public Optional<String> getParameterGroupName() {
        return Optional.ofNullable(this.parameterGroupName);
    }
    public Optional<String> getParameterGroupStatus() {
        return Optional.ofNullable(this.parameterGroupStatus);
    }
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    public Optional<Integer> getSnapshotRetentionLimit() {
        return Optional.ofNullable(this.snapshotRetentionLimit);
    }
    public Optional<String> getSnapshotWindow() {
        return Optional.ofNullable(this.snapshotWindow);
    }
    public Optional<String> getSnsTopicArn() {
        return Optional.ofNullable(this.snsTopicArn);
    }
    public Optional<String> getSnsTopicStatus() {
        return Optional.ofNullable(this.snsTopicStatus);
    }
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    public Optional<String> getSubnetGroupName() {
        return Optional.ofNullable(this.subnetGroupName);
    }
    public List<ClusterTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String aCLName;
        private @Nullable String aRN;
        private @Nullable Boolean autoMinorVersionUpgrade;
        private @Nullable ClusterEndpoint clusterEndpoint;
        private @Nullable String description;
        private @Nullable String engineVersion;
        private @Nullable String finalSnapshotName;
        private @Nullable String maintenanceWindow;
        private @Nullable String nodeType;
        private @Nullable Integer numReplicasPerShard;
        private @Nullable Integer numShards;
        private @Nullable String parameterGroupName;
        private @Nullable String parameterGroupStatus;
        private @Nullable List<String> securityGroupIds;
        private @Nullable Integer snapshotRetentionLimit;
        private @Nullable String snapshotWindow;
        private @Nullable String snsTopicArn;
        private @Nullable String snsTopicStatus;
        private @Nullable String status;
        private @Nullable String subnetGroupName;
        private @Nullable List<ClusterTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aCLName = defaults.aCLName;
    	      this.aRN = defaults.aRN;
    	      this.autoMinorVersionUpgrade = defaults.autoMinorVersionUpgrade;
    	      this.clusterEndpoint = defaults.clusterEndpoint;
    	      this.description = defaults.description;
    	      this.engineVersion = defaults.engineVersion;
    	      this.finalSnapshotName = defaults.finalSnapshotName;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.nodeType = defaults.nodeType;
    	      this.numReplicasPerShard = defaults.numReplicasPerShard;
    	      this.numShards = defaults.numShards;
    	      this.parameterGroupName = defaults.parameterGroupName;
    	      this.parameterGroupStatus = defaults.parameterGroupStatus;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.snapshotRetentionLimit = defaults.snapshotRetentionLimit;
    	      this.snapshotWindow = defaults.snapshotWindow;
    	      this.snsTopicArn = defaults.snsTopicArn;
    	      this.snsTopicStatus = defaults.snsTopicStatus;
    	      this.status = defaults.status;
    	      this.subnetGroupName = defaults.subnetGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setACLName(@Nullable String aCLName) {
            this.aCLName = aCLName;
            return this;
        }

        public Builder setARN(@Nullable String aRN) {
            this.aRN = aRN;
            return this;
        }

        public Builder setAutoMinorVersionUpgrade(@Nullable Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }

        public Builder setClusterEndpoint(@Nullable ClusterEndpoint clusterEndpoint) {
            this.clusterEndpoint = clusterEndpoint;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEngineVersion(@Nullable String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }

        public Builder setFinalSnapshotName(@Nullable String finalSnapshotName) {
            this.finalSnapshotName = finalSnapshotName;
            return this;
        }

        public Builder setMaintenanceWindow(@Nullable String maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder setNodeType(@Nullable String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        public Builder setNumReplicasPerShard(@Nullable Integer numReplicasPerShard) {
            this.numReplicasPerShard = numReplicasPerShard;
            return this;
        }

        public Builder setNumShards(@Nullable Integer numShards) {
            this.numShards = numShards;
            return this;
        }

        public Builder setParameterGroupName(@Nullable String parameterGroupName) {
            this.parameterGroupName = parameterGroupName;
            return this;
        }

        public Builder setParameterGroupStatus(@Nullable String parameterGroupStatus) {
            this.parameterGroupStatus = parameterGroupStatus;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSnapshotRetentionLimit(@Nullable Integer snapshotRetentionLimit) {
            this.snapshotRetentionLimit = snapshotRetentionLimit;
            return this;
        }

        public Builder setSnapshotWindow(@Nullable String snapshotWindow) {
            this.snapshotWindow = snapshotWindow;
            return this;
        }

        public Builder setSnsTopicArn(@Nullable String snsTopicArn) {
            this.snsTopicArn = snsTopicArn;
            return this;
        }

        public Builder setSnsTopicStatus(@Nullable String snsTopicStatus) {
            this.snsTopicStatus = snsTopicStatus;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setSubnetGroupName(@Nullable String subnetGroupName) {
            this.subnetGroupName = subnetGroupName;
            return this;
        }

        public Builder setTags(@Nullable List<ClusterTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetClusterResult build() {
            return new GetClusterResult(aCLName, aRN, autoMinorVersionUpgrade, clusterEndpoint, description, engineVersion, finalSnapshotName, maintenanceWindow, nodeType, numReplicasPerShard, numShards, parameterGroupName, parameterGroupStatus, securityGroupIds, snapshotRetentionLimit, snapshotWindow, snsTopicArn, snsTopicStatus, status, subnetGroupName, tags);
        }
    }
}