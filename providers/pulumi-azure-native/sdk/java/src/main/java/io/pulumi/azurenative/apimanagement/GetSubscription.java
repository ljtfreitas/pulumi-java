// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetSubscriptionArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetSubscriptionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSubscription {
/**
 * Subscription details.
 * API Version: 2020-12-01.
 * 
 *
 * Subscription details.
 * 
 */
    public static CompletableFuture<GetSubscriptionResult> invokeAsync(GetSubscriptionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getSubscription", TypeShape.of(GetSubscriptionResult.class), args == null ? GetSubscriptionArgs.Empty : args, Utilities.withVersion(options));
    }
}
