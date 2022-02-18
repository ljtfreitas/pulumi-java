// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.resources.inputs.GetDeploymentAtTenantScopeArgs;
import io.pulumi.azurenative.resources.outputs.GetDeploymentAtTenantScopeResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDeploymentAtTenantScope {
/**
 * Deployment information.
 * API Version: 2021-01-01.
 * 
 *
 * Deployment information.
 * 
 */
    public static CompletableFuture<GetDeploymentAtTenantScopeResult> invokeAsync(GetDeploymentAtTenantScopeArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:resources:getDeploymentAtTenantScope", TypeShape.of(GetDeploymentAtTenantScopeResult.class), args == null ? GetDeploymentAtTenantScopeArgs.Empty : args, Utilities.withVersion(options));
    }
}
