// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.GetDatastoreArgs;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.GetDatastoreResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDatastore {
/**
 * Define the datastore.
 * API Version: 2020-10-01-preview.
 * 
 *
 * Define the datastore.
 * 
 */
    public static CompletableFuture<GetDatastoreResult> invokeAsync(GetDatastoreArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:connectedvmwarevsphere:getDatastore", TypeShape.of(GetDatastoreResult.class), args == null ? GetDatastoreArgs.Empty : args, Utilities.withVersion(options));
    }
}
