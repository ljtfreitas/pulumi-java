// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.imagebuilder.inputs.GetInfrastructureConfigurationArgs;
import io.pulumi.aws.imagebuilder.outputs.GetInfrastructureConfigurationResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetInfrastructureConfiguration {
/**
 * Provides details about an Image Builder Infrastructure Configuration.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getInfrastructureConfiguration.
 * 
 *
 * A collection of values returned by getInfrastructureConfiguration.
 * 
 */
    public static CompletableFuture<GetInfrastructureConfigurationResult> invokeAsync(GetInfrastructureConfigurationArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:imagebuilder/getInfrastructureConfiguration:getInfrastructureConfiguration", TypeShape.of(GetInfrastructureConfigurationResult.class), args == null ? GetInfrastructureConfigurationArgs.Empty : args, Utilities.withVersion(options));
    }
}
