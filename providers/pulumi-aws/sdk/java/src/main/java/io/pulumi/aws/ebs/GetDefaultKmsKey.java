// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ebs.outputs.GetDefaultKmsKeyResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDefaultKmsKey {
/**
 * Use this data source to get the default EBS encryption KMS key in the current region.
 * 
 * ## Example Usage
 * 
 *
 * A collection of values returned by getDefaultKmsKey.
 * 
 */
    public static CompletableFuture<GetDefaultKmsKeyResult> invokeAsync(@Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ebs/getDefaultKmsKey:getDefaultKmsKey", TypeShape.of(GetDefaultKmsKeyResult.class), io.pulumi.resources.InvokeArgs.Empty, Utilities.withVersion(options));
    }
}