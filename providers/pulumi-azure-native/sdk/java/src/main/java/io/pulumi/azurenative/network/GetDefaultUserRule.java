// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.network.inputs.GetDefaultUserRuleArgs;
import io.pulumi.azurenative.network.outputs.GetDefaultUserRuleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDefaultUserRule {
/**
 * Network security default user rule.
 * API Version: 2021-02-01-preview.
 * 
 *
 * Network security default user rule.
 * 
 */
    public static CompletableFuture<GetDefaultUserRuleResult> invokeAsync(GetDefaultUserRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:network:getDefaultUserRule", TypeShape.of(GetDefaultUserRuleResult.class), args == null ? GetDefaultUserRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
