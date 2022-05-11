// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.eventhub.QueueArgs;
import com.pulumi.azure.eventhub.inputs.QueueState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a ServiceBus Queue.
 * 
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
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleNamespace = new Namespace(&#34;exampleNamespace&#34;, NamespaceArgs.builder()        
 *             .location(exampleResourceGroup.getLocation())
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .sku(&#34;Standard&#34;)
 *             .tags(Map.of(&#34;source&#34;, &#34;example&#34;))
 *             .build());
 * 
 *         var exampleQueue = new Queue(&#34;exampleQueue&#34;, QueueArgs.builder()        
 *             .namespaceId(exampleNamespace.getId())
 *             .enablePartitioning(true)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Service Bus Queue can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:eventhub/queue:Queue example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/microsoft.servicebus/namespaces/sbns1/queues/snqueue1
 * ```
 * 
 * @deprecated
 * azure.eventhub.Queue has been deprecated in favor of azure.servicebus.Queue
 * 
 */
@Deprecated /* azure.eventhub.Queue has been deprecated in favor of azure.servicebus.Queue */
@ResourceType(type="azure:eventhub/queue:Queue")
public class Queue extends com.pulumi.resources.CustomResource {
    /**
     * The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
     * 
     */
    @Export(name="autoDeleteOnIdle", type=String.class, parameters={})
    private Output<String> autoDeleteOnIdle;

    /**
     * @return The ISO 8601 timespan duration of the idle interval after which the Queue is automatically deleted, minimum of 5 minutes.
     * 
     */
    public Output<String> autoDeleteOnIdle() {
        return this.autoDeleteOnIdle;
    }
    /**
     * Boolean flag which controls whether the Queue has dead letter support when a message expires. Defaults to `false`.
     * 
     */
    @Export(name="deadLetteringOnMessageExpiration", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> deadLetteringOnMessageExpiration;

    /**
     * @return Boolean flag which controls whether the Queue has dead letter support when a message expires. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> deadLetteringOnMessageExpiration() {
        return Codegen.optional(this.deadLetteringOnMessageExpiration);
    }
    /**
     * The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on message itself.
     * 
     */
    @Export(name="defaultMessageTtl", type=String.class, parameters={})
    private Output<String> defaultMessageTtl;

    /**
     * @return The ISO 8601 timespan duration of the TTL of messages sent to this queue. This is the default value used when TTL is not set on message itself.
     * 
     */
    public Output<String> defaultMessageTtl() {
        return this.defaultMessageTtl;
    }
    /**
     * The ISO 8601 timespan duration during which duplicates can be detected. Defaults to 10 minutes (`PT10M`).
     * 
     */
    @Export(name="duplicateDetectionHistoryTimeWindow", type=String.class, parameters={})
    private Output<String> duplicateDetectionHistoryTimeWindow;

    /**
     * @return The ISO 8601 timespan duration during which duplicates can be detected. Defaults to 10 minutes (`PT10M`).
     * 
     */
    public Output<String> duplicateDetectionHistoryTimeWindow() {
        return this.duplicateDetectionHistoryTimeWindow;
    }
    /**
     * Boolean flag which controls whether server-side batched operations are enabled. Defaults to `true`.
     * 
     */
    @Export(name="enableBatchedOperations", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableBatchedOperations;

    /**
     * @return Boolean flag which controls whether server-side batched operations are enabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> enableBatchedOperations() {
        return Codegen.optional(this.enableBatchedOperations);
    }
    /**
     * Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `false`.
     * 
     */
    @Export(name="enableExpress", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableExpress;

    /**
     * @return Boolean flag which controls whether Express Entities are enabled. An express queue holds a message in memory temporarily before writing it to persistent storage. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `false`.
     * 
     */
    public Output<Optional<Boolean>> enableExpress() {
        return Codegen.optional(this.enableExpress);
    }
    /**
     * Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers. Changing this forces a new resource to be created. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `true`.
     * 
     */
    @Export(name="enablePartitioning", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enablePartitioning;

    /**
     * @return Boolean flag which controls whether to enable the queue to be partitioned across multiple message brokers. Changing this forces a new resource to be created. Defaults to `false` for Basic and Standard. For Premium, it MUST be set to `true`.
     * 
     */
    public Output<Optional<Boolean>> enablePartitioning() {
        return Codegen.optional(this.enablePartitioning);
    }
    /**
     * The name of a Queue or Topic to automatically forward dead lettered messages to.
     * 
     */
    @Export(name="forwardDeadLetteredMessagesTo", type=String.class, parameters={})
    private Output</* @Nullable */ String> forwardDeadLetteredMessagesTo;

    /**
     * @return The name of a Queue or Topic to automatically forward dead lettered messages to.
     * 
     */
    public Output<Optional<String>> forwardDeadLetteredMessagesTo() {
        return Codegen.optional(this.forwardDeadLetteredMessagesTo);
    }
    /**
     * The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
     * 
     */
    @Export(name="forwardTo", type=String.class, parameters={})
    private Output</* @Nullable */ String> forwardTo;

    /**
     * @return The name of a Queue or Topic to automatically forward messages to. Please [see the documentation](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-auto-forwarding) for more information.
     * 
     */
    public Output<Optional<String>> forwardTo() {
        return Codegen.optional(this.forwardTo);
    }
    /**
     * The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. Maximum value is 5 minutes. Defaults to 1 minute (`PT1M`).
     * 
     */
    @Export(name="lockDuration", type=String.class, parameters={})
    private Output<String> lockDuration;

    /**
     * @return The ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the message is locked for other receivers. Maximum value is 5 minutes. Defaults to 1 minute (`PT1M`).
     * 
     */
    public Output<String> lockDuration() {
        return this.lockDuration;
    }
    /**
     * Integer value which controls when a message is automatically dead lettered. Defaults to `10`.
     * 
     */
    @Export(name="maxDeliveryCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxDeliveryCount;

    /**
     * @return Integer value which controls when a message is automatically dead lettered. Defaults to `10`.
     * 
     */
    public Output<Optional<Integer>> maxDeliveryCount() {
        return Codegen.optional(this.maxDeliveryCount);
    }
    /**
     * Integer value which controls the maximum size of
     * a message allowed on the queue for Premium SKU. For supported values see the &#34;Large messages support&#34;
     * section of [this document](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview).
     * 
     */
    @Export(name="maxMessageSizeInKilobytes", type=Integer.class, parameters={})
    private Output<Integer> maxMessageSizeInKilobytes;

    /**
     * @return Integer value which controls the maximum size of
     * a message allowed on the queue for Premium SKU. For supported values see the &#34;Large messages support&#34;
     * section of [this document](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-premium-messaging#large-messages-support-preview).
     * 
     */
    public Output<Integer> maxMessageSizeInKilobytes() {
        return this.maxMessageSizeInKilobytes;
    }
    /**
     * Integer value which controls the size of memory allocated for the queue. For supported values see the &#34;Queue or topic size&#34; section of [Service Bus Quotas](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-quotas). Defaults to `1024`.
     * 
     */
    @Export(name="maxSizeInMegabytes", type=Integer.class, parameters={})
    private Output<Integer> maxSizeInMegabytes;

    /**
     * @return Integer value which controls the size of memory allocated for the queue. For supported values see the &#34;Queue or topic size&#34; section of [Service Bus Quotas](https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-quotas). Defaults to `1024`.
     * 
     */
    public Output<Integer> maxSizeInMegabytes() {
        return this.maxSizeInMegabytes;
    }
    /**
     * Specifies the name of the ServiceBus Queue resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the ServiceBus Queue resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the ServiceBus Namespace to create this queue in. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="namespaceId", type=String.class, parameters={})
    private Output<String> namespaceId;

    /**
     * @return The ID of the ServiceBus Namespace to create this queue in. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }
    @Export(name="namespaceName", type=String.class, parameters={})
    private Output<String> namespaceName;

    public Output<String> namespaceName() {
        return this.namespaceName;
    }
    /**
     * Boolean flag which controls whether the Queue requires duplicate detection. Changing this forces a new resource to be created. Defaults to `false`.
     * 
     */
    @Export(name="requiresDuplicateDetection", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requiresDuplicateDetection;

    /**
     * @return Boolean flag which controls whether the Queue requires duplicate detection. Changing this forces a new resource to be created. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> requiresDuplicateDetection() {
        return Codegen.optional(this.requiresDuplicateDetection);
    }
    /**
     * Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages. Changing this forces a new resource to be created. Defaults to `false`.
     * 
     */
    @Export(name="requiresSession", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requiresSession;

    /**
     * @return Boolean flag which controls whether the Queue requires sessions. This will allow ordered handling of unbounded sequences of related messages. With sessions enabled a queue can guarantee first-in-first-out delivery of messages. Changing this forces a new resource to be created. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> requiresSession() {
        return Codegen.optional(this.requiresSession);
    }
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`. Note that `Restoring` is not accepted. Defaults to `Active`.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output</* @Nullable */ String> status;

    /**
     * @return The status of the Queue. Possible values are `Active`, `Creating`, `Deleting`, `Disabled`, `ReceiveDisabled`, `Renaming`, `SendDisabled`, `Unknown`. Note that `Restoring` is not accepted. Defaults to `Active`.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Queue(String name) {
        this(name, QueueArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Queue(String name, QueueArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Queue(String name, QueueArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/queue:Queue", name, args == null ? QueueArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Queue(String name, Output<String> id, @Nullable QueueState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:eventhub/queue:Queue", name, state, makeResourceOptions(options, id));
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
    public static Queue get(String name, Output<String> id, @Nullable QueueState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Queue(name, id, state, options);
    }
}
