// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearning.inputs.GetWorkspaceArgs;
import io.pulumi.azurenative.machinelearning.outputs.GetWorkspaceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkspace {
/**
 * An object that represents a machine learning workspace.
 * API Version: 2016-04-01.
 * 
 *
 * An object that represents a machine learning workspace.
 * 
 */
    public static CompletableFuture<GetWorkspaceResult> invokeAsync(GetWorkspaceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearning:getWorkspace", TypeShape.of(GetWorkspaceResult.class), args == null ? GetWorkspaceArgs.Empty : args, Utilities.withVersion(options));
    }
}
