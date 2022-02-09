// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1;

import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GetDocumentArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GetDocumentResult;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDocument {
    public static CompletableFuture<GetDocumentResult> invokeAsync(GetDocumentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dialogflow/v2beta1:getDocument", TypeShape.of(GetDocumentResult.class), args == null ? GetDocumentArgs.Empty : args, Utilities.withVersion(options));
    }
}