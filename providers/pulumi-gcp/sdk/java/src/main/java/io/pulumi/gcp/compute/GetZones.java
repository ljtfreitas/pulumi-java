// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.inputs.GetZonesArgs;
import io.pulumi.gcp.compute.outputs.GetZonesResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetZones {
    public static CompletableFuture<GetZonesResult> invokeAsync(@Nullable GetZonesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:compute/getZones:getZones", TypeShape.of(GetZonesResult.class), args == null ? GetZonesArgs.Empty : args, Utilities.withVersion(options));
    }
}