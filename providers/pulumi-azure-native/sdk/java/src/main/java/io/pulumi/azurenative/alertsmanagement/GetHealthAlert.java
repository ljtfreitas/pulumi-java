// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.alertsmanagement.inputs.GetHealthAlertArgs;
import io.pulumi.azurenative.alertsmanagement.outputs.GetHealthAlertResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetHealthAlert {
/**
 * The health alert resource.
 * API Version: 2020-08-04-preview.
 * 
 *
 * The health alert resource.
 * 
 */
    public static CompletableFuture<GetHealthAlertResult> invokeAsync(GetHealthAlertArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:alertsmanagement:getHealthAlert", TypeShape.of(GetHealthAlertResult.class), args == null ? GetHealthAlertArgs.Empty : args, Utilities.withVersion(options));
    }
}
