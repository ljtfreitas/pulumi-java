// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.logic.inputs.ListWorkflowRunActionRepetitionExpressionTracesArgs;
import io.pulumi.azurenative.logic.outputs.ListWorkflowRunActionRepetitionExpressionTracesResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWorkflowRunActionRepetitionExpressionTraces {
/**
 * The expression traces.
 * API Version: 2019-05-01.
 * 
 *
 * The expression traces.
 * 
 */
    public static CompletableFuture<ListWorkflowRunActionRepetitionExpressionTracesResult> invokeAsync(ListWorkflowRunActionRepetitionExpressionTracesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:logic:listWorkflowRunActionRepetitionExpressionTraces", TypeShape.of(ListWorkflowRunActionRepetitionExpressionTracesResult.class), args == null ? ListWorkflowRunActionRepetitionExpressionTracesArgs.Empty : args, Utilities.withVersion(options));
    }
}
