// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetExpressRouteCircuitArgs;
import io.pulumi.azurenative.network.outputs.GetExpressRouteCircuitResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetExpressRouteCircuit {
/**
 * ExpressRouteCircuit resource.
 * API Version: 2020-11-01.
 * 
 *
 * ExpressRouteCircuit resource.
 * 
 */
    public static CompletableFuture<GetExpressRouteCircuitResult> invokeAsync(GetExpressRouteCircuitArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getExpressRouteCircuit", TypeShape.of(GetExpressRouteCircuitResult.class), args == null ? GetExpressRouteCircuitArgs.Empty : args, Utilities.withVersion(options));
    }
}
