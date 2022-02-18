// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.recoveryservices.inputs.GetReplicationMigrationItemArgs;
import io.pulumi.azurenative.recoveryservices.outputs.GetReplicationMigrationItemResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetReplicationMigrationItem {
/**
 * Migration item.
 * API Version: 2018-07-10.
 * 
 *
 * Migration item.
 * 
 */
    public static CompletableFuture<GetReplicationMigrationItemResult> invokeAsync(GetReplicationMigrationItemArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:recoveryservices:getReplicationMigrationItem", TypeShape.of(GetReplicationMigrationItemResult.class), args == null ? GetReplicationMigrationItemArgs.Empty : args, Utilities.withVersion(options));
    }
}
