// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rds.ClusterInstanceArgs;
import com.pulumi.aws.rds.inputs.ClusterInstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an RDS Cluster Instance Resource. A Cluster Instance Resource defines
 * attributes that are specific to a single instance in a [RDS Cluster](https://www.terraform.io/docs/providers/aws/r/rds_cluster.html),
 * specifically running Amazon Aurora.
 * 
 * Unlike other RDS resources that support replication, with Amazon Aurora you do
 * not designate a primary and subsequent replicas. Instead, you simply add RDS
 * Instances and Aurora manages the replication. You can use the [count](https://www.terraform.io/docs/configuration/meta-arguments/count.html)
 * meta-parameter to make multiple instances and join them all to the same RDS
 * Cluster, or you may specify different Cluster Instance resources with various
 * `instance_class` sizes.
 * 
 * For more information on Amazon Aurora, see [Aurora on Amazon RDS](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Aurora.html) in the Amazon RDS User Guide.
 * 
 * &gt; **NOTE:** Deletion Protection from the RDS service can only be enabled at the cluster level, not for individual cluster instances. You can still add the [`protect` CustomResourceOption](https://www.pulumi.com/docs/intro/concepts/programming-model/#protect) to this resource configuration if you desire protection from accidental deletion.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * import com.pulumi.codegen.internal.KeyedValue;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var default_ = new Cluster(&#34;default&#34;, ClusterArgs.builder()        
 *             .clusterIdentifier(&#34;aurora-cluster-demo&#34;)
 *             .availabilityZones(            
 *                 &#34;us-west-2a&#34;,
 *                 &#34;us-west-2b&#34;,
 *                 &#34;us-west-2c&#34;)
 *             .databaseName(&#34;mydb&#34;)
 *             .masterUsername(&#34;foo&#34;)
 *             .masterPassword(&#34;barbut8chars&#34;)
 *             .build());
 * 
 *         for (var i = 0; i &lt; 2; i++) {
 *             new ClusterInstance(&#34;clusterInstances-&#34; + i, ClusterInstanceArgs.builder()            
 *                 .identifier(String.format(&#34;aurora-cluster-demo-%s&#34;, range.getValue()))
 *                 .clusterIdentifier(default_.getId())
 *                 .instanceClass(&#34;db.r4.large&#34;)
 *                 .engine(default_.getEngine())
 *                 .engineVersion(default_.getEngineVersion())
 *                 .build());
 * 
 *         
 * }
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * RDS Cluster Instances can be imported using the `identifier`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/clusterInstance:ClusterInstance prod_instance_1 aurora-cluster-instance-1
 * ```
 * 
 */
@ResourceType(type="aws:rds/clusterInstance:ClusterInstance")
public class ClusterInstance extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether any database modifications
     * are applied immediately, or during the next maintenance window. Default is`false`.
     * 
     */
    @Export(name="applyImmediately", type=Boolean.class, parameters={})
    private Output<Boolean> applyImmediately;

    /**
     * @return Specifies whether any database modifications
     * are applied immediately, or during the next maintenance window. Default is`false`.
     * 
     */
    public Output<Boolean> applyImmediately() {
        return this.applyImmediately;
    }
    /**
     * Amazon Resource Name (ARN) of cluster instance
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of cluster instance
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
     * 
     */
    @Export(name="autoMinorVersionUpgrade", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoMinorVersionUpgrade;

    /**
     * @return Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
     * 
     */
    public Output<Optional<Boolean>> autoMinorVersionUpgrade() {
        return Codegen.optional(this.autoMinorVersionUpgrade);
    }
    /**
     * The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) about the details.
     * 
     */
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) about the details.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The identifier of the CA certificate for the DB instance.
     * 
     */
    @Export(name="caCertIdentifier", type=String.class, parameters={})
    private Output<String> caCertIdentifier;

    /**
     * @return The identifier of the CA certificate for the DB instance.
     * 
     */
    public Output<String> caCertIdentifier() {
        return this.caCertIdentifier;
    }
    /**
     * The identifier of the `aws.rds.Cluster` in which to launch this instance.
     * 
     */
    @Export(name="clusterIdentifier", type=String.class, parameters={})
    private Output<String> clusterIdentifier;

    /**
     * @return The identifier of the `aws.rds.Cluster` in which to launch this instance.
     * 
     */
    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of the DB instance. Default `false`.
     * 
     */
    @Export(name="copyTagsToSnapshot", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> copyTagsToSnapshot;

    /**
     * @return Indicates whether to copy all of the user-defined tags from the DB instance to snapshots of the DB instance. Default `false`.
     * 
     */
    public Output<Optional<Boolean>> copyTagsToSnapshot() {
        return Codegen.optional(this.copyTagsToSnapshot);
    }
    /**
     * The name of the DB parameter group to associate with this instance.
     * 
     */
    @Export(name="dbParameterGroupName", type=String.class, parameters={})
    private Output<String> dbParameterGroupName;

    /**
     * @return The name of the DB parameter group to associate with this instance.
     * 
     */
    public Output<String> dbParameterGroupName() {
        return this.dbParameterGroupName;
    }
    /**
     * A DB subnet group to associate with this DB instance. **NOTE:** This must match the `db_subnet_group_name` of the attached `aws.rds.Cluster`.
     * 
     */
    @Export(name="dbSubnetGroupName", type=String.class, parameters={})
    private Output<String> dbSubnetGroupName;

    /**
     * @return A DB subnet group to associate with this DB instance. **NOTE:** This must match the `db_subnet_group_name` of the attached `aws.rds.Cluster`.
     * 
     */
    public Output<String> dbSubnetGroupName() {
        return this.dbSubnetGroupName;
    }
    /**
     * The region-unique, immutable identifier for the DB instance.
     * 
     */
    @Export(name="dbiResourceId", type=String.class, parameters={})
    private Output<String> dbiResourceId;

    /**
     * @return The region-unique, immutable identifier for the DB instance.
     * 
     */
    public Output<String> dbiResourceId() {
        return this.dbiResourceId;
    }
    /**
     * The DNS address for this instance. May not be writable
     * 
     */
    @Export(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The DNS address for this instance. May not be writable
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * The name of the database engine to be used for the RDS instance. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`.
     * For information on the difference between the available Aurora MySQL engines
     * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
     * in the Amazon RDS User Guide.
     * 
     */
    @Export(name="engine", type=String.class, parameters={})
    private Output</* @Nullable */ String> engine;

    /**
     * @return The name of the database engine to be used for the RDS instance. Defaults to `aurora`. Valid Values: `aurora`, `aurora-mysql`, `aurora-postgresql`.
     * For information on the difference between the available Aurora MySQL engines
     * see [Comparison between Aurora MySQL 1 and Aurora MySQL 2](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AuroraMySQL.Updates.20180206.html)
     * in the Amazon RDS User Guide.
     * 
     */
    public Output<Optional<String>> engine() {
        return Codegen.optional(this.engine);
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
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * The database engine version
     * 
     */
    @Export(name="engineVersionActual", type=String.class, parameters={})
    private Output<String> engineVersionActual;

    /**
     * @return The database engine version
     * 
     */
    public Output<String> engineVersionActual() {
        return this.engineVersionActual;
    }
    /**
     * The indentifier for the RDS instance, if omitted, this provider will assign a random, unique identifier.
     * 
     */
    @Export(name="identifier", type=String.class, parameters={})
    private Output<String> identifier;

    /**
     * @return The indentifier for the RDS instance, if omitted, this provider will assign a random, unique identifier.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    @Export(name="identifierPrefix", type=String.class, parameters={})
    private Output<String> identifierPrefix;

    /**
     * @return Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    public Output<String> identifierPrefix() {
        return this.identifierPrefix;
    }
    /**
     * The instance class to use. For details on CPU
     * and memory, see [Scaling Aurora DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html). Aurora uses `db.*` instance classes/types. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) for currently available instance classes and complete details.
     * 
     */
    @Export(name="instanceClass", type=String.class, parameters={})
    private Output<String> instanceClass;

    /**
     * @return The instance class to use. For details on CPU
     * and memory, see [Scaling Aurora DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html). Aurora uses `db.*` instance classes/types. Please see [AWS Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBInstanceClass.html) for currently available instance classes and complete details.
     * 
     */
    public Output<String> instanceClass() {
        return this.instanceClass;
    }
    /**
     * The ARN for the KMS encryption key if one is set to the cluster.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key if one is set to the cluster.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid Values: 0, 1, 5, 10, 15, 30, 60.
     * 
     */
    @Export(name="monitoringInterval", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> monitoringInterval;

    /**
     * @return The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0. Valid Values: 0, 1, 5, 10, 15, 30, 60.
     * 
     */
    public Output<Optional<Integer>> monitoringInterval() {
        return Codegen.optional(this.monitoringInterval);
    }
    /**
     * The ARN for the IAM role that permits RDS to send
     * enhanced monitoring metrics to CloudWatch Logs. You can find more information on the [AWS Documentation](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
     * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
     * 
     */
    @Export(name="monitoringRoleArn", type=String.class, parameters={})
    private Output<String> monitoringRoleArn;

    /**
     * @return The ARN for the IAM role that permits RDS to send
     * enhanced monitoring metrics to CloudWatch Logs. You can find more information on the [AWS Documentation](http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.html)
     * what IAM permissions are needed to allow Enhanced Monitoring for RDS Instances.
     * 
     */
    public Output<String> monitoringRoleArn() {
        return this.monitoringRoleArn;
    }
    /**
     * Specifies whether Performance Insights is enabled or not.
     * 
     */
    @Export(name="performanceInsightsEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> performanceInsightsEnabled;

    /**
     * @return Specifies whether Performance Insights is enabled or not.
     * 
     */
    public Output<Boolean> performanceInsightsEnabled() {
        return this.performanceInsightsEnabled;
    }
    /**
     * ARN for the KMS key to encrypt Performance Insights data. When specifying `performance_insights_kms_key_id`, `performance_insights_enabled` needs to be set to true.
     * 
     */
    @Export(name="performanceInsightsKmsKeyId", type=String.class, parameters={})
    private Output<String> performanceInsightsKmsKeyId;

    /**
     * @return ARN for the KMS key to encrypt Performance Insights data. When specifying `performance_insights_kms_key_id`, `performance_insights_enabled` needs to be set to true.
     * 
     */
    public Output<String> performanceInsightsKmsKeyId() {
        return this.performanceInsightsKmsKeyId;
    }
    /**
     * Amount of time in days to retain Performance Insights data. Either 7 (7 days) or 731 (2 years). When specifying `performance_insights_retention_period`, `performance_insights_enabled` needs to be set to true. Defaults to &#39;7&#39;.
     * 
     */
    @Export(name="performanceInsightsRetentionPeriod", type=Integer.class, parameters={})
    private Output<Integer> performanceInsightsRetentionPeriod;

    /**
     * @return Amount of time in days to retain Performance Insights data. Either 7 (7 days) or 731 (2 years). When specifying `performance_insights_retention_period`, `performance_insights_enabled` needs to be set to true. Defaults to &#39;7&#39;.
     * 
     */
    public Output<Integer> performanceInsightsRetentionPeriod() {
        return this.performanceInsightsRetentionPeriod;
    }
    /**
     * The database port
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return The database port
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * The daily time range during which automated backups are created if automated backups are enabled.
     * Eg: &#34;04:00-09:00&#34;
     * 
     */
    @Export(name="preferredBackupWindow", type=String.class, parameters={})
    private Output<String> preferredBackupWindow;

    /**
     * @return The daily time range during which automated backups are created if automated backups are enabled.
     * Eg: &#34;04:00-09:00&#34;
     * 
     */
    public Output<String> preferredBackupWindow() {
        return this.preferredBackupWindow;
    }
    /**
     * The window to perform maintenance in.
     * Syntax: &#34;ddd:hh24:mi-ddd:hh24:mi&#34;. Eg: &#34;Mon:00:00-Mon:03:00&#34;.
     * 
     */
    @Export(name="preferredMaintenanceWindow", type=String.class, parameters={})
    private Output<String> preferredMaintenanceWindow;

    /**
     * @return The window to perform maintenance in.
     * Syntax: &#34;ddd:hh24:mi-ddd:hh24:mi&#34;. Eg: &#34;Mon:00:00-Mon:03:00&#34;.
     * 
     */
    public Output<String> preferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoted to writer.
     * 
     */
    @Export(name="promotionTier", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> promotionTier;

    /**
     * @return Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoted to writer.
     * 
     */
    public Output<Optional<Integer>> promotionTier() {
        return Codegen.optional(this.promotionTier);
    }
    /**
     * Bool to control if instance is publicly accessible.
     * Default `false`. See the documentation on [Creating DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) for more
     * details on controlling this property.
     * 
     */
    @Export(name="publiclyAccessible", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publiclyAccessible;

    /**
     * @return Bool to control if instance is publicly accessible.
     * Default `false`. See the documentation on [Creating DB Instances](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_CreateDBInstance.html) for more
     * details on controlling this property.
     * 
     */
    public Output<Optional<Boolean>> publiclyAccessible() {
        return Codegen.optional(this.publiclyAccessible);
    }
    /**
     * Specifies whether the DB cluster is encrypted.
     * 
     */
    @Export(name="storageEncrypted", type=Boolean.class, parameters={})
    private Output<Boolean> storageEncrypted;

    /**
     * @return Specifies whether the DB cluster is encrypted.
     * 
     */
    public Output<Boolean> storageEncrypted() {
        return this.storageEncrypted;
    }
    /**
     * A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
     * 
     */
    @Export(name="writer", type=Boolean.class, parameters={})
    private Output<Boolean> writer;

    /**
     * @return Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
     * 
     */
    public Output<Boolean> writer() {
        return this.writer;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterInstance(String name) {
        this(name, ClusterInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterInstance(String name, ClusterInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterInstance(String name, ClusterInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/clusterInstance:ClusterInstance", name, args == null ? ClusterInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterInstance(String name, Output<String> id, @Nullable ClusterInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/clusterInstance:ClusterInstance", name, state, makeResourceOptions(options, id));
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
    public static ClusterInstance get(String name, Output<String> id, @Nullable ClusterInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterInstance(name, id, state, options);
    }
}
