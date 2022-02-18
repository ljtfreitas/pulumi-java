// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerregistry.inputs.GetTokenArgs;
import io.pulumi.azurenative.containerregistry.outputs.GetTokenResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetToken {
/**
 * An object that represents a token for a container registry.
 * API Version: 2020-11-01-preview.
 * 
 *
 * An object that represents a token for a container registry.
 * 
 */
    public static CompletableFuture<GetTokenResult> invokeAsync(GetTokenArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerregistry:getToken", TypeShape.of(GetTokenResult.class), args == null ? GetTokenArgs.Empty : args, Utilities.withVersion(options));
    }
}
