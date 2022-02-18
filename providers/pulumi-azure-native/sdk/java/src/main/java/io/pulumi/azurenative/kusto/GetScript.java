// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.kusto.inputs.GetScriptArgs;
import io.pulumi.azurenative.kusto.outputs.GetScriptResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetScript {
/**
 * Class representing a database script.
 * API Version: 2021-01-01.
 * 
 *
 * Class representing a database script.
 * 
 */
    public static CompletableFuture<GetScriptResult> invokeAsync(GetScriptArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:kusto:getScript", TypeShape.of(GetScriptResult.class), args == null ? GetScriptArgs.Empty : args, Utilities.withVersion(options));
    }
}
