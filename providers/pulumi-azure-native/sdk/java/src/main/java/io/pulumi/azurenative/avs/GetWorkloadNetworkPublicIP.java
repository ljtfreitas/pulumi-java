// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.avs.inputs.GetWorkloadNetworkPublicIPArgs;
import io.pulumi.azurenative.avs.outputs.GetWorkloadNetworkPublicIPResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkloadNetworkPublicIP {
/**
 * NSX Public IP Block
 * API Version: 2021-06-01.
 * 
 *
 * NSX Public IP Block
 * 
 */
    public static CompletableFuture<GetWorkloadNetworkPublicIPResult> invokeAsync(GetWorkloadNetworkPublicIPArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:avs:getWorkloadNetworkPublicIP", TypeShape.of(GetWorkloadNetworkPublicIPResult.class), args == null ? GetWorkloadNetworkPublicIPArgs.Empty : args, Utilities.withVersion(options));
    }
}
