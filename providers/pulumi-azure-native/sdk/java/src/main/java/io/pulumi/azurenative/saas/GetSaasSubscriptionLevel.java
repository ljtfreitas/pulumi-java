// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.saas;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.saas.inputs.GetSaasSubscriptionLevelArgs;
import io.pulumi.azurenative.saas.outputs.GetSaasSubscriptionLevelResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSaasSubscriptionLevel {
/**
 * SaaS REST API resource definition.
 * API Version: 2018-03-01-beta.
 * 
 *
 * SaaS REST API resource definition.
 * 
 */
    public static CompletableFuture<GetSaasSubscriptionLevelResult> invokeAsync(GetSaasSubscriptionLevelArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:saas:getSaasSubscriptionLevel", TypeShape.of(GetSaasSubscriptionLevelResult.class), args == null ? GetSaasSubscriptionLevelArgs.Empty : args, Utilities.withVersion(options));
    }
}
