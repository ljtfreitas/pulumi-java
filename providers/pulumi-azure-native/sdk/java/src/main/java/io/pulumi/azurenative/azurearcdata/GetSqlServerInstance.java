// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azurearcdata.inputs.GetSqlServerInstanceArgs;
import io.pulumi.azurenative.azurearcdata.outputs.GetSqlServerInstanceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSqlServerInstance {
/**
 * A SqlServerInstance.
 * API Version: 2021-06-01-preview.
 * 
 *
 * A SqlServerInstance.
 * 
 */
    public static CompletableFuture<GetSqlServerInstanceResult> invokeAsync(GetSqlServerInstanceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azurearcdata:getSqlServerInstance", TypeShape.of(GetSqlServerInstanceResult.class), args == null ? GetSqlServerInstanceArgs.Empty : args, Utilities.withVersion(options));
    }
}
