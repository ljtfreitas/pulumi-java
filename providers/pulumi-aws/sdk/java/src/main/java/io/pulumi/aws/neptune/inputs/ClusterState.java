// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    @Import(name="applyImmediately")
      private final @Nullable Output<Boolean> applyImmediately;

    public Output<Boolean> getApplyImmediately() {
        return this.applyImmediately == null ? Output.empty() : this.applyImmediately;
    }

    /**
     * The Neptune Cluster Amazon Resource Name (ARN)
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
     * 
     */
    @Import(name="availabilityZones")
      private final @Nullable Output<List<String>> availabilityZones;

    public Output<List<String>> getAvailabilityZones() {
        return this.availabilityZones == null ? Output.empty() : this.availabilityZones;
    }

    /**
     * The days to retain backups for. Default `1`
     * 
     */
    @Import(name="backupRetentionPeriod")
      private final @Nullable Output<Integer> backupRetentionPeriod;

    public Output<Integer> getBackupRetentionPeriod() {
        return this.backupRetentionPeriod == null ? Output.empty() : this.backupRetentionPeriod;
    }

    /**
     * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    @Import(name="clusterIdentifier")
      private final @Nullable Output<String> clusterIdentifier;

    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier == null ? Output.empty() : this.clusterIdentifier;
    }

    /**
     * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
     * 
     */
    @Import(name="clusterIdentifierPrefix")
      private final @Nullable Output<String> clusterIdentifierPrefix;

    public Output<String> getClusterIdentifierPrefix() {
        return this.clusterIdentifierPrefix == null ? Output.empty() : this.clusterIdentifierPrefix;
    }

    /**
     * List of Neptune Instances that are a part of this cluster
     * 
     */
    @Import(name="clusterMembers")
      private final @Nullable Output<List<String>> clusterMembers;

    public Output<List<String>> getClusterMembers() {
        return this.clusterMembers == null ? Output.empty() : this.clusterMembers;
    }

    /**
     * The Neptune Cluster Resource ID
     * 
     */
    @Import(name="clusterResourceId")
      private final @Nullable Output<String> clusterResourceId;

    public Output<String> getClusterResourceId() {
        return this.clusterResourceId == null ? Output.empty() : this.clusterResourceId;
    }

    /**
     * If set to true, tags are copied to any snapshot of the DB cluster that is created.
     * 
     */
    @Import(name="copyTagsToSnapshot")
      private final @Nullable Output<Boolean> copyTagsToSnapshot;

    public Output<Boolean> getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot == null ? Output.empty() : this.copyTagsToSnapshot;
    }

    /**
     * A value that indicates whether the DB cluster has deletion protection enabled.The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * 
     */
    @Import(name="deletionProtection")
      private final @Nullable Output<Boolean> deletionProtection;

    public Output<Boolean> getDeletionProtection() {
        return this.deletionProtection == null ? Output.empty() : this.deletionProtection;
    }

    /**
     * A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
     * 
     */
    @Import(name="enableCloudwatchLogsExports")
      private final @Nullable Output<List<String>> enableCloudwatchLogsExports;

    public Output<List<String>> getEnableCloudwatchLogsExports() {
        return this.enableCloudwatchLogsExports == null ? Output.empty() : this.enableCloudwatchLogsExports;
    }

    /**
     * The DNS address of the Neptune instance
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
    }

    /**
     * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
     * 
     */
    @Import(name="engine")
      private final @Nullable Output<String> engine;

    public Output<String> getEngine() {
        return this.engine == null ? Output.empty() : this.engine;
    }

    /**
     * The database engine version.
     * 
     */
    @Import(name="engineVersion")
      private final @Nullable Output<String> engineVersion;

    public Output<String> getEngineVersion() {
        return this.engineVersion == null ? Output.empty() : this.engineVersion;
    }

    /**
     * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
     * 
     */
    @Import(name="finalSnapshotIdentifier")
      private final @Nullable Output<String> finalSnapshotIdentifier;

    public Output<String> getFinalSnapshotIdentifier() {
        return this.finalSnapshotIdentifier == null ? Output.empty() : this.finalSnapshotIdentifier;
    }

    /**
     * The Route53 Hosted Zone ID of the endpoint
     * 
     */
    @Import(name="hostedZoneId")
      private final @Nullable Output<String> hostedZoneId;

    public Output<String> getHostedZoneId() {
        return this.hostedZoneId == null ? Output.empty() : this.hostedZoneId;
    }

    /**
     * Specifies whether or not mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     * 
     */
    @Import(name="iamDatabaseAuthenticationEnabled")
      private final @Nullable Output<Boolean> iamDatabaseAuthenticationEnabled;

    public Output<Boolean> getIamDatabaseAuthenticationEnabled() {
        return this.iamDatabaseAuthenticationEnabled == null ? Output.empty() : this.iamDatabaseAuthenticationEnabled;
    }

    /**
     * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
     * 
     */
    @Import(name="iamRoles")
      private final @Nullable Output<List<String>> iamRoles;

    public Output<List<String>> getIamRoles() {
        return this.iamRoles == null ? Output.empty() : this.iamRoles;
    }

    /**
     * The ARN for the KMS encryption key. When specifying `kms_key_arn`, `storage_encrypted` needs to be set to true.
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Output.empty() : this.kmsKeyArn;
    }

    /**
     * A cluster parameter group to associate with the cluster.
     * 
     */
    @Import(name="neptuneClusterParameterGroupName")
      private final @Nullable Output<String> neptuneClusterParameterGroupName;

    public Output<String> getNeptuneClusterParameterGroupName() {
        return this.neptuneClusterParameterGroupName == null ? Output.empty() : this.neptuneClusterParameterGroupName;
    }

    /**
     * A Neptune subnet group to associate with this Neptune instance.
     * 
     */
    @Import(name="neptuneSubnetGroupName")
      private final @Nullable Output<String> neptuneSubnetGroupName;

    public Output<String> getNeptuneSubnetGroupName() {
        return this.neptuneSubnetGroupName == null ? Output.empty() : this.neptuneSubnetGroupName;
    }

    /**
     * The port on which the Neptune accepts connections. Default is `8182`.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     * 
     */
    @Import(name="preferredBackupWindow")
      private final @Nullable Output<String> preferredBackupWindow;

    public Output<String> getPreferredBackupWindow() {
        return this.preferredBackupWindow == null ? Output.empty() : this.preferredBackupWindow;
    }

    /**
     * The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
     * 
     */
    @Import(name="preferredMaintenanceWindow")
      private final @Nullable Output<String> preferredMaintenanceWindow;

    public Output<String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow == null ? Output.empty() : this.preferredMaintenanceWindow;
    }

    /**
     * A read-only endpoint for the Neptune cluster, automatically load-balanced across replicas
     * 
     */
    @Import(name="readerEndpoint")
      private final @Nullable Output<String> readerEndpoint;

    public Output<String> getReaderEndpoint() {
        return this.readerEndpoint == null ? Output.empty() : this.readerEndpoint;
    }

    /**
     * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
     * 
     */
    @Import(name="replicationSourceIdentifier")
      private final @Nullable Output<String> replicationSourceIdentifier;

    public Output<String> getReplicationSourceIdentifier() {
        return this.replicationSourceIdentifier == null ? Output.empty() : this.replicationSourceIdentifier;
    }

    /**
     * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
     * 
     */
    @Import(name="skipFinalSnapshot")
      private final @Nullable Output<Boolean> skipFinalSnapshot;

    public Output<Boolean> getSkipFinalSnapshot() {
        return this.skipFinalSnapshot == null ? Output.empty() : this.skipFinalSnapshot;
    }

    /**
     * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
     * 
     */
    @Import(name="snapshotIdentifier")
      private final @Nullable Output<String> snapshotIdentifier;

    public Output<String> getSnapshotIdentifier() {
        return this.snapshotIdentifier == null ? Output.empty() : this.snapshotIdentifier;
    }

    /**
     * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
     * 
     */
    @Import(name="storageEncrypted")
      private final @Nullable Output<Boolean> storageEncrypted;

    public Output<Boolean> getStorageEncrypted() {
        return this.storageEncrypted == null ? Output.empty() : this.storageEncrypted;
    }

    /**
     * A map of tags to assign to the Neptune cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * List of VPC security groups to associate with the Cluster
     * 
     */
    @Import(name="vpcSecurityGroupIds")
      private final @Nullable Output<List<String>> vpcSecurityGroupIds;

    public Output<List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? Output.empty() : this.vpcSecurityGroupIds;
    }

    public ClusterState(
        @Nullable Output<Boolean> applyImmediately,
        @Nullable Output<String> arn,
        @Nullable Output<List<String>> availabilityZones,
        @Nullable Output<Integer> backupRetentionPeriod,
        @Nullable Output<String> clusterIdentifier,
        @Nullable Output<String> clusterIdentifierPrefix,
        @Nullable Output<List<String>> clusterMembers,
        @Nullable Output<String> clusterResourceId,
        @Nullable Output<Boolean> copyTagsToSnapshot,
        @Nullable Output<Boolean> deletionProtection,
        @Nullable Output<List<String>> enableCloudwatchLogsExports,
        @Nullable Output<String> endpoint,
        @Nullable Output<String> engine,
        @Nullable Output<String> engineVersion,
        @Nullable Output<String> finalSnapshotIdentifier,
        @Nullable Output<String> hostedZoneId,
        @Nullable Output<Boolean> iamDatabaseAuthenticationEnabled,
        @Nullable Output<List<String>> iamRoles,
        @Nullable Output<String> kmsKeyArn,
        @Nullable Output<String> neptuneClusterParameterGroupName,
        @Nullable Output<String> neptuneSubnetGroupName,
        @Nullable Output<Integer> port,
        @Nullable Output<String> preferredBackupWindow,
        @Nullable Output<String> preferredMaintenanceWindow,
        @Nullable Output<String> readerEndpoint,
        @Nullable Output<String> replicationSourceIdentifier,
        @Nullable Output<Boolean> skipFinalSnapshot,
        @Nullable Output<String> snapshotIdentifier,
        @Nullable Output<Boolean> storageEncrypted,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<List<String>> vpcSecurityGroupIds) {
        this.applyImmediately = applyImmediately;
        this.arn = arn;
        this.availabilityZones = availabilityZones;
        this.backupRetentionPeriod = backupRetentionPeriod;
        this.clusterIdentifier = clusterIdentifier;
        this.clusterIdentifierPrefix = clusterIdentifierPrefix;
        this.clusterMembers = clusterMembers;
        this.clusterResourceId = clusterResourceId;
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        this.deletionProtection = deletionProtection;
        this.enableCloudwatchLogsExports = enableCloudwatchLogsExports;
        this.endpoint = endpoint;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.finalSnapshotIdentifier = finalSnapshotIdentifier;
        this.hostedZoneId = hostedZoneId;
        this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
        this.iamRoles = iamRoles;
        this.kmsKeyArn = kmsKeyArn;
        this.neptuneClusterParameterGroupName = neptuneClusterParameterGroupName;
        this.neptuneSubnetGroupName = neptuneSubnetGroupName;
        this.port = port;
        this.preferredBackupWindow = preferredBackupWindow;
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        this.readerEndpoint = readerEndpoint;
        this.replicationSourceIdentifier = replicationSourceIdentifier;
        this.skipFinalSnapshot = skipFinalSnapshot;
        this.snapshotIdentifier = snapshotIdentifier;
        this.storageEncrypted = storageEncrypted;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    private ClusterState() {
        this.applyImmediately = Output.empty();
        this.arn = Output.empty();
        this.availabilityZones = Output.empty();
        this.backupRetentionPeriod = Output.empty();
        this.clusterIdentifier = Output.empty();
        this.clusterIdentifierPrefix = Output.empty();
        this.clusterMembers = Output.empty();
        this.clusterResourceId = Output.empty();
        this.copyTagsToSnapshot = Output.empty();
        this.deletionProtection = Output.empty();
        this.enableCloudwatchLogsExports = Output.empty();
        this.endpoint = Output.empty();
        this.engine = Output.empty();
        this.engineVersion = Output.empty();
        this.finalSnapshotIdentifier = Output.empty();
        this.hostedZoneId = Output.empty();
        this.iamDatabaseAuthenticationEnabled = Output.empty();
        this.iamRoles = Output.empty();
        this.kmsKeyArn = Output.empty();
        this.neptuneClusterParameterGroupName = Output.empty();
        this.neptuneSubnetGroupName = Output.empty();
        this.port = Output.empty();
        this.preferredBackupWindow = Output.empty();
        this.preferredMaintenanceWindow = Output.empty();
        this.readerEndpoint = Output.empty();
        this.replicationSourceIdentifier = Output.empty();
        this.skipFinalSnapshot = Output.empty();
        this.snapshotIdentifier = Output.empty();
        this.storageEncrypted = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.vpcSecurityGroupIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> applyImmediately;
        private @Nullable Output<String> arn;
        private @Nullable Output<List<String>> availabilityZones;
        private @Nullable Output<Integer> backupRetentionPeriod;
        private @Nullable Output<String> clusterIdentifier;
        private @Nullable Output<String> clusterIdentifierPrefix;
        private @Nullable Output<List<String>> clusterMembers;
        private @Nullable Output<String> clusterResourceId;
        private @Nullable Output<Boolean> copyTagsToSnapshot;
        private @Nullable Output<Boolean> deletionProtection;
        private @Nullable Output<List<String>> enableCloudwatchLogsExports;
        private @Nullable Output<String> endpoint;
        private @Nullable Output<String> engine;
        private @Nullable Output<String> engineVersion;
        private @Nullable Output<String> finalSnapshotIdentifier;
        private @Nullable Output<String> hostedZoneId;
        private @Nullable Output<Boolean> iamDatabaseAuthenticationEnabled;
        private @Nullable Output<List<String>> iamRoles;
        private @Nullable Output<String> kmsKeyArn;
        private @Nullable Output<String> neptuneClusterParameterGroupName;
        private @Nullable Output<String> neptuneSubnetGroupName;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> preferredBackupWindow;
        private @Nullable Output<String> preferredMaintenanceWindow;
        private @Nullable Output<String> readerEndpoint;
        private @Nullable Output<String> replicationSourceIdentifier;
        private @Nullable Output<Boolean> skipFinalSnapshot;
        private @Nullable Output<String> snapshotIdentifier;
        private @Nullable Output<Boolean> storageEncrypted;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<List<String>> vpcSecurityGroupIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applyImmediately = defaults.applyImmediately;
    	      this.arn = defaults.arn;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.backupRetentionPeriod = defaults.backupRetentionPeriod;
    	      this.clusterIdentifier = defaults.clusterIdentifier;
    	      this.clusterIdentifierPrefix = defaults.clusterIdentifierPrefix;
    	      this.clusterMembers = defaults.clusterMembers;
    	      this.clusterResourceId = defaults.clusterResourceId;
    	      this.copyTagsToSnapshot = defaults.copyTagsToSnapshot;
    	      this.deletionProtection = defaults.deletionProtection;
    	      this.enableCloudwatchLogsExports = defaults.enableCloudwatchLogsExports;
    	      this.endpoint = defaults.endpoint;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.finalSnapshotIdentifier = defaults.finalSnapshotIdentifier;
    	      this.hostedZoneId = defaults.hostedZoneId;
    	      this.iamDatabaseAuthenticationEnabled = defaults.iamDatabaseAuthenticationEnabled;
    	      this.iamRoles = defaults.iamRoles;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.neptuneClusterParameterGroupName = defaults.neptuneClusterParameterGroupName;
    	      this.neptuneSubnetGroupName = defaults.neptuneSubnetGroupName;
    	      this.port = defaults.port;
    	      this.preferredBackupWindow = defaults.preferredBackupWindow;
    	      this.preferredMaintenanceWindow = defaults.preferredMaintenanceWindow;
    	      this.readerEndpoint = defaults.readerEndpoint;
    	      this.replicationSourceIdentifier = defaults.replicationSourceIdentifier;
    	      this.skipFinalSnapshot = defaults.skipFinalSnapshot;
    	      this.snapshotIdentifier = defaults.snapshotIdentifier;
    	      this.storageEncrypted = defaults.storageEncrypted;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
        }

        public Builder applyImmediately(@Nullable Output<Boolean> applyImmediately) {
            this.applyImmediately = applyImmediately;
            return this;
        }

        public Builder applyImmediately(@Nullable Boolean applyImmediately) {
            this.applyImmediately = Output.ofNullable(applyImmediately);
            return this;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }

        public Builder availabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = Output.ofNullable(availabilityZones);
            return this;
        }

        public Builder backupRetentionPeriod(@Nullable Output<Integer> backupRetentionPeriod) {
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        public Builder backupRetentionPeriod(@Nullable Integer backupRetentionPeriod) {
            this.backupRetentionPeriod = Output.ofNullable(backupRetentionPeriod);
            return this;
        }

        public Builder clusterIdentifier(@Nullable Output<String> clusterIdentifier) {
            this.clusterIdentifier = clusterIdentifier;
            return this;
        }

        public Builder clusterIdentifier(@Nullable String clusterIdentifier) {
            this.clusterIdentifier = Output.ofNullable(clusterIdentifier);
            return this;
        }

        public Builder clusterIdentifierPrefix(@Nullable Output<String> clusterIdentifierPrefix) {
            this.clusterIdentifierPrefix = clusterIdentifierPrefix;
            return this;
        }

        public Builder clusterIdentifierPrefix(@Nullable String clusterIdentifierPrefix) {
            this.clusterIdentifierPrefix = Output.ofNullable(clusterIdentifierPrefix);
            return this;
        }

        public Builder clusterMembers(@Nullable Output<List<String>> clusterMembers) {
            this.clusterMembers = clusterMembers;
            return this;
        }

        public Builder clusterMembers(@Nullable List<String> clusterMembers) {
            this.clusterMembers = Output.ofNullable(clusterMembers);
            return this;
        }

        public Builder clusterResourceId(@Nullable Output<String> clusterResourceId) {
            this.clusterResourceId = clusterResourceId;
            return this;
        }

        public Builder clusterResourceId(@Nullable String clusterResourceId) {
            this.clusterResourceId = Output.ofNullable(clusterResourceId);
            return this;
        }

        public Builder copyTagsToSnapshot(@Nullable Output<Boolean> copyTagsToSnapshot) {
            this.copyTagsToSnapshot = copyTagsToSnapshot;
            return this;
        }

        public Builder copyTagsToSnapshot(@Nullable Boolean copyTagsToSnapshot) {
            this.copyTagsToSnapshot = Output.ofNullable(copyTagsToSnapshot);
            return this;
        }

        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        public Builder deletionProtection(@Nullable Boolean deletionProtection) {
            this.deletionProtection = Output.ofNullable(deletionProtection);
            return this;
        }

        public Builder enableCloudwatchLogsExports(@Nullable Output<List<String>> enableCloudwatchLogsExports) {
            this.enableCloudwatchLogsExports = enableCloudwatchLogsExports;
            return this;
        }

        public Builder enableCloudwatchLogsExports(@Nullable List<String> enableCloudwatchLogsExports) {
            this.enableCloudwatchLogsExports = Output.ofNullable(enableCloudwatchLogsExports);
            return this;
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
            return this;
        }

        public Builder engine(@Nullable Output<String> engine) {
            this.engine = engine;
            return this;
        }

        public Builder engine(@Nullable String engine) {
            this.engine = Output.ofNullable(engine);
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

        public Builder finalSnapshotIdentifier(@Nullable Output<String> finalSnapshotIdentifier) {
            this.finalSnapshotIdentifier = finalSnapshotIdentifier;
            return this;
        }

        public Builder finalSnapshotIdentifier(@Nullable String finalSnapshotIdentifier) {
            this.finalSnapshotIdentifier = Output.ofNullable(finalSnapshotIdentifier);
            return this;
        }

        public Builder hostedZoneId(@Nullable Output<String> hostedZoneId) {
            this.hostedZoneId = hostedZoneId;
            return this;
        }

        public Builder hostedZoneId(@Nullable String hostedZoneId) {
            this.hostedZoneId = Output.ofNullable(hostedZoneId);
            return this;
        }

        public Builder iamDatabaseAuthenticationEnabled(@Nullable Output<Boolean> iamDatabaseAuthenticationEnabled) {
            this.iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled;
            return this;
        }

        public Builder iamDatabaseAuthenticationEnabled(@Nullable Boolean iamDatabaseAuthenticationEnabled) {
            this.iamDatabaseAuthenticationEnabled = Output.ofNullable(iamDatabaseAuthenticationEnabled);
            return this;
        }

        public Builder iamRoles(@Nullable Output<List<String>> iamRoles) {
            this.iamRoles = iamRoles;
            return this;
        }

        public Builder iamRoles(@Nullable List<String> iamRoles) {
            this.iamRoles = Output.ofNullable(iamRoles);
            return this;
        }

        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }

        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Output.ofNullable(kmsKeyArn);
            return this;
        }

        public Builder neptuneClusterParameterGroupName(@Nullable Output<String> neptuneClusterParameterGroupName) {
            this.neptuneClusterParameterGroupName = neptuneClusterParameterGroupName;
            return this;
        }

        public Builder neptuneClusterParameterGroupName(@Nullable String neptuneClusterParameterGroupName) {
            this.neptuneClusterParameterGroupName = Output.ofNullable(neptuneClusterParameterGroupName);
            return this;
        }

        public Builder neptuneSubnetGroupName(@Nullable Output<String> neptuneSubnetGroupName) {
            this.neptuneSubnetGroupName = neptuneSubnetGroupName;
            return this;
        }

        public Builder neptuneSubnetGroupName(@Nullable String neptuneSubnetGroupName) {
            this.neptuneSubnetGroupName = Output.ofNullable(neptuneSubnetGroupName);
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

        public Builder preferredBackupWindow(@Nullable Output<String> preferredBackupWindow) {
            this.preferredBackupWindow = preferredBackupWindow;
            return this;
        }

        public Builder preferredBackupWindow(@Nullable String preferredBackupWindow) {
            this.preferredBackupWindow = Output.ofNullable(preferredBackupWindow);
            return this;
        }

        public Builder preferredMaintenanceWindow(@Nullable Output<String> preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = preferredMaintenanceWindow;
            return this;
        }

        public Builder preferredMaintenanceWindow(@Nullable String preferredMaintenanceWindow) {
            this.preferredMaintenanceWindow = Output.ofNullable(preferredMaintenanceWindow);
            return this;
        }

        public Builder readerEndpoint(@Nullable Output<String> readerEndpoint) {
            this.readerEndpoint = readerEndpoint;
            return this;
        }

        public Builder readerEndpoint(@Nullable String readerEndpoint) {
            this.readerEndpoint = Output.ofNullable(readerEndpoint);
            return this;
        }

        public Builder replicationSourceIdentifier(@Nullable Output<String> replicationSourceIdentifier) {
            this.replicationSourceIdentifier = replicationSourceIdentifier;
            return this;
        }

        public Builder replicationSourceIdentifier(@Nullable String replicationSourceIdentifier) {
            this.replicationSourceIdentifier = Output.ofNullable(replicationSourceIdentifier);
            return this;
        }

        public Builder skipFinalSnapshot(@Nullable Output<Boolean> skipFinalSnapshot) {
            this.skipFinalSnapshot = skipFinalSnapshot;
            return this;
        }

        public Builder skipFinalSnapshot(@Nullable Boolean skipFinalSnapshot) {
            this.skipFinalSnapshot = Output.ofNullable(skipFinalSnapshot);
            return this;
        }

        public Builder snapshotIdentifier(@Nullable Output<String> snapshotIdentifier) {
            this.snapshotIdentifier = snapshotIdentifier;
            return this;
        }

        public Builder snapshotIdentifier(@Nullable String snapshotIdentifier) {
            this.snapshotIdentifier = Output.ofNullable(snapshotIdentifier);
            return this;
        }

        public Builder storageEncrypted(@Nullable Output<Boolean> storageEncrypted) {
            this.storageEncrypted = storageEncrypted;
            return this;
        }

        public Builder storageEncrypted(@Nullable Boolean storageEncrypted) {
            this.storageEncrypted = Output.ofNullable(storageEncrypted);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder vpcSecurityGroupIds(@Nullable Output<List<String>> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        public Builder vpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Output.ofNullable(vpcSecurityGroupIds);
            return this;
        }
        public ClusterState build() {
            return new ClusterState(applyImmediately, arn, availabilityZones, backupRetentionPeriod, clusterIdentifier, clusterIdentifierPrefix, clusterMembers, clusterResourceId, copyTagsToSnapshot, deletionProtection, enableCloudwatchLogsExports, endpoint, engine, engineVersion, finalSnapshotIdentifier, hostedZoneId, iamDatabaseAuthenticationEnabled, iamRoles, kmsKeyArn, neptuneClusterParameterGroupName, neptuneSubnetGroupName, port, preferredBackupWindow, preferredMaintenanceWindow, readerEndpoint, replicationSourceIdentifier, skipFinalSnapshot, snapshotIdentifier, storageEncrypted, tags, tagsAll, vpcSecurityGroupIds);
        }
    }
}
