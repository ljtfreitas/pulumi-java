// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridcompute.inputs.GetMachineExtensionArgs;
import io.pulumi.azurenative.hybridcompute.outputs.GetMachineExtensionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMachineExtension {
    public static CompletableFuture<GetMachineExtensionResult> invokeAsync(GetMachineExtensionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybridcompute:getMachineExtension", TypeShape.of(GetMachineExtensionResult.class), args == null ? GetMachineExtensionArgs.Empty : args, Utilities.withVersion(options));
    }
}