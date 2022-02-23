// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ssm.inputs.GetDocumentArgs;
import io.pulumi.aws.ssm.outputs.GetDocumentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDocument {
/**
 * Gets the contents of the specified Systems Manager document.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getDocument.
 * 
 *
 * A collection of values returned by getDocument.
 * 
 */
    public static CompletableFuture<GetDocumentResult> invokeAsync(GetDocumentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ssm/getDocument:getDocument", TypeShape.of(GetDocumentResult.class), args == null ? GetDocumentArgs.Empty : args, Utilities.withVersion(options));
    }
}
