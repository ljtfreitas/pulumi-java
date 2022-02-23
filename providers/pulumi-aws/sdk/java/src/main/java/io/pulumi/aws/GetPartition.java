// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.outputs.GetPartitionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPartition {
/**
 * Use this data source to lookup current AWS partition in which this provider is working
 * 
 * ## Example Usage
 * 
 *
 * A collection of values returned by getPartition.
 * 
 */
    public static CompletableFuture<GetPartitionResult> invokeAsync(@Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getPartition:getPartition", TypeShape.of(GetPartitionResult.class), io.pulumi.resources.InvokeArgs.Empty, Utilities.withVersion(options));
    }
}
