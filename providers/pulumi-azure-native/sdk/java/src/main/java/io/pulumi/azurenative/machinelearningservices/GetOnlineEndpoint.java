// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.GetOnlineEndpointArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.GetOnlineEndpointResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOnlineEndpoint {
/**
 * API Version: 2021-03-01-preview.
 * 
 */
    public static CompletableFuture<GetOnlineEndpointResult> invokeAsync(GetOnlineEndpointArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:getOnlineEndpoint", TypeShape.of(GetOnlineEndpointResult.class), args == null ? GetOnlineEndpointArgs.Empty : args, Utilities.withVersion(options));
    }
}
