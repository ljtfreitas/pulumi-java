// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azuredata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.azuredata.inputs.GetSqlServerArgs;
import io.pulumi.azurenative.azuredata.outputs.GetSqlServerResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSqlServer {
/**
 * A SQL server.
 * API Version: 2019-07-24-preview.
 * 
 *
 * A SQL server.
 * 
 */
    public static CompletableFuture<GetSqlServerResult> invokeAsync(GetSqlServerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:azuredata:getSqlServer", TypeShape.of(GetSqlServerResult.class), args == null ? GetSqlServerArgs.Empty : args, Utilities.withVersion(options));
    }
}
