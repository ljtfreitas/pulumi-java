// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.inputs.GetRegistryCredentialsArgs;
import io.pulumi.azurenative.containerregistry.outputs.GetRegistryCredentialsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegistryCredentials {
/**
 * The result of a request to get the administrator login credentials for a container registry.
 * API Version: 2016-06-27-preview.
 * 
 *
 * The result of a request to get the administrator login credentials for a container registry.
 * 
 */
    public static CompletableFuture<GetRegistryCredentialsResult> invokeAsync(GetRegistryCredentialsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getRegistryCredentials", TypeShape.of(GetRegistryCredentialsResult.class), args == null ? GetRegistryCredentialsArgs.Empty : args, Utilities.withVersion(options));
    }
}
