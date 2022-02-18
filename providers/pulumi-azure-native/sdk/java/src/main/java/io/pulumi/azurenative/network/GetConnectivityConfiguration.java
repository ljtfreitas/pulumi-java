// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetConnectivityConfigurationArgs;
import io.pulumi.azurenative.network.outputs.GetConnectivityConfigurationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConnectivityConfiguration {
/**
 * The network manager connectivity configuration resource
 * API Version: 2021-02-01-preview.
 * 
 *
 * The network manager connectivity configuration resource
 * 
 */
    public static CompletableFuture<GetConnectivityConfigurationResult> invokeAsync(GetConnectivityConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getConnectivityConfiguration", TypeShape.of(GetConnectivityConfigurationResult.class), args == null ? GetConnectivityConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
