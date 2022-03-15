// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

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
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPartnerTopicEventSubscriptionResult {
    /**
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    private final @Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination;
    /**
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    private final @Nullable DeadLetterWithResourceIdentityResponse deadLetterWithResourceIdentity;
    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    private final @Nullable DeliveryWithResourceIdentityResponse deliveryWithResourceIdentity;
    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
     */
    private final @Nullable Object destination;
    /**
     * The event delivery schema for the event subscription.
     * 
     */
    private final @Nullable String eventDeliverySchema;
    /**
     * Expiration time of the event subscription.
     * 
     */
    private final @Nullable String expirationTimeUtc;
    /**
     * Information about the filter for the event subscription.
     * 
     */
    private final @Nullable EventSubscriptionFilterResponse filter;
    /**
     * Fully qualified identifier of the resource.
     * 
     */
    private final String id;
    /**
     * List of user defined labels.
     * 
     */
    private final @Nullable List<String> labels;
    /**
     * Name of the resource.
     * 
     */
    private final String name;
    /**
     * Provisioning state of the event subscription.
     * 
     */
    private final String provisioningState;
    /**
     * The retry policy for events. This can be used to configure maximum number of delivery attempts and time to live for events.
     * 
     */
    private final @Nullable RetryPolicyResponse retryPolicy;
    /**
     * The system metadata relating to Event Subscription resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Name of the topic of the event subscription.
     * 
     */
    private final String topic;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetPartnerTopicEventSubscriptionResult(
        @CustomType.Parameter("deadLetterDestination") @Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination,
        @CustomType.Parameter("deadLetterWithResourceIdentity") @Nullable DeadLetterWithResourceIdentityResponse deadLetterWithResourceIdentity,
        @CustomType.Parameter("deliveryWithResourceIdentity") @Nullable DeliveryWithResourceIdentityResponse deliveryWithResourceIdentity,
        @CustomType.Parameter("destination") @Nullable Object destination,
        @CustomType.Parameter("eventDeliverySchema") @Nullable String eventDeliverySchema,
        @CustomType.Parameter("expirationTimeUtc") @Nullable String expirationTimeUtc,
        @CustomType.Parameter("filter") @Nullable EventSubscriptionFilterResponse filter,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("labels") @Nullable List<String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("retryPolicy") @Nullable RetryPolicyResponse retryPolicy,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("topic") String topic,
        @CustomType.Parameter("type") String type) {
        this.deadLetterDestination = deadLetterDestination;
        this.deadLetterWithResourceIdentity = deadLetterWithResourceIdentity;
        this.deliveryWithResourceIdentity = deliveryWithResourceIdentity;
        this.destination = destination;
        this.eventDeliverySchema = eventDeliverySchema;
        this.expirationTimeUtc = expirationTimeUtc;
        this.filter = filter;
        this.id = id;
        this.labels = labels;
        this.name = name;
        this.provisioningState = provisioningState;
        this.retryPolicy = retryPolicy;
        this.systemData = systemData;
        this.topic = topic;
        this.type = type;
    }

    /**
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
    */
    public Optional<StorageBlobDeadLetterDestinationResponse> getDeadLetterDestination() {
        return Optional.ofNullable(this.deadLetterDestination);
    }
    /**
     * The dead letter destination of the event subscription. Any event that cannot be delivered to its' destination is sent to the dead letter destination.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
    */
    public Optional<DeadLetterWithResourceIdentityResponse> getDeadLetterWithResourceIdentity() {
        return Optional.ofNullable(this.deadLetterWithResourceIdentity);
    }
    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses the managed identity setup on the parent resource (namely, topic or domain) to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
    */
    public Optional<DeliveryWithResourceIdentityResponse> getDeliveryWithResourceIdentity() {
        return Optional.ofNullable(this.deliveryWithResourceIdentity);
    }
    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * Uses Azure Event Grid's identity to acquire the authentication tokens being used during delivery / dead-lettering.
     * 
    */
    public Optional<Object> getDestination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * The event delivery schema for the event subscription.
     * 
    */
    public Optional<String> getEventDeliverySchema() {
        return Optional.ofNullable(this.eventDeliverySchema);
    }
    /**
     * Expiration time of the event subscription.
     * 
    */
    public Optional<String> getExpirationTimeUtc() {
        return Optional.ofNullable(this.expirationTimeUtc);
    }
    /**
     * Information about the filter for the event subscription.
     * 
    */
    public Optional<EventSubscriptionFilterResponse> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * Fully qualified identifier of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * List of user defined labels.
     * 
    */
    public List<String> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * Name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the event subscription.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The retry policy for events. This can be used to configure maximum number of delivery attempts and time to live for events.
     * 
    */
    public Optional<RetryPolicyResponse> getRetryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    /**
     * The system metadata relating to Event Subscription resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Name of the topic of the event subscription.
     * 
    */
    public String getTopic() {
        return this.topic;
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPartnerTopicEventSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination;
        private @Nullable DeadLetterWithResourceIdentityResponse deadLetterWithResourceIdentity;
        private @Nullable DeliveryWithResourceIdentityResponse deliveryWithResourceIdentity;
        private @Nullable Object destination;
        private @Nullable String eventDeliverySchema;
        private @Nullable String expirationTimeUtc;
        private @Nullable EventSubscriptionFilterResponse filter;
        private String id;
        private @Nullable List<String> labels;
        private String name;
        private String provisioningState;
        private @Nullable RetryPolicyResponse retryPolicy;
        private SystemDataResponse systemData;
        private String topic;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPartnerTopicEventSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deadLetterDestination = defaults.deadLetterDestination;
    	      this.deadLetterWithResourceIdentity = defaults.deadLetterWithResourceIdentity;
    	      this.deliveryWithResourceIdentity = defaults.deliveryWithResourceIdentity;
    	      this.destination = defaults.destination;
    	      this.eventDeliverySchema = defaults.eventDeliverySchema;
    	      this.expirationTimeUtc = defaults.expirationTimeUtc;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.systemData = defaults.systemData;
    	      this.topic = defaults.topic;
    	      this.type = defaults.type;
        }

        public Builder deadLetterDestination(@Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination) {
            this.deadLetterDestination = deadLetterDestination;
            return this;
        }

        public Builder deadLetterWithResourceIdentity(@Nullable DeadLetterWithResourceIdentityResponse deadLetterWithResourceIdentity) {
            this.deadLetterWithResourceIdentity = deadLetterWithResourceIdentity;
            return this;
        }

        public Builder deliveryWithResourceIdentity(@Nullable DeliveryWithResourceIdentityResponse deliveryWithResourceIdentity) {
            this.deliveryWithResourceIdentity = deliveryWithResourceIdentity;
            return this;
        }

        public Builder destination(@Nullable Object destination) {
            this.destination = destination;
            return this;
        }

        public Builder eventDeliverySchema(@Nullable String eventDeliverySchema) {
            this.eventDeliverySchema = eventDeliverySchema;
            return this;
        }

        public Builder expirationTimeUtc(@Nullable String expirationTimeUtc) {
            this.expirationTimeUtc = expirationTimeUtc;
            return this;
        }

        public Builder filter(@Nullable EventSubscriptionFilterResponse filter) {
            this.filter = filter;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder labels(@Nullable List<String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder retryPolicy(@Nullable RetryPolicyResponse retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPartnerTopicEventSubscriptionResult build() {
            return new GetPartnerTopicEventSubscriptionResult(deadLetterDestination, deadLetterWithResourceIdentity, deliveryWithResourceIdentity, destination, eventDeliverySchema, expirationTimeUtc, filter, id, labels, name, provisioningState, retryPolicy, systemData, topic, type);
        }
    }
}
