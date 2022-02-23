// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetLaunchConfigurationArgs;
import io.pulumi.aws.ec2.outputs.GetLaunchConfigurationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLaunchConfiguration {
/**
 * Provides information about a Launch Configuration.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getLaunchConfiguration.
 * 
 *
 * A collection of values returned by getLaunchConfiguration.
 * 
 */
    public static CompletableFuture<GetLaunchConfigurationResult> invokeAsync(GetLaunchConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getLaunchConfiguration:getLaunchConfiguration", TypeShape.of(GetLaunchConfigurationResult.class), args == null ? GetLaunchConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
