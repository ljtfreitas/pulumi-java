// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.operationalinsights.inputs.GetDataExportArgs;
import io.pulumi.azurenative.operationalinsights.outputs.GetDataExportResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataExport {
/**
 * The top level data export resource container.
 * API Version: 2020-08-01.
 * 
 *
 * The top level data export resource container.
 * 
 */
    public static CompletableFuture<GetDataExportResult> invokeAsync(GetDataExportArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:operationalinsights:getDataExport", TypeShape.of(GetDataExportResult.class), args == null ? GetDataExportArgs.Empty : args, Utilities.withVersion(options));
    }
}
