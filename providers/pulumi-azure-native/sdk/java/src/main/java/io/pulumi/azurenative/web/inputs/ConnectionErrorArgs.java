// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Connection error
 * 
 */
public final class ConnectionErrorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionErrorArgs Empty = new ConnectionErrorArgs();

    /**
     * Code of the status
     * 
     */
    @InputImport(name="code")
        private final @Nullable Input<String> code;

    public Input<String> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    /**
     * Resource ETag
     * 
     */
    @InputImport(name="etag")
        private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Description of the status
     * 
     */
    @InputImport(name="message")
        private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ConnectionErrorArgs(
        @Nullable Input<String> code,
        @Nullable Input<String> etag,
        @Nullable Input<String> location,
        @Nullable Input<String> message,
        @Nullable Input<Map<String,String>> tags) {
        this.code = code;
        this.etag = etag;
        this.location = location;
        this.message = message;
        this.tags = tags;
    }

    private ConnectionErrorArgs() {
        this.code = Input.empty();
        this.etag = Input.empty();
        this.location = Input.empty();
        this.message = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> code;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> location;
        private @Nullable Input<String> message;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionErrorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.message = defaults.message;
    	      this.tags = defaults.tags;
        }

        public Builder setCode(@Nullable Input<String> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable String code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMessage(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ConnectionErrorArgs build() {
            return new ConnectionErrorArgs(code, etag, location, message, tags);
        }
    }
}
