// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetVirtualNetworkGatewayVpnclientConnectionHealthArgs;
import io.pulumi.azurenative.network.outputs.GetVirtualNetworkGatewayVpnclientConnectionHealthResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVirtualNetworkGatewayVpnclientConnectionHealth {
    public static CompletableFuture<GetVirtualNetworkGatewayVpnclientConnectionHealthResult> invokeAsync(GetVirtualNetworkGatewayVpnclientConnectionHealthArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getVirtualNetworkGatewayVpnclientConnectionHealth", TypeShape.of(GetVirtualNetworkGatewayVpnclientConnectionHealthResult.class), args == null ? GetVirtualNetworkGatewayVpnclientConnectionHealthArgs.Empty : args, Utilities.withVersion(options));
    }
}