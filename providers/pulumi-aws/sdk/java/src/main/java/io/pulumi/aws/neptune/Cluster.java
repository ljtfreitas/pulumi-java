// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.neptune.ClusterArgs;
import io.pulumi.aws.neptune.inputs.ClusterState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Neptune Cluster Resource. A Cluster Resource defines attributes that are
 * applied to the entire cluster of Neptune Cluster Instances.
 * 
 * Changes to a Neptune Cluster can occur when you manually change a
 * parameter, such as `backup_retention_period`, and are reflected in the next maintenance
 * window. Because of this, this provider may report a difference in its planning
 * phase because a modification has not yet taken place. You can use the
 * `apply_immediately` flag to instruct the service to apply the change immediately
 * (see documentation below).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_neptune_cluster` can be imported by using the cluster identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:neptune/cluster:Cluster example my-cluster
 * ```
 * 
 */
@ResourceType(type="aws:neptune/cluster:Cluster")
public class Cluster extends io.pulumi.resources.CustomResource {
    /**
     * Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    @Export(name="applyImmediately", type=Boolean.class, parameters={})
    private Output<Boolean> applyImmediately;

    /**
     * @return Specifies whether any cluster modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    public Output<Boolean> getApplyImmediately() {
        return this.applyImmediately;
    }
    /**
     * The Neptune Cluster Amazon Resource Name (ARN)
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Neptune Cluster Amazon Resource Name (ARN)
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
     * 
     */
    @Export(name="availabilityZones", type=List.class, parameters={String.class})
    private Output<List<String>> availabilityZones;

