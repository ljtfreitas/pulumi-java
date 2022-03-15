// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.rds.GlobalClusterArgs;
import io.pulumi.aws.rds.inputs.GlobalClusterState;
import io.pulumi.aws.rds.outputs.GlobalClusterGlobalClusterMember;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages an RDS Global Cluster, which is an Aurora global database spread across multiple regions. The global database contains a single primary cluster with read-write capability, and a read-only secondary cluster that receives data from the primary cluster through high-speed replication performed by the Aurora storage subsystem.
 * 
 * More information about Aurora global databases can be found in the [Aurora User Guide](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-global-database.html#aurora-global-database-creating).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_rds_global_cluster` can be imported by using the RDS Global Cluster identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/globalCluster:GlobalCluster example example
 * ```
 * 
 *  Certain resource arguments, like `force_destroy`, only exist within this provider. If the argument is set in the the provider configuration on an imported resource, This provider will show a difference on the first plan after import to update the state value. This change is safe to apply immediately so the state matches the desired configuration. Certain resource arguments, like `source_db_cluster_identifier`, do not have an API method for reading the information after creation. If the argument is set in the provider configuration on an imported resource, the provider will always show a difference. To workaround this behavior, either omit the argument from the the provider configuration or use `ignore_changes` to hide the difference, e.g. terraform resource "aws_rds_global_cluster" "example" {
 * 
 * # ... other configuration ...
 * 
 * # There is no API for reading source_db_cluster_identifier
 * 
 *  lifecycle {
 * 
 *  ignore_changes = [source_db_cluster_identifier]
 * 
 *  } }
 * 
 */
@ResourceType(type="aws:rds/globalCluster:GlobalCluster")
public class GlobalCluster extends io.pulumi.resources.CustomResource {
    /**
     * RDS Global Cluster Amazon Resource Name (ARN)
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return RDS Global Cluster Amazon Resource Name (ARN)
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Name for an automatically created database on cluster creation.
     * 
     */
    @Export(name="databaseName", type=String.class, parameters={})
    private Output</* @Nullable */ String> databaseName;

    /**
     * @return Name for an automatically created database on cluster creation.
     * 
     */
    public Output</* @Nullable */ String> getDatabaseName() {
        return this.databaseName;
    }
    /**
     * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
     * 
     */
    @Export(name="deletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeletionProtection() {
        return this.deletionProtection;
    }
    /**
     * Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Valid values: `aurora`, `aurora-mysql`, `aurora-postgresql`. Defaults to `aurora`. Conflicts with `source_db_cluster_identifier`.
     * 
     */
    @Export(name="engine", type=String.class, parameters={})
    private Output<String> engine;

    /**
     * @return Name of the database engine to be used for this DB cluster. The provider will only perform drift detection if a configuration value is provided. Valid values: `aurora`, `aurora-mysql`, `aurora-postgresql`. Defaults to `aurora`. Conflicts with `source_db_cluster_identifier`.
     * 
     */
    public Output<String> getEngine() {
        return this.engine;
    }
    /**
     * Engine version of the Aurora global database.
     * * **NOTE:** When the engine is set to `aurora-mysql`, an engine version compatible with global database is required. The earliest available version is `5.7.mysql_aurora.2.06.0`.
     * 
     */
    @Export(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return Engine version of the Aurora global database.
     * * **NOTE:** When the engine is set to `aurora-mysql`, an engine version compatible with global database is required. The earliest available version is `5.7.mysql_aurora.2.06.0`.
     * 
     */
    public Output<String> getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * Enable to remove DB Cluster members from Global Cluster on destroy. Required with `source_db_cluster_identifier`.
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Enable to remove DB Cluster members from Global Cluster on destroy. Required with `source_db_cluster_identifier`.
     * 
     */
    public Output</* @Nullable */ Boolean> getForceDestroy() {
        return this.forceDestroy;
    }
    /**
     * The global cluster identifier.
     * 
     */
    @Export(name="globalClusterIdentifier", type=String.class, parameters={})
    private Output<String> globalClusterIdentifier;

    /**
     * @return The global cluster identifier.
     * 
     */
    public Output<String> getGlobalClusterIdentifier() {
        return this.globalClusterIdentifier;
    }
    /**
     * Set of objects containing Global Cluster members.
     * 
     */
    @Export(name="globalClusterMembers", type=List.class, parameters={GlobalClusterGlobalClusterMember.class})
    private Output<List<GlobalClusterGlobalClusterMember>> globalClusterMembers;

    /**
     * @return Set of objects containing Global Cluster members.
     * 
     */
    public Output<List<GlobalClusterGlobalClusterMember>> getGlobalClusterMembers() {
        return this.globalClusterMembers;
    }
    /**
     * AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed
     * 
     */
    @Export(name="globalClusterResourceId", type=String.class, parameters={})
    private Output<String> globalClusterResourceId;

    /**
     * @return AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed
     * 
     */
    public Output<String> getGlobalClusterResourceId() {
        return this.globalClusterResourceId;
    }
    /**
     * Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
     * 
     */
    @Export(name="sourceDbClusterIdentifier", type=String.class, parameters={})
    private Output<String> sourceDbClusterIdentifier;

    /**
     * @return Amazon Resource Name (ARN) to use as the primary DB Cluster of the Global Cluster on creation. The provider cannot perform drift detection of this value.
     * 
     */
    public Output<String> getSourceDbClusterIdentifier() {
        return this.sourceDbClusterIdentifier;
    }
    /**
     * Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
     * 
     */
    @Export(name="storageEncrypted", type=Boolean.class, parameters={})
    private Output<Boolean> storageEncrypted;

    /**
     * @return Specifies whether the DB cluster is encrypted. The default is `false` unless `source_db_cluster_identifier` is specified and encrypted. The provider will only perform drift detection if a configuration value is provided.
     * 
     */
    public Output<Boolean> getStorageEncrypted() {
        return this.storageEncrypted;
    }

    public interface BuilderApplicator {
        public void apply(GlobalClusterArgs.Builder a);
    }
    private static io.pulumi.aws.rds.GlobalClusterArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.rds.GlobalClusterArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public GlobalCluster(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalCluster(String name) {
        this(name, GlobalClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalCluster(String name, GlobalClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalCluster(String name, GlobalClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/globalCluster:GlobalCluster", name, args == null ? GlobalClusterArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private GlobalCluster(String name, Output<String> id, @Nullable GlobalClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/globalCluster:GlobalCluster", name, state, makeResourceOptions(options, id));
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
    public static GlobalCluster get(String name, Output<String> id, @Nullable GlobalClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GlobalCluster(name, id, state, options);
    }
}
