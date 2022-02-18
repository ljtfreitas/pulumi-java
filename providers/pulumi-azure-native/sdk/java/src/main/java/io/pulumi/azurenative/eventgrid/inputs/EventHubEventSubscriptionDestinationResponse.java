// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information about the event hub destination for an event subscription.
 * 
 */
public final class EventHubEventSubscriptionDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final EventHubEventSubscriptionDestinationResponse Empty = new EventHubEventSubscriptionDestinationResponse();

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'EventHub'.
     * 
     */
    @InputImport(name="endpointType", required=true)
    private final String endpointType;

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * The Azure Resource Id that represents the endpoint of an Event Hub destination of an event subscription.
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public EventHubEventSubscriptionDestinationResponse(
        String endpointType,
        @Nullable String resourceId) {
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.resourceId = resourceId;
    }

    private EventHubEventSubscriptionDestinationResponse() {
        this.endpointType = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubEventSubscriptionDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointType;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubEventSubscriptionDestinationResponse defaults) {
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

        public EventHubEventSubscriptionDestinationResponse build() {
            return new EventHubEventSubscriptionDestinationResponse(endpointType, resourceId);
        }
    }
}
