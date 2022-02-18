// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.azurenative.webpubsub.outputs.UpstreamAuthSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EventHandlerTemplateResponse {
    /**
     * Gets or sets the auth settings for an event handler. If not set, no auth is used.
     * 
     */
    private final @Nullable UpstreamAuthSettingsResponse auth;
    /**
     * Gets ot sets the system event pattern.
     * There are 2 kind of patterns supported:
     *     1. The single event name, for example, "connect", it matches "connect"
     *     2. Combine multiple events with ",", for example "connect,disconnected", it matches event "connect" and "disconnected"
     * 
     */
    private final @Nullable String systemEventPattern;
    /**
     * Gets or sets the EventHandler URL template. You can use a predefined parameter {hub} and {event} inside the template, the value of the EventHandler URL is dynamically calculated when the client request comes in.
     * For example, UrlTemplate can be `http://example.com/api/{hub}/{event}`. The host part can't contains parameters.
     * 
     */
    private final String urlTemplate;
    /**
     * Gets or sets the matching pattern for event names.
     * There are 3 kind of patterns supported:
     *     1. "*", it to matches any event name
     *     2. Combine multiple events with ",", for example "event1,event2", it matches event "event1" and "event2"
     *     3. The single event name, for example, "event1", it matches "event1"
     * 
     */
    private final @Nullable String userEventPattern;

    @OutputCustomType.Constructor({"auth","systemEventPattern","urlTemplate","userEventPattern"})
    private EventHandlerTemplateResponse(
        @Nullable UpstreamAuthSettingsResponse auth,
        @Nullable String systemEventPattern,
        String urlTemplate,
        @Nullable String userEventPattern) {
        this.auth = auth;
        this.systemEventPattern = systemEventPattern;
        this.urlTemplate = Objects.requireNonNull(urlTemplate);
        this.userEventPattern = userEventPattern;
    }

    /**
     * Gets or sets the auth settings for an event handler. If not set, no auth is used.
     * 
     */
    public Optional<UpstreamAuthSettingsResponse> getAuth() {
        return Optional.ofNullable(this.auth);
    }
    /**
     * Gets ot sets the system event pattern.
     * There are 2 kind of patterns supported:
     *     1. The single event name, for example, "connect", it matches "connect"
     *     2. Combine multiple events with ",", for example "connect,disconnected", it matches event "connect" and "disconnected"
     * 
     */
    public Optional<String> getSystemEventPattern() {
        return Optional.ofNullable(this.systemEventPattern);
    }
    /**
     * Gets or sets the EventHandler URL template. You can use a predefined parameter {hub} and {event} inside the template, the value of the EventHandler URL is dynamically calculated when the client request comes in.
     * For example, UrlTemplate can be `http://example.com/api/{hub}/{event}`. The host part can't contains parameters.
     * 
     */
    public String getUrlTemplate() {
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
    public Optional<String> getUserEventPattern() {
        return Optional.ofNullable(this.userEventPattern);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHandlerTemplateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable UpstreamAuthSettingsResponse auth;
        private @Nullable String systemEventPattern;
        private String urlTemplate;
        private @Nullable String userEventPattern;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHandlerTemplateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.systemEventPattern = defaults.systemEventPattern;
    	      this.urlTemplate = defaults.urlTemplate;
    	      this.userEventPattern = defaults.userEventPattern;
        }

        public Builder setAuth(@Nullable UpstreamAuthSettingsResponse auth) {
            this.auth = auth;
            return this;
        }

        public Builder setSystemEventPattern(@Nullable String systemEventPattern) {
            this.systemEventPattern = systemEventPattern;
            return this;
        }

        public Builder setUrlTemplate(String urlTemplate) {
            this.urlTemplate = Objects.requireNonNull(urlTemplate);
            return this;
        }

        public Builder setUserEventPattern(@Nullable String userEventPattern) {
            this.userEventPattern = userEventPattern;
            return this;
        }

        public EventHandlerTemplateResponse build() {
            return new EventHandlerTemplateResponse(auth, systemEventPattern, urlTemplate, userEventPattern);
        }
    }
}
