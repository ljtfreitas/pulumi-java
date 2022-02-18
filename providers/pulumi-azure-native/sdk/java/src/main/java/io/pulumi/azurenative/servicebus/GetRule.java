// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.servicebus.inputs.GetRuleArgs;
import io.pulumi.azurenative.servicebus.outputs.GetRuleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRule {
/**
 * Description of Rule Resource.
 * API Version: 2017-04-01.
 * 
 *
 * Description of Rule Resource.
 * 
 */
    public static CompletableFuture<GetRuleResult> invokeAsync(GetRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getRule", TypeShape.of(GetRuleResult.class), args == null ? GetRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
