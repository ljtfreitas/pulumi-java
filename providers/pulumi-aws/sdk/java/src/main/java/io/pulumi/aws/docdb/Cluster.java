// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.docdb.ClusterArgs;
import io.pulumi.aws.docdb.inputs.ClusterState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Manages a DocDB Cluster.
 * 
 * Changes to a DocDB Cluster can occur when you manually change a
 * parameter, such as `port`, and are reflected in the next maintenance
 * window. Because of this, this provider may report a difference in its planning
 * phase because a modification has not yet taken place. You can use the
 * `apply_immediately` flag to instruct the service to apply the change immediately
 * (see documentation below).
 * 
 * > **Note:** using `apply_immediately` can result in a brief downtime as the server reboots.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * DocDB Clusters can be imported using the `cluster_identifier`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:docdb/cluster:Cluster docdb_cluster docdb-prod-cluster
 * ```
 * 
 */
@ResourceType(type="aws:docdb/cluster:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * Specifies whether any cluster modifications
     * are applied immediately, or during the next maintenance window. Default is
     * `false`.
     * 
     */
    @OutputExport(name="applyImmediately", type=Boolean.class, parameters={})
    private Output<Boolean> applyImmediately;

    /**
     * @return Specifies whether any cluster modifications
     * are applied immediately, or during the next maintenance window. Default is
     * `false`.
     * 
     */
    public Output<Boolean> getApplyImmediately() {
        return this.applyImmediately;
    }
    /**
     * Amazon Resource Name (ARN) of cluster
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of cluster
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A list of EC2 Availability Zones that
     * instances in the DB cluster can be created in.
     * 
     */
    @OutputExport(name="availabilityZones", type=List.class, parameters={String.class})
    private Output<List<String>> availabilityZones;

    /**
     * @return A list of EC2 Availability Zones that
     * instances in the DB cluster can be created in.
     * 
     */
    public Output<List<String>> getAvailabilityZones() {
        return this.availabilityZones;
    }
    /**
     * The days to retain backups for. Default `1`
     * 
     */
    @OutputExport(name="backupRetentionPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> backupRetentionPeriod;

    /**
     * @return The days to retain backups for. Default `1`
     * 
     */
    public Output</* @Nullable */ Integer> getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }
    /**
     * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    @OutputExport(name="clusterIdentifier", type=String.class, parameters={})
    private Output<String> clusterIdentifier;

    /**
     * @return The cluster identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifer`.
     * 
     */
    @OutputExport(name="clusterIdentifierPrefix", type=String.class, parameters={})
    private Output<String> clusterIdentifierPrefix;

    /**
     * @return Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifer`.
     * 
     */
    public Output<String> getClusterIdentifierPrefix() {
        return this.clusterIdentifierPrefix;
    }
    /**
     * List of DocDB Instances that are a part of this cluster
     * 
     */
    @OutputExport(name="clusterMembers", type=List.class, parameters={String.class})
    private Output<List<String>> clusterMembers;

    /**
     * @return List of DocDB Instances that are a part of this cluster
     * 
     */
    public Output<List<String>> getClusterMembers() {
        return this.clusterMembers;
    }
    /**
     * The DocDB Cluster Resource ID
     * 
     */
    @OutputExport(name="clusterResourceId", type=String.class, parameters={})
    private Output<String> clusterResourceId;

    /**
     * @return The DocDB Cluster Resource ID
     * 
     */
    public Output<String> getClusterResourceId() {
        return this.clusterResourceId;
    }
    /**
     * A cluster parameter group to associate with the cluster.
     * 
     */
    @OutputExport(name="dbClusterParameterGroupName", type=String.class, parameters={})
    private Output<String> dbClusterParameterGroupName;

    /**
     * @return A cluster parameter group to associate with the cluster.
     * 
     */
    public Output<String> getDbClusterParameterGroupName() {
        return this.dbClusterParameterGroupName;
    }
    /**
     * A DB subnet group to associate with this DB instance.
     * 
     */
    @OutputExport(name="dbSubnetGroupName", type=String.class, parameters={})
    private Output<String> dbSubnetGroupName;

    /**
     * @return A DB subnet group to associate with this DB instance.
     * 
     */
    public Output<String> getDbSubnetGroupName() {
        return this.dbSubnetGroupName;
    }
    /**
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * 
     */
    @OutputExport(name="deletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return A value that indicates whether the DB cluster has deletion protection enabled. The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeletionProtection() {
        return this.deletionProtection;
    }
    /**
     * List of log types to export to cloudwatch. If omitted, no logs will be exported.
     * The following log types are supported: `audit`, `profiler`.
     * 
     */
    @OutputExport(name="enabledCloudwatchLogsExports", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> enabledCloudwatchLogsExports;

    /**
     * @return List of log types to export to cloudwatch. If omitted, no logs will be exported.
     * The following log types are supported: `audit`, `profiler`.
     * 
     */
    public Output</* @Nullable */ List<String>> getEnabledCloudwatchLogsExports() {
        return this.enabledCloudwatchLogsExports;
    }
    /**
     * The DNS address of the DocDB instance
     * 
     */
    @OutputExport(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The DNS address of the DocDB instance
     * 
     */
    public Output<String> getEndpoint() {
        return this.endpoint;
    }
    /**
     * The name of the database engine to be used for this DB cluster. Defaults to `docdb`. Valid Values: `docdb`
     * 
     */
    @OutputExport(name="engine", type=String.class, parameters={})
    private Output</* @Nullable */ String> engine;

    /**
     * @return The name of the database engine to be used for this DB cluster. Defaults to `docdb`. Valid Values: `docdb`
     * 
     */
    public Output</* @Nullable */ String> getEngine() {
        return this.engine;
    }
    /**
     * The database engine version. Updating this argument results in an outage.
     * 
     */
    @OutputExport(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return The database engine version. Updating this argument results in an outage.
     * 
     */
    public Output<String> getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * The name of your final DB snapshot
     * when this DB cluster is deleted. If omitted, no final snapshot will be
     * made.
     * 
     */
    @OutputExport(name="finalSnapshotIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> finalSnapshotIdentifier;

    /**
     * @return The name of your final DB snapshot
     * when this DB cluster is deleted. If omitted, no final snapshot will be
     * made.
     * 
     */
    public Output</* @Nullable */ String> getFinalSnapshotIdentifier() {
        return this.finalSnapshotIdentifier;
    }
    /**
     * The global cluster identifier specified on `aws.docdb.GlobalCluster`.
     * 
     */
    @OutputExport(name="globalClusterIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> globalClusterIdentifier;

    /**
     * @return The global cluster identifier specified on `aws.docdb.GlobalCluster`.
     * 
     */
    public Output</* @Nullable */ String> getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }
    /**
     * The Route53 Hosted Zone ID of the endpoint
     * 
     */
    @OutputExport(name="hostedZoneId", type=String.class, parameters={})
    private Output<String> hostedZoneId;

    /**
     * @return The Route53 Hosted Zone ID of the endpoint
     * 
     */
    public Output<String> getHostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * The ARN for the KMS encryption key. When specifying `kms_key_id`, `storage_encrypted` needs to be set to true.
     * 
     */
    @OutputExport(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key. When specifying `kms_key_id`, `storage_encrypted` needs to be set to true.
     * 
     */
    public Output<String> getKmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Password for the master DB user. Note that this may
     * show up in logs, and it will be stored in the state file. Please refer to the DocDB Naming Constraints.
     * 
     */
    @OutputExport(name="masterPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> masterPassword;

    /**
     * @return Password for the master DB user. Note that this may
     * show up in logs, and it will be stored in the state file. Please refer to the DocDB Naming Constraints.
     * 
     */
    public Output</* @Nullable */ String> getMasterPassword() {
        return this.masterPassword;
    }
    /**
     * Username for the master DB user.
     * 
     */
    @OutputExport(name="masterUsername", type=String.class, parameters={})
    private Output<String> masterUsername;

    /**
     * @return Username for the master DB user.
     * 
     */
    public Output<String> getMasterUsername() {
        return this.masterUsername;
    }
    /**
     * The port on which the DB accepts connections
     * 
     */
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port on which the DB accepts connections
     * 
     */
    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    /**
     * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
     * Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     * 
     */
    @OutputExport(name="preferredBackupWindow", type=String.class, parameters={})
    private Output<String> preferredBackupWindow;

    /**
     * @return The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
     * Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     * 
     */
    public Output<String> getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }
    /**
     * The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
     * 
     */
    @OutputExport(name="preferredMaintenanceWindow", type=String.class, parameters={})
    private Output<String> preferredMaintenanceWindow;

    /**
     * @return The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
     * 
     */
    public Output<String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * A read-only endpoint for the DocDB cluster, automatically load-balanced across replicas
     * 
     */
    @OutputExport(name="readerEndpoint", type=String.class, parameters={})
    private Output<String> readerEndpoint;

    /**
     * @return A read-only endpoint for the DocDB cluster, automatically load-balanced across replicas
     * 
     */
    public Output<String> getReaderEndpoint() {
        return this.readerEndpoint;
    }
    /**
     * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
     * 
     */
    @OutputExport(name="skipFinalSnapshot", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> skipFinalSnapshot;

    /**
     * @return Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getSkipFinalSnapshot() {
        return this.skipFinalSnapshot;
    }
    /**
     * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
     * 
     */
    @OutputExport(name="snapshotIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotIdentifier;

    /**
     * @return Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
     * 
     */
    public Output</* @Nullable */ String> getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }
    /**
     * Specifies whether the DB cluster is encrypted. The default is `false`.
     * 
     */
    @OutputExport(name="storageEncrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> storageEncrypted;

    /**
     * @return Specifies whether the DB cluster is encrypted. The default is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getStorageEncrypted() {
        return this.storageEncrypted;
    }
    /**
     * A map of tags to assign to the DB cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the DB cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * List of VPC security groups to associate
     * with the Cluster
     * 
     */
    @OutputExport(name="vpcSecurityGroupIds", type=List.class, parameters={String.class})
    private Output<List<String>> vpcSecurityGroupIds;

    /**
     * @return List of VPC security groups to associate
     * with the Cluster
     * 
     */
    public Output<List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, @Nullable ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:docdb/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Cluster(String name, Input<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:docdb/cluster:Cluster", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Input<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
