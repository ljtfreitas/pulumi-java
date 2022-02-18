// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datamigration.inputs.ListSqlMigrationServiceMonitoringDataArgs;
import io.pulumi.azurenative.datamigration.outputs.ListSqlMigrationServiceMonitoringDataResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListSqlMigrationServiceMonitoringData {
/**
 * Integration Runtime Monitoring Data.
 * API Version: 2021-10-30-preview.
 * 
 *
 * Integration Runtime Monitoring Data.
 * 
 */
    public static CompletableFuture<ListSqlMigrationServiceMonitoringDataResult> invokeAsync(ListSqlMigrationServiceMonitoringDataArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datamigration:listSqlMigrationServiceMonitoringData", TypeShape.of(ListSqlMigrationServiceMonitoringDataResult.class), args == null ? ListSqlMigrationServiceMonitoringDataArgs.Empty : args, Utilities.withVersion(options));
    }
}
