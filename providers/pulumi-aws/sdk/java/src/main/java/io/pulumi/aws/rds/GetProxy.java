// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.rds.inputs.GetProxyArgs;
import io.pulumi.aws.rds.outputs.GetProxyResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProxy {
/**
 * Use this data source to get information about a DB Proxy.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getProxy.
 * 
 *
 * A collection of values returned by getProxy.
 * 
 */
    public static CompletableFuture<GetProxyResult> invokeAsync(GetProxyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:rds/getProxy:getProxy", TypeShape.of(GetProxyResult.class), args == null ? GetProxyArgs.Empty : args, Utilities.withVersion(options));
    }
}
