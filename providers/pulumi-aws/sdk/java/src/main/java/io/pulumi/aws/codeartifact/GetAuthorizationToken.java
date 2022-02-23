// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codeartifact;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codeartifact.inputs.GetAuthorizationTokenArgs;
import io.pulumi.aws.codeartifact.outputs.GetAuthorizationTokenResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAuthorizationToken {
/**
 * The CodeArtifact Authorization Token data source generates a temporary authentication token for accessing repositories in a CodeArtifact domain.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getAuthorizationToken.
 * 
 *
 * A collection of values returned by getAuthorizationToken.
 * 
 */
    public static CompletableFuture<GetAuthorizationTokenResult> invokeAsync(GetAuthorizationTokenArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:codeartifact/getAuthorizationToken:getAuthorizationToken", TypeShape.of(GetAuthorizationTokenResult.class), args == null ? GetAuthorizationTokenArgs.Empty : args, Utilities.withVersion(options));
    }
}
