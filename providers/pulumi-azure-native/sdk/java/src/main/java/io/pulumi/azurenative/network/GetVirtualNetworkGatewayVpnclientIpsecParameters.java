// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetVirtualNetworkGatewayVpnclientIpsecParametersArgs;
import io.pulumi.azurenative.network.outputs.GetVirtualNetworkGatewayVpnclientIpsecParametersResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVirtualNetworkGatewayVpnclientIpsecParameters {
/**
 * An IPSec parameters for a virtual network gateway P2S connection.
 * API Version: 2020-11-01.
 * 
 *
 * An IPSec parameters for a virtual network gateway P2S connection.
 * 
 */
    public static CompletableFuture<GetVirtualNetworkGatewayVpnclientIpsecParametersResult> invokeAsync(GetVirtualNetworkGatewayVpnclientIpsecParametersArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getVirtualNetworkGatewayVpnclientIpsecParameters", TypeShape.of(GetVirtualNetworkGatewayVpnclientIpsecParametersResult.class), args == null ? GetVirtualNetworkGatewayVpnclientIpsecParametersArgs.Empty : args, Utilities.withVersion(options));
    }
}
