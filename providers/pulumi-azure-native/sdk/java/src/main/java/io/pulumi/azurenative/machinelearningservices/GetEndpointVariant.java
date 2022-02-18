// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.GetEndpointVariantArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.GetEndpointVariantResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetEndpointVariant {
/**
 * Machine Learning service object wrapped into ARM resource envelope.
 * API Version: 2021-01-01.
 * 
 *
 * Machine Learning service object wrapped into ARM resource envelope.
 * 
 */
    public static CompletableFuture<GetEndpointVariantResult> invokeAsync(GetEndpointVariantArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:getEndpointVariant", TypeShape.of(GetEndpointVariantResult.class), args == null ? GetEndpointVariantArgs.Empty : args, Utilities.withVersion(options));
    }
}
