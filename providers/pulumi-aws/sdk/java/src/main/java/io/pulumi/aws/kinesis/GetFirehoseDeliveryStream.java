// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.kinesis.inputs.GetFirehoseDeliveryStreamArgs;
import io.pulumi.aws.kinesis.outputs.GetFirehoseDeliveryStreamResult;
import io.pulumi.core.internal.Reflection.TypeShape;
import io.pulumi.deployment.Deployment;
import io.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;

public class GetFirehoseDeliveryStream {
/**
 * Use this data source to get information about a Kinesis Firehose Delivery Stream for use in other resources.
 * 
 * For more details, see the [Amazon Kinesis Firehose Documentation](https://aws.amazon.com/documentation/firehose/).
 * 
 * ## Example Usage
 * 
 *
 * A collection of arguments for invoking getFirehoseDeliveryStream.
 * 
 *
 * A collection of values returned by getFirehoseDeliveryStream.
 * 
 */
    public static CompletableFuture<GetFirehoseDeliveryStreamResult> invokeAsync(GetFirehoseDeliveryStreamArgs args, @Nullable InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:kinesis/getFirehoseDeliveryStream:getFirehoseDeliveryStream", TypeShape.of(GetFirehoseDeliveryStreamResult.class), args == null ? GetFirehoseDeliveryStreamArgs.Empty : args, Utilities.withVersion(options));
    }
}
