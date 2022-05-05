// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.docdb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.docdb.ClusterArgs;
import com.pulumi.aws.docdb.inputs.ClusterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
 * &gt; **Note:** using `apply_immediately` can result in a brief downtime as the server reboots.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var docdb = new Cluster(&#34;docdb&#34;, ClusterArgs.builder()        
 *             .backupRetentionPeriod(5)
 *             .clusterIdentifier(&#34;my-docdb-cluster&#34;)
 *             .engine(&#34;docdb&#34;)
 *             .masterPassword(&#34;mustbeeightchars&#34;)
 *             .masterUsername(&#34;foo&#34;)
 *             .preferredBackupWindow(&#34;07:00-09:00&#34;)
 *             .skipFinalSnapshot(true)
 *             .build());
 * 
 *         }
 * }
 * ```
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
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether any cluster modifications
     * are applied immediately, or during the next maintenance window. Default is
     * `false`.
     * 
     */
    @Export(name="applyImmediately", type=Boolean.class, parameters={})
    private Output<Boolean> applyImmediately;

    /**
     * @return Specifies whether any cluster modifications
     * are applied immediately, or during the next maintenance window. Default is
     * `false`.
     * 
     */
    public Output<Boolean> applyImmediately() {
        return this.applyImmediately;
    }
    /**
     * Amazon Resource Name (ARN) of cluster
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of cluster
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A list of EC2 Availability Zones that
     * instances in the DB cluster can be created in.
     * 
     */
    @Export(name="availabilityZones", type=List.class, parameters={String.class})
    private Output<List<String>> availabilityZones;

    /**
     * @return A list of EC2 Availability Zones that
     * instances in the DB cluster can be created in.
     * 
     */
    public Output<List<String>> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * The days to retain backups for. Default `1`
     * 
     */
    @Export(name="backupRetentionPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> backupRetentionPeriod;

    /**
     * @return The days to retain backups for. Default `1`
     * 
     */
    public Output<Optional<Integer>> backupRetentionPeriod() {
        return Codegen.optional(this.backupRetentionPeriod);
    }
    /**
     * The cluster identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    @Export(name="clusterIdentifier", type=String.class, parameters={})
    private Output<String> clusterIdentifier;

    /**
     * @return The cluster identifier. If omitted, this provider will assign a random, unique identifier.
     * 
     */
    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifer`.
     * 
     */
    @Export(name="clusterIdentifierPrefix", type=String.class, parameters={})
    private Output<String> clusterIdentifierPrefix;

    /**
     * @return Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifer`.
     * 
     */
    public Output<String> clusterIdentifierPrefix() {
        return this.clusterIdentifierPrefix;
    }
    /**
     * List of DocDB Instances that are a part of this cluster
     * 
     */
    @Export(name="clusterMembers", type=List.class, parameters={String.class})
    private Output<List<String>> clusterMembers;

    /**
     * @return List of DocDB Instances that are a part of this cluster
     * 
     */
    public Output<List<String>> clusterMembers() {
        return this.clusterMembers;
    }
    /**
     * The DocDB Cluster Resource ID
     * 
     */
    @Export(name="clusterResourceId", type=String.class, parameters={})
    private Output<String> clusterResourceId;

    /**
     * @return The DocDB Cluster Resource ID
     * 
     */
    public Output<String> clusterResourceId() {
        return this.clusterResourceId;
    }
    /**
     * A cluster parameter group to associate with the cluster.
     * 
     */
    @Export(name="dbClusterParameterGroupName", type=String.class, parameters={})
    private Output<String> dbClusterParameterGroupName;

    /**
     * @return A cluster parameter group to associate with the cluster.
     * 
     */
    public Output<String> dbClusterParameterGroupName() {
        return this.dbClusterParameterGroupName;
    }
    /**
     * A DB subnet group to associate with this DB instance.
     * 
     */
    @Export(name="dbSubnetGroupName", type=String.class, parameters={})
    private Output<String> dbSubnetGroupName;

    /**
     * @return A DB subnet group to associate with this DB instance.
     * 
     */
    public Output<String> dbSubnetGroupName() {
        return this.dbSubnetGroupName;
    }
    /**
     * A value that indicates whether the DB cluster has deletion protection enabled. The database can&#39;t be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * 
     */
    @Export(name="deletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return A value that indicates whether the DB cluster has deletion protection enabled. The database can&#39;t be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * 
     */
    public Output<Optional<Boolean>> deletionProtection() {
        return Codegen.optional(this.deletionProtection);
    }
    /**
     * List of log types to export to cloudwatch. If omitted, no logs will be exported.
     * The following log types are supported: `audit`, `profiler`.
     * 
     */
    @Export(name="enabledCloudwatchLogsExports", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> enabledCloudwatchLogsExports;

    /**
     * @return List of log types to export to cloudwatch. If omitted, no logs will be exported.
     * The following log types are supported: `audit`, `profiler`.
     * 
     */
    public Output<Optional<List<String>>> enabledCloudwatchLogsExports() {
        return Codegen.optional(this.enabledCloudwatchLogsExports);
    }
    /**
     * The DNS address of the DocDB instance
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The DNS address of the DocDB instance
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * The name of the database engine to be used for this DB cluster. Defaults to `docdb`. Valid Values: `docdb`
     * 
     */
    @Export(name="engine", type=String.class, parameters={})
    private Output</* @Nullable */ String> engine;

    /**
     * @return The name of the database engine to be used for this DB cluster. Defaults to `docdb`. Valid Values: `docdb`
     * 
     */
    public Output<Optional<String>> engine() {
        return Codegen.optional(this.engine);
    }
    /**
     * The database engine version. Updating this argument results in an outage.
     * 
     */
    @Export(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return The database engine version. Updating this argument results in an outage.
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * The name of your final DB snapshot
     * when this DB cluster is deleted. If omitted, no final snapshot will be
     * made.
     * 
     */
    @Export(name="finalSnapshotIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> finalSnapshotIdentifier;

    /**
     * @return The name of your final DB snapshot
     * when this DB cluster is deleted. If omitted, no final snapshot will be
     * made.
     * 
     */
    public Output<Optional<String>> finalSnapshotIdentifier() {
        return Codegen.optional(this.finalSnapshotIdentifier);
    }
    /**
     * The global cluster identifier specified on `aws.docdb.GlobalCluster`.
     * 
     */
    @Export(name="globalClusterIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> globalClusterIdentifier;

    /**
     * @return The global cluster identifier specified on `aws.docdb.GlobalCluster`.
     * 
     */
    public Output<Optional<String>> globalClusterIdentifier() {
        return Codegen.optional(this.globalClusterIdentifier);
    }
    /**
     * The Route53 Hosted Zone ID of the endpoint
     * 
     */
    @Export(name="hostedZoneId", type=String.class, parameters={})
    private Output<String> hostedZoneId;

    /**
     * @return The Route53 Hosted Zone ID of the endpoint
     * 
     */
    public Output<String> hostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * The ARN for the KMS encryption key. When specifying `kms_key_id`, `storage_encrypted` needs to be set to true.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key. When specifying `kms_key_id`, `storage_encrypted` needs to be set to true.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Password for the master DB user. Note that this may
     * show up in logs, and it will be stored in the state file. Please refer to the DocDB Naming Constraints.
     * 
     */
    @Export(name="masterPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> masterPassword;

    /**
     * @return Password for the master DB user. Note that this may
     * show up in logs, and it will be stored in the state file. Please refer to the DocDB Naming Constraints.
     * 
     */
    public Output<Optional<String>> masterPassword() {
        return Codegen.optional(this.masterPassword);
    }
    /**
     * Username for the master DB user.
     * 
     */
    @Export(name="masterUsername", type=String.class, parameters={})
    private Output<String> masterUsername;

    /**
     * @return Username for the master DB user.
     * 
     */
    public Output<String> masterUsername() {
        return this.masterUsername;
    }
    /**
     * The port on which the DB accepts connections
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port on which the DB accepts connections
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
     * Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     * 
     */
    @Export(name="preferredBackupWindow", type=String.class, parameters={})
    private Output<String> preferredBackupWindow;

    /**
     * @return The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter.Time in UTC
     * Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     * 
     */
    public Output<String> preferredBackupWindow() {
        return this.preferredBackupWindow;
    }
    /**
     * The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
     * 
     */
    @Export(name="preferredMaintenanceWindow", type=String.class, parameters={})
    private Output<String> preferredMaintenanceWindow;

    /**
     * @return The weekly time range during which system maintenance can occur, in (UTC) e.g., wed:04:00-wed:04:30
     * 
     */
    public Output<String> preferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * A read-only endpoint for the DocDB cluster, automatically load-balanced across replicas
     * 
     */
    @Export(name="readerEndpoint", type=String.class, parameters={})
    private Output<String> readerEndpoint;

    /**
     * @return A read-only endpoint for the DocDB cluster, automatically load-balanced across replicas
     * 
     */
    public Output<String> readerEndpoint() {
        return this.readerEndpoint;
    }
    /**
     * Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
     * 
     */
    @Export(name="skipFinalSnapshot", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> skipFinalSnapshot;

    /**
     * @return Determines whether a final DB snapshot is created before the DB cluster is deleted. If true is specified, no DB snapshot is created. If false is specified, a DB snapshot is created before the DB cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
     * 
     */
    public Output<Optional<Boolean>> skipFinalSnapshot() {
        return Codegen.optional(this.skipFinalSnapshot);
    }
    /**
     * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
     * 
     */
    @Export(name="snapshotIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotIdentifier;

    /**
     * @return Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a DB cluster snapshot, or the ARN when specifying a DB snapshot.
     * 
     */
    public Output<Optional<String>> snapshotIdentifier() {
        return Codegen.optional(this.snapshotIdentifier);
    }
    /**
     * Specifies whether the DB cluster is encrypted. The default is `false`.
     * 
     */
    @Export(name="storageEncrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> storageEncrypted;

    /**
     * @return Specifies whether the DB cluster is encrypted. The default is `false`.
     * 
     */
    public Output<Optional<Boolean>> storageEncrypted() {
        return Codegen.optional(this.storageEncrypted);
    }
    /**
     * A map of tags to assign to the DB cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the DB cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * List of VPC security groups to associate
     * with the Cluster
     * 
     */
    @Export(name="vpcSecurityGroupIds", type=List.class, parameters={String.class})
    private Output<List<String>> vpcSecurityGroupIds;

    /**
     * @return List of VPC security groups to associate
     * with the Cluster
     * 
     */
    public Output<List<String>> vpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, @Nullable ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, @Nullable ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:docdb/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:docdb/cluster:Cluster", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
