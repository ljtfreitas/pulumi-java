// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub.v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.pubsub.v1beta2.SubscriptionArgs;
import com.pulumi.googlenative.pubsub.v1beta2.outputs.PushConfigResponse;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a subscription to a given topic. If the subscription already exists, returns `ALREADY_EXISTS`. If the corresponding topic doesn&#39;t exist, returns `NOT_FOUND`. If the name is not provided in the request, the server will assign a random name for this subscription on the same project as the topic. Note that for REST API requests, you must specify a name.
 * 
 */
@ResourceType(type="google-native:pubsub/v1beta2:Subscription")
public class Subscription extends com.pulumi.resources.CustomResource {
    /**
     * This value is the maximum time after a subscriber receives a message before the subscriber should acknowledge the message. After message delivery but before the ack deadline expires and before the message is acknowledged, it is an outstanding message and will not be delivered again during that time (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using pull. The maximum custom deadline you can specify is 600 seconds (10 minutes). For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message. If this parameter is 0, a default value of 10 seconds is used.
     * 
     */
    @Export(name="ackDeadlineSeconds", type=Integer.class, parameters={})
    private Output<Integer> ackDeadlineSeconds;

    /**
     * @return This value is the maximum time after a subscriber receives a message before the subscriber should acknowledge the message. After message delivery but before the ack deadline expires and before the message is acknowledged, it is an outstanding message and will not be delivered again during that time (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using pull. The maximum custom deadline you can specify is 600 seconds (10 minutes). For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message. If this parameter is 0, a default value of 10 seconds is used.
     * 
     */
    public Output<Integer> ackDeadlineSeconds() {
        return this.ackDeadlineSeconds;
    }
    /**
     * The name of the subscription. It must have the format `&#34;projects/{project}/subscriptions/{subscription}&#34;`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `&#34;goog&#34;`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the subscription. It must have the format `&#34;projects/{project}/subscriptions/{subscription}&#34;`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `&#34;goog&#34;`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * If push delivery is used with this subscription, this field is used to configure it. An empty `pushConfig` signifies that the subscriber will pull and ack messages using API methods.
     * 
     */
    @Export(name="pushConfig", type=PushConfigResponse.class, parameters={})
    private Output<PushConfigResponse> pushConfig;

    /**
     * @return If push delivery is used with this subscription, this field is used to configure it. An empty `pushConfig` signifies that the subscriber will pull and ack messages using API methods.
     * 
     */
    public Output<PushConfigResponse> pushConfig() {
        return this.pushConfig;
    }
    @Export(name="subscriptionId", type=String.class, parameters={})
    private Output<String> subscriptionId;

    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }
    /**
     * The name of the topic from which this subscription is receiving messages. The value of this field will be `_deleted-topic_` if the topic has been deleted.
     * 
     */
    @Export(name="topic", type=String.class, parameters={})
    private Output<String> topic;

    /**
     * @return The name of the topic from which this subscription is receiving messages. The value of this field will be `_deleted-topic_` if the topic has been deleted.
     * 
     */
    public Output<String> topic() {
        return this.topic;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subscription(String name) {
        this(name, SubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subscription(String name, SubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subscription(String name, SubscriptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:pubsub/v1beta2:Subscription", name, args == null ? SubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Subscription(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:pubsub/v1beta2:Subscription", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Subscription get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Subscription(name, id, options);
    }
}
