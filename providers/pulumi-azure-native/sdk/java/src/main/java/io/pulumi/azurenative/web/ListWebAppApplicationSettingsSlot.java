// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.ListWebAppApplicationSettingsSlotArgs;
import io.pulumi.azurenative.web.outputs.ListWebAppApplicationSettingsSlotResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListWebAppApplicationSettingsSlot {
/**
 * String dictionary resource.
 * API Version: 2020-12-01.
 * 
 *
 * String dictionary resource.
 * 
 */
    public static CompletableFuture<ListWebAppApplicationSettingsSlotResult> invokeAsync(ListWebAppApplicationSettingsSlotArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:listWebAppApplicationSettingsSlot", TypeShape.of(ListWebAppApplicationSettingsSlotResult.class), args == null ? ListWebAppApplicationSettingsSlotArgs.Empty : args, Utilities.withVersion(options));
    }
}
