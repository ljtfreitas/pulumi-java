// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sagemaker.inputs.GetPrebuiltEcrImageArgs;
import com.pulumi.aws.sagemaker.outputs.GetPrebuiltEcrImageResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SagemakerFunctions {
    /**
     * Get information about prebuilt Amazon SageMaker Docker images.
     * 
     * &gt; **NOTE:** The AWS provider creates a validly constructed `registry_path` but does not verify that the `registry_path` corresponds to an existing image. For example, using a `registry_path` containing an `image_tag` that does not correspond to a Docker image in the ECR repository, will result in an error.
     * 
     * ## Example Usage
     * 
     * Basic usage:
     * ```java
     * package generated_program;
     * 
     * import java.util.*;
     * import java.io.*;
     * import java.nio.*;
     * import com.pulumi.*;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var test = Output.of(SagemakerFunctions.getPrebuiltEcrImage(GetPrebuiltEcrImageArgs.builder()
     *             .imageTag(&#34;2.2-1.0.11.0&#34;)
     *             .repositoryName(&#34;sagemaker-scikit-learn&#34;)
     *             .build()));
     * 
     *         }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetPrebuiltEcrImageResult> getPrebuiltEcrImage(GetPrebuiltEcrImageArgs args) {
        return getPrebuiltEcrImage(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrebuiltEcrImageResult> getPrebuiltEcrImage(GetPrebuiltEcrImageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:sagemaker/getPrebuiltEcrImage:getPrebuiltEcrImage", TypeShape.of(GetPrebuiltEcrImageResult.class), args, Utilities.withVersion(options));
    }
}
