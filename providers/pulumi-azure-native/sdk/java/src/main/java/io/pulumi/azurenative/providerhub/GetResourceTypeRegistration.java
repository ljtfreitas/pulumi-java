// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.providerhub.inputs.GetResourceTypeRegistrationArgs;
import io.pulumi.azurenative.providerhub.outputs.GetResourceTypeRegistrationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResourceTypeRegistration {
/**
 * API Version: 2020-11-20.
 * 
 */
    public static CompletableFuture<GetResourceTypeRegistrationResult> invokeAsync(GetResourceTypeRegistrationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:providerhub:getResourceTypeRegistration", TypeShape.of(GetResourceTypeRegistrationResult.class), args == null ? GetResourceTypeRegistrationArgs.Empty : args, Utilities.withVersion(options));
    }
}
