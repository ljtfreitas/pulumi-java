// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.resources.inputs.GetTagAtScopeArgs;
import io.pulumi.azurenative.resources.outputs.GetTagAtScopeResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTagAtScope {
/**
 * Wrapper resource for tags API requests and responses.
 * API Version: 2019-10-01.
 * 
 *
 * Wrapper resource for tags API requests and responses.
 * 
 */
    public static CompletableFuture<GetTagAtScopeResult> invokeAsync(GetTagAtScopeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getTagAtScope", TypeShape.of(GetTagAtScopeResult.class), args == null ? GetTagAtScopeArgs.Empty : args, Utilities.withVersion(options));
    }
}
