// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.databoxedge.inputs.GetUserArgs;
import io.pulumi.azurenative.databoxedge.outputs.GetUserResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetUser {
/**
 * Represents a user who has access to one or more shares on the Data Box Edge/Gateway device.
 * API Version: 2020-12-01.
 * 
 *
 * Represents a user who has access to one or more shares on the Data Box Edge/Gateway device.
 * 
 */
    public static CompletableFuture<GetUserResult> invokeAsync(GetUserArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:databoxedge:getUser", TypeShape.of(GetUserResult.class), args == null ? GetUserArgs.Empty : args, Utilities.withVersion(options));
    }
}
