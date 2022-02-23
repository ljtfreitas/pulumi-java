// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the service bus topic destination for an event subscription.
 * 
 */
public final class ServiceBusTopicEventSubscriptionDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceBusTopicEventSubscriptionDestinationResponse Empty = new ServiceBusTopicEventSubscriptionDestinationResponse();

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'ServiceBusTopic'.
     * 
     */
    @InputImport(name="endpointType", required=true)
        private final String endpointType;

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * The Azure Resource Id that represents the endpoint of the Service Bus Topic destination of an event subscription.
     * 
     */
    @InputImport(name="resourceId")
        private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public ServiceBusTopicEventSubscriptionDestinationResponse(
        String endpointType,
        @Nullable String resourceId) {
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.resourceId = resourceId;
    }

    private ServiceBusTopicEventSubscriptionDestinationResponse() {
        this.endpointType = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusTopicEventSubscriptionDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointType;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusTopicEventSubscriptionDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public ServiceBusTopicEventSubscriptionDestinationResponse build() {
            return new ServiceBusTopicEventSubscriptionDestinationResponse(endpointType, resourceId);
        }
    }
}
