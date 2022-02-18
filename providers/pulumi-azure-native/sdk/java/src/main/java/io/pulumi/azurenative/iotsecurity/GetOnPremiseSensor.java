// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotsecurity;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.iotsecurity.inputs.GetOnPremiseSensorArgs;
import io.pulumi.azurenative.iotsecurity.outputs.GetOnPremiseSensorResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOnPremiseSensor {
/**
 * On-premise IoT sensor
 * API Version: 2021-02-01-preview.
 * 
 *
 * On-premise IoT sensor
 * 
 */
    public static CompletableFuture<GetOnPremiseSensorResult> invokeAsync(GetOnPremiseSensorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:iotsecurity:getOnPremiseSensor", TypeShape.of(GetOnPremiseSensorResult.class), args == null ? GetOnPremiseSensorArgs.Empty : args, Utilities.withVersion(options));
    }
}
