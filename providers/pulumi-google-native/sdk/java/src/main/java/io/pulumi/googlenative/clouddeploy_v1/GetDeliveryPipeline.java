// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.clouddeploy_v1.inputs.GetDeliveryPipelineArgs;
import io.pulumi.googlenative.clouddeploy_v1.outputs.GetDeliveryPipelineResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDeliveryPipeline {
    public static CompletableFuture<GetDeliveryPipelineResult> invokeAsync(GetDeliveryPipelineArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:clouddeploy/v1:getDeliveryPipeline", TypeShape.of(GetDeliveryPipelineResult.class), args == null ? GetDeliveryPipelineArgs.Empty : args, Utilities.withVersion(options));
    }
}