// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListStaticSiteBuildFunctionAppSettingsArgs;
import io.pulumi.azurenative.web.outputs.ListStaticSiteBuildFunctionAppSettingsResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListStaticSiteBuildFunctionAppSettings {
    public static CompletableFuture<ListStaticSiteBuildFunctionAppSettingsResult> invokeAsync(ListStaticSiteBuildFunctionAppSettingsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listStaticSiteBuildFunctionAppSettings", TypeShape.of(ListStaticSiteBuildFunctionAppSettingsResult.class), args == null ? ListStaticSiteBuildFunctionAppSettingsArgs.Empty : args, Utilities.withVersion(options));
    }
}