    /**
     * @return A list of EC2 Availability Zones that instances in the Neptune cluster can be created in.
     * 
     */
    public Output<List<String>> getAvailabilityZones() {
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
    public Output</* @Nullable */ Integer> getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
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
    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
     * 
     */
    @Export(name="clusterIdentifierPrefix", type=String.class, parameters={})
    private Output<String> clusterIdentifierPrefix;

    /**
     * @return Creates a unique cluster identifier beginning with the specified prefix. Conflicts with `cluster_identifier`.
     * 
     */
    public Output<String> getClusterIdentifierPrefix() {
        return this.clusterIdentifierPrefix;
    }
    /**
     * List of Neptune Instances that are a part of this cluster
     * 
     */
    @Export(name="clusterMembers", type=List.class, parameters={String.class})
    private Output<List<String>> clusterMembers;

    /**
     * @return List of Neptune Instances that are a part of this cluster
     * 
     */
    public Output<List<String>> getClusterMembers() {
        return this.clusterMembers;
    }
    /**
     * The Neptune Cluster Resource ID
     * 
     */
    @Export(name="clusterResourceId", type=String.class, parameters={})
    private Output<String> clusterResourceId;

    /**
     * @return The Neptune Cluster Resource ID
     * 
     */
    public Output<String> getClusterResourceId() {
        return this.clusterResourceId;
    }
    /**
     * If set to true, tags are copied to any snapshot of the DB cluster that is created.
     * 
     */
    @Export(name="copyTagsToSnapshot", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> copyTagsToSnapshot;

    /**
     * @return If set to true, tags are copied to any snapshot of the DB cluster that is created.
     * 
     */
    public Output</* @Nullable */ Boolean> getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }
    /**
     * A value that indicates whether the DB cluster has deletion protection enabled.The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * 
     */
    @Export(name="deletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return A value that indicates whether the DB cluster has deletion protection enabled.The database can't be deleted when deletion protection is enabled. By default, deletion protection is disabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeletionProtection() {
        return this.deletionProtection;
    }
    /**
     * A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
     * 
     */
    @Export(name="enableCloudwatchLogsExports", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> enableCloudwatchLogsExports;

    /**
     * @return A list of the log types this DB cluster is configured to export to Cloudwatch Logs. Currently only supports `audit`.
     * 
     */
    public Output</* @Nullable */ List<String>> getEnableCloudwatchLogsExports() {
        return this.enableCloudwatchLogsExports;
    }
    /**
     * The DNS address of the Neptune instance
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The DNS address of the Neptune instance
     * 
     */
    public Output<String> getEndpoint() {
        return this.endpoint;
    }
    /**
     * The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
     * 
     */
    @Export(name="engine", type=String.class, parameters={})
    private Output</* @Nullable */ String> engine;

    /**
     * @return The name of the database engine to be used for this Neptune cluster. Defaults to `neptune`.
     * 
     */
    public Output</* @Nullable */ String> getEngine() {
        return this.engine;
    }
    /**
     * The database engine version.
     * 
     */
    @Export(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return The database engine version.
     * 
     */
    public Output<String> getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
     * 
     */
    @Export(name="finalSnapshotIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> finalSnapshotIdentifier;

    /**
     * @return The name of your final Neptune snapshot when this Neptune cluster is deleted. If omitted, no final snapshot will be made.
     * 
     */
    public Output</* @Nullable */ String> getFinalSnapshotIdentifier() {
        return this.finalSnapshotIdentifier;
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
    public Output<String> getHostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * Specifies whether or not mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     * 
     */
    @Export(name="iamDatabaseAuthenticationEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> iamDatabaseAuthenticationEnabled;

    /**
     * @return Specifies whether or not mappings of AWS Identity and Access Management (IAM) accounts to database accounts is enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getIamDatabaseAuthenticationEnabled() {
        return this.iamDatabaseAuthenticationEnabled;
    }
    /**
     * A List of ARNs for the IAM roles to associate to the Neptune Cluster.
     * 
     */
    @Export(name="iamRoles", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> iamRoles;

    /**
     * @return A List of ARNs for the IAM roles to associate to the Neptune Cluster.
     * 
     */
    public Output</* @Nullable */ List<String>> getIamRoles() {
        return this.iamRoles;
    }
    /**
     * The ARN for the KMS encryption key. When specifying `kms_key_arn`, `storage_encrypted` needs to be set to true.
     * 
     */
    @Export(name="kmsKeyArn", type=String.class, parameters={})
    private Output<String> kmsKeyArn;

    /**
     * @return The ARN for the KMS encryption key. When specifying `kms_key_arn`, `storage_encrypted` needs to be set to true.
     * 
     */
    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn;
    }
    /**
     * A cluster parameter group to associate with the cluster.
     * 
     */
    @Export(name="neptuneClusterParameterGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> neptuneClusterParameterGroupName;

    /**
     * @return A cluster parameter group to associate with the cluster.
     * 
     */
    public Output</* @Nullable */ String> getNeptuneClusterParameterGroupName() {
        return this.neptuneClusterParameterGroupName;
    }
    /**
     * A Neptune subnet group to associate with this Neptune instance.
     * 
     */
    @Export(name="neptuneSubnetGroupName", type=String.class, parameters={})
    private Output<String> neptuneSubnetGroupName;

    /**
     * @return A Neptune subnet group to associate with this Neptune instance.
     * 
     */
    public Output<String> getNeptuneSubnetGroupName() {
        return this.neptuneSubnetGroupName;
    }
    /**
     * The port on which the Neptune accepts connections. Default is `8182`.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port on which the Neptune accepts connections. Default is `8182`.
     * 
     */
    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    /**
     * The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     * 
     */
    @Export(name="preferredBackupWindow", type=String.class, parameters={})
    private Output<String> preferredBackupWindow;

    /**
     * @return The daily time range during which automated backups are created if automated backups are enabled using the BackupRetentionPeriod parameter. Time in UTC. Default: A 30-minute window selected at random from an 8-hour block of time per regionE.g., 04:00-09:00
     * 
     */
    public Output<String> getPreferredBackupWindow() {
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
    public Output<String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * A read-only endpoint for the Neptune cluster, automatically load-balanced across replicas
     * 
     */
    @Export(name="readerEndpoint", type=String.class, parameters={})
    private Output<String> readerEndpoint;

    /**
     * @return A read-only endpoint for the Neptune cluster, automatically load-balanced across replicas
     * 
     */
    public Output<String> getReaderEndpoint() {
        return this.readerEndpoint;
    }
    /**
     * ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
     * 
     */
    @Export(name="replicationSourceIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> replicationSourceIdentifier;

    /**
     * @return ARN of a source Neptune cluster or Neptune instance if this Neptune cluster is to be created as a Read Replica.
     * 
     */
    public Output</* @Nullable */ String> getReplicationSourceIdentifier() {
        return this.replicationSourceIdentifier;
    }
    /**
     * Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
     * 
     */
    @Export(name="skipFinalSnapshot", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> skipFinalSnapshot;

    /**
     * @return Determines whether a final Neptune snapshot is created before the Neptune cluster is deleted. If true is specified, no Neptune snapshot is created. If false is specified, a Neptune snapshot is created before the Neptune cluster is deleted, using the value from `final_snapshot_identifier`. Default is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getSkipFinalSnapshot() {
        return this.skipFinalSnapshot;
    }
    /**
     * Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
     * 
     */
    @Export(name="snapshotIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> snapshotIdentifier;

    /**
     * @return Specifies whether or not to create this cluster from a snapshot. You can use either the name or ARN when specifying a Neptune cluster snapshot, or the ARN when specifying a Neptune snapshot.
     * 
     */
    public Output</* @Nullable */ String> getSnapshotIdentifier() {
        return this.snapshotIdentifier;
    }
    /**
     * Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
     * 
     */
    @Export(name="storageEncrypted", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> storageEncrypted;

    /**
     * @return Specifies whether the Neptune cluster is encrypted. The default is `false` if not specified.
     * 
     */
    public Output</* @Nullable */ Boolean> getStorageEncrypted() {
        return this.storageEncrypted;
    }
    /**
     * A map of tags to assign to the Neptune cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the Neptune cluster. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
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
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * List of VPC security groups to associate with the Cluster
     * 
     */
    @Export(name="vpcSecurityGroupIds", type=List.class, parameters={String.class})
    private Output<List<String>> vpcSecurityGroupIds;

    /**
     * @return List of VPC security groups to associate with the Cluster
     * 
     */
    public Output<List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable ClusterArgs.Builder a);
    }
    private static io.pulumi.aws.neptune.ClusterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.neptune.ClusterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Cluster(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
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
    public Cluster(String name, @Nullable ClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/cluster:Cluster", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
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
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
