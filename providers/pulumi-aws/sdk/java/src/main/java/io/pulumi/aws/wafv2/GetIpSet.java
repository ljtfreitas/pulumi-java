// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.wafv2.inputs.GetIpSetArgs;
import io.pulumi.aws.wafv2.outputs.GetIpSetResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIpSet {
/**
 * Retrieves the summary of a WAFv2 IP Set.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getIpSet.
 * 
 *
 * A collection of values returned by getIpSet.
 * 
 */
    public static CompletableFuture<GetIpSetResult> invokeAsync(GetIpSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:wafv2/getIpSet:getIpSet", TypeShape.of(GetIpSetResult.class), args == null ? GetIpSetArgs.Empty : args, Utilities.withVersion(options));
    }
}
