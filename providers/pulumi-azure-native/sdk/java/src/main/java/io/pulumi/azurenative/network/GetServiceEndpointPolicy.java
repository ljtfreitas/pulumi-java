// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetServiceEndpointPolicyArgs;
import io.pulumi.azurenative.network.outputs.GetServiceEndpointPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServiceEndpointPolicy {
/**
 * Service End point policy resource.
 * API Version: 2020-11-01.
 * 
 *
 * Service End point policy resource.
 * 
 */
    public static CompletableFuture<GetServiceEndpointPolicyResult> invokeAsync(GetServiceEndpointPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getServiceEndpointPolicy", TypeShape.of(GetServiceEndpointPolicyResult.class), args == null ? GetServiceEndpointPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
