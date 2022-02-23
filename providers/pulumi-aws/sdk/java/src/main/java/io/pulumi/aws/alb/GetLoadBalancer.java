// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.alb.inputs.GetLoadBalancerArgs;
import io.pulumi.aws.alb.outputs.GetLoadBalancerResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLoadBalancer {
/**
 * > **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
 * 
 * Provides information about a Load Balancer.
 * 
 * This data source can prove useful when a module accepts an LB as an input
 * variable and needs to, for example, determine the security groups associated
 * with it, etc.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getLoadBalancer.
 * 
 *
 * A collection of values returned by getLoadBalancer.
 * 
 */
    public static CompletableFuture<GetLoadBalancerResult> invokeAsync(@Nullable GetLoadBalancerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:alb/getLoadBalancer:getLoadBalancer", TypeShape.of(GetLoadBalancerResult.class), args == null ? GetLoadBalancerArgs.Empty : args, Utilities.withVersion(options));
    }
}
