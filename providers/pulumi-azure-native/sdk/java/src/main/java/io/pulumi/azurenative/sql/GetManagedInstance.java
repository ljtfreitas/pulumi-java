// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.sql.inputs.GetManagedInstanceArgs;
import io.pulumi.azurenative.sql.outputs.GetManagedInstanceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetManagedInstance {
/**
 * An Azure SQL managed instance.
 * API Version: 2020-11-01-preview.
 * 
 *
 * An Azure SQL managed instance.
 * 
 */
    public static CompletableFuture<GetManagedInstanceResult> invokeAsync(GetManagedInstanceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:sql:getManagedInstance", TypeShape.of(GetManagedInstanceResult.class), args == null ? GetManagedInstanceArgs.Empty : args, Utilities.withVersion(options));
    }
}
