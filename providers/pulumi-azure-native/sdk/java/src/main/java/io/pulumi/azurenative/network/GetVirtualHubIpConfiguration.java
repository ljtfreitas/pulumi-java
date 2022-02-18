// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetVirtualHubIpConfigurationArgs;
import io.pulumi.azurenative.network.outputs.GetVirtualHubIpConfigurationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetVirtualHubIpConfiguration {
/**
 * IpConfigurations.
 * API Version: 2020-11-01.
 * 
 *
 * IpConfigurations.
 * 
 */
    public static CompletableFuture<GetVirtualHubIpConfigurationResult> invokeAsync(GetVirtualHubIpConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getVirtualHubIpConfiguration", TypeShape.of(GetVirtualHubIpConfigurationResult.class), args == null ? GetVirtualHubIpConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
