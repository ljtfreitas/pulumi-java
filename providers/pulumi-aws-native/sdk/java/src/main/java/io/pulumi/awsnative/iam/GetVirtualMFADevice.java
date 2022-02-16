// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iam;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.iam.inputs.GetVirtualMFADeviceArgs;
import io.pulumi.awsnative.iam.outputs.GetVirtualMFADeviceResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVirtualMFADevice {
    public static CompletableFuture<GetVirtualMFADeviceResult> invokeAsync(GetVirtualMFADeviceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iam:getVirtualMFADevice", TypeShape.of(GetVirtualMFADeviceResult.class), args == null ? GetVirtualMFADeviceArgs.Empty : args, Utilities.withVersion(options));
    }
}