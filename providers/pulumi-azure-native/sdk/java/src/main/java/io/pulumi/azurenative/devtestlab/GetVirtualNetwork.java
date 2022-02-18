// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devtestlab.inputs.GetVirtualNetworkArgs;
import io.pulumi.azurenative.devtestlab.outputs.GetVirtualNetworkResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVirtualNetwork {
/**
 * A virtual network.
 * API Version: 2018-09-15.
 * 
 *
 * A virtual network.
 * 
 */
    public static CompletableFuture<GetVirtualNetworkResult> invokeAsync(GetVirtualNetworkArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devtestlab:getVirtualNetwork", TypeShape.of(GetVirtualNetworkResult.class), args == null ? GetVirtualNetworkArgs.Empty : args, Utilities.withVersion(options));
    }
}
