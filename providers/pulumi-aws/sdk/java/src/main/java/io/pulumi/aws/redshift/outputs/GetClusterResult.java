// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.redshift.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetClusterResult {
    /**
     * Whether major version upgrades can be applied during maintenance period
     * 
     */
    private final Boolean allowVersionUpgrade;
    /**
     * The backup retention period
     * 
     */
    private final Integer automatedSnapshotRetentionPeriod;
    /**
     * The availability zone of the cluster
     * 
     */
    private final String availabilityZone;
    /**
     * The name of the S3 bucket where the log files are to be stored
     * 
     */
    private final String bucketName;
    /**
     * The cluster identifier
     * 
     */
    private final String clusterIdentifier;
    /**
     * The name of the parameter group to be associated with this cluster
     * 
     */
    private final String clusterParameterGroupName;
    /**
     * The public key for the cluster
     * 
     */
    private final String clusterPublicKey;
    /**
     * The cluster revision number
     * 
     */
    private final String clusterRevisionNumber;
    /**
     * The security groups associated with the cluster
     * 
     */
    private final List<String> clusterSecurityGroups;
    /**
     * The name of a cluster subnet group to be associated with this cluster
     * 
     */
    private final String clusterSubnetGroupName;
    /**
     * The cluster type
     * 
     */
    private final String clusterType;
    private final String clusterVersion;
    /**
     * The name of the default database in the cluster
     * 
     */
    private final String databaseName;
    /**
     * The Elastic IP of the cluster
     * 
     */
    private final String elasticIp;
    /**
     * Whether cluster logging is enabled
     * 
     */
    private final Boolean enableLogging;
    /**
     * Whether the cluster data is encrypted
     * 
     */
    private final Boolean encrypted;
    /**
     * The cluster endpoint
     * 
     */
    private final String endpoint;
    /**
     * Whether enhanced VPC routing is enabled
     * 
     */
    private final Boolean enhancedVpcRouting;
    /**
     * The IAM roles associated to the cluster
     * 
     */
    private final List<String> iamRoles;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The KMS encryption key associated to the cluster
     * 
     */
    private final String kmsKeyId;
    /**
     * Username for the master DB user
     * 
     */
    private final String masterUsername;
    /**
     * The cluster node type
     * 
     */
    private final String nodeType;
    /**
     * The number of nodes in the cluster
     * 
     */
    private final Integer numberOfNodes;
    /**
     * The port the cluster responds on
     * 
     */
    private final Integer port;
    /**
     * The maintenance window
     * 
     */
    private final String preferredMaintenanceWindow;
    /**
     * Whether the cluster is publicly accessible
     * 
     */
    private final Boolean publiclyAccessible;
    /**
     * The folder inside the S3 bucket where the log files are stored
     * 
     */
    private final String s3KeyPrefix;
    /**
     * The tags associated to the cluster
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The VPC Id associated with the cluster
     * 
     */
    private final String vpcId;
    /**
     * The VPC security group Ids associated with the cluster
     * 
     */
    private final List<String> vpcSecurityGroupIds;

    @OutputCustomType.Constructor({"allowVersionUpgrade","automatedSnapshotRetentionPeriod","availabilityZone","bucketName","clusterIdentifier","clusterParameterGroupName","clusterPublicKey","clusterRevisionNumber","clusterSecurityGroups","clusterSubnetGroupName","clusterType","clusterVersion","databaseName","elasticIp","enableLogging","encrypted","endpoint","enhancedVpcRouting","iamRoles","id","kmsKeyId","masterUsername","nodeType","numberOfNodes","port","preferredMaintenanceWindow","publiclyAccessible","s3KeyPrefix","tags","vpcId","vpcSecurityGroupIds"})
    private GetClusterResult(
        Boolean allowVersionUpgrade,
        Integer automatedSnapshotRetentionPeriod,
        String availabilityZone,
        String bucketName,
        String clusterIdentifier,
        String clusterParameterGroupName,
        String clusterPublicKey,
        String clusterRevisionNumber,
        List<String> clusterSecurityGroups,
        String clusterSubnetGroupName,
        String clusterType,
        String clusterVersion,
        String databaseName,
        String elasticIp,
        Boolean enableLogging,
        Boolean encrypted,
        String endpoint,
        Boolean enhancedVpcRouting,
        List<String> iamRoles,
        String id,
        String kmsKeyId,
        String masterUsername,
        String nodeType,
        Integer numberOfNodes,
        Integer port,
        String preferredMaintenanceWindow,
        Boolean publiclyAccessible,
        String s3KeyPrefix,
        @Nullable Map<String,String> tags,
        String vpcId,
        List<String> vpcSecurityGroupIds) {
        this.allowVersionUpgrade = Objects.requireNonNull(allowVersionUpgrade);
        this.automatedSnapshotRetentionPeriod = Objects.requireNonNull(automatedSnapshotRetentionPeriod);
        this.availabilityZone = Objects.requireNonNull(availabilityZone);
        this.bucketName = Objects.requireNonNull(bucketName);
        this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
        this.clusterParameterGroupName = Objects.requireNonNull(clusterParameterGroupName);
        this.clusterPublicKey = Objects.requireNonNull(clusterPublicKey);
        this.clusterRevisionNumber = Objects.requireNonNull(clusterRevisionNumber);
        this.clusterSecurityGroups = Objects.requireNonNull(clusterSecurityGroups);
        this.clusterSubnetGroupName = Objects.requireNonNull(clusterSubnetGroupName);
        this.clusterType = Objects.requireNonNull(clusterType);
        this.clusterVersion = Objects.requireNonNull(clusterVersion);
        this.databaseName = Objects.requireNonNull(databaseName);
        this.elasticIp = Objects.requireNonNull(elasticIp);
        this.enableLogging = Objects.requireNonNull(enableLogging);
        this.encrypted = Objects.requireNonNull(encrypted);
        this.endpoint = Objects.requireNonNull(endpoint);
        this.enhancedVpcRouting = Objects.requireNonNull(enhancedVpcRouting);
        this.iamRoles = Objects.requireNonNull(iamRoles);
        this.id = Objects.requireNonNull(id);
        this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
        this.masterUsername = Objects.requireNonNull(masterUsername);
        this.nodeType = Objects.requireNonNull(nodeType);
        this.numberOfNodes = Objects.requireNonNull(numberOfNodes);
        this.port = Objects.requireNonNull(port);
        this.preferredMaintenanceWindow = Objects.requireNonNull(preferredMaintenanceWindow);
        this.publiclyAccessible = Objects.requireNonNull(publiclyAccessible);
        this.s3KeyPrefix = Objects.requireNonNull(s3KeyPrefix);
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId);
        this.vpcSecurityGroupIds = Objects.requireNonNull(vpcSecurityGroupIds);
    }

    /**
     * Whether major version upgrades can be applied during maintenance period
     * 
     */
    public Boolean getAllowVersionUpgrade() {
        return this.allowVersionUpgrade;
    }
    /**
     * The backup retention period
     * 
     */
    public Integer getAutomatedSnapshotRetentionPeriod() {
        return this.automatedSnapshotRetentionPeriod;
    }
    /**
     * The availability zone of the cluster
     * 
     */
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The name of the S3 bucket where the log files are to be stored
     * 
     */
    public String getBucketName() {
        return this.bucketName;
    }
    /**
     * The cluster identifier
     * 
     */
    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * The name of the parameter group to be associated with this cluster
     * 
     */
    public String getClusterParameterGroupName() {
        return this.clusterParameterGroupName;
    }
    /**
     * The public key for the cluster
     * 
     */
    public String getClusterPublicKey() {
        return this.clusterPublicKey;
    }
    /**
     * The cluster revision number
     * 
     */
    public String getClusterRevisionNumber() {
        return this.clusterRevisionNumber;
    }
    /**
     * The security groups associated with the cluster
     * 
     */
    public List<String> getClusterSecurityGroups() {
        return this.clusterSecurityGroups;
    }
    /**
     * The name of a cluster subnet group to be associated with this cluster
     * 
     */
    public String getClusterSubnetGroupName() {
        return this.clusterSubnetGroupName;
    }
    /**
     * The cluster type
     * 
     */
    public String getClusterType() {
        return this.clusterType;
    }
    public String getClusterVersion() {
        return this.clusterVersion;
    }
    /**
     * The name of the default database in the cluster
     * 
     */
    public String getDatabaseName() {
        return this.databaseName;
    }
    /**
     * The Elastic IP of the cluster
     * 
     */
    public String getElasticIp() {
        return this.elasticIp;
    }
    /**
     * Whether cluster logging is enabled
     * 
     */
    public Boolean getEnableLogging() {
        return this.enableLogging;
    }
    /**
     * Whether the cluster data is encrypted
     * 
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }
    /**
     * The cluster endpoint
     * 
     */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * Whether enhanced VPC routing is enabled
     * 
     */
    public Boolean getEnhancedVpcRouting() {
        return this.enhancedVpcRouting;
    }
    /**
     * The IAM roles associated to the cluster
     * 
     */
    public List<String> getIamRoles() {
        return this.iamRoles;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The KMS encryption key associated to the cluster
     * 
     */
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Username for the master DB user
     * 
     */
    public String getMasterUsername() {
        return this.masterUsername;
    }
    /**
     * The cluster node type
     * 
     */
    public String getNodeType() {
        return this.nodeType;
    }
    /**
     * The number of nodes in the cluster
     * 
     */
    public Integer getNumberOfNodes() {
        return this.numberOfNodes;
    }
    /**
     * The port the cluster responds on
     * 
     */
    public Integer getPort() {
        return this.port;
    }
    /**
     * The maintenance window
     * 
     */
    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * Whether the cluster is publicly accessible
     * 
     */
    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }
    /**
     * The folder inside the S3 bucket where the log files are stored
     * 
     */
    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }
    /**
     * The tags associated to the cluster
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The VPC Id associated with the cluster
     * 
     */
    public String getVpcId() {
        return this.vpcId;
    }
    /**
     * The VPC security group Ids associated with the cluster
     * 
     */
    public List<String> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowVersionUpgrade;
        private Integer automatedSnapshotRetentionPeriod;
        private String availabilityZone;
        private String bucketName;
        private String clusterIdentifier;
        private String clusterParameterGroupName;
        private String clusterPublicKey;
        private String clusterRevisionNumber;
        private List<String> clusterSecurityGroups;
        private String clusterSubnetGroupName;
        private String clusterType;
        private String clusterVersion;
        private String databaseName;
        private String elasticIp;
        private Boolean enableLogging;
        private Boolean encrypted;
        private String endpoint;
        private Boolean enhancedVpcRouting;
        private List<String> iamRoles;
        private String id;
        private String kmsKeyId;
        private String masterUsername;
        private String nodeType;
        private Integer numberOfNodes;
        private Integer port;
        private String preferredMaintenanceWindow;
        private Boolean publiclyAccessible;
        private String s3KeyPrefix;
        private @Nullable Map<String,String> tags;
        private String vpcId;
        private List<String> vpcSecurityGroupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowVersionUpgrade = defaults.allowVersionUpgrade;
    	      this.automatedSnapshotRetentionPeriod = defaults.automatedSnapshotRetentionPeriod;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.bucketName = defaults.bucketName;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.clusterParameterGroupName = defaults.clusterParameterGroupName;
    	      this.clusterPublicKey = defaults.clusterPublicKey;
    	      this.clusterRevisionNumber = defaults.clusterRevisionNumber;
    	      this.clusterSecurityGroups = defaults.clusterSecurityGroups;
    	      this.clusterSubnetGroupName = defaults.clusterSubnetGroupName;
    	      this.clusterType = defaults.clusterType;
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.databaseName = defaults.databaseName;
    	      this.elasticIp = defaults.elasticIp;
    	      this.enableLogging = defaults.enableLogging;
    	      this.encrypted = defaults.encrypted;
    	      this.endpoint = defaults.endpoint;
    	      this.enhancedVpcRouting = defaults.enhancedVpcRouting;
    	      this.iamRoles = defaults.iamRoles;
    	      this.id = defaults.id;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.masterUsername = defaults.masterUsername;
    	      this.nodeType = defaults.nodeType;
    	      this.numberOfNodes = defaults.numberOfNodes;
    	      this.port = defaults.port;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.publiclyAccessible = defaults.publiclyAccessible;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
        }

        public Builder setAllowVersionUpgrade(Boolean allowVersionUpgrade) {
            this.allowVersionUpgrade = Objects.requireNonNull(allowVersionUpgrade);
            return this;
        }

        public Builder setAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
            this.automatedSnapshotRetentionPeriod = Objects.requireNonNull(automatedSnapshotRetentionPeriod);
            return this;
        }

        public Builder setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }

        public Builder setBucketName(String bucketName) {
            this.bucketName = Objects.requireNonNull(bucketName);
            return this;
        }

        public Builder setClusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }

        public Builder setClusterParameterGroupName(String clusterParameterGroupName) {
            this.clusterParameterGroupName = Objects.requireNonNull(clusterParameterGroupName);
            return this;
        }

        public Builder setClusterPublicKey(String clusterPublicKey) {
            this.clusterPublicKey = Objects.requireNonNull(clusterPublicKey);
            return this;
        }

        public Builder setClusterRevisionNumber(String clusterRevisionNumber) {
            this.clusterRevisionNumber = Objects.requireNonNull(clusterRevisionNumber);
            return this;
        }

        public Builder setClusterSecurityGroups(List<String> clusterSecurityGroups) {
            this.clusterSecurityGroups = Objects.requireNonNull(clusterSecurityGroups);
            return this;
        }

        public Builder setClusterSubnetGroupName(String clusterSubnetGroupName) {
            this.clusterSubnetGroupName = Objects.requireNonNull(clusterSubnetGroupName);
            return this;
        }

        public Builder setClusterType(String clusterType) {
            this.clusterType = Objects.requireNonNull(clusterType);
            return this;
        }

        public Builder setClusterVersion(String clusterVersion) {
            this.clusterVersion = Objects.requireNonNull(clusterVersion);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setElasticIp(String elasticIp) {
            this.elasticIp = Objects.requireNonNull(elasticIp);
            return this;
        }

        public Builder setEnableLogging(Boolean enableLogging) {
            this.enableLogging = Objects.requireNonNull(enableLogging);
            return this;
        }

        public Builder setEncrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setEnhancedVpcRouting(Boolean enhancedVpcRouting) {
            this.enhancedVpcRouting = Objects.requireNonNull(enhancedVpcRouting);
            return this;
        }

        public Builder setIamRoles(List<String> iamRoles) {
            this.iamRoles = Objects.requireNonNull(iamRoles);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }

        public Builder setMasterUsername(String masterUsername) {
            this.masterUsername = Objects.requireNonNull(masterUsername);
            return this;
        }

        public Builder setNodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }

        public Builder setNumberOfNodes(Integer numberOfNodes) {
            this.numberOfNodes = Objects.requireNonNull(numberOfNodes);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = Objects.requireNonNull(preferredMaintenanceWindow);
            return this;
        }

        public Builder setPubliclyAccessible(Boolean publiclyAccessible) {
            this.publiclyAccessible = Objects.requireNonNull(publiclyAccessible);
            return this;
        }

        public Builder setS3KeyPrefix(String s3KeyPrefix) {
            this.s3KeyPrefix = Objects.requireNonNull(s3KeyPrefix);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder setVpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Objects.requireNonNull(vpcSecurityGroupIds);
            return this;
        }
        public GetClusterResult build() {
            return new GetClusterResult(allowVersionUpgrade, automatedSnapshotRetentionPeriod, availabilityZone, bucketName, clusterIdentifier, clusterParameterGroupName, clusterPublicKey, clusterRevisionNumber, clusterSecurityGroups, clusterSubnetGroupName, clusterType, clusterVersion, databaseName, elasticIp, enableLogging, encrypted, endpoint, enhancedVpcRouting, iamRoles, id, kmsKeyId, masterUsername, nodeType, numberOfNodes, port, preferredMaintenanceWindow, publiclyAccessible, s3KeyPrefix, tags, vpcId, vpcSecurityGroupIds);
        }
    }
}
