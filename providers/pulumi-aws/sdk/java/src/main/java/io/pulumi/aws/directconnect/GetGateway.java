// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.directconnect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.directconnect.inputs.GetGatewayArgs;
import io.pulumi.aws.directconnect.outputs.GetGatewayResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetGateway {
/**
 * Retrieve information about a Direct Connect Gateway.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getGateway.
 * 
 *
 * A collection of values returned by getGateway.
 * 
 */
    public static CompletableFuture<GetGatewayResult> invokeAsync(GetGatewayArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:directconnect/getGateway:getGateway", TypeShape.of(GetGatewayResult.class), args == null ? GetGatewayArgs.Empty : args, Utilities.withVersion(options));
    }
}
