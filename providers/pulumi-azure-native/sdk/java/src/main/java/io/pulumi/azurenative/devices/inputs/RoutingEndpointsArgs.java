// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.azurenative.devices.inputs.RoutingEventHubPropertiesArgs;
import io.pulumi.azurenative.devices.inputs.RoutingServiceBusQueueEndpointPropertiesArgs;
import io.pulumi.azurenative.devices.inputs.RoutingServiceBusTopicEndpointPropertiesArgs;
import io.pulumi.azurenative.devices.inputs.RoutingStorageContainerPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties related to the custom endpoints to which your IoT hub routes messages based on the routing rules. A maximum of 10 custom endpoints are allowed across all endpoint types for paid hubs and only 1 custom endpoint is allowed across all endpoint types for free hubs.
 * 
 */
public final class RoutingEndpointsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoutingEndpointsArgs Empty = new RoutingEndpointsArgs();

    /**
     * The list of Event Hubs endpoints that IoT hub routes messages to, based on the routing rules. This list does not include the built-in Event Hubs endpoint.
     * 
     */
    @InputImport(name="eventHubs")
        private final @Nullable Input<List<RoutingEventHubPropertiesArgs>> eventHubs;

    public Input<List<RoutingEventHubPropertiesArgs>> getEventHubs() {
        return this.eventHubs == null ? Input.empty() : this.eventHubs;
    }

    /**
     * The list of Service Bus queue endpoints that IoT hub routes the messages to, based on the routing rules.
     * 
     */
    @InputImport(name="serviceBusQueues")
        private final @Nullable Input<List<RoutingServiceBusQueueEndpointPropertiesArgs>> serviceBusQueues;

    public Input<List<RoutingServiceBusQueueEndpointPropertiesArgs>> getServiceBusQueues() {
        return this.serviceBusQueues == null ? Input.empty() : this.serviceBusQueues;
    }

    /**
     * The list of Service Bus topic endpoints that the IoT hub routes the messages to, based on the routing rules.
     * 
     */
    @InputImport(name="serviceBusTopics")
        private final @Nullable Input<List<RoutingServiceBusTopicEndpointPropertiesArgs>> serviceBusTopics;

    public Input<List<RoutingServiceBusTopicEndpointPropertiesArgs>> getServiceBusTopics() {
        return this.serviceBusTopics == null ? Input.empty() : this.serviceBusTopics;
    }

    /**
     * The list of storage container endpoints that IoT hub routes messages to, based on the routing rules.
     * 
     */
    @InputImport(name="storageContainers")
        private final @Nullable Input<List<RoutingStorageContainerPropertiesArgs>> storageContainers;

    public Input<List<RoutingStorageContainerPropertiesArgs>> getStorageContainers() {
        return this.storageContainers == null ? Input.empty() : this.storageContainers;
    }

    public RoutingEndpointsArgs(
        @Nullable Input<List<RoutingEventHubPropertiesArgs>> eventHubs,
        @Nullable Input<List<RoutingServiceBusQueueEndpointPropertiesArgs>> serviceBusQueues,
        @Nullable Input<List<RoutingServiceBusTopicEndpointPropertiesArgs>> serviceBusTopics,
        @Nullable Input<List<RoutingStorageContainerPropertiesArgs>> storageContainers) {
        this.eventHubs = eventHubs;
        this.serviceBusQueues = serviceBusQueues;
        this.serviceBusTopics = serviceBusTopics;
        this.storageContainers = storageContainers;
    }

    private RoutingEndpointsArgs() {
        this.eventHubs = Input.empty();
        this.serviceBusQueues = Input.empty();
        this.serviceBusTopics = Input.empty();
        this.storageContainers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoutingEndpointsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<RoutingEventHubPropertiesArgs>> eventHubs;
        private @Nullable Input<List<RoutingServiceBusQueueEndpointPropertiesArgs>> serviceBusQueues;
        private @Nullable Input<List<RoutingServiceBusTopicEndpointPropertiesArgs>> serviceBusTopics;
        private @Nullable Input<List<RoutingStorageContainerPropertiesArgs>> storageContainers;

        public Builder() {
    	      // Empty
        }

        public Builder(RoutingEndpointsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubs = defaults.eventHubs;
    	      this.serviceBusQueues = defaults.serviceBusQueues;
    	      this.serviceBusTopics = defaults.serviceBusTopics;
    	      this.storageContainers = defaults.storageContainers;
        }

        public Builder setEventHubs(@Nullable Input<List<RoutingEventHubPropertiesArgs>> eventHubs) {
            this.eventHubs = eventHubs;
            return this;
        }

        public Builder setEventHubs(@Nullable List<RoutingEventHubPropertiesArgs> eventHubs) {
            this.eventHubs = Input.ofNullable(eventHubs);
            return this;
        }

        public Builder setServiceBusQueues(@Nullable Input<List<RoutingServiceBusQueueEndpointPropertiesArgs>> serviceBusQueues) {
            this.serviceBusQueues = serviceBusQueues;
            return this;
        }

        public Builder setServiceBusQueues(@Nullable List<RoutingServiceBusQueueEndpointPropertiesArgs> serviceBusQueues) {
            this.serviceBusQueues = Input.ofNullable(serviceBusQueues);
            return this;
        }

        public Builder setServiceBusTopics(@Nullable Input<List<RoutingServiceBusTopicEndpointPropertiesArgs>> serviceBusTopics) {
            this.serviceBusTopics = serviceBusTopics;
            return this;
        }

        public Builder setServiceBusTopics(@Nullable List<RoutingServiceBusTopicEndpointPropertiesArgs> serviceBusTopics) {
            this.serviceBusTopics = Input.ofNullable(serviceBusTopics);
            return this;
        }

        public Builder setStorageContainers(@Nullable Input<List<RoutingStorageContainerPropertiesArgs>> storageContainers) {
            this.storageContainers = storageContainers;
            return this;
        }

        public Builder setStorageContainers(@Nullable List<RoutingStorageContainerPropertiesArgs> storageContainers) {
            this.storageContainers = Input.ofNullable(storageContainers);
            return this;
        }
        public RoutingEndpointsArgs build() {
            return new RoutingEndpointsArgs(eventHubs, serviceBusQueues, serviceBusTopics, storageContainers);
        }
    }
}
