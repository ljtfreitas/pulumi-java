// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.blueprint.inputs.GetArtifactArgs;
import io.pulumi.azurenative.blueprint.outputs.GetArtifactResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

@Deprecated /* Please use one of the variants: PolicyAssignmentArtifact, RoleAssignmentArtifact, TemplateArtifact. */
public class GetArtifact {
/**
 * Represents a blueprint artifact.
 * API Version: 2018-11-01-preview.
 * 
 *
 * Represents a blueprint artifact.
 * 
 * @deprecated
 * Please use one of the variants: PolicyAssignmentArtifact, RoleAssignmentArtifact, TemplateArtifact.
 * 
 */
    @Deprecated /* Please use one of the variants: PolicyAssignmentArtifact, RoleAssignmentArtifact, TemplateArtifact. */
    public static CompletableFuture<GetArtifactResult> invokeAsync(GetArtifactArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:blueprint:getArtifact", TypeShape.of(GetArtifactResult.class), args == null ? GetArtifactArgs.Empty : args, Utilities.withVersion(options));
    }
}
