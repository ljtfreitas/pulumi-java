// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.inputs.GetKustoClusterDataSetMappingArgs;
import io.pulumi.azurenative.datashare.outputs.GetKustoClusterDataSetMappingResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetKustoClusterDataSetMapping {
/**
 * A Kusto cluster data set mapping
 * API Version: 2020-09-01.
 * 
 *
 * A Kusto cluster data set mapping
 * 
 */
    public static CompletableFuture<GetKustoClusterDataSetMappingResult> invokeAsync(GetKustoClusterDataSetMappingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datashare:getKustoClusterDataSetMapping", TypeShape.of(GetKustoClusterDataSetMappingResult.class), args == null ? GetKustoClusterDataSetMappingArgs.Empty : args, Utilities.withVersion(options));
    }
}
