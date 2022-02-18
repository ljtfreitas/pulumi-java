// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.inputs.GetManagerDevicePublicEncryptionKeyArgs;
import io.pulumi.azurenative.storsimple.outputs.GetManagerDevicePublicEncryptionKeyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetManagerDevicePublicEncryptionKey {
/**
 * The public key.
 * API Version: 2017-06-01.
 * 
 *
 * The public key.
 * 
 */
    public static CompletableFuture<GetManagerDevicePublicEncryptionKeyResult> invokeAsync(GetManagerDevicePublicEncryptionKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storsimple:getManagerDevicePublicEncryptionKey", TypeShape.of(GetManagerDevicePublicEncryptionKeyResult.class), args == null ? GetManagerDevicePublicEncryptionKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
