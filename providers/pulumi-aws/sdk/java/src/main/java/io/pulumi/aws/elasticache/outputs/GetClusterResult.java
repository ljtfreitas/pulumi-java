// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticache.outputs;

import io.pulumi.aws.elasticache.outputs.GetClusterCacheNode;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetClusterResult {
    private final String arn;
    /**
     * The Availability Zone for the cache cluster.
     * 
     */
    private final String availabilityZone;
    /**
     * List of node objects including `id`, `address`, `port` and `availability_zone`.
     * Referenceable e.g., as `${data.aws_elasticache_cluster.bar.cache_nodes.0.address}`
     * 
     */
    private final List<GetClusterCacheNode> cacheNodes;
    /**
     * (Memcached only) The DNS name of the cache cluster without the port appended.
     * 
     */
    private final String clusterAddress;
    private final String clusterId;
    /**
     * (Memcached only) The configuration endpoint to allow host discovery.
     * 
     */
    private final String configurationEndpoint;
    /**
     * Name of the cache engine.
     * 
     */
    private final String engine;
    /**
     * Version number of the cache engine.
     * 
     */
    private final String engineVersion;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Specifies the weekly time range for when maintenance
     * on the cache cluster is performed.
     * 
     */
    private final String maintenanceWindow;
    /**
     * The cluster node type.
     * 
     */
    private final String nodeType;
    /**
     * An Amazon Resource Name (ARN) of an
     * SNS topic that ElastiCache notifications get sent to.
     * 
     */
    private final String notificationTopicArn;
    /**
     * The number of cache nodes that the cache cluster has.
     * 
     */
    private final Integer numCacheNodes;
    /**
     * Name of the parameter group associated with this cache cluster.
     * 
     */
    private final String parameterGroupName;
    /**
     * The port number on which each of the cache nodes will
     * accept connections.
     * 
     */
    private final Integer port;
    /**
     * The replication group to which this cache cluster belongs.
     * 
     */
    private final String replicationGroupId;
    /**
     * List VPC security groups associated with the cache cluster.
     * 
     */
    private final List<String> securityGroupIds;
    /**
     * List of security group names associated with this cache cluster.
     * 
     */
    private final List<String> securityGroupNames;
    /**
     * The number of days for which ElastiCache will
     * retain automatic cache cluster snapshots before deleting them.
     * 
     */
    private final Integer snapshotRetentionLimit;
    /**
     * The daily time range (in UTC) during which ElastiCache will
     * begin taking a daily snapshot of the cache cluster.
     * 
     */
    private final String snapshotWindow;
    /**
     * Name of the subnet group associated to the cache cluster.
     * 
     */
    private final String subnetGroupName;
    /**
     * The tags assigned to the resource
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor({"arn","availabilityZone","cacheNodes","clusterAddress","clusterId","configurationEndpoint","engine","engineVersion","id","maintenanceWindow","nodeType","notificationTopicArn","numCacheNodes","parameterGroupName","port","replicationGroupId","securityGroupIds","securityGroupNames","snapshotRetentionLimit","snapshotWindow","subnetGroupName","tags"})
    private GetClusterResult(
        String arn,
        String availabilityZone,
        List<GetClusterCacheNode> cacheNodes,
        String clusterAddress,
        String clusterId,
        String configurationEndpoint,
        String engine,
        String engineVersion,
        String id,
        String maintenanceWindow,
        String nodeType,
        String notificationTopicArn,
        Integer numCacheNodes,
        String parameterGroupName,
        Integer port,
        String replicationGroupId,
        List<String> securityGroupIds,
        List<String> securityGroupNames,
        Integer snapshotRetentionLimit,
        String snapshotWindow,
        String subnetGroupName,
        Map<String,String> tags) {
        this.arn = Objects.requireNonNull(arn);
        this.availabilityZone = Objects.requireNonNull(availabilityZone);
        this.cacheNodes = Objects.requireNonNull(cacheNodes);
        this.clusterAddress = Objects.requireNonNull(clusterAddress);
        this.clusterId = Objects.requireNonNull(clusterId);
        this.configurationEndpoint = Objects.requireNonNull(configurationEndpoint);
        this.engine = Objects.requireNonNull(engine);
        this.engineVersion = Objects.requireNonNull(engineVersion);
        this.id = Objects.requireNonNull(id);
        this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
        this.nodeType = Objects.requireNonNull(nodeType);
        this.notificationTopicArn = Objects.requireNonNull(notificationTopicArn);
        this.numCacheNodes = Objects.requireNonNull(numCacheNodes);
        this.parameterGroupName = Objects.requireNonNull(parameterGroupName);
        this.port = Objects.requireNonNull(port);
        this.replicationGroupId = Objects.requireNonNull(replicationGroupId);
        this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
        this.securityGroupNames = Objects.requireNonNull(securityGroupNames);
        this.snapshotRetentionLimit = Objects.requireNonNull(snapshotRetentionLimit);
        this.snapshotWindow = Objects.requireNonNull(snapshotWindow);
        this.subnetGroupName = Objects.requireNonNull(subnetGroupName);
        this.tags = Objects.requireNonNull(tags);
    }

    public String getArn() {
        return this.arn;
    }
    /**
     * The Availability Zone for the cache cluster.
     * 
     */
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * List of node objects including `id`, `address`, `port` and `availability_zone`.
     * Referenceable e.g., as `${data.aws_elasticache_cluster.bar.cache_nodes.0.address}`
     * 
     */
    public List<GetClusterCacheNode> getCacheNodes() {
        return this.cacheNodes;
    }
    /**
     * (Memcached only) The DNS name of the cache cluster without the port appended.
     * 
     */
    public String getClusterAddress() {
        return this.clusterAddress;
    }
    public String getClusterId() {
        return this.clusterId;
    }
    /**
     * (Memcached only) The configuration endpoint to allow host discovery.
     * 
     */
    public String getConfigurationEndpoint() {
        return this.configurationEndpoint;
    }
    /**
     * Name of the cache engine.
     * 
     */
    public String getEngine() {
        return this.engine;
    }
    /**
     * Version number of the cache engine.
     * 
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Specifies the weekly time range for when maintenance
     * on the cache cluster is performed.
     * 
     */
    public String getMaintenanceWindow() {
        return this.maintenanceWindow;
    }
    /**
     * The cluster node type.
     * 
     */
    public String getNodeType() {
        return this.nodeType;
    }
    /**
     * An Amazon Resource Name (ARN) of an
     * SNS topic that ElastiCache notifications get sent to.
     * 
     */
    public String getNotificationTopicArn() {
        return this.notificationTopicArn;
    }
    /**
     * The number of cache nodes that the cache cluster has.
     * 
     */
    public Integer getNumCacheNodes() {
        return this.numCacheNodes;
    }
    /**
     * Name of the parameter group associated with this cache cluster.
     * 
     */
    public String getParameterGroupName() {
        return this.parameterGroupName;
    }
    /**
     * The port number on which each of the cache nodes will
     * accept connections.
     * 
     */
    public Integer getPort() {
        return this.port;
    }
    /**
     * The replication group to which this cache cluster belongs.
     * 
     */
    public String getReplicationGroupId() {
        return this.replicationGroupId;
    }
    /**
     * List VPC security groups associated with the cache cluster.
     * 
     */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    /**
     * List of security group names associated with this cache cluster.
     * 
     */
    public List<String> getSecurityGroupNames() {
        return this.securityGroupNames;
    }
    /**
     * The number of days for which ElastiCache will
     * retain automatic cache cluster snapshots before deleting them.
     * 
     */
    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }
    /**
     * The daily time range (in UTC) during which ElastiCache will
     * begin taking a daily snapshot of the cache cluster.
     * 
     */
    public String getSnapshotWindow() {
        return this.snapshotWindow;
    }
    /**
     * Name of the subnet group associated to the cache cluster.
     * 
     */
    public String getSubnetGroupName() {
        return this.subnetGroupName;
    }
    /**
     * The tags assigned to the resource
     * 
     */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String availabilityZone;
        private List<GetClusterCacheNode> cacheNodes;
        private String clusterAddress;
        private String clusterId;
        private String configurationEndpoint;
        private String engine;
        private String engineVersion;
        private String id;
        private String maintenanceWindow;
        private String nodeType;
        private String notificationTopicArn;
        private Integer numCacheNodes;
        private String parameterGroupName;
        private Integer port;
        private String replicationGroupId;
        private List<String> securityGroupIds;
        private List<String> securityGroupNames;
        private Integer snapshotRetentionLimit;
        private String snapshotWindow;
        private String subnetGroupName;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.cacheNodes = defaults.cacheNodes;
    	      this.clusterAddress = defaults.clusterAddress;
    	      this.clusterId = defaults.clusterId;
    	      this.configurationEndpoint = defaults.configurationEndpoint;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.id = defaults.id;
    	      this.maintenanceWindow = defaults.maintenanceWindow;
    	      this.nodeType = defaults.nodeType;
    	      this.notificationTopicArn = defaults.notificationTopicArn;
    	      this.numCacheNodes = defaults.numCacheNodes;
    	      this.parameterGroupName = defaults.parameterGroupName;
    	      this.port = defaults.port;
    	      this.replicationGroupId = defaults.replicationGroupId;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.securityGroupNames = defaults.securityGroupNames;
    	      this.snapshotRetentionLimit = defaults.snapshotRetentionLimit;
    	      this.snapshotWindow = defaults.snapshotWindow;
    	      this.subnetGroupName = defaults.subnetGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }

        public Builder setCacheNodes(List<GetClusterCacheNode> cacheNodes) {
            this.cacheNodes = Objects.requireNonNull(cacheNodes);
            return this;
        }

        public Builder setClusterAddress(String clusterAddress) {
            this.clusterAddress = Objects.requireNonNull(clusterAddress);
            return this;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder setConfigurationEndpoint(String configurationEndpoint) {
            this.configurationEndpoint = Objects.requireNonNull(configurationEndpoint);
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }

        public Builder setEngineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setMaintenanceWindow(String maintenanceWindow) {
            this.maintenanceWindow = Objects.requireNonNull(maintenanceWindow);
            return this;
        }

        public Builder setNodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }

        public Builder setNotificationTopicArn(String notificationTopicArn) {
            this.notificationTopicArn = Objects.requireNonNull(notificationTopicArn);
            return this;
        }

        public Builder setNumCacheNodes(Integer numCacheNodes) {
            this.numCacheNodes = Objects.requireNonNull(numCacheNodes);
            return this;
        }

        public Builder setParameterGroupName(String parameterGroupName) {
            this.parameterGroupName = Objects.requireNonNull(parameterGroupName);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setReplicationGroupId(String replicationGroupId) {
            this.replicationGroupId = Objects.requireNonNull(replicationGroupId);
            return this;
        }

        public Builder setSecurityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder setSecurityGroupNames(List<String> securityGroupNames) {
            this.securityGroupNames = Objects.requireNonNull(securityGroupNames);
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

        public Builder setSubnetGroupName(String subnetGroupName) {
            this.subnetGroupName = Objects.requireNonNull(subnetGroupName);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetClusterResult build() {
            return new GetClusterResult(arn, availabilityZone, cacheNodes, clusterAddress, clusterId, configurationEndpoint, engine, engineVersion, id, maintenanceWindow, nodeType, notificationTopicArn, numCacheNodes, parameterGroupName, port, replicationGroupId, securityGroupIds, securityGroupNames, snapshotRetentionLimit, snapshotWindow, subnetGroupName, tags);
        }
    }
}
