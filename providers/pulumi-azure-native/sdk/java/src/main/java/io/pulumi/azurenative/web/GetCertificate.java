// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.web.inputs.GetCertificateArgs;
import io.pulumi.azurenative.web.outputs.GetCertificateResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCertificate {
/**
 * SSL certificate for an app.
 * API Version: 2020-12-01.
 * 
 *
 * SSL certificate for an app.
 * 
 */
    public static CompletableFuture<GetCertificateResult> invokeAsync(GetCertificateArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:web:getCertificate", TypeShape.of(GetCertificateResult.class), args == null ? GetCertificateArgs.Empty : args, Utilities.withVersion(options));
    }
}
