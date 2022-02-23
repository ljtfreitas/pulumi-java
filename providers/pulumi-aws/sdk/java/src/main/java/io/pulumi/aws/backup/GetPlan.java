// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.backup.inputs.GetPlanArgs;
import io.pulumi.aws.backup.outputs.GetPlanResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPlan {
/**
 * Use this data source to get information on an existing backup plan.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getPlan.
 * 
 *
 * A collection of values returned by getPlan.
 * 
 */
    public static CompletableFuture<GetPlanResult> invokeAsync(GetPlanArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:backup/getPlan:getPlan", TypeShape.of(GetPlanResult.class), args == null ? GetPlanArgs.Empty : args, Utilities.withVersion(options));
    }
}
