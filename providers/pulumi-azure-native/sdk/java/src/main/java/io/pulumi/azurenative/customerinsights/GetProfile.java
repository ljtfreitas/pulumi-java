// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customerinsights.inputs.GetProfileArgs;
import io.pulumi.azurenative.customerinsights.outputs.GetProfileResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProfile {
/**
 * The profile resource format.
 * API Version: 2017-04-26.
 * 
 *
 * The profile resource format.
 * 
 */
    public static CompletableFuture<GetProfileResult> invokeAsync(GetProfileArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getProfile", TypeShape.of(GetProfileResult.class), args == null ? GetProfileArgs.Empty : args, Utilities.withVersion(options));
    }
}
