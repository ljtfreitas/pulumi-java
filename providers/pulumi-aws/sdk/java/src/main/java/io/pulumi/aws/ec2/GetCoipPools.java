// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetCoipPoolsArgs;
import io.pulumi.aws.ec2.outputs.GetCoipPoolsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCoipPools {
/**
 * Provides information for multiple EC2 Customer-Owned IP Pools, such as their identifiers.
 * 
 *
 * A collection of arguments for invoking getCoipPools.
 * 
 *
 * A collection of values returned by getCoipPools.
 * 
 */
    public static CompletableFuture<GetCoipPoolsResult> invokeAsync(@Nullable GetCoipPoolsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getCoipPools:getCoipPools", TypeShape.of(GetCoipPoolsResult.class), args == null ? GetCoipPoolsArgs.Empty : args, Utilities.withVersion(options));
    }
}
