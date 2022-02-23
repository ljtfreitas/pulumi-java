// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.inputs.GetDelegationSetArgs;
import io.pulumi.aws.route53.outputs.GetDelegationSetResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetDelegationSet {
/**
 * `aws.route53.DelegationSet` provides details about a specific Route 53 Delegation Set.
 * 
 * This data source allows to find a list of name servers associated with a specific delegation set.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getDelegationSet.
 * 
 *
 * A collection of values returned by getDelegationSet.
 * 
 */
    public static CompletableFuture<GetDelegationSetResult> invokeAsync(GetDelegationSetArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:route53/getDelegationSet:getDelegationSet", TypeShape.of(GetDelegationSetResult.class), args == null ? GetDelegationSetArgs.Empty : args, Utilities.withVersion(options));
    }
}
