// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.iam.inputs.GetUsersArgs;
import io.pulumi.aws.iam.outputs.GetUsersResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetUsers {
/**
 * Use this data source to get the ARNs and Names of IAM Users.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getUsers.
 * 
 *
 * A collection of values returned by getUsers.
 * 
 */
    public static CompletableFuture<GetUsersResult> invokeAsync(@Nullable GetUsersArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:iam/getUsers:getUsers", TypeShape.of(GetUsersResult.class), args == null ? GetUsersArgs.Empty : args, Utilities.withVersion(options));
    }
}
