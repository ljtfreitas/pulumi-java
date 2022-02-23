// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.inputs.EventHandlerArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of a hub.
 * 
 */
public final class WebPubSubHubPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebPubSubHubPropertiesArgs Empty = new WebPubSubHubPropertiesArgs();

    /**
     * The settings for configuring if anonymous connections are allowed for this hub: "allow" or "deny". Default to "deny".
     * 
     */
    @InputImport(name="anonymousConnectPolicy")
        private final @Nullable Input<String> anonymousConnectPolicy;

    public Input<String> getAnonymousConnectPolicy() {
        return this.anonymousConnectPolicy == null ? Input.empty() : this.anonymousConnectPolicy;
    }

    /**
     * Event handler of a hub.
     * 
     */
    @InputImport(name="eventHandlers")
        private final @Nullable Input<List<EventHandlerArgs>> eventHandlers;

    public Input<List<EventHandlerArgs>> getEventHandlers() {
        return this.eventHandlers == null ? Input.empty() : this.eventHandlers;
    }

    public WebPubSubHubPropertiesArgs(
        @Nullable Input<String> anonymousConnectPolicy,
        @Nullable Input<List<EventHandlerArgs>> eventHandlers) {
        this.anonymousConnectPolicy = anonymousConnectPolicy == null ? Input.ofNullable("deny") : anonymousConnectPolicy;
        this.eventHandlers = eventHandlers;
    }

    private WebPubSubHubPropertiesArgs() {
        this.anonymousConnectPolicy = Input.empty();
        this.eventHandlers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebPubSubHubPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> anonymousConnectPolicy;
        private @Nullable Input<List<EventHandlerArgs>> eventHandlers;

        public Builder() {
    	      // Empty
        }

        public Builder(WebPubSubHubPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.anonymousConnectPolicy = defaults.anonymousConnectPolicy;
    	      this.eventHandlers = defaults.eventHandlers;
        }

        public Builder setAnonymousConnectPolicy(@Nullable Input<String> anonymousConnectPolicy) {
            this.anonymousConnectPolicy = anonymousConnectPolicy;
            return this;
        }

        public Builder setAnonymousConnectPolicy(@Nullable String anonymousConnectPolicy) {
            this.anonymousConnectPolicy = Input.ofNullable(anonymousConnectPolicy);
            return this;
        }

        public Builder setEventHandlers(@Nullable Input<List<EventHandlerArgs>> eventHandlers) {
            this.eventHandlers = eventHandlers;
            return this;
        }

        public Builder setEventHandlers(@Nullable List<EventHandlerArgs> eventHandlers) {
            this.eventHandlers = Input.ofNullable(eventHandlers);
            return this;
        }
        public WebPubSubHubPropertiesArgs build() {
            return new WebPubSubHubPropertiesArgs(anonymousConnectPolicy, eventHandlers);
        }
    }
}
