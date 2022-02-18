// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.customerinsights.inputs.GetRoleAssignmentArgs;
import io.pulumi.azurenative.customerinsights.outputs.GetRoleAssignmentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRoleAssignment {
/**
 * The Role Assignment resource format.
 * API Version: 2017-04-26.
 * 
 *
 * The Role Assignment resource format.
 * 
 */
    public static CompletableFuture<GetRoleAssignmentResult> invokeAsync(GetRoleAssignmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:customerinsights:getRoleAssignment", TypeShape.of(GetRoleAssignmentResult.class), args == null ? GetRoleAssignmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
