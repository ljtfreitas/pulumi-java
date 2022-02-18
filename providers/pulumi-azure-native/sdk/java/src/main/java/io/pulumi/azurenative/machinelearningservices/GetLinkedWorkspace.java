// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.GetLinkedWorkspaceArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.GetLinkedWorkspaceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLinkedWorkspace {
/**
 * Linked workspace.
 * API Version: 2020-03-01.
 * 
 *
 * Linked workspace.
 * 
 */
    public static CompletableFuture<GetLinkedWorkspaceResult> invokeAsync(GetLinkedWorkspaceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:getLinkedWorkspace", TypeShape.of(GetLinkedWorkspaceResult.class), args == null ? GetLinkedWorkspaceArgs.Empty : args, Utilities.withVersion(options));
    }
}
