// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.inputs.GetEntityInsightsArgs;
import io.pulumi.azurenative.securityinsights.outputs.GetEntityInsightsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEntityInsights {
/**
 * The Get Insights result operation response.
 * API Version: 2019-01-01-preview.
 * 
 *
 * The Get Insights result operation response.
 * 
 */
    public static CompletableFuture<GetEntityInsightsResult> invokeAsync(GetEntityInsightsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityinsights:getEntityInsights", TypeShape.of(GetEntityInsightsResult.class), args == null ? GetEntityInsightsArgs.Empty : args, Utilities.withVersion(options));
    }
}
