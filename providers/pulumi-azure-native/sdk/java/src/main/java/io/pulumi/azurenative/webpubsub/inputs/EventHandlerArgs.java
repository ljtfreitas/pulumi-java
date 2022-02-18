// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.inputs.UpstreamAuthSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of event handler.
 * 
 */
public final class EventHandlerArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHandlerArgs Empty = new EventHandlerArgs();

    /**
     * Upstream auth settings. If not set, no auth is used for upstream messages.
     * 
     */
    @InputImport(name="auth")
    private final @Nullable Input<UpstreamAuthSettingsArgs> auth;

    public Input<UpstreamAuthSettingsArgs> getAuth() {
        return this.auth == null ? Input.empty() : this.auth;
    }

    /**
     * Gets ot sets the list of system events.
     * 
     */
    @InputImport(name="systemEvents")
    private final @Nullable Input<List<String>> systemEvents;

    public Input<List<String>> getSystemEvents() {
        return this.systemEvents == null ? Input.empty() : this.systemEvents;
    }

    /**
     * Gets or sets the EventHandler URL template. You can use a predefined parameter {hub} and {event} inside the template, the value of the EventHandler URL is dynamically calculated when the client request comes in.
     * For example, UrlTemplate can be `http://example.com/api/{hub}/{event}`. The host part can't contains parameters.
     * 
     */
    @InputImport(name="urlTemplate", required=true)
    private final Input<String> urlTemplate;

    public Input<String> getUrlTemplate() {
        return this.urlTemplate;
    }

    /**
     * Gets or sets the matching pattern for event names.
     * There are 3 kind of patterns supported:
     *     1. "*", it to matches any event name
     *     2. Combine multiple events with ",", for example "event1,event2", it matches event "event1" and "event2"
     *     3. The single event name, for example, "event1", it matches "event1"
     * 
     */
    @InputImport(name="userEventPattern")
    private final @Nullable Input<String> userEventPattern;

    public Input<String> getUserEventPattern() {
        return this.userEventPattern == null ? Input.empty() : this.userEventPattern;
    }

    public EventHandlerArgs(
        @Nullable Input<UpstreamAuthSettingsArgs> auth,
        @Nullable Input<List<String>> systemEvents,
        Input<String> urlTemplate,
        @Nullable Input<String> userEventPattern) {
        this.auth = auth;
        this.systemEvents = systemEvents;
        this.urlTemplate = Objects.requireNonNull(urlTemplate, "expected parameter 'urlTemplate' to be non-null");
        this.userEventPattern = userEventPattern;
    }

    private EventHandlerArgs() {
        this.auth = Input.empty();
        this.systemEvents = Input.empty();
        this.urlTemplate = Input.empty();
        this.userEventPattern = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHandlerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<UpstreamAuthSettingsArgs> auth;
        private @Nullable Input<List<String>> systemEvents;
        private Input<String> urlTemplate;
        private @Nullable Input<String> userEventPattern;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHandlerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.systemEvents = defaults.systemEvents;
    	      this.urlTemplate = defaults.urlTemplate;
    	      this.userEventPattern = defaults.userEventPattern;
        }

        public Builder setAuth(@Nullable Input<UpstreamAuthSettingsArgs> auth) {
            this.auth = auth;
            return this;
        }

        public Builder setAuth(@Nullable UpstreamAuthSettingsArgs auth) {
            this.auth = Input.ofNullable(auth);
            return this;
        }

        public Builder setSystemEvents(@Nullable Input<List<String>> systemEvents) {
            this.systemEvents = systemEvents;
            return this;
        }

        public Builder setSystemEvents(@Nullable List<String> systemEvents) {
            this.systemEvents = Input.ofNullable(systemEvents);
            return this;
        }

        public Builder setUrlTemplate(Input<String> urlTemplate) {
            this.urlTemplate = Objects.requireNonNull(urlTemplate);
            return this;
        }

        public Builder setUrlTemplate(String urlTemplate) {
            this.urlTemplate = Input.of(Objects.requireNonNull(urlTemplate));
            return this;
        }

        public Builder setUserEventPattern(@Nullable Input<String> userEventPattern) {
            this.userEventPattern = userEventPattern;
            return this;
        }

        public Builder setUserEventPattern(@Nullable String userEventPattern) {
            this.userEventPattern = Input.ofNullable(userEventPattern);
            return this;
        }

        public EventHandlerArgs build() {
            return new EventHandlerArgs(auth, systemEvents, urlTemplate, userEventPattern);
        }
    }
}
