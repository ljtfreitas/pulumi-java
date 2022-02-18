// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.hybridnetwork.inputs.ListDeviceRegistrationKeyArgs;
import io.pulumi.azurenative.hybridnetwork.outputs.ListDeviceRegistrationKeyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListDeviceRegistrationKey {
/**
 * The device registration key.
 * API Version: 2020-01-01-preview.
 * 
 *
 * The device registration key.
 * 
 */
    public static CompletableFuture<ListDeviceRegistrationKeyResult> invokeAsync(ListDeviceRegistrationKeyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hybridnetwork:listDeviceRegistrationKey", TypeShape.of(ListDeviceRegistrationKeyResult.class), args == null ? ListDeviceRegistrationKeyArgs.Empty : args, Utilities.withVersion(options));
    }
}
