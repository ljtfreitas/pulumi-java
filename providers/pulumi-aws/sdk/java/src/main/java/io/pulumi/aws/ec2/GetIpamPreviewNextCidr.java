// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.inputs.GetIpamPreviewNextCidrArgs;
import io.pulumi.aws.ec2.outputs.GetIpamPreviewNextCidrResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetIpamPreviewNextCidr {
    public static CompletableFuture<GetIpamPreviewNextCidrResult> invokeAsync(GetIpamPreviewNextCidrArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2/getIpamPreviewNextCidr:getIpamPreviewNextCidr", TypeShape.of(GetIpamPreviewNextCidrResult.class), args == null ? GetIpamPreviewNextCidrArgs.Empty : args, Utilities.withVersion(options));
    }
}
