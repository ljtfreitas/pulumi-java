// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetSecurityAdminConfigurationArgs;
import io.pulumi.azurenative.network.outputs.GetSecurityAdminConfigurationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSecurityAdminConfiguration {
/**
 * Defines the security configuration
 * API Version: 2021-02-01-preview.
 * 
 *
 * Defines the security configuration
 * 
 */
    public static CompletableFuture<GetSecurityAdminConfigurationResult> invokeAsync(GetSecurityAdminConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getSecurityAdminConfiguration", TypeShape.of(GetSecurityAdminConfigurationResult.class), args == null ? GetSecurityAdminConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
