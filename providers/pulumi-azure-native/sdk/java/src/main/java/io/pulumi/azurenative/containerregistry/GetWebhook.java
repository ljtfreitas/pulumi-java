// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.inputs.GetWebhookArgs;
import io.pulumi.azurenative.containerregistry.outputs.GetWebhookResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebhook {
/**
 * An object that represents a webhook for a container registry.
 * API Version: 2019-05-01.
 * 
 *
 * An object that represents a webhook for a container registry.
 * 
 */
    public static CompletableFuture<GetWebhookResult> invokeAsync(GetWebhookArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getWebhook", TypeShape.of(GetWebhookResult.class), args == null ? GetWebhookArgs.Empty : args, Utilities.withVersion(options));
    }
}
