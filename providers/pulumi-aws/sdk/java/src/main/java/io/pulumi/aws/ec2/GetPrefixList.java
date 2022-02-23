// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetPrefixListArgs;
import io.pulumi.aws.ec2.outputs.GetPrefixListResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPrefixList {
    public static CompletableFuture<GetPrefixListResult> invokeAsync(@Nullable GetPrefixListArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getPrefixList:getPrefixList", TypeShape.of(GetPrefixListResult.class), args == null ? GetPrefixListArgs.Empty : args, Utilities.withVersion(options));
    }
}
