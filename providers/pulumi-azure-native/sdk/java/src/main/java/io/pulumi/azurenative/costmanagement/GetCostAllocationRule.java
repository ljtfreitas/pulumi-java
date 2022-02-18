// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.costmanagement.inputs.GetCostAllocationRuleArgs;
import io.pulumi.azurenative.costmanagement.outputs.GetCostAllocationRuleResult;
import io.pulumi.core.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetCostAllocationRule {
/**
 * The cost allocation rule model definition
 * API Version: 2020-03-01-preview.
 * 
 *
 * The cost allocation rule model definition
 * 
 */
    public static CompletableFuture<GetCostAllocationRuleResult> invokeAsync(GetCostAllocationRuleArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:costmanagement:getCostAllocationRule", TypeShape.of(GetCostAllocationRuleResult.class), args == null ? GetCostAllocationRuleArgs.Empty : args, Utilities.withVersion(options));
    }
}
