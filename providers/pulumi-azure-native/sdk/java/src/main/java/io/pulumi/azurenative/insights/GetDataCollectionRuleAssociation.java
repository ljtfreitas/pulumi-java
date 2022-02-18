// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.insights.inputs.GetDataCollectionRuleAssociationArgs;
import io.pulumi.azurenative.insights.outputs.GetDataCollectionRuleAssociationResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDataCollectionRuleAssociation {
/**
 * Definition of generic ARM proxy resource.
 * API Version: 2019-11-01-preview.
 * 
 *
 * Definition of generic ARM proxy resource.
 * 
 */
    public static CompletableFuture<GetDataCollectionRuleAssociationResult> invokeAsync(GetDataCollectionRuleAssociationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:insights:getDataCollectionRuleAssociation", TypeShape.of(GetDataCollectionRuleAssociationResult.class), args == null ? GetDataCollectionRuleAssociationArgs.Empty : args, Utilities.withVersion(options));
    }
}
