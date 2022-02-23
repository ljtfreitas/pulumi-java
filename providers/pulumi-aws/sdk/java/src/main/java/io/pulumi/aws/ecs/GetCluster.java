// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ecs.inputs.GetClusterArgs;
import io.pulumi.aws.ecs.outputs.GetClusterResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCluster {
/**
 * The ECS Cluster data source allows access to details of a specific
 * cluster within an AWS ECS service.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getCluster.
 * 
 *
 * A collection of values returned by getCluster.
 * 
 */
    public static CompletableFuture<GetClusterResult> invokeAsync(GetClusterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ecs/getCluster:getCluster", TypeShape.of(GetClusterResult.class), args == null ? GetClusterArgs.Empty : args, Utilities.withVersion(options));
    }
}
