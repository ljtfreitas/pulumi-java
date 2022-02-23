// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.docdb.GlobalClusterArgs;
import io.pulumi.aws.docdb.inputs.GlobalClusterState;
import io.pulumi.aws.docdb.outputs.GlobalClusterGlobalClusterMember;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages an DocumentDB Global Cluster. A global cluster consists of one primary region and up to five read-only secondary regions. You issue write operations directly to the primary cluster in the primary region and Amazon DocumentDB automatically replicates the data to the secondary regions using dedicated infrastructure.
 * 
 * More information about DocumentDB Global Clusters can be found in the [DocumentDB Developer Guide](https://docs.aws.amazon.com/documentdb/latest/developerguide/global-clusters.html).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_docdb_global_cluster` can be imported by using the Global Cluster identifier, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:docdb/globalCluster:GlobalCluster example example
 * ```
 * 
 *  Certain resource arguments, like `source_db_cluster_identifier`, do not have an API method for reading the information after creation. If the argument is set in the Terraform configuration on an imported resource, Terraform will always show a difference. To workaround this behavior, either omit the argument from the Terraform configuration or use [`ignore_changes`](https://www.terraform.io/docs/configuration/meta-arguments/lifecycle.html#ignore_changes) to hide the difference, e.g. terraform resource "aws_docdb_global_cluster" "example" {
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
@ResourceType(type="aws:docdb/globalCluster:GlobalCluster")
public class GlobalCluster extends io.pulumi.resources.CustomResource {
    /**
     * Global Cluster Amazon Resource Name (ARN)
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Global Cluster Amazon Resource Name (ARN)
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Name for an automatically created database on cluster creation.
     * 
     */
    @OutputExport(name="databaseName", type=String.class, parameters={})
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
    @OutputExport(name="deletionProtection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deletionProtection;

    /**
     * @return If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> getDeletionProtection() {
        return this.deletionProtection;
    }
    @OutputExport(name="engine", type=String.class, parameters={})
    private Output<String> engine;

    public Output<String> getEngine() {
        return this.engine;
    }
    /**
     * Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
     * * **NOTE:** Upgrading major versions is not supported.
     * 
     */
    @OutputExport(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return Engine version of the global database. Upgrading the engine version will result in all cluster members being immediately updated and will.
     * * **NOTE:** Upgrading major versions is not supported.
     * 
     */
    public Output<String> getEngineVersion() {
        return this.engineVersion;
    }
    /**
     * The global cluster identifier.
     * 
     */
    @OutputExport(name="globalClusterIdentifier", type=String.class, parameters={})
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
    @OutputExport(name="globalClusterMembers", type=List.class, parameters={GlobalClusterGlobalClusterMember.class})
    private Output<List<GlobalClusterGlobalClusterMember>> globalClusterMembers;

    /**
     * @return Set of objects containing Global Cluster members.
     * 
     */
    public Output<List<GlobalClusterGlobalClusterMember>> getGlobalClusterMembers() {
        return this.globalClusterMembers;
    }
    /**
     * AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
     * 
     */
    @OutputExport(name="globalClusterResourceId", type=String.class, parameters={})
    private Output<String> globalClusterResourceId;

    /**
     * @return AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed.
     * 
     */
    public Output<String> getGlobalClusterResourceId() {
        return this.globalClusterResourceId;
    }
    @OutputExport(name="sourceDbClusterIdentifier", type=String.class, parameters={})
    private Output<String> sourceDbClusterIdentifier;

    public Output<String> getSourceDbClusterIdentifier() {
        return this.sourceDbClusterIdentifier;
    }
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    public Output<String> getStatus() {
        return this.status;
    }
    @OutputExport(name="storageEncrypted", type=Boolean.class, parameters={})
    private Output<Boolean> storageEncrypted;

    public Output<Boolean> getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalCluster(String name, GlobalClusterArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:docdb/globalCluster:GlobalCluster", name, args == null ? GlobalClusterArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private GlobalCluster(String name, Input<String> id, @Nullable GlobalClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:docdb/globalCluster:GlobalCluster", name, state, makeResourceOptions(options, id));
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
    public static GlobalCluster get(String name, Input<String> id, @Nullable GlobalClusterState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new GlobalCluster(name, id, state, options);
    }
}
