// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybriddata;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybriddata.inputs.GetDataStoreArgs;
import io.pulumi.azurenative.hybriddata.outputs.GetDataStoreResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataStore {
/**
 * Data store.
 * API Version: 2019-06-01.
 * 
 *
 * Data store.
 * 
 */
    public static CompletableFuture<GetDataStoreResult> invokeAsync(GetDataStoreArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybriddata:getDataStore", TypeShape.of(GetDataStoreResult.class), args == null ? GetDataStoreArgs.Empty : args, Utilities.withVersion(options));
    }
}
