// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetLocalNetworkGatewayArgs;
import io.pulumi.azurenative.network.outputs.GetLocalNetworkGatewayResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLocalNetworkGateway {
/**
 * A common class for general resource information.
 * API Version: 2020-11-01.
 * 
 *
 * A common class for general resource information.
 * 
 */
    public static CompletableFuture<GetLocalNetworkGatewayResult> invokeAsync(GetLocalNetworkGatewayArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getLocalNetworkGateway", TypeShape.of(GetLocalNetworkGatewayResult.class), args == null ? GetLocalNetworkGatewayArgs.Empty : args, Utilities.withVersion(options));
    }
}
