// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blueprint.inputs.GetPolicyAssignmentArtifactArgs;
import io.pulumi.azurenative.blueprint.outputs.GetPolicyAssignmentArtifactResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPolicyAssignmentArtifact {
/**
 * Blueprint artifact that applies a Policy assignment.
 * API Version: 2018-11-01-preview.
 * 
 *
 * Blueprint artifact that applies a Policy assignment.
 * 
 */
    public static CompletableFuture<GetPolicyAssignmentArtifactResult> invokeAsync(GetPolicyAssignmentArtifactArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:blueprint:getPolicyAssignmentArtifact", TypeShape.of(GetPolicyAssignmentArtifactResult.class), args == null ? GetPolicyAssignmentArtifactArgs.Empty : args, Utilities.withVersion(options));
    }
}
