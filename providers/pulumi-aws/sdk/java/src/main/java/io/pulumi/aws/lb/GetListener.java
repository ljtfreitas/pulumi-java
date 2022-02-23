// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.lb.inputs.GetListenerArgs;
import io.pulumi.aws.lb.outputs.GetListenerResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetListener {
/**
 * > **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
 * 
 * Provides information about a Load Balancer Listener.
 * 
 * This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getListener.
 * 
 *
 * A collection of values returned by getListener.
 * 
 */
    public static CompletableFuture<GetListenerResult> invokeAsync(@Nullable GetListenerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:lb/getListener:getListener", TypeShape.of(GetListenerResult.class), args == null ? GetListenerArgs.Empty : args, Utilities.withVersion(options));
    }
}
