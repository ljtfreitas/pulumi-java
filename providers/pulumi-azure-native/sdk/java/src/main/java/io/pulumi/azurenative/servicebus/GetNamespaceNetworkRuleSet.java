// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicebus.inputs.GetNamespaceNetworkRuleSetArgs;
import io.pulumi.azurenative.servicebus.outputs.GetNamespaceNetworkRuleSetResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNamespaceNetworkRuleSet {
/**
 * Description of NetworkRuleSet resource.
 * API Version: 2017-04-01.
 * 
 *
 * Description of NetworkRuleSet resource.
 * 
 */
    public static CompletableFuture<GetNamespaceNetworkRuleSetResult> invokeAsync(GetNamespaceNetworkRuleSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getNamespaceNetworkRuleSet", TypeShape.of(GetNamespaceNetworkRuleSetResult.class), args == null ? GetNamespaceNetworkRuleSetArgs.Empty : args, Utilities.withVersion(options));
    }
}
