// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicefabricmesh.inputs.GetNetworkArgs;
import io.pulumi.azurenative.servicefabricmesh.outputs.GetNetworkResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNetwork {
/**
 * This type describes a network resource.
 * API Version: 2018-09-01-preview.
 * 
 *
 * This type describes a network resource.
 * 
 */
    public static CompletableFuture<GetNetworkResult> invokeAsync(GetNetworkArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicefabricmesh:getNetwork", TypeShape.of(GetNetworkResult.class), args == null ? GetNetworkArgs.Empty : args, Utilities.withVersion(options));
    }
}
