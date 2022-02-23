// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetEventSubscriptionDeliveryAttributesArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEventSubscriptionDeliveryAttributesArgs Empty = new GetEventSubscriptionDeliveryAttributesArgs();

    /**
     * Name of the event subscription.
     * 
     */
    @InputImport(name="eventSubscriptionName", required=true)
        private final String eventSubscriptionName;

    public String getEventSubscriptionName() {
        return this.eventSubscriptionName;
    }

    /**
     * The scope of the event subscription. The scope can be a subscription, or a resource group, or a top level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use '/subscriptions/{subscriptionId}/' for a subscription, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}' for a resource, and '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}' for an EventGrid topic.
     * 
     */
    @InputImport(name="scope", required=true)
        private final String scope;

    public String getScope() {
        return this.scope;
    }

    public GetEventSubscriptionDeliveryAttributesArgs(
        String eventSubscriptionName,
        String scope) {
        this.eventSubscriptionName = Objects.requireNonNull(eventSubscriptionName, "expected parameter 'eventSubscriptionName' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetEventSubscriptionDeliveryAttributesArgs() {
        this.eventSubscriptionName = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventSubscriptionDeliveryAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventSubscriptionName;
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventSubscriptionDeliveryAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventSubscriptionName = defaults.eventSubscriptionName;
    	      this.scope = defaults.scope;
        }

        public Builder setEventSubscriptionName(String eventSubscriptionName) {
            this.eventSubscriptionName = Objects.requireNonNull(eventSubscriptionName);
            return this;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetEventSubscriptionDeliveryAttributesArgs build() {
            return new GetEventSubscriptionDeliveryAttributesArgs(eventSubscriptionName, scope);
        }
    }
}
