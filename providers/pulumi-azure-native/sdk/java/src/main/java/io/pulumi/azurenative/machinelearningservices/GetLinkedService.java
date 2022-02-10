// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.GetLinkedServiceArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.GetLinkedServiceResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLinkedService {
    public static CompletableFuture<GetLinkedServiceResult> invokeAsync(GetLinkedServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:getLinkedService", TypeShape.of(GetLinkedServiceResult.class), args == null ? GetLinkedServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}