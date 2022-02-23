// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.acmpca.inputs.GetCertificateAuthorityArgs;
import io.pulumi.aws.acmpca.outputs.GetCertificateAuthorityResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCertificateAuthority {
/**
 * Get information on a AWS Certificate Manager Private Certificate Authority (ACM PCA Certificate Authority).
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getCertificateAuthority.
 * 
 *
 * A collection of values returned by getCertificateAuthority.
 * 
 */
    public static CompletableFuture<GetCertificateAuthorityResult> invokeAsync(GetCertificateAuthorityArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:acmpca/getCertificateAuthority:getCertificateAuthority", TypeShape.of(GetCertificateAuthorityResult.class), args == null ? GetCertificateAuthorityArgs.Empty : args, Utilities.withVersion(options));
    }
}
