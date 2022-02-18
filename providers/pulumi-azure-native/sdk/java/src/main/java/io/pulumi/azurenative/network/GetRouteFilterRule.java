// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetRouteFilterRuleArgs;
import io.pulumi.azurenative.network.outputs.GetRouteFilterRuleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRouteFilterRule {
/**
 * Route Filter Rule Resource.
 * API Version: 2020-11-01.
 * 
 *
 * Route Filter Rule Resource.
 * 
 */
    public static CompletableFuture<GetRouteFilterRuleResult> invokeAsync(GetRouteFilterRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getRouteFilterRule", TypeShape.of(GetRouteFilterRuleResult.class), args == null ? GetRouteFilterRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
