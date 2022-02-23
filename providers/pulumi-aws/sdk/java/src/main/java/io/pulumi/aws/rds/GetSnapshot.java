// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.rds.inputs.GetSnapshotArgs;
import io.pulumi.aws.rds.outputs.GetSnapshotResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSnapshot {
/**
 * Use this data source to get information about a DB Snapshot for use when provisioning DB instances
 * 
 * > **NOTE:** This data source does not apply to snapshots created on Aurora DB clusters.
 * See the `aws.rds.ClusterSnapshot` data source for DB Cluster snapshots.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getSnapshot.
 * 
 *
 * A collection of values returned by getSnapshot.
 * 
 */
    public static CompletableFuture<GetSnapshotResult> invokeAsync(@Nullable GetSnapshotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:rds/getSnapshot:getSnapshot", TypeShape.of(GetSnapshotResult.class), args == null ? GetSnapshotArgs.Empty : args, Utilities.withVersion(options));
    }
}
