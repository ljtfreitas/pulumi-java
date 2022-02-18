// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datashare.inputs.GetADLSGen2FolderDataSetMappingArgs;
import io.pulumi.azurenative.datashare.outputs.GetADLSGen2FolderDataSetMappingResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetADLSGen2FolderDataSetMapping {
/**
 * An ADLS Gen2 folder data set mapping.
 * API Version: 2020-09-01.
 * 
 *
 * An ADLS Gen2 folder data set mapping.
 * 
 */
    public static CompletableFuture<GetADLSGen2FolderDataSetMappingResult> invokeAsync(GetADLSGen2FolderDataSetMappingArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datashare:getADLSGen2FolderDataSetMapping", TypeShape.of(GetADLSGen2FolderDataSetMappingResult.class), args == null ? GetADLSGen2FolderDataSetMappingArgs.Empty : args, Utilities.withVersion(options));
    }
}
