// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sns;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.sns.TopicArgs;
import io.pulumi.aws.sns.inputs.TopicState;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an SNS topic resource
 * 
 * ## Example Usage
 * ## Message Delivery Status Arguments
 * 
 * The `<endpoint>_success_feedback_role_arn` and `<endpoint>_failure_feedback_role_arn` arguments are used to give Amazon SNS write access to use CloudWatch Logs on your behalf. The `<endpoint>_success_feedback_sample_rate` argument is for specifying the sample rate percentage (0-100) of successfully delivered messages. After you configure the  `<endpoint>_failure_feedback_role_arn` argument, then all failed message deliveries generate CloudWatch Logs.
 * 
 * ## Import
 * 
 * SNS Topics can be imported using the `topic arn`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sns/topic:Topic user_updates arn:aws:sns:us-west-2:0123456789012:my-topic
 * ```
 * 
 */
@ResourceType(type="aws:sns/topic:Topic")
public class Topic extends io.pulumi.resources.CustomResource {
    /**
     * IAM role for failure feedback
     * 
     */
    @OutputExport(name="applicationFailureFeedbackRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> applicationFailureFeedbackRoleArn;

    /**
     * @return IAM role for failure feedback
     * 
     */
    public Output</* @Nullable */ String> getApplicationFailureFeedbackRoleArn() {
        return this.applicationFailureFeedbackRoleArn;
    }
    /**
     * The IAM role permitted to receive success feedback for this topic
     * 
     */
    @OutputExport(name="applicationSuccessFeedbackRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> applicationSuccessFeedbackRoleArn;

    /**
     * @return The IAM role permitted to receive success feedback for this topic
     * 
     */
    public Output</* @Nullable */ String> getApplicationSuccessFeedbackRoleArn() {
        return this.applicationSuccessFeedbackRoleArn;
    }
    /**
     * Percentage of success to sample
     * 
     */
    @OutputExport(name="applicationSuccessFeedbackSampleRate", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> applicationSuccessFeedbackSampleRate;

    /**
     * @return Percentage of success to sample
     * 
     */
    public Output</* @Nullable */ Integer> getApplicationSuccessFeedbackSampleRate() {
        return this.applicationSuccessFeedbackSampleRate;
    }
    /**
     * The ARN of the SNS topic, as a more obvious property (clone of id)
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the SNS topic, as a more obvious property (clone of id)
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Enables content-based deduplication for FIFO topics. For more information, see the [related documentation](https://docs.aws.amazon.com/sns/latest/dg/fifo-message-dedup.html)
     * 
     */
    @OutputExport(name="contentBasedDeduplication", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> contentBasedDeduplication;

    /**
     * @return Enables content-based deduplication for FIFO topics. For more information, see the [related documentation](https://docs.aws.amazon.com/sns/latest/dg/fifo-message-dedup.html)
     * 
     */
    public Output</* @Nullable */ Boolean> getContentBasedDeduplication() {
        return this.contentBasedDeduplication;
    }
    /**
     * The SNS delivery policy. More on [AWS documentation](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html)
     * 
     */
    @OutputExport(name="deliveryPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> deliveryPolicy;

    /**
     * @return The SNS delivery policy. More on [AWS documentation](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html)
     * 
     */
    public Output</* @Nullable */ String> getDeliveryPolicy() {
        return this.deliveryPolicy;
    }
    /**
     * The display name for the topic
     * 
     */
    @OutputExport(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name for the topic
     * 
     */
    public Output</* @Nullable */ String> getDisplayName() {
        return this.displayName;
    }
    /**
     * Boolean indicating whether or not to create a FIFO (first-in-first-out) topic (default is `false`).
     * 
     */
    @OutputExport(name="fifoTopic", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> fifoTopic;

    /**
     * @return Boolean indicating whether or not to create a FIFO (first-in-first-out) topic (default is `false`).
     * 
     */
    public Output</* @Nullable */ Boolean> getFifoTopic() {
        return this.fifoTopic;
    }
    /**
     * IAM role for failure feedback
     * 
     */
    @OutputExport(name="firehoseFailureFeedbackRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> firehoseFailureFeedbackRoleArn;

    /**
     * @return IAM role for failure feedback
     * 
     */
    public Output</* @Nullable */ String> getFirehoseFailureFeedbackRoleArn() {
        return this.firehoseFailureFeedbackRoleArn;
    }
    /**
     * The IAM role permitted to receive success feedback for this topic
     * 
     */
    @OutputExport(name="firehoseSuccessFeedbackRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> firehoseSuccessFeedbackRoleArn;

    /**
     * @return The IAM role permitted to receive success feedback for this topic
     * 
     */
    public Output</* @Nullable */ String> getFirehoseSuccessFeedbackRoleArn() {
        return this.firehoseSuccessFeedbackRoleArn;
    }
    /**
     * Percentage of success to sample
     * 
     */
    @OutputExport(name="firehoseSuccessFeedbackSampleRate", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> firehoseSuccessFeedbackSampleRate;

    /**
     * @return Percentage of success to sample
     * 
     */
    public Output</* @Nullable */ Integer> getFirehoseSuccessFeedbackSampleRate() {
        return this.firehoseSuccessFeedbackSampleRate;
    }
    /**
     * IAM role for failure feedback
     * 
     */
    @OutputExport(name="httpFailureFeedbackRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> httpFailureFeedbackRoleArn;

    /**
     * @return IAM role for failure feedback
     * 
     */
    public Output</* @Nullable */ String> getHttpFailureFeedbackRoleArn() {
        return this.httpFailureFeedbackRoleArn;
    }
    /**
     * The IAM role permitted to receive success feedback for this topic
     * 
     */
    @OutputExport(name="httpSuccessFeedbackRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> httpSuccessFeedbackRoleArn;

    /**
     * @return The IAM role permitted to receive success feedback for this topic
     * 
     */
    public Output</* @Nullable */ String> getHttpSuccessFeedbackRoleArn() {
        return this.httpSuccessFeedbackRoleArn;
    }
    /**
     * Percentage of success to sample
     * 
     */
    @OutputExport(name="httpSuccessFeedbackSampleRate", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> httpSuccessFeedbackSampleRate;

    /**
     * @return Percentage of success to sample
     * 
     */
    public Output</* @Nullable */ Integer> getHttpSuccessFeedbackSampleRate() {
        return this.httpSuccessFeedbackSampleRate;
    }
    /**
     * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK. For more information, see [Key Terms](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms)
     * 
     */
    @OutputExport(name="kmsMasterKeyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> kmsMasterKeyId;

    /**
     * @return The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK. For more information, see [Key Terms](https://docs.aws.amazon.com/sns/latest/dg/sns-server-side-encryption.html#sse-key-terms)
     * 
     */
    public Output</* @Nullable */ String> getKmsMasterKeyId() {
        return this.kmsMasterKeyId;
    }
    /**
     * IAM role for failure feedback
     * 
     */
    @OutputExport(name="lambdaFailureFeedbackRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> lambdaFailureFeedbackRoleArn;

    /**
     * @return IAM role for failure feedback
     * 
     */
    public Output</* @Nullable */ String> getLambdaFailureFeedbackRoleArn() {
        return this.lambdaFailureFeedbackRoleArn;
    }
    /**
     * The IAM role permitted to receive success feedback for this topic
     * 
     */
    @OutputExport(name="lambdaSuccessFeedbackRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> lambdaSuccessFeedbackRoleArn;

    /**
     * @return The IAM role permitted to receive success feedback for this topic
     * 
     */
    public Output</* @Nullable */ String> getLambdaSuccessFeedbackRoleArn() {
        return this.lambdaSuccessFeedbackRoleArn;
    }
    /**
     * Percentage of success to sample
     * 
     */
    @OutputExport(name="lambdaSuccessFeedbackSampleRate", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> lambdaSuccessFeedbackSampleRate;

    /**
     * @return Percentage of success to sample
     * 
     */
    public Output</* @Nullable */ Integer> getLambdaSuccessFeedbackSampleRate() {
        return this.lambdaSuccessFeedbackSampleRate;
    }
    /**
     * The name of the topic. Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and hyphens, and must be between 1 and 256 characters long. For a FIFO (first-in-first-out) topic, the name must end with the `.fifo` suffix. If omitted, this provider will assign a random, unique name. Conflicts with `name_prefix`
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the topic. Topic names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, and hyphens, and must be between 1 and 256 characters long. For a FIFO (first-in-first-out) topic, the name must end with the `.fifo` suffix. If omitted, this provider will assign a random, unique name. Conflicts with `name_prefix`
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`
     * 
     */
    @OutputExport(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates a unique name beginning with the specified prefix. Conflicts with `name`
     * 
     */
    public Output<String> getNamePrefix() {
        return this.namePrefix;
    }
    /**
     * The AWS Account ID of the SNS topic owner
     * 
     */
    @OutputExport(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return The AWS Account ID of the SNS topic owner
     * 
     */
    public Output<String> getOwner() {
        return this.owner;
    }
    /**
     * The fully-formed AWS policy as JSON.
     * 
     */
    @OutputExport(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return The fully-formed AWS policy as JSON.
     * 
     */
    public Output<String> getPolicy() {
        return this.policy;
    }
    /**
     * IAM role for failure feedback
     * 
     */
    @OutputExport(name="sqsFailureFeedbackRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> sqsFailureFeedbackRoleArn;

    /**
     * @return IAM role for failure feedback
     * 
     */
    public Output</* @Nullable */ String> getSqsFailureFeedbackRoleArn() {
        return this.sqsFailureFeedbackRoleArn;
    }
    /**
     * The IAM role permitted to receive success feedback for this topic
     * 
     */
    @OutputExport(name="sqsSuccessFeedbackRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> sqsSuccessFeedbackRoleArn;

    /**
     * @return The IAM role permitted to receive success feedback for this topic
     * 
     */
    public Output</* @Nullable */ String> getSqsSuccessFeedbackRoleArn() {
        return this.sqsSuccessFeedbackRoleArn;
    }
    /**
     * Percentage of success to sample
     * 
     */
    @OutputExport(name="sqsSuccessFeedbackSampleRate", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> sqsSuccessFeedbackSampleRate;

    /**
     * @return Percentage of success to sample
     * 
     */
    public Output</* @Nullable */ Integer> getSqsSuccessFeedbackSampleRate() {
        return this.sqsSuccessFeedbackSampleRate;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Topic(String name, @Nullable TopicArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sns/topic:Topic", name, args == null ? TopicArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Topic(String name, Input<String> id, @Nullable TopicState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:sns/topic:Topic", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Topic get(String name, Input<String> id, @Nullable TopicState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Topic(name, id, state, options);
    }
}
