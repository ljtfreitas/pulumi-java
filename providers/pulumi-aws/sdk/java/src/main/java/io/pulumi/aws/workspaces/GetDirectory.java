// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.workspaces.inputs.GetDirectoryArgs;
import io.pulumi.aws.workspaces.outputs.GetDirectoryResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDirectory {
/**
 * Retrieve information about an AWS WorkSpaces directory.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getDirectory.
 * 
 *
 * A collection of values returned by getDirectory.
 * 
 */
    public static CompletableFuture<GetDirectoryResult> invokeAsync(GetDirectoryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:workspaces/getDirectory:getDirectory", TypeShape.of(GetDirectoryResult.class), args == null ? GetDirectoryArgs.Empty : args, Utilities.withVersion(options));
    }
}
