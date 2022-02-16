// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.organizations.inputs.GetFoldersArgs;
import io.pulumi.gcp.organizations.outputs.GetFoldersResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFolders {
    public static CompletableFuture<GetFoldersResult> invokeAsync(GetFoldersArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:organizations/getFolders:getFolders", TypeShape.of(GetFoldersResult.class), args == null ? GetFoldersArgs.Empty : args, Utilities.withVersion(options));
    }
}