// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.GetMachineExtensionArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.GetMachineExtensionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetMachineExtension {
/**
 * Describes a Machine Extension.
 * API Version: 2020-10-01-preview.
 * 
 *
 * Describes a Machine Extension.
 * 
 */
    public static CompletableFuture<GetMachineExtensionResult> invokeAsync(GetMachineExtensionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getMachineExtension", TypeShape.of(GetMachineExtensionResult.class), args == null ? GetMachineExtensionArgs.Empty : args, Utilities.withVersion(options));
    }
}
