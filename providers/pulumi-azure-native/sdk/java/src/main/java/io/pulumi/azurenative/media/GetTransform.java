// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.inputs.GetTransformArgs;
import io.pulumi.azurenative.media.outputs.GetTransformResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetTransform {
/**
 * A Transform encapsulates the rules or instructions for generating desired outputs from input media, such as by transcoding or by extracting insights. After the Transform is created, it can be applied to input media by creating Jobs.
 * API Version: 2020-05-01.
 * 
 *
 * A Transform encapsulates the rules or instructions for generating desired outputs from input media, such as by transcoding or by extracting insights. After the Transform is created, it can be applied to input media by creating Jobs.
 * 
 */
    public static CompletableFuture<GetTransformResult> invokeAsync(GetTransformArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getTransform", TypeShape.of(GetTransformResult.class), args == null ? GetTransformArgs.Empty : args, Utilities.withVersion(options));
    }
}
