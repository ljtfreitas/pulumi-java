// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.cdn.inputs.GetSecurityPolicyArgs;
import io.pulumi.azurenative.cdn.outputs.GetSecurityPolicyResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetSecurityPolicy {
/**
 * SecurityPolicy association for AzureFrontDoor profile
 * API Version: 2020-09-01.
 * 
 *
 * SecurityPolicy association for AzureFrontDoor profile
 * 
 */
    public static CompletableFuture<GetSecurityPolicyResult> invokeAsync(GetSecurityPolicyArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:cdn:getSecurityPolicy", TypeShape.of(GetSecurityPolicyResult.class), args == null ? GetSecurityPolicyArgs.Empty : args, Utilities.withVersion(options));
    }
}
