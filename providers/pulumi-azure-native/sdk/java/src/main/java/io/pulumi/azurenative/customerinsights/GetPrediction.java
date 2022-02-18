// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customerinsights.inputs.GetPredictionArgs;
import io.pulumi.azurenative.customerinsights.outputs.GetPredictionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrediction {
/**
 * The prediction resource format.
 * API Version: 2017-04-26.
 * 
 *
 * The prediction resource format.
 * 
 */
    public static CompletableFuture<GetPredictionResult> invokeAsync(GetPredictionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getPrediction", TypeShape.of(GetPredictionResult.class), args == null ? GetPredictionArgs.Empty : args, Utilities.withVersion(options));
    }
}
