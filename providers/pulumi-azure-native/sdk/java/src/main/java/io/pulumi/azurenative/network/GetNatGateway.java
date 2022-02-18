// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetNatGatewayArgs;
import io.pulumi.azurenative.network.outputs.GetNatGatewayResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNatGateway {
/**
 * Nat Gateway resource.
 * API Version: 2020-11-01.
 * 
 *
 * Nat Gateway resource.
 * 
 */
    public static CompletableFuture<GetNatGatewayResult> invokeAsync(GetNatGatewayArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getNatGateway", TypeShape.of(GetNatGatewayResult.class), args == null ? GetNatGatewayArgs.Empty : args, Utilities.withVersion(options));
    }
}
