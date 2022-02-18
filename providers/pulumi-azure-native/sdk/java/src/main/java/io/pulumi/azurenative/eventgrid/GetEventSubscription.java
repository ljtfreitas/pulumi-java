// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.inputs.GetEventSubscriptionArgs;
import io.pulumi.azurenative.eventgrid.outputs.GetEventSubscriptionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEventSubscription {
/**
 * Event Subscription
 * API Version: 2020-06-01.
 * 
 *
 * Event Subscription
 * 
 */
    public static CompletableFuture<GetEventSubscriptionResult> invokeAsync(GetEventSubscriptionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getEventSubscription", TypeShape.of(GetEventSubscriptionResult.class), args == null ? GetEventSubscriptionArgs.Empty : args, Utilities.withVersion(options));
    }
}
