// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetInstancesArgs;
import io.pulumi.aws.ec2.outputs.GetInstancesResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInstances {
/**
 * Use this data source to get IDs or IPs of Amazon EC2 instances to be referenced elsewhere,
 * e.g., to allow easier migration from another management solution
 * or to make it easier for an operator to connect through bastion host(s).
 * 
 * > **Note:** It's strongly discouraged to use this data source for querying ephemeral
 * instances (e.g., managed via autoscaling group), as the output may change at any time
 * and you'd need to re-run `apply` every time an instance comes up or dies.
 * 
 *
 * A collection of arguments for invoking getInstances.
 * 
 *
 * A collection of values returned by getInstances.
 * 
 */
    public static CompletableFuture<GetInstancesResult> invokeAsync(@Nullable GetInstancesArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getInstances:getInstances", TypeShape.of(GetInstancesResult.class), args == null ? GetInstancesArgs.Empty : args, Utilities.withVersion(options));
    }
}
