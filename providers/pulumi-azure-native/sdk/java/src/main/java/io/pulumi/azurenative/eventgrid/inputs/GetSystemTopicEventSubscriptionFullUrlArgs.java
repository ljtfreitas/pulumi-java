// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSystemTopicEventSubscriptionFullUrlArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSystemTopicEventSubscriptionFullUrlArgs Empty = new GetSystemTopicEventSubscriptionFullUrlArgs();

    /**
     * Name of the event subscription to be created. Event subscription names must be between 3 and 100 characters in length and use alphanumeric letters only.
     * 
     */
    @InputImport(name="eventSubscriptionName", required=true)
        private final String eventSubscriptionName;

    public String getEventSubscriptionName() {
        return this.eventSubscriptionName;
    }

    /**
     * The name of the resource group within the user's subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the system topic.
     * 
     */
    @InputImport(name="systemTopicName", required=true)
        private final String systemTopicName;

    public String getSystemTopicName() {
        return this.systemTopicName;
    }

    public GetSystemTopicEventSubscriptionFullUrlArgs(
        String eventSubscriptionName,
        String resourceGroupName,
        String systemTopicName) {
        this.eventSubscriptionName = Objects.requireNonNull(eventSubscriptionName, "expected parameter 'eventSubscriptionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.systemTopicName = Objects.requireNonNull(systemTopicName, "expected parameter 'systemTopicName' to be non-null");
    }

    private GetSystemTopicEventSubscriptionFullUrlArgs() {
        this.eventSubscriptionName = null;
        this.resourceGroupName = null;
        this.systemTopicName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemTopicEventSubscriptionFullUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventSubscriptionName;
        private String resourceGroupName;
        private String systemTopicName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSystemTopicEventSubscriptionFullUrlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventSubscriptionName = defaults.eventSubscriptionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.systemTopicName = defaults.systemTopicName;
        }

        public Builder setEventSubscriptionName(String eventSubscriptionName) {
            this.eventSubscriptionName = Objects.requireNonNull(eventSubscriptionName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSystemTopicName(String systemTopicName) {
            this.systemTopicName = Objects.requireNonNull(systemTopicName);
            return this;
        }
        public GetSystemTopicEventSubscriptionFullUrlArgs build() {
            return new GetSystemTopicEventSubscriptionFullUrlArgs(eventSubscriptionName, resourceGroupName, systemTopicName);
        }
    }
}
