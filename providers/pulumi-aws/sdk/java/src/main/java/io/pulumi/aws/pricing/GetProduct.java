// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.pricing;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.pricing.inputs.GetProductArgs;
import io.pulumi.aws.pricing.outputs.GetProductResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProduct {
/**
 * Use this data source to get the pricing information of all products in AWS.
 * This data source is only available in a us-east-1 or ap-south-1 provider.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getProduct.
 * 
 *
 * A collection of values returned by getProduct.
 * 
 */
    public static CompletableFuture<GetProductResult> invokeAsync(GetProductArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:pricing/getProduct:getProduct", TypeShape.of(GetProductResult.class), args == null ? GetProductArgs.Empty : args, Utilities.withVersion(options));
    }
}
