// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.automation.inputs.GetPython2PackageArgs;
import io.pulumi.azurenative.automation.outputs.GetPython2PackageResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPython2Package {
/**
 * Definition of the module type.
 * API Version: 2019-06-01.
 * 
 *
 * Definition of the module type.
 * 
 */
    public static CompletableFuture<GetPython2PackageResult> invokeAsync(GetPython2PackageArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:automation:getPython2Package", TypeShape.of(GetPython2PackageResult.class), args == null ? GetPython2PackageArgs.Empty : args, Utilities.withVersion(options));
    }
}
