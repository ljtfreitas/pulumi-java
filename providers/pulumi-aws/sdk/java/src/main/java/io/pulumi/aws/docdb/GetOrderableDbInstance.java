// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.docdb;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.docdb.inputs.GetOrderableDbInstanceArgs;
import io.pulumi.aws.docdb.outputs.GetOrderableDbInstanceResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrderableDbInstance {
/**
 * Information about DocumentDB orderable DB instances.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getOrderableDbInstance.
 * 
 *
 * A collection of values returned by getOrderableDbInstance.
 * 
 */
    public static CompletableFuture<GetOrderableDbInstanceResult> invokeAsync(@Nullable GetOrderableDbInstanceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:docdb/getOrderableDbInstance:getOrderableDbInstance", TypeShape.of(GetOrderableDbInstanceResult.class), args == null ? GetOrderableDbInstanceArgs.Empty : args, Utilities.withVersion(options));
    }
}
