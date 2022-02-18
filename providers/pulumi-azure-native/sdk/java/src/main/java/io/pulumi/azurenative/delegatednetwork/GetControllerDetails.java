// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.delegatednetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.delegatednetwork.inputs.GetControllerDetailsArgs;
import io.pulumi.azurenative.delegatednetwork.outputs.GetControllerDetailsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetControllerDetails {
/**
 * Represents an instance of a DNC controller.
 * API Version: 2021-03-15.
 * 
 *
 * Represents an instance of a DNC controller.
 * 
 */
    public static CompletableFuture<GetControllerDetailsResult> invokeAsync(GetControllerDetailsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:delegatednetwork:getControllerDetails", TypeShape.of(GetControllerDetailsResult.class), args == null ? GetControllerDetailsArgs.Empty : args, Utilities.withVersion(options));
    }
}
