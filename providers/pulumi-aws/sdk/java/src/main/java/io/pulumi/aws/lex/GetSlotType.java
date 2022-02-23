// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.lex.inputs.GetSlotTypeArgs;
import io.pulumi.aws.lex.outputs.GetSlotTypeResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSlotType {
/**
 * Provides details about a specific Amazon Lex Slot Type.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getSlotType.
 * 
 *
 * A collection of values returned by getSlotType.
 * 
 */
    public static CompletableFuture<GetSlotTypeResult> invokeAsync(GetSlotTypeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lex/getSlotType:getSlotType", TypeShape.of(GetSlotTypeResult.class), args == null ? GetSlotTypeArgs.Empty : args, Utilities.withVersion(options));
    }
}
