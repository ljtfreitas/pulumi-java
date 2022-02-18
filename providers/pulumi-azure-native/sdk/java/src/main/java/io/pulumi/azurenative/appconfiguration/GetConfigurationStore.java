// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.appconfiguration.inputs.GetConfigurationStoreArgs;
import io.pulumi.azurenative.appconfiguration.outputs.GetConfigurationStoreResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetConfigurationStore {
/**
 * The configuration store along with all resource properties. The Configuration Store will have all information to begin utilizing it.
 * API Version: 2020-06-01.
 * 
 *
 * The configuration store along with all resource properties. The Configuration Store will have all information to begin utilizing it.
 * 
 */
    public static CompletableFuture<GetConfigurationStoreResult> invokeAsync(GetConfigurationStoreArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:appconfiguration:getConfigurationStore", TypeShape.of(GetConfigurationStoreResult.class), args == null ? GetConfigurationStoreArgs.Empty : args, Utilities.withVersion(options));
    }
}
