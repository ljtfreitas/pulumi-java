// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.route53resolver.inputs.GetResolverQueryLoggingConfigArgs;
import io.pulumi.awsnative.route53resolver.outputs.GetResolverQueryLoggingConfigResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetResolverQueryLoggingConfig {
    public static CompletableFuture<GetResolverQueryLoggingConfigResult> invokeAsync(GetResolverQueryLoggingConfigArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:route53resolver:getResolverQueryLoggingConfig", TypeShape.of(GetResolverQueryLoggingConfigResult.class), args == null ? GetResolverQueryLoggingConfigArgs.Empty : args, Utilities.withVersion(options));
    }
}