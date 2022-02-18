// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.synapse.inputs.GetDatabasePrincipalAssignmentArgs;
import io.pulumi.azurenative.synapse.outputs.GetDatabasePrincipalAssignmentResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDatabasePrincipalAssignment {
/**
 * Class representing a database principal assignment.
 * API Version: 2021-04-01-preview.
 * 
 *
 * Class representing a database principal assignment.
 * 
 */
    public static CompletableFuture<GetDatabasePrincipalAssignmentResult> invokeAsync(GetDatabasePrincipalAssignmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:synapse:getDatabasePrincipalAssignment", TypeShape.of(GetDatabasePrincipalAssignmentResult.class), args == null ? GetDatabasePrincipalAssignmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
