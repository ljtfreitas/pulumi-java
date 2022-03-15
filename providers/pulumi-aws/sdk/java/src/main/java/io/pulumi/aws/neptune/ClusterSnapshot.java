// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.neptune;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.neptune.ClusterSnapshotArgs;
import io.pulumi.aws.neptune.inputs.ClusterSnapshotState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Neptune database cluster snapshot.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * `aws_neptune_cluster_snapshot` can be imported by using the cluster snapshot identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:neptune/clusterSnapshot:ClusterSnapshot example my-cluster-snapshot
 * ```
 * 
 */
@ResourceType(type="aws:neptune/clusterSnapshot:ClusterSnapshot")
public class ClusterSnapshot extends io.pulumi.resources.CustomResource {
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
    public Output<Integer> getAllocatedStorage() {
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
    public Output<List<String>> getAvailabilityZones() {
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
    public Output<String> getDbClusterIdentifier() {
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
    public Output<String> getDbClusterSnapshotArn() {
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
    public Output<String> getDbClusterSnapshotIdentifier() {
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
    public Output<String> getEngine() {
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
    public Output<String> getEngineVersion() {
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
    public Output<String> getKmsKeyId() {
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
    public Output<String> getLicenseModel() {
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
    public Output<Integer> getPort() {
        return this.port;
    }
    @Export(name="snapshotType", type=String.class, parameters={})
    private Output<String> snapshotType;

    public Output<String> getSnapshotType() {
        return this.snapshotType;
    }
    @Export(name="sourceDbClusterSnapshotArn", type=String.class, parameters={})
    private Output<String> sourceDbClusterSnapshotArn;

    public Output<String> getSourceDbClusterSnapshotArn() {
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
    public Output<String> getStatus() {
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
    public Output<Boolean> getStorageEncrypted() {
        return this.storageEncrypted;
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
    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public interface BuilderApplicator {
        public void apply(ClusterSnapshotArgs.Builder a);
    }
    private static io.pulumi.aws.neptune.ClusterSnapshotArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.neptune.ClusterSnapshotArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public ClusterSnapshot(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
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
    public ClusterSnapshot(String name, ClusterSnapshotArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/clusterSnapshot:ClusterSnapshot", name, args == null ? ClusterSnapshotArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private ClusterSnapshot(String name, Output<String> id, @Nullable ClusterSnapshotState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/clusterSnapshot:ClusterSnapshot", name, state, makeResourceOptions(options, id));
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
    public static ClusterSnapshot get(String name, Output<String> id, @Nullable ClusterSnapshotState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ClusterSnapshot(name, id, state, options);
    }
}
