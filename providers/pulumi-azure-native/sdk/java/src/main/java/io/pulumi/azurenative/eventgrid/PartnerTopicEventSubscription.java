// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.eventgrid.PartnerTopicEventSubscriptionArgs;
import io.pulumi.azurenative.eventgrid.outputs.AzureFunctionEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.DeadLetterWithResourceIdentityResponse;
import io.pulumi.azurenative.eventgrid.outputs.DeliveryWithResourceIdentityResponse;
import io.pulumi.azurenative.eventgrid.outputs.EventHubEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.EventSubscriptionFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.HybridConnectionEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.RetryPolicyResponse;
import io.pulumi.azurenative.eventgrid.outputs.ServiceBusQueueEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.ServiceBusTopicEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.StorageBlobDeadLetterDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.StorageQueueEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import io.pulumi.azurenative.eventgrid.outputs.WebHookEventSubscriptionDestinationResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Event Subscription
 * API Version: 2020-04-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventgrid:PartnerTopicEventSubscription exampleEventSubscriptionName1 /subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/partnerTopics/examplePartnerTopic1/eventSubscriptions/exampleEventSubscriptionName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventgrid:PartnerTopicEventSubscription")
public class PartnerTopicEventSubscription extends io.pulumi.resources.CustomResource {
    /**
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Export(name="deadLetterDestination", type=StorageBlobDeadLetterDestinationResponse.class, parameters={})
    private Output</* @Nullable */ StorageBlobDeadLetterDestinationResponse> deadLetterDestination;

    /**
     * @return The dead letter destination of the event subscription. Any event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    public Output</* @Nullable */ StorageBlobDeadLetterDestinationResponse> getDeadLetterDestination() {
        return this.deadLetterDestination;
    }
    /**
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Export(name="deadLetterWithResourceIdentity", type=DeadLetterWithResourceIdentityResponse.class, parameters={})
    private Output</* @Nullable */ DeadLetterWithResourceIdentityResponse> deadLetterWithResourceIdentity;

    /**
     * @return The dead letter destination of the event subscription. Any event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    public Output</* @Nullable */ DeadLetterWithResourceIdentityResponse> getDeadLetterWithResourceIdentity() {
        return this.deadLetterWithResourceIdentity;
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
    public Output</* @Nullable */ DeliveryWithResourceIdentityResponse> getDeliveryWithResourceIdentity() {
        return this.deliveryWithResourceIdentity;
    }
    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    @Export(name="destination", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> destination;

    /**
     * @return Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    public Output</* @Nullable */ Object> getDestination() {
        return this.destination;
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
    public Output</* @Nullable */ String> getEventDeliverySchema() {
        return this.eventDeliverySchema;
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
    public Output</* @Nullable */ String> getExpirationTimeUtc() {
        return this.expirationTimeUtc;
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
    public Output</* @Nullable */ EventSubscriptionFilterResponse> getFilter() {
        return this.filter;
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
    public Output</* @Nullable */ List<String>> getLabels() {
        return this.labels;
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
    public Output<String> getName() {
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
    public Output<String> getProvisioningState() {
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
    public Output</* @Nullable */ RetryPolicyResponse> getRetryPolicy() {
        return this.retryPolicy;
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
    public Output<SystemDataResponse> getSystemData() {
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
    public Output<String> getTopic() {
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
    public Output<String> getType() {
        return this.type;
    }

    public interface BuilderApplicator {
        public void apply(PartnerTopicEventSubscriptionArgs.Builder a);
    }
    private static io.pulumi.azurenative.eventgrid.PartnerTopicEventSubscriptionArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.azurenative.eventgrid.PartnerTopicEventSubscriptionArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public PartnerTopicEventSubscription(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PartnerTopicEventSubscription(String name) {
        this(name, PartnerTopicEventSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PartnerTopicEventSubscription(String name, PartnerTopicEventSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PartnerTopicEventSubscription(String name, PartnerTopicEventSubscriptionArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:PartnerTopicEventSubscription", name, args == null ? PartnerTopicEventSubscriptionArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private PartnerTopicEventSubscription(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:PartnerTopicEventSubscription", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Output.of(Alias.builder().setType("azure-native:eventgrid/v20200401preview:PartnerTopicEventSubscription").build()),
                Output.of(Alias.builder().setType("azure-native:eventgrid/v20201015preview:PartnerTopicEventSubscription").build()),
                Output.of(Alias.builder().setType("azure-native:eventgrid/v20210601preview:PartnerTopicEventSubscription").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PartnerTopicEventSubscription get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PartnerTopicEventSubscription(name, id, options);
    }
}
