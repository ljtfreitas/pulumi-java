// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hanaonazure.inputs.GetProviderInstanceArgs;
import io.pulumi.azurenative.hanaonazure.outputs.GetProviderInstanceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetProviderInstance {
/**
 * A provider instance associated with a SAP monitor.
 * API Version: 2020-02-07-preview.
 * 
 *
 * A provider instance associated with a SAP monitor.
 * 
 */
    public static CompletableFuture<GetProviderInstanceResult> invokeAsync(GetProviderInstanceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hanaonazure:getProviderInstance", TypeShape.of(GetProviderInstanceResult.class), args == null ? GetProviderInstanceArgs.Empty : args, Utilities.withVersion(options));
    }
}
