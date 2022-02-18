// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managedservices;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.managedservices.inputs.GetRegistrationAssignmentArgs;
import io.pulumi.azurenative.managedservices.outputs.GetRegistrationAssignmentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetRegistrationAssignment {
/**
 * Registration assignment.
 * API Version: 2019-09-01.
 * 
 *
 * Registration assignment.
 * 
 */
    public static CompletableFuture<GetRegistrationAssignmentResult> invokeAsync(GetRegistrationAssignmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:managedservices:getRegistrationAssignment", TypeShape.of(GetRegistrationAssignmentResult.class), args == null ? GetRegistrationAssignmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
