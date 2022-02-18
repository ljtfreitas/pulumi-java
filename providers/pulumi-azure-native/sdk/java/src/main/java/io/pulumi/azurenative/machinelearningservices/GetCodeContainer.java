// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.GetCodeContainerArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.GetCodeContainerResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCodeContainer {
/**
 * Azure Resource Manager resource envelope.
 * API Version: 2021-03-01-preview.
 * 
 *
 * Azure Resource Manager resource envelope.
 * 
 */
    public static CompletableFuture<GetCodeContainerResult> invokeAsync(GetCodeContainerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:getCodeContainer", TypeShape.of(GetCodeContainerResult.class), args == null ? GetCodeContainerArgs.Empty : args, Utilities.withVersion(options));
    }
}
