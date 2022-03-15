// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventHubStreamInputDataSourceResponse {
    /**
     * The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub. If not specified, the input uses the Event Hub’s default consumer group.
     * 
     */
    private final @Nullable String consumerGroupName;
    /**
     * The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String eventHubName;
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String serviceBusNamespace;
    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String sharedAccessPolicyKey;
    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable String sharedAccessPolicyName;
    /**
     * Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.ServiceBus/EventHub'.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private EventHubStreamInputDataSourceResponse(
        @CustomType.Parameter("consumerGroupName") @Nullable String consumerGroupName,
        @CustomType.Parameter("eventHubName") @Nullable String eventHubName,
        @CustomType.Parameter("serviceBusNamespace") @Nullable String serviceBusNamespace,
        @CustomType.Parameter("sharedAccessPolicyKey") @Nullable String sharedAccessPolicyKey,
        @CustomType.Parameter("sharedAccessPolicyName") @Nullable String sharedAccessPolicyName,
        @CustomType.Parameter("type") String type) {
        this.consumerGroupName = consumerGroupName;
        this.eventHubName = eventHubName;
        this.serviceBusNamespace = serviceBusNamespace;
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        this.type = type;
    }

    /**
     * The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub. If not specified, the input uses the Event Hub’s default consumer group.
     * 
    */
    public Optional<String> getConsumerGroupName() {
        return Optional.ofNullable(this.consumerGroupName);
    }
    /**
     * The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getEventHubName() {
        return Optional.ofNullable(this.eventHubName);
    }
    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getServiceBusNamespace() {
        return Optional.ofNullable(this.serviceBusNamespace);
    }
    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getSharedAccessPolicyKey() {
        return Optional.ofNullable(this.sharedAccessPolicyKey);
    }
    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<String> getSharedAccessPolicyName() {
        return Optional.ofNullable(this.sharedAccessPolicyName);
    }
    /**
     * Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.ServiceBus/EventHub'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubStreamInputDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String consumerGroupName;
        private @Nullable String eventHubName;
        private @Nullable String serviceBusNamespace;
        private @Nullable String sharedAccessPolicyKey;
        private @Nullable String sharedAccessPolicyName;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubStreamInputDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerGroupName = defaults.consumerGroupName;
    	      this.eventHubName = defaults.eventHubName;
    	      this.serviceBusNamespace = defaults.serviceBusNamespace;
    	      this.sharedAccessPolicyKey = defaults.sharedAccessPolicyKey;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.type = defaults.type;
        }

        public Builder consumerGroupName(@Nullable String consumerGroupName) {
            this.consumerGroupName = consumerGroupName;
            return this;
        }

        public Builder eventHubName(@Nullable String eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }

        public Builder serviceBusNamespace(@Nullable String serviceBusNamespace) {
            this.serviceBusNamespace = serviceBusNamespace;
            return this;
        }

        public Builder sharedAccessPolicyKey(@Nullable String sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        public Builder sharedAccessPolicyName(@Nullable String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public EventHubStreamInputDataSourceResponse build() {
            return new EventHubStreamInputDataSourceResponse(consumerGroupName, eventHubName, serviceBusNamespace, sharedAccessPolicyKey, sharedAccessPolicyName, type);
        }
    }
}
