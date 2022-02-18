// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes an Event Hub output data source.
 * 
 */
public final class EventHubOutputDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHubOutputDataSourceArgs Empty = new EventHubOutputDataSourceArgs();

    /**
     * The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="eventHubName")
    private final @Nullable Input<String> eventHubName;

    public Input<String> getEventHubName() {
        return this.eventHubName == null ? Input.empty() : this.eventHubName;
    }

    /**
     * The key/column that is used to determine to which partition to send event data.
     * 
     */
    @InputImport(name="partitionKey")
    private final @Nullable Input<String> partitionKey;

    public Input<String> getPartitionKey() {
        return this.partitionKey == null ? Input.empty() : this.partitionKey;
    }

    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="serviceBusNamespace")
    private final @Nullable Input<String> serviceBusNamespace;

    public Input<String> getServiceBusNamespace() {
        return this.serviceBusNamespace == null ? Input.empty() : this.serviceBusNamespace;
    }

    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="sharedAccessPolicyKey")
    private final @Nullable Input<String> sharedAccessPolicyKey;

    public Input<String> getSharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey == null ? Input.empty() : this.sharedAccessPolicyKey;
    }

    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @InputImport(name="sharedAccessPolicyName")
    private final @Nullable Input<String> sharedAccessPolicyName;

    public Input<String> getSharedAccessPolicyName() {
        return this.sharedAccessPolicyName == null ? Input.empty() : this.sharedAccessPolicyName;
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.ServiceBus/EventHub'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public EventHubOutputDataSourceArgs(
        @Nullable Input<String> eventHubName,
        @Nullable Input<String> partitionKey,
        @Nullable Input<String> serviceBusNamespace,
        @Nullable Input<String> sharedAccessPolicyKey,
        @Nullable Input<String> sharedAccessPolicyName,
        Input<String> type) {
        this.eventHubName = eventHubName;
        this.partitionKey = partitionKey;
        this.serviceBusNamespace = serviceBusNamespace;
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EventHubOutputDataSourceArgs() {
        this.eventHubName = Input.empty();
        this.partitionKey = Input.empty();
        this.serviceBusNamespace = Input.empty();
        this.sharedAccessPolicyKey = Input.empty();
        this.sharedAccessPolicyName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubOutputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> eventHubName;
        private @Nullable Input<String> partitionKey;
        private @Nullable Input<String> serviceBusNamespace;
        private @Nullable Input<String> sharedAccessPolicyKey;
        private @Nullable Input<String> sharedAccessPolicyName;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubOutputDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubName = defaults.eventHubName;
    	      this.partitionKey = defaults.partitionKey;
    	      this.serviceBusNamespace = defaults.serviceBusNamespace;
    	      this.sharedAccessPolicyKey = defaults.sharedAccessPolicyKey;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.type = defaults.type;
        }

        public Builder setEventHubName(@Nullable Input<String> eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }

        public Builder setEventHubName(@Nullable String eventHubName) {
            this.eventHubName = Input.ofNullable(eventHubName);
            return this;
        }

        public Builder setPartitionKey(@Nullable Input<String> partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }

        public Builder setPartitionKey(@Nullable String partitionKey) {
            this.partitionKey = Input.ofNullable(partitionKey);
            return this;
        }

        public Builder setServiceBusNamespace(@Nullable Input<String> serviceBusNamespace) {
            this.serviceBusNamespace = serviceBusNamespace;
            return this;
        }

        public Builder setServiceBusNamespace(@Nullable String serviceBusNamespace) {
            this.serviceBusNamespace = Input.ofNullable(serviceBusNamespace);
            return this;
        }

        public Builder setSharedAccessPolicyKey(@Nullable Input<String> sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        public Builder setSharedAccessPolicyKey(@Nullable String sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = Input.ofNullable(sharedAccessPolicyKey);
            return this;
        }

        public Builder setSharedAccessPolicyName(@Nullable Input<String> sharedAccessPolicyName) {
            this.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        public Builder setSharedAccessPolicyName(@Nullable String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = Input.ofNullable(sharedAccessPolicyName);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public EventHubOutputDataSourceArgs build() {
            return new EventHubOutputDataSourceArgs(eventHubName, partitionKey, serviceBusNamespace, sharedAccessPolicyKey, sharedAccessPolicyName, type);
        }
    }
}
