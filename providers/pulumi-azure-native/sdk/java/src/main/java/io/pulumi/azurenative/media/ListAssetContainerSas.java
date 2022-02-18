// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.inputs.ListAssetContainerSasArgs;
import io.pulumi.azurenative.media.outputs.ListAssetContainerSasResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListAssetContainerSas {
/**
 * The Asset Storage container SAS URLs.
 * API Version: 2020-05-01.
 * 
 *
 * The Asset Storage container SAS URLs.
 * 
 */
    public static CompletableFuture<ListAssetContainerSasResult> invokeAsync(ListAssetContainerSasArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:listAssetContainerSas", TypeShape.of(ListAssetContainerSasResult.class), args == null ? ListAssetContainerSasArgs.Empty : args, Utilities.withVersion(options));
    }
}
