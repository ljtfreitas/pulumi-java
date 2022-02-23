// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentArgs;
import io.pulumi.aws.ec2transitgateway.outputs.GetPeeringAttachmentResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetPeeringAttachment {
/**
 * Get information on an EC2 Transit Gateway Peering Attachment.
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getPeeringAttachment.
 * 
 *
 * A collection of values returned by getPeeringAttachment.
 * 
 */
    public static CompletableFuture<GetPeeringAttachmentResult> invokeAsync(@Nullable GetPeeringAttachmentArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:ec2transitgateway/getPeeringAttachment:getPeeringAttachment", TypeShape.of(GetPeeringAttachmentResult.class), args == null ? GetPeeringAttachmentArgs.Empty : args, Utilities.withVersion(options));
    }
}
