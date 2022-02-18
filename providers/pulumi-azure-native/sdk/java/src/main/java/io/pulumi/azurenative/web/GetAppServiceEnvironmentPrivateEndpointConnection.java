// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetAppServiceEnvironmentPrivateEndpointConnectionArgs;
import io.pulumi.azurenative.web.outputs.GetAppServiceEnvironmentPrivateEndpointConnectionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAppServiceEnvironmentPrivateEndpointConnection {
/**
 * Remote Private Endpoint Connection ARM resource.
 * API Version: 2020-12-01.
 * 
 *
 * Remote Private Endpoint Connection ARM resource.
 * 
 */
    public static CompletableFuture<GetAppServiceEnvironmentPrivateEndpointConnectionResult> invokeAsync(GetAppServiceEnvironmentPrivateEndpointConnectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getAppServiceEnvironmentPrivateEndpointConnection", TypeShape.of(GetAppServiceEnvironmentPrivateEndpointConnectionResult.class), args == null ? GetAppServiceEnvironmentPrivateEndpointConnectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
