// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationsmanagement.inputs.GetSolutionArgs;
import io.pulumi.azurenative.operationsmanagement.outputs.GetSolutionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSolution {
/**
 * The container for solution.
 * API Version: 2015-11-01-preview.
 * 
 *
 * The container for solution.
 * 
 */
    public static CompletableFuture<GetSolutionResult> invokeAsync(GetSolutionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:operationsmanagement:getSolution", TypeShape.of(GetSolutionResult.class), args == null ? GetSolutionArgs.Empty : args, Utilities.withVersion(options));
    }
}
