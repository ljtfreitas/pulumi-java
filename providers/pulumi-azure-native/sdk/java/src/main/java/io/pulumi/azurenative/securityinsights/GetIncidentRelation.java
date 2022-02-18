// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.securityinsights.inputs.GetIncidentRelationArgs;
import io.pulumi.azurenative.securityinsights.outputs.GetIncidentRelationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIncidentRelation {
/**
 * Represents a relation between two resources
 * API Version: 2021-03-01-preview.
 * 
 *
 * Represents a relation between two resources
 * 
 */
    public static CompletableFuture<GetIncidentRelationResult> invokeAsync(GetIncidentRelationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:securityinsights:getIncidentRelation", TypeShape.of(GetIncidentRelationResult.class), args == null ? GetIncidentRelationArgs.Empty : args, Utilities.withVersion(options));
    }
}
