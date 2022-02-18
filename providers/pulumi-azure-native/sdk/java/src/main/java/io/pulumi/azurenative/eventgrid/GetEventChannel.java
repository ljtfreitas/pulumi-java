// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.inputs.GetEventChannelArgs;
import io.pulumi.azurenative.eventgrid.outputs.GetEventChannelResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEventChannel {
/**
 * Event Channel.
 * API Version: 2021-06-01-preview.
 * 
 *
 * Event Channel.
 * 
 */
    public static CompletableFuture<GetEventChannelResult> invokeAsync(GetEventChannelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:getEventChannel", TypeShape.of(GetEventChannelResult.class), args == null ? GetEventChannelArgs.Empty : args, Utilities.withVersion(options));
    }
}
