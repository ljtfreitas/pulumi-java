// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.managednetwork.inputs.GetManagedNetworkPeeringPolicyArgs;
import io.pulumi.azurenative.managednetwork.outputs.GetManagedNetworkPeeringPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetManagedNetworkPeeringPolicy {
/**
 * The Managed Network Peering Policy resource
 * API Version: 2019-06-01-preview.
 * 
 *
 * The Managed Network Peering Policy resource
 * 
 */
    public static CompletableFuture<GetManagedNetworkPeeringPolicyResult> invokeAsync(GetManagedNetworkPeeringPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:managednetwork:getManagedNetworkPeeringPolicy", TypeShape.of(GetManagedNetworkPeeringPolicyResult.class), args == null ? GetManagedNetworkPeeringPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
