// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.inputs.GetOrderArgs;
import io.pulumi.azurenative.databoxedge.outputs.GetOrderResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrder {
/**
 * The order details.
 * API Version: 2020-12-01.
 * 
 *
 * The order details.
 * 
 */
    public static CompletableFuture<GetOrderResult> invokeAsync(GetOrderArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getOrder", TypeShape.of(GetOrderResult.class), args == null ? GetOrderArgs.Empty : args, Utilities.withVersion(options));
    }
}
