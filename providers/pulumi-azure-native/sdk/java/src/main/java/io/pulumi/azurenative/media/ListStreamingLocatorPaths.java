// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.inputs.ListStreamingLocatorPathsArgs;
import io.pulumi.azurenative.media.outputs.ListStreamingLocatorPathsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListStreamingLocatorPaths {
/**
 * Class of response for listPaths action
 * API Version: 2020-05-01.
 * 
 *
 * Class of response for listPaths action
 * 
 */
    public static CompletableFuture<ListStreamingLocatorPathsResult> invokeAsync(ListStreamingLocatorPathsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:media:listStreamingLocatorPaths", TypeShape.of(ListStreamingLocatorPathsResult.class), args == null ? ListStreamingLocatorPathsArgs.Empty : args, Utilities.withVersion(options));
    }
}
