// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.devices.inputs.ListIotHubResourceKeysArgs;
import io.pulumi.azurenative.devices.outputs.ListIotHubResourceKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListIotHubResourceKeys {
/**
 * The list of shared access policies with a next link.
 * API Version: 2020-08-31.
 * 
 *
 * The list of shared access policies with a next link.
 * 
 */
    public static CompletableFuture<ListIotHubResourceKeysResult> invokeAsync(ListIotHubResourceKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:devices:listIotHubResourceKeys", TypeShape.of(ListIotHubResourceKeysResult.class), args == null ? ListIotHubResourceKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
