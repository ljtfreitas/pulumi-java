// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotsecurity;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.iotsecurity.inputs.GetSensorArgs;
import io.pulumi.azurenative.iotsecurity.outputs.GetSensorResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSensor {
/**
 * IoT sensor model
 * API Version: 2021-02-01-preview.
 * 
 *
 * IoT sensor model
 * 
 */
    public static CompletableFuture<GetSensorResult> invokeAsync(GetSensorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:iotsecurity:getSensor", TypeShape.of(GetSensorResult.class), args == null ? GetSensorArgs.Empty : args, Utilities.withVersion(options));
    }
}
