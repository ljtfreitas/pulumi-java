// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.guardduty.inputs.GetDetectorArgs;
import io.pulumi.aws.guardduty.outputs.GetDetectorResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDetector {
/**
 * Retrieve information about a GuardDuty detector.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getDetector.
 * 
 *
 * A collection of values returned by getDetector.
 * 
 */
    public static CompletableFuture<GetDetectorResult> invokeAsync(@Nullable GetDetectorArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:guardduty/getDetector:getDetector", TypeShape.of(GetDetectorResult.class), args == null ? GetDetectorArgs.Empty : args, Utilities.withVersion(options));
    }
}
