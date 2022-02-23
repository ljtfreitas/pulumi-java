// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetDedicatedHostArgs;
import io.pulumi.aws.ec2.outputs.GetDedicatedHostResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDedicatedHost {
/**
 * Use this data source to get information about an EC2 Dedicated Host.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getDedicatedHost.
 * 
 *
 * A collection of values returned by getDedicatedHost.
 * 
 */
    public static CompletableFuture<GetDedicatedHostResult> invokeAsync(@Nullable GetDedicatedHostArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getDedicatedHost:getDedicatedHost", TypeShape.of(GetDedicatedHostResult.class), args == null ? GetDedicatedHostArgs.Empty : args, Utilities.withVersion(options));
    }
}
