// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.msk.inputs.GetConfigurationArgs;
import io.pulumi.aws.msk.outputs.GetConfigurationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConfiguration {
/**
 * Get information on an Amazon MSK Configuration.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getConfiguration.
 * 
 *
 * A collection of values returned by getConfiguration.
 * 
 */
    public static CompletableFuture<GetConfigurationResult> invokeAsync(GetConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:msk/getConfiguration:getConfiguration", TypeShape.of(GetConfigurationResult.class), args == null ? GetConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
