// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sqs;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.sqs.QueueArgs;
import io.pulumi.awsnative.sqs.outputs.QueueTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:sqs:Queue")
public class Queue extends io.pulumi.resources.CustomResource {
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }
    @OutputExport(name="contentBasedDeduplication", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> contentBasedDeduplication;

    public Output</* @Nullable */ Boolean> getContentBasedDeduplication() {
        return this.contentBasedDeduplication;
    }
    @OutputExport(name="deduplicationScope", type=String.class, parameters={})
    private Output</* @Nullable */ String> deduplicationScope;

    public Output</* @Nullable */ String> getDeduplicationScope() {
        return this.deduplicationScope;
    }
    @OutputExport(name="delaySeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> delaySeconds;

    public Output</* @Nullable */ Integer> getDelaySeconds() {
        return this.delaySeconds;
    }
    @OutputExport(name="fifoQueue", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> fifoQueue;

    public Output</* @Nullable */ Boolean> getFifoQueue() {
        return this.fifoQueue;
    }
    @OutputExport(name="fifoThroughputLimit", type=String.class, parameters={})
    private Output</* @Nullable */ String> fifoThroughputLimit;

    public Output</* @Nullable */ String> getFifoThroughputLimit() {
        return this.fifoThroughputLimit;
    }
    @OutputExport(name="kmsDataKeyReusePeriodSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> kmsDataKeyReusePeriodSeconds;

    public Output</* @Nullable */ Integer> getKmsDataKeyReusePeriodSeconds() {
        return this.kmsDataKeyReusePeriodSeconds;
    }
    @OutputExport(name="kmsMasterKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsMasterKeyId;

    public Output</* @Nullable */ String> getKmsMasterKeyId() {
        return this.kmsMasterKeyId;
    }
    @OutputExport(name="maximumMessageSize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maximumMessageSize;

    public Output</* @Nullable */ Integer> getMaximumMessageSize() {
        return this.maximumMessageSize;
    }
    @OutputExport(name="messageRetentionPeriod", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> messageRetentionPeriod;

    public Output</* @Nullable */ Integer> getMessageRetentionPeriod() {
        return this.messageRetentionPeriod;
    }
    @OutputExport(name="queueName", type=String.class, parameters={})
    private Output</* @Nullable */ String> queueName;

    public Output</* @Nullable */ String> getQueueName() {
        return this.queueName;
    }
    @OutputExport(name="queueUrl", type=String.class, parameters={})
    private Output<String> queueUrl;

    public Output<String> getQueueUrl() {
        return this.queueUrl;
    }
    @OutputExport(name="receiveMessageWaitTimeSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> receiveMessageWaitTimeSeconds;

    public Output</* @Nullable */ Integer> getReceiveMessageWaitTimeSeconds() {
        return this.receiveMessageWaitTimeSeconds;
    }
    @OutputExport(name="redriveAllowPolicy", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> redriveAllowPolicy;

    public Output</* @Nullable */ Object> getRedriveAllowPolicy() {
        return this.redriveAllowPolicy;
    }
    @OutputExport(name="redrivePolicy", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> redrivePolicy;

    public Output</* @Nullable */ Object> getRedrivePolicy() {
        return this.redrivePolicy;
    }
    @OutputExport(name="tags", type=List.class, parameters={QueueTag.class})
    private Output</* @Nullable */ List<QueueTag>> tags;

    public Output</* @Nullable */ List<QueueTag>> getTags() {
        return this.tags;
    }
    @OutputExport(name="visibilityTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> visibilityTimeout;

    public Output</* @Nullable */ Integer> getVisibilityTimeout() {
        return this.visibilityTimeout;
    }

    public Queue(String name, @Nullable QueueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sqs:Queue", name, args == null ? QueueArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Queue(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:sqs:Queue", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Queue get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Queue(name, id, options);
    }
}