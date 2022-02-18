// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.inputs.GetContentKeyPolicyArgs;
import io.pulumi.azurenative.media.outputs.GetContentKeyPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetContentKeyPolicy {
/**
 * A Content Key Policy resource.
 * API Version: 2020-05-01.
 * 
 *
 * A Content Key Policy resource.
 * 
 */
    public static CompletableFuture<GetContentKeyPolicyResult> invokeAsync(GetContentKeyPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:getContentKeyPolicy", TypeShape.of(GetContentKeyPolicyResult.class), args == null ? GetContentKeyPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
