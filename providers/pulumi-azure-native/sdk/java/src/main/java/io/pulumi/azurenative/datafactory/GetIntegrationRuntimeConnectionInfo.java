// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datafactory.inputs.GetIntegrationRuntimeConnectionInfoArgs;
import io.pulumi.azurenative.datafactory.outputs.GetIntegrationRuntimeConnectionInfoResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIntegrationRuntimeConnectionInfo {
/**
 * Connection information for encrypting the on-premises data source credentials.
 * API Version: 2018-06-01.
 * 
 *
 * Connection information for encrypting the on-premises data source credentials.
 * 
 */
    public static CompletableFuture<GetIntegrationRuntimeConnectionInfoResult> invokeAsync(GetIntegrationRuntimeConnectionInfoArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datafactory:getIntegrationRuntimeConnectionInfo", TypeShape.of(GetIntegrationRuntimeConnectionInfoResult.class), args == null ? GetIntegrationRuntimeConnectionInfoArgs.Empty : args, Utilities.withVersion(options));
    }
}
