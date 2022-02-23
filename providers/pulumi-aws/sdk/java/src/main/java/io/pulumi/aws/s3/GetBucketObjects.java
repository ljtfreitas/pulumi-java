// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.s3.inputs.GetBucketObjectsArgs;
import io.pulumi.aws.s3.outputs.GetBucketObjectsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBucketObjects {
/**
 * > **NOTE on `max_keys`:** Retrieving very large numbers of keys can adversely affect this provider's performance.
 * 
 * The bucket-objects data source returns keys (i.e., file names) and other metadata about objects in an S3 bucket.
 * 
 *
 * A collection of arguments for invoking getBucketObjects.
 * 
 *
 * A collection of values returned by getBucketObjects.
 * 
 */
    public static CompletableFuture<GetBucketObjectsResult> invokeAsync(GetBucketObjectsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:s3/getBucketObjects:getBucketObjects", TypeShape.of(GetBucketObjectsResult.class), args == null ? GetBucketObjectsArgs.Empty : args, Utilities.withVersion(options));
    }
}