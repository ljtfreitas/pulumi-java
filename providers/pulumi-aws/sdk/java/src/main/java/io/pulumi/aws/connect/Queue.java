// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.connect.QueueArgs;
import io.pulumi.aws.connect.inputs.QueueState;
import io.pulumi.aws.connect.outputs.QueueOutboundCallerConfig;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect Queue resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 * 
 * > **NOTE:** Due to The behaviour of Amazon Connect you cannot delete queues.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Amazon Connect Queues can be imported using the `instance_id` and `queue_id` separated by a colon (`:`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:connect/queue:Queue example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
 * ```
 * 
 */
@ResourceType(type="aws:connect/queue:Queue")
public class Queue extends io.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Queue.
     * 
     */
    @OutputExport(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Queue.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Specifies the description of the Queue.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Specifies the description of the Queue.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * Specifies the identifier of the Hours of Operation.
     * 
     */
    @OutputExport(name="hoursOfOperationId", type=String.class, parameters={})
    private Output<String> hoursOfOperationId;

    /**
     * @return Specifies the identifier of the Hours of Operation.
     * 
     */
    public Output<String> getHoursOfOperationId() {
        return this.hoursOfOperationId;
    }
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @OutputExport(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    public Output<String> getInstanceId() {
        return this.instanceId;
    }
    /**
     * Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
     * 
     */
    @OutputExport(name="maxContacts", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxContacts;

    /**
     * @return Specifies the maximum number of contacts that can be in the queue before it is considered full. Minimum value of 0.
     * 
     */
    public Output</* @Nullable */ Integer> getMaxContacts() {
        return this.maxContacts;
    }
    /**
     * Specifies the name of the Queue.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the Queue.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
     * 
     */
    @OutputExport(name="outboundCallerConfig", type=QueueOutboundCallerConfig.class, parameters={})
    private Output</* @Nullable */ QueueOutboundCallerConfig> outboundCallerConfig;

    /**
     * @return A block that defines the outbound caller ID name, number, and outbound whisper flow. The Outbound Caller Config block is documented below.
     * 
     */
    public Output</* @Nullable */ QueueOutboundCallerConfig> getOutboundCallerConfig() {
        return this.outboundCallerConfig;
    }
    /**
     * The identifier for the Queue.
     * 
     */
    @OutputExport(name="queueId", type=String.class, parameters={})
    private Output<String> queueId;

    /**
     * @return The identifier for the Queue.
     * 
     */
    public Output<String> getQueueId() {
        return this.queueId;
    }
    /**
     * Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
     * 
     */
    @OutputExport(name="quickConnectIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> quickConnectIds;

    /**
     * @return Specifies a list of quick connects ids that determine the quick connects available to agents who are working the queue.
     * 
     */
    public Output</* @Nullable */ List<String>> getQuickConnectIds() {
        return this.quickConnectIds;
    }
    /**
     * Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
     * 
     */
    @OutputExport(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Specifies the description of the Queue. Valid values are `ENABLED`, `DISABLED`.
     * 
     */
    public Output<String> getStatus() {
        return this.status;
    }
    /**
     * Tags to apply to the Queue. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the Queue. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @OutputExport(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
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
    public Queue(String name, QueueArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/queue:Queue", name, args == null ? QueueArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Queue(String name, Input<String> id, @Nullable QueueState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/queue:Queue", name, state, makeResourceOptions(options, id));
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
    public static Queue get(String name, Input<String> id, @Nullable QueueState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Queue(name, id, state, options);
    }
}
