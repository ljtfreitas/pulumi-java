// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.peering.inputs.GetPeeringArgs;
import io.pulumi.azurenative.peering.outputs.GetPeeringResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPeering {
/**
 * Peering is a logical representation of a set of connections to the Microsoft Cloud Edge at a location.
 * API Version: 2021-01-01.
 * 
 *
 * Peering is a logical representation of a set of connections to the Microsoft Cloud Edge at a location.
 * 
 */
    public static CompletableFuture<GetPeeringResult> invokeAsync(GetPeeringArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:peering:getPeering", TypeShape.of(GetPeeringResult.class), args == null ? GetPeeringArgs.Empty : args, Utilities.withVersion(options));
    }
}
