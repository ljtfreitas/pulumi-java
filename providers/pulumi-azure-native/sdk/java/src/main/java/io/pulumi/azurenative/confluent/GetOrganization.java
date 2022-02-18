// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confluent;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.confluent.inputs.GetOrganizationArgs;
import io.pulumi.azurenative.confluent.outputs.GetOrganizationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetOrganization {
/**
 * Organization resource.
 * API Version: 2020-03-01.
 * 
 *
 * Organization resource.
 * 
 */
    public static CompletableFuture<GetOrganizationResult> invokeAsync(GetOrganizationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:confluent:getOrganization", TypeShape.of(GetOrganizationResult.class), args == null ? GetOrganizationArgs.Empty : args, Utilities.withVersion(options));
    }
}
