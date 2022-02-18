// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.containerservice.inputs.ListManagedClusterAccessProfileArgs;
import io.pulumi.azurenative.containerservice.outputs.ListManagedClusterAccessProfileResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListManagedClusterAccessProfile {
/**
 * Managed cluster Access Profile.
 * API Version: 2020-03-01.
 * 
 *
 * Managed cluster Access Profile.
 * 
 */
    public static CompletableFuture<ListManagedClusterAccessProfileResult> invokeAsync(ListManagedClusterAccessProfileArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:containerservice:listManagedClusterAccessProfile", TypeShape.of(ListManagedClusterAccessProfileResult.class), args == null ? ListManagedClusterAccessProfileArgs.Empty : args, Utilities.withVersion(options));
    }
}
