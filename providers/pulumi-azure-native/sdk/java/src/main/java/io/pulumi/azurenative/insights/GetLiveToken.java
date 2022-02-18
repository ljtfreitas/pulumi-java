// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.inputs.GetLiveTokenArgs;
import io.pulumi.azurenative.insights.outputs.GetLiveTokenResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLiveToken {
/**
 * The response to a live token query.
 * API Version: 2020-06-02-preview.
 * 
 *
 * The response to a live token query.
 * 
 */
    public static CompletableFuture<GetLiveTokenResult> invokeAsync(GetLiveTokenArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getLiveToken", TypeShape.of(GetLiveTokenResult.class), args == null ? GetLiveTokenArgs.Empty : args, Utilities.withVersion(options));
    }
}
