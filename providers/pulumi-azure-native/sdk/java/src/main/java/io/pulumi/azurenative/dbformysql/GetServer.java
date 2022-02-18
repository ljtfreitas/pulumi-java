// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbformysql.inputs.GetServerArgs;
import io.pulumi.azurenative.dbformysql.outputs.GetServerResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServer {
/**
 * Represents a server.
 * API Version: 2017-12-01.
 * 
 *
 * Represents a server.
 * 
 */
    public static CompletableFuture<GetServerResult> invokeAsync(GetServerArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbformysql:getServer", TypeShape.of(GetServerResult.class), args == null ? GetServerArgs.Empty : args, Utilities.withVersion(options));
    }
}
