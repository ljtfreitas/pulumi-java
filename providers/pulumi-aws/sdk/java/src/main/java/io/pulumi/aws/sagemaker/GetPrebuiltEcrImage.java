// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sagemaker.inputs.GetPrebuiltEcrImageArgs;
import io.pulumi.aws.sagemaker.outputs.GetPrebuiltEcrImageResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrebuiltEcrImage {
/**
 * Get information about prebuilt Amazon SageMaker Docker images.
 * 
 * > **NOTE:** The AWS provider creates a validly constructed `registry_path` but does not verify that the `registry_path` corresponds to an existing image. For example, using a `registry_path` containing an `image_tag` that does not correspond to a Docker image in the ECR repository, will result in an error.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getPrebuiltEcrImage.
 * 
 *
 * A collection of values returned by getPrebuiltEcrImage.
 * 
 */
    public static CompletableFuture<GetPrebuiltEcrImageResult> invokeAsync(GetPrebuiltEcrImageArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:sagemaker/getPrebuiltEcrImage:getPrebuiltEcrImage", TypeShape.of(GetPrebuiltEcrImageResult.class), args == null ? GetPrebuiltEcrImageArgs.Empty : args, Utilities.withVersion(options));
    }
}
