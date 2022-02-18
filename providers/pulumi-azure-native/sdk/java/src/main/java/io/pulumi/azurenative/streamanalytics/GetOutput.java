// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.streamanalytics.inputs.GetOutputArgs;
import io.pulumi.azurenative.streamanalytics.outputs.GetOutputResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOutput {
/**
 * An output object, containing all information associated with the named output. All outputs are contained under a streaming job.
 * API Version: 2016-03-01.
 * 
 *
 * An output object, containing all information associated with the named output. All outputs are contained under a streaming job.
 * 
 */
    public static CompletableFuture<GetOutputResult> invokeAsync(GetOutputArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:streamanalytics:getOutput", TypeShape.of(GetOutputResult.class), args == null ? GetOutputArgs.Empty : args, Utilities.withVersion(options));
    }
}
