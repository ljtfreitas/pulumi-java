// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.inputs.GetShareArgs;
import io.pulumi.azurenative.datashare.outputs.GetShareResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetShare {
/**
 * A share data transfer object.
 * API Version: 2020-09-01.
 * 
 *
 * A share data transfer object.
 * 
 */
    public static CompletableFuture<GetShareResult> invokeAsync(GetShareArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datashare:getShare", TypeShape.of(GetShareResult.class), args == null ? GetShareArgs.Empty : args, Utilities.withVersion(options));
    }
}
