// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudcontrol;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudcontrol.inputs.GetResourceArgs;
import io.pulumi.aws.cloudcontrol.outputs.GetResourceResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResource {
/**
 * Provides details for a Cloud Control API Resource. The reading of these resources is proxied through Cloud Control API handlers to the backend service.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getResource.
 * 
 *
 * A collection of values returned by getResource.
 * 
 */
    public static CompletableFuture<GetResourceResult> invokeAsync(GetResourceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudcontrol/getResource:getResource", TypeShape.of(GetResourceResult.class), args == null ? GetResourceArgs.Empty : args, Utilities.withVersion(options));
    }
}
