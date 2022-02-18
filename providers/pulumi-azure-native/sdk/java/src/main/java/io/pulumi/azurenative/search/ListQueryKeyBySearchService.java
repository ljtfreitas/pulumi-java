// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.search.inputs.ListQueryKeyBySearchServiceArgs;
import io.pulumi.azurenative.search.outputs.ListQueryKeyBySearchServiceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListQueryKeyBySearchService {
/**
 * Response containing the query API keys for a given Azure Cognitive Search service.
 * API Version: 2020-08-01.
 * 
 *
 * Response containing the query API keys for a given Azure Cognitive Search service.
 * 
 */
    public static CompletableFuture<ListQueryKeyBySearchServiceResult> invokeAsync(ListQueryKeyBySearchServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:search:listQueryKeyBySearchService", TypeShape.of(ListQueryKeyBySearchServiceResult.class), args == null ? ListQueryKeyBySearchServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}
