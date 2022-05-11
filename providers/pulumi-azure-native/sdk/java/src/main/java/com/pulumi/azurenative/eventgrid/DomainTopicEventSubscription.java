// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.eventgrid.DomainTopicEventSubscriptionArgs;
import com.pulumi.azurenative.eventgrid.outputs.AzureFunctionEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.outputs.DeadLetterWithResourceIdentityResponse;
import com.pulumi.azurenative.eventgrid.outputs.DeliveryWithResourceIdentityResponse;
import com.pulumi.azurenative.eventgrid.outputs.EventHubEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.outputs.EventSubscriptionFilterResponse;
import com.pulumi.azurenative.eventgrid.outputs.HybridConnectionEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.outputs.PartnerEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.outputs.RetryPolicyResponse;
import com.pulumi.azurenative.eventgrid.outputs.ServiceBusQueueEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.outputs.ServiceBusTopicEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.outputs.StorageBlobDeadLetterDestinationResponse;
import com.pulumi.azurenative.eventgrid.outputs.StorageQueueEventSubscriptionDestinationResponse;
import com.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import com.pulumi.azurenative.eventgrid.outputs.WebHookEventSubscriptionDestinationResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Event Subscription
 * API Version: 2021-10-15-preview.
 * 
 * ## Example Usage
 * ### DomainTopicEventSubscriptions_CreateOrUpdate
 * 
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
 *         var domainTopicEventSubscription = new DomainTopicEventSubscription(&#34;domainTopicEventSubscription&#34;, DomainTopicEventSubscriptionArgs.builder()        
 *             .destination(Map.ofEntries(
 *                 Map.entry(&#34;endpointType&#34;, &#34;WebHook&#34;),
 *                 Map.entry(&#34;endpointUrl&#34;, &#34;https://requestb.in/15ksip71&#34;)
 *             ))
 *             .domainName(&#34;exampleDomain1&#34;)
 *             .eventSubscriptionName(&#34;exampleEventSubscriptionName1&#34;)
 *             .filter(Map.ofEntries(
 *                 Map.entry(&#34;isSubjectCaseSensitive&#34;, false),
 *                 Map.entry(&#34;subjectBeginsWith&#34;, &#34;ExamplePrefix&#34;),
 *                 Map.entry(&#34;subjectEndsWith&#34;, &#34;ExampleSuffix&#34;)
 *             ))
 *             .resourceGroupName(&#34;examplerg&#34;)
 *             .topicName(&#34;exampleDomainTopic1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventgrid:DomainTopicEventSubscription exampleEventSubscriptionName1 /subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/domains/exampleDomain1/domainTopics/exampleDomainTopic1/eventSubscriptions/exampleEventSubscriptionName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventgrid:DomainTopicEventSubscription")
public class DomainTopicEventSubscription extends com.pulumi.resources.CustomResource {
    /**
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its&#39; destination is sent to the dead letter destination.
     * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Export(name="deadLetterDestination", type=StorageBlobDeadLetterDestinationResponse.class, parameters={})
    private Output</* @Nullable */ StorageBlobDeadLetterDestinationResponse> deadLetterDestination;

    /**
     * @return The dead letter destination of the event subscription. Any event that cannot be delivered to its&#39; destination is sent to the dead letter destination.
     * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    public Output<Optional<StorageBlobDeadLetterDestinationResponse>> deadLetterDestination() {
        return Codegen.optional(this.deadLetterDestination);
    }
    /**
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its&#39; destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Export(name="deadLetterWithResourceIdentity", type=DeadLetterWithResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ DeadLetterWithResourceIdentityResponse> deadLetterWithResourceIdentity;

    /**
     * @return The dead letter destination of the event subscription. Any event that cannot be delivered to its&#39; destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    public Output<Optional<DeadLetterWithResourceIdentityResponse>> deadLetterWithResourceIdentity() {
        return Codegen.optional(this.deadLetterWithResourceIdentity);
    }
    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Export(name="deliveryWithResourceIdentity", type=DeliveryWithResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ DeliveryWithResourceIdentityResponse> deliveryWithResourceIdentity;

    /**
     * @return Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    public Output<Optional<DeliveryWithResourceIdentityResponse>> deliveryWithResourceIdentity() {
        return Codegen.optional(this.deliveryWithResourceIdentity);
    }
    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Export(name="destination", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> destination;

    /**
     * @return Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid&#39;s identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    public Output<Optional<Object>> destination() {
        return Codegen.optional(this.destination);
    }
    /**
     * The event delivery schema for the event subscription.
     * 
     */
    @Export(name="eventDeliverySchema", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventDeliverySchema;

    /**
     * @return The event delivery schema for the event subscription.
     * 
     */
    public Output<Optional<String>> eventDeliverySchema() {
        return Codegen.optional(this.eventDeliverySchema);
    }
    /**
     * Expiration time of the event subscription.
     * 
     */
    @Export(name="expirationTimeUtc", type=String.class, parameters={})
    private Output</* @Nullable */ String> expirationTimeUtc;

    /**
     * @return Expiration time of the event subscription.
     * 
     */
    public Output<Optional<String>> expirationTimeUtc() {
        return Codegen.optional(this.expirationTimeUtc);
    }
    /**
     * Information about the filter for the event subscription.
     * 
     */
    @Export(name="filter", type=EventSubscriptionFilterResponse.class, parameters={})
    private Output</* @Nullable */ EventSubscriptionFilterResponse> filter;

    /**
     * @return Information about the filter for the event subscription.
     * 
     */
    public Output<Optional<EventSubscriptionFilterResponse>> filter() {
        return Codegen.optional(this.filter);
    }
    /**
     * List of user defined labels.
     * 
     */
    @Export(name="labels", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> labels;

    /**
     * @return List of user defined labels.
     * 
     */
    public Output<Optional<List<String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provisioning state of the event subscription.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the event subscription.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The retry policy for events. This can be used to configure maximum number of delivery attempts and time to live for events.
     * 
     */
    @Export(name="retryPolicy", type=RetryPolicyResponse.class, parameters={})
    private Output</* @Nullable */ RetryPolicyResponse> retryPolicy;

    /**
     * @return The retry policy for events. This can be used to configure maximum number of delivery attempts and time to live for events.
     * 
     */
    public Output<Optional<RetryPolicyResponse>> retryPolicy() {
        return Codegen.optional(this.retryPolicy);
    }
    /**
     * The system metadata relating to Event Subscription resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to Event Subscription resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Name of the topic of the event subscription.
     * 
     */
    @Export(name="topic", type=String.class, parameters={})
    private Output<String> topic;

    /**
     * @return Name of the topic of the event subscription.
     * 
     */
    public Output<String> topic() {
        return this.topic;
    }
    /**
     * Type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainTopicEventSubscription(String name) {
        this(name, DomainTopicEventSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainTopicEventSubscription(String name, DomainTopicEventSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainTopicEventSubscription(String name, DomainTopicEventSubscriptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:DomainTopicEventSubscription", name, args == null ? DomainTopicEventSubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainTopicEventSubscription(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:DomainTopicEventSubscription", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:eventgrid/v20211015preview:DomainTopicEventSubscription").build())
            ))
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
    public static DomainTopicEventSubscription get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainTopicEventSubscription(name, id, options);
    }
}
