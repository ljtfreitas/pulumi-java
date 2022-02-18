// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.inputs.GetPolicySetDefinitionAtManagementGroupArgs;
import io.pulumi.azurenative.authorization.outputs.GetPolicySetDefinitionAtManagementGroupResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPolicySetDefinitionAtManagementGroup {
/**
 * The policy set definition.
 * API Version: 2020-09-01.
 * 
 *
 * The policy set definition.
 * 
 */
    public static CompletableFuture<GetPolicySetDefinitionAtManagementGroupResult> invokeAsync(GetPolicySetDefinitionAtManagementGroupArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:authorization:getPolicySetDefinitionAtManagementGroup", TypeShape.of(GetPolicySetDefinitionAtManagementGroupResult.class), args == null ? GetPolicySetDefinitionAtManagementGroupArgs.Empty : args, Utilities.withVersion(options));
    }
}
