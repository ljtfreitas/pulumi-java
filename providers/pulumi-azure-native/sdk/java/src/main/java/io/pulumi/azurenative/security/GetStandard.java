// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.inputs.GetStandardArgs;
import io.pulumi.azurenative.security.outputs.GetStandardResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetStandard {
    public static CompletableFuture<GetStandardResult> invokeAsync(GetStandardArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:security:getStandard", TypeShape.of(GetStandardResult.class), args == null ? GetStandardArgs.Empty : args, Utilities.withVersion(options));
    }
}