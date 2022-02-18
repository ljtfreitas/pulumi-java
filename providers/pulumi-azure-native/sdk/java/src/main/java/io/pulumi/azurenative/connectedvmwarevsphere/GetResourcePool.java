// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.GetResourcePoolArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.GetResourcePoolResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResourcePool {
/**
 * Define the resourcePool.
 * API Version: 2020-10-01-preview.
 * 
 *
 * Define the resourcePool.
 * 
 */
    public static CompletableFuture<GetResourcePoolResult> invokeAsync(GetResourcePoolArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getResourcePool", TypeShape.of(GetResourcePoolResult.class), args == null ? GetResourcePoolArgs.Empty : args, Utilities.withVersion(options));
    }
}
