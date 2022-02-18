// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridcompute.inputs.GetPrivateLinkScopeArgs;
import io.pulumi.azurenative.hybridcompute.outputs.GetPrivateLinkScopeResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrivateLinkScope {
/**
 * An Azure Arc PrivateLinkScope definition.
 * API Version: 2021-03-25-preview.
 * 
 *
 * An Azure Arc PrivateLinkScope definition.
 * 
 */
    public static CompletableFuture<GetPrivateLinkScopeResult> invokeAsync(GetPrivateLinkScopeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybridcompute:getPrivateLinkScope", TypeShape.of(GetPrivateLinkScopeResult.class), args == null ? GetPrivateLinkScopeArgs.Empty : args, Utilities.withVersion(options));
    }
}
