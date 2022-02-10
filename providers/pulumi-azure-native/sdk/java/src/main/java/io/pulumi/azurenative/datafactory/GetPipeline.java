// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datafactory.inputs.GetPipelineArgs;
import io.pulumi.azurenative.datafactory.outputs.GetPipelineResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPipeline {
    public static CompletableFuture<GetPipelineResult> invokeAsync(GetPipelineArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datafactory:getPipeline", TypeShape.of(GetPipelineResult.class), args == null ? GetPipelineArgs.Empty : args, Utilities.withVersion(options));
    }
}