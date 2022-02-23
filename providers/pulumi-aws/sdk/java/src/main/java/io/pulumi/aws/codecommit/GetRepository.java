// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codecommit;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codecommit.inputs.GetRepositoryArgs;
import io.pulumi.aws.codecommit.outputs.GetRepositoryResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRepository {
/**
 * The CodeCommit Repository data source allows the ARN, Repository ID, Repository URL for HTTP and Repository URL for SSH to be retrieved for an CodeCommit repository.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getRepository.
 * 
 *
 * A collection of values returned by getRepository.
 * 
 */
    public static CompletableFuture<GetRepositoryResult> invokeAsync(GetRepositoryArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:codecommit/getRepository:getRepository", TypeShape.of(GetRepositoryResult.class), args == null ? GetRepositoryArgs.Empty : args, Utilities.withVersion(options));
    }
}
