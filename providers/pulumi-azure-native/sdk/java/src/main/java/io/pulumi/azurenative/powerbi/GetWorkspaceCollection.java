// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbi;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.powerbi.inputs.GetWorkspaceCollectionArgs;
import io.pulumi.azurenative.powerbi.outputs.GetWorkspaceCollectionResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWorkspaceCollection {
    public static CompletableFuture<GetWorkspaceCollectionResult> invokeAsync(GetWorkspaceCollectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:powerbi:getWorkspaceCollection", TypeShape.of(GetWorkspaceCollectionResult.class), args == null ? GetWorkspaceCollectionArgs.Empty : args, Utilities.withVersion(options));
    }
}