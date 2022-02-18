// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.inputs.ListPartnerNamespaceSharedAccessKeysArgs;
import io.pulumi.azurenative.eventgrid.outputs.ListPartnerNamespaceSharedAccessKeysResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListPartnerNamespaceSharedAccessKeys {
/**
 * Shared access keys of the partner namespace.
 * API Version: 2021-06-01-preview.
 * 
 *
 * Shared access keys of the partner namespace.
 * 
 */
    public static CompletableFuture<ListPartnerNamespaceSharedAccessKeysResult> invokeAsync(ListPartnerNamespaceSharedAccessKeysArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:eventgrid:listPartnerNamespaceSharedAccessKeys", TypeShape.of(ListPartnerNamespaceSharedAccessKeysResult.class), args == null ? ListPartnerNamespaceSharedAccessKeysArgs.Empty : args, Utilities.withVersion(options));
    }
}
