// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.inputs.GetCustomDomainArgs;
import io.pulumi.azurenative.appplatform.outputs.GetCustomDomainResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCustomDomain {
/**
 * Custom domain resource payload.
 * API Version: 2020-07-01.
 * 
 *
 * Custom domain resource payload.
 * 
 */
    public static CompletableFuture<GetCustomDomainResult> invokeAsync(GetCustomDomainArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getCustomDomain", TypeShape.of(GetCustomDomainResult.class), args == null ? GetCustomDomainArgs.Empty : args, Utilities.withVersion(options));
    }
}
