// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.GetPropertyArgs;
import io.pulumi.azurenative.apimanagement.outputs.GetPropertyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProperty {
/**
 * Property details.
 * API Version: 2019-01-01.
 * 
 *
 * Property details.
 * 
 */
    public static CompletableFuture<GetPropertyResult> invokeAsync(GetPropertyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:getProperty", TypeShape.of(GetPropertyResult.class), args == null ? GetPropertyArgs.Empty : args, Utilities.withVersion(options));
    }
}
