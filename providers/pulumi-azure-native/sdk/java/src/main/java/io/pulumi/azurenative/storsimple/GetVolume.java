// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.inputs.GetVolumeArgs;
import io.pulumi.azurenative.storsimple.outputs.GetVolumeResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVolume {
/**
 * The volume.
 * API Version: 2017-06-01.
 * 
 *
 * The volume.
 * 
 */
    public static CompletableFuture<GetVolumeResult> invokeAsync(GetVolumeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storsimple:getVolume", TypeShape.of(GetVolumeResult.class), args == null ? GetVolumeArgs.Empty : args, Utilities.withVersion(options));
    }
}
