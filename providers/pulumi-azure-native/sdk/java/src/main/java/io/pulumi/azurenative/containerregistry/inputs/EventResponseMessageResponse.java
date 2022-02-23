// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The event response message received from the service URI.
 * 
 */
public final class EventResponseMessageResponse extends io.pulumi.resources.InvokeArgs {

    public static final EventResponseMessageResponse Empty = new EventResponseMessageResponse();

    /**
     * The content of the event response message.
     * 
     */
    @InputImport(name="content")
        private final @Nullable String content;

    public Optional<String> getContent() {
        return this.content == null ? Optional.empty() : Optional.ofNullable(this.content);
    }

    /**
     * The headers of the event response message.
     * 
     */
    @InputImport(name="headers")
        private final @Nullable Map<String,String> headers;

    public Map<String,String> getHeaders() {
        return this.headers == null ? Map.of() : this.headers;
    }

    /**
     * The reason phrase of the event response message.
     * 
     */
    @InputImport(name="reasonPhrase")
        private final @Nullable String reasonPhrase;

    public Optional<String> getReasonPhrase() {
        return this.reasonPhrase == null ? Optional.empty() : Optional.ofNullable(this.reasonPhrase);
    }

    /**
     * The status code of the event response message.
     * 
     */
    @InputImport(name="statusCode")
        private final @Nullable String statusCode;

    public Optional<String> getStatusCode() {
        return this.statusCode == null ? Optional.empty() : Optional.ofNullable(this.statusCode);
    }

    /**
     * The HTTP message version.
     * 
     */
    @InputImport(name="version")
        private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public EventResponseMessageResponse(
        @Nullable String content,
        @Nullable Map<String,String> headers,
        @Nullable String reasonPhrase,
        @Nullable String statusCode,
        @Nullable String version) {
        this.content = content;
        this.headers = headers;
        this.reasonPhrase = reasonPhrase;
        this.statusCode = statusCode;
        this.version = version;
    }

    private EventResponseMessageResponse() {
        this.content = null;
        this.headers = Map.of();
        this.reasonPhrase = null;
        this.statusCode = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventResponseMessageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String content;
        private @Nullable Map<String,String> headers;
        private @Nullable String reasonPhrase;
        private @Nullable String statusCode;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(EventResponseMessageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.headers = defaults.headers;
    	      this.reasonPhrase = defaults.reasonPhrase;
    	      this.statusCode = defaults.statusCode;
    	      this.version = defaults.version;
        }

        public Builder setContent(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder setHeaders(@Nullable Map<String,String> headers) {
            this.headers = headers;
            return this;
        }

        public Builder setReasonPhrase(@Nullable String reasonPhrase) {
            this.reasonPhrase = reasonPhrase;
            return this;
        }

        public Builder setStatusCode(@Nullable String statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public EventResponseMessageResponse build() {
            return new EventResponseMessageResponse(content, headers, reasonPhrase, statusCode, version);
        }
    }
}
