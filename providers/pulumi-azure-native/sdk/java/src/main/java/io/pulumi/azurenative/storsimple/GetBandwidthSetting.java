// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.storsimple.inputs.GetBandwidthSettingArgs;
import io.pulumi.azurenative.storsimple.outputs.GetBandwidthSettingResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetBandwidthSetting {
/**
 * The bandwidth setting.
 * API Version: 2017-06-01.
 * 
 *
 * The bandwidth setting.
 * 
 */
    public static CompletableFuture<GetBandwidthSettingResult> invokeAsync(GetBandwidthSettingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storsimple:getBandwidthSetting", TypeShape.of(GetBandwidthSettingResult.class), args == null ? GetBandwidthSettingArgs.Empty : args, Utilities.withVersion(options));
    }
}
