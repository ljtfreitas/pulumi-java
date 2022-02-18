// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetApiTagDescriptionArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetApiTagDescriptionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetApiTagDescription {
/**
 * Contract details.
 * API Version: 2020-12-01.
 * 
 *
 * Contract details.
 * 
 */
    public static CompletableFuture<GetApiTagDescriptionResult> invokeAsync(GetApiTagDescriptionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getApiTagDescription", TypeShape.of(GetApiTagDescriptionResult.class), args == null ? GetApiTagDescriptionArgs.Empty : args, Utilities.withVersion(options));
    }
}
