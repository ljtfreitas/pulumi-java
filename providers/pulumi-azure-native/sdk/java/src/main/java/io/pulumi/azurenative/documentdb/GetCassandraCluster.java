// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.documentdb.inputs.GetCassandraClusterArgs;
import io.pulumi.azurenative.documentdb.outputs.GetCassandraClusterResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCassandraCluster {
/**
 * Representation of a managed Cassandra cluster.
 * API Version: 2021-03-01-preview.
 * 
 *
 * Representation of a managed Cassandra cluster.
 * 
 */
    public static CompletableFuture<GetCassandraClusterResult> invokeAsync(GetCassandraClusterArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:documentdb:getCassandraCluster", TypeShape.of(GetCassandraClusterResult.class), args == null ? GetCassandraClusterArgs.Empty : args, Utilities.withVersion(options));
    }
}
