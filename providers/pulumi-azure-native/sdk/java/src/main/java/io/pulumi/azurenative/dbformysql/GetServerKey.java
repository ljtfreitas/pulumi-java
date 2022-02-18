// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.dbformysql.inputs.GetServerKeyArgs;
import io.pulumi.azurenative.dbformysql.outputs.GetServerKeyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetServerKey {
/**
 * A MySQL Server key.
 * API Version: 2020-01-01.
 * 
 *
 * A MySQL Server key.
 * 
 */
    public static CompletableFuture<GetServerKeyResult> invokeAsync(GetServerKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:dbformysql:getServerKey", TypeShape.of(GetServerKeyResult.class), args == null ? GetServerKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
