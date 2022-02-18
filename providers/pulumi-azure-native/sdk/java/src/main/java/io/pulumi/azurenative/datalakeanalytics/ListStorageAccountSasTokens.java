// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakeanalytics;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.datalakeanalytics.inputs.ListStorageAccountSasTokensArgs;
import io.pulumi.azurenative.datalakeanalytics.outputs.ListStorageAccountSasTokensResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListStorageAccountSasTokens {
/**
 * The SAS response that contains the storage account, container and associated SAS token for connection use.
 * API Version: 2016-11-01.
 * 
 *
 * The SAS response that contains the storage account, container and associated SAS token for connection use.
 * 
 */
    public static CompletableFuture<ListStorageAccountSasTokensResult> invokeAsync(ListStorageAccountSasTokensArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datalakeanalytics:listStorageAccountSasTokens", TypeShape.of(ListStorageAccountSasTokensResult.class), args == null ? ListStorageAccountSasTokensArgs.Empty : args, Utilities.withVersion(options));
    }
}
