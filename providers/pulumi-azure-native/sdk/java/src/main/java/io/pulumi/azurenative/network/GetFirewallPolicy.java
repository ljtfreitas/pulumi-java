// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetFirewallPolicyArgs;
import io.pulumi.azurenative.network.outputs.GetFirewallPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFirewallPolicy {
/**
 * FirewallPolicy Resource.
 * API Version: 2020-11-01.
 * 
 *
 * FirewallPolicy Resource.
 * 
 */
    public static CompletableFuture<GetFirewallPolicyResult> invokeAsync(GetFirewallPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getFirewallPolicy", TypeShape.of(GetFirewallPolicyResult.class), args == null ? GetFirewallPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
