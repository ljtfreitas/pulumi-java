// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appplatform.inputs.GetDeploymentLogFileUrlArgs;
import io.pulumi.azurenative.appplatform.outputs.GetDeploymentLogFileUrlResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDeploymentLogFileUrl {
/**
 * Log file URL payload
 * API Version: 2020-07-01.
 * 
 *
 * Log file URL payload
 * 
 */
    public static CompletableFuture<GetDeploymentLogFileUrlResult> invokeAsync(GetDeploymentLogFileUrlArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appplatform:getDeploymentLogFileUrl", TypeShape.of(GetDeploymentLogFileUrlResult.class), args == null ? GetDeploymentLogFileUrlArgs.Empty : args, Utilities.withVersion(options));
    }
}
