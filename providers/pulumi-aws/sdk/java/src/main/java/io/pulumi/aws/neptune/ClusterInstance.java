// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.neptune.ClusterInstanceArgs;
import io.pulumi.aws.neptune.inputs.ClusterInstanceState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * A Cluster Instance Resource defines attributes that are specific to a single instance in a Neptune Cluster.
 * 
 * You can simply add neptune instances and Neptune manages the replication. You can use the [count](https://www.terraform.io/docs/configuration/meta-arguments/count.html)
 * meta-parameter to make multiple instances and join them all to the same Neptune Cluster, or you may specify different Cluster Instance resources with various `instance_class` sizes.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_neptune_cluster_instance` can be imported by using the instance identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:neptune/clusterInstance:ClusterInstance example my-instance
 * ```
 * 
 */
@ResourceType(type="aws:neptune/clusterInstance:ClusterInstance")
public class ClusterInstance extends io.pulumi.resources.CustomResource {
    /**
     * The hostname of the instance. See also `endpoint` and `port`.
     * 
     */
    @OutputExport(name="address", type=String.class, parameters={})
    private Output<String> address;

    /**
     * @return The hostname of the instance. See also `endpoint` and `port`.
     * 
     */
    public Output<String> getAddress() {
        return this.address;
    }
    /**
     * Specifies whether any instance modifications
     * are applied immediately, or during the next maintenance window. Default is`false`.
     * 
     */
    @OutputExport(name="applyImmediately", type=Boolean.class, parameters={})
    private Output<Boolean> applyImmediately;

    /**
     * @return Specifies whether any instance modifications
     * are applied immediately, or during the next maintenance window. Default is`false`.
     * 
     */
    public Output<Boolean> getApplyImmediately() {
        return this.applyImmediately;
    }
    /**
     * Amazon Resource Name (ARN) of neptune instance
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of neptune instance
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
     * 
     */
    @OutputExport(name="autoMinorVersionUpgrade", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> autoMinorVersionUpgrade;

    /**
     * @return Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
     * 
     */
    public Output</* @Nullable */ Boolean> getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }
    /**
     * The EC2 Availability Zone that the neptune instance is created in.
     * 
     */
    @OutputExport(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return The EC2 Availability Zone that the neptune instance is created in.
     * 
     */
    public Output<String> getAvailabilityZone() {
        return this.availabilityZone;
    }
    /**
     * The identifier of the `aws.neptune.Cluster` in which to launch this instance.
     * 
     */
    @OutputExport(name="clusterIdentifier", type=String.class, parameters={})
    private Output<String> clusterIdentifier;

    /**
     * @return The identifier of the `aws.neptune.Cluster` in which to launch this instance.
     * 
     */
    public Output<String> getClusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * The region-unique, immutable identifier for the neptune instance.
     * 
     */
    @OutputExport(name="dbiResourceId", type=String.class, parameters={})
    private Output<String> dbiResourceId;

    /**
     * @return The region-unique, immutable identifier for the neptune instance.
     * 
     */
    public Output<String> getDbiResourceId() {
        return this.dbiResourceId;
    }
    /**
     * The connection endpoint in `address:port` format.
     * 
     */
    @OutputExport(name="endpoint", type=String.class, parameters={})
    private Output<String> endpoint;

    /**
     * @return The connection endpoint in `address:port` format.
     * 
     */
    public Output<String> getEndpoint() {
        return this.endpoint;
    }
    /**
     * The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
     * 
     */
    @OutputExport(name="engine", type=String.class, parameters={})
    private Output</* @Nullable */ String> engine;

    /**
     * @return The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
     * 
     */
    public Output</* @Nullable */ String> getEngine() {
        return this.engine;
    }
    /**
     * The neptune engine version.
     * 
     */
    @OutputExport(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return The neptune engine version.
     * 
     */
    public Output<String> getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * The identifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
     * 
     */
    @OutputExport(name="identifier", type=String.class, parameters={})
    private Output<String> identifier;

    /**
     * @return The identifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
     * 
     */
    public Output<String> getIdentifier() {
        return this.identifier;
    }
    /**
     * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    @OutputExport(name="identifierPrefix", type=String.class, parameters={})
    private Output<String> identifierPrefix;

    /**
     * @return Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
     * 
     */
    public Output<String> getIdentifierPrefix() {
        return this.identifierPrefix;
    }
    /**
     * The instance class to use.
     * 
     */
    @OutputExport(name="instanceClass", type=String.class, parameters={})
    private Output<String> instanceClass;

    /**
     * @return The instance class to use.
     * 
     */
    public Output<String> getInstanceClass() {
        return this.instanceClass;
    }
    /**
     * The ARN for the KMS encryption key if one is set to the neptune cluster.
     * 
     */
    @OutputExport(name="kmsKeyArn", type=String.class, parameters={})
    private Output<String> kmsKeyArn;

    /**
     * @return The ARN for the KMS encryption key if one is set to the neptune cluster.
     * 
     */
    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn;
    }
    /**
     * The name of the neptune parameter group to associate with this instance.
     * 
     */
    @OutputExport(name="neptuneParameterGroupName", type=String.class, parameters={})
    private Output</* @Nullable */ String> neptuneParameterGroupName;

    /**
     * @return The name of the neptune parameter group to associate with this instance.
     * 
     */
    public Output</* @Nullable */ String> getNeptuneParameterGroupName() {
        return this.neptuneParameterGroupName;
    }
    /**
     * A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptune_subnet_group_name` of the attached `aws.neptune.Cluster`.
     * 
     */
    @OutputExport(name="neptuneSubnetGroupName", type=String.class, parameters={})
    private Output<String> neptuneSubnetGroupName;

    /**
     * @return A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptune_subnet_group_name` of the attached `aws.neptune.Cluster`.
     * 
     */
    public Output<String> getNeptuneSubnetGroupName() {
        return this.neptuneSubnetGroupName;
    }
    /**
     * The port on which the DB accepts connections. Defaults to `8182`.
     * 
     */
    @OutputExport(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return The port on which the DB accepts connections. Defaults to `8182`.
     * 
     */
    public Output</* @Nullable */ Integer> getPort() {
        return this.port;
    }
    /**
     * The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
     * 
     */
    @OutputExport(name="preferredBackupWindow", type=String.class, parameters={})
    private Output<String> preferredBackupWindow;

    /**
     * @return The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
     * 
     */
    public Output<String> getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }
    /**
     * The window to perform maintenance in.
     * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
     * 
     */
    @OutputExport(name="preferredMaintenanceWindow", type=String.class, parameters={})
    private Output<String> preferredMaintenanceWindow;

    /**
     * @return The window to perform maintenance in.
     * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
     * 
     */
    public Output<String> getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }
    /**
     * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
     * 
     */
    @OutputExport(name="promotionTier", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> promotionTier;

    /**
     * @return Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
     * 
     */
    public Output</* @Nullable */ Integer> getPromotionTier() {
        return this.promotionTier;
    }
    /**
     * Bool to control if instance is publicly accessible. Default is `false`.
     * 
     */
    @OutputExport(name="publiclyAccessible", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publiclyAccessible;

    /**
     * @return Bool to control if instance is publicly accessible. Default is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getPubliclyAccessible() {
        return this.publiclyAccessible;
    }
    /**
     * Specifies whether the neptune cluster is encrypted.
     * 
     */
    @OutputExport(name="storageEncrypted", type=Boolean.class, parameters={})
    private Output<Boolean> storageEncrypted;

    /**
     * @return Specifies whether the neptune cluster is encrypted.
     * 
     */
    public Output<Boolean> getStorageEncrypted() {
        return this.storageEncrypted;
    }
    /**
     * A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the instance. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
     * 
     */
    @OutputExport(name="writer", type=Boolean.class, parameters={})
    private Output<Boolean> writer;

    /**
     * @return Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
     * 
     */
    public Output<Boolean> getWriter() {
        return this.writer;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterInstance(String name, ClusterInstanceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/clusterInstance:ClusterInstance", name, args == null ? ClusterInstanceArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private ClusterInstance(String name, Input<String> id, @Nullable ClusterInstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/clusterInstance:ClusterInstance", name, state, makeResourceOptions(options, id));
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
    public static ClusterInstance get(String name, Input<String> id, @Nullable ClusterInstanceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterInstance(name, id, state, options);
    }
}