// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rds.ClusterSnapshotArgs;
import com.pulumi.aws.rds.inputs.ClusterSnapshotState;
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
 * Manages an RDS database cluster snapshot for Aurora clusters. For managing RDS database instance snapshots, see the `aws.rds.Snapshot` resource.
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
 *         var example = new ClusterSnapshot(&#34;example&#34;, ClusterSnapshotArgs.builder()        
 *             .dbClusterIdentifier(aws_rds_cluster.getExample().getId())
 *             .dbClusterSnapshotIdentifier(&#34;resourcetestsnapshot1234&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_db_cluster_snapshot` can be imported by using the cluster snapshot identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:rds/clusterSnapshot:ClusterSnapshot example my-cluster-snapshot
 * ```
 * 
 */
@ResourceType(type="aws:rds/clusterSnapshot:ClusterSnapshot")
public class ClusterSnapshot extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the allocated storage size in gigabytes (GB).
     * 
     */
    @Export(name="allocatedStorage", type=Integer.class, parameters={})
    private Output<Integer> allocatedStorage;

    /**
     * @return Specifies the allocated storage size in gigabytes (GB).
     * 
     */
    public Output<Integer> allocatedStorage() {
        return this.allocatedStorage;
    }
    /**
     * List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
     * 
     */
    @Export(name="availabilityZones", type=List.class, parameters={String.class})
    private Output<List<String>> availabilityZones;

    /**
     * @return List of EC2 Availability Zones that instances in the DB cluster snapshot can be restored in.
     * 
     */
    public Output<List<String>> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * The DB Cluster Identifier from which to take the snapshot.
     * 
     */
    @Export(name="dbClusterIdentifier", type=String.class, parameters={})
    private Output<String> dbClusterIdentifier;

    /**
     * @return The DB Cluster Identifier from which to take the snapshot.
     * 
     */
    public Output<String> dbClusterIdentifier() {
        return this.dbClusterIdentifier;
    }
    /**
     * The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
     * 
     */
    @Export(name="dbClusterSnapshotArn", type=String.class, parameters={})
    private Output<String> dbClusterSnapshotArn;

    /**
     * @return The Amazon Resource Name (ARN) for the DB Cluster Snapshot.
     * 
     */
    public Output<String> dbClusterSnapshotArn() {
        return this.dbClusterSnapshotArn;
    }
    /**
     * The Identifier for the snapshot.
     * 
     */
    @Export(name="dbClusterSnapshotIdentifier", type=String.class, parameters={})
    private Output<String> dbClusterSnapshotIdentifier;

    /**
     * @return The Identifier for the snapshot.
     * 
     */
    public Output<String> dbClusterSnapshotIdentifier() {
        return this.dbClusterSnapshotIdentifier;
    }
    /**
     * Specifies the name of the database engine.
     * 
     */
    @Export(name="engine", type=String.class, parameters={})
    private Output<String> engine;

    /**
     * @return Specifies the name of the database engine.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * Version of the database engine for this DB cluster snapshot.
     * 
     */
    @Export(name="engineVersion", type=String.class, parameters={})
    private Output<String> engineVersion;

    /**
     * @return Version of the database engine for this DB cluster snapshot.
     * 
     */
    public Output<String> engineVersion() {
        return this.engineVersion;
    }
    /**
     * If storage_encrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return If storage_encrypted is true, the AWS KMS key identifier for the encrypted DB cluster snapshot.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * License model information for the restored DB cluster.
     * 
     */
    @Export(name="licenseModel", type=String.class, parameters={})
    private Output<String> licenseModel;

    /**
     * @return License model information for the restored DB cluster.
     * 
     */
    public Output<String> licenseModel() {
        return this.licenseModel;
    }
    /**
     * Port that the DB cluster was listening on at the time of the snapshot.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output<Integer> port;

    /**
     * @return Port that the DB cluster was listening on at the time of the snapshot.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    @Export(name="snapshotType", type=String.class, parameters={})
    private Output<String> snapshotType;

    public Output<String> snapshotType() {
        return this.snapshotType;
    }
    @Export(name="sourceDbClusterSnapshotArn", type=String.class, parameters={})
    private Output<String> sourceDbClusterSnapshotArn;

    public Output<String> sourceDbClusterSnapshotArn() {
        return this.sourceDbClusterSnapshotArn;
    }
    /**
     * The status of this DB Cluster Snapshot.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of this DB Cluster Snapshot.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Specifies whether the DB cluster snapshot is encrypted.
     * 
     */
    @Export(name="storageEncrypted", type=Boolean.class, parameters={})
    private Output<Boolean> storageEncrypted;

    /**
     * @return Specifies whether the DB cluster snapshot is encrypted.
     * 
     */
    public Output<Boolean> storageEncrypted() {
        return this.storageEncrypted;
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
     * The VPC ID associated with the DB cluster snapshot.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The VPC ID associated with the DB cluster snapshot.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterSnapshot(String name) {
        this(name, ClusterSnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterSnapshot(String name, ClusterSnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterSnapshot(String name, ClusterSnapshotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/clusterSnapshot:ClusterSnapshot", name, args == null ? ClusterSnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterSnapshot(String name, Output<String> id, @Nullable ClusterSnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/clusterSnapshot:ClusterSnapshot", name, state, makeResourceOptions(options, id));
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
    public static ClusterSnapshot get(String name, Output<String> id, @Nullable ClusterSnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterSnapshot(name, id, state, options);
    }
}
