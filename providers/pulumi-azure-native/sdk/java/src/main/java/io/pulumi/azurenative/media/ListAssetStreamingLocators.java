// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.inputs.ListAssetStreamingLocatorsArgs;
import io.pulumi.azurenative.media.outputs.ListAssetStreamingLocatorsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListAssetStreamingLocators {
/**
 * The Streaming Locators associated with this Asset.
 * API Version: 2020-05-01.
 * 
 *
 * The Streaming Locators associated with this Asset.
 * 
 */
    public static CompletableFuture<ListAssetStreamingLocatorsResult> invokeAsync(ListAssetStreamingLocatorsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:listAssetStreamingLocators", TypeShape.of(ListAssetStreamingLocatorsResult.class), args == null ? ListAssetStreamingLocatorsArgs.Empty : args, Utilities.withVersion(options));
    }
}
