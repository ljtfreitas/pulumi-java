// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventChannelDestinationResponse {
    /**
     * Azure subscription ID of the customer creating the event channel. The partner topic
     * associated with the event channel will be created under this Azure subscription.
     * 
     */
    private final @Nullable String azureSubscriptionId;
    /**
     * Name of the partner topic associated with the event channel.
     * 
     */
    private final @Nullable String partnerTopicName;
    /**
     * Azure Resource Group of the customer creating the event channel. The partner topic
     * associated with the event channel will be created under this resource group.
     * 
     */
    private final @Nullable String resourceGroup;

    @CustomType.Constructor
    private EventChannelDestinationResponse(
        @CustomType.Parameter("azureSubscriptionId") @Nullable String azureSubscriptionId,
        @CustomType.Parameter("partnerTopicName") @Nullable String partnerTopicName,
        @CustomType.Parameter("resourceGroup") @Nullable String resourceGroup) {
        this.azureSubscriptionId = azureSubscriptionId;
        this.partnerTopicName = partnerTopicName;
        this.resourceGroup = resourceGroup;
    }

    /**
     * Azure subscription ID of the customer creating the event channel. The partner topic
     * associated with the event channel will be created under this Azure subscription.
     * 
    */
    public Optional<String> getAzureSubscriptionId() {
        return Optional.ofNullable(this.azureSubscriptionId);
    }
    /**
     * Name of the partner topic associated with the event channel.
     * 
    */
    public Optional<String> getPartnerTopicName() {
        return Optional.ofNullable(this.partnerTopicName);
    }
    /**
     * Azure Resource Group of the customer creating the event channel. The partner topic
     * associated with the event channel will be created under this resource group.
     * 
    */
    public Optional<String> getResourceGroup() {
        return Optional.ofNullable(this.resourceGroup);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventChannelDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String azureSubscriptionId;
        private @Nullable String partnerTopicName;
        private @Nullable String resourceGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(EventChannelDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureSubscriptionId = defaults.azureSubscriptionId;
    	      this.partnerTopicName = defaults.partnerTopicName;
    	      this.resourceGroup = defaults.resourceGroup;
        }

        public Builder azureSubscriptionId(@Nullable String azureSubscriptionId) {
            this.azureSubscriptionId = azureSubscriptionId;
            return this;
        }

        public Builder partnerTopicName(@Nullable String partnerTopicName) {
            this.partnerTopicName = partnerTopicName;
            return this;
        }

        public Builder resourceGroup(@Nullable String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public EventChannelDestinationResponse build() {
            return new EventChannelDestinationResponse(azureSubscriptionId, partnerTopicName, resourceGroup);
        }
    }
}
