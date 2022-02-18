// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.inputs.GetIoTRoleArgs;
import io.pulumi.azurenative.databoxedge.outputs.GetIoTRoleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIoTRole {
/**
 * Compute role.
 * API Version: 2020-12-01.
 * 
 *
 * Compute role.
 * 
 */
    public static CompletableFuture<GetIoTRoleResult> invokeAsync(GetIoTRoleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getIoTRole", TypeShape.of(GetIoTRoleResult.class), args == null ? GetIoTRoleArgs.Empty : args, Utilities.withVersion(options));
    }
}
