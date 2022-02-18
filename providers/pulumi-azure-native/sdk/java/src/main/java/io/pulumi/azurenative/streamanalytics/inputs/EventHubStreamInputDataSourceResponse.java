// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes an Event Hub input data source that contains stream data.
 * 
 */
public final class EventHubStreamInputDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final EventHubStreamInputDataSourceResponse Empty = new EventHubStreamInputDataSourceResponse();

    /**
     * The name of an Event Hub Consumer Group that should be used to read events from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to receive the same events from the Event Hub. If not specified, the input uses the Event Hub’s default consumer group.
     * 
     */
    @InputImport(name="consumerGroupName")
    private final @Nullable String consumerGroupName;

    public Optional<String> getConsumerGroupName() {
        return this.consumerGroupName == null ? Optional.empty() : Optional.ofNullable(this.consumerGroupName);
    }

    /**
     * The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="eventHubName")
    private final @Nullable String eventHubName;

    public Optional<String> getEventHubName() {
        return this.eventHubName == null ? Optional.empty() : Optional.ofNullable(this.eventHubName);
    }

    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="serviceBusNamespace")
    private final @Nullable String serviceBusNamespace;

    public Optional<String> getServiceBusNamespace() {
        return this.serviceBusNamespace == null ? Optional.empty() : Optional.ofNullable(this.serviceBusNamespace);
    }

    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="sharedAccessPolicyKey")
    private final @Nullable String sharedAccessPolicyKey;

    public Optional<String> getSharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey == null ? Optional.empty() : Optional.ofNullable(this.sharedAccessPolicyKey);
    }

    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="sharedAccessPolicyName")
    private final @Nullable String sharedAccessPolicyName;

    public Optional<String> getSharedAccessPolicyName() {
        return this.sharedAccessPolicyName == null ? Optional.empty() : Optional.ofNullable(this.sharedAccessPolicyName);
    }

    /**
     * Indicates the type of input data source containing stream data. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.ServiceBus/EventHub'.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public EventHubStreamInputDataSourceResponse(
        @Nullable String consumerGroupName,
        @Nullable String eventHubName,
        @Nullable String serviceBusNamespace,
        @Nullable String sharedAccessPolicyKey,
        @Nullable String sharedAccessPolicyName,
        String type) {
        this.consumerGroupName = consumerGroupName;
        this.eventHubName = eventHubName;
        this.serviceBusNamespace = serviceBusNamespace;
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EventHubStreamInputDataSourceResponse() {
        this.consumerGroupName = null;
        this.eventHubName = null;
        this.serviceBusNamespace = null;
        this.sharedAccessPolicyKey = null;
        this.sharedAccessPolicyName = null;
        this.type = null;
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

        public Builder setConsumerGroupName(@Nullable String consumerGroupName) {
            this.consumerGroupName = consumerGroupName;
            return this;
        }

        public Builder setEventHubName(@Nullable String eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }

        public Builder setServiceBusNamespace(@Nullable String serviceBusNamespace) {
            this.serviceBusNamespace = serviceBusNamespace;
            return this;
        }

        public Builder setSharedAccessPolicyKey(@Nullable String sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        public Builder setSharedAccessPolicyName(@Nullable String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public EventHubStreamInputDataSourceResponse build() {
            return new EventHubStreamInputDataSourceResponse(consumerGroupName, eventHubName, serviceBusNamespace, sharedAccessPolicyKey, sharedAccessPolicyName, type);
        }
    }
}
