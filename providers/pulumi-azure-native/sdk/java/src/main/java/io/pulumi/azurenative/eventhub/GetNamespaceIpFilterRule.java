// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventhub.inputs.GetNamespaceIpFilterRuleArgs;
import io.pulumi.azurenative.eventhub.outputs.GetNamespaceIpFilterRuleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetNamespaceIpFilterRule {
/**
 * Single item in a List or Get IpFilterRules operation
 * API Version: 2018-01-01-preview.
 * 
 *
 * Single item in a List or Get IpFilterRules operation
 * 
 */
    public static CompletableFuture<GetNamespaceIpFilterRuleResult> invokeAsync(GetNamespaceIpFilterRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventhub:getNamespaceIpFilterRule", TypeShape.of(GetNamespaceIpFilterRuleResult.class), args == null ? GetNamespaceIpFilterRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
