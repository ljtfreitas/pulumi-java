// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationalinsights.inputs.GetSavedSearchArgs;
import io.pulumi.azurenative.operationalinsights.outputs.GetSavedSearchResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSavedSearch {
/**
 * Value object for saved search results.
 * API Version: 2020-08-01.
 * 
 *
 * Value object for saved search results.
 * 
 */
    public static CompletableFuture<GetSavedSearchResult> invokeAsync(GetSavedSearchArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:operationalinsights:getSavedSearch", TypeShape.of(GetSavedSearchResult.class), args == null ? GetSavedSearchArgs.Empty : args, Utilities.withVersion(options));
    }
}
