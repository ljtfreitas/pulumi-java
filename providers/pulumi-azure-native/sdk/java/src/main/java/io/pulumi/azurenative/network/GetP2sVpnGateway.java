// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetP2sVpnGatewayArgs;
import io.pulumi.azurenative.network.outputs.GetP2sVpnGatewayResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetP2sVpnGateway {
/**
 * P2SVpnGateway Resource.
 * API Version: 2020-11-01.
 * 
 *
 * P2SVpnGateway Resource.
 * 
 */
    public static CompletableFuture<GetP2sVpnGatewayResult> invokeAsync(GetP2sVpnGatewayArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getP2sVpnGateway", TypeShape.of(GetP2sVpnGatewayResult.class), args == null ? GetP2sVpnGatewayArgs.Empty : args, Utilities.withVersion(options));
    }
}
