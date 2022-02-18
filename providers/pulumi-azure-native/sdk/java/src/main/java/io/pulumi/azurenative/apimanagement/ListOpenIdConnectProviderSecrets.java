// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.apimanagement.inputs.ListOpenIdConnectProviderSecretsArgs;
import io.pulumi.azurenative.apimanagement.outputs.ListOpenIdConnectProviderSecretsResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class ListOpenIdConnectProviderSecrets {
/**
 * Client or app secret used in IdentityProviders, Aad, OpenID or OAuth.
 * API Version: 2020-12-01.
 * 
 *
 * Client or app secret used in IdentityProviders, Aad, OpenID or OAuth.
 * 
 */
    public static CompletableFuture<ListOpenIdConnectProviderSecretsResult> invokeAsync(ListOpenIdConnectProviderSecretsArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:apimanagement:listOpenIdConnectProviderSecrets", TypeShape.of(ListOpenIdConnectProviderSecretsResult.class), args == null ? ListOpenIdConnectProviderSecretsArgs.Empty : args, Utilities.withVersion(options));
    }
}
