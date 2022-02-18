// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.security.inputs.GetAdvancedThreatProtectionArgs;
import io.pulumi.azurenative.security.outputs.GetAdvancedThreatProtectionResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetAdvancedThreatProtection {
/**
 * The Advanced Threat Protection resource.
 * API Version: 2019-01-01.
 * 
 *
 * The Advanced Threat Protection resource.
 * 
 */
    public static CompletableFuture<GetAdvancedThreatProtectionResult> invokeAsync(GetAdvancedThreatProtectionArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:security:getAdvancedThreatProtection", TypeShape.of(GetAdvancedThreatProtectionResult.class), args == null ? GetAdvancedThreatProtectionArgs.Empty : args, Utilities.withVersion(options));
    }
}
