// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudformation;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.cloudformation.inputs.GetCloudFormationTypeArgs;
import io.pulumi.aws.cloudformation.outputs.GetCloudFormationTypeResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCloudFormationType {
/**
 * Provides details about a CloudFormation Type.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getCloudFormationType.
 * 
 *
 * A collection of values returned by getCloudFormationType.
 * 
 */
    public static CompletableFuture<GetCloudFormationTypeResult> invokeAsync(@Nullable GetCloudFormationTypeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:cloudformation/getCloudFormationType:getCloudFormationType", TypeShape.of(GetCloudFormationTypeResult.class), args == null ? GetCloudFormationTypeArgs.Empty : args, Utilities.withVersion(options));
    }
}
