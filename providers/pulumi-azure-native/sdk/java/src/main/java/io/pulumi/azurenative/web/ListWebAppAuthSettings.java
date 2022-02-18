// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListWebAppAuthSettingsArgs;
import io.pulumi.azurenative.web.outputs.ListWebAppAuthSettingsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWebAppAuthSettings {
/**
 * Configuration settings for the Azure App Service Authentication / Authorization feature.
 * API Version: 2020-12-01.
 * 
 *
 * Configuration settings for the Azure App Service Authentication / Authorization feature.
 * 
 */
    public static CompletableFuture<ListWebAppAuthSettingsResult> invokeAsync(ListWebAppAuthSettingsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listWebAppAuthSettings", TypeShape.of(ListWebAppAuthSettingsResult.class), args == null ? ListWebAppAuthSettingsArgs.Empty : args, Utilities.withVersion(options));
    }
}
