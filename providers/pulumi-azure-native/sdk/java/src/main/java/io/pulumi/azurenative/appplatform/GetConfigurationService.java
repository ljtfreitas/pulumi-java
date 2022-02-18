// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.inputs.GetConfigurationServiceArgs;
import io.pulumi.azurenative.appplatform.outputs.GetConfigurationServiceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConfigurationService {
/**
 * Application Configuration Service resource
 * API Version: 2022-01-01-preview.
 * 
 *
 * Application Configuration Service resource
 * 
 */
    public static CompletableFuture<GetConfigurationServiceResult> invokeAsync(GetConfigurationServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getConfigurationService", TypeShape.of(GetConfigurationServiceResult.class), args == null ? GetConfigurationServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}
