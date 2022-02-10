// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.costmanagement.inputs.GetViewArgs;
import io.pulumi.azurenative.costmanagement.outputs.GetViewResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetView {
    public static CompletableFuture<GetViewResult> invokeAsync(GetViewArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:costmanagement:getView", TypeShape.of(GetViewResult.class), args == null ? GetViewArgs.Empty : args, Utilities.withVersion(options));
    }
}