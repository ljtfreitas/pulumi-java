// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.neptune;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.neptune.EventSubscriptionArgs;
import com.pulumi.aws.neptune.inputs.EventSubscriptionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var defaultCluster = new Cluster(&#34;defaultCluster&#34;, ClusterArgs.builder()        
 *             .clusterIdentifier(&#34;neptune-cluster-demo&#34;)
 *             .engine(&#34;neptune&#34;)
 *             .backupRetentionPeriod(5)
 *             .preferredBackupWindow(&#34;07:00-09:00&#34;)
 *             .skipFinalSnapshot(true)
 *             .iamDatabaseAuthenticationEnabled(&#34;true&#34;)
 *             .applyImmediately(&#34;true&#34;)
 *             .build());
 * 
 *         var example = new ClusterInstance(&#34;example&#34;, ClusterInstanceArgs.builder()        
 *             .clusterIdentifier(defaultCluster.getId())
 *             .engine(&#34;neptune&#34;)
 *             .instanceClass(&#34;db.r4.large&#34;)
 *             .applyImmediately(&#34;true&#34;)
 *             .build());
 * 
 *         var defaultTopic = new Topic(&#34;defaultTopic&#34;);
 * 
 *         var defaultEventSubscription = new EventSubscription(&#34;defaultEventSubscription&#34;, EventSubscriptionArgs.builder()        
 *             .snsTopicArn(defaultTopic.getArn())
 *             .sourceType(&#34;db-instance&#34;)
 *             .sourceIds(example.getId())
 *             .eventCategories(            
 *                 &#34;maintenance&#34;,
 *                 &#34;availability&#34;,
 *                 &#34;creation&#34;,
 *                 &#34;backup&#34;,
 *                 &#34;restoration&#34;,
 *                 &#34;recovery&#34;,
 *                 &#34;deletion&#34;,
 *                 &#34;failover&#34;,
 *                 &#34;failure&#34;,
 *                 &#34;notification&#34;,
 *                 &#34;configuration change&#34;,
 *                 &#34;read replica&#34;)
 *             .tags(Map.of(&#34;env&#34;, &#34;test&#34;))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_neptune_event_subscription` can be imported by using the event subscription name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:neptune/eventSubscription:EventSubscription example my-event-subscription
 * ```
 * 
 */
@ResourceType(type="aws:neptune/eventSubscription:EventSubscription")
public class EventSubscription extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name of the Neptune event notification subscription.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name of the Neptune event notification subscription.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The AWS customer account associated with the Neptune event notification subscription.
     * 
     */
    @Export(name="customerAwsId", type=String.class, parameters={})
    private Output<String> customerAwsId;

    /**
     * @return The AWS customer account associated with the Neptune event notification subscription.
     * 
     */
    public Output<String> customerAwsId() {
        return this.customerAwsId;
    }
    /**
     * A boolean flag to enable/disable the subscription. Defaults to true.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return A boolean flag to enable/disable the subscription. Defaults to true.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * A list of event categories for a `source_type` that you want to subscribe to. Run `aws neptune describe-event-categories` to find all the event categories.
     * 
     */
    @Export(name="eventCategories", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> eventCategories;

    /**
     * @return A list of event categories for a `source_type` that you want to subscribe to. Run `aws neptune describe-event-categories` to find all the event categories.
     * 
     */
    public Output<Optional<List<String>>> eventCategories() {
        return Codegen.optional(this.eventCategories);
    }
    /**
     * The name of the Neptune event subscription. By default generated by this provider.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Neptune event subscription. By default generated by this provider.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the Neptune event subscription. Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return The name of the Neptune event subscription. Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * The ARN of the SNS topic to send events to.
     * 
     */
    @Export(name="snsTopicArn", type=String.class, parameters={})
    private Output<String> snsTopicArn;

    /**
     * @return The ARN of the SNS topic to send events to.
     * 
     */
    public Output<String> snsTopicArn() {
        return this.snsTopicArn;
    }
    /**
     * A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a `source_type` must also be specified.
     * 
     */
    @Export(name="sourceIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> sourceIds;

    /**
     * @return A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a `source_type` must also be specified.
     * 
     */
    public Output<Optional<List<String>>> sourceIds() {
        return Codegen.optional(this.sourceIds);
    }
    /**
     * The type of source that will be generating the events. Valid options are `db-instance`, `db-security-group`, `db-parameter-group`, `db-snapshot`, `db-cluster` or `db-cluster-snapshot`. If not set, all sources will be subscribed to.
     * 
     */
    @Export(name="sourceType", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceType;

    /**
     * @return The type of source that will be generating the events. Valid options are `db-instance`, `db-security-group`, `db-parameter-group`, `db-snapshot`, `db-cluster` or `db-cluster-snapshot`. If not set, all sources will be subscribed to.
     * 
     */
    public Output<Optional<String>> sourceType() {
        return Codegen.optional(this.sourceType);
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventSubscription(String name) {
        this(name, EventSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventSubscription(String name, EventSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventSubscription(String name, EventSubscriptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/eventSubscription:EventSubscription", name, args == null ? EventSubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventSubscription(String name, Output<String> id, @Nullable EventSubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:neptune/eventSubscription:EventSubscription", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static EventSubscription get(String name, Output<String> id, @Nullable EventSubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventSubscription(name, id, state, options);
    }
}
