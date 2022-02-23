// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetLocalGatewayRouteTablesArgs;
import io.pulumi.aws.ec2.outputs.GetLocalGatewayRouteTablesResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetLocalGatewayRouteTables {
/**
 * Provides information for multiple EC2 Local Gateway Route Tables, such as their identifiers.
 * 
 *
 * A collection of arguments for invoking getLocalGatewayRouteTables.
 * 
 *
 * A collection of values returned by getLocalGatewayRouteTables.
 * 
 */
    public static CompletableFuture<GetLocalGatewayRouteTablesResult> invokeAsync(@Nullable GetLocalGatewayRouteTablesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getLocalGatewayRouteTables:getLocalGatewayRouteTables", TypeShape.of(GetLocalGatewayRouteTablesResult.class), args == null ? GetLocalGatewayRouteTablesArgs.Empty : args, Utilities.withVersion(options));
    }
}