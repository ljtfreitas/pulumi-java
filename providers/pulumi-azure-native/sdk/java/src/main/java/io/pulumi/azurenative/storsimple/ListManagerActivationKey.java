// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.inputs.ListManagerActivationKeyArgs;
import io.pulumi.azurenative.storsimple.outputs.ListManagerActivationKeyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListManagerActivationKey {
/**
 * The key.
 * API Version: 2017-06-01.
 * 
 *
 * The key.
 * 
 */
    public static CompletableFuture<ListManagerActivationKeyResult> invokeAsync(ListManagerActivationKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storsimple:listManagerActivationKey", TypeShape.of(ListManagerActivationKeyResult.class), args == null ? ListManagerActivationKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
