// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.storagegateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.storagegateway.inputs.GetLocalDiskArgs;
import io.pulumi.aws.storagegateway.outputs.GetLocalDiskResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLocalDisk {
/**
 * Retrieve information about a Storage Gateway local disk. The disk identifier is useful for adding the disk as a cache or upload buffer to a gateway.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getLocalDisk.
 * 
 *
 * A collection of values returned by getLocalDisk.
 * 
 */
    public static CompletableFuture<GetLocalDiskResult> invokeAsync(GetLocalDiskArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:storagegateway/getLocalDisk:getLocalDisk", TypeShape.of(GetLocalDiskResult.class), args == null ? GetLocalDiskArgs.Empty : args, Utilities.withVersion(options));
    }
}
