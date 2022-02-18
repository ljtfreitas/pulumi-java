// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.machinelearning.inputs.GetWebServiceArgs;
import io.pulumi.azurenative.machinelearning.outputs.GetWebServiceResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetWebService {
/**
 * Instance of an Azure ML web service resource.
 * API Version: 2017-01-01.
 * 
 *
 * Instance of an Azure ML web service resource.
 * 
 */
    public static CompletableFuture<GetWebServiceResult> invokeAsync(GetWebServiceArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:machinelearning:getWebService", TypeShape.of(GetWebServiceResult.class), args == null ? GetWebServiceArgs.Empty : args, Utilities.withVersion(options));
    }
}
