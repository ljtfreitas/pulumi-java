// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.inputs.GetReplicationFabricArgs;
import io.pulumi.azurenative.recoveryservices.outputs.GetReplicationFabricResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReplicationFabric {
/**
 * Fabric definition.
 * API Version: 2018-07-10.
 * 
 *
 * Fabric definition.
 * 
 */
    public static CompletableFuture<GetReplicationFabricResult> invokeAsync(GetReplicationFabricArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:recoveryservices:getReplicationFabric", TypeShape.of(GetReplicationFabricResult.class), args == null ? GetReplicationFabricArgs.Empty : args, Utilities.withVersion(options));
    }
}
