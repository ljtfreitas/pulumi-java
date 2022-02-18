// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearningservices.inputs.ListWorkspaceNotebookAccessTokenArgs;
import io.pulumi.azurenative.machinelearningservices.outputs.ListWorkspaceNotebookAccessTokenResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWorkspaceNotebookAccessToken {
/**
 * API Version: 2021-01-01.
 * 
 */
    public static CompletableFuture<ListWorkspaceNotebookAccessTokenResult> invokeAsync(ListWorkspaceNotebookAccessTokenArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearningservices:listWorkspaceNotebookAccessToken", TypeShape.of(ListWorkspaceNotebookAccessTokenResult.class), args == null ? ListWorkspaceNotebookAccessTokenArgs.Empty : args, Utilities.withVersion(options));
    }
}
