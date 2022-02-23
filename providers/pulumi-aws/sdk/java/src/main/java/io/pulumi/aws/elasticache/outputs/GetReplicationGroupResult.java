// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetReplicationGroupResult {
    /**
     * The Amazon Resource Name (ARN) of the created ElastiCache Replication Group.
     * 
     */
    private final String arn;
    /**
     * Specifies whether an AuthToken (password) is enabled.
     * 
     */
    private final Boolean authTokenEnabled;
    /**
     * A flag whether a read-only replica will be automatically promoted to read/write primary if the existing primary fails.
     * 
     */
    private final Boolean automaticFailoverEnabled;
    /**
     * The configuration endpoint address to allow host discovery.
     * 
     */
    private final String configurationEndpointAddress;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The identifiers of all the nodes that are part of this replication group.
     * 
     */
    private final List<String> memberClusters;
    /**
     * Specifies whether Multi-AZ Support is enabled for the replication group.
     * 
     */
    private final Boolean multiAzEnabled;
    /**
     * The cluster node type.
     * 
     */
    private final String nodeType;
    /**
     * The number of cache clusters that the replication group has.
     * 
     */
    private final Integer numberCacheClusters;
    /**
     * The port number on which the configuration endpoint will accept connections.
     * 
     */
    private final Integer port;
    /**
     * The endpoint of the primary node in this node group (shard).
     * 
     */
    private final String primaryEndpointAddress;
    /**
     * The endpoint of the reader node in this node group (shard).
     * 
     */
    private final String readerEndpointAddress;
    /**
     * The description of the replication group.
     * 
     */
    private final String replicationGroupDescription;
    private final String replicationGroupId;
    /**
     * The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them.
     * 
     */
    private final Integer snapshotRetentionLimit;
    /**
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard).
     * 
     */
    private final String snapshotWindow;

    @OutputCustomType.Constructor({"arn","authTokenEnabled","automaticFailoverEnabled","configurationEndpointAddress","id","memberClusters","multiAzEnabled","nodeType","numberCacheClusters","port","primaryEndpointAddress","readerEndpointAddress","replicationGroupDescription","replicationGroupId","snapshotRetentionLimit","snapshotWindow"})
    private GetReplicationGroupResult(
        String arn,
        Boolean authTokenEnabled,
        Boolean automaticFailoverEnabled,
        String configurationEndpointAddress,
        String id,
        List<String> memberClusters,
        Boolean multiAzEnabled,
        String nodeType,
        Integer numberCacheClusters,
        Integer port,
        String primaryEndpointAddress,
        String readerEndpointAddress,
        String replicationGroupDescription,
        String replicationGroupId,
        Integer snapshotRetentionLimit,
        String snapshotWindow) {
        this.arn = Objects.requireNonNull(arn);
        this.authTokenEnabled = Objects.requireNonNull(authTokenEnabled);
        this.automaticFailoverEnabled = Objects.requireNonNull(automaticFailoverEnabled);
        this.configurationEndpointAddress = Objects.requireNonNull(configurationEndpointAddress);
        this.id = Objects.requireNonNull(id);
        this.memberClusters = Objects.requireNonNull(memberClusters);
        this.multiAzEnabled = Objects.requireNonNull(multiAzEnabled);
        this.nodeType = Objects.requireNonNull(nodeType);
        this.numberCacheClusters = Objects.requireNonNull(numberCacheClusters);
        this.port = Objects.requireNonNull(port);
        this.primaryEndpointAddress = Objects.requireNonNull(primaryEndpointAddress);
        this.readerEndpointAddress = Objects.requireNonNull(readerEndpointAddress);
        this.replicationGroupDescription = Objects.requireNonNull(replicationGroupDescription);
        this.replicationGroupId = Objects.requireNonNull(replicationGroupId);
        this.snapshotRetentionLimit = Objects.requireNonNull(snapshotRetentionLimit);
        this.snapshotWindow = Objects.requireNonNull(snapshotWindow);
    }

    /**
     * The Amazon Resource Name (ARN) of the created ElastiCache Replication Group.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * Specifies whether an AuthToken (password) is enabled.
     * 
     */
    public Boolean getAuthTokenEnabled() {
        return this.authTokenEnabled;
    }
    /**
     * A flag whether a read-only replica will be automatically promoted to read/write primary if the existing primary fails.
     * 
     */
    public Boolean getAutomaticFailoverEnabled() {
        return this.automaticFailoverEnabled;
    }
    /**
     * The configuration endpoint address to allow host discovery.
     * 
     */
    public String getConfigurationEndpointAddress() {
        return this.configurationEndpointAddress;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The identifiers of all the nodes that are part of this replication group.
     * 
     */
    public List<String> getMemberClusters() {
        return this.memberClusters;
    }
    /**
     * Specifies whether Multi-AZ Support is enabled for the replication group.
     * 
     */
    public Boolean getMultiAzEnabled() {
        return this.multiAzEnabled;
    }
    /**
     * The cluster node type.
     * 
     */
    public String getNodeType() {
        return this.nodeType;
    }
    /**
     * The number of cache clusters that the replication group has.
     * 
     */
    public Integer getNumberCacheClusters() {
        return this.numberCacheClusters;
    }
    /**
     * The port number on which the configuration endpoint will accept connections.
     * 
     */
    public Integer getPort() {
        return this.port;
    }
    /**
     * The endpoint of the primary node in this node group (shard).
     * 
     */
    public String getPrimaryEndpointAddress() {
        return this.primaryEndpointAddress;
    }
    /**
     * The endpoint of the reader node in this node group (shard).
     * 
     */
    public String getReaderEndpointAddress() {
        return this.readerEndpointAddress;
    }
    /**
     * The description of the replication group.
     * 
     */
    public String getReplicationGroupDescription() {
        return this.replicationGroupDescription;
    }
    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }
    /**
     * The number of days for which ElastiCache retains automatic cache cluster snapshots before deleting them.
     * 
     */
    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }
    /**
     * The daily time range (in UTC) during which ElastiCache begins taking a daily snapshot of your node group (shard).
     * 
     */
    public String getSnapshotWindow() {
        return this.snapshotWindow;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicationGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private Boolean authTokenEnabled;
        private Boolean automaticFailoverEnabled;
        private String configurationEndpointAddress;
        private String id;
        private List<String> memberClusters;
        private Boolean multiAzEnabled;
        private String nodeType;
        private Integer numberCacheClusters;
        private Integer port;
        private String primaryEndpointAddress;
        private String readerEndpointAddress;
        private String replicationGroupDescription;
        private String replicationGroupId;
        private Integer snapshotRetentionLimit;
        private String snapshotWindow;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplicationGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.authTokenEnabled = defaults.authTokenEnabled;
    	      this.automaticFailoverEnabled = defaults.automaticFailoverEnabled;
    	      this.configurationEndpointAddress = defaults.configurationEndpointAddress;
    	      this.id = defaults.id;
    	      this.memberClusters = defaults.memberClusters;
    	      this.multiAzEnabled = defaults.multiAzEnabled;
    	      this.nodeType = defaults.nodeType;
    	      this.numberCacheClusters = defaults.numberCacheClusters;
    	      this.port = defaults.port;
    	      this.primaryEndpointAddress = defaults.primaryEndpointAddress;
    	      this.readerEndpointAddress = defaults.readerEndpointAddress;
    	      this.replicationGroupDescription = defaults.replicationGroupDescription;
    	      this.replicationGroupId = defaults.replicationGroupId;
    	      this.snapshotRetentionLimit = defaults.snapshotRetentionLimit;
    	      this.snapshotWindow = defaults.snapshotWindow;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAuthTokenEnabled(Boolean authTokenEnabled) {
            this.authTokenEnabled = Objects.requireNonNull(authTokenEnabled);
            return this;
        }

        public Builder setAutomaticFailoverEnabled(Boolean automaticFailoverEnabled) {
            this.automaticFailoverEnabled = Objects.requireNonNull(automaticFailoverEnabled);
            return this;
        }

        public Builder setConfigurationEndpointAddress(String configurationEndpointAddress) {
            this.configurationEndpointAddress = Objects.requireNonNull(configurationEndpointAddress);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMemberClusters(List<String> memberClusters) {
            this.memberClusters = Objects.requireNonNull(memberClusters);
            return this;
        }

        public Builder setMultiAzEnabled(Boolean multiAzEnabled) {
            this.multiAzEnabled = Objects.requireNonNull(multiAzEnabled);
            return this;
        }

        public Builder setNodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }

        public Builder setNumberCacheClusters(Integer numberCacheClusters) {
            this.numberCacheClusters = Objects.requireNonNull(numberCacheClusters);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPrimaryEndpointAddress(String primaryEndpointAddress) {
            this.primaryEndpointAddress = Objects.requireNonNull(primaryEndpointAddress);
            return this;
        }

        public Builder setReaderEndpointAddress(String readerEndpointAddress) {
            this.readerEndpointAddress = Objects.requireNonNull(readerEndpointAddress);
            return this;
        }

        public Builder setReplicationGroupDescription(String replicationGroupDescription) {
            this.replicationGroupDescription = Objects.requireNonNull(replicationGroupDescription);
            return this;
        }

        public Builder setReplicationGroupId(String replicationGroupId) {
            this.replicationGroupId = Objects.requireNonNull(replicationGroupId);
            return this;
        }

        public Builder setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
            this.snapshotRetentionLimit = Objects.requireNonNull(snapshotRetentionLimit);
            return this;
        }

        public Builder setSnapshotWindow(String snapshotWindow) {
            this.snapshotWindow = Objects.requireNonNull(snapshotWindow);
            return this;
        }
        public GetReplicationGroupResult build() {
            return new GetReplicationGroupResult(arn, authTokenEnabled, automaticFailoverEnabled, configurationEndpointAddress, id, memberClusters, multiAzEnabled, nodeType, numberCacheClusters, port, primaryEndpointAddress, readerEndpointAddress, replicationGroupDescription, replicationGroupId, snapshotRetentionLimit, snapshotWindow);
        }
    }
}
